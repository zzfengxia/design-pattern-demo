package com.zz.designpattern.command.cmd;

import com.zz.designpattern.command.executor.Light;

public class LightOffCommand implements Command {
	Light light;
	public LightOffCommand(Light light) {
		this.light = light;
	}
	public void execut() {
		light.off();
	}

	public void undo() {
		light.on();
	}

}
