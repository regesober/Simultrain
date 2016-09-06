/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simultrain;

import data.Collaborateur;
import data.Tache;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author regesober
 */
public class Util {
    
    private static final String N = "\n";
    private static final String T = ";";
    
    public static List<Collaborateur> initCollaborateurs() {
        List<Collaborateur> collaborateurs = new ArrayList<>();
        
        collaborateurs.add(new Collaborateur("Alex", 86, 1, 4, 3, 1, 2, 2, 0));
        collaborateurs.add(new Collaborateur("Anne", 160, 1, 2, 6, 5, 6, 3, 0));
        collaborateurs.add(new Collaborateur("Benoit", 102, 1, 4, 3, 2, 4, 0, 2));
        collaborateurs.add(new Collaborateur("Carole", 87, 0.8, 3, 2, 3, 3, 0, 0));
        collaborateurs.add(new Collaborateur("Felix", 89, 1, 6, 1, 0, 4, 0, 1));
        collaborateurs.add(new Collaborateur("Fred", 89, 0.9, 1, 2, 4, 2, 0, 0));
        collaborateurs.add(new Collaborateur("Hugo", 135, 0.8, 2, 6, 3, 5, 2, 0));
        collaborateurs.add(new Collaborateur("Julien", 125, 1, 3, 4, 6, 5, 0, 0));
        collaborateurs.add(new Collaborateur("Laurent", 97, 1, 2, 1, 1, 0, 4, 6));
        collaborateurs.add(new Collaborateur("Luc", 70, 0.7, 3, 2, 0, 4, 0, 0));
        collaborateurs.add(new Collaborateur("Marc", 89, 1, 3, 1, 0, 0, 5, 5));
        collaborateurs.add(new Collaborateur("Paul", 175, 1, 4, 5, 5, 6, 3, 1));
        collaborateurs.add(new Collaborateur("Pierre", 128, 0.8, 2, 6, 4, 4, 1, 0));
        collaborateurs.add(new Collaborateur("Sylvie", 151, 0.8, 1, 5, 3, 4, 5, 3));
        collaborateurs.add(new Collaborateur("Thierry", 58, 1, 3, 3, 0, 3, 0, 0));
        collaborateurs.add(new Collaborateur("Theo", 97, 1, 1, 2, 0, 4, 3, 0));
        
        return collaborateurs;
    }
    
    public static List<Tache> initTaches(){
        List<Tache> taches = new ArrayList<>();
        
        taches.add(new Tache("Specifications", 2, 5, null, 2, 0, 0, 5, 3));
        taches.add(new Tache("Interface utilisateur", 1, 7, null, 5, 0, 0, 2, 0));
        taches.add(new Tache("Concept paiement en ligne", 2, 10, null, 3, 1, 0, 4, 3));
        taches.add(new Tache("Conception base de donnees", 2, 12, null, 1, 6, 3, 0, 0));
        taches.add(new Tache("Prototype du logiciel", 2, 8, null, 4, 3, 4, 0, 0));
        taches.add(new Tache("Outils d'administration", 2, 13, null, 1, 2, 4, 3, 0));
        taches.add(new Tache("Tests d'ergonomie", 4, 15, null, 2, 1, 0, 2, 0));
        taches.add(new Tache("Aide en ligne", 3, 14, null, 1, 0, 3, 2, 0));
        taches.add(new Tache("Interface d'import", 3, 5, null, 2, 5, 2, 0, 0));
        taches.add(new Tache("Importation des donnees", 1, 10, null, 0, 3, 0, 2, 0));
        taches.add(new Tache("Plan marketing", 2, 11, null, 0, 0, 0, 4, 6));
        taches.add(new Tache("Developpement informatique", 3, 6, null, 3, 3, 5, 0, 0));
        taches.add(new Tache("Definition des prix", 4, 11, null, 0, 0, 0, 3, 5));
        taches.add(new Tache("Tests fonctionnels", 1, 5, null, 1, 0, 3, 0, 0));
        taches.add(new Tache("Tests d'integration", 3, 3, null, 2, 0, 1, 2, 0));
        taches.add(new Tache("Documentation", 1, 22, null, 3, 1, 3, 2, 0));
        taches.add(new Tache("Mise en service", 4, 2, null, 1, 0, 4, 3, 0));
        
        return taches;
    }
    
    public static void addTable(Tache t, List<Collaborateur> collaborateurs, StringBuilder sb){
        sb.append(t.nom).append(T);
        sb.append(t.nombreDeCollaborateurs).append(T);
        sb.append(t.duree).append(T);
        sb.append(t.dependDe).append(T);
        sb.append(t.conceptionWeb).append(T);
        sb.append(t.baseDeDonnees).append(T);
        sb.append(t.programmation).append(T);
        sb.append(t.metier).append(T);
        sb.append(t.venteMarketing).append(N);
        sb.append("Ressources").append(T);
        sb.append("Taux horaire").append(T);
        sb.append("Disponibilite pour le projet").append(T);
        sb.append("Disponible des la semaine").append(T);
        sb.append("Conception Web").append(T);
        sb.append("Base de donnees").append(T);
        sb.append("Programmation").append(T);
        sb.append("Metier").append(T);
        sb.append("Vente + Marketing").append(N);
        for (Collaborateur c : collaborateurs) {
            sb.append(c.nom).append(T);
            sb.append(c.tauxHoraire).append(T);
            sb.append(c.ratioDispo).append(T);
            sb.append(c.dispoSemaine).append(T);
            sb.append(c.conceptionWeb).append(T);
            sb.append(c.baseDeDonnees).append(T);
            sb.append(c.programmation).append(T);
            sb.append(c.metier).append(T);
            sb.append(c.venteMarketing).append(N);
        }
        sb.append(N);
    }
    
    public static void addNextCollab(Tache t, List<Collaborateur> collaborateurs, StringBuilder sb){
        sb.append("PeutExecuter").append(N);
        for (Collaborateur c : collaborateurs) {
            sb.append(c.nom).append(T);
            sb.append(c.tauxHoraire).append(T);
            sb.append(c.ratioDispo).append(T);
            sb.append(c.dispoSemaine).append(T);
            sb.append(c.conceptionWeb).append(T);
            sb.append(c.baseDeDonnees).append(T);
            sb.append(c.programmation).append(T);
            sb.append(c.metier).append(T);
            sb.append(c.venteMarketing).append(T);
            sb.append(t.evaluate(c)).append(N);
        }
        sb.append(N).append(N);
    }
    
}
