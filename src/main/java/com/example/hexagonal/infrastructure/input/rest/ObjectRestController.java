package com.example.hexagonal.infrastructure.input.rest;

import com.example.hexagonal.application.dto.request.ObjectRequestDTO;
import com.example.hexagonal.application.dto.response.ObjectResponseDTO;
import com.example.hexagonal.application.handler.IObjectHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/object")
@RequiredArgsConstructor
public class ObjectRestController {
    private final IObjectHandler objectHandler;

    @PostMapping("/")
    public ResponseEntity<Void> saveObject(@RequestBody ObjectRequestDTO objectRequestDTO) {
        objectHandler.saveObject(objectRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }


    @GetMapping
    public ResponseEntity<List<ObjectResponseDTO>> getObjects() {
        return ResponseEntity.ok(objectHandler.getAllObjects());
    }
}
