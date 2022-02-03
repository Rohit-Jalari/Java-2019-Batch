package com.gces.echoServer;

import java.net.*;
import java.io.*;

public class Server {

	public static void main(String[] args) throws Exception {

		ServerSocket ss = new ServerSocket(5550);

		Socket serverSocket = ss.accept();
		String clientMessage;
		
		do
		{
			DataInputStream in = new DataInputStream(serverSocket.getInputStream());
			clientMessage = (String) in.readUTF();
			System.out.println("Messsage from the Client : " + clientMessage);
		}while(!clientMessage.equals("exit"));
		
		ss.close();
	}
}
