package exercices.Ex3.Exo32;

public class Main {
      public static void main(String[] arg){
        Candidat c = new Candidat("Peter ");
        Candidat c1 = new Candidat("Teddy", "R");
        Candidat c2 = new Candidat("Oswalt", "D");
        c.addVote();
        c1.addVote();
        c2.getName();
        Ballots s = new Ballots("Presidential election", "01/05/2000");
        s.addCandidat(c);
        
    }
}
