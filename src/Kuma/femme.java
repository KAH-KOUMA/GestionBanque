/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kuma;

/**
 *
 * @author Sams
 */
public class femme implements Personne{
    String Nom, Prenom;
    public femme(String Nom, String Prenom)
    {
        this.Nom = Nom; this.Prenom = Prenom; 
    }
    
    @Override
    public void genre()
    {
        System.out.println("Je suis une femme");
    }
}
   

