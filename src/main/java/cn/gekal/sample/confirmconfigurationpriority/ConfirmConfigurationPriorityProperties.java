package cn.gekal.sample.confirmconfigurationpriority;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "test")
public class ConfirmConfigurationPriorityProperties {

    private String key ;

    @Override
    public String toString() {
        return "ConfirmConfigurationPriorityProperties{" +
                "key='" + key + '\'' +
                '}';
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
