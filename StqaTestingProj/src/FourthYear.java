import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class FourthYear extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldFSSub1;
	private JTextField textFieldFSSub2;
	private JTextField textFieldFSSub3;
	private JTextField textFieldFSSub4;
	private JTextField textFieldFSSub5;
	private JTextField textFieldFSSub6;
	private JTextField textFieldFSSub7;
	private JTextField textFieldFSSub8;
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
					FourthYear frame = new FourthYear();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public FourthYear() {
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
		
		JLabel lblFSSub1 = new JLabel("410241");
		lblFSSub1.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblFSSub1.setHorizontalAlignment(SwingConstants.CENTER);
		lblFSSub1.setBounds(100, 195, 150, 60);
		contentPane.add(lblFSSub1);
		
		JLabel lblFSSub2 = new JLabel("410242");
		lblFSSub2.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblFSSub2.setHorizontalAlignment(SwingConstants.CENTER);
		lblFSSub2.setBounds(100, 270, 150, 60);
		contentPane.add(lblFSSub2);
		
		JLabel lblFSSub3 = new JLabel("410243");
		lblFSSub3.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblFSSub3.setHorizontalAlignment(SwingConstants.CENTER);
		lblFSSub3.setBounds(100, 345, 150, 60);
		contentPane.add(lblFSSub3);
		
		JLabel lblFSSub4 = new JLabel("410244");
		lblFSSub4.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblFSSub4.setHorizontalAlignment(SwingConstants.CENTER);
		lblFSSub4.setBounds(100, 420, 150, 60);
		contentPane.add(lblFSSub4);
		
		JLabel lblFSSub5 = new JLabel("410245");
		lblFSSub5.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblFSSub5.setHorizontalAlignment(SwingConstants.CENTER);
		lblFSSub5.setBounds(100, 495, 150, 60);
		contentPane.add(lblFSSub5);
		
		JLabel lblFSSub6 = new JLabel("410246");
		lblFSSub6.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblFSSub6.setHorizontalAlignment(SwingConstants.CENTER);
		lblFSSub6.setBounds(100, 570, 150, 60);
		contentPane.add(lblFSSub6);
		
		JLabel lblFSSub7 = new JLabel("410247");
		lblFSSub7.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblFSSub7.setHorizontalAlignment(SwingConstants.CENTER);
		lblFSSub7.setBounds(100, 645, 150, 60);
		contentPane.add(lblFSSub7);
		
		JLabel lblFSSub8 = new JLabel("410248");
		lblFSSub8.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblFSSub8.setHorizontalAlignment(SwingConstants.CENTER);
		lblFSSub8.setBounds(100, 720, 150, 60);
		contentPane.add(lblFSSub8);
		
		textFieldFSSub1 = new JTextField();
		textFieldFSSub1.setFont(new Font("Tahoma", Font.PLAIN, 32));
		textFieldFSSub1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldFSSub1.setBounds(595, 195, 250, 60);
		contentPane.add(textFieldFSSub1);
		textFieldFSSub1.setColumns(10);
		
		textFieldFSSub2 = new JTextField();
		textFieldFSSub2.setFont(new Font("Tahoma", Font.PLAIN, 32));
		textFieldFSSub2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldFSSub2.setBounds(595, 270, 250, 60);
		contentPane.add(textFieldFSSub2);
		textFieldFSSub2.setColumns(10);
		
		textFieldFSSub3 = new JTextField();
		textFieldFSSub3.setFont(new Font("Tahoma", Font.PLAIN, 32));
		textFieldFSSub3.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldFSSub3.setBounds(595, 345, 250, 60);
		contentPane.add(textFieldFSSub3);
		textFieldFSSub3.setColumns(10);
		
		textFieldFSSub4 = new JTextField();
		textFieldFSSub4.setFont(new Font("Tahoma", Font.PLAIN, 32));
		textFieldFSSub4.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldFSSub4.setBounds(595, 420, 250, 60);
		contentPane.add(textFieldFSSub4);
		textFieldFSSub4.setColumns(10);
		
		textFieldFSSub5 = new JTextField();
		textFieldFSSub5.setFont(new Font("Tahoma", Font.PLAIN, 32));
		textFieldFSSub5.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldFSSub5.setBounds(595, 495, 250, 60);
		contentPane.add(textFieldFSSub5);
		textFieldFSSub5.setColumns(10);
		
		textFieldFSSub6 = new JTextField();
		textFieldFSSub6.setFont(new Font("Tahoma", Font.PLAIN, 32));
		textFieldFSSub6.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldFSSub6.setBounds(595, 570, 250, 60);
		contentPane.add(textFieldFSSub6);
		textFieldFSSub6.setColumns(10);
		
		textFieldFSSub7 = new JTextField();
		textFieldFSSub7.setFont(new Font("Tahoma", Font.PLAIN, 32));
		textFieldFSSub7.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldFSSub7.setBounds(595, 645, 250, 60);
		contentPane.add(textFieldFSSub7);
		textFieldFSSub7.setColumns(10);
		
		textFieldFSSub8 = new JTextField();
		textFieldFSSub8.setFont(new Font("Tahoma", Font.PLAIN, 32));
		textFieldFSSub8.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldFSSub8.setBounds(595, 720, 250, 60);
		contentPane.add(textFieldFSSub8);
		textFieldFSSub8.setColumns(10);
		
		JLabel lblSSSub1 = new JLabel("410250");
		lblSSSub1.setHorizontalAlignment(SwingConstants.CENTER);
		lblSSSub1.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblSSSub1.setBounds(1135, 195, 150, 60);
		contentPane.add(lblSSSub1);
		
		JLabel lblSSSub2 = new JLabel("410251");
		lblSSSub2.setHorizontalAlignment(SwingConstants.CENTER);
		lblSSSub2.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblSSSub2.setBounds(1135, 270, 150, 60);
		contentPane.add(lblSSSub2);
		
		JLabel lblSSSub3 = new JLabel("410252");
		lblSSSub3.setHorizontalAlignment(SwingConstants.CENTER);
		lblSSSub3.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblSSSub3.setBounds(1135, 345, 150, 60);
		contentPane.add(lblSSSub3);
		
		JLabel lblSSSub4 = new JLabel("410253");
		lblSSSub4.setHorizontalAlignment(SwingConstants.CENTER);
		lblSSSub4.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblSSSub4.setBounds(1135, 420, 150, 60);
		contentPane.add(lblSSSub4);
		
		JLabel lblSSSub5 = new JLabel("410254");
		lblSSSub5.setHorizontalAlignment(SwingConstants.CENTER);
		lblSSSub5.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblSSSub5.setBounds(1135, 495, 150, 60);
		contentPane.add(lblSSSub5);
		
		JLabel lblSSSub6 = new JLabel("410255");
		lblSSSub6.setHorizontalAlignment(SwingConstants.CENTER);
		lblSSSub6.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblSSSub6.setBounds(1135, 570, 150, 60);
		contentPane.add(lblSSSub6);
		
		JLabel lblSSSub7 = new JLabel("410256");
		lblSSSub7.setHorizontalAlignment(SwingConstants.CENTER);
		lblSSSub7.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblSSSub7.setBounds(1135, 645, 150, 60);
		contentPane.add(lblSSSub7);
		
		textFieldSSSub1 = new JTextField();
		textFieldSSSub1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldSSSub1.setFont(new Font("Tahoma", Font.PLAIN, 32));	
		textFieldSSSub1.setBounds(1570, 195, 250, 60);
		contentPane.add(textFieldSSSub1);
		textFieldSSSub1.setColumns(10);
		
		textFieldSSSub2 = new JTextField();
		textFieldSSSub2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldSSSub2.setFont(new Font("Tahoma", Font.PLAIN, 32));
		textFieldSSSub2.setBounds(1570, 270, 250, 60);
		contentPane.add(textFieldSSSub2);
		textFieldSSSub2.setColumns(10);
		
		
		textFieldSSSub3 = new JTextField();
		textFieldSSSub3.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldSSSub3.setFont(new Font("Tahoma", Font.PLAIN, 32));	
		textFieldSSSub3.setBounds(1570, 345, 250, 60);
		contentPane.add(textFieldSSSub3);
		textFieldSSSub3.setColumns(10);
		
		textFieldSSSub4 = new JTextField();
		textFieldSSSub4.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldSSSub4.setFont(new Font("Tahoma", Font.PLAIN, 32));
		textFieldSSSub4.setBounds(1570, 420, 250, 60);
		contentPane.add(textFieldSSSub4);
		textFieldSSSub4.setColumns(10);
		
		textFieldSSSub5 = new JTextField();
		textFieldSSSub5.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldSSSub5.setFont(new Font("Tahoma", Font.PLAIN, 32));	
		textFieldSSSub5.setBounds(1570, 495, 250, 60);
		contentPane.add(textFieldSSSub5);
		textFieldSSSub5.setColumns(10);
		
		textFieldSSSub6 = new JTextField();
		textFieldSSSub6.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldSSSub6.setFont(new Font("Tahoma", Font.PLAIN, 32));
		textFieldSSSub6.setBounds(1570, 570, 250, 60);
		contentPane.add(textFieldSSSub6);
		textFieldSSSub6.setColumns(10);
		
		
		textFieldSSSub7 = new JTextField();
		textFieldSSSub7.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldSSSub7.setFont(new Font("Tahoma", Font.PLAIN, 32));	
		textFieldSSSub7.setBounds(1570, 645, 250, 60);
		contentPane.add(textFieldSSSub7);
		textFieldSSSub7.setColumns(10);
		
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
					int FSSub8 = Integer.parseInt(textFieldFSSub8.getText());
					
					arrs1 = new int[]{FSSub1,FSSub2,FSSub3,FSSub4,FSSub5,FSSub6,FSSub7,FSSub8};
				}catch(Exception e) {
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
				}catch(Exception e) {
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
					sgpa1stsem = cal.BEcalcCGPA(arrs1);
					sgpa2ndsem = cal.BEcalcCGPA(arrs2);
					
					if(arrs1.length==8 && arrs2.length==7) {
						cgpa = cal.BEcalcSGPA(arrs1,arrs2);				
					}
					else {
						arrs1 = new int[] {0};
						arrs2 = new int[] {0};
						cgpa = cal.BEcalcSGPA(arrs1,arrs2);				
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
	}

}
