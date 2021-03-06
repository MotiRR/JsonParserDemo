package com.vtb.jsonparser.core.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum Status {
    DONE("done"),
    IN_PROCESS("in_process"),
    IN_REVIEW("in_review"),
    OPEN("open");

    private String name;

    Status(String name) {
         this.name = name;
    }

    @JsonValue
    public String getName() {
        return name;
    }
}
