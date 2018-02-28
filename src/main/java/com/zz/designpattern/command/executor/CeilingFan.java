package com.zz.designpattern.command.executor;
/**
 * @author Francis.zz
 * 描述: 吊扇
 * create on 2015年12月12日
 */
public class CeilingFan extends Executor {
	// 风扇的转速
	private static class Speed{
		private static final int OFF = 0;
		private static final int LOW = 1;
		private static final int MEDIUM = 2;
		private static final int HIGH = 3;
	}
	protected int level;
	public CeilingFan() {
	}
	public CeilingFan(String location) {
		this.location = location;
		level = Speed.OFF;
	}
	public void on() {
	}

	public void off() {
		level = Speed.OFF;
		System.out.println(this.location + " 的吊扇已关闭！");
	}
	public void low() {
		level = Speed.LOW;
		System.out.println(this.location + " 的吊扇转速：" + level);
	}
	public void medium() {
		level = Speed.MEDIUM;
		System.out.println(this.location + " 的吊扇转速：" + level);
	}
	public void high() {
		level = Speed.HIGH;
		System.out.println(this.location + " 的吊扇转速：" + level);
	}
	public int getLevel() {
		return level;
	}
}
