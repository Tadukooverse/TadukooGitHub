package com.github.tadukoo.github.releases;

import com.github.tadukoo.github.pojo.GitHubReleaseAsset;
import com.github.tadukoo.github.pojo.GitHubUser;
import com.github.tadukoo.web.rest.MethodType;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class GetReleaseAssetEndpointTest{
	GetReleaseAssetEndpoint endpoint = new GetReleaseAssetEndpoint(
			"Tadukooverse", "TadukooUtil", 29793060);
	
	@Test
	public void testGetURL(){
		assertEquals("https://api.github.com/repos/Tadukooverse/TadukooUtil/releases/assets/29793060",
				endpoint.getURL());
	}
	
	@Test
	public void testMethodType(){
		assertEquals(MethodType.GET, endpoint.getMethodType());
	}
	
	@Test
	public void testRunGetReleaseAssetEndpoint()
			throws IOException, InterruptedException, NoSuchMethodException, InstantiationException,
			IllegalAccessException, InvocationTargetException{
		GitHubReleaseAsset asset = endpoint.runEndpoint();
		
		// Verify info directly on the release asset
		assertEquals("https://api.github.com/repos/Tadukooverse/TadukooUtil/releases/assets/29793060", asset.getUrl());
		assertEquals(29793060, asset.getId());
		assertEquals("MDEyOlJlbGVhc2VBc3NldDI5NzkzMDYw", asset.getNodeId());
		assertEquals("TadukooFunctions-0.3-Alpha.jar", asset.getName());
		assertNull(asset.getLabel());
		assertEquals("application/java-archive", asset.getContentType());
		assertEquals("uploaded", asset.getState());
		assertEquals(37026, asset.getSize());
		assertNotNull(asset.getDownloadCount());
		assertEquals("2020-12-20T00:47:26Z", asset.getCreatedAt());
		assertEquals("2020-12-20T00:47:26Z", asset.getUpdatedAt());
		assertEquals("https://github.com/Tadukooverse/TadukooUtil/releases/download/v.0.3-Alpha/" +
						"TadukooFunctions-0.3-Alpha.jar",
				asset.getBrowserDownloadUrl());
		
		// Verify the user info
		GitHubUser uploader = asset.getUploader();
		assertEquals("Tadukoo", uploader.getLogin());
		assertEquals(3397274, uploader.getId());
		assertEquals("MDQ6VXNlcjMzOTcyNzQ=", uploader.getNodeId());
		assertEquals("https://avatars.githubusercontent.com/u/3397274?v=4", uploader.getAvatarUrl());
		assertEquals("", uploader.getGravatarId());
		assertEquals("https://api.github.com/users/Tadukoo", uploader.getUrl());
		assertEquals("https://github.com/Tadukoo", uploader.getHtmlUrl());
		assertEquals("https://api.github.com/users/Tadukoo/followers", uploader.getFollowersUrl());
		assertEquals("https://api.github.com/users/Tadukoo/following{/other_user}", uploader.getFollowingUrl());
		assertEquals("https://api.github.com/users/Tadukoo/gists{/gist_id}", uploader.getGistsUrl());
		assertEquals("https://api.github.com/users/Tadukoo/starred{/owner}{/repo}", uploader.getStarredUrl());
		assertEquals("https://api.github.com/users/Tadukoo/subscriptions", uploader.getSubscriptionsUrl());
		assertEquals("https://api.github.com/users/Tadukoo/orgs", uploader.getOrganizationsUrl());
		assertEquals("https://api.github.com/users/Tadukoo/repos", uploader.getReposUrl());
		assertEquals("https://api.github.com/users/Tadukoo/events{/privacy}", uploader.getEventsUrl());
		assertEquals("https://api.github.com/users/Tadukoo/received_events", uploader.getReceivedEventsUrl());
		assertEquals("User", uploader.getType());
		assertFalse(uploader.getSiteAdmin());
	}
}
