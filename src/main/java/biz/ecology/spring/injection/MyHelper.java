package biz.ecology.spring.injection;

import java.util.Random;

/**
 * Created by Coder on 23.12.2015.
 */
public class MyHelper {

    public MyHelper(){
        Random rand = new Random();
        System.out.println("My Helper - " + rand.nextInt(100));
    }

    void doSomethingHelpful(){}
}
