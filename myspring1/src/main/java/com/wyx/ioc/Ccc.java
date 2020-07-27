package com.wyx.ioc;

/**
 * @author : Just wyx
 * @Description : TODO 2020/7/27
 * @Date : 2020/7/27
 */
public class Ccc {
	private String name;

	private Aaa aaa;

	public Ccc() {
		System.out.println("初始化ccc");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Aaa getAaa() {
		return aaa;
	}

	public void setAaa(Aaa aaa) {
		this.aaa = aaa;
	}
}
