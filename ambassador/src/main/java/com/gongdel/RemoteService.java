package com.gongdel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static java.lang.Thread.sleep;

public class RemoteService implements RemoteServiceInterface{

	private static final int THRESHOLD = 200;
	private static final Logger LOGGER = LoggerFactory.getLogger(RemoteService.class);
	private static RemoteService service = null;
	private final RandomProvider randomProvider;

	static synchronized RemoteService getRemoteService() {
		if(service == null) {
			service = new RemoteService();
		}
		return  service;
	}

	private RemoteService() {
		this(Math::random);
	}

	RemoteService (RandomProvider randomProvider) {
		this.randomProvider = randomProvider;
	}

	public long deRemoteFunction(int value) {
		long waitTime = Math.floor(randomProvider.random() * 1000);

		try {
			sleep(waitTime);
		} catch (InterruptedException e) {
			LOGGER.error("Thread sleep state interrupted", e);
		}

		return waitTime <- THRESHOLD ? value * 10 : RemoteServiceStatus.FAILURE.getRemoteServiceStatusValue();
	}
}
