package biz.ecology.spring.ex1;

import biz.ecology.spring.MessageRenderer;
import biz.ecology.spring.MessageSupportFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class XmlConfigWithBeanFactory {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("spring/app-config.xml");

		Oracle oracle = (Oracle) factory.getBean("oracle");
		MessageRenderer mr = (MessageRenderer)factory.getBean("renderer", MessageRenderer.class);
		MessageRenderer mrConf = (MessageRenderer) factory.getBean("renderer-configurable", MessageRenderer.class);

		mr.render();
		mrConf.render();
		System.out.println(oracle.defineMeaningOfLife());
	}
}
