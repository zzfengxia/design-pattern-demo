package com.zz.designpattern.command.invoker;

import com.zz.designpattern.command.cmd.Command;
import com.zz.designpattern.command.cmd.NoCommand;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Francis.zz
 * 描述: 命令模式，模拟遥控器
 * create on 2015年12月12日
 */

public class RemoteControl{
	Command[] onCommand;
	Command[] offCommand;
	List<Command> command;
	// 将按键初始化为空命令
	public RemoteControl() {
		onCommand = new Command[7];
		offCommand = new Command[7];
		command = new ArrayList<Command>();
		
		for(int i = 0; i < onCommand.length; i++){
			onCommand[i] = new NoCommand();
			offCommand[i] = new NoCommand();
		}
	}
	/**
	 * 装载命令
	 * @param loc 按键位置
	 * @param on 
	 * @param off
	 */
	public void setCommand(int loc, Command on, Command off) {
		onCommand[loc] = on;
		offCommand[loc] = off;
	}
	/**
	 * 开(增加)按键
	 * @param loc
	 */
	public void onButton(int loc) {
		// 记录按键
		command.add(onCommand[loc]);
		onCommand[loc].execut();
	}
	/**
	 * 关闭(减小)按键
	 * @param loc
	 */
	public void offButton(int loc) {
		//记录按键
		command.add(offCommand[loc]);
		offCommand[loc].execut();
	}
	/** 
	 * 撤销上一步按键
	 */
	public void undo() {
		if(command.size() > 0) {
			command.remove(command.size()-1).undo();
		}
	}
	/**
	 *  撤销所有动作
	 */
	public void undoAll() {
		for(int i = command.size() -1; i >= 0;) {
			command.remove(i).undo();
			i = command.size() -1;
		}
	}
	/**
	 *  重写toString, 输出遥控器加载的命令
	 */
	public String toString(){
		StringBuffer bf = new StringBuffer();
		for(int i = 0; i < onCommand.length; i++) {
			bf.append("位置" + i + ": " + onCommand[i].getClass().getSimpleName() + "      " +
					offCommand[i].getClass().getSimpleName() + "\n");
		}
		return bf.toString();
	}
}