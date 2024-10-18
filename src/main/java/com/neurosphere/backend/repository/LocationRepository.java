package com.neurosphere.backend.repository;

import com.neurosphere.backend.entity.Location;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface LocationRepository extends CrudRepository<Location, UUID> {
    Optional<Location> findById(UUID id);
    List<Location> findAll();
}
