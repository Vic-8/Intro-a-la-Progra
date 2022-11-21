/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase11;

import javax.swing.JOptionPane;


public class Auto {
 
   
   
//declaracion de arreglo inicial.
    static Auto losAutos[]=new Auto[10];
    
    
    // declaracion de la variables.
    
    private int cant;
    private double prec;
    private String matri;
    private String est;
    private String marca; 
    private String modelo;
    private String nomProv;
    private String descAuto;

   public static void inicAutos(){
       losAutos[1]=new Auto(1, 600000.00, "AAA-989", "NUEVO", "HONDA", "CIVIC-2018", "FACO", "BLANCO CON INTERIOR NEGRO");
       losAutos[0]=new Auto(1, 650000.00, "AAA-777", "NUEVO", "HYUDAI", "ACCENT-2018", "GQ", "NEGRO CON INTERIOR NEGRO");
       for (int w = 2; w < losAutos.length; w++) {
            losAutos[w]=new Auto();
        }
   }
   
    public static int buscaEspacioAutos(){//devuelve el indice donde
        int ind=-1;                      //hay un espacio vacío
        for (int w = 0; w < losAutos.length; w++) {
           if(losAutos[w].getMatri()==null){//encontré un espacio vacío
              ind=w;
              break;
           } 
        }//fin for
        return ind;
    }//fin de buscaEspacio
    
      public static void registraAuto(){
        int posicVacia=buscaEspacioAutos();
        if(posicVacia==-1){
            JOptionPane.showMessageDialog(null,"No hay espacio para"
                    + " un nuevo Carro");
        }else{
            int cant=1;
            double prec=Double.parseDouble(JOptionPane.showInputDialog("Digite el precio del carro: ").toUpperCase());
            String matri=JOptionPane.showInputDialog("digite la Matricula del vehiculo: ").toUpperCase();
            String est=JOptionPane.showInputDialog("digite el Estado del vehiculo: ").toUpperCase();
            String marca=JOptionPane.showInputDialog("digite la Marca del vehiculo: ").toUpperCase();
            String modelo=JOptionPane.showInputDialog("digite el Modelo del vehiculo: ").toUpperCase();
            String nomProv=JOptionPane.showInputDialog("digite el nombre del Proveedor del vehiculo: ").toUpperCase();
            String descAuto=JOptionPane.showInputDialog("digite la descripcion del vehiculo: ").toUpperCase();
            
            
            losAutos[posicVacia]=new Auto(cant, prec, matri, est, marca, modelo, nomProv, descAuto);
            
        }
    }//fin de registra
      
        public static int buscaMatri(String matri){
        int indLibre=-1;
        for (int w = 0; w < losAutos.length; w++) {
            if(losAutos[w].getMatri()!=null)
            {
            if(losAutos[w].getMatri().equals(matri)){
               indLibre=w;
                break; 
            }  
            
            }//fin if
        }//fin for
        return indLibre;
    }//fin busca 
      
        public static void buscarAuto(){
         String matri=JOptionPane.showInputDialog("indique la matricula que desea buscar: ").toUpperCase();
         int posicion= buscaMatri(matri);
         if (posicion==-1) {
             JOptionPane.showMessageDialog(null, matri+" no esta registrada");
             
         }else{
             JOptionPane.showMessageDialog(null, losAutos[posicion]);       
                     }
     }//fin del buscador de carro.
    
        public static void listarAutos(){
            for (int i = 0; i <= losAutos.length-1; i++) {
                if (losAutos[i].getMatri()!=null) {
                     JOptionPane.showMessageDialog(null, losAutos[i]);
          
                }
            }
           
        
    }// fin de listar el arreglo
        
      
         public static void modificarAuto(){
         String mat=JOptionPane.showInputDialog("indique la matricula del auto que desea modificar: ").toUpperCase();
         int posicion= buscaMatri(mat);
         if (posicion==-1) {
             JOptionPane.showMessageDialog(null, mat+" no esta registrada");
             
         }else{
             int cant=1;
             double prec=Double.parseDouble(JOptionPane.showInputDialog("Digite el precio del carro: ").toUpperCase());
            String matri=JOptionPane.showInputDialog("digite la Matricula del vehiculo: ").toUpperCase();
            String est=JOptionPane.showInputDialog("digite el Estado del vehiculo: ").toUpperCase();
            String marca=JOptionPane.showInputDialog("digite la Marca del vehiculo: ").toUpperCase();
            String modelo=JOptionPane.showInputDialog("digite el Modelo del vehiculo: ").toUpperCase();
            String nomProv=JOptionPane.showInputDialog("digite el nombre del Proveedor del vehiculo: ").toUpperCase();
            String descAuto=JOptionPane.showInputDialog("digite la descripcion del vehiculo: ").toUpperCase();
            
            losAutos[posicion]= new Auto (cant, prec, matri, est, marca, modelo, nomProv, descAuto);     
                     }
     }//fin del modificador de carro.
         
          public static void eliminarAuto(){
         String mat=JOptionPane.showInputDialog("indique la matricula del auto que desea borrar: ").toUpperCase();
         int posicion= buscaMatri(mat);
         if (posicion==-1) {
             JOptionPane.showMessageDialog(null, mat+" no esta registrada");
             
         }else{
            
            losAutos[posicion]= new Auto();//este Auto() me deja la posiciion en blanco     
                     }
     }//fin del borra carro.
      
      
     // menu
     public void menuAuto(){
        MenuPrin MenuPrin= new MenuPrin();
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "Elija el menu deseado:\n"
                        + "1 = Ingresar Auto.\n"
                        + "2 = Consultar Auto.\n"
                        + "3 = Lista de Autos.\n"
                        + "4 = Modificar Auto.\n"
                        + "5 = Eliminar Carro.\n"
                        + "6 = Regresar al Menu Principal.\n"));
         switch(opcion){
            case(1):
            {
           
                Auto.registraAuto();
               
                break;
            }
            
            case(2):
            {
                Auto.buscarAuto();
                break;
            }
            
            case(3):
            {
                Auto.listarAutos();
                break;
            }
            
            case(4):
            {
                Auto.modificarAuto();
                break;
            }
            
            case(5):
            {
                 Auto.eliminarAuto();
                break;
            }
            case(6):
            {
                MenuPrin.MenuPrin();
                break;
                
            }
               default:
            {
                JOptionPane.showMessageDialog(null, "opcion no valida");
                 MenuPrin.MenuPrin();
            }
         }
    }
    
    
    public Auto(int cant, double prec, String matri, String est, String marca, String modelo, String nomProv, String descAuto) {
        this.cant = cant;
        this.prec = prec;
        this.matri = matri;
        this.est = est;
        this.marca = marca;
        this.modelo = modelo;
        this.nomProv = nomProv;
        this.descAuto = descAuto;
    }
    
    public Auto(){
        
    }
    
    
    
   

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public double getPrec() {
        return prec;
    }

    public void setPrec(double prec) {
        this.prec = prec;
    }

    public String getMatri() {
        return matri;
    }

    public void setMatri(String matri) {
        this.matri = matri;
    }

    public String getEst() {
        return est;
    }

    public void setEst(String est) {
        this.est = est;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNomProv() {
        return nomProv;
    }

    public void setNomProv(String nomProv) {
        this.nomProv = nomProv;
    }

    public String getDescAuto() {
        return descAuto;
    }

    public void setDescAuto(String descAuto) {
        this.descAuto = descAuto;
    }

    @Override
    public String toString() {
        return "Auto{" + "cant=" + cant + ", prec=" + prec + ", matri=" + matri + ", est=" + est + ", marca=" + marca + ", modelo=" + modelo + ", nomProv=" + nomProv + ", descAuto=" + descAuto + '}';
    }
    
    
}
