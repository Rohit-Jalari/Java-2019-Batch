package com.gces.echoServer;

import java.net.*;
import java.io.*;


public class Client {

	public static void main(String[] args)throws Exception {
		
		Socket clientSocket = new Socket("127.0.0.1",5550);
		String clientMessage;
		
		do {
			DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			clientMessage = br.readLine();
			out.writeUTF(clientMessage);
			out.flush();
		} while(!clientMessage.equals("exit"));
		clientSocket.close();
	}

}
