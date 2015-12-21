package biz.ecology.spring.spel;

import org.springframework.stereotype.Component;

@Component("injectsimleconfig")
public class InjectSimpleConfig {
    private int i = 15;
    private String message = "Hello SpEL";
    private Double d = 5.0;

    public InjectSimpleConfig(){
        System.out.println("inject config");
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Double getD() {
        return d;
    }

    public void setD(Double d) {
        this.d = d;
    }
}
