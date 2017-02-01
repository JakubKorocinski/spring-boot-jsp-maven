package com.sanddhub.configuration;

import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.sanddhu.services.*" })
@ServletComponentScan(basePackages = { "com.*" })
public class AppRootConfig {

}
