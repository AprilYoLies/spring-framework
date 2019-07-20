package top.aprilyolies.example.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class AspectJBean {
    @Pointcut("execution(* *.test(..))")	// 这个可能就是引介增强方法，这里可能就是切点
    public void test() {}

    @Before("test()")	// 这个可能就是切点增强方法
    public void beforeTest() {
        System.out.println("beforeTest");
    }

    @After("test()")
	public void afterTest() {
		System.out.println("afterTest");
	}

	@Around("test()")
	public Object aroundTest(ProceedingJoinPoint p) {
		Object o = null;
		System.out.println("aroundBefore");
		try {
			o = p.proceed();
		} catch (Throwable throwable) {
			throwable.printStackTrace();
		}
		System.out.println("aroundAfter");
		return o;
	}
}
