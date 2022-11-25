package com.example.movieticketbooking.rest;

import com.example.movieticketbooking.entity.Theater;
import com.example.movieticketbooking.service.TheaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class TheaterController {
    private TheaterService theaterService;

    @Autowired
    public TheaterController(TheaterService theTheaterService) {
        theaterService = theTheaterService;
    }

    @GetMapping("/theaters")
    public List<Theater> findAll() {
        return theaterService.findAll();
    }

    @PostMapping("/theaters")
    public Theater add(@RequestBody Theater theater) {
        theater.setId(0);
        System.out.println(theater);
        theaterService.save(theater);
        return theater;
    }

    @DeleteMapping("theaters/{id}")
    public String deleteById(@PathVariable int id) {
        Optional<Theater> theater = theaterService.getById(id);
        theaterService.deleteById(id);
        return "theater deleted successfully";
    }

    @GetMapping("theaters/{id}")
    public Optional<Theater> getById(@PathVariable int id){
        Optional<Theater> theater = theaterService.getById(id);
        return theater;
    }

    @PutMapping("/theaters")
    public Theater updateEmployee(@RequestBody Theater theater) {
        theaterService.save(theater);
        return theater;
    }

}
