package com.wyx;

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
public class ChangeTest {
	public static void main(String[] args) {
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/wyx/change/beans.xml");
//		ChangeLetter changeLetter = (ChangeLetter) applicationContext.getBean("changeLetter");
//		changeLetter.changeLetter();

		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/wyx/change/beans.xml"));
		ChangeLetter changeLetter = (ChangeLetter) beanFactory.getBean("changeLetter");
		System.out.println(changeLetter.changeLetter());
	}
}
