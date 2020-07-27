package com.wyx.change;

/**
 * @author : Just wyx
 * @Description : TODO 2020/7/27
 * @Date : 2020/7/27
 */
public class LowerLetter implements ChangeLetter{
	private String name;

	public LowerLetter() {
		System.out.println("初始化");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String changeLetter() {
		return name.toLowerCase();
	}
}
