/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simultrain;

import data.Collaborateur;
import data.Tache;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author regesober
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        String output = "Tableau.csv";
        
        List<Collaborateur> collaborateurs = Util.initCollaborateurs();
        List<Tache> taches = Util.initTaches();
        StringBuilder csvTable = new StringBuilder();
        
        for (Tache tache : taches) {
            List<Collaborateur> tempCol = new ArrayList<>();
            List<Collaborateur> peutExecuter = new ArrayList<>();
            for (Collaborateur collaborateur : collaborateurs) {
                if (tache.estQualifie(collaborateur))
                    tempCol.add(collaborateur);
                else if (tache.peutExecuter(collaborateur))
                    peutExecuter.add(collaborateur);
            }
            Collections.sort(tempCol);
            CollaborateurComparator comp = new CollaborateurComparator(tache);
            Collections.sort(peutExecuter, comp);
            Util.addTable(tache, tempCol, csvTable);
            Util.addNextCollab(tache, peutExecuter, csvTable);
        }
        
        BufferedWriter writer = new BufferedWriter(new FileWriter(output));
        writer.write(csvTable.toString());
        writer.close();
    }
    
}
