package com.mdb.fp.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "movie")
public class MovieO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "mid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@NotNull
	@Column(name = "mname")
	private String name;

	@NotNull
	@Column(name = "rating")
	private int rating;

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "movie_actor", joinColumns = @JoinColumn(name = "movie_id", referencedColumnName = "mid"), inverseJoinColumns = @JoinColumn(name = "actor_id", referencedColumnName = "aid"))
	private Set<ActorO> actors = new HashSet<ActorO>();

	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name = "movie_mdirector", joinColumns = @JoinColumn(name = "movie_id", referencedColumnName = "mid"), inverseJoinColumns = @JoinColumn(name = "mdirector_id", referencedColumnName = "mdid"))
	private Set<MusicDirectorO> musicDirectors;

	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name = "movie_mlyricist", joinColumns = @JoinColumn(name = "movie_id", referencedColumnName = "mid"), inverseJoinColumns = @JoinColumn(name = "mlyricist_id", referencedColumnName = "mlid"))
	private Set<MusicLyricistO> musicLyricists;

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

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public Set<ActorO> getActors() {
		return actors;
	}

	public void setActors(Set<ActorO> actors) {
		this.actors = actors;
	}

	public Set<MusicDirectorO> getMusicDirectors() {
		return musicDirectors;
	}

	public void setMusicDirectors(Set<MusicDirectorO> musicDirectors) {
		this.musicDirectors = musicDirectors;
	}

	public Set<MusicLyricistO> getMusicLyricists() {
		return musicLyricists;
	}

	public void setMusicLyricists(Set<MusicLyricistO> musicLyricists) {
		this.musicLyricists = musicLyricists;
	}
}
