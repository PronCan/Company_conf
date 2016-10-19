import java.io.*;

public class Test {

	public static void main(String[] args) {

		InputStream in = null;
		OutputStream out = null;

		try {
			in = new FileInputStream("c:\\windows\\cmd.exe");
			out = new FileOutputStream("cpy.bin");

			int copyByte = 0;
			int bData;

			while (true) {
				bData = in.read();
				if (bData == -1)
					break;
				out.write(bData);
				copyByte++;
			}
			
			System.out.println("복사된 파일 크기 : " + copyByte/1024 + " KB");
		} catch (Exception e) {

		} finally {
			try {
				in.close();
			} catch (Exception e) {

			}
		}

	}
}
