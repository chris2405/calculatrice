package calculatrice;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Calculatrice extends JFrame {
	
	private JLabel lab=new JLabel("ECRAN",SwingConstants.CENTER);
	private JPanel pan2 = new JPanel();
	private JPanel pan3 = new JPanel();
	
	
	private JButton c1 = new JButton ("1");
	private JButton c2 = new JButton ("2");
	private JButton c3 = new JButton ("3");
	private JButton c4 = new JButton ("4");
	private JButton c5 = new JButton ("5");
	private JButton c6 = new JButton ("6");
	private JButton c7 = new JButton ("7");
	private JButton c8 = new JButton ("8");
	private JButton c9 = new JButton ("9");
	private JButton c0 = new JButton ("0");
	private JButton cp = new JButton (".");
	private JButton cegal = new JButton ("=");
	
	private JButton c = new JButton ("c");
	private JButton plus = new JButton ("+");
	private JButton moin = new JButton ("-");
	private JButton m = new JButton ("*");
	private JButton slash = new JButton ("/");
	
	
	
	
	

public Calculatrice(){
	
	
	    this.setSize(480,520);
		this.setTitle("Calculatrice");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
		setBackground(Color.WHITE);
		
	
		this.setLayout(new BorderLayout());
		
		
	    this.getContentPane().add(lab, BorderLayout.NORTH);
	    
	    this.getContentPane().add(pan2,BorderLayout.CENTER);
	   
	    this.getContentPane().add(pan3, BorderLayout.EAST);
	   
	   
	    lab.setPreferredSize(new Dimension(480,50));
	    lab.setBackground(Color.LIGHT_GRAY);
	    lab.setOpaque(true);
	         
	    
		
		
		pan3.setPreferredSize(new Dimension(80,300));
		
		GridLayout gr=new GridLayout(4, 3);
		pan2.setLayout(gr);
          gr.setHgap(5);
          gr.setVgap(5);
		    pan2.add(c1);

		    pan2.add(c2);

		    pan2.add(c3);

		    pan2.add(c4);

		    pan2.add(c5);
		    
		    pan2.add(c6);
		    pan2.add(c7);
		    pan2.add(c8);
		    pan2.add(c9);
		    pan2.add(c0);
		    pan2.add(cp);
		    pan2.add(cegal);
		    

		    pan2.setVisible(true);
		    GridLayout gr2=new GridLayout(5, 1);
		    gr2.setHgap(5);
		    gr2.setVgap(5);
		    pan3.setLayout(gr2);
		    pan3.add(c);
		    pan3.add(plus);
		    pan3.add(moin);
		    pan3.add(m);
		    pan3.add(slash);
		    
		    
}
}
