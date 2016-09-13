/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package thegame.utilitaire;

/**
 *
 * @author cryl & huardm
 */
public class Personnage {
    private int id;
    private String nom;
    private int experience;
    private int niveau;
    private Inventaire inventaire;
    public Personnage(){
        
    }
    public Personnage(int id, String nom, int experience, int niveau, Inventaire inventaire){
        this.id = id;
        this.nom = nom;
        this.experience = experience;
        this.niveau = niveau;
        this.inventaire = inventaire;
    }
    public void setId(int prmId) {
        this.id = prmId;
    }
    public int getId() {
        return this.id;
    }
    
    public void setNom(String prmNom) {
        this.nom = prmNom;
    }
    public String getNom() {
        return this.nom;
    }
    
    public void setExperience(int prmNiveau) {
        this.experience = prmNiveau;
    }
    public int getExperience() {
        return this.experience;
    }
    
    public void setNiveau(int prmNiveau) {
        this.niveau = prmNiveau;
    }
    public int getNiveau() {
        return this.niveau;
    }
    
    public void setInventaire(Inventaire prmInventaire) {
        this.inventaire = prmInventaire;
    }
    public Inventaire getInventaire() {
        return this.inventaire;
    }
}
