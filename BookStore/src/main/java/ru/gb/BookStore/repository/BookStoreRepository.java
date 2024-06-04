package ru.gb.BookStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gb.BookStore.model.Book;


public interface BookStoreRepository extends JpaRepository<Book, Long> {

}
