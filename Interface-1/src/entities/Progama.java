package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.AluguelCarro;
import model.Veiculo;

public class Progama {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy  HH:mm");
		
		System.out.println("Informações sobre a locação");
		System.out.println("Modelo do carro: ");
		String modelo = sc.nextLine();
		System.out.println("REtirada (dd/MM/yyyy HH:mm)");
		Date comeco = sdf.parse(sc.nextLine());
		System.out.println("Devolução (dd/MM/yyyy HH:mm)");
		Date fim = sdf.parse(sc.nextLine());
		AluguelCarro ac = new AluguelCarro(comeco, fim,  new Veiculo(modelo));
		
		System.out.println("Valor da hora: ");
		double valorHora = sc.nextDouble();
		System.out.println("Valor do dia");

	}

}
