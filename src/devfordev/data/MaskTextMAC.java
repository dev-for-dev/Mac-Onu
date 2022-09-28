package devfordev.data;

import java.text.ParseException;
import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;
import javax.swing.JTextField;

public class MaskTextMAC extends JTextField{

	private JTextField mac;
	
	public MaskTextMAC(int x,int y, int width , int height) {    
	    super();
	    setBounds(x, y, width, height);
	    
	    try {
	    	MaskFormatter maskMac = new MaskFormatter("AA:AA:AA:AA:AA:AA");
	    	JFormattedTextField mac = new JFormattedTextField(maskMac);
		} catch (ParseException e) {
			System.err.println("Error MAC!");
		}
	 
	}
	public JTextField getMac() {
		return mac;
	}
	public void setMac(JTextField mac) {
		this.mac = mac;
	}
}
