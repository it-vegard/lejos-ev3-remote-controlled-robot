package no.itera.lego.model;

import java.util.concurrent.CountDownLatch;

public class RobotState {
	public boolean shouldRun;
	public CountDownLatch latch;

	public RobotState() {
		shouldRun = true;
	}
}
