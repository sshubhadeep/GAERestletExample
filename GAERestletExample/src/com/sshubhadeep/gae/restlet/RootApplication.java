package com.sshubhadeep.gae.restlet;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;
import org.restlet.routing.Template;

public class RootApplication extends Application
	{
	@Override
	public Restlet createInboundRoot()
		{
		Router router = new Router(getContext());
		System.out.println("Root Called...");
		
		router.attach("/helloworldjson", HelloWorldJsonHandler.class).setMatchingMode(Template.MODE_STARTS_WITH);;
		router.attachDefault(HelloWorldStringHandler.class);

		return router;
		}
	}