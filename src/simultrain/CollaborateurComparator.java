/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simultrain;

import data.Collaborateur;
import data.Tache;
import java.util.Comparator;

/**
 *
 * @author regesober
 */
public class CollaborateurComparator implements Comparator<Collaborateur> {

    private final Tache tache;
    
    public CollaborateurComparator (Tache tache){
        this.tache = tache;
    }
    
    @Override
    public int compare(Collaborateur t, Collaborateur t1) {
        return tache.evaluate(t) - tache.evaluate(t1);
    }
    
}
