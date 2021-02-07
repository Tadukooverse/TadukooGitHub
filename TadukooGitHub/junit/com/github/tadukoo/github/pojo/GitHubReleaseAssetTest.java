package com.github.tadukoo.github.pojo;

import org.junit.jupiter.api.Test;
import com.github.tadukoo.util.map.MapUtil;
import com.github.tadukoo.util.pojo.AbstractMappedPojo;
import com.github.tadukoo.util.tuple.Pair;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class GitHubReleaseAssetTest{
	
	private GitHubReleaseAsset pojo = new GitHubReleaseAsset();
	
	@Test
	public void testConstructor(){
		assertTrue(pojo.getMap().isEmpty());
	}
	
	@Test
	public void testPojoConstructor(){
		pojo = new GitHubReleaseAsset(new AbstractMappedPojo(){
			@Override
			public Map<String, Object> getMap(){
				return MapUtil.createMap(Pair.of("Derp", 5), Pair.of("Test", true));
			}
		});
		Map<String, Object> map = pojo.getMap();
		assertFalse(map.isEmpty());
		assertTrue(map.containsKey("Derp"));
		assertEquals(5, map.get("Derp"));
		assertTrue(map.containsKey("Test"));
		assertTrue((Boolean) map.get("Test"));
	}
	
	@Test
	public void testSetUrl(){
		pojo.setUrl("some_test_string");
		assertEquals("some_test_string", pojo.getUrl());
	}
	
	@Test
	public void testSetBrowserDownloadUrl(){
		pojo.setBrowserDownloadUrl("some_test_string");
		assertEquals("some_test_string", pojo.getBrowserDownloadUrl());
	}
	
	@Test
	public void testSetId(){
		pojo.setId(42.0);
		assertEquals(42.0, pojo.getId());
	}
	
	@Test
	public void testSetNodeId(){
		pojo.setNodeId("some_test_string");
		assertEquals("some_test_string", pojo.getNodeId());
	}
	
	@Test
	public void testSetName(){
		pojo.setName("some_test_string");
		assertEquals("some_test_string", pojo.getName());
	}
	
	@Test
	public void testSetLabel(){
		pojo.setLabel("some_test_string");
		assertEquals("some_test_string", pojo.getLabel());
	}
	
	@Test
	public void testSetState(){
		pojo.setState("some_test_string");
		assertEquals("some_test_string", pojo.getState());
	}
	
	@Test
	public void testSetContentType(){
		pojo.setContentType("some_test_string");
		assertEquals("some_test_string", pojo.getContentType());
	}
	
	@Test
	public void testSetSize(){
		pojo.setSize(42.0);
		assertEquals(42.0, pojo.getSize());
	}
	
	@Test
	public void testSetDownloadCount(){
		pojo.setDownloadCount(42.0);
		assertEquals(42.0, pojo.getDownloadCount());
	}
	
	@Test
	public void testSetCreatedAt(){
		pojo.setCreatedAt("some_test_string");
		assertEquals("some_test_string", pojo.getCreatedAt());
	}
	
	@Test
	public void testSetUpdatedAt(){
		pojo.setUpdatedAt("some_test_string");
		assertEquals("some_test_string", pojo.getUpdatedAt());
	}
	
	@Test
	public void testSetUploader()
			throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException{
		GitHubUser user = new GitHubUser();
		pojo.setUploader(user);
		assertEquals(user, pojo.getUploader());
	}
}
