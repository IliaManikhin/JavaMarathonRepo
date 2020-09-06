package day12;

import java.util.List;

public class MusicBand2 {
	private String name;
	private int year;
	private List<MusicArtist> members;

	public MusicBand2(String name, int year, List<MusicArtist> members ) {
		this.name = name;
		this.year = year;
		this.members = members;
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}
	
	public List<MusicArtist> getMembers() {
		return members;
	}


	public void setMembers(List<MusicArtist> members) {
		this.members = members;
	}
	
	// Метод перехода участников из группы А в Б
		public static void membersGo (MusicBand2 a, MusicBand2 b) {
			for (MusicArtist member: a.getMembers()) {
				b.getMembers().add(member);	
			}
			a.getMembers().clear();
		}
		
		// Метод для вывода списка учсастников в консоль
		
		public void  showMembers () {
			System.out.println(this.members);
		}


	@Override
	public String toString() {
		return "MusicBand [name=" + name +", " +" year=" + year + "]" + "\n";
	}

	
	
	
	
	

}
