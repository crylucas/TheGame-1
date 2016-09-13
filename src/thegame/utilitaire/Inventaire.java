/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package thegame.utilitaire;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cryl & huardm
 */
public class Inventaire {
    private List<Objet> listeObjet;
    public Inventaire(){
        this.listeObjet = new ArrayList();
    }
    public void addInventaire(Objet objet) {
        this.listeObjet.add(objet);
    }
    
    public Objet chercheObjetInv(int prmId) {
        Objet objReturn = null;
        for(int i = 0; i < this.listeObjet.size(); i++) {
            if(listeObjet.get(i).getId() == prmId) {
                objReturn = listeObjet.get(i);
            }
        }
        return objReturn;
    }
    
    public void delInventaire(Objet prmObjet) {
        int i = 0;
        while (i < this.listeObjet.size()) {
            if(this.listeObjet.get(i) == prmObjet) {
                this.listeObjet.remove(i);
                i = this.listeObjet.size();
            }
            i++;
        }
    }
    public List<Objet> getListeObjet(){
        return this.listeObjet;
    }
    public void tousLesObjet(){
        for(int i = 0; i<this.listeObjet.size(); i++){
            Objet obj = this.listeObjet.get(i); 
            System.out.println(obj.getId()+" "+obj.getName()+" Attaque = "+obj.getAttaque()+" Défense = "+obj.getDefense()+" Niveau = "+obj.getNiveau());
        }
    }
}
