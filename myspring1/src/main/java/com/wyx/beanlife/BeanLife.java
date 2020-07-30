package com.wyx.beanlife;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.print.attribute.standard.MediaSize;

/**
 * @author : Just wyx
 * @Description : TODO 2020/7/27
 * @Date : 2020/7/27
 */
public class BeanLife implements BeanNameAware,BeanFactoryAware,ApplicationContextAware {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("setName:" + name);
	}

	public void say() {
		System.out.println("hello world");
	}

	public BeanLife() {
		System.out.println("构造函数");
	}

	public void setBeanName(String s) {
		System.out.println("setBeanName");
	}

	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("setBeanFactory:" + beanFactory);
	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("setApplicationContext:" + applicationContext);
	}
}
