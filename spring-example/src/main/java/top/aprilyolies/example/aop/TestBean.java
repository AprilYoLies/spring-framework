package top.aprilyolies.example.aop;

import org.springframework.aop.framework.AopContext;

public class TestBean {
	public TestBean() {
		System.out.println("TestBean constructor");
	}

	private String str;

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public void test() {
		System.out.println("test method....");
//		TestBean testBean = (TestBean) AopContext.currentProxy();
		System.out.println("----------");
//		testBean.test1();
		test1();
		System.out.println("----------");
	}

	public void test1() {
		System.out.println("test1 method....");
	}
}
