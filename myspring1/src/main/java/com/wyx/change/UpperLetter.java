package com.wyx.change;

/**
 * @author : Just wyx
 * @Description : TODO 2020/7/27
 * @Date : 2020/7/27
 */
public class UpperLetter implements ChangeLetter{
	private String name;

	public UpperLetter() {
		System.out.println("初始化");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String changeLetter() {
		return name.toUpperCase();
	}
}
