/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kuma;

import java.util.Scanner;

/**
 *
 * @author Sams
 */
public class Kuma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        client c1 = new client(1993, "Kuma", "Sekou", 18, "enseignant");
        client c2 = new client(1994, "Kuma", "Fatim", 19, "professeur");
        client c3 = new client(1995, "Kuma", "MK", 40, "gestionnaire");
        client c7 = new client(1998, "Kuma", "Mariame", 40, "gestionnaire");
        client c5 = new client(9008, "Kuma", "Al hASSANE", 40, "gestionnaire");
        client c6 = new client(1987, "Kuma", "nani", 40, "gestionnaire");
       
        Compte_courant cc[] = new Compte_courant[3];
        cc[0] = new Compte_courant(001, c1, 10000);
        cc[1] = new Compte_courant(002, c2, 9000);
        cc[2] = new Compte_courant(007, c3, 7000);
        
        
        
    
        System.out.println("Veuillez entrer votre numero de compte");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); 
        
        int exist = -1;
        for (int i = 0; i < cc.length; i++) {
            if (num == cc[i].num) {
                exist=i;
            }
        }
        if (exist == -1) {
            System.out.println("Ce compte n'xiste pas");
        }
        else
        {
            System.out.println("Bienvenue: \n" + cc[exist].getRef_client().getNom()+" "+cc[exist].getRef_client().getPrenom());
        
       
        System.out.println("Veuillez choisir une opération: \n 1. Afficher Solde \n "
                + "2. Crediter \n 3. Debiter \n 4. Quitter");
        int nb = sc.nextInt();
        float montant;
        while(nb != 4){
            switch(nb)
            {
                case 1:System.out.println("Votre Solde est :" +cc[exist].solde);
                    break;
                    case 2:System.out.println("Votre Solde est :" +cc[exist].solde +"\n Veuillez taper le montant a crediter");
                    montant= cc[exist].solde+ sc.nextFloat();
                    System.out.println("Votre nouveau solde est :" + montant);
                    break;
                   case 3:System.out.println("Votre Solde est :" +cc[exist].solde + "\n Veuillez taper le montant a debiter");
                   montant = sc.nextFloat();
                       if (montant < cc[exist].solde) {
                           System.out.println("Votre nouveau solde est :" +(cc[exist].solde-montant));                   
                       }
                   break;
                   default:System.out.println("Numero d'operation est invalide");
            }
            nb=sc.nextInt();
        }
        }
     }
  }
    

