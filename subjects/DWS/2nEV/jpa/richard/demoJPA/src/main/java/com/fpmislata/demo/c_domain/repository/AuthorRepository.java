package com.fpmislata.demo.c_domain.repository;

import java.util.List;
import java.util.Optional;

import com.fpmislata.demo.c_domain.model.Author;
import com.fpmislata.demo.c_domain.model.ListWithCount;

public interface AuthorRepository {

    List<Author> findAll();

    ListWithCount<Author> findAll(Integer page, Integer size);

    List<Author> findAllByIsbn(String isbn);

    List<Author> findAllByBookId(Integer bookId);

    List<Author> findAllByIds(List<Integer> ids);

    Optional<Author> findById(Integer id);

    Optional<Author> findByName(String name);

    void save(Author author);

    void delete(Integer id);
}