import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
/**
 * 계산기 레이아웃 클래스
 * 
 */

public class CalcLayout {
	
	public static final String SA_DIV = "/";
	public static final String SA_MUL = "*";
	public static final String SA_PLUS = "+";
	public static final String SA_SUB = "-";
	public static final String SA_EQ = "=";
	public static final String SA_CLS = "C";
	
	private double temp1;
	private double temp2;
	
	JFrame jframeJF;
	TextField jtextfieldJT;
	
	public CalcLayout() {
		
		jframeJF = new JFrame("첫번째 스윙창");
		jframeJF.setBounds(120, 120, 400, 400);
		jframeJF.setLayout(new BorderLayout());

		jtextfieldJT = new TextField();
		jtextfieldJT.setEditable(false);
		jtextfieldJT.setCaretPosition((int) TextField.RIGHT_ALIGNMENT);
		jtextfieldJT.setText("0");

		jframeJF.add(jtextfieldJT, BorderLayout.NORTH);

		Panel pane = new Panel();
		pane.setLayout(new GridLayout(4, 4, 10, 10));

		JButton button1JB = new JButton("1");
		JButton button2JB = new JButton("2");
		JButton button3JB = new JButton("3");
		JButton button4JB = new JButton("4");
		JButton button5JB = new JButton("5");
		JButton button6JB = new JButton("6");
		JButton button7JB = new JButton("7");
		JButton button8JB = new JButton("8");
		JButton button9JB = new JButton("9");
		JButton button10JB = new JButton("0");
		JButton buttonEqulJB = new JButton(SA_EQ);
		JButton buttonPlusJB = new JButton(SA_PLUS);
		JButton buttonSubJB = new JButton(SA_SUB);
		JButton buttonMulJB = new JButton(SA_MUL);
		JButton buttonDivJB = new JButton(SA_DIV);
		JButton buttonClearJB = new JButton(SA_CLS);
		
		ButtonClick buttonClick = new ButtonClick();
		
		pane.add(buttonPlusJB);
		buttonPlusJB.addActionListener(buttonClick);
		pane.add(buttonSubJB);
		buttonSubJB.addActionListener(buttonClick);
		pane.add(buttonMulJB);
		buttonMulJB.addActionListener(buttonClick);
		pane.add(buttonDivJB);
		buttonDivJB.addActionListener(buttonClick);
		pane.add(button1JB);
		button1JB.addActionListener(buttonClick);
		pane.add(button2JB);
		button2JB.addActionListener(buttonClick);
		pane.add(button3JB);
		button3JB.addActionListener(buttonClick);
		pane.add(button4JB);
		button4JB.addActionListener(buttonClick);
		pane.add(button5JB);
		button5JB.addActionListener(buttonClick);
		pane.add(button6JB);
		button6JB.addActionListener(buttonClick);
		pane.add(button7JB);
		button7JB.addActionListener(buttonClick);
		pane.add(button8JB);
		button8JB.addActionListener(buttonClick);
		pane.add(button9JB);
		button9JB.addActionListener(buttonClick);
		pane.add(button10JB);
		button10JB.addActionListener(buttonClick);
		pane.add(buttonEqulJB);
		buttonEqulJB.addActionListener(buttonClick);
		pane.add(buttonClearJB);
		buttonClearJB.addActionListener(buttonClick);

		jframeJF.add(pane, BorderLayout.CENTER);

		WindowListener listenerWL = new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(1);
			}
		};
		jframeJF.addWindowListener(listenerWL);
	}
	
	class ButtonClick implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() instanceof JButton) {
				JButton tempButtonJB = (JButton) e.getSource();
				System.out.println(tempButtonJB.getText());
			}
		}
	}
	
	/**
	 * 계산기 윈도우가 보일지 여부
	 * @param b true : visible false : divisible
	 */
	public void setVisible(boolean b) {
		if(!b) {
			int val = JOptionPane.showConfirmDialog(null, "종료하시겠습니까?", "종료", JOptionPane.CANCEL_OPTION | JOptionPane.OK_OPTION, JOptionPane.QUESTION_MESSAGE);
			if(val == JOptionPane.OK_OPTION) {
				jframeJF.setVisible(b);
			} else {
				jframeJF.setVisible(b);
			}
		}
	}
	
	public void setText(String text) {
		if(text != null && text.equals(SA_PLUS)) {
			
			temp1 = Double.valueOf(jtextfieldJT.getText());	 // ?
			jtextfieldJT.setText("");
		} else if(text != null && text.equals(SA_EQ)) {
			
		} else {
			jtextfieldJT.setText(jtextfieldJT.getText() + text);
		}
	}
}
