/**
 * 
 */
package test;

import controller.*;
import heartModel.*;
import service.*;

/**
 * @author alex_jd
 *
 */
public class HeartTestDrive {
	public static void main(String[] args) {
		HeartModel heartModel = new HeartModel();
		ControllerInterface model = new HeartController(heartModel);
	}

}
