package com.zz.designpattern.command.cmd;

import com.zz.designpattern.command.executor.TV;

public class TVOffCommand implements Command {

	TV tv;
	public TVOffCommand(TV tv) {
		this.tv = tv;
	}
	public void execut() {
		tv.off();
	}

	public void undo() {
		tv.on();
	}

}
