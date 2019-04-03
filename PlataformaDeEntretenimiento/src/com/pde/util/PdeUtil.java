package com.pde.util;

import java.util.Scanner;

public class PdeUtil {
	
	public static int validateUserResponseMenu(int min, int max) {
		//Leer la respuesta del usuario
		Scanner sc = new Scanner(System.in);
		
		//Validar respuesta int
		while(!sc.hasNextInt()) {
			sc.next();
			System.out.println("No ingreso una opción válida!");
			System.out.println("Intente otra vez!");
		}
		
		int response = sc.nextInt();
		
		//Validar rango de respuesta
		while(response < min || response > max) {
			//Solicitar de nuevo la respuesta
			System.out.println("No ingreso una opción válida!");
			System.out.println("Intente otra vez!");
			
			while(!sc.hasNextInt()) {
				sc.next();
				System.out.println("No ingreso una opción válida!");
				System.out.println("Intente otra vez!");
			}
			response = sc.nextInt();
		}
		System.out.println("Su Respuesta fue: " + response + "\n");
		return response;
	}

}
