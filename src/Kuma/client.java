/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kuma;

/**
 *
 * @author KAH
 */
public class client {
    int cin ;
    String nom;
    String prenom ;
    int age;
    String profession ;
    
    public client (){
        
    }
public client (int cin ,String nom, String prenom,int age ,String profession){
    this.cin=cin;
    this.nom=nom;
    this.prenom=prenom;
    this.age=age;
    this.profession=profession;
    
}

public client(client c){
    cin=c.cin;
    nom=c.nom;
    prenom=c.prenom;
    profession=c.profession;
}

    public int getCin() {
        return cin;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAge() {
        return age;
    }

    public String getProfession() {
        return profession;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

public String affiche_client (){
 return "cin : "+this.cin+"nom : " +this.nom+"prenom : "+this.prenom+"age : "+this.age+"profession : "+this.profession;
}
}
