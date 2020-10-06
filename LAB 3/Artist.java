import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
	class Artist{
		int tempPosition;
		String tempTrackName;
		String tempArtistName;
		int tempStreams;
		String tempURL;
		
	Artist(int tempPosition, String tempTrackName, String tempArtistName, int tempStreams, String tempURL) {
		this.tempPosition = tempPosition;
		this.tempTrackName = tempTrackName;
		this.tempArtistName = tempArtistName;
		this.tempStreams = tempStreams;
		this.tempURL = tempURL;
	}		
		
	
	public static void main(String[] args) {
		
	
		LinkedList<Artist> list = new LinkedList<Artist>();
		String line = "";
		String splitBy = "\\s*,\\s*";
		String csvFile = "rgdl.csv";
		try { 
			BufferedReader br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null)
			{
				String [] record = line.split(splitBy);
				int tempPosition = Integer.parseInt(record[0]);
				String tempTrackName = record[1];
				String tempArtistName = record[2];
				int tempStreams = Integer.parseInt(record[3]);
				String tempURL= record[4];
				//Artist Artist = new Artist(tempPosition, tempTrackName, tempArtistName, tempStreams, tempURL);
				System.out.println(record[0] + " " + record[1] + " " + record[2] + " " + record[3]+ " "+ record[4]);
				//list.add(Artist);
				
			}
		br.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println(list);
		//sort
		

	
	}
	
}
