package com.bjsxt.fileUpload;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
public class FileUpload {

    @RequestMapping(value = "/uploadFile",method = RequestMethod.POST)
    public Map<String,Object> fileUpload(MultipartFile file)throws IOException {
        String fileName=file.getName();
        file.transferTo(new File("d:\\"+file.getOriginalFilename()));
        Map resultMap=new HashMap();
        resultMap.put("msg","ok");
        return  resultMap;
    }

}
