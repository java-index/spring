package biz.ecology.spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Coder on 03.12.2015.
 */
public class HelloWorldSpringID {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classPath: app-context.xml");
        MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);
        mr.render();
    }
}
