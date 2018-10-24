/*
 * This file is generated by jOOQ.
 */
package jooq.examples.generated;


import javax.annotation.Generated;

import jooq.examples.generated.tables.Author;
import jooq.examples.generated.tables.Book;
import jooq.examples.generated.tables.BookStore;
import jooq.examples.generated.tables.BookToBookStore;
import jooq.examples.generated.tables.Language;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>JOOQDATA</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index SYS_C007366 = Indexes0.SYS_C007366;
    public static final Index SYS_C007372 = Indexes0.SYS_C007372;
    public static final Index SYS_C007376 = Indexes0.SYS_C007376;
    public static final Index SYS_C007379 = Indexes0.SYS_C007379;
    public static final Index SYS_C007363 = Indexes0.SYS_C007363;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index SYS_C007366 = Internal.createIndex("SYS_C007366", Author.AUTHOR, new OrderField[] { Author.AUTHOR.ID }, true);
        public static Index SYS_C007372 = Internal.createIndex("SYS_C007372", Book.BOOK, new OrderField[] { Book.BOOK.ID }, true);
        public static Index SYS_C007376 = Internal.createIndex("SYS_C007376", BookStore.BOOK_STORE, new OrderField[] { BookStore.BOOK_STORE.NAME }, true);
        public static Index SYS_C007379 = Internal.createIndex("SYS_C007379", BookToBookStore.BOOK_TO_BOOK_STORE, new OrderField[] { BookToBookStore.BOOK_TO_BOOK_STORE.NAME, BookToBookStore.BOOK_TO_BOOK_STORE.BOOK_ID }, true);
        public static Index SYS_C007363 = Internal.createIndex("SYS_C007363", Language.LANGUAGE, new OrderField[] { Language.LANGUAGE.ID }, true);
    }
}
