package com.learn.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class ActorSort implements Comparator<DVDInfo> {
	public int compare(DVDInfo one, DVDInfo two) {
		return one.leadActor.charAt(1) - two.leadActor.charAt(1);
	}
}

class DVDInfo implements Comparable<DVDInfo> {
	String title;
	String genre;
	String leadActor;
	DVDInfo(String t, String g, String l) {
		title = t;
		genre = g;
		leadActor = l;
	}
	
	public int compareTo(DVDInfo d) {
		System.out.println(d.genre.charAt(0) - genre.charAt(0));
		return genre.charAt(1) - d.genre.charAt(1)  ;
	}
	
	public String toString() {
		return title + " | " + genre + " | " + leadActor + "\n";
	}
}
public class ModifiedSort  {

	public static void main(String[] args) {
		DVDInfo p1 = new DVDInfo("f1", "comedy", "srk");
		DVDInfo p2 = new DVDInfo("f2", "drama", "ranbeer");
		DVDInfo p3 = new DVDInfo("f3", "horror", "imraan");
		System.out.println(p2);

		ArrayList<DVDInfo> dvdList = new ArrayList<DVDInfo>();
		dvdList.add(p1); dvdList.add(p2); dvdList.add(p3);
		System.out.println(dvdList);
		
		/*Collections.sort(dvdList);
		System.out.println(dvdList);*/
		ActorSort as = new ActorSort();
		
		Collections.sort(dvdList, as);
		System.out.println(dvdList);
	}

}
