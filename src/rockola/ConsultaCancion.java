package rockola;
 import java.sql.Connection;
 import java.sql.DriverManager;
 import java.sql.PreparedStatement;
 import java.sql.ResultSet;
 import java.sql.SQLException;
 import java.util.List;
 import java.util.ArrayList;
 import rockola.Cancion;
public class ConsultaCancion {
    
    
     private static final String URL = "jdbc:mysql://187.226.253.81/rockola";
     private static final String NOMBREUSUARIO = "root";
     private static final String CONTRASENIA = "12345";
     Connection conexion = null;
     //Variables de consulta
     private PreparedStatement seleccionarTodasLasCanciones = null;
     private PreparedStatement nuevaCancion = null;
     private PreparedStatement actualizarCancion = null;
     private PreparedStatement eliminarCancion = null;
     private PreparedStatement buscarCancion = null;
     private PreparedStatement buscarYear = null;
     private PreparedStatement buscarArtista = null;
     
     
     
       
     
public ConsultaCancion(){
 try
 {
 conexion = DriverManager.getConnection( URL, NOMBREUSUARIO, CONTRASENIA );

 // crea una consulta que selecciona todas las entradas en la LibretaDirecciones
 seleccionarTodasLasCanciones = conexion.prepareStatement( "SELECT * FROM Cancion" );

 // crea una consulta que selecciona las entradas con un nombre específico
 buscarCancion = conexion.prepareStatement( "SELECT * FROM Cancion WHERE nombre = ?" );
 
 //eliminar cancion
 eliminarCancion = conexion.prepareStatement("DELETE  FROM Cancion WHERE IdCancion = ?");
 
 //actualizar cancion
 actualizarCancion = conexion.prepareStatement("UPDATE Cancion SET nombre=?,artista=?, album=?, year=?, genero=?,duracion=? WHERE IdCancion = ?");

 buscarYear = conexion.prepareStatement( "SELECT * FROM Cancion WHERE year = ?" );
 
 buscarArtista = conexion.prepareStatement( "SELECT * FROM Cancion WHERE artista = ?" );
 // crea instrucción insert para agregar una nueva entrada en la base de 39 datos
 nuevaCancion = conexion.prepareStatement(
 "INSERT INTO Cancion " +
 "( nombre, artista, album, year, genero, duracion  ) " +
 "VALUES ( ?, ?, ?, ?, ?, ? )" );
 

 } // fin de try
 catch ( SQLException excepcionSql )
 { excepcionSql.printStackTrace();
 System.exit( 1 );
 } // fin de catch
 }// fin del constructor de ConsultasPersona
 public List< Cancion > obtenerTodasLasCanciones(){
 List< Cancion > resultados = null;
 ResultSet conjuntoResultados = null;

 try
     {
// executeQuery devuelve ResultSet que contiene las entradas que coinciden
 conjuntoResultados = seleccionarTodasLasCanciones.executeQuery();
 resultados = new ArrayList< Cancion >();
 while ( conjuntoResultados.next() )
 {
 resultados.add( new Cancion(
 conjuntoResultados.getInt( "IdCancion" ),
 conjuntoResultados.getString( "nombre" ),
 conjuntoResultados.getString( "artista" ),
 conjuntoResultados.getString( "album" ),
 conjuntoResultados.getInt("year" ),
 conjuntoResultados.getString( "genero" ), 
 conjuntoResultados.getString( "duracion" )) );
 } // fin de while
 } // fin de try
 catch ( SQLException excepcionSql )
 {
 excepcionSql.printStackTrace();
 } // fin de catch
 finally
 {
 try
 {
 conjuntoResultados.close();
 } // fin de try
 catch ( SQLException excepcionSql )
 {
 excepcionSql.printStackTrace();
 close();
 } // fin de catch
 } // fin de finally

 return resultados;
 } // fin del método obtenerTodasLasPersonaas
 

 

 // agrega una entrada
 public int agregarCancion(String nombre, String artista, String album, String year, String genero, String duracion ){
 int resultado = 0;// establece los parámetros, después ejecuta insertarNuevaCancion
try
 {
 nuevaCancion.setString( 1, nombre );
 nuevaCancion.setString( 2, artista );
 nuevaCancion.setString( 3, album );
 nuevaCancion.setString( 4, year );
 nuevaCancion.setString( 5, genero );
 nuevaCancion.setString( 6, duracion );

 // inserta la nueva entrada; devuelve # de filas actualizadas
 resultado = nuevaCancion.executeUpdate();
 } // fin de try
 catch ( SQLException excepcionSql )
 {
 excepcionSql.printStackTrace();
 close();
 } // fin de catch

 return resultado;
 } // fin del método agregarCancion
 //metodo actualizar cancion
 public int modificarCancion(String IdC, String nC, String aC, String alC, String aY, String gC, String dC){
     int resultado=0;
     try{
     
     actualizarCancion.setString(1, nC);
     actualizarCancion.setString(2, aC);
     actualizarCancion.setString(3, alC);
     actualizarCancion.setString(4, aY);
     actualizarCancion.setString(5, gC);
     actualizarCancion.setString(6, dC);
     actualizarCancion.setString(7, IdC);
     resultado = actualizarCancion.executeUpdate();
     }catch(SQLException ex){
         ex.printStackTrace();
         close();
     }return resultado;
 }
 //fin del metodo modificar cancion
 //METODO BUSCAR
 public List<Cancion> encontrarCancion(String nomB){
     List<Cancion> resultados = null;
     ResultSet conjuntoCancion = null;//resultado de la consulta
     try{
         buscarCancion.setString(1, nomB);
         conjuntoCancion = buscarCancion.executeQuery();//consulta
         resultados = new ArrayList<Cancion>();
         while(conjuntoCancion.next()){
             resultados.add(new Cancion(
             conjuntoCancion.getInt("IdCancion"),
             conjuntoCancion.getString("nombre"),
             conjuntoCancion.getString("artista"),
             conjuntoCancion.getString("album"),
             conjuntoCancion.getInt("year"),
             conjuntoCancion.getString("genero"),
             conjuntoCancion.getString("duracion")));
         }
     }catch(SQLException exs){
         exs.printStackTrace();
     }finally{try{
         conjuntoCancion.close();
     }catch(SQLException ex){
         ex.printStackTrace();
         close();
     }}return resultados;
 }
 //METODO BORRAR CANCION
 public int borrarCancion(String IdC){
     int resultado = 0;
     try{
         eliminarCancion.setString(1, IdC);
         resultado = eliminarCancion.executeUpdate();
     }catch(SQLException ex){
         ex.printStackTrace();
         close();
     }return resultado;
 }
 
 public ResultSet encontrarCancionYear(String year){
        ResultSet conjuntoCancion = null;
        try{
            buscarYear.setString(1, year);
            conjuntoCancion = buscarYear.executeQuery();
        }catch(SQLException e){ 
            e.printStackTrace(); 
        }return conjuntoCancion;
 }
 
 public ResultSet encontrarCancionArtista(String artista){
        ResultSet conjuntoCancion = null;
        try{
            buscarArtista.setString(1, artista);
            conjuntoCancion = buscarArtista.executeQuery();
        }catch(SQLException e){ 
            e.printStackTrace(); 
        }return conjuntoCancion;
 }

 // cierra la conexión a la base de datos
 public void close()
 {
 try
 {
 conexion.close();
 } // fin de try
 catch ( SQLException excepcionSql )
     {
excepcionSql.printStackTrace();
} // fin de catch
} // fin del método close
} // fin de la interfaz ConsultasPersona