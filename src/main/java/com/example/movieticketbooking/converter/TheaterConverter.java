package com.example.movieticketbooking.converter;

import com.example.movieticketbooking.dto.TheaterDTO;
import com.example.movieticketbooking.entity.Theater;
import org.modelmapper.ModelMapper;

public class TheaterConverter {
    public TheaterDTO convertEntityToDto(Theater theater) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(theater, TheaterDTO.class);
    }

    public Theater convertDtoToEntity(TheaterDTO theaterDTO) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(theaterDTO, Theater.class);
    }
}
