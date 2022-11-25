package com.example.movieticketbooking.rest;

import com.example.movieticketbooking.converter.MovieConverter;
import com.example.movieticketbooking.dto.MovieDTO;
import com.example.movieticketbooking.entity.Movie;
import com.example.movieticketbooking.service.MovieService;
import com.example.movieticketbooking.service.ShowService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class MovieController {

    private MovieService movieService;
    private ShowService showService;
    private MovieConverter movieConverter;

    @Autowired
    public MovieController(MovieService theMovieService) {
        movieService = theMovieService;
    }

    @GetMapping("/movies")
    public List<Movie> findMovies() {
        return movieService.findMovies();
//                .stream()
//                .map(this::convertEntityToDto)
//                .collect(Collectors.toList());
    }

    @PostMapping("/movies")
    public Movie addMovie(@RequestBody Movie movie) {
        movie.setId(0);
//       List<Show> shows = movie.getShows();
//       for(Show show : shows){
//           System.out.println(show);
//       }
        movieService.saveMovie(movie);
        return movie;
    }

    @DeleteMapping("movies/{id}")
    public String deleteMovie(@PathVariable int id) {
        Optional<Movie> movie = movieService.findMovieById(id);
        movieService.deleteMovieById(id);
        return "Movie deleted successfully";
    }

    @GetMapping("/movies/{id}")
    public Optional<Movie> getMovie(@PathVariable int id) {
        Optional<Movie> movie = movieService.findMovieById(id);
        return movie;
    }

    @PutMapping("/movies")
    public Movie updateEmployee(@RequestBody Movie movie) {
        movieService.saveMovie(movie);
        return  movie;
    }

    public MovieDTO convertEntityToDto(Movie movie) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(modelMapper,MovieDTO.class);
    }

    public Movie convertDtoToEntity(MovieDTO movieDTO) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(movieDTO, Movie.class);
    }
}
