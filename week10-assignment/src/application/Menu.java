package application;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import dao.BandDao;
import entities.Band;

public class Menu {
	
	private BandDao bandDao = new BandDao();
	private Scanner scanner = new Scanner(System.in);
	private List<String> options = Arrays.asList(
			"Create Band", 
			"Read Band", 
			"Update Band", 
			"Delete Band");

	public void start() {
		String selection = "";
		
		do {
			printMenu();
			selection = scanner.nextLine();
			
			try {
				if (selection.equals("1")) {
					createBand();
				} else if (selection.equals("2")) {
					readBand();
				}else if (selection.equals("3")) {
					updateBand();
				}else if (selection.equals("4")) {
					deleteBand();
				}
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
				System.out.println("Press enter to continue");
				scanner.nextLine();
		} while(!selection.equals("-1"));
	}
	
	private void printMenu() {
		System.out.println("Select an option: \n");
		for (int i = 0; i < options.size(); i++) {
			System.out.println(i + 1 + ")" + options.get(i));
		}
	}
	
	private void readBand() throws SQLException {
		List<Band> bands = bandDao.getBand();
		for (Band band : bands) {
			System.out.println(band.getBandId() + ": " + band.getName());
		}
	}
	
	private void createBand() throws SQLException {
		System.out.print("Enter new band name: ");
		String bandName = scanner.nextLine();
		bandDao.createNewBand(bandName);
	}
	
	private void deleteBand() throws SQLException {
		System.out.print("Enter band id to delete: ");
		int id = Integer.parseInt(scanner.nextLine());
		bandDao.deleteBandById(id);
	}
	
	private void updateBand() throws SQLException {
		System.out.print("Enter band id to update: ");
		int id = Integer.parseInt(scanner.nextLine());
		bandDao.updateBandById(id);
	}
}
