package dj;

public class SongPlaylist {
//Node for binary search tree
	public Song root; 
	  
	public SongPlaylist() {
	      root = null;     
	   }
//Checks if root isEmpty
	   public boolean isEmpty() {
	       return root == null;   
	   }
//Adds to binary search tree
	   public void insert(Song obj) {
	       if (root == null) {
	          root = obj;
	       }
	       else {
	           Song current = root;
	           Song parent;
	           while (true) {
	              parent = current;
	              if (obj.songTitle.compareToIgnoreCase(current.songTitle) == 0) {
	                   current.setArtistAverage(obj);
	                   return;
	               }
	               else if (obj.songTitle.compareToIgnoreCase(current.songTitle) < 0) {
	                   current = current.left;
	                   if (current == null) {
	                       parent.left = obj;
	                       return;
	                   }
	               }
	               else {
	                   current = current.right;
	                   if (current == null) { 
	                       parent.right = obj;
	                       return;
	                   }
	               }
	           }
	       }
	   }
	   public void inorderTransversal() {
	       inorder(root);
	   }
	   public void inorder(Song root) {
	       if (root == null) {
	           return;
	       }
	       inorder(root.left);
	       System.out.println(root);
	       inorder(root.right);
	   }

	   public void subset(String song1, String song2) {
	       subset(root, song1, song2); 
	   }
	   public Song subset(Song root, String song1, String song2) {
	       if (root == null) {
	           return root;
	       }
	       Song current = root;
	       if (song1.compareTo(current.songTitle) < 0) {
	           subset(current.left, song1, song2);
	       }
	       if ((song1.compareTo(current.songTitle) <= 0) && (song2.compareTo(current.songTitle) >= 0)) {
	           System.out.println(current);
	       }
	       if (song2.compareTo(current.songTitle) > 0) {
	           subset(current.right, song1, song2);
	       }
	       return root;
	   }
	}

