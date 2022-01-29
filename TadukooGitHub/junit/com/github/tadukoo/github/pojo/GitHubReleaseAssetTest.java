package com.github.tadukoo.github.pojo;

import com.github.tadukoo.util.junit.pojo.MappedPojoTest;
import org.junit.jupiter.api.Test;
import java.lang.reflect.InvocationTargetException;

public class GitHubReleaseAssetTest{
	
	private final GitHubReleaseAsset pojo = new GitHubReleaseAsset();
	
	@Test
	public void testEmptyConstructor()
			throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException{
		MappedPojoTest.assertEmptyConstructor(GitHubReleaseAsset.class);
	}
	
	@Test
	public void testPojoConstructor()
			throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException{
		MappedPojoTest.assertPojoConstructor(GitHubReleaseAsset.class);
	}
	
	@Test
	public void testSetUrl(){
		MappedPojoTest.assertStringGetSetCustom(pojo, pojo::getUrl, pojo::setUrl, "url");
	}
	
	@Test
	public void testSetBrowserDownloadUrl(){
		MappedPojoTest.assertStringGetSetCustom(pojo, pojo::getBrowserDownloadUrl, pojo::setBrowserDownloadUrl,
				"browser_download_url");
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
	public void testSetName(){
		MappedPojoTest.assertStringGetSetCustom(pojo, pojo::getName, pojo::setName, "name");
	}
	
	@Test
	public void testSetLabel(){
		MappedPojoTest.assertStringGetSetCustom(pojo, pojo::getLabel, pojo::setLabel, "label");
	}
	
	@Test
	public void testSetState(){
		MappedPojoTest.assertStringGetSetCustom(pojo, pojo::getState, pojo::setState, "state");
	}
	
	@Test
	public void testSetContentType(){
		MappedPojoTest.assertStringGetSetCustom(pojo, pojo::getContentType, pojo::setContentType, "content_type");
	}
	
	@Test
	public void testSetSize(){
		MappedPojoTest.assertDoubleGetSetCustom(pojo, pojo::getSize, pojo::setSize, "size");
	}
	
	@Test
	public void testSetDownloadCount(){
		MappedPojoTest.assertDoubleGetSetCustom(pojo, pojo::getDownloadCount, pojo::setDownloadCount,
				"download_count");
	}
	
	@Test
	public void testSetCreatedAt(){
		MappedPojoTest.assertStringGetSetCustom(pojo, pojo::getCreatedAt, pojo::setCreatedAt, "created_at");
	}
	
	@Test
	public void testSetUpdatedAt(){
		MappedPojoTest.assertStringGetSetCustom(pojo, pojo::getUpdatedAt, pojo::setUpdatedAt, "updated_at");
	}
	
	@Test
	public void testSetUploader() throws ReflectiveOperationException{
		MappedPojoTest.assertValueGetSetCustom(pojo, pojo::getUploader, pojo::setUploader, "uploader",
				new GitHubUser(), new GitHubUser());
	}
}
