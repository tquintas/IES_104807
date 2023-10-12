package ua.tquintas.restapi;

import java.util.ArrayList;
import java.util.List;

public class QuoteList {
    private static final QuoteList instance = new QuoteList();
    private final List<Quote> quoteList;
    public QuoteList() {
        quoteList = new ArrayList<Quote>();
        ShowList shows = ShowList.getInstance();
        List<Show> showList = shows.getShowList();
        quoteList.add(new Quote(1, "It's gone forever, that funny young, lost look I loved won't ever come back. I killed that when I told you about Rebecca. It's gone. In a few hours, you've grown so much older.", showList.get(0)));
        quoteList.add(new Quote(2, "You only live twice:Once when you are born And once when you look death in the face", showList.get(1)));
        quoteList.add(new Quote(3, "Hello, gorgeous.", showList.get(2)));
        quoteList.add(new Quote(4, "Please! Remain in your seats, I beg you! We are not children here, we are scientists! I assure you there is nothing to fear!", showList.get(3)));
        quoteList.add(new Quote(5, "Do, or do not. There is no 'try'.", showList.get(4)));
        quoteList.add(new Quote(6, "I changed the conditions of the test. I don’t like to lose.", showList.get(5)));
        quoteList.add(new Quote(7, "It’s a trap!", showList.get(6)));
        quoteList.add(new Quote(8, "Better dead and cool then alive and uncool.", showList.get(7)));
        quoteList.add(new Quote(9, "Of course it's hard. It's supposed to be hard. If it wasn't hard, everyone would do it. The hard is what makes it great", showList.get(8)));
        quoteList.add(new Quote(10, "Yeah I called her up. She gave me a bunch of crap about me not listening to her, or something. I don't know, I wasn't really paying attention.", showList.get(9)));
        quoteList.add(new Quote(11, "Your eyes are like two big blue eyes.", showList.get(10)));
        quoteList.add(new Quote(12, "The battle of Helm's Deep is over; the battle for Middle Earth is about to begin. ", showList.get(11)));
        quoteList.add(new Quote(13, "But in the end it’s only a passing thing, this shadow, even darkness must pass.", showList.get(11)));
        quoteList.add(new Quote(14, "We're goin' streaking!", showList.get(12)));
        quoteList.add(new Quote(15, "That's why her hair is so big.  It's full of secrets.", showList.get(13)));
        quoteList.add(new Quote(16, "Nunchuck skills… bowhunting skills… computer hacking skills… Girls only want boyfriends who have great skills!", showList.get(14)));
        quoteList.add(new Quote(17, "It's not who I am underneath, but what I do that defines me", showList.get(15)));
        quoteList.add(new Quote(18, "Be it a stone or a grain of sand, in water they both sink.", showList.get(16)));
        quoteList.add(new Quote(19, "That's what she said.", showList.get(17)));
        quoteList.add(new Quote(20, "Y'know that ringing in your ears? That 'eeeeeeeeee'? That's the sound of the ear cells dying, like their swan song. Once it's gone you'll never hear that frequency again. Enjoy it while it lasts.", showList.get(18)));
        quoteList.add(new Quote(21, "Don’t ever let somebody tell you, you can’t do something. Not even me. Alright?", showList.get(19)));
        quoteList.add(new Quote(22, "This is Sparta!", showList.get(20)));
        quoteList.add(new Quote(23, "If you let my daughter go now, that'll be the end of it. I will not look for you, I will not pursue you. But if you don't, I will look for you, I will find you, and I will kill you.", showList.get(21)));
        quoteList.add(new Quote(24, "If what I think is happening is happening, it better not be.", showList.get(22)));
        quoteList.add(new Quote(25, "Didn't I tell you not to come to my house? Nobody touches my child!", showList.get(23)));
        quoteList.add(new Quote(26, "It was my bad. I was never a very good practical joker.", showList.get(24)));
        quoteList.add(new Quote(27, "Well, how carefully should I tread? Because apparently I just killed two people, and you were about to let me walk right out that door! How MISGUIDED are you? I feed you a couple of bullshit legal precedents, and there you go — you jump on it like a bitch in heat.", showList.get(25)));
        quoteList.add(new Quote(28, "What happens in vegas stays in vegas", showList.get(26)));
        quoteList.add(new Quote(29, "Whoops. Broke your 350 year old doorknob", showList.get(27)));
        quoteList.add(new Quote(30, "There's a benefit to losing: You get to learn from your mistakes.", showList.get(28)));
        quoteList.add(new Quote(31, "For a guy with a four digit IQ, I must have missed something.", showList.get(29)));
        quoteList.add(new Quote(32, "I just try to live every day as if it was the final day of my extraordinary, ordinary life.", showList.get(30)));
        quoteList.add(new Quote(33, "We're all traveling through time, together, everyday of our lives... All we can do is do our best to relish this remarkable life.", showList.get(30)));
        quoteList.add(new Quote(34, "Dragon sickness. I’ve seen it before. That look, the terrible need. It is a fierce and jealous love, Bilbo. It sent his grandfather mad.", showList.get(31)));
        quoteList.add(new Quote(35, "Nobody exists on purpose, nobody belongs anywhere, everybody's gonna die. Come watch TV?", showList.get(32)));
        quoteList.add(new Quote(36, "Were you rushing or were you dragging?", showList.get(33)));
        quoteList.add(new Quote(37, "I'm on a roller-coaster that only goes up, my friend.", showList.get(34)));
        quoteList.add(new Quote(38, "I am the scales of justice, conductor of the choir of death!", showList.get(35)));
        quoteList.add(new Quote(39, "People keeps secret computers don't", showList.get(36)));
        quoteList.add(new Quote(40, "I can do this all day!", showList.get(37)));
        quoteList.add(new Quote(41, "My dad used to say, 'If you live an ordinary life, all you'll have are ordinary stories. You have to live a life of adventure.'", showList.get(38)));
        quoteList.add(new Quote(42, "When all seems lost, a few brave souls can save everything we've ever known.", showList.get(39)));
        quoteList.add(new Quote(43, "I promise you ... No matter where we will be in this world ... I promise we will meet again.", showList.get(40)));
        quoteList.add(new Quote(44, "When we lose our principles, we invite chaos.", showList.get(41)));
        quoteList.add(new Quote(45, "You’re so dark! Are you sure you’re not from the DC universe? I love dubstep!", showList.get(42)));
        quoteList.add(new Quote(46, "The hardest choices require the strongest wills", showList.get(43)));
        quoteList.add(new Quote(47, "If you want to get crazy. We can get crazy.", showList.get(44)));
        quoteList.add(new Quote(48, "Time means nothing. Jeremy Bearimy, baby. We’ll just get through this. And then you and I can chill out in the dot of the I forever.", showList.get(45)));
        quoteList.add(new Quote(49, "What do you want most in the world?", showList.get(46)));
        quoteList.add(new Quote(50, "I didn't know if you were lost. Stick with me. I'll keep you safe.", showList.get(44)));
    }
    public static QuoteList getInstance() {
        return instance;
    }

    public List<Quote> getQuoteList() {
        return quoteList;
    }
}
