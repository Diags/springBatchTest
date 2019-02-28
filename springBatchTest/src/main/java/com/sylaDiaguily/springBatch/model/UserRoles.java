package com.sylaDiaguily.springBatch.model;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class UserRoles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userRolesId;
    @NotNull
    @ManyToOne
    private User username;
    private String role ;
    public UserRoles(@NotNull User username, String role ) {
        this.username = username;
        this.role = role;
    }

    public User getUsername() {
        return username;
    }

    public void setUsername(User username) {
        this.username = username;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
