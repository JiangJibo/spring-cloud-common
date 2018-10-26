package com.bob.spring.cloud.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.ZuulProxyAutoConfiguration;
import org.springframework.cloud.netflix.zuul.ZuulServerAutoConfiguration;

/**
 * SPI机制引入两个配置类: {@link ZuulServerAutoConfiguration}, {@link ZuulProxyAutoConfiguration}
 *
 * @author wb-jjb318191
 * @create 2018-10-26 14:04
 */
//@EnableZuulServer
@EnableZuulProxy
@SpringBootApplication
public class SpringCloudZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudZuulApplication.class, args);
    }

}
