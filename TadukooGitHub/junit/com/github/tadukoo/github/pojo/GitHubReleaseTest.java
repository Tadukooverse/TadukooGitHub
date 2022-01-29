package com.github.tadukoo.github.pojo;

import com.github.tadukoo.util.junit.pojo.MappedPojoTest;
import com.github.tadukoo.parsing.json.JSONArray;
import com.github.tadukoo.parsing.json.JSONArrayList;
import org.junit.jupiter.api.Test;
import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GitHubReleaseTest{
	
	private final GitHubRelease pojo = new GitHubRelease();
	
	@Test
	public void testEmptyConstructor()
			throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException{
		MappedPojoTest.assertEmptyConstructor(GitHubRelease.class);
	}
	
	@Test
	public void testPojoConstructor()
			throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException{
		MappedPojoTest.assertPojoConstructor(GitHubRelease.class);
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
	public void testSetAssetsUrl(){
		MappedPojoTest.assertStringGetSetCustom(pojo, pojo::getAssetsUrl, pojo::setAssetsUrl, "assets_url");
	}
	
	@Test
	public void testSetUploadUrl(){
		MappedPojoTest.assertStringGetSetCustom(pojo, pojo::getUploadUrl, pojo::setUploadUrl, "upload_url");
	}
	
	@Test
	public void testSetTarballUrl(){
		MappedPojoTest.assertStringGetSetCustom(pojo, pojo::getTarballUrl, pojo::setTarballUrl, "tarball_url");
	}
	
	@Test
	public void testSetZipballUrl(){
		MappedPojoTest.assertStringGetSetCustom(pojo, pojo::getZipballUrl, pojo::setZipballUrl, "zipball_url");
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
	public void testSetTagName(){
		MappedPojoTest.assertStringGetSetCustom(pojo, pojo::getTagName, pojo::setTagName, "tag_name");
	}
	
	@Test
	public void testSetTargetCommitish(){
		MappedPojoTest.assertStringGetSetCustom(pojo, pojo::getTargetCommitish, pojo::setTargetCommitish, "target_commitish");
	}
	
	@Test
	public void testSetName(){
		MappedPojoTest.assertStringGetSetCustom(pojo, pojo::getName, pojo::setName, "name");
	}
	
	@Test
	public void testSetBody(){
		MappedPojoTest.assertStringGetSetCustom(pojo, pojo::getBody, pojo::setBody, "body");
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
		MappedPojoTest.assertStringGetSetCustom(pojo, pojo::getCreatedAt, pojo::setCreatedAt, "created_at");
	}
	
	@Test
	public void testSetPublishedAt(){
		MappedPojoTest.assertStringGetSetCustom(pojo, pojo::getPublishedAt, pojo::setPublishedAt, "published_at");
	}
	
	@Test
	public void testSetAuthor() throws ReflectiveOperationException{
		MappedPojoTest.assertValueGetSetCustom(pojo, pojo::getAuthor, pojo::setAuthor, "author",
				new GitHubUser(), new GitHubUser());
	}
	
	@Test
	public void testSetAssets() throws ReflectiveOperationException{
		JSONArray<GitHubReleaseAsset> assets1 = new JSONArrayList<>();
		JSONArray<GitHubReleaseAsset> assets2 = new JSONArrayList<>();
		assets2.add(new GitHubReleaseAsset());
		MappedPojoTest.assertValueGetSetCustom(pojo, pojo::getAssets, pojo::setAssets, "assets",
				assets1, assets2);
	}
}
