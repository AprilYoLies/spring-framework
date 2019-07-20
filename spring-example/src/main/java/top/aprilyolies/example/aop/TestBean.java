package top.aprilyolies.example.aop;

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
	}
}
