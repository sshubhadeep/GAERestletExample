package com.sshubhadeep.gae.restlet;

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;


public class HelloWorldStringHandler extends ServerResource
	{
	@Get
	public String represent()
		{
		return "Hello World!";
		}
	}