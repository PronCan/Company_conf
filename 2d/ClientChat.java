import java.io.*;
import java.net.*;

public class ClientChat {
	
	public ClientChat() {
		try {
			Socket socket = new Socket("127.0.0.1", 5000);
			
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			dos.writeUTF("안녕하세요 저는 호창입니다.");
			
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			String serverMsg = dis.readUTF();
			
			System.out.println("서버로부터 온 메세지 : " + serverMsg);
			
			dos.close();
			dis.close();
			
			socket.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new ClientChat();
	}
}
