package com.example.Controllers;

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
    
    @GetMapping("/{a}/{b}")
    double add(@PathVariable double a, @PathVariable double b)
    {
        return a + b;
    }
    
}
