package cn.gekal.sample.confirmconfigurationpriority;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class ConfirmConfigurationPriorityApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfirmConfigurationPriorityApplication.class, args);
    }

}
