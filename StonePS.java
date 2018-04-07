import java.util.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code = "StonePS" width = 1200 height = 650>
</applet>
*/
public class StonePS extends Applet implements ActionListener{
	Button b1,b2,b3;
	String msg;
//	String msg1;
//	msg = "Let's Play";
	Random ran = new Random();
	int cpu = ran.nextInt(3);
	public void init(){
//		Font myFont = new Font("TimesRoman", Font.BOLD, 40);
		// set the component or graphics object like this:
		//someComponent.setFont(myFont);
		setBackground(Color.green);
		msg = "Let's Play";
//		msg1 = "Your Frinds Choice";
		System.out.println(cpu);
		b1 = new Button("Stone");
		b2 = new Button("Paper");
		b3 = new Button("Seaser");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		add(b1);
		add(b2);
		add(b3);
	}
	int usr;
	public void actionPerformed(ActionEvent ae){
		if(ae.getActionCommand().equals("Stone")){
			usr=0;
			cpu = ran.nextInt(3);
		}
		if(ae.getActionCommand().equals("Paper")){
			usr=1;
			cpu = ran.nextInt(3);
		}
		if(ae.getActionCommand().equals("Seaser")){
			usr=2;
			cpu = ran.nextInt(3);
		}
		if(usr==cpu){
			msg = "Cpu Chose The SamE AS U :DRAW";
			repaint();
		}
		else if(cpu==0 && usr==1){
			msg = "CpU CHoSe SToNe :U Won";
			repaint();
		}
		else if(cpu==0 && usr==2){
			msg = "CpU CHoSe StonE :U Lost";
			repaint();
		}
		else if(cpu == 1 && usr == 0){
			msg ="CpU ChoSe PaPer :U Lost ";
			repaint();
		}
		else if(cpu ==1 && usr == 2){
			msg ="CPU ChoSE Paper:U Won";
			repaint();
		}
		else if(cpu == 2 && usr == 0){
			msg="CPU ChoSE Seaser :U Won";
			repaint();
		}
		else if(cpu == 2 && usr == 1){
			msg = "CPU CHOSE Seaser :U Lost";
			repaint();
		}
			
	}
	public void paint(Graphics g){
		Font myFont = new Font("TimesRoman", Font.BOLD, 40);
// set the component or graphics object like this:
//someComponent.setFont(myFont);
		g.setFont(myFont);
		g.drawString(msg,300,150);
	}
}
