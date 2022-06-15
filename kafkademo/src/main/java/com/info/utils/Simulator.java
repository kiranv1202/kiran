package com.info.utils;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

public class Simulator {
	
	public static void insertTaxiZoneData() {
		try {
			FileReader fileReader = new FileReader("C:\\Setup\\dataset\\FHV\\TaxiZones.csv");
			CSVReader csvReader = new CSVReaderBuilder(fileReader).withSkipLines(1).build();
			List<String[]> rows = csvReader.readAll();
			System.out.println(rows.size());
			
			Connection connection = DUtils.getConnection();
			String query = "insert into	taxizone values(?,?,?,?)";
			PreparedStatement prepareStatement = connection.prepareStatement(query);
			
			for (String[] row : rows) {
				prepareStatement.setInt(1, Integer.parseInt(row[0]));
				prepareStatement.setString(2, row[1]);
				prepareStatement.setString(3, row[2]);
				prepareStatement.setString(4, row[3]);
				
				int result = prepareStatement.executeUpdate();
				
				if(result > 0) {
					System.out.println(Integer.parseInt(row[0])+ " record inserted");
				}
				else {
					System.out.println(Integer.parseInt(row[0])+ " not inserted");
				}
			}
			 
			connection.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		insertTaxiZoneData();
	}

}
