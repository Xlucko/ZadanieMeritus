package com.example.controllers;

import com.example.services.AdditionServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Xlucko
 */
@RestController
@RequestMapping("/dodaj")
public class AdditionController {
    @Autowired
    AdditionServiceInterface additionService;
    
    @GetMapping("/{a}/{b}")
    double add(@PathVariable double a, @PathVariable double b)
    {
        return additionService.add(a,b);
    }
    
}
