package ru.mirea.ikbo0819.pr2.ex1;

public class TestAuthor
{
    public static void main (String [] args)
    {
        Author author = new Author("Астафьев Виктор", "email@email.com", 'в');
        System.out.println(author);
        author.setEmail("new_email@email.com");
        System.out.println(author);
    }
}
