package MovieApplicationView;

import javax.swing.BoxLayout;
import javax.swing.JFrame;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class SortingFrame {
	private JFrame frame;
	private JPanel panel;
	private JScrollPane scroll;

	public SortingFrame() {
		frame = new JFrame("List by Year");
		frame.setSize(500, 500);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // dispose only this frame when closed

		// create a panel with BoxLayout, Y_AXIS so that newly added stuff automatically
		// go to the next lane
		panel = new JPanel();
		BoxLayout boxLayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
		panel.setLayout(boxLayout);

		// give panel scroll bar
		scroll = new JScrollPane(panel);

		frame.setContentPane(scroll);

		frame.setVisible(true);
	}

	// getters and setters
	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JScrollPane getScroll() {
		return scroll;
	}

	public void setScroll(JScrollPane scroll) {
		this.scroll = scroll;
	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

}
