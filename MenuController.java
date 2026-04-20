package com.example.demo.controller;

import com.example.demo.model.menu;
import com.example.demo.repository.menuRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private menuRepo menuRepository;

    @GetMapping
    public List<menu> getMenu() {
        return menuRepository.findAll();
    }

    @PostMapping
    public menu addMenu(@RequestBody menu m) {
        return menuRepository.save(m);
    }

    @DeleteMapping("/{id}")
    public String deleteMenu(@PathVariable int id) {
        menuRepository.deleteById(id);
        return "Deleted successfully";
    }
}