package exercices.Ex3.Exo32;

import java.util.*;

public class Ballots extends Period {
    private String nomBallots;
    String jour;
    private Date date;

    private HashMap<Candidat, Integer> liste;

    public Ballots(String nomBallots, String jour) {
        super(jour);
        this.nomBallots = nomBallots;
        this.date = convertDate(jour);
        this.liste = new HashMap<Candidat, Integer>();
    }

    public HashMap<Candidat, Integer> getListe() {
        return liste;
    }
    public String getBallotsName() {
        return nomBallots;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void addCandidat(Candidat c) {
        for (Map.Entry<Candidat, Integer> m : this.liste.entrySet()) {
            if((c.getParty()).equals(m.getKey().getParty())){
                System.out.println("The "+ m.getKey().getParty() + " party" + " has already a candidate");
            }
            else {
                this.liste.put(c, c.getCollectedVotes());
            }  
        }     
    }
    public void listing() {
        System.out.println(this.getBallotsName() + "Results of  " + this.getDate() + " : \n");
        for (Map.Entry<Candidat, Integer> m : getListe().entrySet()) {
            System.out.println(m.getKey() + " : " + " [Candidat : " + m.getValue() +
             ", nombre de voix = " + m.getValue() + "]\n" );
        }

    }

}
