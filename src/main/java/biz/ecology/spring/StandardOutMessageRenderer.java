package biz.ecology.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("renderer")
public class StandardOutMessageRenderer implements MessageRenderer {

    private MessageProvider messageProvider;

    public void render() {
        if (messageProvider == null) {
            throw new RuntimeException(
                    "You must set the property message provider for class: "
                            + StandardOutMessageRenderer.class.getSimpleName());
        }
        System.out.println(messageProvider.getMessage());
    }

//    @Autowired
//    public void setMessageProvider(MessageProvider provider) {
//        this.messageProvider = provider;
//    }

    @Autowired
    public void setMessageProvider(MessageProvider configurable_provider) {
        this.messageProvider = configurable_provider;
    }
}
