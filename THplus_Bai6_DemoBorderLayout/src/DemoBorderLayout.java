import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;

public class DemoBorderLayout extends JFrame{
	private JButton	
		bn=new JButton("North"),
		bs=new JButton("South"),
		be=new JButton("East"),
		bw=new JButton("West"),
		bc=new JButton("Center");
	public DemoBorderLayout(){
		setTitle("BorderLayout");
		setSize(300,200);	
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);	
		setResizable(false);	
		add(BorderLayout.NORTH,bn);	
		add(BorderLayout.SOUTH,bs);	
		add(BorderLayout.EAST,be);	
		add(BorderLayout.WEST,bw);	
		add(BorderLayout.CENTER,bc);
		bn.setBackground(Color.red);
		bn.setForeground(Color.yellow);
		be.setBackground(Color.blue);
		be.setForeground(Color.red);
		bc.setBackground(Color.yellow);
		bc.setForeground(Color.black);
		bw.setBackground(Color.blue);
		bw.setForeground(Color.red);
		bs.setBackground(Color.red);
		bs.setForeground(Color.yellow);
		//etc.
	}
	public static void main(String[] args){
		new DemoBorderLayout().setVisible(true);
	}
}