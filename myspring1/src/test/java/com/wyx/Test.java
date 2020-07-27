package com.wyx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : Just wyx
 * @Description : TODO 2020/7/26
 * @Date : 2020/7/26
 */
public class Test {
//	spring实际是一个容器框架，可以配置各种bean，并且可以维护bean与bean之间的关系

	public static void main(String[] args) {
		// 使用传统的方法，来调用userService的 sayHello方法
//		new UserService().sayHello();

		// 现在使用spring来完成上面任务
//		1.得到spring的applicationContext对象（容器对象）
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService = (UserService) applicationContext.getBean("userService");
		userService.sayHello();

		BybService bybService = (BybService) applicationContext.getBean("bybService");
		bybService.sayHello();

	}
}
















