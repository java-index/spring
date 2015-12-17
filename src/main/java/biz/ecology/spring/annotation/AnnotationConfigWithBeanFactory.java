package biz.ecology.spring.annotation;

import biz.ecology.spring.MessageRenderer;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AnnotationConfigWithBeanFactory {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("spring/app-annotation-config");
		ctx.refresh();

		Oracle oracle = ctx.getBean("oracle", Oracle.class);
		System.out.println(oracle.defineMeaningOfLife());

		MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);
		mr.render();
	}
}
