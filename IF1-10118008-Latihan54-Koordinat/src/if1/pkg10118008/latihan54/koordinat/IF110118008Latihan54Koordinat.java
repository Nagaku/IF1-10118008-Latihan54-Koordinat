/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118008.latihan54.koordinat;

/**
 *
 * @author ASUS
 */
public class IF110118008Latihan54Koordinat {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		WarnaKoordinat wk = new WarnaKoordinat(10, 4, "Jingga");
		System.out.println("Warna Koordinat : "+ wk.getNamaWarna());
		System.out.printf("Koordinat Sumbu x : %d, y : %d\n", wk.getX(), wk.getY());
	}
	
}
