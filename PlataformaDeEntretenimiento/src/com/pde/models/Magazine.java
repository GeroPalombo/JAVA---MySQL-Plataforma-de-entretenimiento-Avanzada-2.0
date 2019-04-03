package com.pde.models;

import java.util.ArrayList;
import java.util.Date;

public class Magazine extends Publication {
	
	private int id;
	
	public Magazine(String title, Date edititionDate, String editorial) {
		super(title, edititionDate, editorial);
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String detailMagazine = "\n :: REVISTAS ::" + 
								"\n Titulo: " + getTitle() +
								"\n Editorial: " + getEditorial() + 
								"\n Año de edicion: " + getEdititionDate() +
								"\n Autor/es: ";
		for (int i = 0; i < getAuthors().length; i++) {
			detailMagazine += "\t" + getAuthors()[i] + " ";
		}
		return  detailMagazine;
	}
	
	public static ArrayList<Magazine> makeMagazineList() {
		ArrayList<Magazine> magazines = new ArrayList();
		String[] authors = new String[3];
		for (int i = 0; i < 3; i++) {
			authors[i] = "Autor "+i;
		}
		for (int i = 1; i <= 5; i++) {
			magazines.add(new Magazine("Revista " + i, new Date(), "Editorial " + i));
		}
		
		return magazines;
	}

}