import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;

public class ThreadTest extends Thread {
	static Canvas canvas;
	int y = 0;
	String str = null;
	int num = -1;
	int checkNum = -1;
	Random rand = new Random();
	
	static JLabel testJL;

	public ThreadTest(int y, String str, int num) {
		this.y = y;
		this.str = str;
		this.num = num;
	}

	public void run() {
		Graphics g = canvas.getGraphics();
		g.drawString(str, 20, y);
		for (int i = 0; i < 300; i++) {
			try {
				Thread.sleep(1000);
				i += rand.nextInt();
				if (i > 300) {
					i = 300;	// 2. 300넘으면 들어온 말의 변수 저장
					testJL.setText(Integer.toString(num));
					System.out.println(num);
				}
				g.fillRect(50, y, i, 20);
			} catch (Exception e) {

			}
		}
	}

	public static void main(String[] args) {
		Frame frm = new Frame("aaaa");
		JFrame rankJF = new JFrame();
		canvas = new Canvas();

		testJL = new JLabel("num");
		
		rankJF.add(testJL);
		
		frm.setSize(400, 400);
		frm.add(canvas);
		frm.setVisible(true);
		
		ThreadTest test1 = new ThreadTest(30, "1번말", 1);
		ThreadTest test2 = new ThreadTest(70, "2번말", 2);
		ThreadTest test3 = new ThreadTest(110, "3번말", 3);
		ThreadTest test4 = new ThreadTest(150, "4번말", 4);
		ThreadTest test5 = new ThreadTest(190, "5번말", 5);
		ThreadTest test6 = new ThreadTest(230, "6번말", 6);
		ThreadTest test7 = new ThreadTest(270, "7번말", 7);
		test1.start();
		test2.start();
		test3.start();
		test4.start();
		test5.start();
		test6.start();
		test7.start();

		frm.addWindowListener(new WindowAdapter() {
			public void windowClosing(ActionEvent e) {
				System.exit(0);
			}
		});
	}

}
