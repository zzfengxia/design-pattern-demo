package com.zz.designpattern.command.cmd;

import com.zz.designpattern.command.executor.TV;

public class TVOnCommand implements Command {
	TV tv;
	public TVOnCommand(TV tv) {
		this.tv = tv;
	}
	@Override
	public void execut() {
		tv.on();
	}

	@Override
	public void undo() {
		tv.off();
	}

}
