package com.mdb.fp.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="music_lyricist")
public class MusicLyricistO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6700522210915886084L;
	
	@Id
	@Column(name="mlid")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@NotNull
	@Column(name="mlname")
	private String name;
	
	@JsonIgnore
	@ManyToMany(mappedBy = "musicLyricists", fetch = FetchType.EAGER)
	private Set<MovieO> movies = new HashSet<MovieO>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<MovieO> getMovies() {
		return movies;
	}
	public void setMovies(Set<MovieO> movies) {
		this.movies = movies;
	}
}