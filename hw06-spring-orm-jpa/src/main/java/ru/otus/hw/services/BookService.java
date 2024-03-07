package ru.otus.hw.services;

import ru.otus.hw.dto.BookDto;
import ru.otus.hw.dto.BookWithCommentsDto;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface BookService {
    Optional<BookDto> findById(long id);

    Optional<BookWithCommentsDto> findWithCommentsById(long id);

    List<BookDto> findAll();

    BookDto insert(String title, long authorId, Set<Long> genresIds);

    BookDto update(long id, String title, long authorId, Set<Long> genresIds);

    void deleteById(long id);
}
