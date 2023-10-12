package ua.tquintas.restapi;

import java.util.ArrayList;
import java.util.List;

public class ShowList {
    private static final ShowList instance = new ShowList();
    private final List<Show> showList;

    public ShowList() {
        showList = new ArrayList<Show>();
        showList.add(new Show(1, "Rebecca", 1940));
        showList.add(new Show(2, "You only live twice", 1967));
        showList.add(new Show(3, "Funny Girl", 1968));
        showList.add(new Show(4, "Young Frankenstein", 1974));
        showList.add(new Show(5, "Star Wars: Episode V - The Empire Strikes Back", 1980));
        showList.add(new Show(6, "Star Trek II: The Wrath of Khan", 1982));
        showList.add(new Show(7, "Star Wars: Return of Jedi", 1983));
        showList.add(new Show(8, "Harley Davidson and The Marlboro Man", 1991));
        showList.add(new Show(9, "A League of their Own", 1992));
        showList.add(new Show(10, "Dumb and Dumber", 1994));
        showList.add(new Show(11, "Flintstones in Viva Rock Vegas", 2000));
        showList.add(new Show(12, "The Lord of the Rings: The Two Towers", 2002));
        showList.add(new Show(13, "Old School", 2003));
        showList.add(new Show(14, "Mean Girls", 2004));
        showList.add(new Show(15, "Napoleon Dynamite", 2004));
        showList.add(new Show(16, "Batman Begins", 2005));
        showList.add(new Show(17, "OldBoy", 2005));
        showList.add(new Show(18, "The Office", 2005));
        showList.add(new Show(19, "Children Of Men", 2006));
        showList.add(new Show(20, "The Pursuit of Happyness", 2006));
        showList.add(new Show(21, "300", 2006));
        showList.add(new Show(22, "Taken", 2008));
        showList.add(new Show(23, "Fantastic Mr. Fox", 2009));
        showList.add(new Show(24, "Obsessed", 2009));
        showList.add(new Show(25, "Zombieland", 2009));
        showList.add(new Show(26, "Law Abiding Citizen", 2009));
        showList.add(new Show(27, "The Hangover", 2009));
        showList.add(new Show(28, "The Social Network", 2010));
        showList.add(new Show(29, "Megamind", 2010));
        showList.add(new Show(30, "Limitless", 2011));
        showList.add(new Show(31, "About Time", 2013));
        showList.add(new Show(32, "The Hobbit: The Battle of Five Armies", 2014));
        showList.add(new Show(33, "Rick and Morty", 2014));
        showList.add(new Show(34, "Whiplash", 2014));
        showList.add(new Show(35, "The Fault in Our Stars", 2014));
        showList.add(new Show(36, "Mad Max", 2015));
        showList.add(new Show(37, "Arrow", 2015));
        showList.add(new Show(38, "Captain America: Civil War", 2016));
        showList.add(new Show(39, "Passengers", 2016));
        showList.add(new Show(40, "Transformers : The Light Night", 2017));
        showList.add(new Show(41, "Your Name", 2017));
        showList.add(new Show(42, "Mr. Robot", 2017));
        showList.add(new Show(43, "Deadpool 2", 2018));
        showList.add(new Show(44, "Avengers: Infinity War", 2018));
        showList.add(new Show(45, "Us", 2019));
        showList.add(new Show(46, "The Good Place", 2019));
        showList.add(new Show(47, "Anna", 2019));
    }
    public static ShowList getInstance() {
        return instance;
    }

    public List<Show> getShowList() {
        return showList;
    }
}
