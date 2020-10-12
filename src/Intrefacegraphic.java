import java.awt.AWTException;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Toolkit;

public class Intrefacegraphic extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Intrefacegraphic frame = new Intrefacegraphic();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws AWTException 
	 */
	public Intrefacegraphic() throws AWTException {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\DELL INSPIRON\\Desktop\\project java\\bot\\Icon\\th.jpg"));
		setTitle("Bot ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 511, 349);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Rapide");
		rdbtnNewRadioButton.setBackground(Color.WHITE);
		rdbtnNewRadioButton.setBounds(37, 127, 77, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Moyen(recommand\u00E9)");
		rdbtnNewRadioButton_1.setBackground(Color.WHITE);
		rdbtnNewRadioButton_1.setBounds(146, 127, 159, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Lent");
		rdbtnNewRadioButton_2.setBackground(Color.WHITE);
		rdbtnNewRadioButton_2.setBounds(331, 127, 109, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("30 min");
		rdbtnNewRadioButton_3.setBackground(Color.WHITE);
		rdbtnNewRadioButton_3.setBounds(20, 211, 77, 23);
		contentPane.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("2 heures");
		rdbtnNewRadioButton_4.setBackground(Color.WHITE);
		rdbtnNewRadioButton_4.setBounds(159, 211, 117, 23);
		contentPane.add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("6 heures");
		rdbtnNewRadioButton_5.setBackground(Color.WHITE);
		rdbtnNewRadioButton_5.setBounds(300, 211, 109, 23);
		contentPane.add(rdbtnNewRadioButton_5);
		
		JLabel lblNewLabel = new JLabel(" BOT 1.13");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Serif", Font.ITALIC, 18));
		lblNewLabel.setBounds(200, 34, 91, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Vitesse du chargement");
		lblNewLabel_1.setBounds(201, 85, 133, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Temp du bot");
		lblNewLabel_2.setBounds(200, 179, 76, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Valid\u00E9");
		
		Robot r1 = new Robot();
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				
				r1.keyPress(KeyEvent.VK_WINDOWS);
				r1.keyPress(KeyEvent.VK_DOWN);
				r1.keyRelease(KeyEvent.VK_DOWN);
				r1.keyPress(KeyEvent.VK_DOWN);
				r1.keyRelease(KeyEvent.VK_DOWN);
				r1.keyRelease(KeyEvent.VK_WINDOWS);
				
				
				
				int delais =0;
				int duree=0;
				int i =0;
				
				if ( rdbtnNewRadioButton_1.isSelected() ) {
					
					delais = 50;
					
				}

				if ( rdbtnNewRadioButton_3.isSelected() ) {
					
					duree = (int) (1800/(2*delais*3.00));
					
				}
				
			
				if ( rdbtnNewRadioButton.isSelected() ) {
					
					delais = 100;
					
				}

				if ( rdbtnNewRadioButton_3.isSelected() ) {
					
					duree = (int) (1800/(2*delais*0.00));
					
				}
				
				while(i<duree) {
					r1.mouseMove(369,275);
					r1.mousePress(InputEvent.BUTTON1_MASK);
					r1.mouseRelease(InputEvent.BUTTON1_MASK);
					r1.delay(delais);
					r1.mouseMove(347,582);
					r1.mousePress(InputEvent.BUTTON1_MASK);
					r1.mouseRelease(InputEvent.BUTTON1_MASK);
					r1.delay(delais);
					
					i=i+1;
				}
				
			}
			
			
		});
		
		
		
		btnNewButton.setBackground(Color.BLUE);
		btnNewButton.setBounds(167, 276, 89, 23);
		contentPane.add(btnNewButton);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnNewRadioButton);
		group.add(rdbtnNewRadioButton_1);
		group.add(rdbtnNewRadioButton_2);
		ButtonGroup group2 = new ButtonGroup();
		group2.add(rdbtnNewRadioButton_3);
		group2.add(rdbtnNewRadioButton_4);
		group2.add(rdbtnNewRadioButton_5);
		
	}
}
