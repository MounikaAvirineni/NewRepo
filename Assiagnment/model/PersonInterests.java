package com.example.Assiagnment.model;

import jdk.nashorn.internal.objects.annotations.Getter;

public class PersonInterests {

    private String firstName;
    private String interests;

    public String getInterests() {
        return interests;
    }

    public void setInterests(String interests) {
        this.interests = interests;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getFirstName() {
        return firstName;
    }
}
