package com.docker.sample.config;

import com.docker.sample.service.HostInfos;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {

	public JerseyConfig() {
		register(HostInfos.class);
	}

}