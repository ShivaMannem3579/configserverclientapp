package com.example.siva;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by e056441 on 1/5/18.
 */
@RefreshScope
@RestController
class MessageRestController {

    @Value("${app.msg:Hello world - Config Server is not working..pelase check}")
    private String msg;

    @RequestMapping("/msg")
    String getMsg() {
        return this.msg;
    }
}
