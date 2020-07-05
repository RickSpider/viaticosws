/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.doxa.viaticows.controller;

import com.doxa.viaticows.model.mPersona;
import com.doxa.viaticows.repository.rPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author BlackSpider
 */
@RestController
//@RequestMapping("/persona")
public class cPersona {
    
    @Autowired 
    private rPersona rpersona;
    
    @GetMapping("/personas")
    public Iterable<mPersona> getPersonas(){
    
        return rpersona.findAll();
        
    }
}
