package model;
import java.util.Date;

public class SystemSolaire {

  private Soleil s = Soleil.getInstance();
  private Planets p = Planets.getInstance();
  private Satellite sat = new Satellite("HelixQc",new Date(4-2-1998),"not much to say yet");

}
