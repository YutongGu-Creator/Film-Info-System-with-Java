package MovieApplicationView;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class AddNewFrame {
	private JFrame frame;
	private JLabel title;
	private JLabel description;
	private JLabel year;
	private JLabel genre;
	private JLabel director;
	private JLabel cast;
	private JLabel tv;
	private JTextField tTitle;
	private JTextArea tdescription;
	private JTextField tyear;
	private JTextArea tgenre;
	private JTextField tdirector;
	private JTextArea tcast;
	private JCheckBox ttv;
	private JButton btnSave;
	private JScrollPane scroll;

	public AddNewFrame() {
		// create frame and all the necessary labels, text fields and buttons
		frame = new JFrame("Add Item");

		title = new JLabel("Title:");
		description = new JLabel("Description:");
		year = new JLabel("Year:");
		genre = new JLabel("Genre:");
		director = new JLabel("Director:");
		cast = new JLabel("Cast:");
		tv = new JLabel("Tv:");
		tTitle = new JTextField();
		tdescription = new JTextArea();
		tyear = new JTextField();
		tgenre = new JTextArea();
		tdirector = new JTextField();
		tcast = new JTextArea();
		ttv = new JCheckBox();
		btnSave = new JButton("Save");

		// set style for the necessary labels, text fields and buttons and add them to
		// the frame
		title.setBounds(50, 50, 100, 30);
		frame.add(title);
		description.setBounds(50, 100, 100, 30);
		frame.add(description);
		year.setBounds(50, 150, 100, 30);
		frame.add(year);
		genre.setBounds(50, 200, 100, 30);
		frame.add(genre);
		director.setBounds(50, 250, 100, 30);
		frame.add(director);
		cast.setBounds(50, 300, 100, 30);
		frame.add(cast);
		tv.setBounds(50, 350, 100, 30);
		frame.add(tv);
		tTitle.setBounds(150, 50, 200, 30);
		frame.add(tTitle);
		// create a scroll bar for showing description
		scroll = new JScrollPane(tdescription);
		scroll.setBounds(150, 90, 200, 50);
		tdescription.setLineWrap(true);
		tdescription.setWrapStyleWord(true);
		frame.add(scroll);
		tyear.setBounds(150, 150, 200, 30);
		frame.add(tyear);

		// create a scroll bar for showing genres
		scroll = new JScrollPane(tgenre);
		scroll.setBounds(150, 200, 200, 30);
		tgenre.setLineWrap(true);
		tgenre.setWrapStyleWord(true);
		frame.add(scroll);

		tdirector.setBounds(150, 250, 200, 30);
		frame.add(tdirector);

		// create a scroll bar for showing cast
		scroll = new JScrollPane(tcast);
		scroll.setBounds(150, 300, 200, 30);
		tcast.setLineWrap(true);
		tcast.setWrapStyleWord(true);
		frame.add(scroll);

		ttv.setBounds(150, 350, 30, 30);
		frame.add(ttv);
		btnSave.setBounds(250, 350, 100, 30);
		frame.add(btnSave);

		frame.getContentPane().setLayout(null); // use absolute layout
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // dispose only this frame when closed
		frame.setSize(400, 500);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	// getters and setters
	public JTextField gettTitle() {
		return tTitle;
	}

	public void settTitle(JTextField tTitle) {
		this.tTitle = tTitle;
	}

	public JTextArea getTdescription() {
		return tdescription;
	}

	public void setTdescription(JTextArea tdescription) {
		this.tdescription = tdescription;
	}

	public JTextField getTyear() {
		return tyear;
	}

	public void setTyear(JTextField tyear) {
		this.tyear = tyear;
	}

	public JTextArea getTgenre() {
		return tgenre;
	}

	public void setTgenre(JTextArea tgenre) {
		this.tgenre = tgenre;
	}

	public JTextField getTdirector() {
		return tdirector;
	}

	public void setTdirector(JTextField tdirector) {
		this.tdirector = tdirector;
	}

	public JTextArea getTcast() {
		return tcast;
	}

	public void setTcast(JTextArea tcast) {
		this.tcast = tcast;
	}

	public JCheckBox getTtv() {
		return ttv;
	}

	public void setTtv(JCheckBox ttv) {
		this.ttv = ttv;
	}

	public JButton getBtnSave() {
		return btnSave;
	}

	public void setBtnSave(JButton btnSave) {
		this.btnSave = btnSave;
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

}
