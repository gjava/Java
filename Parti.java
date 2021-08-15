package exercices.Ex3.Exo32;

public class Parti {
    private String nomParti;
     private int nbrAdherent;
     
 public Parti(String nomParti){
     this.nomParti = nomParti;
     this.nbrAdherent = 0;
 
 }
 public  void addAdherent(){
         this.nbrAdherent = nbrAdherent + 1;
     }
 
 public  void delAdherent(){
     this.nbrAdherent = nbrAdherent - 1;
 }
 public String getNomParti(){
     return nomParti;
 }
 public int getNbreAdherent(){
     return this.nbrAdherent;
 }
     
 }
