package tech.yiyehu.aid;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import tech.yiyehu.aid.common.annotation.EnableSwagger2DocketConfiguration;

/**
 * @author yiyehu
 * @version 创建时间：2018/8/9 14:22
 */
@SpringBootApplication
@EnableSwagger2DocketConfiguration
@DubboComponentScan(basePackages = "tech.yiyehu.aid")
public class UserServiceApplication {

    /**
     * Logger
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceApplication.class);

    public static void main(String[] args){

        LOGGER.info("user-service starting");
        SpringApplication.run(UserServiceApplication.class);
        LOGGER.info("user-service started");
    }
}
