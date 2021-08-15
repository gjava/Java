package exercices.Ex3.Exo32;

public class Candidat implements Review {
    private String name;
    private String party;
    private int collectedVotes;

    public Candidat(String name) {
        this.name = name;  
        this.collectedVotes = 0;  
    }
   
    public Candidat(String name, String party) {
        this.name = name;   
        this.party = party;
        this.collectedVotes = 0;
    }

    public String getName(){
        return name;
    }
    public String getParty() {
        return party;
    }
    public int getCollectedVotes() {
        return collectedVotes;
    }

    @Override
    public void addVote() {
        this.collectedVotes = this.getCollectedVotes()+1;
    }


}