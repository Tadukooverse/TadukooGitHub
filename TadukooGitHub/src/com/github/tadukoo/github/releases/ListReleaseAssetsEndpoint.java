package com.github.tadukoo.github.releases;

import com.github.tadukoo.parsing.json.JSONArray;
import com.github.tadukoo.web.rest.Endpoint;
import com.github.tadukoo.web.rest.MethodType;
import com.github.tadukoo.web.rest.json.JSONArrayBodyHandler;

import java.net.http.HttpResponse;

/**
 * GitHub REST Endpoint used to get the release assets for a given release of a repository on GitHub.
 *
 * @author Logan Ferree (Tadukoo)
 * @version Alpha v.0.1
 */
public class ListReleaseAssetsEndpoint implements Endpoint<JSONArray>{
	/** The owner of the repository */
	private final String owner;
	/** The name of the repository */
	private final String repo;
	/** The ID for the release */
	private final long releaseID;
	
	/**
	 * Creates a new List Release Assets Endpoint for the given repository to and the release
	 * with the given ID
	 *
	 * @param owner The owner of the repository
	 * @param repo The name of the repository
	 * @param releaseID The ID for the release
	 */
	public ListReleaseAssetsEndpoint(String owner, String repo, long releaseID){
		this.owner = owner;
		this.repo = repo;
		this.releaseID = releaseID;
	}
	
	/** {@inheritDoc} */
	@Override
	public String getURL(){
		return "https://api.github.com/repos/" + owner + "/" + repo + "/releases/" + releaseID + "/assets";
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
