package com.example.hexagonal.infrastructure.configuration;

import com.example.hexagonal.domain.api.IObjectServicePort;
import com.example.hexagonal.domain.spi.IObjectPersistencePort;
import com.example.hexagonal.domain.usecase.ObjectUseCase;
import com.example.hexagonal.infrastructure.output.adapter.ObjectJpaAdapter;
import com.example.hexagonal.infrastructure.output.mapper.IObjectEntityMapper;
import com.example.hexagonal.infrastructure.output.repository.IObjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {
    private final IObjectRepository objectRepository;
    private final IObjectEntityMapper objectEntityMapper;

    @Bean
    public IObjectPersistencePort objectPersistencePort() {
        return new ObjectJpaAdapter(objectRepository, objectEntityMapper);
    }

    @Bean
    public IObjectServicePort objectServicePort() {
        return new ObjectUseCase(objectPersistencePort());
    }
}
