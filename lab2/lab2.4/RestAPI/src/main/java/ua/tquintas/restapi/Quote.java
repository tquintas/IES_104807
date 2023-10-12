package ua.tquintas.restapi;

import java.util.List;

public record Quote(long id, String quote, Show show) {
    @Override
    public long id() {
        return id;
    }
}
