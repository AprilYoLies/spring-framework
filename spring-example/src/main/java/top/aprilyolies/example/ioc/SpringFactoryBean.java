package top.aprilyolies.example.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author EvaJohnson
 * @Date 2019-08-03
 * @Email g863821569@gmail.com
 */
public class SpringFactoryBean {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-ioc.xml");
		context.start();
		LifeCycleBean lifeCycleBean = (LifeCycleBean) context.getBean("lifeCycleBeanFactoryBean");
		System.out.println(lifeCycleBean.hashCode());
	}
}
