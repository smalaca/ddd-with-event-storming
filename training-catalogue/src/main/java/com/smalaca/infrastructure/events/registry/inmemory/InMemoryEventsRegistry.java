package com.smalaca.infrastructure.events.registry.inmemory;

import com.smalaca.domain.events.registry.EventsRegistry;
import com.smalaca.domain.trainingoffer.TrainingOfferAccepted;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class InMemoryEventsRegistry implements EventsRegistry {
    private final ApplicationEventPublisher publisher;

    InMemoryEventsRegistry(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public void publish(TrainingOfferAccepted trainingOfferAccepted) {
        publisher.publishEvent(trainingOfferAccepted);
    }
}
