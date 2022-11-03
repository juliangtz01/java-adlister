package model;

public class Quotes
{
    private long id;
    private Author author_id;
    private String quote;

    public Quotes(){};

    public Quotes(long id, Author author_id, String quote) {
        this.id = id;
        this.author_id = author_id;
        this.quote = quote;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Author getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(Author author_id) {
        this.author_id = author_id;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }
}
