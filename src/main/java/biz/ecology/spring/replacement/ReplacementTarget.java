package biz.ecology.spring.replacement;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ReplacementTarget implements InitializingBean, DisposableBean, BeanNameAware{

    private String nameBean;

    public String formatMessage(String message){
        return "<h1>" + message + "</h1>";
    }

    public String formatMessage(Object message){
        return "<h1>" + message + "</h1>";
    }

    public void afterPropertiesSet() throws Exception {
        printMessage("after property set");
    }

    public void init(){
        printMessage("init property set");
    }

    @PostConstruct
    public void postConstruct(){
        printMessage("@PostContract");
    }

    public void destroy(){
        printMessage("Call destroy");
    }

    public void destroyXml(){
        printMessage("Call XML destroy");
    }

    public void setBeanName(String nameBean) {
        this.nameBean = nameBean;
    }

    @PreDestroy
    public void destroyAnnotation(){
        printMessage("Destroy @PreDestroy");
    }

    private void printMessage(String msg){
        System.out.println(msg + " " + nameBean);
    }
}


