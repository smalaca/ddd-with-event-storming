package com.smalaca.domain.events.registry;

import com.smalaca.domain.trainingoffer.TrainingOfferAccepted;

public interface EventsRegistry {
    void publish(TrainingOfferAccepted trainingOfferAccepted);
}
