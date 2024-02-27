package com.example.demo.mappers;

import com.example.demo.dto.BookDTO;
import com.example.demo.entities.Book;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-27T09:44:10+0600",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17 (Oracle Corporation)"
)
@Component
public class BookMapperImpl implements BookMapper {

    @Override
    public Book bookDtoToBook(BookDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Book.BookBuilder book = Book.builder();

        book.title( dto.getName() );
        book.id( dto.getId() );
        book.publishedYear( dto.getPublishedYear() );
        book.isbn( dto.getIsbn() );
        book.edition( dto.getEdition() );

        return book.build();
    }

    @Override
    public BookDTO bookToBookDto(Book book) {
        if ( book == null ) {
            return null;
        }

        BookDTO.BookDTOBuilder bookDTO = BookDTO.builder();

        bookDTO.name( book.getTitle() );
        bookDTO.id( book.getId() );
        bookDTO.publishedYear( book.getPublishedYear() );
        bookDTO.isbn( book.getIsbn() );
        bookDTO.edition( book.getEdition() );

        return bookDTO.build();
    }
}
