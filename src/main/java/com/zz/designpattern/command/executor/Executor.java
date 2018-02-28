package com.zz.designpattern.command.executor;
/**
 * @author Francis.zz
 * 描述: 粗象的命令执行者类
 * create on 2015年12月12日
 */
public abstract class Executor {
	// 执行命令对象的位置
	protected String location;
	// 执行对象的描述
	protected String name;
	// 打开操作
	public abstract void on();
	// 关闭操作
	public abstract void off();
	
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
