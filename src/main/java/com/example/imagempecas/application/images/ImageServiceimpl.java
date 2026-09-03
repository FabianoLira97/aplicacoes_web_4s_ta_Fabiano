package com.example.imagempecas.application.images;

import com.example.imagempecas.domain.entity.Image;
import com.example.imagempecas.domain.service.ImageService;
import com.example.imagempecas.infra.repository.ImageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor


public class ImageServiceimpl implements ImageService {

  private final ImageRepository repository;
    @Override
    @Transactional
    public Image save(Image image) {
        return repository.save(image);
    }
}
