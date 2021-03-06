package com.github.tadukoo.github.releases;

import com.github.tadukoo.github.pojo.GitHubReleaseAsset;
import com.github.tadukoo.github.pojo.GitHubUser;
import com.github.tadukoo.parsing.json.JSONArray;
import com.github.tadukoo.parsing.json.JSONClass;
import com.github.tadukoo.web.rest.MethodType;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ListReleaseAssetsEndpointTest{
	ListReleaseAssetsEndpoint endpoint = new ListReleaseAssetsEndpoint("Tadukooverse", "TadukooUtil",
			35532524);
	
	@Test
	public void testGetURL(){
		assertEquals("https://api.github.com/repos/Tadukooverse/TadukooUtil/releases/35532524/assets",
				endpoint.getURL());
	}
	
	@Test
	public void testMethodType(){
		assertEquals(MethodType.GET, endpoint.getMethodType());
	}
	
	@Test
	public void testRunEndpoint()
			throws IOException, InterruptedException, NoSuchMethodException, InstantiationException,
			IllegalAccessException, InvocationTargetException{
		JSONArray assets = endpoint.runEndpoint();
		assertEquals(3, assets.size());
		for(Object asset: assets.getItems()){
			// Convert the object to a Release Asset
			JSONClass clazz = (JSONClass) asset;
			GitHubReleaseAsset theAsset = new GitHubReleaseAsset(clazz);
			
			// Verify the asset based on which one it is
			long ID = theAsset.getId().longValue();
			if(ID == 29793060){
				// Tadukoo Functions jar
				assertEquals("https://api.github.com/repos/Tadukooverse/TadukooUtil/releases/assets/29793060",
						theAsset.getUrl());
				assertEquals(29793060, theAsset.getId());
				assertEquals("MDEyOlJlbGVhc2VBc3NldDI5NzkzMDYw", theAsset.getNodeId());
				assertEquals("TadukooFunctions-0.3-Alpha.jar", theAsset.getName());
				assertNull(theAsset.getLabel());
				assertEquals("application/java-archive", theAsset.getContentType());
				assertEquals("uploaded", theAsset.getState());
				assertEquals(37026, theAsset.getSize());
				assertNotNull(theAsset.getDownloadCount());
				assertEquals("2020-12-20T00:47:26Z", theAsset.getCreatedAt());
				assertEquals("2020-12-20T00:47:26Z", theAsset.getUpdatedAt());
				assertEquals("https://github.com/Tadukooverse/TadukooUtil/releases/download/v.0.3-Alpha/" +
								"TadukooFunctions-0.3-Alpha.jar",
						theAsset.getBrowserDownloadUrl());
			}else if(ID == 29793059){
				// Tadukoo Lang jar
				assertEquals("https://api.github.com/repos/Tadukooverse/TadukooUtil/releases/assets/29793059",
						theAsset.getUrl());
				assertEquals(29793059, theAsset.getId());
				assertEquals("MDEyOlJlbGVhc2VBc3NldDI5NzkzMDU5", theAsset.getNodeId());
				assertEquals("TadukooLang-0.3-Alpha.jar", theAsset.getName());
				assertNull(theAsset.getLabel());
				assertEquals("application/java-archive", theAsset.getContentType());
				assertEquals("uploaded", theAsset.getState());
				assertEquals(14597, theAsset.getSize());
				assertNotNull(theAsset.getDownloadCount());
				assertEquals("2020-12-20T00:47:26Z", theAsset.getCreatedAt());
				assertEquals("2020-12-20T00:47:26Z", theAsset.getUpdatedAt());
				assertEquals("https://github.com/Tadukooverse/TadukooUtil/releases/download/v.0.3-Alpha/" +
								"TadukooLang-0.3-Alpha.jar",
						theAsset.getBrowserDownloadUrl());
			}else if(ID == 29793058){
				// Tadukoo Util jar
				assertEquals("https://api.github.com/repos/Tadukooverse/TadukooUtil/releases/assets/29793058",
						theAsset.getUrl());
				assertEquals(29793058, theAsset.getId());
				assertEquals("MDEyOlJlbGVhc2VBc3NldDI5NzkzMDU4", theAsset.getNodeId());
				assertEquals("TadukooUtil-0.3-Alpha.jar", theAsset.getName());
				assertNull(theAsset.getLabel());
				assertEquals("application/java-archive", theAsset.getContentType());
				assertEquals("uploaded", theAsset.getState());
				assertEquals(28793, theAsset.getSize());
				assertNotNull(theAsset.getDownloadCount());
				assertEquals("2020-12-20T00:47:25Z", theAsset.getCreatedAt());
				assertEquals("2020-12-20T00:47:26Z", theAsset.getUpdatedAt());
				assertEquals("https://github.com/Tadukooverse/TadukooUtil/releases/download/v.0.3-Alpha/" +
								"TadukooUtil-0.3-Alpha.jar",
						theAsset.getBrowserDownloadUrl());
			}else{
				throw new IllegalArgumentException("Unknown Release Asset with ID: " + ID + " and name: " +
						theAsset.getName());
			}
			
			// Verify the uploader, this is the same for all 3 assets
			GitHubUser uploader = theAsset.getUploader();
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
}
