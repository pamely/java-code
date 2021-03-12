import java.awt. * ;
import java.awt.event. * ;
import javax.swing. * ;

public class DeuxFois extends JFrame implements ActionListener {

    private JButton button = new JButton ("Deux Fois");
    private JTextField input = new JTextField();

    public DeuxFois() {
        super("Deux Fois GUI"); 
        // layout 
        setLayout(new GridLayout(1, 2));
        add(input);
        add(button); 
        button.addActionListener(this);
        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        int n = Integer.parseInt(input.getText());
        input.setText(Integer.toString(2*n));
    }
}