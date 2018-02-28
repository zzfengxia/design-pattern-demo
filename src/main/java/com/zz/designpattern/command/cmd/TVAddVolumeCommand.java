package com.zz.designpattern.command.cmd;

import com.zz.designpattern.command.executor.TV;

public class TVAddVolumeCommand implements Command {

	TV tv;
	public TVAddVolumeCommand(TV tv) {
		this.tv = tv;
	}
	public void execut() {
		tv.addVolume();
	}

	public void undo() {
		tv.cutVolume();
	}

}
