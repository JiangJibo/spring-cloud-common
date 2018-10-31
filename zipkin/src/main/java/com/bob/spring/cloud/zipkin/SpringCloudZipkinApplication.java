package com.bob.spring.cloud.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin2.server.internal.EnableZipkinServer;
import zipkin2.server.internal.ZipkinQueryApiV2;

/**
 * {@link ZipkinQueryApiV2}
 *
 * @author wb-jjb318191
 * @create 2018-10-30 14:36
 */
@EnableEurekaClient
@EnableZipkinServer
@SpringBootApplication
public class SpringCloudZipkinApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudZipkinApplication.class, args);
    }

}
