package com.gongdel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.gongdel.RemoteServiceStatus.FAILURE;

public class ServiceAmbassador implements RemoteServiceInterface{

	private static final Logger LOGGER = LoggerFactory.getLogger(ServiceAmbassador.class);
	private static final int RETRIES = 3;
	private static final int DELAY_MS = 3000;

	 ServiceAmbassador() {
	}

	public long deRemoteFunction(int value) {
		return safeCall(value);
	}

	private long safeCall(int value) {
		//TODO: 이어하기
		return 0;
	}
}
