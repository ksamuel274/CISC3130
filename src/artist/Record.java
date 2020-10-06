package artist;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.Scanner;
public class Record {

	public static void main(String[] args)throws IOException {
		PrintStream outputStream = new PrintStream("ArtistsSorted-WeekOfWWDDYYYY.txt");
        System.setOut(outputStream);
		//open file into inputStream
		String csvFile = "rgdl.csv";
		BufferedReader reader = new BufferedReader(new FileReader(csvFile));
		//read file line by line
		String line = null;
		Scanner scanner = null;
		int index = 0;
		LinkedList<Artist> list = new LinkedList<>();
		
		while((line = reader.readLine()) != null){
			Artist artist = new Artist();
			scanner = new Scanner(line);
			scanner.useDelimiter(",(?=(?:[^\\\"]*\\\"[^\\\"]*\\\")*[^\\\"]*$)");
			while (scanner.hasNext()) {
				String record = scanner.next();
				if (index == 0)
					artist.setPosition(Integer.parseInt(record));
				else if (index == 1)
					artist.setTrackName(record);
				else if (index == 2)
					artist.setArtistName(record);
				else if (index == 3)
					artist.setStreams(Long.parseLong(record));
				else if (index == 4)
					artist.setURL(record);
				else 
					System.out.println("Invalid Data "+ record);
				index++;
			}
			index = 0;
			list.add(artist);
		}
		reader.close();
		System.out.println(list);
		}
		

	}



