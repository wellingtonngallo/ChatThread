package br.unville.chat;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class SendMessage extends Thread{
	private Socket client;
	
	public SendMessage(Socket client) {
		this.client = client;
	}
	
	public void run() {
		Scanner teclado = new Scanner(System.in);
		PrintStream saida;
		try {
			saida = new PrintStream(client.getOutputStream());
			
			while (teclado.hasNextLine()) {
				saida.println(teclado.nextLine());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
