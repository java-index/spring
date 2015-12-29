package biz.ecology.spring.replacement;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.util.StopWatch;

public class Launcher {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("spring/app-replace-config.xml");
        ctx.refresh();
        ctx.registerShutdownHook();
        ReplacementTarget replacementTarget = ctx.getBean("replacementTarget", ReplacementTarget.class);
        ReplacementTarget standardTarget = ctx.getBean("standardTarget", ReplacementTarget.class);
        String [] alias = ctx.getAliases("standardTarget");
        for(String s : alias){
            System.out.println("Alias: " + s);
        }
        displayInfo(replacementTarget);
        displayInfo(standardTarget);

    }

    private static void displayInfo(ReplacementTarget target) {
        System.out.println(target.formatMessage("Hello world!"));

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        for(int x=0; x < 100000; x++){
            String out = target.formatMessage("foo");
        }

        stopWatch.stop();
        System.out.println("Time: " + stopWatch.getTotalTimeMillis() + " ms;");
    }
}
