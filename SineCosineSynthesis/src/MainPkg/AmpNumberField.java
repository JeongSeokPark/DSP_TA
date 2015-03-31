package MainPkg;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class AmpNumberField extends JTextField implements KeyListener,
		TextListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int length = 0;
	
	public AmpNumberField() {
		addKeyListener(this);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
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
		else if(c-48 > 2){
			e1.consume(); // ASCII code
		}
		else if(length > 0){
			e1.consume();
		}	
	}

	@Override
	public void textValueChanged(TextEvent arg0) {
		// TODO Auto-generated method stub

	}
}
