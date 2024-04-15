package com.springbootentities.project.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "presentation")
public class Presentation {
    @Id
    @Column(name = "presentationID")
    private int presentationID;

    @Column(name = "presentationTopic")
    private String presentationTopic;

    @Column(name = "presentationSlides")
    private int presentationSlides;

    @Column(name = "presentationKeypoints")
    private String presentationKeypoints;
}
