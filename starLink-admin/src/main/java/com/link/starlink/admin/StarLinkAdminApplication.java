package com.link.starlink.admin;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class StarLinkAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(StarLinkAdminApplication.class, args);
        log.info("<<<<< 星联内部管理端启动成功");
    }

}
