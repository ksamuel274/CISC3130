package playlist;

public class SongHistoryList {
private Song first;
public SongHistoryList(){
first=null;
}
public void addSong(Song s){
   s.setNext(first);
   first=s;
}
//Gets the next song to listen to
public Song lastListened(){
   Song temp=first;
   first=first.getNext();
   return temp;
}
//Print history of track
public void printHistory() {
   Song temp=first;
   System.out.println("History");
   System.out.println(" ");
   while(temp!=null) {
       System.out.println(temp.getTrack());
       temp=temp.getNext();
   }
}
}
