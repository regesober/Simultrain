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
    
    public boolean estExecutablePar (Collaborateur c){
        return c.conceptionWeb >= conceptionWeb && c.baseDeDonnees >= baseDeDonnees && c.programmation >= programmation && c.metier >= metier && c.venteMarketing >= venteMarketing;
    }
    
}
