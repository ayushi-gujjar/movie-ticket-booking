package com.example.movieticketbooking.service;

import com.example.movieticketbooking.dao.MovieRepository;
import com.example.movieticketbooking.dao.ShowRepository;
import com.example.movieticketbooking.entity.Movie;
import com.example.movieticketbooking.entity.Show;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShowService {

    private ShowRepository showRepository;

    @Autowired
    public ShowService(ShowRepository theShowRepository) {
        showRepository = theShowRepository;
    }

    public Show save(Show show) {
        return showRepository.save(show);
    }

    public List<Show> findAll() {
        return showRepository.findAll();
    }

    public Optional<Show> findById(int id){
        return showRepository.findById(id);
    }

    public void deleteById(int id) {
        showRepository.deleteById(id);
    }
}
