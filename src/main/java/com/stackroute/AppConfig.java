package com.stackroute;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.stackroute.domain")
@PropertySource("classpath:actor_info.properties")
public class AppConfig
{

}
