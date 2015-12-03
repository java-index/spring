package biz.ecology.spring;

/**
 * Created by Coder on 03.12.2015.
 */
public class HelloWordDecoupled {
    public static void main(String[] args) {

        MessageRenderer mr = MessageSupportFactory.getInstance().getRenderer();
        MessageProvider mp = MessageSupportFactory.getInstance().getProvider();
        mr.setMessageProvider(mp);
        mr.render();
    }


}
