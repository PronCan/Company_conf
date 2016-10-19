import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class FirstSwing {

	static class ButtonClick implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			if(e.getSource() instanceof JButton) {
				JButton tempButtonJB = (JButton) e.getSource();
				System.out.println(tempButtonJB.getText());
			}
		}
		
	}

	public static void main(String[] args) {
		JFrame frameJF = new JFrame("첫번째 스윙창");

		frameJF.setBounds(120, 120, 400, 400);
		frameJF.setLayout(new BorderLayout());

		TextField textfieldTF = new TextField();
		textfieldTF.setEditable(false);
		textfieldTF.setCaretPosition((int) TextField.RIGHT_ALIGNMENT);
		textfieldTF.setText("0");

		frameJF.add(textfieldTF, BorderLayout.NORTH);

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
		JButton buttonEqulJB = new JButton("=");
		JButton buttonPlusJB = new JButton("+");
		JButton buttonSubJB = new JButton("-");
		JButton buttonMulJB = new JButton("*");
		JButton buttonDivJB = new JButton("/");
		JButton buttonClearJB = new JButton("C");
		
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

		frameJF.add(pane, BorderLayout.CENTER);

		WindowListener listenerWL = new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(1);
			}
		};

		frameJF.setVisible(true);
	}

}
