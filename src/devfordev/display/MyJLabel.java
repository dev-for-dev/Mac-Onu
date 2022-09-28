package devfordev.display;

import java.awt.Color;

import javax.swing.JLabel;

public class MyJLabel extends JLabel{
	private Images i = new Images();

	public MyJLabel(String name,int x,int y, int width , int height,String icon,boolean fonte){
		setText(name);
		setBounds(x, y, width, height);
		if(fonte){
		setForeground(Color.WHITE);
		}
		setIcon(i.getImagem(icon));
	}
	public MyJLabel(String name,int x,int y, int width , int height,String typeImage,String icon){
		setText(name);
		setBounds(x, y, width, height);
		setIcon(i.getImages(typeImage, icon));
	}
}
