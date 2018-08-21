package tech.yiyehu.framework.front.config;

import com.google.common.base.Predicates;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author yiyehu
 * @version 创建时间：2018/8/10 17:00
 */

@ConditionalOnBean(Swagger2Docket.class)
public class Swagger2DocketConfig {

    @Autowired
    Swagger2Docket swagger2Docket;

    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName(swagger2Docket.getGroupName())
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage(swagger2Docket.getResourcePackage()))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title(swagger2Docket.getTitle())
                .description(swagger2Docket.getDescription())
                .termsOfServiceUrl(swagger2Docket.getTermsOfServiceUrl())
                .license(swagger2Docket.getLicense())
                .licenseUrl(swagger2Docket.getLicenseUrl())
                .version(swagger2Docket.getVersion())
                .build();
    }

}
