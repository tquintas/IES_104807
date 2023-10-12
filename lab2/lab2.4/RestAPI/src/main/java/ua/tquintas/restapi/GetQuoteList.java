package ua.tquintas.restapi;

import java.util.List;
public record GetQuoteList(long id, List<Quote> quoteList) { }