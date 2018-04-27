package br.unville.chat;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ReceiveMessage extends Thread{
	private Socket socket;

	public ReceiveMessage(Socket socket) {
		this.socket = socket;
	}
	
	public void run() {
		Scanner saida;
		try {
			saida = new Scanner(socket.getInputStream());
			
			while (saida.hasNextLine()) {
				System.out.println(saida.nextLine());
			}
			
			saida.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
