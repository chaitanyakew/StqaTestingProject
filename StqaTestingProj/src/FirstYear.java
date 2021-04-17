import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class FirstYear extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldFSSub1;
	private JTextField textFieldFSSub2;
	private JTextField textFieldFSSub3;
	private JTextField textFieldFSSub4;
	private JTextField textFieldFSSub5;
	private JTextField textFieldFSSub6;
	private JTextField textFieldFSSub7;
	private JTextField textFieldSSSub1;
	private JTextField textFieldSSSub2;
	private JTextField textFieldSSSub3;
	private JTextField textFieldSSSub4;
	private JTextField textFieldSSSub5;
	private JTextField textFieldSSSub6;
	private JTextField textFieldSSSub7;
	
	private boolean fsem = false;
	private boolean ssem = false;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstYear frame = new FirstYear();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public FirstYear() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFirstSem = new JLabel("First Semester");
		lblFirstSem.setHorizontalAlignment(SwingConstants.CENTER);
		lblFirstSem.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblFirstSem.setBounds(325, 75, 310, 75);
		contentPane.add(lblFirstSem);
		
		JLabel lblSecondSem = new JLabel("Second Semester");
		lblSecondSem.setHorizontalAlignment(SwingConstants.CENTER);
		lblSecondSem.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblSecondSem.setBounds(1285, 75, 310, 75);
		contentPane.add(lblSecondSem);
		
		JLabel lblFSSub1 = new JLabel("107001  ");
		lblFSSub1.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblFSSub1.setHorizontalAlignment(SwingConstants.CENTER);
		lblFSSub1.setBounds(100, 245, 150, 60);
		contentPane.add(lblFSSub1);
		
		JLabel lblFSSub2a = new JLabel("107002 /");
		lblFSSub2a.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblFSSub2a.setHorizontalAlignment(SwingConstants.CENTER);
		lblFSSub2a.setBounds(100, 320, 150, 60);
		contentPane.add(lblFSSub2a);
		
		JLabel lblFSSub2b = new JLabel("107009  ");
		lblFSSub2b.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblFSSub2b.setHorizontalAlignment(SwingConstants.CENTER);
		lblFSSub2b.setBounds(100, 360, 150, 60);
		contentPane.add(lblFSSub2b);
		
		JLabel lblFSSub3 = new JLabel("102006  ");
		lblFSSub3.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblFSSub3.setHorizontalAlignment(SwingConstants.CENTER);
		lblFSSub3.setBounds(100, 435, 150, 60);
		contentPane.add(lblFSSub3);
		
		JLabel lblFSSub4a = new JLabel("103004 /");
		lblFSSub4a.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblFSSub4a.setHorizontalAlignment(SwingConstants.CENTER);
		lblFSSub4a.setBounds(100, 510, 150, 60);
		contentPane.add(lblFSSub4a);
		
		JLabel lblFSSub4b = new JLabel("104012  ");
		lblFSSub4b.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblFSSub4b.setHorizontalAlignment(SwingConstants.CENTER);
		lblFSSub4b.setBounds(100, 550, 150, 60);
		contentPane.add(lblFSSub4b);
		
		JLabel lblFSSub5 = new JLabel("101005  ");
		lblFSSub5.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblFSSub5.setHorizontalAlignment(SwingConstants.CENTER);
		lblFSSub5.setBounds(100, 625, 150, 60);
		contentPane.add(lblFSSub5);
		
		JLabel lblFSSub6 = new JLabel("110003  ");
		lblFSSub6.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblFSSub6.setHorizontalAlignment(SwingConstants.CENTER);
		lblFSSub6.setBounds(100, 700, 150, 60);
		contentPane.add(lblFSSub6);
		
		JLabel lblFSSub7 = new JLabel("110007  ");
		lblFSSub7.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblFSSub7.setHorizontalAlignment(SwingConstants.CENTER);
		lblFSSub7.setBounds(100, 775, 150, 60);
		contentPane.add(lblFSSub7);
		
		textFieldFSSub1 = new JTextField();
		textFieldFSSub1.setFont(new Font("Tahoma", Font.PLAIN, 32));
		textFieldFSSub1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldFSSub1.setBounds(595, 245, 250, 60);
		contentPane.add(textFieldFSSub1);
		textFieldFSSub1.setColumns(10);
		
		textFieldFSSub2 = new JTextField();
		textFieldFSSub2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldFSSub2.setFont(new Font("Tahoma", Font.PLAIN, 32));
		textFieldFSSub2.setColumns(10);
		textFieldFSSub2.setBounds(595, 320, 250, 60);
		contentPane.add(textFieldFSSub2);
		
		textFieldFSSub3 = new JTextField();
		textFieldFSSub3.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldFSSub3.setFont(new Font("Tahoma", Font.PLAIN, 32));
		textFieldFSSub3.setColumns(10);
		textFieldFSSub3.setBounds(595, 435, 250, 60);
		contentPane.add(textFieldFSSub3);
		
		textFieldFSSub4 = new JTextField();
		textFieldFSSub4.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldFSSub4.setFont(new Font("Tahoma", Font.PLAIN, 32));
		textFieldFSSub4.setColumns(10);
		textFieldFSSub4.setBounds(595, 505, 250, 60);
		contentPane.add(textFieldFSSub4);
		
		textFieldFSSub5 = new JTextField();
		textFieldFSSub5.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldFSSub5.setFont(new Font("Tahoma", Font.PLAIN, 32));
		textFieldFSSub5.setColumns(10);
		textFieldFSSub5.setBounds(595, 625, 250, 60);
		contentPane.add(textFieldFSSub5);
		
		textFieldFSSub6 = new JTextField();
		textFieldFSSub6.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldFSSub6.setFont(new Font("Tahoma", Font.PLAIN, 32));
		textFieldFSSub6.setColumns(10);
		textFieldFSSub6.setBounds(595, 700, 250, 60);
		contentPane.add(textFieldFSSub6);
		
		textFieldFSSub7 = new JTextField();
		textFieldFSSub7.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldFSSub7.setFont(new Font("Tahoma", Font.PLAIN, 32));
		textFieldFSSub7.setColumns(10);
		textFieldFSSub7.setBounds(595, 775, 250, 60);
		contentPane.add(textFieldFSSub7);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int[] arrs1 = {0};
				int[] arrs2 = {0};
				
				double sgpa1stsem = 0;
				double sgpa2ndsem = 0;
				double cgpa = 0;

				try {
					int FSSub1 = Integer.parseInt(textFieldFSSub1.getText());
					int FSSub2 = Integer.parseInt(textFieldFSSub2.getText());
					int FSSub3 = Integer.parseInt(textFieldFSSub3.getText());
					int FSSub4 = Integer.parseInt(textFieldFSSub4.getText());
					int FSSub5 = Integer.parseInt(textFieldFSSub5.getText());
					int FSSub6 = Integer.parseInt(textFieldFSSub6.getText());
					int FSSub7 = Integer.parseInt(textFieldFSSub7.getText());
					
					arrs1 = new int[]{FSSub1,FSSub2,FSSub3,FSSub4,FSSub5,FSSub6,FSSub7};
				}
				catch(Exception e) {
					arrs1 = new int[] {0};
					fsem = true;
				}
				
				try {
					int SSSub1 = Integer.parseInt(textFieldSSSub1.getText());
					int SSSub2 = Integer.parseInt(textFieldSSSub2.getText());
					int SSSub3 = Integer.parseInt(textFieldSSSub3.getText());
					int SSSub4 = Integer.parseInt(textFieldSSSub4.getText());
					int SSSub5 = Integer.parseInt(textFieldSSSub5.getText());
					int SSSub6 = Integer.parseInt(textFieldSSSub6.getText());
					int SSSub7 = Integer.parseInt(textFieldSSSub7.getText());
				
					arrs2 = new int[]{SSSub1,SSSub2,SSSub3,SSSub4,SSSub5,SSSub6,SSSub7};
				}
				catch(Exception e) {
					arrs2 = new int[] {0};
					ssem = true;
				}
				
				if(fsem == true && ssem == true) {
					JOptionPane.showMessageDialog(null, "Enter Valid Data!!");
					dispose();
					Instructions i = new Instructions();
					i.setVisible(true);
				}
				else {
					Calculate cal = new Calculate();
					sgpa1stsem = cal.calcCGPA(arrs1);
					sgpa2ndsem = cal.calcCGPA(arrs2);
					
					if(arrs1.length==arrs2.length) {
						cgpa = cal.FEcalcSGPA(arrs1,arrs2);
					}
					else {
						arrs1 = new int[] {0};
						arrs2 = new int[] {0};
						cgpa = cal.FEcalcSGPA(arrs1,arrs2);
					}
					
					dispose();
					Result res = new Result();
					
					if(sgpa1stsem == 0.00) {
						res.lbl1stSemResult.setText("-");
						res.lbl1stSemResultper.setText("-");
					}
					else {
						res.lbl1stSemResult.setText(String.valueOf(sgpa1stsem));
						res.lbl1stSemResultper.setText(String.valueOf(String.format("%.2f", (sgpa1stsem*8.8))));
					}
					
					if(sgpa2ndsem == 0.00) {
						res.lbl2ndSemResult.setText("-");
						res.lbl2ndSemResultper.setText("-");
					}
					else {
						res.lbl2ndSemResult.setText(String.valueOf(sgpa2ndsem));
						res.lbl2ndSemResultper.setText(String.valueOf(String.format("%.2f", (sgpa2ndsem*8.8))));
					}
					
					if(cgpa == 0.00) {
						res.lblCgpaResult.setText("-");
						res.lblCgpaResultper.setText("-");
	
					}
					else {
						res.lblCgpaResult.setText(String.valueOf(cgpa));
						res.lblCgpaResultper.setText(String.valueOf(String.format("%.2f", (cgpa*8.8))));
					}
		
					res.setVisible(true);
				}
				
			}
		});
		btnCalculate.setHorizontalAlignment(SwingConstants.RIGHT);
		btnCalculate.setFont(new Font("Tahoma", Font.BOLD, 45));
		btnCalculate.setBounds(860, 900, 250, 75);
		contentPane.add(btnCalculate);
		
		JLabel lblSSSub1 = new JLabel("107008 ");
		lblSSSub1.setHorizontalAlignment(SwingConstants.CENTER);
		lblSSSub1.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblSSSub1.setBounds(1135, 245, 150, 60);
		contentPane.add(lblSSSub1);
		
		JLabel lblSSSub2a = new JLabel("107009 /");
		lblSSSub2a.setHorizontalAlignment(SwingConstants.CENTER);
		lblSSSub2a.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblSSSub2a.setBounds(1135, 320, 150, 60);
		contentPane.add(lblSSSub2a);
		
		JLabel lblSSSub2b = new JLabel("107002  ");
		lblSSSub2b.setHorizontalAlignment(SwingConstants.CENTER);
		lblSSSub2b.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblSSSub2b.setBounds(1135, 360, 150, 60);
		contentPane.add(lblSSSub2b);
		
		JLabel lblSSSub3 = new JLabel("102013  ");
		lblSSSub3.setHorizontalAlignment(SwingConstants.CENTER);
		lblSSSub3.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblSSSub3.setBounds(1135, 435, 150, 60);
		contentPane.add(lblSSSub3);
		
		JLabel lblSSSub4a = new JLabel("104012 /");
		lblSSSub4a.setHorizontalAlignment(SwingConstants.CENTER);
		lblSSSub4a.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblSSSub4a.setBounds(1135, 510, 150, 60);
		contentPane.add(lblSSSub4a);
		
		JLabel lblSSSub4b = new JLabel("103004  ");
		lblSSSub4b.setHorizontalAlignment(SwingConstants.CENTER);
		lblSSSub4b.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblSSSub4b.setBounds(1135, 550, 150, 60);
		contentPane.add(lblSSSub4b);
		
		JLabel lblSSSub5 = new JLabel("101011  ");
		lblSSSub5.setHorizontalAlignment(SwingConstants.CENTER);
		lblSSSub5.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblSSSub5.setBounds(1135, 625, 150, 60);
		contentPane.add(lblSSSub5);
		
		JLabel lblSSSub6 = new JLabel("110010  ");
		lblSSSub6.setHorizontalAlignment(SwingConstants.CENTER);
		lblSSSub6.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblSSSub6.setBounds(1135, 700, 150, 60);
		contentPane.add(lblSSSub6);
		
		JLabel lblSSSub7 = new JLabel("102014  ");
		lblSSSub7.setHorizontalAlignment(SwingConstants.CENTER);
		lblSSSub7.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblSSSub7.setBounds(1135, 775, 150, 60);
		contentPane.add(lblSSSub7);
		
		textFieldSSSub1 = new JTextField();
		textFieldSSSub1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldSSSub1.setFont(new Font("Tahoma", Font.PLAIN, 32));
		textFieldSSSub1.setColumns(10);
		textFieldSSSub1.setBounds(1570, 245, 250, 60);
		contentPane.add(textFieldSSSub1);
		
		textFieldSSSub2 = new JTextField();
		textFieldSSSub2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldSSSub2.setFont(new Font("Tahoma", Font.PLAIN, 32));
		textFieldSSSub2.setColumns(10);
		textFieldSSSub2.setBounds(1570, 320, 250, 60);
		contentPane.add(textFieldSSSub2);
		
		textFieldSSSub3 = new JTextField();
		textFieldSSSub3.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldSSSub3.setFont(new Font("Tahoma", Font.PLAIN, 32));
		textFieldSSSub3.setColumns(10);
		textFieldSSSub3.setBounds(1570, 435, 250, 60);
		contentPane.add(textFieldSSSub3);
		
		textFieldSSSub4 = new JTextField();
		textFieldSSSub4.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldSSSub4.setFont(new Font("Tahoma", Font.PLAIN, 32));
		textFieldSSSub4.setColumns(10);
		textFieldSSSub4.setBounds(1570, 505, 250, 60);
		contentPane.add(textFieldSSSub4);
		
		textFieldSSSub5 = new JTextField();
		textFieldSSSub5.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldSSSub5.setFont(new Font("Tahoma", Font.PLAIN, 32));
		textFieldSSSub5.setColumns(10);
		textFieldSSSub5.setBounds(1570, 625, 250, 60);
		contentPane.add(textFieldSSSub5);
		
		textFieldSSSub6 = new JTextField();
		textFieldSSSub6.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldSSSub6.setFont(new Font("Tahoma", Font.PLAIN, 32));
		textFieldSSSub6.setColumns(10);
		textFieldSSSub6.setBounds(1570, 700, 250, 60);
		contentPane.add(textFieldSSSub6);
		
		textFieldSSSub7 = new JTextField();
		textFieldSSSub7.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldSSSub7.setFont(new Font("Tahoma", Font.PLAIN, 32));
		textFieldSSSub7.setColumns(10);
		textFieldSSSub7.setBounds(1570, 775, 250, 60);
		contentPane.add(textFieldSSSub7);
	}
}
