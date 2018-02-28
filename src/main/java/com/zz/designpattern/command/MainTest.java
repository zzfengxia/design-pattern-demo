package com.zz.designpattern.command;

import com.zz.designpattern.command.cmd.*;
import com.zz.designpattern.command.executor.Light;
import com.zz.designpattern.command.executor.TV;
import com.zz.designpattern.command.invoker.RemoteControl;

/**
 * @author Francis.zz
 * 描述:测试遥控的功能
 * create on 2015年12月12日
 * TODO 使用命令模式实现： 队列请求， 日志请求
 */
public class MainTest {
	public static void main(String[] args) {
		Light light = new Light("卧室");
		TV tv = new TV("客厅");
		
		RemoteControl control = new RemoteControl();
		control.setCommand(0, new LightOnCommand(light), new LightOffCommand(light));
		control.setCommand(1, new TVOnCommand(tv), new TVOffCommand(tv));
		control.setCommand(2, new TVAddVolumeCommand(tv), new TVCutVolumeCommand(tv));
		// TODO 可以实现命令集合，按下一个按钮可以进行多个操作
		
		System.out.println(control);
		
		control.onButton(0);
		control.onButton(1);
		control.undo();
		control.undo();
		control.undo();
		
		control.onButton(2);
		control.onButton(0);
		control.onButton(1);
		control.onButton(2);
		control.onButton(2);
		control.offButton(2);
		control.undoAll();
	}
}
