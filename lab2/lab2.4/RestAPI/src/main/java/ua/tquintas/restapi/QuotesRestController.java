package ua.tquintas.restapi;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class QuotesRestController {
    private final AtomicLong counter = new AtomicLong();
    private final List<Show> showList = ShowList.getInstance().getShowList();
    private final List<Quote> quoteList = QuoteList.getInstance().getQuoteList();

    @GetMapping("/quote")
    public Quote randomQuote()
    {
        Random random = new Random();
        int randomIndex = random.nextInt(quoteList.size());
        return quoteList.get(randomIndex);
    }

    @GetMapping("/shows")
    public GetShowList ListOfShows()
    {
        return new GetShowList(counter.incrementAndGet(), showList);
    }

    @GetMapping("/quotes")
    public GetQuoteList ListOfQuotes(@RequestParam(value = "show", defaultValue = "1") String show_id)
    {
        return new GetQuoteList(counter.incrementAndGet(), quoteList.stream()
                .filter(item -> item.id() == Long.parseLong(show_id))
                .toList());
    }
}
