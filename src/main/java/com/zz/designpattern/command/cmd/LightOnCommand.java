package com.zz.designpattern.command.cmd;

import com.zz.designpattern.command.executor.Light;

public class LightOnCommand implements Command {
	// Executor exec;
	Light light;
	
	public LightOnCommand(Light light) {
		this.light = light;
	}
	public void execut() {
		light.on();
	}
	/**
	 * 撤销上一步操作
	 */
	public void undo() {
		light.off();
	}

	/*public Executor getExec() {
		return exec;
	}

	public void setExec(Executor exec) {
		this.exec = exec;
	}*/
}
