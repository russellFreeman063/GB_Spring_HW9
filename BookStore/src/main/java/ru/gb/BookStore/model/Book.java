package ru.gb.BookStore.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "book")
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String author;

    private int publicationYear;

    private Long price;

    private int quantity;

}
