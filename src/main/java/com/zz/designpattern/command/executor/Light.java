package com.zz.designpattern.command.executor;
/**
 * @author Francis.zz
 * 描述:可以扩展为不同的地方有不同的灯光类
 * create on 2015年12月12日
 */
public class Light extends Executor {

	public Light() {	
	}
	public Light(String location) {
		this.location = location;
	}
	public void on() {
		System.out.println(this.location + " 的灯被打开!");
	}

	public void off() {
		System.out.println(this.location + " 的灯被关闭！");
	}
}
