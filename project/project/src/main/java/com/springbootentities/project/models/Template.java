package com.springbootentities.project.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "template")
public class Template {

    @Id
    @Column(name = "templateID")
    private int templateID;

    @Column(name = "templateName")
    private String templateName;

    @Column(name = "templateThumbnail")
    private byte[] templateThumbnail;
}
