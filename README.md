# Spring Boot Configurationの優先順位

## 検証対象

> 優先順位の降順

1. デフォルト値

    ```java
    @ConfigurationProperties(prefix = "test")
    public class ConfirmConfigurationPriorityProperties {

        private String key = "default value";

        <省略>
    }
    ```

2. アプリケーションコンフィグ(application.yaml)

    ```yaml
    test:
        key: config from application.yaml
    ```

3. アプリケーションコンフィグ(application-[profile].yaml)

    ```yaml
    test:
        key: config from application-default.yaml
    ```

4. 外部コンフィグ(Config Tree)

    ```bash
    mkdir -p /tmp/test
    echo "config from Config Tree" > /tmp/test/key
    java -jar build/libs/confirm-configuration-priority-0.0.1-SNAPSHOT.jar --spring.config.import=configtree:/tmp/
    ```

5. OSの環境変数

    ```bash
    # SET TEST_KEY=config from os environment
    export TEST_KEY="config from os environment"
    java -jar build/libs/confirm-configuration-priority-0.0.1-SNAPSHOT.jar
    ```

6. JVMの環境変数

    ```bash
    java -Dtest.key="config from jvm system environment" -jar build/libs/confirm-configuration-priority-0.0.1-SNAPSHOT.jar
    ```

7. 起動コマンド

    ```bash
    java -jar build/libs/confirm-configuration-priority-0.0.1-SNAPSHOT.jar --test.key="config from command line"
    ```
