package com.sshubhadeep.gae.restlet;

import org.restlet.ext.json.JsonRepresentation;
import org.restlet.representation.Representation;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

public class HelloWorldJsonHandler extends ServerResource
{
@Get
public Representation represent()
	{
	String response = "{ \"success\": true, \"status\": 0, \"payload\": { \"data\" : \"Hello World!!\"  }}";
	
	return new JsonRepresentation(response);
	}
}