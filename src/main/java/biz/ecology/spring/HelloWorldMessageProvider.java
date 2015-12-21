package biz.ecology.spring;

import org.springframework.stereotype.Service;

@Service("provider")
public class HelloWorldMessageProvider implements MessageProvider {

    public String getMessage() {
        return "Hello World";
    }
}
