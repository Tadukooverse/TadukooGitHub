package com.github.tadukoo.github.pojo;

import com.github.tadukoo.parsing.json.AbstractJSONClass;
import com.github.tadukoo.util.pojo.MappedPojo;

import java.lang.reflect.InvocationTargetException;

public class GitHubReleaseAsset extends AbstractJSONClass{
	
	public GitHubReleaseAsset(){
		super();
	}
	
	public GitHubReleaseAsset(MappedPojo pojo){
		super(pojo);
	}
	
	public String getUrl(){
		return (String) getItem("url");
	}
	
	public void setUrl(String url){
		setItem("url", url);
	}
	
	public String getBrowserDownloadUrl(){
		return (String) getItem("browser_download_url");
	}
	
	public void setBrowserDownloadUrl(String browserDownloadUrl){
		setItem("browser_download_url", browserDownloadUrl);
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
	
	public String getName(){
		return (String) getItem("name");
	}
	
	public void setName(String name){
		setItem("name", name);
	}
	
	public String getLabel(){
		return (String) getItem("label");
	}
	
	public void setLabel(String label){
		setItem("label", label);
	}
	
	public String getState(){
		return (String) getItem("state");
	}
	
	public void setState(String state){
		setItem("state", state);
	}
	
	public String getContentType(){
		return (String) getItem("content_type");
	}
	
	public void setContentType(String contentType){
		setItem("content_type", contentType);
	}
	
	public Double getSize(){
		return (Double) getItem("size");
	}
	
	public void setSize(Double size){
		setItem("size", size);
	}
	
	public Double getDownloadCount(){
		return (Double) getItem("download_count");
	}
	
	public void setDownloadCount(Double downloadCount){
		setItem("download_count", downloadCount);
	}
	
	public String getCreatedAt(){
		return (String) getItem("created_at");
	}
	
	public void setCreatedAt(String createdAt){
		setItem("created_at", createdAt);
	}
	
	public String getUpdatedAt(){
		return (String) getItem("updated_at");
	}
	
	public void setUpdatedAt(String updatedAt){
		setItem("updated_at", updatedAt);
	}
	
	public GitHubUser getUploader()
			throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException{
		return getPojoItem("uploader", GitHubUser.class);
	}
	
	public void setUploader(GitHubUser uploader){
		setItem("uploader", uploader);
	}
}
