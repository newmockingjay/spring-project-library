package project.library.models;

import jakarta.validation.constraints.*;

public class Person {
    private int personId;
    @NotEmpty(message = "Поле ФИО не может быть пустым")
    private String fullName;
    @Min(value = 0, message = "Год рождения должен быть больше 0")
    private int birthYear;

    public Person() {}

    public Person(String fullName, int birthYear) {
        //this.personId = id;
        this.fullName = fullName;
        this.birthYear = birthYear;
    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }
}
