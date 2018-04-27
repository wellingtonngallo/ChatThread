package br.unville.chat;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Server {
	public static void main(String args[]) throws IOException {
		ServerSocket servidor = new ServerSocket(12345);
		Socket socket = servidor.accept();
		
		ReceiveMessage message = new ReceiveMessage(socket);
		SendMessage send = new SendMessage(socket);
		send.start();
		message.start();
	}
}
