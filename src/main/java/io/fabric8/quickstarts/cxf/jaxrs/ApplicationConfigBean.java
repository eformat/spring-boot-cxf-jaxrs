package io.fabric8.quickstarts.cxf.jaxrs;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "helloservice")
public class ApplicationConfigBean {

    private String message;

    public ApplicationConfigBean() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}