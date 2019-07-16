package com.swpu.SpringMvc;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/FileUpLoad")
public class FileUpLoad {
    /**
     * 传统文件上传
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping("/FileTest")
    public String fileUpLoadTest(HttpServletRequest request)throws Exception{
        System.out.println("文件上传");
        //使用upload组件完成文件上传
        // 设置上传的位置
        String path = request.getSession().getServletContext().getRealPath("/uploads/");
        //判断该路径是否存在
        File file = new File(path);
        if (!file.exists()){
            file.mkdir();//如果不存在则创建该文件夹
        }
        //解析request对象，获取上传文件项
        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);
        //解析request
        List<FileItem> items= upload.parseRequest(request);
       //判断item对象是否是上传文件项
        for (FileItem item:items){
            if (item.isFormField()){
                //普通表单项
            }else {
                //文件项
                //获取上传文件的名称
                String fileName = item.getName();
                //把文件名设置为唯一值
                String uuid = UUID.randomUUID().toString().replace("-","");
                //fileName = uuid+""+fileName;
                //完成文件上传
                item.write(new File(path,"wangfei.PNG"));
                //删除临时文件
                item.delete();
            }
        }
        return "success";
    }

    @RequestMapping("/SpringMvcFile")
    public String fileSpringMvc(HttpServletRequest request, MultipartFile upLoad)throws Exception{
        System.out.println("文件上传");
        //使用upload组件完成文件上传
        // 设置上传的位置
        String path = request.getSession().getServletContext().getRealPath("/uploads/");
        //判断该路径是否存在
        File file = new File(path);
        if (!file.exists()){
            file.mkdir();//如果不存在则创建该文件夹
            int a;
        }
        String fileName = upLoad.getOriginalFilename();
        String uuid = UUID.randomUUID().toString().replace("-","");
        fileName = uuid+""+fileName;
        upLoad.transferTo(new File(path,fileName));
        return "success";
    }

}
