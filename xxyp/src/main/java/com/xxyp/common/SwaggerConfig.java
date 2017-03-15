package com.xxyp.common;

import io.swagger.annotations.Api;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Parameter;
import springfox.documentation.service.ResponseMessage;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by jackeymm on 2017/3/12.
 */
@Configuration
@EnableSwagger2
@EnableWebMvc
public class SwaggerConfig {

    @Bean
    public Docket userAPI() {

        ApiInfo apiInfo = new ApiInfo(
                "接口文档",
                "秀秀乐派项目的接口文档，此文档包含所有接口说明。",
                "",
                "",
                new Contact("jackeymm", "", "jackeymm@sina.cn"),
                "",
                ""
        );

        Set<String> setProtocol = new HashSet<String>();
        setProtocol.add("http");

        Set<String> setProduce = new HashSet<String>();
        setProduce.add("application/json");

        List<ResponseMessage> listGetResponseMessage =
                new ArrayList<ResponseMessage>();
        listGetResponseMessage.add(
                new ResponseMessageBuilder()
                        .code(1001)
                        .message("User error 1001")
                        .build()
        );
        listGetResponseMessage.add(
                new ResponseMessageBuilder()
                        .code(2001)
                        .message("User error 2001")
                        .build()
        );

        List<ResponseMessage> listPostResponseMessage =
                new ArrayList<ResponseMessage>();
        listPostResponseMessage.add(
                new ResponseMessageBuilder()
                        .code(3001)
                        .message("User error 3001")
                        .build()
        );
        listPostResponseMessage.add(
                new ResponseMessageBuilder()
                        .code(4001)
                        .message("User error 4001")
                        .build()
        );


        List<Parameter> listParameter = new ArrayList<Parameter>();

        listParameter.add(
                new ParameterBuilder()
                        .name("X-XXYP-User-ID")
                        .description("User ID")
                        .parameterType("header")
                        .required(true)
                        .modelRef(new ModelRef("string"))
                        .build()
        );

        listParameter.add(
                new ParameterBuilder()
                        .name("X-XXYP-User-Token")
                        .description("User Token")
                        .parameterType("header")
                        .required(true)
                        .modelRef(new ModelRef("string"))
                        .build()
        );

        listParameter.add(
                new ParameterBuilder()
                        .name("X-XXYP-User-Agent")
                        .description("User Agent")
                        .parameterType("header")
                        .required(true)
                        .modelRef(new ModelRef("string"))
                        .build()
        );


        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
                .paths(PathSelectors.regex("/.*"))
                .build()
                .groupName("User")
                .apiInfo(apiInfo)
                .useDefaultResponseMessages(false)
                .globalResponseMessage(RequestMethod.GET, listGetResponseMessage)
                .globalResponseMessage(RequestMethod.POST, listPostResponseMessage)
                .globalOperationParameters(listParameter)
                .protocols(setProtocol)
                .produces(setProduce);
    }
}
