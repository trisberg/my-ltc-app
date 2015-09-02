package com.springdeveloperdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.SmartLifecycle;

public class LifecycleBean implements SmartLifecycle {

	private Logger log = LoggerFactory.getLogger(LifecycleBean.class);

	private String message = "Lattice";

	private volatile boolean running;

	public String getMessage() {
		return message;
	}

	public LifecycleBean() {
		start();
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public boolean isAutoStartup() {
		return false;
	}

	@Override
	public void stop(Runnable callback) {
		stop();
		callback.run();
	}

	@Override
	public void start() {
		running = true;
		log.info("*** START Called");
	}

	@Override
	public void stop() {
		running = false;
		log.info("*** STOP Called");
	}

	@Override
	public boolean isRunning() {
		return running;
	}

	@Override
	public int getPhase() {
		return 0;
	}
}
