package com.github.tadukoo.github.releases;

import com.github.tadukoo.github.pojo.GitHubRelease;
import com.github.tadukoo.web.rest.Endpoint;
import com.github.tadukoo.web.rest.MethodType;
import com.github.tadukoo.web.rest.json.JSONClassBodyHandler;

import java.net.http.HttpResponse;

/**
 * GitHub REST Endpoint used to get a release for a given repository and tag on GitHub.
 *
 * @author Logan Ferree (Tadukoo)
 * @version Alpha v.0.1
 */
public class GetReleaseByTagEndpoint implements Endpoint<GitHubRelease>{
	/** The owner of the repository */
	private final String owner;
	/** The name of the repository */
	private final String repo;
	/** The tag for the release */
	private final String tag;
	
	/**
	 * Creates a new Get Release By Tag Endpoint for the given repository to grab the release
	 * with the given tag
	 *
	 * @param owner The owner of the repository
	 * @param repo The name of the repository
	 * @param tag The tag for the release
	 */
	public GetReleaseByTagEndpoint(String owner, String repo, String tag){
		this.owner = owner;
		this.repo = repo;
		this.tag = tag;
	}
	
	/** {@inheritDoc} */
	@Override
	public String getURL(){
		return "https://api.github.com/repos/" + owner + "/" + repo + "/releases/tags/" + tag;
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
