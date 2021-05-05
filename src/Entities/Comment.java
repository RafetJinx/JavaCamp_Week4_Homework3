package Entities;

import java.util.ArrayList;

public class Comment {
	private String name;
	private String title;
	private String content;
	private ArrayList<String> tags;
	
	public Comment(String name, String title, String content, ArrayList<String> tags) {
		this.name = name;
		this.title = title;
		this.content = content;
		this.tags = tags;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public ArrayList<String> getTags() {
		return tags;
	}

	public void setTags(ArrayList<String> tags) {
		this.tags = tags;
	}
}
