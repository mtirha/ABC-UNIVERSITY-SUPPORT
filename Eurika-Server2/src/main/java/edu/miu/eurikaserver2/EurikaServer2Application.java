package edu.miu.eurikaserver2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurikaServer2Application {

    public static void main(String[] args) {
        SpringApplication.run(EurikaServer2Application.class, args);
    }

}
