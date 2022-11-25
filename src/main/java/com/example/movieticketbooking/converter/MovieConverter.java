package com.example.movieticketbooking.converter;

import com.example.movieticketbooking.dto.MovieDTO;
import com.example.movieticketbooking.entity.Movie;
import org.modelmapper.ModelMapper;

import java.util.function.Function;

public class MovieConverter {

    public MovieDTO convertEntityToDto(Movie movie) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(modelMapper,MovieDTO.class);
    }

    public Movie convertDtoToEntity(MovieDTO movieDTO) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(movieDTO, Movie.class);
    }
}
