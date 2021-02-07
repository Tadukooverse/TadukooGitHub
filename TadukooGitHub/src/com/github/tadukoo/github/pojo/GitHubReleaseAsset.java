package com.github.tadukoo.github.pojo;

import com.github.tadukoo.parsing.json.AbstractJSONClass;
import com.github.tadukoo.util.pojo.MappedPojo;

import java.lang.reflect.InvocationTargetException;

/**
 * GitHub Release Asset represents a Release Asset JSON object from GitHub's REST API.
 *
 * @author Logan Ferree (Tadukoo)
 * @version Alpha v.0.1
 */
public class GitHubReleaseAsset extends AbstractJSONClass{
	
	/**
	 * Creates a new GitHub Release Asset
	 */
	public GitHubReleaseAsset(){
		super();
	}
	
	/**
	 * Creates a new GitHub Release and uses the pojo to populate fields
	 *
	 * @param pojo The MappedPojo to use to populate fields
	 */
	public GitHubReleaseAsset(MappedPojo pojo){
		super(pojo);
	}
	
	/**
	 * @return The URL of the Release Asset
	 */
	public String getUrl(){
		return (String) getItem("url");
	}
	
	/**
	 * Sets the URL of the Release Asset
	 *
	 * @param url The URL of the Release Asset
	 */
	public void setUrl(String url){
		setItem("url", url);
	}
	
	/**
	 * @return The Browset Download URL of the Release Asset
	 */
	public String getBrowserDownloadUrl(){
		return (String) getItem("browser_download_url");
	}
	
	/**
	 * Sets the Browser Download URL of the Release Asset
	 *
	 * @param browserDownloadUrl The Browser Download URL of the Release Asset
	 */
	public void setBrowserDownloadUrl(String browserDownloadUrl){
		setItem("browser_download_url", browserDownloadUrl);
	}
	
	/**
	 * @return The ID of the Release Asset
	 */
	public Double getId(){
		return (Double) getItem("id");
	}
	
	/**
	 * Sets the ID of the Release Asset
	 *
	 * @param id The ID of the Release Asset
	 */
	public void setId(Double id){
		setItem("id", id);
	}
	
	/**
	 * @return The Node ID of the Release Asset
	 */
	public String getNodeId(){
		return (String) getItem("node_id");
	}
	
	/**
	 * Sets the Node ID of the Release Asset
	 *
	 * @param nodeId The Node ID of the Release Asset
	 */
	public void setNodeId(String nodeId){
		setItem("node_id", nodeId);
	}
	
	/**
	 * @return The name of the Release Asset
	 */
	public String getName(){
		return (String) getItem("name");
	}
	
	/**
	 * Sets the name of the Release Asset
	 *
	 * @param name The name of the Release Asset
	 */
	public void setName(String name){
		setItem("name", name);
	}
	
	/**
	 * @return The Label of the Release Asset
	 */
	public String getLabel(){
		return (String) getItem("label");
	}
	
	/**
	 * Sets the label of the Release Asset
	 *
	 * @param label The label of the Release Asset
	 */
	public void setLabel(String label){
		setItem("label", label);
	}
	
	/**
	 * @return The state of the Release Asset
	 */
	public String getState(){
		return (String) getItem("state");
	}
	
	/**
	 * Sets the state of the Release Asset
	 *
	 * @param state The state of the Release Asset
	 */
	public void setState(String state){
		setItem("state", state);
	}
	
	/**
	 * @return The content type of the Release Asset
	 */
	public String getContentType(){
		return (String) getItem("content_type");
	}
	
	/**
	 * Sets the content type of the Release Asset
	 *
	 * @param contentType The content type of the Release Asset
	 */
	public void setContentType(String contentType){
		setItem("content_type", contentType);
	}
	
	/**
	 * @return The size of the Release Asset
	 */
	public Double getSize(){
		return (Double) getItem("size");
	}
	
	/**
	 * Sets the size of the Release Asset
	 *
	 * @param size The size of the Release Asset
	 */
	public void setSize(Double size){
		setItem("size", size);
	}
	
	/**
	 * @return The download count of the Release Asset
	 */
	public Double getDownloadCount(){
		return (Double) getItem("download_count");
	}
	
	/**
	 * Sets the download count of the Release Asset
	 *
	 * @param downloadCount The download count of the Release Asset
	 */
	public void setDownloadCount(Double downloadCount){
		setItem("download_count", downloadCount);
	}
	
	/**
	 * @return When the Release Asset was created
	 */
	public String getCreatedAt(){
		return (String) getItem("created_at");
	}
	
	/**
	 * Sets when the Release Asset was created
	 *
	 * @param createdAt When the Release Asset was created
	 */
	public void setCreatedAt(String createdAt){
		setItem("created_at", createdAt);
	}
	
	/**
	 * @return When the Release Asset was updated
	 */
	public String getUpdatedAt(){
		return (String) getItem("updated_at");
	}
	
	/**
	 * Sets when the Release Asset was updated
	 *
	 * @param updatedAt When the Release Asset was updated
	 */
	public void setUpdatedAt(String updatedAt){
		setItem("updated_at", updatedAt);
	}
	
	/**
	 * @return The uploader of the Release Asset
	 * @throws NoSuchMethodException See {@link java.lang.reflect.Constructor#newInstance(Object...)}
	 * @throws IllegalAccessException See {@link java.lang.reflect.Constructor#newInstance(Object...)}
	 * @throws InvocationTargetException See {@link java.lang.reflect.Constructor#newInstance(Object...)}
	 * @throws InstantiationException See {@link java.lang.reflect.Constructor#newInstance(Object...)}
	 */
	public GitHubUser getUploader()
			throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException{
		return getPojoItem("uploader", GitHubUser.class);
	}
	
	/**
	 * Sets the uploader of the Release Asset
	 *
	 * @param uploader The uploader of the Release Asset
	 */
	public void setUploader(GitHubUser uploader){
		setItem("uploader", uploader);
	}
}
