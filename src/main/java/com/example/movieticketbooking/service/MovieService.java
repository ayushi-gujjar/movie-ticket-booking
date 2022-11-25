package com.example.movieticketbooking.service;

import com.example.movieticketbooking.dao.MovieRepository;
import com.example.movieticketbooking.dto.MovieDTO;
import com.example.movieticketbooking.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    private MovieRepository movieRepository;

    @Autowired
    public MovieService(MovieRepository theMovieRepo) {
        movieRepository = theMovieRepo;
    }

    public Movie saveMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    public List<Movie> findMovies() {
        return movieRepository.findAll();
    }

    public Optional<Movie> findMovieById(int id){
        return movieRepository.findById(id);
    }

    public void  deleteMovieById(int id) {
        movieRepository.deleteById(id);
    }
}
