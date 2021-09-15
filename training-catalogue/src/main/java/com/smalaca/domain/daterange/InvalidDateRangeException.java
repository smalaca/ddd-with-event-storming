package com.smalaca.domain.daterange;

import java.time.LocalDate;

class InvalidDateRangeException extends RuntimeException {
    private final LocalDate startDate;
    private final LocalDate endDate;

    InvalidDateRangeException(LocalDate startDate, LocalDate endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
