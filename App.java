/*
* File: App.java
* Author: Orosz Levente
* Copyright: 2022, Orosz Levente
* Group: Szoft I N
* Date: 2022-02-22
* Github: https://github.com/Olevente/
* Licenc: GNU GPL
*/

import java.util.Scanner;

public class App {
	
	public static void main (String[] args) {
		System.out.println("Orosz Levente, 2022.02.22, Szoft-I-N");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Magassag: ");
		double magassag = sc.nextDouble();
		System.out.print("Szog: ");
		double szog = sc.nextDouble();
		
		double tavolsag = 
		magassag/ 
		(szog/180*Math.PI);
		System.out.println("Tavolsag: " + tavolsag);
	}
}

