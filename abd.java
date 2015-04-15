import javax.swing.*;
import javax.swing.JOptionPane;
public class abd

{
	public static void main (String arg [])
	{
		int i;
		int panjang,hasil;
		int[] angka=new int[3] ;

		String simpan = JOptionPane.showInputDialog(" Masukkan Kata Hitungan Sederhana ");
		panjang = simpan.length();
		System.out.println("jumlah char : "+ panjang);
		
		String[] bagian = simpan.split(" ");
		System.out.println(bagian[0]);
		System.out.println(bagian[1]);
		System.out.println(bagian[2]);
		for(i=0;i<=2;i++)
		{
		switch (bagian[i]) 
			{
			case "satu": angka[i] = 1; break;
			case "dua": angka[i]= 2 ; break;
			case "tiga": angka[i]= 3 ; break;
			case "empat": angka[i]= 4 ; break;
			case "lima": angka[i]= 5 ; break;
			case "enam": angka[i]= 6 ; break;
			case "tujuh": angka[i]= 7 ; break;
			case "delapan": angka[i]= 8 ; break;
			case "sembilan": angka[i]= 9 ; break;
			default: angka[i] = 0; break;
			}
		}
		switch (bagian[1])
			{
			case "tambah":hasil=angka[0]+angka[2]; break;
			case "kurang":hasil=angka[0]-angka[2]; break;
			case "kali":hasil=angka[0]*angka[2]; break;
			case "bagi":hasil=angka[0]/angka[2]; break;
			default: hasil=0;
			}
		System.out.println("Hasilnya adalah "+hasil);
	}
}