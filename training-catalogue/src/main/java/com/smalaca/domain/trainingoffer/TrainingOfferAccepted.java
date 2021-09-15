package com.smalaca.domain.trainingoffer;

import com.smalaca.domain.events.id.EventId;

public class TrainingOfferAccepted {
    private final EventId eventId;
    private final TrainingOfferId trainingOfferId;

    private TrainingOfferAccepted(EventId eventId, TrainingOfferId trainingOfferId) {
        this.eventId = eventId;
        this.trainingOfferId = trainingOfferId;
    }

    static TrainingOfferAccepted create(TrainingOfferId trainingOfferId) {
        return new TrainingOfferAccepted(EventId.create(), trainingOfferId);
    }
}
