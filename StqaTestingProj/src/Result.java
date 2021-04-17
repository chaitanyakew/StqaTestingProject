import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class Result extends JFrame {

	private JPanel contentPane;
	public JLabel lbl1stSemResult;
	public JLabel lbl2ndSemResult;
	public JLabel lblCgpaResult;
	public JLabel lbl1stSemResultper;
	public JLabel lbl2ndSemResultper;
	public JLabel lblCgpaResultper;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Result frame = new Result();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Result() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblResult = new JLabel("• Result •");
		lblResult.setFont(new Font("Tahoma", Font.BOLD, 55));
		lblResult.setHorizontalAlignment(SwingConstants.CENTER);
		lblResult.setBounds(710, 50, 500, 100);
		contentPane.add(lblResult);
		
		JLabel lbl1stSemSgpa = new JLabel("1st Sem SGPA");
		lbl1stSemSgpa.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1stSemSgpa.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lbl1stSemSgpa.setBounds(250, 300, 275, 100);
		contentPane.add(lbl1stSemSgpa);
		
		JLabel lbl2ndSemSgpa = new JLabel("2st Sem SGPA");
		lbl2ndSemSgpa.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2ndSemSgpa.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lbl2ndSemSgpa.setBounds(250, 475, 275, 100);
		contentPane.add(lbl2ndSemSgpa);
		
		JLabel lblCGPA = new JLabel("CGPA");
		lblCGPA.setHorizontalAlignment(SwingConstants.CENTER);
		lblCGPA.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblCGPA.setBounds(250, 650, 275, 100);
		contentPane.add(lblCGPA);
		
		lbl1stSemResult = new JLabel("");
		lbl1stSemResult.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1stSemResult.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lbl1stSemResult.setBounds(860, 300, 275, 100);
		contentPane.add(lbl1stSemResult);
		
		lbl2ndSemResult = new JLabel("");
		lbl2ndSemResult.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2ndSemResult.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lbl2ndSemResult.setBounds(860, 475, 275, 100);
		contentPane.add(lbl2ndSemResult);
		
		lblCgpaResult = new JLabel("");
		lblCgpaResult.setHorizontalAlignment(SwingConstants.CENTER);
		lblCgpaResult.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblCgpaResult.setBounds(860, 650, 275, 100);
		contentPane.add(lblCgpaResult);
		
		lbl1stSemResultper = new JLabel("");
		lbl1stSemResultper.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1stSemResultper.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lbl1stSemResultper.setBounds(1460, 300, 275, 100);
		contentPane.add(lbl1stSemResultper);
		
		lbl2ndSemResultper = new JLabel("");
		lbl2ndSemResultper.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2ndSemResultper.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lbl2ndSemResultper.setBounds(1460, 475, 275, 100);
		contentPane.add(lbl2ndSemResultper);
		
		lblCgpaResultper = new JLabel("");
		lblCgpaResultper.setHorizontalAlignment(SwingConstants.CENTER);
		lblCgpaResultper.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblCgpaResultper.setBounds(1460, 650, 275, 100);
		contentPane.add(lblCgpaResultper);
		
		JButton btnBack = new JButton("Go To Menu");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				SelectionMenu SM = new SelectionMenu();
				SM.setVisible(true);
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 35));
		btnBack.setBounds(810, 900, 300, 100);
		contentPane.add(btnBack);
	}
}
