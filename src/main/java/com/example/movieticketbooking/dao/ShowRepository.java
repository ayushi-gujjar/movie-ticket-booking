package com.example.movieticketbooking.dao;

import com.example.movieticketbooking.entity.Show;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowRepository extends JpaRepository <Show , Integer > {

}
