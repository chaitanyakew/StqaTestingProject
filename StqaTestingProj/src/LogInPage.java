import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@SuppressWarnings("serial")
public class LogInPage extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JTextField userid;
	private JPasswordField password;
	private JLabel lblTEXT;
	private JLabel lblTEXT1;
	private JButton btnLogIn;
	public static String id;
	public static String pass;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogInPage LogInPageframe = new LogInPage();
					LogInPageframe.setVisible(true);
					LogInPageframe.setExtendedState(JFrame.MAXIMIZED_BOTH);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public LogInPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLoginPage = new JLabel("LOGIN PAGE");
		lblLoginPage.setFont(new Font("Verdana", Font.BOLD, 37));
		lblLoginPage.setBounds(200, 139, 282, 56);
		contentPane.add(lblLoginPage);
		
		JLabel lblUserId = new JLabel("USER ID");
		lblUserId.setHorizontalAlignment(SwingConstants.CENTER);
		lblUserId.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblUserId.setBounds(71, 263, 202, 86);
		contentPane.add(lblUserId);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblPassword.setBounds(71, 421, 202, 86);
		contentPane.add(lblPassword);
		
		userid = new JTextField();
		userid.setFont(new Font("Tahoma", Font.PLAIN, 28));
		userid.setBounds(323, 283, 210, 56);
		contentPane.add(userid);
		userid.setColumns(10);
		
		password = new JPasswordField();
		password.setFont(new Font("Tahoma", Font.PLAIN, 28));
		password.setBounds(323, 433, 210, 56);
		contentPane.add(password);
		
		lblTEXT = new JLabel("If You can't log in or facing any problems ");
		lblTEXT.setForeground(Color.red);
		lblTEXT.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 28));
		lblTEXT.setBounds(813, 278, 617, 56);
		contentPane.add(lblTEXT);
		
		lblTEXT1 = new JLabel("then please contact your system administrator.");
		lblTEXT1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 28));
		lblTEXT1.setForeground(Color.red);
		lblTEXT1.setBounds(776, 322, 707, 76);
		contentPane.add(lblTEXT1);
		
		btnLogIn = new JButton("Log In");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				String usid = userid.getText();
				String psw = new String(password.getPassword());
				
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection(
							"jdbc:mysql://localhost:3306/SqtaProj", "root", "root");
				
				PreparedStatement s = con.prepareStatement("Select * from userid");
				ResultSet rs = s.executeQuery();
				int i=0;
				int j=0;
				while(rs.next())
				{
					id = rs.getString(1);
					pass = rs.getString(2);		
					
					if(usid.equals(id) && psw.equals(pass))
					{
						JOptionPane.showMessageDialog(frame , "You are logged in!!!!");
						j--;
						dispose();
						Instructions inst = new Instructions();
						inst.setVisible(true);
						break;	
					}
					else
					{
						i++;
					}
				}
				if(i>=0 && j==0)
				{
					JOptionPane.showMessageDialog(frame, "Incorrect USERID or PASSWORD");
				}
				} catch (SQLException e2) {
					e2.printStackTrace();
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				 }
				
				
			}
		});
		btnLogIn.setFont(new Font("Tahoma", Font.BOLD, 28));
		btnLogIn.setBounds(210, 575, 210, 56);
		contentPane.add(btnLogIn);
	}
}
