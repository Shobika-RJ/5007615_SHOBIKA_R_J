package com.library.repository;
import org.springframework.stereotype.Repository;
@Repository
public class BookRepository {
    public void performRepositoryTask() {
        System.out.println("Performing repository task in BookRepository.");
    }
}
