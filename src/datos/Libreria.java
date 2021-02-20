package datos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
public class Libreria {
	public Connection conn;
	public PreparedStatement sen;
	public ResultSet res;
	public String driver = "com.mysql.jdbc.Driver";
	public String cadena = "jdbc:mysql://localhost/sistemaMatricula";
	public String usuario = "root";
	public String clave = "oracle";
	public Connection conectar() {
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(cadena, usuario, clave);
		}catch(ClassNotFoundException e1) {
			JOptionPane.showMessageDialog(null, "Error en el driver");
		}catch(SQLException e2) {
			JOptionPane.showMessageDialog(null, "Error en la conexion");
		}
		return conn;
	}
	public void procesar_reporte(String reporte,String consulta) {
        try {
            conn=conectar();
            String sql=consulta;
            String ruta="src/reportes/"+reporte+".jrxml";
            JasperDesign jd=JRXmlLoader.load(ruta);
            JRDesignQuery jrdq=new JRDesignQuery();
            jrdq.setText(sql);
            jd.setQuery(jrdq);
            JasperReport jr=JasperCompileManager.compileReport(jd);
            JasperPrint jp=JasperFillManager.fillReport(jr, null,conn);
            JasperViewer.viewReport(jp,false);
        }catch(Exception e3) {
            JOptionPane.showMessageDialog(null, "Error al generar reporte");
        }
	}
        public boolean insertar(int dniA, String nombreA, String apellidosA, String sexoA, String direccionA, String gradoA, String repiteA, int dniP, String nombreP, String apellidosP, String direccionP, String sexoP, String parentescoP, int telefono, int fecha, String mes, int año, String lugar, int edadA, int edadP ) {
		try {
			conn = conectar();
			String sql="INSERT INTO alumnos VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			sen=conectar().prepareStatement(sql);
			sen.setInt(1, dniA);
			sen.setString(2, nombreA);
			sen.setString(3, apellidosA);
			sen.setString(4, sexoA);
			sen.setString(5, direccionA);
			sen.setString(6, gradoA);
			sen.setString(7, repiteA);
			sen.setInt(8, dniP);
			sen.setString(9, nombreP);
			sen.setString(10, apellidosP);
			sen.setString(11, direccionP);
			sen.setString(12, sexoP);
			sen.setString(13, parentescoP);
			sen.setInt(14, telefono);
			sen.setInt(15, fecha);
			sen.setString(16, mes);
			sen.setInt(17, año);
			sen.setString(18, lugar);
			sen.setInt(19, edadA);
			sen.setInt(20, edadP);
			sen.executeUpdate();
		}catch(SQLException e3) {
			System.out.println("Error en el proceso de registro");
		}
		return true;
	}
        public void eliminarDatos(int dniA) {
        	try {
        		conn=conectar();
        		String sql="delete from alumnos where dniA="+dniA;
        		sen=conectar().prepareStatement(sql);
        		sen.execute(sql);
        		
        	}catch(Exception e3) {
        		System.out.println("Error al eliminar alumno");
        	}
        }
        public void buscar(String reporte,String consulta, int dniA) {
            try {
                conn=conectar();
                String sql=consulta;
                String ruta="src/reportes/"+reporte+".jrxml";
                JasperDesign jd=JRXmlLoader.load(ruta);
                Map<String,Object> map=new HashMap<String,Object>();
                map.clear();
                map.put("dniA", dniA);
                JRDesignQuery jrdq=new JRDesignQuery();
                jrdq.setText(sql);
                jd.setQuery(jrdq);
                JasperReport jr=JasperCompileManager.compileReport(jd);
                JasperPrint jp=JasperFillManager.fillReport(jr, map,conn);
                JasperViewer.viewReport(jp,false);
            }catch(Exception e3) {
                JOptionPane.showMessageDialog(null, "Error al generar reporte");
            }
        }
}
