package com.zz.designpattern.singleton;
/**
 * @author Francis.zz
 * 描述: 单例模式，创建唯一的对象。
 * create on 2015年12月3日
 */
public class Singleton {
	// 私有构造器
	private Singleton() {
		System.out.println("创建Singleton对象!");
	}
	
	// 静态内部类如果没有调用则不会执行里面的输出语句
	/*private static class CreateObj{
		{
			System.out.println("内部类输出！");
		}
		private static Singleton single = new Singleton();
	}*/
	
	// 实现单例模式的方式 1：懒汉式 线程不安全
	/*private static Singleton singleton;
	
	public static Singleton getInstance() {
		if(singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}*/
	
	// 实现单例模式的方式2：饿汉式 浪费资源
	/*private static Singleton singleton = new Singleton();
	
	public static Singleton getInstance() {
		return singleton;
	}*/
	
	// 实现单例模式的方式 3：双重检查加锁 只有第一次时会执行同步代码块，节省资源，线程安全
	/*private volatile static Singleton singleton;
	
	public static Singleton getInstance() {
		if(singleton == null) {
			synchronized(Singleton.class) {
				if(singleton == null) {
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}*/
	
	// 实现单例模式的方式 4：静态内部类
	/*private static class CreateSin {
		private static Singleton singleton = new Singleton();
	}
	
	public static Singleton getInstance() {
		return CreateSin.singleton;
	}*/
	// 实现单例模式的方式 5：使用synchronized的懒汉模式
	private static Singleton singleton;
	public static synchronized Singleton getInstance() {
		if(singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
	/*{
		System.out.println("代码块");
	}*/
}
