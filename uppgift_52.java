/*
 Övning 5.2
 Skapat 2019-10-10
 Programmerare Alexander jonsson näslund
*/
import javax.swing.*;
import java.util.Scanner;

public class uppgift_52 { 
	public static void main(String[] arg) {
	String x = JOptionPane.showInputDialog("n?"); 
	int n = Integer.parseInt(x);
	int summan = 1;
	int k = 1;
	while (k <= n) {
		summan = summan / k;
		k = k + 1;
	}
	JOptionPane.showMessageDialog(null,"Summan blir" + summan);
	}
	}