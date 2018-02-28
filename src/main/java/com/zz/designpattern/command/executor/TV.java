package com.zz.designpattern.command.executor;

public class TV extends Executor {
	// 电视的音量
	protected int volume;
	// 电视是否处于打开状态
	protected boolean status;
	public TV(){
	}
	public TV(String location){
		this.location = location;
		status = false;
	}
	public void on() {
		status = true;
		this.volume = 20;
		System.out.println(this.location + " 的电视被打开!");
	}

	public void off() {
		status = false;
		System.out.println(this.location + " 的电视被关闭！");
	}

	/**
	 * 判断电视状态，增加音量
	 */
	public void addVolume(){
		if(status) {
			setVolume(++volume);
			System.out.println("当前音量： " + getVolume());
		}
	}
	/**
	 * 判断电视状态，降低音量
	 */
	public void cutVolume(){
		if(status) {
			setVolume(--volume);
			System.out.println("当前音量： " + getVolume());
		}
	}
	
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
}
