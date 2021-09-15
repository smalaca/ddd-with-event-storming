package com.smalaca.domain.events.id;

import java.time.LocalDate;
import java.util.UUID;

public class EventId {
    private final UUID id;
    private final UUID correlationId;
    private final LocalDate creationDate;

    private EventId(UUID id, UUID correlationId, LocalDate creationDate) {
        this.id = id;
        this.correlationId = correlationId;
        this.creationDate = creationDate;
    }

    public static EventId create() {
        return new EventId(UUID.randomUUID(), UUID.randomUUID(), LocalDate.now());
    }
}
