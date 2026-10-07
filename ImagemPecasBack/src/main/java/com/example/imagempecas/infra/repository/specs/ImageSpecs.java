package com.example.imagemPecas.infra.repository.specs;

import com.example.imagemPecas.domain.entity.Image;
import com.example.imagemPecas.domain.enums.ImageExtension;
import org.springframework.data.jpa.domain.Specification;

public class ImageSpecs {

    private ImageSpecs() {
    }

    public static Specification<Image> extensionEqual(ImageExtension extension) {
        return (root, query, criteriaBuilder) ->
                criteriaBuilder.equal(root.get("extension"), extension);
    }

    public static Specification<Image> nameLike(String name) {
        return (root, query, criteriaBuilder) ->
                criteriaBuilder.like(
                        criteriaBuilder.upper(root.get("name")),
                        "%" + name.toUpperCase() + "%"
                );
    }

    public static Specification<Image> tagsLike(String tags) {
        return (root, query, criteriaBuilder) ->
                criteriaBuilder.like(
                        criteriaBuilder.upper(root.get("tags")),
                        "%" + tags.toUpperCase() + "%"
                );
    }
}
