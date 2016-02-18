package no.itera.lego.threads;

import no.itera.lego.model.RobotState;
import no.itera.lego.model.TwoAxisInputModel;
import no.itera.lego.util.BinaryHelper;
import no.itera.lego.util.LastState;

import java.io.IOException;
import java.net.Socket;

public class ServerSocketThread implements Runnable {

	private LastState LastState;
	private RobotState robotState;

	public ServerSocketThread(RobotState robotState, LastState LastState) {
		this.robotState = robotState;
		this.LastState = LastState;
	}

	@Override
	public void run() {
		/*try {

			int pos = s.getInputStream().read();
			while (robotState.shouldRun && pos > 0) {
				pos = s.getInputStream().read();
				if(pos != -1){
					TwoAxisInputModel inputModel = BinaryHelper.decodeByte(pos);
					LastState.setLastInputModel(inputModel);
				}
			}
			robotState.shouldRun = false;
			s.close();
		} catch (IOException e) {
			robotState.shouldRun = false;
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		robotState.latch.countDown();
	}

}
