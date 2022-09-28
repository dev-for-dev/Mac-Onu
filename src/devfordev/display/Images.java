package devfordev.display;

import javax.swing.ImageIcon;

public class Images {

	public ImageIcon getImagem(String nome){
		String caminhoDaImagem = "devfordev/resource/displays/" + nome;
		ClassLoader classLoader = this.getClass().getClassLoader();
		ImageIcon icone = new ImageIcon(classLoader.getResource(caminhoDaImagem));
		return icone;
	}
	public ImageIcon getImages(String typeImage, String name) {
		String imagePath = "";
		if (typeImage == "image") {
			imagePath = "/src/devfordev/resource/" + name;
		} else if (typeImage == "display") {
			imagePath = "/src/devfordev/resource/displays/" + name;
		} else if (typeImage == "button") {
			imagePath = "/src/devfordev/resource/buttons/" + name;
		}
		System.out.println(imagePath);
		ClassLoader classLoader = this.getClass().getClassLoader();
		ImageIcon icon = new ImageIcon(classLoader.getResource(imagePath));
		return icon;
	}

}
