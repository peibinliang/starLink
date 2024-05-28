package com.link.starlink.admin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author liangpeibin
 * @ClassName CommonController
 * @Description 通用控制器
 * @since 2024/5/22 17:47
 */
@RestController
public class CommonController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/forward")
    public void forward(String url,HttpServletResponse response) throws IOException {
        String a = "dingtalk://dingtalkclient/page/link?url=";
        url = a + url;
        response.sendRedirect(url);
    }
}
