package com.smalaca.infrastructure.persistence.springdata.trainingoffer;

import com.smalaca.domain.trainingoffer.TrainingOffer;
import com.smalaca.domain.trainingoffer.TrainingOfferId;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringDataTrainingOfferRepository extends CrudRepository<TrainingOffer, TrainingOfferId> {
}
