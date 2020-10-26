package playlist;

public class Song {
private String track;
private Song next;
//Create constructor Song getters and setters
public Song() {
   track="";
   next=null;
}
public Song(String track) {
   this.track=track;
   next=null;
}
   public Song getNext() {
       return next;
   }
 
   public void setNext(Song next) {
       this.next = next;
   }
  
   public String getTrack() {
       return track;
   }

   public void setTrack(String track) {
       this.track = track;
   }
}