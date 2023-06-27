/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aaf;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;


public class DB_Access {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3307/ph'nglui mglw'nafh?autoReconnect=true&useSSL=false";        
    static final String USER = "root";
    static final String PASS = "";
    static Connection conexion=null;
    static PreparedStatement ps=null;
    static ResultSet rs=null;
    ArrayList<PlayableCharacter> allchars;

    public static Connection conecta(){
        conexion = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);
            
          
        } catch(SQLException se){
            se.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        
        } return conexion;
   } 

    public static void PC_Insert(PlayableCharacter pc){
        try{
             conexion = conecta();
           
            
            String query = "insert players (name, age, occupation, gender, residence, birthplace) values(?,?,?,?,?,?)";
            ps = conexion.prepareStatement(query);
            
            ps.setString(1, pc.name);
            ps.setString(2,  pc.age);
            ps.setString(3, pc.occupation);
            ps.setString(4, pc.gender);
            ps.setString(5,pc.residence);
            ps.setString(6, pc.birthplace);     
            
            int resultado = ps.executeUpdate();
            if (resultado>0){
                JOptionPane.showMessageDialog(null, "New Player Registered");
            }else{
                 JOptionPane.showMessageDialog(null, "Error");
            }
            conexion.close();
        }catch(SQLException e){
            e.printStackTrace();
        };
    }
    
    public static void PC_start(JComboBox jc1){
        
        try{
            conexion = conecta();
           
            
            String query = "select * from players";
            ps = conexion.prepareStatement(query);
  
            
            rs=ps.executeQuery();
            while(rs.next()){
                PlayableCharacter pc = new PlayableCharacter();
                pc.name=rs.getString("name");
                pc.age=rs.getString("age");
                pc.occupation=rs.getString("occupation");
                pc.gender=rs.getString("gender");
                pc.residence=rs.getString("residence");
                pc.birthplace=rs.getString("birthplace");
             
                pc.str=rs.getInt("str");
                pc.con=rs.getInt("con");
                pc.siz=rs.getInt("siz");
                pc.dex=rs.getInt("dex");
                pc.app=rs.getInt("app");
                pc.idea=rs.getInt("idea");
                pc.pow=rs.getInt("pow");
                pc.edu=rs.getInt("edu");

                pc.maxhp=(pc.siz+pc.con)/10;
                pc.sanity=pc.pow;
                pc.luck=rs.getInt("luck");
                pc.mp=pc.pow/5;

                pc.accounting=rs.getInt("accounting");
                pc.anthropology=rs.getInt("anthropology");
                pc.appraise=rs.getInt("appraise");
                pc.archaeology=rs.getInt("archaeology");
                pc.artcraft=rs.getInt("artcraft");
                pc.charm=rs.getInt("charm");
                pc.climb=rs.getInt("climb");
                pc.credit=rs.getInt("credit");
                pc.mythos=rs.getInt("mythos");
                pc.disguise=rs.getInt("disguise");
                pc.dodge=rs.getInt("dodge");
                pc.drive=rs.getInt("drive");
                pc.elec=rs.getInt("electricity");
                pc.fasttalk=rs.getInt("fasttalk");
                pc.fighting=rs.getInt("fighting");
                pc.handgun=rs.getInt("handgun");
                pc.rifle=rs.getInt("rifle");
                pc.firstaid=rs.getInt("firstaid");
                pc.history=rs.getInt("history");
                pc.intimidate=rs.getInt("intimidate");
                pc.jump=rs.getInt("jump");
                pc.language=rs.getInt("english");
                pc.languages=rs.getInt("languages");
                pc.law=rs.getInt("law");
                pc.library=rs.getInt("library");
                pc.listen=rs.getInt("listen");
                pc.locksmith=rs.getInt("locksmith");
                pc.mechrepair=rs.getInt("mechanic");
                pc.medicine=rs.getInt("medicine");
                pc.naturalworld=rs.getInt("nature");
                pc.navigate=rs.getInt("navigate");
                pc.occult=rs.getInt("occult");
                pc.drivemachine=rs.getInt("heavymachinery");
                pc.persuade=rs.getInt("persuade");
                pc.pilot=rs.getInt("pilot");
                pc.psychology=rs.getInt("psychology");
                pc.psychoanalysis=rs.getInt("psychoanalysis");
                pc.ride=rs.getInt("ride");
                pc.science=rs.getInt("science");
                pc.sleighthand=rs.getInt("sleightofhand");
                pc.spot=rs.getInt("spot");
                pc.stealth=rs.getInt("stealth");
                pc.survival=rs.getInt("survival");
                pc.swim=rs.getInt("swim");
                pc.throwing=rs.getInt("throwing");
                pc.track=rs.getInt("track");
                jc1.addItem(pc);
            }
            conexion.close();
        }catch(SQLException e){
            e.printStackTrace();
        };
    }
    
    public static void PC_Update(PlayableCharacter pc){
        try{
             conexion = conecta();
           
            
            String query = "update players set STR=?, CON=?, SIZ=?, DEX=?, APP=?, IDEA=?, POW=?, EDU=?, "
                    + "MAXHP=?, MAXSANITY=?, LUCK=?, "
                    + "Accounting=?, Archaeology=?, Anthropology=?, Appraise=?, ArtCraft=?, Charm=?, Climb=?, Credit=?, Mythos=?, "
                    + "Disguise=?, Dodge=?, Drive=?, Electricity=?, Fasttalk=?, Fighting=?, handgun=?, Rifle=?, Firstaid=?, "
                    + "history=?, intimidate=?, jump=?, english=?, languages=?, law=?, library=?, listen=?, locksmith=?, "
                    + "Mechanic=?, medicine=?, nature=?, navigate=?, occult=?, heavymachinery=?, persuade=?, pilot=?, psychology=?, "
                    + "psychoanalysis=?, ride=?, science=?, sleightofhand=?, spot=?, stealth=?, survival=?, swim=?, throwing=?,CurrentMP=?, track=?"
                    + " where name=?";
            ps = conexion.prepareStatement(query);
            
            ps.setInt(1, pc.str);
            ps.setInt(2,  pc.con);
            ps.setInt(3,  pc.siz);
            ps.setInt(4,  pc.dex);
            ps.setInt(5,  pc.app);
            ps.setInt(6,  pc.idea);
            ps.setInt(7,  pc.pow);
            ps.setInt(8,  pc.edu);
            ps.setInt(9,  pc.maxhp);
            ps.setInt(10,  pc.sanity);
            ps.setInt(11,  pc.luck);         
            ps.setInt(12,  pc.accounting);
            ps.setInt(13,  pc.archaeology);
            ps.setInt(14,  pc.anthropology);
            ps.setInt(15,  pc.appraise);          
            ps.setInt(16,  pc.artcraft);
            ps.setInt(17,  pc.charm);
            ps.setInt(18,  pc.climb);
            ps.setInt(19,  pc.credit);
            ps.setInt(20,  pc.mythos);
            ps.setInt(21,  pc.disguise);
            ps.setInt(22,  pc.dodge);
            ps.setInt(23,  pc.drive);
            ps.setInt(24,  pc.elec);
            ps.setInt(25,  pc.fasttalk);
            ps.setInt(26,  pc.fighting);
            ps.setInt(27,  pc.handgun);
            ps.setInt(28,  pc.rifle);
            ps.setInt(29,  pc.firstaid);            
            ps.setInt(30,  pc.history);
            ps.setInt(31,  pc.intimidate);
            ps.setInt(32,  pc.jump);
            ps.setInt(33,  pc.language);
            ps.setInt(34,  pc.languages);
            ps.setInt(35,  pc.law);
            ps.setInt(36,  pc.library);
            ps.setInt(37,  pc.listen);
            ps.setInt(38,  pc.locksmith);
            ps.setInt(39,  pc.mechrepair);
            ps.setInt(40,  pc.medicine);
            ps.setInt(41,  pc.naturalworld);
            ps.setInt(42,  pc.navigate);
            ps.setInt(43,  pc.occult);
            ps.setInt(44,  pc.drivemachine);
            ps.setInt(45,  pc.persuade);
            ps.setInt(46,  pc.pilot);
            ps.setInt(47,  pc.psychology);
            ps.setInt(48,  pc.psychoanalysis);
            ps.setInt(49,  pc.ride);
            ps.setInt(50,  pc.science);
            ps.setInt(51,  pc.sleighthand);
            ps.setInt(52,  pc.spot);
            ps.setInt(53,  pc.stealth);
            ps.setInt(54,  pc.survival);
            ps.setInt(55,  pc.swim);
            ps.setInt(56,  pc.throwing);
            ps.setInt(57,  pc.track);
            ps.setInt(58, pc.mp);
            ps.setString(59, pc.name);
                    
            
            int resultado = ps.executeUpdate();
            if (resultado>0){
                JOptionPane.showMessageDialog(null, "Player Updated");
            }else{
                 JOptionPane.showMessageDialog(null, "Error");
            }
            conexion.close();
        }catch(SQLException e){
            e.printStackTrace();
        };
    }
    
    public static void GS_Insert(PlayableCharacter pc, int gamesave){
       
        try{
             conexion = conecta();
           
            
            String query = "insert into games values(?,?)";
            ps = conexion.prepareStatement(query);
            
            ps.setInt(1, gamesave);
            ps.setString(2, pc.name);
           
            
            int resultado = ps.executeUpdate();
            if (resultado>0){
                JOptionPane.showMessageDialog(null, "Game Saved");
            }else{
                 JOptionPane.showMessageDialog(null, "Error");
            }
            conexion.close();
        }catch(SQLException e){
              try{
             Connection conexion = conecta();
           
            
            String query = "update games set GameState=?";
            ps = conexion.prepareStatement(query);
            
            ps.setInt(1, gamesave);
          
           
            
            int resultado = ps.executeUpdate();
            if (resultado>0){
                JOptionPane.showMessageDialog(null, "Game Saved");
            }else{
                 JOptionPane.showMessageDialog(null, "Error");
            }
            conexion.close();
            }catch(SQLException ex){
            e.printStackTrace();}
        };
    }
    
    public static int GS_Load(PlayableCharacter pc){
    int gs=0;
        try {
            conexion = conecta();
   
            String query = "Select * from games where CharacterName = ?";
            ps = conexion.prepareStatement(query, ResultSet.TYPE_SCROLL_INSENSITIVE,
                                                    ResultSet.CONCUR_UPDATABLE);
            
           
            ps.setString(1, pc.name);  
            rs = ps.executeQuery();       
            rs.beforeFirst();
            
            if (rs.next()) {
               gs=rs.getInt("GameState");
            
            } else {
                JOptionPane.showMessageDialog(null, "No games were found for this character");
            }

            conexion.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
     return gs;
    }
    
    public static int PC_SkillSearch(String search, PlayableCharacter pc){
        int skill=0;
        try{
            conexion = conecta();
             
            
            String query = "SELECT * FROM players where name=?";
            ps = conexion.prepareStatement(query, ResultSet.TYPE_SCROLL_INSENSITIVE,
                                                    ResultSet.CONCUR_UPDATABLE);
            
            
            ps.setString(1 ,pc.name);
            
            rs = ps.executeQuery();
            rs.next();
            skill= rs.getInt(search);
            conexion.close();
        }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "Please enter a valid skill");
        }
        return skill;
    }
    
    public static Character PC_SkillSearch(String name){
       NPC npc= null;
        try{
            conexion = conecta();
             
            
            String query = "SELECT * FROM characters where name=?";
            ps = conexion.prepareStatement(query, ResultSet.TYPE_SCROLL_INSENSITIVE,
                                                    ResultSet.CONCUR_UPDATABLE);
            
             
            ps.setString(1 ,name);
            
            rs = ps.executeQuery();
            rs.next();
             npc= new NPC();
             npc.name=rs.getString("name");
             
             npc.fighting=rs.getInt("fighting");
             npc.dodge=rs.getInt("dodge");
             
                npc.age=rs.getString("age");
                npc.occupation=rs.getString("occupation");
                npc.gender=rs.getString("gender");
                npc.residence=rs.getString("residence");
                npc.birthplace=rs.getString("birthplace");
             
                npc.str=rs.getInt("str");
                npc.con=rs.getInt("con");
                npc.siz=rs.getInt("siz");
                npc.dex=rs.getInt("dex");
                npc.app=rs.getInt("app");
                npc.idea=rs.getInt("idea");
                npc.pow=rs.getInt("pow");
                npc.edu=rs.getInt("edu");

                npc.maxhp=(npc.siz+npc.con)/10;
                npc.sanity=npc.pow;
                npc.luck=rs.getInt("luck");
                npc.mp=npc.pow/5;
            conexion.close();
        }catch(SQLException e){
            e.printStackTrace();
        };
        return npc;
    }
    public static Character PC_SkillSearch(String name, String skill){
       NPC npc= null;
        try{
            conexion = conecta();
             
            
            String query = "SELECT ? FROM characters where name=?";
            ps = conexion.prepareStatement(query, ResultSet.TYPE_SCROLL_INSENSITIVE,
                                                    ResultSet.CONCUR_UPDATABLE);
            
             
            ps.setString(1 ,skill);
            ps.setString(2 ,name);
            
            rs = ps.executeQuery();
            rs.next();
             npc= new NPC();
            
             
            npc.fighting=rs.getInt("fighting"); 
            npc.name=rs.getString("name");
             
             //npc.dodge=rs.getInt("dodge");
             
  
            conexion.close();
        }catch(SQLException e){
            e.printStackTrace();
        };
        return npc;
    }
    
    public static void PC_delete(PlayableCharacter pc){
             try{
             conexion = conecta();
           
            
            String query = "delete from players where name=?";
            ps = conexion.prepareStatement(query);
            
            ps.setString(1, pc.name);
              
            
            int resultado = ps.executeUpdate();
            if (resultado>0){
                JOptionPane.showMessageDialog(null, "Player Deleted");
            }else{
                 JOptionPane.showMessageDialog(null, "Error");
            }
            conexion.close();
        }catch(SQLException e){
            e.printStackTrace();
        };
    }


}