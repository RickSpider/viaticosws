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
@Table(name = "tipospersonas")
@Data
public class mTipoPersona {
    
    @Id
    private long tipopersonaid;
    private String tipopersona;
    
    
}
