package com.github.tadukoo.github.pojo;

import com.github.tadukoo.parsing.json.AbstractJSONClass;
import com.github.tadukoo.util.pojo.MappedPojo;

/**
 * GitHub User represents a User JSON object from GitHub's REST API.
 *
 * @author Logan Ferree (Tadukoo)
 * @version Alpha v.0.1
 */
public class GitHubUser extends AbstractJSONClass{
	
	/**
	 * Creates a new GitHub User
	 */
	public GitHubUser(){
		super();
	}
	
	/**
	 * Creates a new GitHub Release and uses the pojo to populate fields
	 *
	 * @param pojo The MappedPojo to use to populate fields
	 */
	@SuppressWarnings("unused")
	public GitHubUser(MappedPojo pojo){
		super(pojo);
	}
	
	/**
	 * @return The login of the User
	 */
	public String getLogin(){
		return (String) getItem("login");
	}
	
	/**
	 * Sets the login of the User
	 *
	 * @param login The login of the User
	 */
	public void setLogin(String login){
		setItem("login", login);
	}
	
	/**
	 * @return The ID of the User
	 */
	public Double getId(){
		return (Double) getItem("id");
	}
	
	/**
	 * Sets the ID of the User
	 *
	 * @param id The ID of the User
	 */
	public void setId(Double id){
		setItem("id", id);
	}
	
	/**
	 * @return The Node ID of the User
	 */
	public String getNodeId(){
		return (String) getItem("node_id");
	}
	
	/**
	 * Sets the Node ID of the User
	 *
	 * @param nodeId The Node ID of the User
	 */
	public void setNodeId(String nodeId){
		setItem("node_id", nodeId);
	}
	
	/**
	 * @return The Avatar URL of the User
	 */
	public String getAvatarUrl(){
		return (String) getItem("avatar_url");
	}
	
	/**
	 * Sets the Avatar URL of the User
	 *
	 * @param avatarUrl The Avatar URL of the User
	 */
	public void setAvatarUrl(String avatarUrl){
		setItem("avatar_url", avatarUrl);
	}
	
	/**
	 * @return The Gravatar ID of the User
	 */
	public String getGravatarId(){
		return (String) getItem("gravatar_id");
	}
	
	/**
	 * Sets the Gravatar ID of the User
	 *
	 * @param gravatarId The Gravatar ID of the User
	 */
	public void setGravatarId(String gravatarId){
		setItem("gravatar_id", gravatarId);
	}
	
	/**
	 * @return The URL of the User
	 */
	public String getUrl(){
		return (String) getItem("url");
	}
	
	/**
	 * Sets the URL of the User
	 *
	 * @param url The URL of the User
	 */
	public void setUrl(String url){
		setItem("url", url);
	}
	
	/**
	 * @return The HTML URL of the User
	 */
	public String getHtmlUrl(){
		return (String) getItem("html_url");
	}
	
	/**
	 * Sets the HTML URL of the User
	 *
	 * @param htmlUrl The HTML URL of the User
	 */
	public void setHtmlUrl(String htmlUrl){
		setItem("html_url", htmlUrl);
	}
	
	/**
	 * @return The Followers URL of the User
	 */
	public String getFollowersUrl(){
		return (String) getItem("followers_url");
	}
	
	/**
	 * Sets the Followers URL of the User
	 *
	 * @param followersUrl The Followers URL of the User
	 */
	public void setFollowersUrl(String followersUrl){
		setItem("followers_url", followersUrl);
	}
	
	/**
	 * @return The Following URL of the User
	 */
	public String getFollowingUrl(){
		return (String) getItem("following_url");
	}
	
	/**
	 * Sets the Following URL of the User
	 *
	 * @param followingUrl The Following URL of the User
	 */
	public void setFollowingUrl(String followingUrl){
		setItem("following_url", followingUrl);
	}
	
	/**
	 * @return The Gists URL of the User
	 */
	public String getGistsUrl(){
		return (String) getItem("gists_url");
	}
	
	/**
	 * Sets the Gists URL of the User
	 *
	 * @param gistsUrl The Gists URL of the User
	 */
	public void setGistsUrl(String gistsUrl){
		setItem("gists_url", gistsUrl);
	}
	
	/**
	 * @return The Starred URL of the User
	 */
	public String getStarredUrl(){
		return (String) getItem("starred_url");
	}
	
	/**
	 * Sets the Starred URL of the User
	 *
	 * @param starredUrl The Starred URL of the User
	 */
	public void setStarredUrl(String starredUrl){
		setItem("starred_url", starredUrl);
	}
	
	/**
	 * @return The Subscriptions URL of the User
	 */
	public String getSubscriptionsUrl(){
		return (String) getItem("subscriptions_url");
	}
	
	/**
	 * Sets the Subscriptions URL of the User
	 *
	 * @param subscriptionsUrl The Subscriptions URL of the User
	 */
	public void setSubscriptionsUrl(String subscriptionsUrl){
		setItem("subscriptions_url", subscriptionsUrl);
	}
	
	/**
	 * @return The Organizations URL of the User
	 */
	public String getOrganizationsUrl(){
		return (String) getItem("organizations_url");
	}
	
	/**
	 * Sets the Organizations URL of the User
	 *
	 * @param organizationsUrl The Organizations URL of the User
	 */
	public void setOrganizationsUrl(String organizationsUrl){
		setItem("organizations_url", organizationsUrl);
	}
	
	/**
	 * @return The Repos URL of the User
	 */
	public String getReposUrl(){
		return (String) getItem("repos_url");
	}
	
	/**
	 * Sets the Repos URL of the User
	 *
	 * @param reposUrl The Repos URL of the User
	 */
	public void setReposUrl(String reposUrl){
		setItem("repos_url", reposUrl);
	}
	
	/**
	 * @return The Events URL of the User
	 */
	public String getEventsUrl(){
		return (String) getItem("events_url");
	}
	
	/**
	 * Sets the Events URL of the User
	 *
	 * @param eventsUrl The Events URL of the User
	 */
	public void setEventsUrl(String eventsUrl){
		setItem("events_url", eventsUrl);
	}
	
	/**
	 * @return The Received Events URL of the User
	 */
	public String getReceivedEventsUrl(){
		return (String) getItem("received_events_url");
	}
	
	/**
	 * Sets the Received Events URL of the User
	 *
	 * @param receivedEventsUrl The Received Events URL of the User
	 */
	public void setReceivedEventsUrl(String receivedEventsUrl){
		setItem("received_events_url", receivedEventsUrl);
	}
	
	/**
	 * @return The type of the User
	 */
	public String getType(){
		return (String) getItem("type");
	}
	
	/**
	 * Sets the type of the User
	 *
	 * @param type The type of the User
	 */
	public void setType(String type){
		setItem("type", type);
	}
	
	/**
	 * @return Whether the User is a site admin or not
	 */
	public boolean getSiteAdmin(){
		return (boolean) getItem("site_admin");
	}
	
	/**
	 * Sets whether the user is a site admin or not
	 *
	 * @param siteAdmin Whether the user is a site admin or not
	 */
	public void setSiteAdmin(boolean siteAdmin){
		setItem("site_admin", siteAdmin);
	}
}
