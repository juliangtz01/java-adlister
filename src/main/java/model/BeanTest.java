package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BeanTest
{
    public static void main(String[] args)
    {
        List<Quotes> quotes = new ArrayList<>();

        Album thriller = new Album(1, "Michael Jackson", "Thriller",new Date(1982 - 1900, 1, 1),50.2F,"Pop, post-disco, funk, rock");

        Author douglas = new Author(1, "Douglas", "Adams");

        Quotes quote1 = new Quotes(1, douglas, "I love deadlines. I love the whooshing noise they make as they go by.");

        System.out.println(thriller.getRelease_date());

        quotes.add(quote1);

        Quotes quotes2 = new Quotes(2, douglas, "Don't Panic.");
        quotes.add(quotes2);

        Quotes quotes3 = new Quotes(3, douglas, "Time is an illusion. Lunchtime doubly so.");
        quotes.add(quotes3);

        Author mark = new Author(2, "Mark", "Twain");
        Quotes quotes4 = new Quotes(4, mark, "Clothes make the man. Naked people have little or no influence on society.");
        quotes.add(quotes4);

        Author kurt = new Author(3, "Kurt", "Vonnegut");
        Quotes quotes5 = new Quotes(5, kurt, "The universe is a big place, perhaps the biggest.");
        quotes.add(quotes5);

        for(Quotes q : quotes)
        {
            System.out.println(q.getAuthor_id().getFirst_name()+ " " + q.getAuthor_id().getLast_name() + " wrote the following quote: " + q.getQuote());
        }

    }
}
