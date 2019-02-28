package com.sylaDiaguily.springBatch.model;

import javax.management.relation.Role;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
@Entity
public class User   implements Serializable  {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id ;
   @NotNull
    private String name ;
    private String passeWord;
    private  boolean accountNonExpired;
    private  boolean accountNonLocked;
    private  boolean credentialsNonExpired;
    private  boolean enabled;
    private String role ;
    public String getName() {
        return name;
    }

    public User(String name, String passeWord) {
        super();
        this.name = name;
        this.passeWord = passeWord;
    }

    public User() {
    }

    public boolean isAccountNonExpired() {
        return accountNonExpired;
    }

    public void setAccountNonExpired(boolean accountNonExpired) {
        this.accountNonExpired = accountNonExpired;
    }

    public boolean isAccountNonLocked() {
        return accountNonLocked;
    }

    public void setAccountNonLocked(boolean accountNonLocked) {
        this.accountNonLocked = accountNonLocked;
    }

    public boolean isCredentialsNonExpired() {
        return credentialsNonExpired;
    }

    public void setCredentialsNonExpired(boolean credentialsNonExpired) {
        this.credentialsNonExpired = credentialsNonExpired;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getPasseWord() {
        return passeWord;
    }

    public void setPasseWord(String passeWord) {
        this.passeWord = passeWord;
    }

}
