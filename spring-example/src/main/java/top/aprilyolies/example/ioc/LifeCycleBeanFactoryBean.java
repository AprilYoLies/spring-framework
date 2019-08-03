package top.aprilyolies.example.ioc;

import org.springframework.beans.factory.FactoryBean;

/**
 * @Author EvaJohnson
 * @Date 2019-08-03
 * @Email g863821569@gmail.com
 */
public class LifeCycleBeanFactoryBean implements FactoryBean<LifeCycleBean> {
	@Override
	public LifeCycleBean getObject() throws Exception {
		LifeCycleBean lifeCycleBean = new LifeCycleBean();
		System.out.println(lifeCycleBean.hashCode());
		return lifeCycleBean;
	}

	@Override
	public Class<?> getObjectType() {
		return null;
	}
}
