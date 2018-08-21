package tech.yiyehu.aid;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author yiyehu
 * @version 创建时间：2018/8/8 9:25
 */
@SpringBootApplication
@DubboComponentScan("tech.yiyehu.aid.controller")
public class WebFrontApplication {

    public static void main(String[] args){
        SpringApplication.run(WebFrontApplication.class);
    }
}
