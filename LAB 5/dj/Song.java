package dj;
public class Song implements Comparable<Song> {
	public String songTitle;
	public int streamsAverageCount;
	public String artistName;
	public int artistAverage;
	public int streamCount;
	public Song left =  null;
	public Song right = null;

	public Song(String songTitle, String artistName, int streamCount) {
	       this.songTitle = songTitle;
	       this.streamCount = streamCount;
	       this.artistName = artistName;
	       this.artistAverage = streamCount;
	       left = null;
	       right = null;
	}
	
	public String getSongTitle() {
		return songTitle;
	}
	public void setSongTitle(String songTitle) {
		this.songTitle = songTitle;
	}
	public int getStreamAverageCount() {
		return streamsAverageCount;
	}
	public void setStreamsAverageCount(int streamsAverageCount) {
		this.streamsAverageCount = streamsAverageCount;
	}
	public String getArtistName() {
		return artistName;
	}
	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}
	public int getArtistAverage() {
		return artistAverage;
	}
	public void setArtistAverage(Song obj) {
		this.artistAverage = (this.streamCount + obj.streamCount) / 2;
	}
	public int getStreamCount() {
		return streamCount;
	}
	public void setStreamCount(int streamCount) {
		this.streamCount = streamCount;
	}
	public int compareTo(Song obj) {
		return this.songTitle.compareToIgnoreCase(obj.songTitle);
	}
	
	
	@Override
	public String toString() {
		return this.songTitle + " , " + this.artistName + " , " + this.streamCount + " , " + this.artistAverage + " ";
	}
}

