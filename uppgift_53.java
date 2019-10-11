/*
 Övning 5.3
 Skapat 2019-10-11
 Programmerare Alexander jonsson näslund
*/
import javax.swing.*;
import java.util.Scanner;

public class uppgift_53 { 
	public static void main(String[] args) {
	
	
	String x = JOptionPane.showInputDialog("höjd i meter från det att bollen släpps"); 
	double X = Double.parseDouble(x);
	double a = 0.01;
	int b = 1;
	while ((0.7 * X * b)<a){
	b = b*2;
	}
	
	}
	}