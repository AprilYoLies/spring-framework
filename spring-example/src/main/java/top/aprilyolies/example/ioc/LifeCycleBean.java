package top.aprilyolies.example.ioc;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @Author EvaJohnson
 * @Date 2019-08-02
 * @Email g863821569@gmail.com
 */
public class LifeCycleBean implements BeanNameAware, BeanFactoryAware, BeanPostProcessor, InitializingBean, DisposableBean {
	// BeanNameAware
	@Override
	public void setBeanName(String name) {
		System.out.println("setBeanName");
	}

	// BeanFactoryAware
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("setBeanFactory");
	}

	// BeanPostProcessor
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessBeforeInitialization");
		return null;
	}

	// BeanPostProcessor
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessAfterInitialization");
		return null;
	}

	// InitializingBean
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet");
	}

	// InitializingBean
	@Override
	public void destroy() throws Exception {
		System.out.println("destroy");
	}
}
