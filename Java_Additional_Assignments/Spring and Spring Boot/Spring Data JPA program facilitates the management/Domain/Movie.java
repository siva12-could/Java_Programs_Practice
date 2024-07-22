package com.springboot.Domain;

import javax.persistence.*;

//Fill your code here
@Entity
@Table
public class Movie {

	//Fill your code here
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	//Fill your code here
	@Column
	private String title;

	//Fill your code here
	@Column
	private String genre;

	//Fill your code here
	@Column
	private int releaseYear;

	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Movie(Long id, String title, String genre, int releaseYear) {
		super();
		this.id = id;
		this.title = title;
		this.genre = genre;
		this.releaseYear = releaseYear;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

}
