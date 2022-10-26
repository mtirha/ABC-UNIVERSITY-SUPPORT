package edu.miu.eurikaservice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurikaService1Application {

    public static void main(String[] args) {
        SpringApplication.run(EurikaService1Application.class, args);
    }

}
