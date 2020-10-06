/* KINGSLEY SAMUEL
 * CISC 3130
 * 
 * Class Artist
 * getters and setters
 */
package artist;

public class Artist {

	private int position;
	private String trackName;
	private String artistName;
	private long streams;
	private String url;
	
	/*public Artist(int position, String trackName, String artistName, long streams, String url) {
	this.position = position;
	this.trackName = trackName;
	this.artistName = artistName;
	this.streams = streams;
	this.url = url;
}
*/


		
		//Gets the position value
		public int getPosition() {
			return position;
		}
		//Sets position value to position record[0]
		public void setPosition(int position) {
			this.position = position;
		}
		//Gets the trackName record[1]
		public String getTrackName() {
			return trackName;
		}
		//Set the trackName 
		public void setTrackName(String trackName) {
			this.trackName = trackName;
		}
		//Gets the Artist Name record[2]
		public String getArtistName() {
			return artistName;
		}
		//Set the Artist Name
		public void setArtistName(String artistName) {
			this.artistName = artistName;
		}
		//Gets the Streams number record[3]
		public long getStreams() {
			return streams;
		}
		//Set the Stream number
		public void setStreams(long streams) {
			this.streams = streams;
		}
		public String getURL() {
			return url;
		}
		public void setURL(String url) {
			this.url = url;
		}
		
		
		@Override
		public String toString() {
			return  getPosition() + " " + getTrackName() + " " + getArtistName()+ " " + getStreams() + " " + getURL() + "\n";
		}
		
		

	
}


