package biz.ecology.spring.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("samplespel")
public class SampleSpel {
    //@Value("#{injectsimleconfig.i}")
    @Value("1")
    private int i;

    //@Value("#{injectsimleconfig.message}")
    @Value("hello value")
    private String message;

    //@Value("#{injectsimleconfig.d}")
    @Value("50")
    private Double d;

    public SampleSpel(){}

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

    @Override
    public String toString() {
        return "i:" + i + "; d: " + d + "; message: " + message + ";";
    }

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("spring/app-spel-annotation-config.xml");
        ctx.refresh();

        SampleSpel sampleSpel = ctx.getBean("samplespel", SampleSpel.class);
        System.out.println(sampleSpel);
    }
}
