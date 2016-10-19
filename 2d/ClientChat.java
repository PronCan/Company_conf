import java.io.*;
import java.net.*;

public class ClientChat {
	
	public ClientChat() {
		try {
			Socket socket = new Socket("127.0.0.1", 5000);
			
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			dos.writeUTF("�ȳ��ϼ��� ���� ȣâ�Դϴ�.");
			
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			String serverMsg = dis.readUTF();
			
			System.out.println("�����κ��� �� �޼��� : " + serverMsg);
			
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
