package rockola;

public class Cancion {
    private int idCancion; 
    private String nombre;
    private String artista;
    private String album;
    private int year;
    private String genero;
    private String duracion;
    
    public Cancion(){}
    public Cancion(int idCancion, String nombre, String artista, String album, int year, String genero, String duracion){
    
        setIdCancion(idCancion);
        setNombreCancion(nombre);
        setArtistaCancion(artista);
        setAlbumCancion(album);
        setYearCancion(year);
        setGeneroCancion(genero);
        setDuracionCancion(duracion);
        
        
    }
        
        public final void setIdCancion(int idcancion){idCancion = idcancion;}
        public int getIdCancion(){return idCancion;}
        
        public final void setNombreCancion(String nombrecancion){nombre = nombrecancion;}
        public String getNombreCancion(){return nombre;}
       
        public final void setArtistaCancion(String artistacancion){artista = artistacancion;}
        public String getArtistaCancion(){return artista;}
        
        public final void setAlbumCancion(String albumCancion){album = albumCancion;}
        public String getAlbumCancion(){return album;}
        
        public final void setYearCancion(int yearcancion){year = yearcancion;}
        public int getYearCancion(){return year;}
        
        public final void setGeneroCancion(String generocancion){genero = generocancion;}
        public String getGeneroCancion(){return genero;}
        
        public final void setDuracionCancion(String duracioncancion){duracion = duracioncancion;}
        public String getDuracionCancion(){return duracion;}
}
