package MovieApplication;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

import MovieApplicationController.MainFrameController;
import MovieApplicationView.MainFrame;

public class App {
	public static void main(String[] args) {
		try {
			Atlas atlas = json2Atlas("assignment_4_data.json");
			MainFrame mainFrame = new MainFrame();
			MainFrameController mainFrameController = new MainFrameController(atlas, mainFrame);
			mainFrameController.initController();

//			Genre ge = new Genre();
//			for (Genre g: atlas.getGenres()){
//				if(g.getGenre().equals("Animation")) {
//					System.out.println("yes");
//					ge = g;
//				}
//			}
//			for (Profile p: atlas.getProfiles()){
//				if(p.getPreferredGenre() == ge) {
//					System.out.println("yes");
//				}
//			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// reads an atlas from a JSON file
	public static Atlas json2Atlas(String filename) throws Exception {
		// Jackson does all the translation between program model and data model.
		ObjectMapper mapper = new ObjectMapper();

		Atlas a = null;
		try {
			a = mapper.readValue(new File(filename), Atlas.class);
		} catch (Exception e) {
			// The write methods of ObjectMapper could throw exceptions.
			e.printStackTrace();
		}
		return a;
	}
}
