import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;



public class JavaCalculator implements ActionListener {
		
	JFrame Frame;	
	JLabel DisplayLabel;	
	JButton ButtonAddition, ButtonSubtraction, ButtonMultiplication, ButtonDivision, ButtonEquals, ButtonPoint, ButtonClear;
	JButton ButtonZero, ButtonOne, ButtonTwo, ButtonThree, ButtonFour, ButtonFive, ButtonSix, ButtonSeven, ButtonEight, ButtonNine;
	boolean IsOperatorClicked=false;
	String nOldValue
	public JavaCalculator() {
		Frame=new JFrame("JavaCalcualator by Sidharth");
		Frame.setLayout(null);
		Frame.setSize(610,680);
		Frame.setLocation(750,10);
		Frame.setVisible(true);	
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		DisplayLabel=new JLabel();
		DisplayLabel.setBounds(31, 22, 538, 30);
		DisplayLabel.setBackground(Color.gray);
		DisplayLabel.setOpaque(true);
		DisplayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		DisplayLabel.setForeground(Color.white);
		Frame.add(DisplayLabel);
		
		
		ButtonSeven=new JButton("7");
		ButtonSeven.setBounds(31,82, 112, 112);
		ButtonSeven.addActionListener(this);
		Frame.add(ButtonSeven);
		
		ButtonEight=new JButton("8");
		ButtonEight.setBounds(173,82, 112, 112);
		ButtonEight.addActionListener(this);
		Frame.add(ButtonEight);
		
		ButtonNine=new JButton("9");
		ButtonNine.setBounds(315,82, 112, 112);
		ButtonNine.addActionListener(this);
		Frame.add(ButtonNine);
		
		ButtonAddition=new JButton("+");
		ButtonAddition.setBounds(457,203, 112, 90);
		ButtonAddition.addActionListener(this);
		Frame.add(ButtonAddition);
		
		ButtonClear=new JButton("DEL");
		ButtonClear.setBounds(457,84, 112, 90);
		ButtonClear.addActionListener(this);
		Frame.add(ButtonClear);
		
		ButtonFour=new JButton("4");
		ButtonFour.setBounds(31,224, 112, 112);
		ButtonFour.addActionListener(this);
		Frame.add(ButtonFour);
		
		ButtonFive=new JButton("5");
		ButtonFive.setBounds(173,224, 112, 112);
		ButtonFive.addActionListener(this);
		Frame.add(ButtonFive);
		
		ButtonSix=new JButton("6");
		ButtonSix.setBounds(315,224, 112, 112);
		ButtonSix.addActionListener(this);
		Frame.add(ButtonSix);
		
		ButtonSubtraction=new JButton("-");
		ButtonSubtraction.setBounds(457,320, 112, 90);
		ButtonSubtraction.addActionListener(this);
		Frame.add(ButtonSubtraction);
		
		ButtonOne=new JButton("1");
		ButtonOne.setBounds(31,366, 112, 112);
		ButtonOne.addActionListener(this);
		Frame.add(ButtonOne);
		
		ButtonTwo=new JButton("2");
		ButtonTwo.setBounds(173,366, 112, 112);
		ButtonTwo.addActionListener(this);
		Frame.add(ButtonTwo);
		
		ButtonThree=new JButton("3");
		ButtonThree.setBounds(315,366, 112, 112);
		ButtonThree.addActionListener(this);
		Frame.add(ButtonThree);
		
		ButtonEquals=new JButton("=");
		ButtonEquals.setBounds(457,550, 112, 70);
		ButtonEquals.addActionListener(this);
		Frame.add(ButtonEquals);
		
		ButtonZero=new JButton("0");
		ButtonZero.setBounds(31,508, 112, 112);
		ButtonZero.addActionListener(this);
		Frame.add(ButtonZero);
		
		ButtonMultiplication=new JButton("X");
		ButtonMultiplication.setBounds(173,508, 112, 112);
		ButtonMultiplication.addActionListener(this);
		Frame.add(ButtonMultiplication);
		
		ButtonDivision=new JButton("÷");
		ButtonDivision.setBounds(315,508, 112, 112);
		ButtonDivision.addActionListener(this);
		Frame.add(ButtonDivision);
		
		
		ButtonPoint=new JButton(".");
		ButtonPoint.setBounds(457,435, 112, 90);
		ButtonPoint.addActionListener(this);
		Frame.add(ButtonPoint);
		
		
		
	}
	
	public static void main(String args[]) {
		
		new JavaCalculator();
		
	}

	public void actionPerformed(ActionEvent ScreenAction) {
		
	if(ScreenAction.getSource()==ButtonSeven) {
		if(IsOperatorClicked==true) {
			DisplayLabel.setText("7");
			IsOperatorClicked=false;
		}
		else {
			DisplayLabel.setText(DisplayLabel.getText()+"7");
		}
	}
	else if(ScreenAction.getSource()==ButtonEight) {
		if(IsOperatorClicked==true) {
			DisplayLabel.setText("8");
			IsOperatorClicked=false;
		}
		else {
		DisplayLabel.setText(DisplayLabel.getText()+"8");
		}
	}
	else if(ScreenAction.getSource()==ButtonNine) {
		if(IsOperatorClicked==true) {
			DisplayLabel.setText("9");
			IsOperatorClicked=false;
		}
		else {
		DisplayLabel.setText(DisplayLabel.getText()+"9");
		}
	}	
	else if(ScreenAction.getSource()==ButtonFour) {
		if(IsOperatorClicked==true) {
			DisplayLabel.setText("4");
			IsOperatorClicked=false;
		}
		else {
		DisplayLabel.setText(DisplayLabel.getText()+"4");
		}
	}
	else if(ScreenAction.getSource()==ButtonFive) {
		if(IsOperatorClicked==true) {
			DisplayLabel.setText("5");
			IsOperatorClicked=false;
		}
		else {
		DisplayLabel.setText(DisplayLabel.getText()+"5");
		}
	}
	else if(ScreenAction.getSource()==ButtonSix) {
		if(IsOperatorClicked==true) {
			DisplayLabel.setText("6");
			IsOperatorClicked=false;
		}
		else {
		DisplayLabel.setText(DisplayLabel.getText()+"6");
		}
	}
	else if(ScreenAction.getSource()==ButtonOne) {
		if(IsOperatorClicked==true) {
			DisplayLabel.setText("1");
			IsOperatorClicked=false;
		}
		else {
		DisplayLabel.setText(DisplayLabel.getText()+"1");
		}
	}
	else if(ScreenAction.getSource()==ButtonTwo) {
		if(IsOperatorClicked==true) {
			DisplayLabel.setText("2");
			IsOperatorClicked=false;
		}
		else {
		DisplayLabel.setText(DisplayLabel.getText()+"2");
		}
	}
	else if(ScreenAction.getSource()==ButtonThree) {
		if(IsOperatorClicked==true) {
			DisplayLabel.setText("3");
			IsOperatorClicked=false;
		}
		else {
		DisplayLabel.setText(DisplayLabel.getText()+"3");
		}
	}
	else if(ScreenAction.getSource()==ButtonZero) {
		if(IsOperatorClicked==true) {
			DisplayLabel.setText("0");
			IsOperatorClicked=false;
		}
		else {
		DisplayLabel.setText(DisplayLabel.getText()+"0");
		}
	}
	else if(ScreenAction.getSource()==ButtonPoint) {
		DisplayLabel.setText(DisplayLabel.getText()+".");
	}
	else if(ScreenAction.getSource()==ButtonAddition) {
		IsOperatorClicked=true;
		
	}
	else if(ScreenAction.getSource()==ButtonSubtraction) {
		IsOperatorClicked=true;
		
		
	}
	else if(ScreenAction.getSource()==ButtonMultiplication) {
		IsOperatorClicked=true;
		
	}
	else if(ScreenAction.getSource()==ButtonDivision) {
		IsOperatorClicked=true;
		
	}
	else if(ScreenAction.getSource()==ButtonEquals) {
		
		
	}
	else {
		DisplayLabel.setText("");
	}
	
		
		
	}

}
