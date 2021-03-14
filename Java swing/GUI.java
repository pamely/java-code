import javax.swing.JFrame ; 
import javax.swing.*;
import java.awt.*;
import java.awt.Color ;
import java.awt.event.*;
public class GUI  extends JFrame  implements ActionListener {
	
	 
	JTextField zoneText;
	JPanel textSup;
	JPanel numEtSymboles;
	GridLayout numSymboles;
	JButton  [] tab = new JButton [10] ;
	String text ="";
	Calculator cal ;

	public GUI () {
		super("Calculator") ;

		cal = new Calculator();
		
		setLayout(new BorderLayout()) ;
		
	    // Panels 
		
		textSup = new JPanel() ;
		
		numEtSymboles = new JPanel() ; 
		
		numSymboles = new GridLayout(4,4);
		
		zoneText = new JTextField (25) ;
		
		textSup.add(zoneText) ;
		
		//Boutons 
		
        for( int i = 0 ; i < tab.length ; ++i ) {
        	tab[i] = new JButton(i+"") ;
        	numEtSymboles.add(tab[i]) ;
        	tab[i].addActionListener(this);
        	
        }
        
		JButton bouton11 = new JButton("C");  numEtSymboles.add(bouton11);   bouton11.addActionListener(this);
		
		JButton bouton12 = new JButton("+");  numEtSymboles.add(bouton12);  bouton12.addActionListener(this);
		
		JButton bouton13 = new JButton("-");  numEtSymboles.add(bouton13);   bouton13.addActionListener(this);
		
		JButton bouton14 = new JButton("!");  numEtSymboles.add(bouton14);    bouton14.addActionListener(this);
		
		JButton bouton15 = new JButton("/");  numEtSymboles.add(bouton15);   bouton15.addActionListener(this);
		
		JButton bouton16 = new JButton("*");  numEtSymboles.add(bouton16);   bouton16.addActionListener(this);
		
		JButton bouton17 = new JButton("POW");  numEtSymboles.add(bouton17);  bouton17.addActionListener(this);
		
		JButton bouton18 = new JButton("sqrt"); numEtSymboles.add(bouton18);  bouton18.addActionListener(this);
		
		JButton bouton19= new JButton("ln");  numEtSymboles.add(bouton19);   bouton19.addActionListener(this);
		
		JButton bouton20 = new JButton("=");  numEtSymboles.add(bouton20);  bouton20.addActionListener(this);
		
		//etiquette.setLayout (new FlowLayout ( ) ) ;
		
		add(textSup,BorderLayout.NORTH);
		
		add(numEtSymboles,BorderLayout.CENTER);
			
		setDefaultCloseOperation (EXIT_ON_CLOSE) ;
	}

	public void  actionPerformed (ActionEvent e) {

			if (e.getActionCommand().equals("C")){
				zoneText.setText("");
				text ="";
			} 

			if (e.getActionCommand().equals("=")){
				text = zoneText.getText();
				cal.setSecond(Double.parseDouble(text));
				cal.compute();
				text = Double.toString(cal.getFirst());
				zoneText.setText(text);
				cal.clear();	
				
			}
			// operation binaire
			if (e.getActionCommand().equals("+")){
				cal.setFirst(Double.parseDouble(text));
				zoneText.setText("");
				text="";
				cal.operation("+");
			}

			if (e.getActionCommand().equals("-")){
				cal.setFirst(Double.parseDouble(text));
				zoneText.setText("");
				text="";
				cal.operation("-");
			}

			if (e.getActionCommand().equals("*")){
				cal.setFirst(Double.parseDouble(text));
				zoneText.setText("");
				text="";
				cal.operation("*");
			}

			if (e.getActionCommand().equals("/")){
				cal.setFirst(Double.parseDouble(text));
				zoneText.setText("");
				text="";
				cal.operation("/");
			}

			if (e.getActionCommand().equals("!")){
				cal.setFirst(Double.parseDouble(text));
				zoneText.setText("");
				text="";
				cal.operation("!");
			}

			if (e.getActionCommand().equals("POW")){
				cal.setFirst(Double.parseDouble(text));
				zoneText.setText("");
				text="";
				cal.operation("POW");
			}

			if (e.getActionCommand().equals("sqrt")){
				cal.setFirst(Double.parseDouble(text));
				zoneText.setText("");
				text="";
				cal.operation("sqrt");
			}

			if (e.getActionCommand().equals("ln")){
				cal.setFirst(Double.parseDouble(text));
				zoneText.setText("");
				text="";
				cal.operation("ln");
			}

			if(e.getActionCommand().equals("1")){
				text += "1"; 
				zoneText.setText(text);
			}

			if(e.getActionCommand().equals("2")){
				text += "2";
				zoneText.setText(text);
			}

			if(e.getActionCommand().equals("3")){
				text += "3";
				zoneText.setText(text);
			}

			if(e.getActionCommand().equals("4")){
				text += "4";
				zoneText.setText(text);
			}

			if(e.getActionCommand().equals("5")){
				text += "5";
				zoneText.setText(text);
			}

			if(e.getActionCommand().equals("6")){
				text.concat("6");
				zoneText.setText(text);
			}

			if(e.getActionCommand().equals("7")){
				text += "7";
				zoneText.setText(text);
			}

			if(e.getActionCommand().equals("8")){
				text += "8";
				zoneText.setText(text);
			}

			if(e.getActionCommand().equals("9")){
				text += "9";
				zoneText.setText(text);
			}
	}
			
	public static void main (String [] args) {
		
		GUI fenetre = new GUI() ;
		
		
		fenetre.setSize(260, 260) ;
		
		fenetre.setVisible(true) ;	 
		
	}
	
	

}
