package biz.ecology.spring.injection;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.util.StopWatch;

/**
 * Created by Coder on 23.12.2015.
 */
public class Launcher {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new  GenericXmlApplicationContext();
        ctx.load("spring/app-lookup-config.xml");
        ctx.refresh();

        InjectionMain lookupObj = ctx.getBean("lookupBean", InjectionMain.class);
        StopWatch stopWatch = new StopWatch();

        stopWatch.start();

        MyHelper helper1 = lookupObj.getMyHelper();
        MyHelper helper2 = lookupObj.getMyHelper();
        System.out.println(helper1==helper2);

        stopWatch.stop();
        System.out.println(stopWatch.getTotalTimeMillis());
    }

}
