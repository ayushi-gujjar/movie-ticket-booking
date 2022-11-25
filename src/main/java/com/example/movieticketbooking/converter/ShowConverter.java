package com.example.movieticketbooking.converter;

import com.example.movieticketbooking.dto.ShowDTO;
import com.example.movieticketbooking.entity.Show;
import org.modelmapper.ModelMapper;

public class ShowConverter {
    public ShowDTO convertEntityToDto(Show show) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(show, ShowDTO.class);
    }

    public Show convertDtoToEntity(ShowDTO showDTO) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(showDTO, Show.class);
    }
}
