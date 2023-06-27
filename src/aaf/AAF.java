package aaf;


import java.util.Scanner;


public class AAF {
    static Scanner sc = new Scanner(System.in);
    public static PlayableCharacter vin;
   
    public static void main(String[] args) {
      startGame();
    }
    public static void startGame(){     
        GameState gw = new GameState();
        gw.setVisible(true);
       
    }
    
    public static PlayableCharacter charCreation(){
        PlayableCharacter pc = new PlayableCharacter();        
        pc.name="Vinny Louie";
     
        pc.occupation="Gangster";
        pc.age="30";
        pc.gender="Male";
        pc.residence="New York";
        pc.birthplace="Genova";
        
        pc.str=80;
        pc.con=50;
        pc.siz=60;
        pc.dex=60;
        pc.app=40;
        pc.idea=50;
        pc.pow=70;
        pc.edu=60;
        
        pc.maxhp=(pc.siz+pc.str)/2;
        pc.sanity=pc.pow;
        pc.luck=60;
        pc.mp=14;
        
        pc.accounting=45;
        pc.anthropology=1;
        pc.appraise=45;
        pc.archaeology=1;
        pc.artcraft=5;
        pc.charm=15;
        pc.climb=20;
        pc.credit=50;
        pc.mythos=0;
        pc.disguise=5;
        pc.dodge=pc.dex/2;
        pc.drive=20;
        pc.elec=10;
        pc.fasttalk=75;
        pc.fighting=85;
        pc.handgun=70;
        pc.rifle=25;
        pc.firstaid=30;
        pc.history=5;
        pc.intimidate=55;
        pc.jump=20;
        pc.language=60;
        pc.languages=1;
        pc.law=25;
        pc.library=20;
        pc.listen=40;
        pc.locksmith=61;
        pc.mechrepair=10;
        pc.medicine=1;
        pc.naturalworld=10;
        pc.navigate=1;
        pc.occult=5;
        pc.drivemachine=1;
        pc.persuade=10;
        pc.pilot=1;
        pc.psychology=10;
        pc.psychoanalysis=1;
        pc.ride=5;
        pc.science=1;
        pc.sleighthand=60;
        pc.spot=45;
        pc.stealth=20;
        pc.survival=10;
        pc.swim=20;
        pc.throwing=20;
        pc.track=10;

        return pc;
    }
}
