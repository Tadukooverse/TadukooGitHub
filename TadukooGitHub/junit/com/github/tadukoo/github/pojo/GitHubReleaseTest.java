package com.github.tadukoo.github.pojo;

import com.github.tadukoo.parsing.json.AbstractJSONArray;
import com.github.tadukoo.parsing.json.JSONArray;
import com.github.tadukoo.util.ListUtil;
import org.junit.jupiter.api.Test;
import com.github.tadukoo.util.map.MapUtil;
import com.github.tadukoo.util.pojo.AbstractMappedPojo;
import com.github.tadukoo.util.tuple.Pair;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class GitHubReleaseTest{
	
	private GitHubRelease pojo = new GitHubRelease();
	
	@Test
	public void testConstructor(){
		assertTrue(pojo.getMap().isEmpty());
	}
	
	@Test
	public void testPojoConstructor(){
		pojo = new GitHubRelease(new AbstractMappedPojo(){
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
	public void testSetHtmlUrl(){
		pojo.setHtmlUrl("some_test_string");
		assertEquals("some_test_string", pojo.getHtmlUrl());
	}
	
	@Test
	public void testSetAssetsUrl(){
		pojo.setAssetsUrl("some_test_string");
		assertEquals("some_test_string", pojo.getAssetsUrl());
	}
	
	@Test
	public void testSetUploadUrl(){
		pojo.setUploadUrl("some_test_string");
		assertEquals("some_test_string", pojo.getUploadUrl());
	}
	
	@Test
	public void testSetTarballUrl(){
		pojo.setTarballUrl("some_test_string");
		assertEquals("some_test_string", pojo.getTarballUrl());
	}
	
	@Test
	public void testSetZipballUrl(){
		pojo.setZipballUrl("some_test_string");
		assertEquals("some_test_string", pojo.getZipballUrl());
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
	public void testSetTagName(){
		pojo.setTagName("some_test_string");
		assertEquals("some_test_string", pojo.getTagName());
	}
	
	@Test
	public void testSetTargetCommitish(){
		pojo.setTargetCommitish("some_test_string");
		assertEquals("some_test_string", pojo.getTargetCommitish());
	}
	
	@Test
	public void testSetName(){
		pojo.setName("some_test_string");
		assertEquals("some_test_string", pojo.getName());
	}
	
	@Test
	public void testSetBody(){
		pojo.setBody("some_test_string");
		assertEquals("some_test_string", pojo.getBody());
	}
	
	@Test
	public void testSetDraft(){
		pojo.setDraft(true);
		assertTrue(pojo.getDraft());
	}
	
	@Test
	public void testSetPrerelease(){
		pojo.setPrerelease(true);
		assertTrue(pojo.getPrerelease());
	}
	
	@Test
	public void testSetCreatedAt(){
		pojo.setCreatedAt("some_test_string");
		assertEquals("some_test_string", pojo.getCreatedAt());
	}
	
	@Test
	public void testSetPublishedAt(){
		pojo.setPublishedAt("some_test_string");
		assertEquals("some_test_string", pojo.getPublishedAt());
	}
	
	@Test
	public void testSetAuthor()
			throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException{
		GitHubUser user = new GitHubUser();
		pojo.setAuthor(user);
		assertEquals(user, pojo.getAuthor());
	}
	
	@Test
	public void testSetAssets(){
		JSONArray array = new AbstractJSONArray(new ArrayList<>()){
			@Override
			public List<Object> getItems(){
				return ListUtil.createList(new GitHubReleaseAsset());
			}
		};
		pojo.setAssets(array);
		assertEquals(array, pojo.getAssets());
	}
}
