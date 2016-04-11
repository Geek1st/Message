package com.geeklib.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

import com.geeklib.io.Output;
import com.geeklib.util.NetworkUtil;

public class Receive implements Runnable
{

	public void run()
	{
		DatagramSocket socket = null;
		try
		{
			socket = new DatagramSocket(7000, NetworkUtil.getIPAddress());
		}
		catch (SocketException e1)
		{
			e1.printStackTrace();
		}

		while (true)
		{
			byte[] messageBuffer = new byte[1000];

			DatagramPacket packet = new DatagramPacket(messageBuffer, messageBuffer.length);
			try
			{
				socket.receive(packet);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}

			String message = new String(messageBuffer, 0, packet.getLength());
			InetAddress address = packet.getAddress();
			String host = address.getHostAddress();
			
			Output.printMessage(message, host);
		}
	}
}
