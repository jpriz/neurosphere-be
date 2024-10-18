package com.neurosphere.backend.controller;
import com.neurosphere.backend.entity.Location;
import com.neurosphere.backend.repository.LocationRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
public class LocationController {
    private final LocationRepository locationRepository;

    LocationController (LocationRepository repository){
        this.locationRepository = repository;
    }


    @GetMapping("/location/{id}")
    Optional<Location> one(@PathVariable UUID id) {

        return locationRepository.findById(id);
                //.orElseThrow(() -> new Exception(id + " not found"));
    }


    @PostMapping("/location")
    Optional<Location> addLocation(@RequestBody Location location){
        locationRepository.save(location);

        return Optional.empty();
    }

}
