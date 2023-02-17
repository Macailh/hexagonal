package com.example.hexagonal.application.mapper;

import com.example.hexagonal.application.dto.response.ObjectResponseDTO;
import com.example.hexagonal.domain.model.ObjectModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IObjectResponseMapper {
    ObjectResponseDTO toResponse(ObjectModel objectModel);

    List<ObjectResponseDTO> toResponseList(List<ObjectModel> objectModelList);
}
