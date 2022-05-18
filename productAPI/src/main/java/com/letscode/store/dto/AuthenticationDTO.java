package com.letscode.store.dto;

import lombok.*;

import java.util.List;


@Getter @Setter
public class AuthenticationDTO {
    private Boolean authenticated;
    private List<String> roles;

}