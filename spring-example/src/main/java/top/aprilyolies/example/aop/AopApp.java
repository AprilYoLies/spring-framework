package top.aprilyolies.example.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-aop.xml");
		TestBean bean = (TestBean) context.getBean("test");
		bean.test();
	}
}
