/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.services;

import org.springframework.stereotype.Service;

/**
 *
 * @author Xlucko
 */
@Service
public class AdditionService implements AdditionServiceInterface{

    @Override
    public double add(double a, double b) {
        return a+b;
    }
    
}
