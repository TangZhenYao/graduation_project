package com.example.xxx.controller;

import com.example.xxx.entity.Dissertation;
import com.example.xxx.service.DissertationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.*;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

/**
 * <p>Title: com.example.xxx.controller</p>
 * <p>Description: </p>
 *
 * @author 唐振耀
 * @date 2019/10/16
 */
@Controller
public class StudentUploadController {
    @Autowired
    private DissertationService dissertationService;
    private static final Logger LOGGER = LoggerFactory.getLogger(StudentUploadController.class);

    /*实现完成上传后返回主页*/
    @RequestMapping("goStudentHome")
    public String goStudentHome(){
        return "forward:/Home";
    }
    /**
     * 实现文件上传
     * */
    @RequestMapping("uploadStudentBystu_ID")
//    @ResponseBody
    public String fileUpload(@RequestParam("fileName") MultipartFile file, /*@RequestParam("stu_ID")*/ String stu_ID, Model model){
        if(file.isEmpty()){
            return "false";
        }
        String fileName = file.getOriginalFilename();
        int size = (int) file.getSize();
        System.out.println(fileName + "-->" + size);
        System.out.println("1学生ID为："+stu_ID+",的学生的论文为："+fileName);

        String path = "F:/论文" ;

        //获取论文储存地址：
        String d_address=path+fileName;
        System.out.println("论文地址："+d_address);

        //查看论文是否存在：根据stu_ID
        String d_name = fileName;
        System.out.println("2学生ID为："+stu_ID+"论文名为："+d_name);
        boolean dissertation = dissertationService.selectDissertation_D_namByStu_ID(stu_ID,d_name);
        if (dissertation==false) {
            model.addAttribute("prompt","已存在该论文，请重命名后在上传");
            return "Home";
        }else {
            System.out.println("可以执行");
        }

        File dest = new File(path + "/" + fileName);
        if(!dest.getParentFile().exists()){ //判断文件父目录是否存在
            dest.getParentFile().mkdir();
        }
        boolean AddAddressByStu_ID = dissertationService.addAddressByStu_ID(stu_ID,d_name,d_address);
        System.out.println("3学号："+stu_ID+",论文名："+d_name+",文件路径："+d_address);
        if (AddAddressByStu_ID==false) {
            System.out.println("未添加成功");
            model.addAttribute("prompt","上传失败");
            return "Home";
        }
        System.out.println("111111111111");
        try {
            file.transferTo(dest); //保存文件
            model.addAttribute("prompt","上传成功");
            return "Home";
        } catch (IllegalStateException e) {
            e.printStackTrace();
            model.addAttribute("prompt","上传失败");
            return "Home";
        } catch (IOException e) {
            e.printStackTrace();
            model.addAttribute("prompt","上传失败");
            return "Home";
        }
    }

    /*
    * 实现文件下载
    * */
    @RequestMapping("/download")
    public String downLoad(HttpServletResponse response) throws UnsupportedEncodingException {
        String filename="2.xlsx";
        String filePath = "F:/论文" ;
        File file = new File(filePath + "/" + filename);
        if(file.exists()){ //判断文件父目录是否存在
            response.setContentType("application/vnd.ms-excel;charset=UTF-8");
            response.setCharacterEncoding("UTF-8");
            // response.setContentType("application/force-download");
            response.setHeader("Content-Disposition", "attachment;fileName=" +   java.net.URLEncoder.encode(filename,"UTF-8"));
            byte[] buffer = new byte[1024];
            FileInputStream fis = null; //文件输入流
            BufferedInputStream bis = null;

            OutputStream os = null; //输出流
            try {
                os = response.getOutputStream();
                fis = new FileInputStream(file);
                bis = new BufferedInputStream(fis);
                int i = bis.read(buffer);
                while(i != -1){
                    os.write(buffer);
                    i = bis.read(buffer);
                }

            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("----------file download---" + filename);
            try {
                bis.close();
                fis.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return null;
    }
}
