/**
 * 
 */
package service;

/**
 * @author alex_jd
 *
 */
public interface ControllerInterface {
	void start();
	void stop();
	void increaseBPM();
	void decreaseBPM();
	void setBPM(int bpm);

}
