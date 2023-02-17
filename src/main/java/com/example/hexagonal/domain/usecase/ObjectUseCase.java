package com.example.hexagonal.domain.usecase;

import com.example.hexagonal.domain.api.IObjectServicePort;
import com.example.hexagonal.domain.model.ObjectModel;
import com.example.hexagonal.domain.spi.IObjectPersistencePort;

import java.util.List;

public class ObjectUseCase implements IObjectServicePort {
    private final IObjectPersistencePort objectPersistencePort;

    public ObjectUseCase(IObjectPersistencePort objectPersistencePort) {
        this.objectPersistencePort = objectPersistencePort;
    }

    @Override
    public void saveObject(ObjectModel objectModel) {
        objectPersistencePort.saveObject(objectModel);
    }

    @Override
    public List<ObjectModel> getAllObjects() {
        return objectPersistencePort.getAllObjects();
    }
}
