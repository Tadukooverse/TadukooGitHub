package com.github.tadukoo.github.releases;

import com.github.tadukoo.parsing.json.JSONArray;
import com.github.tadukoo.web.rest.Endpoint;
import com.github.tadukoo.web.rest.MethodType;
import com.github.tadukoo.web.rest.json.JSONArrayBodyHandler;

import java.net.http.HttpResponse;

/**
 * GitHub REST Endpoint used to get the list of releases for a given repository on GitHub.
 *
 * @author Logan Ferree (Tadukoo)
 * @version Alpha v.0.1
 */
public class ListReleasesEndpoint implements Endpoint<JSONArray>{
	/** The owner of the repository */
	private final String owner;
	/** The name of the repository */
	private final String repo;
	
	/**
	 * Creates a new List Releases endpoint for the given repository
	 *
	 * @param owner The owner of the repository
	 * @param repo The name of the repository
	 */
	public ListReleasesEndpoint(String owner, String repo){
		this.owner = owner;
		this.repo = repo;
	}
	
	/** {@inheritDoc} */
	@Override
	public String getURL(){
		return "https://api.github.com/repos/" + owner + "/" + repo + "/releases";
	}
	
	/** {@inheritDoc} */
	@Override
	public MethodType getMethodType(){
		return MethodType.GET;
	}
	
	/** {@inheritDoc} */
	@Override
	public HttpResponse.BodyHandler<JSONArray> getBodyHandler(){
		return new JSONArrayBodyHandler();
	}
}
