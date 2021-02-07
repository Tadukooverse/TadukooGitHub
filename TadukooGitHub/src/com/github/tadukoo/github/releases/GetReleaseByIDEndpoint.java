package com.github.tadukoo.github.releases;

import com.github.tadukoo.github.pojo.GitHubRelease;
import com.github.tadukoo.web.rest.Endpoint;
import com.github.tadukoo.web.rest.MethodType;
import com.github.tadukoo.web.rest.json.JSONClassBodyHandler;

import java.net.http.HttpResponse;

/**
 * GitHub REST Endpoint used to get a release for a given repository and release ID on GitHub.
 *
 * @author Logan Ferree (Tadukoo)
 * @version Alpha v.0.1
 */
public class GetReleaseByIDEndpoint implements Endpoint<GitHubRelease>{
	/** The owner of the repository */
	private final String owner;
	/** The name of the repository */
	private final String repo;
	/** The ID for the release */
	private final long releaseID;
	
	/**
	 * Creates a new Get Release By ID Endpoint for the given repository to grab the release
	 * with the given ID
	 *
	 * @param owner The owner of the repository
	 * @param repo The name of the repository
	 * @param releaseID The ID for the release
	 */
	public GetReleaseByIDEndpoint(String owner, String repo, long releaseID){
		this.owner = owner;
		this.repo = repo;
		this.releaseID = releaseID;
	}
	
	/** {@inheritDoc} */
	@Override
	public String getURL(){
		return "https://api.github.com/repos/" + owner + "/" + repo + "/releases/" + releaseID;
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
