package MovieApplicationView;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainFrame {
	private JFrame frame;
	private JButton btnNewButton;
	private JButton btnAddNew;
	private JButton btnListByYear;
	private JButton btnListByGenre;
//	private JLabel title1;
//	private JLabel title2;
//	private JLabel title3;
//	private JLabel title4;
//	private JLabel title5;
//	private JLabel year1;
//	private JLabel year2;
//	private JLabel year3;
//	private JLabel year4;
//	private JLabel year5;
//	private JLabel movieGenre1;
//	private JLabel movieGenre2;
//	private JLabel movieGenre3;
//	private JLabel movieGenre4;
//	private JLabel movieGenre5;
	private JLabel userProfile;

	public MainFrame() {

		frame = new JFrame("Video Catelogue");

		btnNewButton = new JButton("Switch Profile");
		btnAddNew = new JButton("Add New");
		btnListByYear = new JButton("List by Year");
		btnListByGenre = new JButton("List by Genre");
		// most of stuff are changed to be created dynamically
//		title1 = new JLabel("Title1");
//		title2 = new JLabel("Title2");
//		title3 = new JLabel("Title3");
//		title4 = new JLabel("Title4");
//		title5 = new JLabel("Title5");
//		year1 = new JLabel("Year1");
//		year2 = new JLabel("Year2");
//		year3 = new JLabel("Year3");
//		year4 = new JLabel("Year4");
//		year5 = new JLabel("Year5");
//		movieGenre1 = new JLabel("MovieGenre1");
//		movieGenre2 = new JLabel("MovieGenre2");
//		movieGenre3 = new JLabel("MovieGenre3");
//		movieGenre4 = new JLabel("MovieGenre4");
//		movieGenre5 = new JLabel("MovieGenre5");
		userProfile = new JLabel("User Profile");

		btnNewButton.setBounds(50, 50, 200, 60);
		frame.add(btnNewButton);
		btnAddNew.setBounds(50, 150, 200, 60);
		frame.add(btnAddNew);
		btnListByYear.setBounds(50, 250, 200, 60);
		frame.add(btnListByYear);
		btnListByGenre.setBounds(50, 350, 200, 60);
		frame.add(btnListByGenre);
//		title1.setBounds(351, 150, 200, 40);
//		frame.add(title1);
//		title2.setBounds(351, 207, 200, 40);
//		frame.add(title2);
//		title3.setBounds(351, 264, 200, 40);
//		frame.add(title3);
//		title4.setBounds(351, 321, 200, 40);
//		frame.add(title4);
//		title5.setBounds(351, 378, 200, 40);
//		frame.add(title5);
//		year1.setBounds(521, 150, 100, 40);
//		frame.add(year1);
//		year2.setBounds(521, 207, 100, 40);
//		frame.add(year2);
//		year3.setBounds(521, 264, 100, 40);
//		frame.add(year3);
//		year4.setBounds(521, 321, 100, 40);
//		frame.add(year4);
//		year5.setBounds(521, 378, 100, 40);
//		frame.add(year5);
//		movieGenre1.setBounds(784, 150, 200, 40);
//		frame.add(movieGenre1);
//		movieGenre2.setBounds(784, 207, 200, 40);
//		frame.add(movieGenre2);
//		movieGenre3.setBounds(784, 264, 200, 40);
//		frame.add(movieGenre3);
//		movieGenre4.setBounds(784, 321, 200, 40);
//		frame.add(movieGenre4);
//		movieGenre5.setBounds(784, 378, 200, 40);
//		frame.add(movieGenre5);
		userProfile.setBounds(822, 77, 200, 40);
		frame.add(userProfile);

		frame.getContentPane().setLayout(null); // use absolute layout
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit the application when closed
		frame.setSize(1100, 500);
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

	public JButton getBtnNewButton() {
		return btnNewButton;
	}

	public void setBtnNewButton(JButton btnNewButton) {
		this.btnNewButton = btnNewButton;
	}

	public JButton getBtnAddNew() {
		return btnAddNew;
	}

	public void setBtnAddNew(JButton btnAddNew) {
		this.btnAddNew = btnAddNew;
	}

	public JButton getBtnListByYear() {
		return btnListByYear;
	}

	public void setBtnListByYear(JButton btnListByYear) {
		this.btnListByYear = btnListByYear;
	}

	public JButton getBtnListByGenre() {
		return btnListByGenre;
	}

	public void setBtnListByGenre(JButton btnListByGenre) {
		this.btnListByGenre = btnListByGenre;
	}

	public JLabel getUserProfile() {
		return userProfile;
	}

	public void setUserProfile(JLabel userProfile) {
		this.userProfile = userProfile;
	}

//	public JLabel getTitle1() {
//		return title1;
//	}
//
//	public void setTitle1(JLabel title1) {
//		this.title1 = title1;
//	}
//
//	public JLabel getTitle2() {
//		return title2;
//	}
//
//	public void setTitle2(JLabel title2) {
//		this.title2 = title2;
//	}
//
//	public JLabel getTitle3() {
//		return title3;
//	}
//
//	public void setTitle3(JLabel title3) {
//		this.title3 = title3;
//	}
//
//	public JLabel getTitle4() {
//		return title4;
//	}
//
//	public void setTitle4(JLabel title4) {
//		this.title4 = title4;
//	}
//
//	public JLabel getTitle5() {
//		return title5;
//	}
//
//	public void setTitle5(JLabel title5) {
//		this.title5 = title5;
//	}
//
//	public JLabel getYear1() {
//		return year1;
//	}
//
//	public void setYear1(JLabel year1) {
//		this.year1 = year1;
//	}
//
//	public JLabel getYear2() {
//		return year2;
//	}
//
//	public void setYear2(JLabel year2) {
//		this.year2 = year2;
//	}
//
//	public JLabel getYear3() {
//		return year3;
//	}
//
//	public void setYear3(JLabel year3) {
//		this.year3 = year3;
//	}
//
//	public JLabel getYear4() {
//		return year4;
//	}
//
//	public void setYear4(JLabel year4) {
//		this.year4 = year4;
//	}
//
//	public JLabel getYear5() {
//		return year5;
//	}
//
//	public void setYear5(JLabel year5) {
//		this.year5 = year5;
//	}
//
//	public JLabel getMovieGenre1() {
//		return movieGenre1;
//	}
//
//	public void setMovieGenre1(JLabel movieGenre1) {
//		this.movieGenre1 = movieGenre1;
//	}
//
//	public JLabel getMovieGenre2() {
//		return movieGenre2;
//	}
//
//	public void setMovieGenre2(JLabel movieGenre2) {
//		this.movieGenre2 = movieGenre2;
//	}
//
//	public JLabel getMovieGenre3() {
//		return movieGenre3;
//	}
//
//	public void setMovieGenre3(JLabel movieGenre3) {
//		this.movieGenre3 = movieGenre3;
//	}
//
//	public JLabel getMovieGenre4() {
//		return movieGenre4;
//	}
//
//	public void setMovieGenre4(JLabel movieGenre4) {
//		this.movieGenre4 = movieGenre4;
//	}
//
//	public JLabel getMovieGenre5() {
//		return movieGenre5;
//	}
//
//	public void setMovieGenre5(JLabel movieGenre5) {
//		this.movieGenre5 = movieGenre5;
//	}
}
