package com.siukatech.poc.react.backend.user.config;

import com.siukatech.poc.react.backend.module.user.EnableUserSupport;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
////@Import({
////        GlobalConfigImport.class,
////        WebConfigImport.class
////        , SecurityConfigImport.class
////})
//@ComponentScan({
//        "com.siukatech.poc.react.backend.core.web.controller"
//})
//@EnableReactBackend
@EnableUserSupport
public class AppConfig {

}
