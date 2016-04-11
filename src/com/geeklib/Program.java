/**
 * @author Geek1st
 *
 */
package com.geeklib;

import com.geeklib.net.Receive;
import com.geeklib.net.Send;

public class Program
{
	public static void main(String[] args)
	{
		Thread thSend = new Thread(new Send());
		Thread thReceive = new Thread(new Receive());
		thSend.start();
		thReceive.start();
	}
}