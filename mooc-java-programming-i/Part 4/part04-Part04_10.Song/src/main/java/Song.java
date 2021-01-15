/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ramon
 */
public class Song {
    private String name;
    private int length;
    
    public Song(String inName, int inLength){
        this.name = inName;
        this.length = inLength;
    }
    
    public String name(){
        return this.name;
    }
    public int length(){
        return this.length;
    }
}
