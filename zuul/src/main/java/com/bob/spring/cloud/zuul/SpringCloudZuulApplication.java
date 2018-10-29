package com.bob.spring.cloud.zuul;

import com.bob.spring.cloud.zuul.filter.WhiteListProperties;
import com.netflix.zuul.http.ZuulServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.ZuulProxyAutoConfiguration;
import org.springframework.cloud.netflix.zuul.ZuulServerAutoConfiguration;

/**
 * SPI机制引入两个配置类:
 * {@link ZuulServerAutoConfiguration}
 * {@link ZuulProxyAutoConfiguration}
 * {@link ZuulServlet}
 *
 * @author wb-jjb318191
 * @create 2018-10-26 14:04
 */
//@EnableZuulServer
@EnableZuulProxy
@SpringBootApplication
@EnableConfigurationProperties(WhiteListProperties.class)
public class SpringCloudZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudZuulApplication.class, args);
    }

}
