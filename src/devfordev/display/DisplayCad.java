package devfordev.display;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.text.MaskFormatter;

import devfordev.data.MaskTextMAC;
import devfordev.data.MeuJButton;

@SuppressWarnings("serial")
public class DisplayCad  extends Resolution{
	private MyJLabel fundo;
	private MaskTextMAC txtLogin;
	private MeuJButton adicionar, copiar;
	private JTextPane macs;
	private String macText = "",macTemp;
	private JFormattedTextField mac;
	private Ouvinte o = new Ouvinte();
	public DisplayCad() {
//		this.adicionarLb();
		this.adicionarTf();
		this.adicionarBt();
		this.repaint();
	}
	public void adicionarBt() {
		// MeuJButton("NOME DO BOTAO",x, y, width, height,"ICONE USADO NO
		// BOTAO");
		adicionar = new MeuJButton("Adicionar", 265, 20, 100, 30);
		adicionar.addActionListener(o);
		this.add(adicionar);
		copiar = new MeuJButton("Copiar", 265, 330, 100, 30);
		copiar.addActionListener(o);
		this.add(copiar);
	}

	/**
	 * Metodo utilizado para adicionar JTextFields na tela.
	 */
	public void adicionarTf() {
		MaskFormatter maskMac;
		try {
			maskMac = new MaskFormatter("AA:AA:AA:AA:AA:AA");
			mac = new JFormattedTextField(maskMac);
			mac.setBounds(15, 20, 240, 30);
			add(mac);
			macs = new JTextPane();
			macs.setBounds(15, 60, 240, 300);
			macs.setEditable(false);
			add(macs);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	private class Ouvinte implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource() == adicionar) {
				macText = mac.getText().toUpperCase();
				if (macText.replace(" ","").length()<17) {
					JOptionPane.showMessageDialog(null, "Mac Incompleto!");
				}else {
					macText = mac.getText().toUpperCase();
					macTemp = macs.getText() + macText+"\n";
					macs.setText(macTemp);
					mac.setValue(null);
				}
				
			}
			if (e.getSource() == copiar) {
				macs.selectAll();
				macs.copy();
				macs.setText(null);
			}
		}
		
	}

}
