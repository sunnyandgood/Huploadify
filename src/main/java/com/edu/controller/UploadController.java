package com.edu.controller;

import com.edu.util.R;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.UUID;

@Controller
public class UploadController {

    @ResponseBody
    @PostMapping("/upload")
    public String upload(MultipartFile file, HttpServletRequest request) {
        //得到上传路径的硬盘路径
        String dir = request.getServletContext().getRealPath("/resources/upload");

        //得到文件扩展名
        String oldName = file.getOriginalFilename();
        String ext = oldName.substring(oldName.lastIndexOf("."));

        //新文件名
        String newName = UUID.randomUUID()+ext;

        System.out.println(newName);
        File file2 = new File(dir,newName);
        try {
            file.transferTo(file2);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "/resources/upload/"+newName;
    }

    @RequestMapping("/uptest1")
    @ResponseBody
    public R uptest(String[] img){
        System.out.println(Arrays.toString(img));
        return R.ok();
    }

    @RequestMapping("/uptest2")
    @ResponseBody
    public R uptest2(String img2){
        System.out.println(img2);
        return R.ok();
    }
}
