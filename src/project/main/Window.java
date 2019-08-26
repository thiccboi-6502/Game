package project.main;

import java.awt.Canvas;

import javax.swing.JFrame;

public class Window extends Canvas
{
	private static final long serialVersionUID = 1L;

	public Window(int w, int h, String title, Main m)
	{
		JFrame frame = new JFrame(title);
		
		frame.setSize(w, h);
	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.add(m);
		frame.setVisible(true);
		m.start();
	}
}
