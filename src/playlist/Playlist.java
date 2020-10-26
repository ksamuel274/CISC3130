package playlist;

public class Playlist {
	private Song first;
	public Playlist(){
		first=null;
}
//Sets list to empty then adds song to the end of the list
public void addSong(Song s){
   if(first==null) {
       s.setNext(first);
       first=s;
       return;
   }
   Song temp=first;
   while(temp.getNext()!=null){
       temp=temp.getNext();
   }
   temp.setNext(s);
}
//Shows what song is at the head
public Song listenToSong(){
   Song temp=first;
   first=first.getNext();
   return temp;
}
//Gets the next song to listen to
public void printPlyalist() {
   Song temp=first;
   System.out.println("Playlist");
   System.out.println(" ");
   while(temp!=null) {
       System.out.println(temp.getTrack());
       temp=temp.getNext();
   }
}
}

