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
public class compte_bancaire {
public int num;
public client ref_client ;
public float solde ;

public compte_bancaire (){
    
}
public compte_bancaire(int num, client ref_client,float solde){
    this.num=num;
    this.ref_client=ref_client;
    this.solde=solde;
}
public compte_bancaire(compte_bancaire cb)
{
    num=cb.num;
    ref_client=cb.ref_client;
    solde=cb.solde;
}

    public int getNum() {
        return num;
    }

    public client getRef_client() {
        return ref_client;
    }

    public float getSolde() {
        return solde;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setRef_client(client ref_client) {
        this.ref_client = ref_client;
    }

    public void setSolde(float solde) {
        this.solde = solde;
    }
    public String afficher_compte()
    { 
        return "numero compte"+this.num+"ref_client"+this.ref_client+"solde"+this.solde;    
    }
    public float crediter(float m)
    {
        return solde+m;
    }
    public float debiter(float m)
    {
        return solde+m;
    }
 
}

