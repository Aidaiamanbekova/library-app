package com.example.demo.mappers;

import com.example.demo.dto.BookDTO;
import com.example.demo.entities.Book;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface BookMapper {

    @Mapping(source = "name", target = "title")
    Book bookDtoToBook(BookDTO dto);

    @Mapping(target = "name", source = "title")
    BookDTO bookToBookDto(Book book);
}