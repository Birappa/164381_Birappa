package com.sample.tenth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class MovieDetailsList {

	ArrayList<MovieDetails> movies;

	public MovieDetailsList() {
		super();
		if(movies==null)
			movies=new ArrayList<MovieDetails>();
	}
	
	public boolean addMovie(MovieDetails movie){
		
		return movies.add(movie);
		
	}
	
	public boolean removeMovie(MovieDetails movie){
		return movies.remove(movie);
	}
	
	public void removeAllMovies(){
		movies.clear();
		
	}
	
	public void sort(String type) {
	
		Collections.sort(movies, new Comparator<MovieDetails>() {

			@Override
			public int compare(MovieDetails arg0, MovieDetails arg1) {
				
				if(type.equals("genre"))
					return arg0.getGenre().compareTo(arg1.getGenre());
				else if(type.equals("leadActor"))
					return arg0.getLeadActor().compareTo(arg1.getLeadActor());
				else if(type.equals("leadActories"))
					return arg0.getLeadActories().compareTo(arg1.getLeadActories());
				else
					return arg0.getMovieName().compareTo(arg1.getMovieName());
					
			}
		});
	}
	
	
	public String findMovieByMovieName(String movieName){
		
		Iterator<MovieDetails> iterator= movies.iterator();
		
		while(iterator.hasNext()){
			
			MovieDetails movieDetail=iterator.next();
			if(movieName.equals(movieDetail.getMovieName()))
				return movieDetail.toString();
		}
		return null;
	}
	
public String findMovieByGenre(String genre){
		
		Iterator<MovieDetails> iterator= movies.iterator();
		String allMovies="";
		while(iterator.hasNext()){
			MovieDetails movieDetail=iterator.next();
			if(genre.equals(movieDetail.getGenre()))
				allMovies+="\n"+ movieDetail.toString()+"\n";
		}
		return allMovies;
	}
	
	public void display() {

		Iterator<MovieDetails> iterator= movies.iterator();
	
		while(iterator.hasNext()){
			MovieDetails movieDetail=iterator.next();
			System.out.println(movieDetail.toString()+"\n");
		}
	}
}