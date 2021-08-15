package exercices.Ex3.Exo32;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public  class Period {
    private String jour;
    private Date date;

    public Period (String jour){
        this.setJour(jour);
    }
    public String getJour() {
        return jour;
    }
    public void setJour(String jour) {
        this.jour = jour;
    }
    /**public Date convertDate(String j) throws ParseException{
        this.jour = j;
        date = new SimpleDateFormat("dd/MM/yyyy").parse(j);
        return  date;
    }*/
    public Date convertDate(String j) {
        this.setJour(j);
        try {
            date = new SimpleDateFormat("dd/MM/yyyy").parse(j);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return  date;
    }

}
