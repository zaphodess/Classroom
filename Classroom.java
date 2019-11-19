public class Classroom {
  public static void main(String[] args) {

    Wilder Robert = new Wilder ("Robert",true);

    Wilder Denis = new Wilder ("Denis",false);

    Wilder Stranger = new Wilder (true);

    Wilder Karteileiche = new Wilder ();

    Wilder Moni = new Wilder ("Moni", true);

    Wilder Alex = new Wilder ("Alex", false);

    Wilder [] Gruppe = {Robert, Denis, Stranger, Karteileiche, Moni, Alex};
      for (int i=0; i < Gruppe.length; i++){
        System.out.println (Gruppe[i].whoAmI());
      }
      for (Wilder i : Gruppe) {
        System.out.println (i.getFirstname() + " is singing " + Wilder.credo());
      }


  }

}
