public class Dipendente {
     private final int matricola;
    private final double stipendio;
    private Dipartimento dipartimento;

    public Dipendente( String matricola, double stipendio, String dipartimento){
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }
  public  int getMatricola(){
        return matricola;
  }
  public Dipartimento getdipartimento(){
        return dipartimento;}

    public  double getStipendio(){
        return stipendio;
    }
  public void setDipartimento (Dipartimento dipartimento){
        this.dipartimento =dipartimento;

  }
}
