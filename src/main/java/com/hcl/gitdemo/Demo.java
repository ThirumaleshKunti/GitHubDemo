package com.hcl.gitdemo;

public class Demo {
	public static void getData(String data) {
		System.out.println("data : " + data);
		if (data.equals("Thirumalesh")) {
			System.out.println("Welcome to Github local repo...");
		} else if (data.equals("Thiru")) {
			System.out.println("Code moved from local repo to git repo...");
		}
	}

	public static void main(String[] args) {
		System.out.println("Hello wold...");
		getData("Thiru");
	}

}
