package com.springboot.misslee.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

/**
 * 用于在swagger-ui.html上展示所有Api接口
 *
 * @author zhouxianli
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    private static ApiInfo apiInfo() {
        return new ApiInfoBuilder().title ("misslee").description ("misslee").version ("1.0").build ();
    }

    @Bean
    public Docket adminApi() {
        String basePackage = "com.springboot.misslee";// 要暴露的API接口的基础包名
        ParameterBuilder ticketPar = new ParameterBuilder();
        List<Parameter> pars = new ArrayList<Parameter>();
        //"token" 对应jwt 获取字段
        ticketPar.name("token").description("access_token")//name表示名称，description表示描述
                .modelRef(new ModelRef("string")).parameterType("header")
                .required(false).defaultValue("").build();//required表示是否必填，defaultvalue表示默认值
        pars.add(ticketPar.build());//添加完此处一定要把下边的带***的也加上否则不生效
        return new Docket(DocumentationType.SWAGGER_2).select ().apis (RequestHandlerSelectors.basePackage (basePackage))
                .paths (PathSelectors.any ()).build ().globalOperationParameters(pars).apiInfo (apiInfo ()).useDefaultResponseMessages (false);
    }
}
