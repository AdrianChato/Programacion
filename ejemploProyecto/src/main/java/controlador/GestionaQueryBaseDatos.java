package controlador;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.jdbc.JdbcConnection;

import dao.JdbcDao;

public class GestionaQueryBaseDatos {

	public static void main(String[] args) {
		JdbcDao dao;
		try {
		dao = new JdbcDao();
		dao.getclaveuser("usuario2");
		} catch (Exception e) {
			e.printStackTrace();
		}
		

}
}