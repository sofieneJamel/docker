package com.docker.sample.service;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.net.InetAddress;
import java.net.UnknownHostException;

@Component
@Path("/hostinfos")
public class HostInfos {

    @GET
    @Path("hostname")
    public String getHostName() throws UnknownHostException {
        return InetAddress.getLocalHost().getHostName();
    }


}
