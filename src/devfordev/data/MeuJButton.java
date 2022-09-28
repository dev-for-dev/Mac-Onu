package devfordev.data;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class MeuJButton extends JButton{

	public MeuJButton(String nome,int x,int y, int width , int height){
		setText(nome);
		setBounds(x, y, width, height);
		setHorizontalTextPosition(SwingConstants.LEFT);
		setBackground(Color.WHITE);
		setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
	}
}
