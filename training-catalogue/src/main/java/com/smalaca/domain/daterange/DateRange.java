package com.smalaca.domain.daterange;

import java.time.LocalDate;

public class DateRange {
    private final LocalDate startDate;
    private final LocalDate endDate;

    private DateRange(LocalDate startDate, LocalDate endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public static DateRange from(LocalDate startDate, LocalDate endDate) {
        if (areValid(startDate, endDate)) {
            return new DateRange(startDate, endDate);
        }

        throw new InvalidDateRangeException(startDate, endDate);
    }

    private static boolean areValid(LocalDate startDate, LocalDate endDate) {
        return startDate.isAfter(LocalDate.now()) && startDate.isBefore(endDate);
    }
}
