package biz.ecology.spring;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class MessageSupportFactory {

    private static MessageSupportFactory instance;

    static {
        instance = new MessageSupportFactory();
    }

    private Properties props;
    private MessageProvider provider;
    private MessageRenderer renderer;

    public MessageSupportFactory() {
        props = new Properties();
        File currentDir = new File(".");
        try {
            String sFilePath = "./src/main/resources/msf.properties";
            props.load(new FileInputStream(sFilePath));
            String rendererClass = props.getProperty("render.class");
            String providerClass = props.getProperty("provider.class");

            renderer = (MessageRenderer) Class.forName(rendererClass).newInstance();
            provider = (MessageProvider) Class.forName(providerClass).newInstance();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static MessageSupportFactory getInstance() {
        return instance;
    }

    public MessageProvider getProvider() {
        return provider;
    }

    public MessageRenderer getRenderer() {
        return renderer;
    }
}
