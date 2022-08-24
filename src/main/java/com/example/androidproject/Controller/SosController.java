package com.example.androidproject.Controller;

import com.example.androidproject.Model.Sos;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SosController {
    @PostMapping(value="/sos/sign")
    @ResponseBody
    public String sign(@RequestBody Sos sos){
        System.out.println("Connection from Android");
        System.out.println("sign"+sos.getNow());
        return "1";
    }
}
