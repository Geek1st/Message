package com.geeklib.util;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 网络工具类 封装了IP地址，网段，地址段等，并提供网络广播等功能
 * 
 * @author Geek1st
 *
 */
public class NetworkUtil
{
	private static InetAddress IPAddress = null;
	private static InetAddress segment = null;
	
	public static InetAddress getIPAddress()
	{
		return IPAddress;
	}

	public static InetAddress getSegment()
	{
		return segment;
	}
	
	static
	{
		try
		{
			IPAddress = InetAddress.getLocalHost();
		}
		catch (UnknownHostException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try
		{
			segment = InetAddress.getByName("255.255.255.255");
		}
		catch (UnknownHostException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
