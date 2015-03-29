package MainPkg;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.JApplet;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SineCosineSynthesis extends JApplet implements ActionListener, MouseListener {
	public SineCosineSynthesis() {

	}
	
	private JButton btnGenx1;
	private JButton btnGenx2;
	private JButton btnGenx3;
	private JTextField tfx1_Amplitude;
	private JLabel lblx1;
	private JLabel lblx2;
	private JLabel lblx3;
	private JTextField tfx2_Amplitude;
	private JLabel lblx1_function;
	private JLabel lblx2_function;
	private JTextField tfx1_frequency;
	private JTextField tfx2_frequency;
	private JButton btnSinx1;
	private JButton btnSinx2;
	private JButton btnCosx1;
	private JButton btnCosx2;

	public void init() {
		getContentPane().setLayout(null);

		btnGenx1 = new JButton("Gen");
		btnGenx1.setBounds(12, 202, 60, 23);
		getContentPane().add(btnGenx1);

		btnGenx2 = new JButton("Gen");
		btnGenx2.setBounds(12, 235, 60, 23);
		getContentPane().add(btnGenx2);

		btnGenx3 = new JButton("Gen");
		btnGenx3.setBounds(12, 268, 60, 23);
		getContentPane().add(btnGenx3);
		
		tfx1_Amplitude = new JTextField();
		tfx1_Amplitude.setText("1");
		tfx1_Amplitude.setToolTipText("Amplitude input (between 0~2)");
		tfx1_Amplitude.setBounds(179, 202, 19, 23);
		getContentPane().add(tfx1_Amplitude);
		tfx1_Amplitude.setColumns(1);
		
		lblx1 = new JLabel("x\u2081(t) = ");
		lblx1.setFont(new Font("±¼¸²", Font.BOLD | Font.ITALIC, 15));
		lblx1.setBounds(104, 202, 81, 23);
		getContentPane().add(lblx1);
		
		lblx2 = new JLabel("x\u2082(t) = ");
		lblx2.setFont(new Font("±¼¸²", Font.BOLD | Font.ITALIC, 15));
		lblx2.setBounds(104, 235, 81, 23);
		getContentPane().add(lblx2);
		
		lblx3 = new JLabel("x\u2083(t) = x\u2081(t) + x\u2082(t)");
		lblx3.setFont(new Font("±¼¸²", Font.BOLD | Font.ITALIC, 15));
		lblx3.setBounds(104, 268, 200, 22);
		getContentPane().add(lblx3);
		
		tfx2_Amplitude = new JTextField();
		tfx2_Amplitude.setToolTipText("Amplitude input (between 0~2)");
		tfx2_Amplitude.setText("1");
		tfx2_Amplitude.setBounds(179, 235, 19, 23);
		getContentPane().add(tfx2_Amplitude);
		tfx2_Amplitude.setColumns(1);
		
		lblx1_function = new JLabel("Sin(2\u03C0 *          t)");
		lblx1_function.setFont(new Font("±¼¸²", Font.BOLD | Font.ITALIC, 15));
		lblx1_function.setBounds(204, 202, 149, 23);
		getContentPane().add(lblx1_function);
		
		lblx2_function = new JLabel("Cos(2\u03C0 *          t)");
		lblx2_function.setFont(new Font("±¼¸²", Font.BOLD | Font.ITALIC, 15));
		lblx2_function.setBounds(204, 235, 149, 23);
		getContentPane().add(lblx2_function);
		
		tfx1_frequency = new JTextField();
		tfx1_frequency.setText("1");
		tfx1_frequency.setBounds(283, 202, 43, 23);
		getContentPane().add(tfx1_frequency);
		tfx1_frequency.setColumns(3);
		
		tfx2_frequency = new JTextField();
		tfx2_frequency.setText("1");
		tfx2_frequency.setBounds(283, 235, 43, 23);
		getContentPane().add(tfx2_frequency);
		tfx2_frequency.setColumns(3);
		
		btnSinx1 = new JButton("Sin");
		btnSinx1.setBounds(353, 202, 65, 23);
		getContentPane().add(btnSinx1);
		
		btnSinx2 = new JButton("Sin");
		btnSinx2.setBounds(353, 235, 65, 23);
		getContentPane().add(btnSinx2);
		
		btnCosx1 = new JButton("Cos");
		btnCosx1.setBounds(430, 202, 65, 23);
		getContentPane().add(btnCosx1);
		
		btnCosx2 = new JButton("Cos");
		btnCosx2.setBounds(430, 235, 65, 23);
		getContentPane().add(btnCosx2);
		
		btnGenx1.addActionListener(this);
		btnGenx2.addActionListener(this);
		btnGenx3.addActionListener(this);
				
		btnSinx1.addActionListener(this);
		btnSinx2.addActionListener(this);
		
		btnCosx1.addActionListener(this);
		btnCosx2.addActionListener(this);
		

		btnGenx1.addMouseListener(this);
		btnGenx2.addMouseListener(this);
		btnGenx3.addMouseListener(this);
		
		btnSinx1.addMouseListener(this);
		btnSinx2.addMouseListener(this);
		
		btnCosx1.addMouseListener(this);
		btnCosx2.addMouseListener(this);
	}

	public void start() {

	}

	public void paint(Graphics g) {
		super.paint(g);
	}

	public void stop() {

	}

	public void destroy() {

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub		
		
		if(e.getSource() == btnGenx1){
			// System.out.println("Gen1 clicked");
		}
		else if(e.getSource() == btnGenx2){
			// System.out.println("Gen2 clicked");
		}
		else if(e.getSource() == btnGenx3){
			// System.out.println("Gen3 clicked");
		}
		else if(e.getSource() == btnSinx1){
			// System.out.println("sinx1 clicked");
			lblx1_function.setText("Sin(2\u03C0 *          t)");			
		}
		else if(e.getSource() == btnCosx1){
			// System.out.println("cosx1 clicked");
			lblx1_function.setText("Cos(2\u03C0 *          t)");
		}
		else if(e.getSource() == btnSinx2){
			// System.out.println("sin2 clicked");
			lblx2_function.setText("Sin(2\u03C0 *          t)");
		}
		else if(e.getSource() == btnCosx2){
			// System.out.println("cos2 clicked");
			lblx2_function.setText("Cos(2\u03C0 *          t)");
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
