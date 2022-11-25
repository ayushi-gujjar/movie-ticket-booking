package com.example.movieticketbooking.rest;

import com.example.movieticketbooking.entity.Movie;
import com.example.movieticketbooking.entity.Show;
import com.example.movieticketbooking.entity.Theater;
import com.example.movieticketbooking.service.MovieService;
import com.example.movieticketbooking.service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ShowController {
    private ShowService showService;

    @Autowired
    public ShowController(ShowService theShowService) {
        showService = theShowService;
    }

    @GetMapping("/shows")
    public List<Show> findAll() {
        System.out.println("In sow controller");
        return showService.findAll();
    }

    @PostMapping("/shows")
    public Show add(@RequestBody Show show) {
        show.setId(0);
        showService.save(show);
        return show;
    }

    @DeleteMapping("shows/{id}")
    public String deleteById(@PathVariable int id) {
        Optional<Show> show = showService.findById(id);
        showService.deleteById(id);
        return "Show deleted successfully";
    }

    @GetMapping("shows/{id}")
    public Optional<Show> getById(@PathVariable int id){
        Optional<Show> show = showService.findById(id);
        return show;
    }

    @PutMapping("/shows")
    public Show updateEmployee(@RequestBody Show show) {
        showService.save(show);
        return show;
    }
}
