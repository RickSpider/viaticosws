/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.doxa.viaticows.controller;

import com.doxa.viaticows.model.mSolicitud;
import com.doxa.viaticows.repository.rSolicitud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author BlackSpider
 */
public class cSolicitud {
    
    @Autowired
    private rSolicitud rsolicitud;
    
    @PostMapping("solicitud")
    public void insertarSolicitud(mSolicitud solicitud){
            
        rsolicitud.save(solicitud);
        
    }
    
    
}
