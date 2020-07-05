/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.doxa.viaticows.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author BlackSpider
 */
@Entity
@Table( name = "personas")
@Data
public class mPersona implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long personaid;
    private String nombre;
    private String apellido;
    private String ci;
    private int legajo;
    private String celtoken;
    
    @ManyToOne
    @JoinColumn(name="tipopersonaid")
    private mTipoPersona mtipopersona;
    
    
}
