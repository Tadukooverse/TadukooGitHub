package com.github.tadukoo.github.pojo;

import com.github.tadukoo.junit.MappedPojoTest;
import org.junit.jupiter.api.Test;
import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GitHubUserTest{
	
	private final GitHubUser pojo = new GitHubUser();
	
	@Test
	public void testEmptyConstructor()
			throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException{
		MappedPojoTest.assertEmptyConstructor(GitHubUser.class);
	}
	
	@Test
	public void testPojoConstructor()
			throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException{
		MappedPojoTest.assertPojoConstructor(GitHubUser.class);
	}
	
	@Test
	public void testSetLogin(){
		MappedPojoTest.assertStringGetSetCustom(pojo, pojo::getLogin, pojo::setLogin, "login");
	}
	
	@Test
	public void testSetId(){
		MappedPojoTest.assertDoubleGetSetCustom(pojo, pojo::getId, pojo::setId, "id");
	}
	
	@Test
	public void testSetNodeId(){
		MappedPojoTest.assertStringGetSetCustom(pojo, pojo::getNodeId, pojo::setNodeId, "node_id");
	}
	
	@Test
	public void testSetAvatarUrl(){
		MappedPojoTest.assertStringGetSetCustom(pojo, pojo::getAvatarUrl, pojo::setAvatarUrl, "avatar_url");
	}
	
	@Test
	public void testSetGravatarId(){
		MappedPojoTest.assertStringGetSetCustom(pojo, pojo::getGravatarId, pojo::setGravatarId, "gravatar_id");
	}
	
	@Test
	public void testSetUrl(){
		MappedPojoTest.assertStringGetSetCustom(pojo, pojo::getUrl, pojo::setUrl, "url");
	}
	
	@Test
	public void testSetHtmlUrl(){
		MappedPojoTest.assertStringGetSetCustom(pojo, pojo::getHtmlUrl, pojo::setHtmlUrl, "html_url");
	}
	
	@Test
	public void testSetFollowersUrl(){
		MappedPojoTest.assertStringGetSetCustom(pojo, pojo::getFollowersUrl, pojo::setFollowersUrl, "followers_url");
	}
	
	@Test
	public void testSetFollowingUrl(){
		MappedPojoTest.assertStringGetSetCustom(pojo, pojo::getFollowingUrl, pojo::setFollowingUrl, "following_url");
	}
	
	@Test
	public void testSetGistsUrl(){
		MappedPojoTest.assertStringGetSetCustom(pojo, pojo::getGistsUrl, pojo::setGistsUrl, "gists_url");
	}
	
	@Test
	public void testSetStarredUrl(){
		MappedPojoTest.assertStringGetSetCustom(pojo, pojo::getStarredUrl, pojo::setStarredUrl, "starred_url");
	}
	
	@Test
	public void testSetSubscriptionsUrl(){
		MappedPojoTest.assertStringGetSetCustom(pojo, pojo::getSubscriptionsUrl, pojo::setSubscriptionsUrl, "subscriptions_url");
	}
	
	@Test
	public void testSetOrganizationsUrl(){
		MappedPojoTest.assertStringGetSetCustom(pojo, pojo::getOrganizationsUrl, pojo::setOrganizationsUrl, "organizations_url");
	}
	
	@Test
	public void testSetReposUrl(){
		MappedPojoTest.assertStringGetSetCustom(pojo, pojo::getReposUrl, pojo::setReposUrl, "repos_url");
	}
	
	@Test
	public void testSetEventsUrl(){
		MappedPojoTest.assertStringGetSetCustom(pojo, pojo::getEventsUrl, pojo::setEventsUrl, "events_url");
	}
	
	@Test
	public void testSetReceivedEventsUrl(){
		MappedPojoTest.assertStringGetSetCustom(pojo, pojo::getReceivedEventsUrl, pojo::setReceivedEventsUrl, "received_events_url");
	}
	
	@Test
	public void testSetType(){
		MappedPojoTest.assertStringGetSetCustom(pojo, pojo::getType, pojo::setType, "type");
	}
	
	@Test
	public void testSetSiteAdmin(){
		pojo.setSiteAdmin(true);
		assertTrue(pojo.getSiteAdmin());
	}
}
