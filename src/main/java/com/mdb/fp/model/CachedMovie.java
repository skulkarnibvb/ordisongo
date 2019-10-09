package com.mdb.fp.model;

import java.util.List;

import org.springframework.data.redis.core.RedisHash;

import com.mdb.fp.model.Music;

@RedisHash("Movie")
public class CachedMovie {

	private String id;
	private String name;
	private int rating;
	private List<String> cast;
	private Music music;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public List<String> getCast() {
		return cast;
	}
	public void setCast(List<String> cast) {
		this.cast = cast;
	}
	public Music getMusic() {
		return music;
	}
	public void setMusic(Music music) {
		this.music = music;
	}
	
}
