package com.example.hexagonal.infrastructure.output.repository;

import com.example.hexagonal.infrastructure.output.entity.ObjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IObjectRepository extends JpaRepository<ObjectEntity, Long> {
}
