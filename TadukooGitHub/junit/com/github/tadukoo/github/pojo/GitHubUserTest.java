package com.github.tadukoo.github.pojo;

import com.github.tadukoo.util.map.MapUtil;
import com.github.tadukoo.util.pojo.AbstractMappedPojo;
import com.github.tadukoo.util.tuple.Pair;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GitHubUserTest{
	
	private GitHubUser pojo = new GitHubUser();
	
	@Test
	public void testConstructor(){
		assertTrue(pojo.getMap().isEmpty());
	}
	
	@Test
	public void testPojoConstructor(){
		pojo = new GitHubUser(new AbstractMappedPojo(){
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
	public void testSetLogin(){
		pojo.setLogin("some_test_string");
		assertEquals("some_test_string", pojo.getLogin());
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
	public void testSetAvatarUrl(){
		pojo.setAvatarUrl("some_test_string");
		assertEquals("some_test_string", pojo.getAvatarUrl());
	}
	
	@Test
	public void testSetGravatarUrl(){
		pojo.setGravatarId("some_test_string");
		assertEquals("some_test_string", pojo.getGravatarId());
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
	public void testSetFollowersUrl(){
		pojo.setFollowersUrl("some_test_string");
		assertEquals("some_test_string", pojo.getFollowersUrl());
	}
	
	@Test
	public void testSetFollowingUrl(){
		pojo.setFollowingUrl("some_test_string");
		assertEquals("some_test_string", pojo.getFollowingUrl());
	}
	
	@Test
	public void testSetGistsUrl(){
		pojo.setGistsUrl("some_test_string");
		assertEquals("some_test_string", pojo.getGistsUrl());
	}
	
	@Test
	public void testSetStarredUrl(){
		pojo.setStarredUrl("some_test_string");
		assertEquals("some_test_string", pojo.getStarredUrl());
	}
	
	@Test
	public void testSetSubscriptionsUrl(){
		pojo.setSubscriptionsUrl("some_test_string");
		assertEquals("some_test_string", pojo.getSubscriptionsUrl());
	}
	
	@Test
	public void testSetOrganizationsUrl(){
		pojo.setOrganizationsUrl("some_test_string");
		assertEquals("some_test_string", pojo.getOrganizationsUrl());
	}
	
	@Test
	public void testSetReposUrl(){
		pojo.setReposUrl("some_test_string");
		assertEquals("some_test_string", pojo.getReposUrl());
	}
	
	@Test
	public void testSetEventsUrl(){
		pojo.setEventsUrl("some_test_string");
		assertEquals("some_test_string", pojo.getEventsUrl());
	}
	
	@Test
	public void testSetReceivedEventsUrl(){
		pojo.setReceivedEventsUrl("some_test_string");
		assertEquals("some_test_string", pojo.getReceivedEventsUrl());
	}
	
	@Test
	public void testSetType(){
		pojo.setType("some_test_string");
		assertEquals("some_test_string", pojo.getType());
	}
	
	@Test
	public void testSetSiteAdmin(){
		pojo.setSiteAdmin(true);
		assertTrue(pojo.getSiteAdmin());
	}
}
