package org.cnam.architecturecnam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@ComponentScan(basePackages = {"org.cnam.*"})
@EntityScan("org.cnam.architecturecnam.model")
@EnableJpaRepositories("org.cnam.architecturecnam.repository")
@EnableTransactionManagement
@EnableAutoConfiguration
public class architecturecnam {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(architecturecnam.class, args);
    }

}