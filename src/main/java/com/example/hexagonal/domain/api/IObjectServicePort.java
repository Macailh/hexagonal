package com.example.hexagonal.domain.api;

import com.example.hexagonal.domain.model.ObjectModel;

import java.util.List;

public interface IObjectServicePort {
    void saveObject(ObjectModel objectModel);

    List<ObjectModel> getAllObjects();
}
