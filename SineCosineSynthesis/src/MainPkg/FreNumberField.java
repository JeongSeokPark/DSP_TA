package MainPkg;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JTextField;

public class FreNumberField extends JTextField implements KeyListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int length = 0;
	
	public FreNumberField(){
		addKeyListener(this);
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		length = this.getText().length();
	}

	@Override
	public void keyTyped(KeyEvent e1) {
		// TODO Auto-generated method stub
		char c = e1.getKeyChar();

		if(!Character.isDigit(c)){
			e1.consume();
		}
		else if(c-48 > 9){
			e1.consume(); // ASCII code
		}
		else if(length > 2){
			e1.consume();
		}	
	}
}
