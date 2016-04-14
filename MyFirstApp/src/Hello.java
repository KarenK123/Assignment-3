import javax.swing.JFrame;
import java.awt.Rectangle;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello :)");
		JFrame window = new JFrame();
		//size
		window.setSize(640,480);
		//title
		window.setTitle("This is a frame of J, otherwise known as a JFrame");
		//terminate program when frame is closed
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//have window visible
		window.setVisible(true);
		
		drawingComponent DC = new drawingComponent();
		window.add(DC);
	}
	

}
