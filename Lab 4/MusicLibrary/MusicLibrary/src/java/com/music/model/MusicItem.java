/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.music.model;
import java.io.Serializable;

/**
 *
 * @author syabil
 */
public class MusicItem implements Serializable{
    
    public String title;
    public String year;
    public String genre;
    
    //normal constructures
    public MusicItem (String title, String year, String genre){
        
        this.title = title;
        this.year = year;
        this.genre = genre;
    }
    
    public String getTitle(){
        return title;
    }
    
     public String getYear(){
        return year;
    }
     
      public String getGenre(){
        return genre;
    }
      
    
    
}
