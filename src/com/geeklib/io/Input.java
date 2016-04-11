package com.geeklib.io;

import java.util.Scanner;

public class Input
{
	private static String message = "";
	
	public static String getMessage()
	{
		Scanner scanner = new Scanner(System.in);
		message = scanner.nextLine();
		return message;
	}
}
