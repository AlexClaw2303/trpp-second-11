package ru.mirea.trpp.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/** Ответ на healthCheck. */
@Getter
@Setter
@AllArgsConstructor
public class HealthResponse {

    // public HealthResponse(String status) {
    // this.status = status;
    // }

    /** Статус работы. */
    private String status;

}
