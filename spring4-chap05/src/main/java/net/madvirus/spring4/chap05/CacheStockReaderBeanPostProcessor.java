package net.madvirus.spring4.chap05;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class CacheStockReaderBeanPostProcessor implements BeanPostProcessor, Ordered {

	private int order;
	
	public int getOrder() {
		return order;
	}
	
	public void setOrder(int order) {
		this.order = order;
	}
	
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if(StockReader.class.isAssignableFrom(bean.getClass())) {
			return new CacheStockReader((StockReader) bean);
		} else {
			return bean;
		}
	}

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		return bean;
	}

	

}
