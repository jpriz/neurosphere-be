package com.neurosphere.backend.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.Entity;


import java.io.Serializable;
import java.util.UUID;

@Entity
@Getter @Setter @NoArgsConstructor
public class Location implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.UUID)
    private UUID id;
    private String name;
    private String mapsLink;
    private String website;
    private String description;
    private double latitude;
    private double longitude;
}
