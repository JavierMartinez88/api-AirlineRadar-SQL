package com.nttdata.AirlineRadar.infraestructure.enums;

import lombok.Getter;

@Getter
public enum TableReference {
    FORM("Forms"),
    SECTION("Sections"),
    RESPONSE("Responses");

    private final String tableName;

    TableReference(final String tableName) {
        this.tableName = tableName;
    }
}

