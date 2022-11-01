package com.examen.DevOps.domain.dto;

import lombok.Data;

@Data
public class BodyDto {

    private String message;

    private String to;

    private String from;

    private Integer timeToLifeSec;
}
