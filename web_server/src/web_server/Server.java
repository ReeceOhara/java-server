package web_server;

import java.net.*;
import java.io.*;
import java.util.*;

public class Server {
	
	public static void main(String[] args) throws Exception{
		//Creating a "place (terrible description)" that accepts connection on port 8080
		final ServerSocket server = new ServerSocket(8080);
		System.out.println("Listening for connection on port 8080...");
		
		//Runs forever until the server is "shutdown"
		while(true) {
			//Allow the server to accept a connection
			final Socket client = server.accept();
			
			//Creating readers that read the incoming connection requests
			InputStreamReader isr = new InputStreamReader(client.getInputStream());
			BufferedReader reader = new BufferedReader(isr);
			
			//Reading the incoming connection and printing it to the console
			String line = reader.readLine();
			while(!line.isEmpty()) {
				System.out.println(line);
				line = reader.readLine();
			}
		}
		
		//Add ability to serve HTML files
	}
}
