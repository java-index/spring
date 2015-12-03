package biz.ecology.spring;

/**
 * Created by Coder on 03.12.2015.
 */
public class HelloWorldMessageProvider implements MessageProvider {

    public String getMessage() {
        return "Hello World";
    }
}
