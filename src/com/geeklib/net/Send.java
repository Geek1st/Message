package com.geeklib.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

import com.geeklib.io.Input;
import com.geeklib.util.NetworkUtil;

public class Send implements Runnable
{
	public void run()
	{
		while (true)
		{
			byte[] message = Input.getMessage().getBytes();
			DatagramSocket socket = null;
			try
			{
				socket = new DatagramSocket();
			}
			catch (SocketException e)
			{
				e.printStackTrace();
			}

			DatagramPacket packet = new DatagramPacket(message, 0, message.length, NetworkUtil.getSegment(), 7000);
			try
			{
				socket.send(packet);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}
