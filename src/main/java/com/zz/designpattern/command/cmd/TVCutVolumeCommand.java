package com.zz.designpattern.command.cmd;

import com.zz.designpattern.command.executor.TV;

public class TVCutVolumeCommand implements Command {
	TV tv;
	public TVCutVolumeCommand(TV tv) {
		this.tv = tv;
	}
	public void execut() {
		tv.cutVolume();
	}

	public void undo() {
		tv.addVolume();
	}

}
