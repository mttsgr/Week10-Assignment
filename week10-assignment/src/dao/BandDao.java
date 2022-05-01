package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entities.Band;

public class BandDao {
	
	private Connection connection; 
	private final String GET_BANDS_QUERY = "SELECT * FROM bands";
	private final String GET_BAND_BY_ID_QUERY = "SELECT * FROM bands WHERE id = ?";
	private final String CREATE_NEW_BAND_QUERY = "INSERT INTO bands(name) VALUES(?)";
	private final String DELETE_BAND_BY_ID_QUERY = "DELETE FROM bands WHERE id = ?";
	private final String UPDATE_BAND_BY_ID_QUERY = "UPDATE bands SET name = ?";
	
	public BandDao() {
		connection = DBConnection.getConnection();
	}
	
	public List<Band> getBand() throws SQLException{
		ResultSet rs = connection.prepareStatement(GET_BAND_BY_ID_QUERY).executeQuery();
		List<Band> bands = new ArrayList<Band>();
		return bands;
		}
	public void createNewBand(String bandName) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(CREATE_NEW_BAND_QUERY);
		ps.setString(1,  bandName);
		ps.executeUpdate();
	}
	
	public void deleteBandById(int bandId) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(DELETE_BAND_BY_ID_QUERY);
		ps.setInt(1,  bandId);
		ps.executeUpdate();
		
	}
	public void updateBandById(int bandId) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(UPDATE_BAND_BY_ID_QUERY);
		ps.setInt(1,  bandId);
		ps.executeUpdate();
	}

}
