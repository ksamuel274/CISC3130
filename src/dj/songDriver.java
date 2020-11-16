package dj;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;


public class songDriver {
	   static SongPlaylist list = new SongPlaylist();
	   public static void main(String[] args) throws IOException {
		   
	       String[] file = { "/Users/king/Documents/FW20/CISC3130/regional-global-weekly-2020-10-09--2020-10-16.csv",
	               "/Users/king/Documents/FW20/CISC3130/regional-global-weekly-2020-10-16--2020-10-23.csv",
	               "/Users/king/Documents/FW20/CISC3130/regional-global-weekly-2020-10-23--2020-10-30.csv",
	               "/Users/king/Documents/FW20/CISC3130/regional-global-weekly-latest.csv" };
	       
	       PrintStream outputStream = new PrintStream("charts.txt");
	       System.setOut(outputStream);
	       ArrayList<String> songList = new ArrayList<>(); 
	       ArrayList<String> artistList = new ArrayList<>(); 
	       ArrayList<Integer> streamList = new ArrayList<>();  
	       for (String a : file) {
	           FileInputStream inputStream = new FileInputStream(a); 
	           Scanner sc = new Scanner(inputStream); 
	           while (sc.hasNext()) { 
	               String line = sc.next();
	               String[] array = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
	               if (array.length > 1) { 
	                   for (int i = 0; i < array.length; i++) {
	                       if (array[i].charAt(6) == '"') { 
	                           array[i] = array[i].substring(1, array[i].length() - 1);
	                       }
	                   }
	                   songList.add(array[1]); 
	                   artistList.add(array[2]);
	                   streamList.add(Integer.parseInt(array[3]));
	               }
	           }
	           inputStream.close(); 
	           sc.close(); 
	       }
	       BST(songList, artistList, streamList);
	       list.inorderTransversal();
	   }
	  //Makes Binary Search Tree
	   public static void BST(ArrayList<String> songList, ArrayList<String> artistList, ArrayList<Integer> streamList) {
	       for (int i = 0; i < songList.size(); i++) {
	           Song artist = new Song(songList.get(i), artistList.get(i), streamList.get(i)); 
	           list.insert(artist); 
	       }
	   }

}