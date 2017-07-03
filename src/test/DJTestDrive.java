/**
 * 
 */
package test;

import controller.BeatController;
import model.BeatModel;
import service.BeatModelInterface;
import service.ControllerInterface;

/**
 * @author alex_jd
 *
 */
public class DJTestDrive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BeatModelInterface model = new BeatModel();
		ControllerInterface controller = new BeatController(model);
	}

}
