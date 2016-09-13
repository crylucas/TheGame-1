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
public class Objet {
    private int id;
    private String name;
    private int attaque;
    private int defense;
    private int niveau;
    public Objet(){
        
    }
    public Objet(int id,String name, int attaque, int defense, int niveau){
        this.id = id;
        this.name = name;
        this.attaque = attaque;
        this.defense = defense;
        this.niveau = niveau;
    }
    public void setId(int prmId){
        this.id = prmId;
    }
    public int getId(){
        return this.id;
    }
    public void setName(String prmName){
        this.name = prmName;
    }
    public String getName(){
        return this.name;
    }
    public void setAttaque(int prmAttaque){
        this.attaque = prmAttaque;
    }
    public int getAttaque(){
        return this.attaque;
    }
    public void setDefense(int prmDefense){
        this.defense = prmDefense;
    }
    public int getDefense(){
        return this.defense;
    }
    public void setNiveau(int prmNiveau){
        this.niveau = prmNiveau;
    }
    public int getNiveau(){
        return this.niveau;
    }
}
