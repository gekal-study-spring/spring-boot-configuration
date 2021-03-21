package cn.gekal.sample.confirmconfigurationpriority;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ConfirmConfigurationPriorityCommandLineRunner implements CommandLineRunner {

    /** ロガー */
    private static final Logger LOGGER = LoggerFactory.getLogger(ConfirmConfigurationPriorityCommandLineRunner.class);

    private final ConfirmConfigurationPriorityProperties properties;

    public ConfirmConfigurationPriorityCommandLineRunner(ConfirmConfigurationPriorityProperties properties) {
        this.properties = properties;
    }

    @Override
    public void run(String... args) {

        LOGGER.info("test.key = {}", this.properties.getKey());
    }
}
