package com.mdb.fp.model;

import org.springframework.data.redis.core.RedisHash;

@RedisHash("Music")
public class CachedMusic {

	private String director;
	private String lyricist;
	
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getLyricist() {
		return lyricist;
	}
	public void setLyricist(String lyricist) {
		this.lyricist = lyricist;
	}
	
}
