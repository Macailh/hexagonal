package com.example.hexagonal.application.handler;

import com.example.hexagonal.application.dto.request.ObjectRequestDTO;
import com.example.hexagonal.application.dto.response.ObjectResponseDTO;

import java.util.List;

public interface IObjectHandler {
    void saveObject(ObjectRequestDTO objectRequestDTO);

    List<ObjectResponseDTO> getAllObjects();
}
