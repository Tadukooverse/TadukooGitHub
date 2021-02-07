package com.github.tadukoo.github.releases;

import com.github.tadukoo.github.pojo.GitHubReleaseAsset;
import com.github.tadukoo.web.rest.Endpoint;
import com.github.tadukoo.web.rest.MethodType;
import com.github.tadukoo.web.rest.json.JSONClassBodyHandler;

import java.net.http.HttpResponse;

/**
 * GitHub REST Endpoint used to get a release asset for a given repository and asset ID on GitHub.
 *
 * @author Logan Ferree (Tadukoo)
 * @version Alpha v.0.1
 */
public class GetReleaseAssetEndpoint implements Endpoint<GitHubReleaseAsset>{
	/** The owner of the repository */
	private final String owner;
	/** The name of the repository */
	private final String repo;
	/** The asset ID */
	private final long assetID;
	
	/**
	 * Creates a new Get Release Asset Endpoint for the given repository and asset
	 *
	 * @param owner The owner of the repository
	 * @param repo The name of the repository
	 * @param assetID The asset ID
	 */
	public GetReleaseAssetEndpoint(String owner, String repo, long assetID){
		this.owner = owner;
		this.repo = repo;
		this.assetID = assetID;
	}
	
	/** {@inheritDoc} */
	@Override
	public String getURL(){
		return "https://api.github.com/repos/" + owner + "/" + repo + "/releases/assets/" + assetID;
	}
	
	/** {@inheritDoc} */
	@Override
	public MethodType getMethodType(){
		return MethodType.GET;
	}
	
	/** {@inheritDoc} */
	@Override
	public HttpResponse.BodyHandler<GitHubReleaseAsset> getBodyHandler(){
		return new JSONClassBodyHandler<>(GitHubReleaseAsset.class);
	}
}
