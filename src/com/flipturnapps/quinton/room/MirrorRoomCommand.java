package com.flipturnapps.quinton.room;

import com.flipturnapps.quinton.id.RoomId;
import com.flipturnapps.quinton.xmldata.World;

public class MirrorRoomCommand extends RoomCommand {

	@Override
	public int getRoomCommandId() {
	 return RoomId.ROOMCOMMAND_MIRRORROOM;
	}

	@Override
	public void performCommand(String command, World world) 
	{
		if(command.equalsIgnoreCase("touch mirror"))
			world.getPlayer().getLocation().changeX(-1);

	}

}