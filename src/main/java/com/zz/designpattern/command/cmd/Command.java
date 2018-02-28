package com.zz.designpattern.command.cmd;

public interface Command {
	// 执行命令
	public void execut();
	// 撤销命令
	public void undo();
}
