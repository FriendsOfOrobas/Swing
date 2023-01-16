package tb.soft;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class MyWindow extends JFrame implements ActionListener {


	private JButton login;
	private JButton cancel;
	private JPasswordField pwd;
	private JTextField user;
	private Map<String,char[]> data;
	private final Color plane = new Color(0x152662);

	public MyWindow(String title) throws HeadlessException {
		setTitle(title);
		data = new HashMap<>();
		data.put("admin", "1234".toCharArray());
		data.put("student", "student".toCharArray());

		setBounds(25, 25, 450, 300);
		setMinimumSize(new Dimension(450, 300));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel box = new JPanel();
		getContentPane().setBackground(plane);
		box.setLayout(new BoxLayout(box, BoxLayout.Y_AXIS));
		box.setOpaque(false);
		add(box);

		JPanel userPanel = new JPanel();
		userPanel.setLayout(new FlowLayout());
		userPanel.setOpaque(false);
		JLabel userLabel = new JLabel();
		Color font = new Color(0x11bbcc11);
		userLabel.setForeground(font);
		userLabel.setText("Login:");
		user = new JTextField(20);
		user.setBackground(Color.pink);
		userPanel.add(userLabel);
		userPanel.add(user);
		box.add(userPanel);

		JPanel pwdPanel = new JPanel();
		pwdPanel.setLayout(new FlowLayout());
		pwdPanel.setOpaque(false);
		JLabel pwdLabel = new JLabel();
		pwdLabel.setForeground(font);
		pwdLabel.setText("Password:");
		pwd = new JPasswordField( 20);
		pwd.setEchoChar('\u200b');
		pwd.setBackground(Color.pink);
		pwdPanel.add(pwdLabel);
		pwdPanel.add(pwd);
		box.add(pwdPanel);

		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout());
		buttonPanel.setOpaque(false);
		login = new JButton();
		login.setText("LOGIN");
		login.addActionListener(this);
		login.setBackground(new Color(0xb08b45));
		buttonPanel.add(login);
		cancel = new JButton();
		cancel.setText("CANCEL");
		cancel.setBackground(new Color(0xb08b45));
		cancel.addActionListener(this);
		buttonPanel.add(cancel);
		box.add(buttonPanel);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
	if (e.getSource() == login) if (data.containsKey(user.getText()) && Arrays.equals(data.get(user.getText()), pwd.getPassword()) )
			getContentPane().setBackground(new Color(0x386e66));
	else
		getContentPane().setBackground(new Color(0xaf1101));
		else if (e.getSource() == cancel) {
			user.setText("");
			pwd.setText("");
			getContentPane().setBackground(plane);
		}
	}
}
