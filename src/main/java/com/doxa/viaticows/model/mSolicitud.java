/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.doxa.viaticows.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

/**
 *
 * @author BlackSpider
 */
@Entity
@Table (name = "Solicitudes")
@Data
public class mSolicitud {
    
    @Id
    private long solicitudid;
    
    @ManyToOne
    @JoinColumn(name="personaid")
    private mPersona mpersona;
    
    @ManyToOne
    @JoinColumn(name="tiposolicitudid")
    private mTipoSolicitud mtiposolicitud;

    @CreationTimestamp 
    @Column(updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    
    private String observacion;
    
    private boolean aprovado;
    
    private boolean rendido = false;
    
    
}
