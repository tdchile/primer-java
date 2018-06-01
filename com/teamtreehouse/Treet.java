package com.teamtreehouse;
import java.util.Date;

public class Treet implements Comparable  {
  
  private String mAuthor;
  private String mDescription;
  private Date mCreationDate;
  
  public Treet (String author, String description, Date creationDate){
  
  mAuthor = author;
  mDescription = description;
                 
  mCreationDate = creationDate;
  }
  public String[] getWords() {
    return mDescription.toLowerCase().split("[^\\w#@´]+"); 
  }
  
  @Override
  public String toString(){
    return String.format( " Treet :  \"%s\" BY %s on %s",
                         mDescription, mAuthor ,mCreationDate);
                        
  }
  @Override
  public int compareTo(Object obj) {
    Treet other = (Treet) obj;
    if(equals(other)) {
      return 0;
    }
    int dateCamp = mCreationDate.compareTo(other.mCreationDate);
    if(dateCamp == 0){
      return mDescription.compareTo(other.mDescription);
  }
    return dateCamp;
  }
  
  public String getAuthor() {
    
    return mAuthor;
  }
 
  
    public String getDescription() {
    
    return mDescription;
  }
  
  public Date getDate() {
    
    return mCreationDate;
  }
}