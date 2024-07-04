package org.example.springhelloworld.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.GrantedAuthority;

@Document(collection = "roles")
public class Role implements GrantedAuthority {
    @Id
    private String id;
    private String name;

    // Getters and setters

    @Override
    public String getAuthority() {
        return name;
    }
}
