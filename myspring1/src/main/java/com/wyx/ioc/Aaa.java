package com.wyx.ioc;

/**
 * @author : Just wyx
 * @Description : TODO 2020/7/27
 * @Date : 2020/7/27
 */
public class Aaa {
	private String name;

	private Bbb bbb;

	public Aaa() {
		System.out.println("初始化AAA");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Bbb getBbb() {
		return bbb;
	}

	public void setBbb(Bbb bbb) {
		this.bbb = bbb;
	}
}
