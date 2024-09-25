package com.br.crud.crud_spring.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document

public class Task {

    private String id;
    private User user;
    private String title;
    private String description;
    private Boolean completed = Boolean.FALSE;
}
