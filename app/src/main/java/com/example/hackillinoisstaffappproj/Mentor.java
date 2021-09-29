package com.example.hackillinoisstaffappproj;

public class Mentor {
    private String firstName;
    private String lastName;
    private String description;
    private String profile;

    public Mentor(String firstName, String lastName, String description, String profile) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.description = description;
        this.profile = profile;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    @Override
    public String toString() {
        return "Mentor{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", description='" + description + '\'' +
                ", imageUrl='" + profile + '\'' +
                '}';
    }
}
