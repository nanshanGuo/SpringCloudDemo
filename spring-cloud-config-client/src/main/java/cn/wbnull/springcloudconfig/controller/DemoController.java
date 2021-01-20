package cn.wbnull.springcloudconfig.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import cn.wbnull.springcloudconfig.Entity.TestClass;
import cn.wbnull.springcloudconfig.pojo.DemoEntiry;

@Controller
public class DemoController {


    @Autowired
    TestClass clsss;


    @GetMapping({"/", "/index"})
    public String index(){
        return "index";
    }

    @GetMapping("/list")
    public String list(Model model){
        DemoEntiry demo = new DemoEntiry();
        demo.setProfile(clsss.getProfile());
        demo.setVersion(clsss.getVersion());
        model.addAttribute("demo", demo);
        model.addAttribute("message", "list");
        return "list";
    }
}
