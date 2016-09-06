/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.List;

/**
 *
 * @author regesober
 */
public class Tache {
    
    public String nom;
    public int nombreDeCollaborateurs;
    public int duree;
    public List<Integer> dependDe;
    
    public int conceptionWeb;
    public int baseDeDonnees;
    public int programmation;
    public int metier;
    public int venteMarketing;
    
    public Tache (String nom, int nombreDeCollaborateus, int duree, List<Integer> dependDe, int conceptionWeb, int baseDeDonnees, int programmation, int metier, int venteMarketing) {
        this.nom = nom;
        this.nombreDeCollaborateurs = nombreDeCollaborateus;
        this.duree = duree;
        this.dependDe = dependDe;
        this.conceptionWeb = conceptionWeb;
        this.baseDeDonnees = baseDeDonnees;
        this.programmation = programmation;
        this.metier = metier;
        this.venteMarketing = venteMarketing;
    }
    
    public boolean estQualifie (Collaborateur c){
        return c.conceptionWeb >= conceptionWeb && c.baseDeDonnees >= baseDeDonnees && c.programmation >= programmation && c.metier >= metier && c.venteMarketing >= venteMarketing;
    }
    
    public int evaluate (Collaborateur c){
        int dif = 0;
        if (!this.estQualifie(c)){
            if (c.conceptionWeb < conceptionWeb)
                dif += conceptionWeb - c.conceptionWeb;
            if (c.baseDeDonnees < baseDeDonnees)
                dif += baseDeDonnees - c.baseDeDonnees;
            if (c.programmation < programmation)
                dif += programmation - c.programmation;
            if (c.metier < metier)
                dif += metier - c.metier;
            if (c.venteMarketing < venteMarketing)
                dif += venteMarketing - c.venteMarketing;
        }
        return dif;
    }
    
    public boolean peutExecuter (Collaborateur c){
        int count = 0;
        if (c.conceptionWeb > 0 && c.conceptionWeb < conceptionWeb)
            count++;
        if (c.baseDeDonnees > 0 && c.baseDeDonnees < baseDeDonnees)
            count++;
        if (c.programmation > 0 && c.programmation < programmation)
            count++;
        if (c.metier > 0 && c.metier < metier)
            count++;
        if (c.venteMarketing > 0 && c.venteMarketing < venteMarketing)
            count++;
        return count <= 1;
    }
    
}
