package biz.ecology.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("configurable_provider")
public class ConfigurableMessageProvider implements MessageProvider {

    private String message;

    public ConfigurableMessageProvider(){}

    @Autowired
    public ConfigurableMessageProvider(String message){
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
}
