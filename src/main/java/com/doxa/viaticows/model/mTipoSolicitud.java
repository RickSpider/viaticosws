/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.doxa.viaticows.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author BlackSpider
 */
@Entity
@Table (name = "tipossolicitudes")
@Data
public class mTipoSolicitud {
  
    @Id
    private long tiposolicitudid;
    private String tiposolicitud;
    
}
