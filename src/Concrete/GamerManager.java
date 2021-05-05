package Concrete;

import java.util.Scanner;

import Abstract.GamerManagerInterface;
import Entities.Gamer;

public class GamerManager implements GamerManagerInterface{

	@Override
	public void register(Gamer gamer) {
		System.out.println("Oyuncu kaydi yapildi");
		System.out.println("Kaydedilen oyuncu bilgileri:");
		showGamerProperties(gamer);
	}

	@Override
	public void multipleRegister(Gamer[] gamers) {
		for(Gamer gamer : gamers) {
			System.out.println("Oyuncu kaydi yapildi");
			System.out.println("Kaydedilen oyuncu bilgileri:");
			showGamerProperties(gamer);
		}
	}

	@Override
	public void unregister(Gamer gamer) {
		System.out.println("Oyuncu kaydi silindi");
		System.out.println("Silinen oyuncu bilgileri: ");
		showGamerProperties(gamer);
	}

	@Override
	public void multipleUnregister(Gamer[] gamers) {
		for(Gamer gamer : gamers) {
		System.out.println("Oyuncu kaydi silindi");
		System.out.println("Silinen oyuncu bilgileri: ");
		showGamerProperties(gamer);
		}
	}

	@Override
	public void updateInformation(Gamer gamer) {
		Scanner scanner = new Scanner(System.in);
		int operation;
		boolean goOn = true;
		while(goOn) {
			System.out.print("Guncellenecek alani seciniz:"
					+ "\n\t1. Nationality id degistir"
					+ "\n\t2. First name degistir"
					+ "\n\t3. Last name degistir"
					+ "\n\t4. Date of birth degistir"
					+ "\n\t5. Guncellemeden cikmak icin 5'e basiniz"
					+ "\n\tIsleminiz: ");
			operation = scanner.nextInt();
			scanner.nextLine();
			switch(operation) {
				case 1:
					System.out.print("Guncelleme oncesi nationality id: " + gamer.getNationalityId()
										+ "\nYeni nationality id: ");
					gamer.setNationalityId(scanner.nextLine());
					System.out.println("Guncel nationality id: " + gamer.getNationalityId());
					break;
				case 2:
					System.out.print("Onceki first name: " + gamer.getFirstName()
										+ "\nYeni first name: ");
					gamer.setFirstName(scanner.nextLine());
					System.out.println("Guncel first name: " + gamer.getFirstName());
					break;
				case 3:
					System.out.print("Onceki last name: " + gamer.getLastName()
										+ "\nYeni last name: ");
					gamer.setLastName(scanner.nextLine());
					System.out.println("Guncel last name: " + gamer.getLastName());
					break;
				case 4:
					System.out.print("Onceki date of birth: " + gamer.getDateOfBirth()
										+ "\nYeni date of birth: ");
//					gamer.setDateOfBirth(gamer.getDateOfBirth()); // Ekstra islemler yapilmali
					System.out.println("Guncel date of birth: " + gamer.getDateOfBirth());
					break;
				case 5:
					goOn = false;
					System.out.println("Guncellemeden cikis yapiliyor");
					break;
				default:
					System.out.println("Gecerli bir islem giriniz");
			}
		}
	}
	
	@Override
	public void showGamerProperties(Gamer gamer) {
		System.out.println("\tOyuncu nationality id: " + gamer.getNationalityId()
							+ "\n\tOyuncu first name: " + gamer.getFirstName()
							+ "\n\tOyuncu last name: " + gamer.getLastName()
							+ "\n\tOyuncu date of birth: " + gamer.getDateOfBirth());
	}
}














