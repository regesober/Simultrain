/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author regesober
 */
public class Collaborateur implements Comparable {
    
    public String nom;
    public int tauxHoraire;
    public double ratioDispo;
    public int dispoSemaine;
    
    public int conceptionWeb;
    public int baseDeDonnees;
    public int programmation;
    public int metier;
    public int venteMarketing;
    
    public Collaborateur (String nom, int tauxHoraire, double ratioDispo, int dispoSemaine, int conceptionWeb, int baseDeDonnees, int programmation, int metier, int venteMarketing) {
        this.nom = nom;
        this.tauxHoraire = tauxHoraire;
        this.ratioDispo = ratioDispo;
        this.dispoSemaine = dispoSemaine;
        this.conceptionWeb = conceptionWeb;
        this.baseDeDonnees = baseDeDonnees;
        this.programmation = programmation;
        this.metier = metier;
        this.venteMarketing = venteMarketing;
    }

    @Override
    public int compareTo(Object t) {
        int comp = this.dispoSemaine - ((Collaborateur)t).dispoSemaine;
        if (comp != 0)
            return comp;
        else
            return this.nom.compareTo(((Collaborateur)t).nom);
    }
    
}
