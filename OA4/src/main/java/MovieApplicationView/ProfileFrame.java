package MovieApplicationView;

import javax.swing.JFrame;

public class ProfileFrame {
	private JFrame frame;
//	private JButton btnUser1;
//	private JButton btnUser2;
//	private JButton btnUser3;
//	private JButton btnUser4;

	public ProfileFrame() {
		frame = new JFrame("Select User");

//		btnUser1 = new JButton("1");
//		btnUser2 = new JButton("2");
//		btnUser3 = new JButton("3");
//		btnUser4 = new JButton("4");
//		
//		btnUser1.setBounds(50, 50, 212, 68);
//		frame.add(btnUser1);
//		btnUser2.setBounds(50, 150, 212, 68);
//		frame.add(btnUser2);
//		btnUser3.setBounds(50, 250, 212, 68);
//		frame.add(btnUser3);
//		btnUser4.setBounds(50, 350, 212, 68);
//		frame.add(btnUser4);

		frame.getContentPane().setLayout(null); // use absolute layout
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // dispose only this frame when closed
		frame.setSize(312, 600);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	// getters and setters
	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

//	public JButton getBtnUser1() {
//		return btnUser1;
//	}
//
//	public void setBtnUser1(JButton btnUser1) {
//		this.btnUser1 = btnUser1;
//	}
//
//	public JButton getBtnUser2() {
//		return btnUser2;
//	}
//
//	public void setBtnUser2(JButton btnUser2) {
//		this.btnUser2 = btnUser2;
//	}
//
//	public JButton getBtnUser3() {
//		return btnUser3;
//	}
//
//	public void setBtnUser3(JButton btnUser3) {
//		this.btnUser3 = btnUser3;
//	}
//
//	public JButton getBtnUser4() {
//		return btnUser4;
//	}
//
//	public void setBtnUser4(JButton btnUser4) {
//		this.btnUser4 = btnUser4;
//	}

}
