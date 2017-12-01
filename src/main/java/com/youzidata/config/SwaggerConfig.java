package com.youzidata.config;

import com.youzidata.util.IConst;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

/**
 * Created by lonel on 2017/1/19.
 */
@Configuration
@EnableSwagger2
@Profile(value = {"dev","dev-local", "dev-zw", "dev-qed", "test"})
public class SwaggerConfig {

    private String title = "cors-collect System API";

    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(new ApiInfoBuilder().title(title).description("API Document").build())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.youzidata.rest"))
                .paths(PathSelectors.any()).build();
    }

    @Bean
    public Docket adminApi() {
        ApiInfo apiInfo = new ApiInfo(title,//标题
                title + ", for users",//描述
                IConst.Api_Version,//版本
                "NO terms of service",
                new Contact("subdued", "", "subdued@sina.com"), //作者
                "The Apache License, Version 2.0",//链接显示文字
                "http://www.apache.org/licenses/LICENSE-2.0.html"//网站链接
        );
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("users").select()
                .paths(regex("/api/users.*"))
                .build().apiInfo(apiInfo)
                .useDefaultResponseMessages(false);
    }


}
