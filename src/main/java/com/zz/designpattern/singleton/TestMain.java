package com.zz.designpattern.singleton;

public class TestMain {
	public static void main(String[] args) {
		
		Singleton.getInstance();
		/*
		try {
			Class<?> c =  Class.forName("com.zz.designpattern.singleton.Singleton");
			System.out.println(c.getName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
}
