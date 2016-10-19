import java.io.*;
import java.net.*;

public class ServerChat {

	public ServerChat() {
		try {
			ServerSocket sock = new ServerSocket(5000);
			System.out.println("������ �����մϴ�.");

			while (true) {
				Socket soc = sock.accept();
				System.out.println("Ŭ���̾�Ʈ�� ����Ǿ����ϴ�." + sock.getLocalSocketAddress());

				DataInputStream dis = new DataInputStream(soc.getInputStream());
				DataOutputStream dos = new DataOutputStream(soc.getOutputStream());

				String clientMsg = dis.readUTF();
				System.out.println("Ŭ���̾�Ʈ �޼��� : " + clientMsg);

				dos.writeUTF("�ݰ����ϴ�. KL-NET �����Դϴ�.");

				dis.close();
				dos.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new ServerChat();
	}
}
