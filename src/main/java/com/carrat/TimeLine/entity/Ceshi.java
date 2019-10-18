package com.carrat.TimeLine.entity;

import java.lang.reflect.Array;
import java.util.ArrayList;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author DELL
 * 芒果数据库的 实体类
 */
@Document(collection = "test")
public class Ceshi {
	
	private String title;
	private String description;
	private String by;
	private String url;
	private ArrayList<String> tags;
	private String likes;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getBy() {
		return by;
	}
	public void setBy(String by) {
		this.by = by;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public ArrayList<String> getTags() {
		return tags;
	}
	public void setTags(ArrayList<String> tags) {
		this.tags = tags;
	}
	public String getLikes() {
		return likes;
	}
	public void setLikes(String likes) {
		this.likes = likes;
	}
	
	@Override
	public String toString() {
		return "cs [title=" + title + ", description=" + description + ", by=" + by + ", url=" + url + ", tags="
				+ tags + ", likes=" + likes + "]";
	}
}
