package org.rscdaemon.ls.packethandler;

import org.rscdaemon.ls.net.Packet;
import org.apache.mina.common.IoSession;

public interface PacketHandler {
	public void handlePacket(Packet p, IoSession session) throws Exception;
}
