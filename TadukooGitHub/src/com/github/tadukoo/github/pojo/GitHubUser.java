package com.github.tadukoo.github.pojo;

import com.github.tadukoo.parsing.json.AbstractJSONClass;
import com.github.tadukoo.util.pojo.MappedPojo;

public class GitHubUser extends AbstractJSONClass{
	
	public GitHubUser(){
		super();
	}
	
	public GitHubUser(MappedPojo pojo){
		super(pojo);
	}
	
	public String getLogin(){
		return (String) getItem("login");
	}
	
	public void setLogin(String login){
		setItem("login", login);
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
	
	public String getAvatarUrl(){
		return (String) getItem("avatar_url");
	}
	
	public void setAvatarUrl(String avatarUrl){
		setItem("avatar_url", avatarUrl);
	}
	
	public String getGravatarId(){
		return (String) getItem("gravatar_id");
	}
	
	public void setGravatarId(String gravatarUrl){
		setItem("gravatar_id", gravatarUrl);
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
	
	public String getFollowersUrl(){
		return (String) getItem("followers_url");
	}
	
	public void setFollowersUrl(String followersUrl){
		setItem("followers_url", followersUrl);
	}
	
	public String getFollowingUrl(){
		return (String) getItem("following_url");
	}
	
	public void setFollowingUrl(String followingUrl){
		setItem("following_url", followingUrl);
	}
	
	public String getGistsUrl(){
		return (String) getItem("gists_url");
	}
	
	public void setGistsUrl(String gistsUrl){
		setItem("gists_url", gistsUrl);
	}
	
	public String getStarredUrl(){
		return (String) getItem("starred_url");
	}
	
	public void setStarredUrl(String starredUrl){
		setItem("starred_url", starredUrl);
	}
	
	public String getSubscriptionsUrl(){
		return (String) getItem("subscriptions_url");
	}
	
	public void setSubscriptionsUrl(String subscriptionsUrl){
		setItem("subscriptions_url", subscriptionsUrl);
	}
	
	public String getOrganizationsUrl(){
		return (String) getItem("organizations_url");
	}
	
	public void setOrganizationsUrl(String organizationsUrl){
		setItem("organizations_url", organizationsUrl);
	}
	
	public String getReposUrl(){
		return (String) getItem("repos_url");
	}
	
	public void setReposUrl(String reposUrl){
		setItem("repos_url", reposUrl);
	}
	
	public String getEventsUrl(){
		return (String) getItem("events_url");
	}
	
	public void setEventsUrl(String eventsUrl){
		setItem("events_url", eventsUrl);
	}
	
	public String getReceivedEventsUrl(){
		return (String) getItem("received_events_url");
	}
	
	public void setReceivedEventsUrl(String receivedEventsUrl){
		setItem("received_events_url", receivedEventsUrl);
	}
	
	public String getType(){
		return (String) getItem("type");
	}
	
	public void setType(String type){
		setItem("type", type);
	}
	
	public boolean getSiteAdmin(){
		return (boolean) getItem("site_admin");
	}
	
	public void setSiteAdmin(boolean siteAdmin){
		setItem("site_admin", siteAdmin);
	}
}
