package cn.wbnull.springcloudconfig.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.wbnull.springcloudconfig.Entity.TestClass;

/**
 * 入口类
 *
 * @author dukunbiao(null)  2019-05-07
 *         https://github.com/dkbnull/SpringCloudDemo
 */
@RestController
public class GatewayController {

    @Autowired
    TestClass clsss;
    
    @GetMapping(value = "/gateway")
    public String gateway() throws Exception {
        return "version:" + clsss.getVersion() + ",profile:" + clsss.getProfile();
    }
}
