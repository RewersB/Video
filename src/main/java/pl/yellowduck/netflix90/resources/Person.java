package pl.yellowduck.netflix90.resources;

public abstract class Person {

  protected String firstname;
  protected String lastname;
  protected final Gender gender;

  public Person(String firstname, String lastname, Gender gender) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.gender = gender;
  }

  public abstract void introduce();
}
