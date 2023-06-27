/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aaf;

import java.util.ArrayList;



public class PlayableCharacter extends Character {
    String occupation;
    String age;
    String gender;
    String residence;
    String birthplace;
    
    
    
    int accounting;
    int anthropology;
    int appraise;
    int archaeology;
    int artcraft;
    int charm;
    int climb;
    int credit;
    int mythos;
    int disguise;
    
    int drive;
    int elec;
    int fasttalk;
    
    int handgun;
    int rifle;
    int firstaid;
    int history;
    int intimidate;
    int jump;
    int language;
    int languages;
    int law;
    int library;
    int listen;
    int locksmith;
    int mechrepair;
    int medicine;
    int naturalworld;
    int navigate;
    int occult;
    int drivemachine;
    int persuade;
    int pilot;
    int psychology;
    int psychoanalysis;
    int ride;
    int science;
    int sleighthand;
    int spot;
    int stealth;
    int survival;
    int swim;
    int throwing;
    int track;
    
    ArrayList stats;
    
    public void statcreate(){
        stats.add(age);
                
        stats.add(str);
        stats.add(con);
        stats.add(siz);
        stats.add(dex);
        stats.add(app);
        stats.add(idea);
        stats.add(pow);
        stats.add(edu);
    
        stats.add(maxhp);
        stats.add(sanity);
        stats.add(luck);
        stats.add(mp);
    
        stats.add(accounting);
        stats.add(anthropology);
        stats.add(appraise);
        stats.add(archaeology);
        stats.add(artcraft);
        stats.add(charm);
        stats.add(climb);
        stats.add(credit);
        stats.add(mythos);
        stats.add(disguise);
        stats.add(dodge);
        stats.add(drive);
        stats.add(elec);
        stats.add(fasttalk);
        stats.add(fighting);
        stats.add(handgun);
        stats.add(rifle);
        stats.add(firstaid);
        stats.add(history);
        stats.add(intimidate);
        stats.add(jump);
        stats.add(language);
        stats.add(languages);
        stats.add(law);
        stats.add(library);
        stats.add(listen);
        stats.add(locksmith);
        stats.add(mechrepair);
        stats.add(medicine);
        stats.add(naturalworld);
        stats.add(navigate);
        stats.add(occult);
        stats.add(drivemachine);
        stats.add(persuade);
        stats.add(pilot);
        stats.add(psychology);
        stats.add(psychoanalysis);
        stats.add(ride);
        stats.add(science);
        stats.add(sleighthand);
        stats.add(spot);
        stats.add(stealth);
        stats.add(survival);
        stats.add(swim);
        stats.add(throwing);
        stats.add(track);
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compare(Character t, Character t1) {
    
        return t.dex.compareTo(t1.dex);
    }   


    

}
