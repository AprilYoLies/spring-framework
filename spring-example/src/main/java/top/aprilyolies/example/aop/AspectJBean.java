package top.aprilyolies.example.aop;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AspectJBean {
    @Pointcut("execution(* *.test(..))")
    public void test() {}

    @Before("test()")
    public void beforeTest() {
        System.out.println("beforeTest");
    }

//    @After("test()")
//    public void afterTest() {
//        System.out.println("afterTest");
//    }
//
//    @Around("test()")
//    public Object aroundTest(ProceedingJoinPoint p) {
//        Object o = null;
//        System.out.println("aroundBefore");
//        try {
//            o = p.proceed();
//        } catch (Throwable throwable) {
//            throwable.printStackTrace();
//        }
//        System.out.println("aroundAfter");
//        return o;
//    }
}
