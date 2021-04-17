import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class Instructions extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Instructions Instructionsframe = new Instructions();
					Instructionsframe.setVisible(true);
					Instructionsframe.setExtendedState(JFrame.MAXIMIZED_BOTH);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Instructions() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInstrctions = new JLabel("• Instructions •");
		lblInstrctions.setFont(new Font("Tahoma", Font.BOLD, 55));
		lblInstrctions.setHorizontalAlignment(SwingConstants.CENTER);
		lblInstrctions.setBounds(710, 50, 500, 100);
		contentPane.add(lblInstrctions);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		String pic = "D:\\All Git Repositories\\SqtaTestingProj\\SqtaTestingProj\\pic.png"; 
		ImageIcon icon = new ImageIcon(pic);
		JLabel label = new JLabel(); 
		label.setIcon(icon); 
		panel.add(label);
		panel.setBounds(200, 480, 1102, 516);
		contentPane.add(panel);
		
		JLabel lblFirstInst = new JLabel("• This application is only for computer science students, all subjects are of SPPU 2015 pattern.");
		lblFirstInst.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblFirstInst.setHorizontalAlignment(SwingConstants.LEFT);
		lblFirstInst.setBounds(200, 180, 1300, 75);
		contentPane.add(lblFirstInst);
		
		JLabel lblSecondInst = new JLabel("• If you want to calculate CGPA of only 1 sem just enter that data and click calculate.");
		lblSecondInst.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblSecondInst.setHorizontalAlignment(SwingConstants.LEFT);
		lblSecondInst.setBounds(200, 255, 1300, 75);
		contentPane.add(lblSecondInst);
		
		JLabel lblThirdInst = new JLabel("• You can calculate SGPA/CGPA even if you are failed in a subject which of course is just a speculation of");
		lblThirdInst.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblThirdInst.setHorizontalAlignment(SwingConstants.LEFT);
		lblThirdInst.setBounds(200, 330, 1300, 75);
		contentPane.add(lblThirdInst);
		
		JLabel lblFourthInst = new JLabel("your performance in other subjects.");
		lblFourthInst.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblFourthInst.setHorizontalAlignment(SwingConstants.LEFT);
		lblFourthInst.setBounds(225, 395, 1300, 75);
		contentPane.add(lblFourthInst);
		
		JButton btnOK = new JButton("OK");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				SelectionMenu SM = new SelectionMenu();
				SM.setVisible(true);
			}
		});
		btnOK.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnOK.setBounds(1498, 645, 200, 200);
		contentPane.add(btnOK);
		
	}
}
