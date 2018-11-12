/*
 * This file is generated by jOOQ.
 */
package jooq.examples.generated.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.examples.generated.Indexes;
import jooq.examples.generated.Jooqdata;
import jooq.examples.generated.Keys;
import jooq.examples.generated.tables.records.BookStoreRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BookStore extends TableImpl<BookStoreRecord> {

    private static final long serialVersionUID = 1647583775;

    /**
     * The reference instance of <code>JOOQDATA.BOOK_STORE</code>
     */
    public static final BookStore BOOK_STORE = new BookStore();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BookStoreRecord> getRecordType() {
        return BookStoreRecord.class;
    }

    /**
     * The column <code>JOOQDATA.BOOK_STORE.NAME</code>.
     */
    public final TableField<BookStoreRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR(400).nullable(false), this, "");

    /**
     * Create a <code>JOOQDATA.BOOK_STORE</code> table reference
     */
    public BookStore() {
        this(DSL.name("BOOK_STORE"), null);
    }

    /**
     * Create an aliased <code>JOOQDATA.BOOK_STORE</code> table reference
     */
    public BookStore(String alias) {
        this(DSL.name(alias), BOOK_STORE);
    }

    /**
     * Create an aliased <code>JOOQDATA.BOOK_STORE</code> table reference
     */
    public BookStore(Name alias) {
        this(alias, BOOK_STORE);
    }

    private BookStore(Name alias, Table<BookStoreRecord> aliased) {
        this(alias, aliased, null);
    }

    private BookStore(Name alias, Table<BookStoreRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> BookStore(Table<O> child, ForeignKey<O, BookStoreRecord> key) {
        super(child, key, BOOK_STORE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Jooqdata.JOOQDATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.SYS_C008012);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<BookStoreRecord>> getKeys() {
        return Arrays.<UniqueKey<BookStoreRecord>>asList(Keys.SYS_C008012);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookStore as(String alias) {
        return new BookStore(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookStore as(Name alias) {
        return new BookStore(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public BookStore rename(String name) {
        return new BookStore(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public BookStore rename(Name name) {
        return new BookStore(name, null);
    }
}
