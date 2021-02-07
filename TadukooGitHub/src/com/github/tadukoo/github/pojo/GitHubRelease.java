package com.github.tadukoo.github.pojo;

import com.github.tadukoo.parsing.json.AbstractJSONClass;
import com.github.tadukoo.parsing.json.JSONArray;
import com.github.tadukoo.util.pojo.MappedPojo;

import java.lang.reflect.InvocationTargetException;

public class GitHubRelease extends AbstractJSONClass{
	
	public GitHubRelease(){
		super();
	}
	
	public GitHubRelease(MappedPojo pojo){
		super(pojo);
	}
	
	public String getUrl(){
		return (String) getItem("url");
	}
	
	public void setUrl(String url){
		setItem("url", url);
	}
	
	public String getHtmlUrl(){
		return (String) getItem("html_url");
	}
	
	public void setHtmlUrl(String htmlUrl){
		setItem("html_url", htmlUrl);
	}
	
	public String getAssetsUrl(){
		return (String) getItem("assets_url");
	}
	
	public void setAssetsUrl(String assetsUrl){
		setItem("assets_url", assetsUrl);
	}
	
	public String getUploadUrl(){
		return (String) getItem("upload_url");
	}
	
	public void setUploadUrl(String uploadUrl){
		setItem("upload_url", uploadUrl);
	}
	
	public String getTarballUrl(){
		return (String) getItem("tarball_url");
	}
	
	public void setTarballUrl(String tarballUrl){
		setItem("tarball_url", tarballUrl);
	}
	
	public String getZipballUrl(){
		return (String) getItem("zipball_url");
	}
	
	public void setZipballUrl(String zipballUrl){
		setItem("zipball_url", zipballUrl);
	}
	
	public Double getId(){
		return (Double) getItem("id");
	}
	
	public void setId(Double id){
		setItem("id", id);
	}
	
	public String getNodeId(){
		return (String) getItem("node_id");
	}
	
	public void setNodeId(String nodeId){
		setItem("node_id", nodeId);
	}
	
	public String getTagName(){
		return (String) getItem("tag_name");
	}
	
	public void setTagName(String tagName){
		setItem("tag_name", tagName);
	}
	
	public String getTargetCommitish(){
		return (String) getItem("target_commitish");
	}
	
	public void setTargetCommitish(String targetCommitish){
		setItem("target_commitish", targetCommitish);
	}
	
	public String getName(){
		return (String) getItem("name");
	}
	
	public void setName(String name){
		setItem("name", name);
	}
	
	public String getBody(){
		return (String) getItem("body");
	}
	
	public void setBody(String body){
		setItem("body", body);
	}
	
	public boolean getDraft(){
		return (boolean) getItem("draft");
	}
	
	public void setDraft(boolean draft){
		setItem("draft", draft);
	}
	
	public boolean getPrerelease(){
		return (boolean) getItem("prerelease");
	}
	
	public void setPrerelease(boolean prerelease){
		setItem("prerelease", prerelease);
	}
	
	public String getCreatedAt(){
		return (String) getItem("created_at");
	}
	
	public void setCreatedAt(String createdAt){
		setItem("created_at", createdAt);
	}
	
	public String getPublishedAt(){
		return (String) getItem("published_at");
	}
	
	public void setPublishedAt(String publishedAt){
		setItem("published_at", publishedAt);
	}
	
	public GitHubUser getAuthor()
			throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException{
		return getPojoItem("author", GitHubUser.class);
	}
	
	public void setAuthor(GitHubUser author){
		setItem("author", author);
	}
	
	public JSONArray getAssets(){
		return (JSONArray) getItem("assets");
	}
	
	public void setAssets(JSONArray assets){
		setItem("assets", assets);
	}
}
