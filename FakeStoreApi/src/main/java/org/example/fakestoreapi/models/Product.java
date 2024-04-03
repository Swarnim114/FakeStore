package org.example.fakestoreapi.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor //provide a constructor for all arguments
@Getter
@Setter
@NoArgsConstructor//provides a constructor with no arguments
public class Product {

    private Long id;
    private String title;
    private String description;
    private Double price;
    private Category category;
    private String image;
}
