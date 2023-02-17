package com.example.hexagonal.infrastructure.output.adapter;

import com.example.hexagonal.domain.model.ObjectModel;
import com.example.hexagonal.domain.spi.IObjectPersistencePort;
import com.example.hexagonal.infrastructure.exception.NoDataFoundException;
import com.example.hexagonal.infrastructure.output.entity.ObjectEntity;
import com.example.hexagonal.infrastructure.output.mapper.IObjectEntityMapper;
import com.example.hexagonal.infrastructure.output.repository.IObjectRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class ObjectJpaAdapter implements IObjectPersistencePort {
    private final IObjectRepository objectRepository;
    private final IObjectEntityMapper objectEntityMapper;

    @Override
    public ObjectModel saveObject(ObjectModel objectModel) {
        ObjectEntity objectEntity = objectRepository.save(objectEntityMapper.toEntity(objectModel));
        return objectEntityMapper.toObjectModel(objectEntity);
    }

    @Override
    public List<ObjectModel> getAllObjects() {
        List<ObjectEntity> entityList = objectRepository.findAll();
        if(entityList.isEmpty()) {
            throw new NoDataFoundException();
        }
        return objectEntityMapper.toObjectModelList(entityList);
    }
}
