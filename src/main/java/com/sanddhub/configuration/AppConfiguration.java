package com.sanddhub.configuration;

import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.*" })
@ServletComponentScan(basePackages = { "com.*" })
public class AppConfiguration {



}
