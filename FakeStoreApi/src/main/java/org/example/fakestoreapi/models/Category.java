package org.example.fakestoreapi.models;

import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Getter
@Setter
@Entity
public class Category {
    @Id
    private Long id;
    private String title;
    private String description;
}
