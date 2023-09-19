package com.wellsfargo.counselor;

import com.wellsfargo.counselor.data.AdvisorRepository;
import com.wellsfargo.counselor.entity.Advisor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@AutoConfiguration
public class Entrypoint implements CommandLineRunner {
    private static final Logger log = LoggerFactory.getLogger(Entrypoint.class);
    @Autowired
    AdvisorRepository repo;
    public static void main(String[] args) {
        SpringApplication.run(Entrypoint.class, args);
    }


    @Override
    public void run(String... args) throws Exception {

        repo.save(new Advisor("Mohamed", "Ahmed", "84242", "82949214214", "email@Gamil.com" ));


    }
}
