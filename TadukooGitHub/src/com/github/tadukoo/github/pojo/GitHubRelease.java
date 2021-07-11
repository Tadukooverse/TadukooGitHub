package com.github.tadukoo.github.pojo;

import com.github.tadukoo.parsing.json.AbstractJSONClass;
import com.github.tadukoo.parsing.json.JSONArray;
import com.github.tadukoo.util.pojo.MappedPojo;

import java.lang.reflect.InvocationTargetException;

/**
 * GitHub Release represents a Release JSON object from GitHub's REST API.
 *
 * @author Logan Ferree (Tadukoo)
 * @version Alpha v.0.1
 */
public class GitHubRelease extends AbstractJSONClass{
	
	/**
	 * Creates a new GitHub Release
	 */
	public GitHubRelease(){
		super();
	}
	
	/**
	 * Creates a new GitHub Release and uses the pojo to populate fields
	 *
	 * @param pojo The MappedPojo to use to populate fields
	 */
	@SuppressWarnings("unused")
	public GitHubRelease(MappedPojo pojo){
		super(pojo);
	}
	
	/**
	 * @return The URL for the Release
	 */
	public String getUrl(){
		return (String) getItem("url");
	}
	
	/**
	 * Sets the URL for the Release
	 *
	 * @param url The URL for the Release
	 */
	public void setUrl(String url){
		setItem("url", url);
	}
	
	/**
	 * @return The HTML URL for the Release
	 */
	public String getHtmlUrl(){
		return (String) getItem("html_url");
	}
	
	/**
	 * Sets the HTML URL for the Release
	 *
	 * @param htmlUrl The HTML URL for the Release
	 */
	public void setHtmlUrl(String htmlUrl){
		setItem("html_url", htmlUrl);
	}
	
	/**
	 * @return The Assets URL for the Release
	 */
	public String getAssetsUrl(){
		return (String) getItem("assets_url");
	}
	
	/**
	 * Sets the Assets URL for the Release
	 *
	 * @param assetsUrl The Assets URL for the Release
	 */
	public void setAssetsUrl(String assetsUrl){
		setItem("assets_url", assetsUrl);
	}
	
	/**
	 * @return The Upload URL for the Release
	 */
	public String getUploadUrl(){
		return (String) getItem("upload_url");
	}
	
	/**
	 * Sets the Upload URL for the Release
	 *
	 * @param uploadUrl The Upload URL for the Release
	 */
	public void setUploadUrl(String uploadUrl){
		setItem("upload_url", uploadUrl);
	}
	
	/**
	 * @return The Tarball URL for the Release
	 */
	public String getTarballUrl(){
		return (String) getItem("tarball_url");
	}
	
	/**
	 * Sets the Tarball URL for the Release
	 *
	 * @param tarballUrl The Tarball URL for the Release
	 */
	public void setTarballUrl(String tarballUrl){
		setItem("tarball_url", tarballUrl);
	}
	
	/**
	 * @return The Zipball URL for the Release
	 */
	public String getZipballUrl(){
		return (String) getItem("zipball_url");
	}
	
	/**
	 * Sets the Zipball URL for the Release
	 *
	 * @param zipballUrl The Zipball URL for the Release
	 */
	public void setZipballUrl(String zipballUrl){
		setItem("zipball_url", zipballUrl);
	}
	
	/**
	 * @return The ID of the Release
	 */
	public Double getId(){
		return (Double) getItem("id");
	}
	
	/**
	 * Sets the ID of the Release
	 *
	 * @param id The ID of the Release
	 */
	public void setId(Double id){
		setItem("id", id);
	}
	
	/**
	 * @return The Node ID of the Release
	 */
	public String getNodeId(){
		return (String) getItem("node_id");
	}
	
	/**
	 * Sets the Node ID of the Release
	 *
	 * @param nodeId The Node ID of the Release
	 */
	public void setNodeId(String nodeId){
		setItem("node_id", nodeId);
	}
	
	/**
	 * @return The tag name for the Release
	 */
	public String getTagName(){
		return (String) getItem("tag_name");
	}
	
	/**
	 * Sets the tag name for the Release
	 *
	 * @param tagName The tag name for the Release
	 */
	public void setTagName(String tagName){
		setItem("tag_name", tagName);
	}
	
	/**
	 * @return The target commitish for the Release
	 */
	public String getTargetCommitish(){
		return (String) getItem("target_commitish");
	}
	
	/**
	 * Sets the target commitish for the Release
	 *
	 * @param targetCommitish The target commitish for the Release
	 */
	public void setTargetCommitish(String targetCommitish){
		setItem("target_commitish", targetCommitish);
	}
	
	/**
	 * @return The name of the Release
	 */
	public String getName(){
		return (String) getItem("name");
	}
	
	/**
	 * Sets the name of the Release
	 *
	 * @param name The name of the Release
	 */
	public void setName(String name){
		setItem("name", name);
	}
	
	/**
	 * @return The body of the Release
	 */
	public String getBody(){
		return (String) getItem("body");
	}
	
	/**
	 * Sets the body of the Release
	 *
	 * @param body The body of the Release
	 */
	public void setBody(String body){
		setItem("body", body);
	}
	
	/**
	 * @return Whether the Release is a draft or not
	 */
	public boolean getDraft(){
		return (boolean) getItem("draft");
	}
	
	/**
	 * Sets whether the Release is a draft or not
	 *
	 * @param draft Whether the Release is a draft or not
	 */
	public void setDraft(boolean draft){
		setItem("draft", draft);
	}
	
	/**
	 * @return Whether the Release is a prerelease or not
	 */
	public boolean getPrerelease(){
		return (boolean) getItem("prerelease");
	}
	
	/**
	 * Sets whether the Release is a prerelease or not
	 *
	 * @param prerelease Whether the Release is a prerelease or not
	 */
	public void setPrerelease(boolean prerelease){
		setItem("prerelease", prerelease);
	}
	
	/**
	 * @return When the Release was created
	 */
	public String getCreatedAt(){
		return (String) getItem("created_at");
	}
	
	/**
	 * Sets when the Release was created
	 *
	 * @param createdAt When the Release was created
	 */
	public void setCreatedAt(String createdAt){
		setItem("created_at", createdAt);
	}
	
	/**
	 * @return When the Release was published
	 */
	public String getPublishedAt(){
		return (String) getItem("published_at");
	}
	
	/**
	 * Sets when the Release was published
	 *
	 * @param publishedAt When the Release was published
	 */
	public void setPublishedAt(String publishedAt){
		setItem("published_at", publishedAt);
	}
	
	/**
	 * @return The author of the Release
	 * @throws NoSuchMethodException See {@link java.lang.reflect.Constructor#newInstance(Object...)}
	 * @throws IllegalAccessException See {@link java.lang.reflect.Constructor#newInstance(Object...)}
	 * @throws InvocationTargetException See {@link java.lang.reflect.Constructor#newInstance(Object...)}
	 * @throws InstantiationException See {@link java.lang.reflect.Constructor#newInstance(Object...)}
	 */
	public GitHubUser getAuthor()
			throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException{
		return getPojoItem("author", GitHubUser.class);
	}
	
	/**
	 * Sets the author of the Release
	 *
	 * @param author The author of the Release
	 */
	public void setAuthor(GitHubUser author){
		setItem("author", author);
	}
	
	/**
	 * @return The {@link GitHubReleaseAsset}s of the Release (in a {@link JSONArray})
	 * @throws NoSuchMethodException See {@link java.lang.reflect.Constructor#newInstance(Object...)}
	 * @throws IllegalAccessException See {@link java.lang.reflect.Constructor#newInstance(Object...)}
	 * @throws InvocationTargetException See {@link java.lang.reflect.Constructor#newInstance(Object...)}
	 * @throws InstantiationException See {@link java.lang.reflect.Constructor#newInstance(Object...)}
	 */
	public JSONArray<GitHubReleaseAsset> getAssets()
			throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException{
		return getJSONArrayItem("assets", GitHubReleaseAsset.class);
	}
	
	/**
	 * Sets the {@link GitHubReleaseAsset}s of the Release
	 *
	 * @param assets The {@link GitHubReleaseAsset}s of the Release (in a {@link JSONArray})
	 */
	public void setAssets(JSONArray<GitHubReleaseAsset> assets){
		setItem("assets", assets);
	}
}
