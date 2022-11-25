package com.example.movieticketbooking.service;

import com.example.movieticketbooking.dao.ShowRepository;
import com.example.movieticketbooking.dao.TheaterRepository;
import com.example.movieticketbooking.entity.Show;
import com.example.movieticketbooking.entity.Theater;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TheaterService {
    private TheaterRepository theaterRepository;

    @Autowired
    public TheaterService(TheaterRepository theTheaterRepository) {
        theaterRepository = theTheaterRepository;
    }

    public Theater save(Theater theater) {
        return theaterRepository.save(theater);
    }

    public List<Theater> findAll() {
        return theaterRepository.findAll();
    }

    public Optional<Theater> getById(int id){
        return theaterRepository.findById(id);
    }

    public void deleteById(int id) {
        theaterRepository.deleteById(id);
    }
}
