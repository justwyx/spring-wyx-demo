package com.wyx;

/**
 * @author : Just wyx
 * @Description : TODO 2020/7/26
 * @Date : 2020/7/26
 */
public class UserService {
	private String name;

	private BybService bybService;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BybService getBybService() {
		return bybService;
	}

	public void setBybService(BybService bybService) {
		this.bybService = bybService;
	}

	public void sayHello() {
		System.out.println("hello world: " + name);
		bybService.sayHello();
	}

}
