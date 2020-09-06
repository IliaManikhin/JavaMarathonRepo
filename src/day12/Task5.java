package day12;

import java.util.ArrayList;
import java.util.List;

public class Task5 {

	public static void main(String[] args) {
		
		List<MusicArtist> members1 = new ArrayList();
		MusicBand2 band1 = new MusicBand2("Seven Eleven", 1999, members1); 
		
		members1.add(new MusicArtist(34, "Jeff Dale"));
		members1.add(new MusicArtist(25, "Chris Ratner"));
		members1.add(new MusicArtist(26,"Patrick Dale"));
		members1.add(new MusicArtist(29,"Kristof Robinson"));
			
		List<MusicArtist> members2 = new ArrayList(); 
		MusicBand2 band2 = new MusicBand2 ("25 to life", 2006, members2); 
		
		members2.add(new MusicArtist(34, "Jack Hort"));
		members2.add(new MusicArtist(33, "Paul Lindisfarn"));
		members2.add(new MusicArtist(30, "Kev O'Donell"));
		members2.add(new MusicArtist(31, "Jerome Crins"));
		members2.add(new MusicArtist(32, "Willard R.Low"));
		members2.add(new MusicArtist(34, "Emily Katraz"));
		
		band1.showMembers();
		band2.showMembers();
		
		MusicBand2.membersGo(band1, band2);
		
		band1.showMembers();
		band2.showMembers();

	}

}
