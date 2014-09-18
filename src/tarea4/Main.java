package tarea4;

import javax.swing.JFrame;

public class Main {


	public Main(){
	}
	public static void main(String args[]){
			JFrame jframe=new JFrame();
			jframe.setSize(801, 600);
			Canvas can = new Canvas();
			jframe.add(can);
			jframe.setVisible(true);
}

}