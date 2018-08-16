package tech.yiyehu.aid;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tech.yiyehu.framework.front.annotation.EnableResultReturnAspectConfiguration;
import tech.yiyehu.framework.front.annotation.EnableSwagger2DocketConfiguration;

/**
 * @author yiyehu
 * @version 创建时间：2018/8/8 9:25
 */
@SpringBootApplication
@EnableSwagger2DocketConfiguration
@EnableResultReturnAspectConfiguration
@DubboComponentScan("tech.yiyehu.aid.controller")
public class WebFrontApplication {

    public static void main(String[] args){
        SpringApplication.run(WebFrontApplication.class);
    }
}
