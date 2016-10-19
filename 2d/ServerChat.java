import java.io.*;
import java.net.*;

public class ServerChat {

	public ServerChat() {
		try {
			ServerSocket sock = new ServerSocket(5000);
			System.out.println("서버를 시작합니다.");

			while (true) {
				Socket soc = sock.accept();
				System.out.println("클라이언트와 연결되었습니다." + sock.getLocalSocketAddress());

				DataInputStream dis = new DataInputStream(soc.getInputStream());
				DataOutputStream dos = new DataOutputStream(soc.getOutputStream());

				String clientMsg = dis.readUTF();
				System.out.println("클라이언트 메세지 : " + clientMsg);

				dos.writeUTF("반갑습니다. KL-NET 서버입니다.");

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
