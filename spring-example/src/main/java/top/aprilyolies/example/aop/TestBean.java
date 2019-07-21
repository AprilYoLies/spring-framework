package top.aprilyolies.example.aop;

import org.springframework.aop.framework.AopContext;

public class TestBean {
	public TestBean() {
		System.out.println("TestBean constructor");
	}

	public void test() {
		System.out.println("test method....");
//		TestBean testBean = (TestBean) AopContext.currentProxy();
		System.out.println("----------");
		test1();
//		testBean.test1();
		System.out.println("----------");
	}

	public void test1() {
		System.out.println("test1 method....");
	}
}
