package che;

import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.EtchedBorder;

public class chergb {

	private JFrame frmChergb;
	private JCheckBox chkAzul;
	private JCheckBox chkVerde;
	private JCheckBox chkRojo;
	private JLabel lblColor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					chergb window = new chergb();
					window.frmChergb.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public chergb() {
		initialize();
	}
public void asignarColor() {
	int r=0,g=0,b=0;
	int r1=(chkRojo.isSelected())?225:0;
	int g1=(chkVerde.isSelected())?225:0;
	int b1=(chkAzul.isSelected())?225:0;
	lblColor.setBackground(new Color(r1,g1,b1));
}
	
	private void initialize() {
		frmChergb = new JFrame();
		frmChergb.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno.SALA2-PC29\\Downloads\\cecytemelmejor.jpg"));
		frmChergb.setTitle("CHEGRGB");
		frmChergb.setBounds(100, 100, 575, 409);
		frmChergb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmChergb.getContentPane().setLayout(null);
		frmChergb.setLocationRelativeTo(null);
		
	
		chkRojo = new JCheckBox("Rojo");
		chkRojo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asignarColor();
			}
		});
		chkRojo.setBounds(47, 44, 97, 23);
		frmChergb.getContentPane().add(chkRojo);
		
		chkVerde = new JCheckBox("Verde");
		chkVerde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asignarColor();
			}
		});
		chkVerde.setBounds(47, 90, 97, 23);
		frmChergb.getContentPane().add(chkVerde);
		
		chkAzul = new JCheckBox("Azul");
		chkAzul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asignarColor();
			}
		});
		chkAzul.setBounds(47, 144, 97, 23);
		frmChergb.getContentPane().add(chkAzul);
		
		lblColor = new JLabel("");
		lblColor.setOpaque(true);
		lblColor.setBackground(new Color(240, 240, 240));
		lblColor.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		lblColor.setBounds(235, 48, 268, 202);
		frmChergb.getContentPane().add(lblColor);
		
	}
}
