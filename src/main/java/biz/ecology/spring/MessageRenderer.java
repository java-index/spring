package biz.ecology.spring;

/**
 * Created by Coder on 03.12.2015.
 */
public interface MessageRenderer {
    void render();

    void setMessageProvider(MessageProvider provider);
}
