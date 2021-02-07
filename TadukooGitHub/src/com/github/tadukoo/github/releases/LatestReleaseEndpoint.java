package com.github.tadukoo.github.releases;

import com.github.tadukoo.github.pojo.GitHubRelease;
import com.github.tadukoo.web.rest.Endpoint;
import com.github.tadukoo.web.rest.MethodType;
import com.github.tadukoo.web.rest.json.JSONClassBodyHandler;

import java.net.http.HttpResponse;

/**
 * GitHub REST Endpoint used to get the latest release of a given repository on GitHub.
 *
 * @author Logan Ferree (Tadukoo)
 * @version Alpha v.0.1
 */
public class LatestReleaseEndpoint implements Endpoint<GitHubRelease>{
	/** The owner of the repository */
	private final String owner;
	/** The name of the repository */
	private final String repo;
	
	/**
	 * Creates a new Latest Release endpoint for the given repository
	 *
	 * @param owner The owner of the repository
	 * @param repo The name of the repository
	 */
	public LatestReleaseEndpoint(String owner, String repo){
		this.owner = owner;
		this.repo = repo;
	}
	
	/** {@inheritDoc} */
	@Override
	public String getURL(){
		return "https://api.github.com/repos/" + owner + "/" + repo + "/releases/latest";
	}
	
	/** {@inheritDoc} */
	@Override
	public MethodType getMethodType(){
		return MethodType.GET;
	}
	
	/** {@inheritDoc} */
	@Override
	public HttpResponse.BodyHandler<GitHubRelease> getBodyHandler(){
		return new JSONClassBodyHandler<>(GitHubRelease.class);
	}
}
