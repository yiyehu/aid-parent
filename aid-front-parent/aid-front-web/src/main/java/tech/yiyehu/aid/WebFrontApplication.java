package tech.yiyehu.aid;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ImportResource;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import tech.yiyehu.aid.common.annotation.EnableSwagger2DocketConfiguration;

/**
 * @author yiyehu
 * @version 创建时间：2018/8/8 9:25
 */
@SpringBootApplication
@EnableSwagger2DocketConfiguration
@DubboComponentScan("tech.yiyehu.aid.controller")
public class WebFrontApplication {

    public static void main(String[] args){
        SpringApplication.run(WebFrontApplication.class);
    }
}
