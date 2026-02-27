package com.teacher1;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableFeignClients
@EnableJpaAuditing(auditorAwareRef = "AuditAware")
@OpenAPIDefinition(info=@Info(title ="Teacher API", version="1.0"))
public class Teacher1Application {

    public static void main(String[] args) {
        SpringApplication.run(Teacher1Application.class, args);
    }

}
