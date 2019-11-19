public class Classroom {
  public static void main(String[] args) {

    Wilder Robert = new Wilder ("Robert",true);

    Wilder Denis = new Wilder ("Denis",false);

    Wilder Stranger = new Wilder (true);

    Wilder Karteileiche = new Wilder ();

    Wilder Moni = new Wilder ("Moni", true);

    Wilder Alex = new Wilder ("Alex", false);

    /*Wilders Wilder [] = {Robert, Denis, Stranger, Karteileiche, Moni, Alex};
      for (int i=0; i<Wilders.length;i++){
        System.out.println (Wilders[i].whoAmI());
      }*/

      System.out.println (Robert.whoAmI());
      System.out.println (Denis.whoAmI());
      System.out.println (Stranger.whoAmI());
      System.out.println (Karteileiche.whoAmI());
      System.out.println (Moni.whoAmI());
      System.out.println (Alex.whoAmI());
  }

}
