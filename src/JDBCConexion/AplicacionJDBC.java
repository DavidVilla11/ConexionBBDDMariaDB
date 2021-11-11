package JDBCConexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AplicacionJDBC {

	public static void main(String[] args) {
		//Consulta departamentos
		
		//insertarInfoDepartarmentosITBBDD();
		//insertarInfoDepartarmentosComBBDD();
		//modificarInfoToITyCOMBBDD();
		//modificarInfoToTICBBDD();
		//borrarInfo50BBDD();
		//borrarInfo60BBDD();
		//consultarInfoDepartamentosBBDD();
		
		//Consulta Epleados
		
		
		//insertarInfoEmpleadoBBDD();
		//modificarInfoEmpleadosBBDD();
		//borrarInfoEmpleadoBBDD();
		//consultarInfoEmpleadosBBDD();
		
    }
	
	public static Connection getConexion() {
		Connection conexion = null;
        try
        {
        	Class.forName("org.mariadb.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mariadb://localhost:3306/aadd", "DVilla11", "admin");
            if (conexion != null)            
                System.out.println("Connected");           
            else          
                System.out.println("Not Connected");         
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return conexion;
		
	}	
    public static void insertarInfoDepartarmentosITBBDD()
    {
        int DeptNum = 50;
        String DeptNombre = "Informática";
        String DeptLocalizacion = "Madrid";
            
        try
        {
            Connection conexion =getConexion();
            Statement stmt = conexion.createStatement();
            String q1 = "insert into departamentos values('" +DeptNum+ "', '" +DeptNombre+
                                  "', '" +DeptLocalizacion+ "')";
            int x = stmt.executeUpdate(q1);
            if (x > 0)           
                System.out.println("Successfully Inserted");           
            else          
                System.out.println("Insert Failed");            
            conexion.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    public static void insertarInfoDepartarmentosComBBDD()
    {
        int DeptNum = 60;
        String DeptNombre = "Comunicaciones";
        String DeptLocalizacion = "Madrid";
            
        try
        {
            Connection conexion =getConexion();
            Statement stmt = conexion.createStatement();
            String q1 = "insert into departamentos values('" +DeptNum+ "', '" +DeptNombre+
                                  "', '" +DeptLocalizacion+ "')";
            int x = stmt.executeUpdate(q1);
            if (x > 0)           
                System.out.println("Successfully Inserted");           
            else          
                System.out.println("Insert Failed");            
            conexion.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    public static void modificarInfoToITyCOMBBDD()
    {
        int DeptNum = 60;
        String DeptNombre = "Comunicaciones";
        String DatoModificar = "Informatica y Comunicaciones";
        try
        {
            Connection conexion =getConexion();
            Statement stmt = conexion.createStatement();
            String q1 = "UPDATE departamentos set dnombre = '" + DatoModificar +
                    "' WHERE dept_no = '" +DeptNum+ "' AND dnombre = '" + DeptNombre + "'";
            int x = stmt.executeUpdate(q1);
            if (x > 0)           
                System.out.println("Successfully update");           
            else          
                System.out.println("Update Failed");            
            conexion.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    public static void modificarInfoToTICBBDD()
    {
        int DeptNum = 50;
        String DeptNombre = "Informática";
        String DatoModificar = "TIC";
        try
        {
            Connection conexion =getConexion();
            Statement stmt = conexion.createStatement();
            String q1 = "UPDATE departamentos set dnombre = '" + DatoModificar +
                    "' WHERE dept_no = '" +DeptNum+ "' AND dnombre = '" + DeptNombre + "'";
            int x = stmt.executeUpdate(q1);
            if (x > 0)           
                System.out.println("Successfully update");           
            else          
                System.out.println("Update Failed");            
            conexion.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
 
    
    public static void borrarInfo60BBDD()
    {
        int DeptNum = 60;
        String DeptNombre = "Informatica y Comunicaciones";
        try
        {
            Connection conexion =getConexion();
            Statement stmt = conexion.createStatement();
            // Deleting from database
            String q1 = "DELETE from departamentos WHERE dept_no = '" + DeptNum +
                  "' AND dnombre = '" + DeptNombre + "'";     
            
            int x = stmt.executeUpdate(q1);
            if (x > 0)           
                System.out.println("Successfully delete");           
            else          
                System.out.println("Delete Failed");            
            conexion.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    public static void borrarInfo50BBDD()
    {
        int DeptNum = 50;
        String DeptNombre = "TIC";
        try
        {
            Connection conexion =getConexion();
            Statement stmt = conexion.createStatement();
            // Deleting from database
            String q1 = "DELETE from departamentos WHERE dept_no = '" + DeptNum +
                  "' AND dnombre = '" + DeptNombre + "'";     
            
            int x = stmt.executeUpdate(q1);
            if (x > 0)           
                System.out.println("Successfully delete");           
            else          
                System.out.println("Delete Failed");            
            conexion.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    public static void consultarInfoDepartamentosBBDD()
    {
        int DeptNumero = 50;
        String oficio = "empleado";
        try
        {
            Connection conexion =getConexion();
            Statement stmt = conexion.createStatement();
            String q1 = "select * from departamentos WHERE dept_no = '" + DeptNumero +
                    "'";
			ResultSet rs = stmt.executeQuery(q1);
			 if (rs.next())
			   {
			       System.out.println("dept_no : " + rs.getString(1));
			       System.out.println("dnombre :" + rs.getString(2));
			       System.out.println("localizacion :" + rs.getString(3
			    		   ));
			    }
			else
			{
			 System.out.println("No such user id is already registered");
			}    
            conexion.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    /////////////////////////////////////////////////////////////////////////////
    
    
    public static void insertarInfoEmpleadoBBDD()
    {
        int NumEmpleado = 8001;
        String Apellido = "JUSTO";
        String Oficio = "PROG. MP";
        int CodigoDirector = 7782;
        String FechaAlta = "2021-11-10";
        float Salario = 1570;
        float Comision = 0;
        int NumDept = 50;
            
        try
        {
            Connection conexion =getConexion();
            Statement stmt = conexion.createStatement();
            String q1 = "insert into empleados values('" +NumEmpleado+ "', '" +Apellido+
                                  "', '" +Oficio+ "', '" +CodigoDirector+ "', '" +FechaAlta+ "', '" +Salario+ 
                                  "', '" +Comision+ "', '" +NumDept+ "' )";
            int x = stmt.executeUpdate(q1);
            if (x > 0)           
                System.out.println("Successfully Inserted");           
            else          
                System.out.println("Insert Failed");            
            conexion.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    public static void modificarInfoEmpleadosBBDD()
    {
        int NumEmpleado = 8001;
        float Salario = 1570;
        int NumDept = 50;
        int NuevoNumEmpleado = 7369;
        float NuevoSalario = 1105;
        try
        {
            Connection conexion =getConexion();
            Statement stmt = conexion.createStatement();
            String q1 = "UPDATE empleados set emp_no = '" + NuevoNumEmpleado + "' AND salario = '" + NuevoSalario + 
                    "' WHERE emp_no = '" +NumEmpleado+ "' AND dept_no = '" + NumDept + "'";
            int x = stmt.executeUpdate(q1);
            if (x > 0)           
                System.out.println("Successfully update");           
            else          
                System.out.println("Update Failed");            
            conexion.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    public static void borrarInfoEmpleadoBBDD()
    {
        int EmpNum = 7499;
        
        try
        {
            Connection conexion =getConexion();
            Statement stmt = conexion.createStatement();
            // Deleting from database
            String q1 = "DELETE from empleados WHERE emp_no = '" + EmpNum +
                  "'";     
            
            int x = stmt.executeUpdate(q1);
            if (x > 0)           
                System.out.println("Successfully delete");           
            else          
                System.out.println("Delete Failed");            
            conexion.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    public static void consultarInfoEmpleadosBBDD()
    {   
        String Apellido = "J%";
        int salario = 1500;
        try
        {
            Connection conexion =getConexion();
            Statement stmt = conexion.createStatement();
            String q1 = "select * from empleados e  inner join departamentos d using (dept_no) WHERE e.apellido like '" + Apellido +
                    "' AND e.salario > '" + salario  + "'" ;
			ResultSet rs = stmt.executeQuery(q1);
			 if (rs.next())
			   {
			       System.out.println("Dept_no : " + rs.getString(1));
			       System.out.println("Emp_no :" + rs.getString(2));
			       System.out.println("Apellido :" + rs.getString(3));
			       System.out.println("Oficio :" + rs.getString(4));
			       System.out.println("dir :" + rs.getString(5));
			       System.out.println("Fecha_Alta :" + rs.getString(6));
			       System.out.println("salario :" + rs.getString(7));
			       System.out.println("dnombre :" + rs.getString(9));
			       System.out.println("localizacion :" + rs.getString(10));
			       
			    }
			else
			{
			 System.out.println("No such user id is already registered");
			}    
            conexion.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    
}
