package com.wyx.ioc;

/**
 * @author : Just wyx
 * @Description : TODO 2020/7/27
 * @Date : 2020/7/27
 */
public class Bbb {
	private String name;

	private Ccc ccc;

	public Bbb() {
		System.out.println("初始化bbb");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Ccc getCcc() {
		return ccc;
	}

	public void setCcc(Ccc ccc) {
		this.ccc = ccc;
	}
}
