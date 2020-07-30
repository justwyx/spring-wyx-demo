package com.wyx.beanlife;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author : Just wyx
 * @Description : TODO 2020/7/27
 * @Date : 2020/7/27
 */
public class MyBeanPostPrecessor implements BeanPostProcessor{
	public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
		System.out.println("postProcessBeforeInitialization: " + o + "--"+ s);
		return o;
	}

	public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
		System.out.println("postProcessAfterInitialization: " + o + "--"+ s);
		return o;
	}
}
