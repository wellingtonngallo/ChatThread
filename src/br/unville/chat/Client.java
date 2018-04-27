package br.unville.chat;

import java.io.IOException;
import java.io.PrintStream;
import java.net.*;
import java.util.Scanner;

public class Client {
	public static void main(String args[]) throws IOException {
		Socket client = new Socket("127.0.0.1", 12345);
		
		SendMessage send = new SendMessage(client);
		ReceiveMessage message = new ReceiveMessage(client);
		message.start();
		send.start();
	}
}
