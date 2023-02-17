package com.example.hexagonal.application.mapper;

import com.example.hexagonal.application.dto.request.ObjectRequestDTO;
import com.example.hexagonal.domain.model.ObjectModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IObjectRequestMapper {
    ObjectModel toObject(ObjectRequestDTO objectRequestDTO);
}
