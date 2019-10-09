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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="music_director")
public class MusicDirectorO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6700522210915886084L;
	
	@Id
	@Column(name="mdid")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@NotNull
	@Column(name="mdname")
	private String name;
	
	@JsonIgnore
	@ManyToMany(mappedBy = "musicDirectors", fetch = FetchType.EAGER)
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
