package com.wyx;

import com.wyx.beanlife.BeanLife;
import com.wyx.change.ChangeLetter;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * @author : Just wyx
 * @Description : TODO 2020/7/27
 * @Date : 2020/7/27
 */
public class BeanLifeTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/wyx/beanlife/beans.xml");
		BeanLife beanLife = (BeanLife) applicationContext.getBean("beanLife");
		beanLife.say();
	}
}
