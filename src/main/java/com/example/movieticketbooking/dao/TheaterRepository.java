package com.example.movieticketbooking.dao;

import com.example.movieticketbooking.entity.Theater;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheaterRepository extends JpaRepository <Theater , Integer> {

}
