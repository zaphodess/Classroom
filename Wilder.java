

public class Wilder {
  /*class attributes*/
  private String firstname;
  private boolean present;

/* Constructors = Constructor methods for different sets of information handovers */


  public Wilder (){
    this.firstname = "Never_met_the_guy";
    this.present = false;
  }

  public Wilder (String firstname){
      this.firstname = firstname;
      this.present = false;
  }
  public Wilder (String firstname, boolean present) {
      this.firstname = firstname;
      this.present = present;

  }
  public Wilder (boolean present){
    this.firstname = "Unknown_guy_who_shows_up_sometimes";
    this.present = present;
  }

/* Getters = Getter Methods */

  public String getFirstname () {
    // Hier kann man Code adden, der den Input validiert. Deshalb so umständlich.
    return this.firstname;
  }
  public boolean isPresent () {
    return this.present;
  }

/* Setters = Setter Methods */

  public void setFirstname (String firstname) {
    this.firstname = firstname;
  }

  public void setPresent (boolean present) {
    this.present = present;
  }

/*Behavioral Instance Method*/
  public String whoAmI () {
    if (present==true){
      return ("My name is " + this.getFirstname() + " and I am present.");
    }
    else {
      return ("My name is " + this.getFirstname() + " and I'm not present.");
    }
  }

/* Behavioral static = class ([????] method )
called like this: Wilder.credo();
*/
  public static String credo () {
    return "I believe in wearing socks! Amen!!!!";

  }

}
