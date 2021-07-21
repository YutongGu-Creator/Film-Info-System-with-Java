package MovieApplicationController;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import MovieApplication.Atlas;
import MovieApplicationModel.Profile;
import MovieApplicationView.ProfileFrame;

public class ProfileController {
	private Atlas atlas;
	private ProfileFrame profileFrame;
	private JButton btnUser;
	private MainFrameController mainFrameController;

	public ProfileController(Atlas atlas, ProfileFrame profileFrame, MainFrameController mainFrameController) {
		this.atlas = atlas;
		this.profileFrame = profileFrame;
		this.mainFrameController = mainFrameController;
		initView();
	}

	public void initView() {
		int y = 50; // default button height 50

		for (Profile p : atlas.getProfiles()) {
			btnUser = new JButton(p.getName());
			btnUser.setBounds(50, y, 212, 68);
			profileFrame.getFrame().add(btnUser);
			btnUser.addActionListener(e -> updateMain(p));

			y += 100; // height add by 100 for every new button
		}
	}

	private void updateMain(Profile p) {
		// clear the last user's preference on mainframe
		for (JLabel t : mainFrameController.getLabels()) {
			mainFrameController.getMainFrame().getFrame().remove(t);
			mainFrameController.getMainFrame().getFrame().remove(t);
			mainFrameController.getMainFrame().getFrame().remove(t);
		}
		// update the mainframe with the chosen user's preference and refresh element on
		// the frame
		mainFrameController.initView(p);
		mainFrameController.getMainFrame().getFrame().revalidate();
		mainFrameController.getMainFrame().getFrame().repaint();
		// profileFrame closes itself at the end
		profileFrame.getFrame().dispose();
		// shows a message for the user
		JOptionPane.showMessageDialog(null, "Now using " + p.getName() + "'s profile", "Success",
				JOptionPane.INFORMATION_MESSAGE);
	}

}
