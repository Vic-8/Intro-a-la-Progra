/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase11;

import javax.swing.JOptionPane;

/**
 *
 * @author 
 */
public class Alquiler {
    //declaracion variables
    private int nAlq;
    private double prec;
    private String idCli; 
    private String idEmp;
    private String matri; 
    private String fecSalida;
    private String fecRetorno;
    private String metPago;

    public Alquiler(int nAlq, double prec, String idCli, String idEmp, String matri, String fecSalida, String fecRetorno, String metPago) {
        this.nAlq = nAlq;
        this.prec = prec;
        this.idCli = idCli;
        this.idEmp = idEmp;
        this.matri = matri;
        this.fecSalida = fecSalida;
        this.fecRetorno = fecRetorno;
        this.metPago = metPago;
    }
            
   
    public Alquiler(){
        
    }

    @Override
    public String toString() {
        return "Alquiler{" + "nAlq=" + nAlq + ", prec=" + prec + ", idCli=" + idCli + ", idEmp=" + idEmp + ", matri=" + matri + ", fecSalida=" + fecSalida + ", fecRetorno=" + fecRetorno + ", metPago=" + metPago + '}';
    }
    
     static Alquiler losAl[]=new Alquiler[10];
    
     public static void iniciaAl(){
        losAl[0]= new Alquiler(001, 6500000.00, "A1111", "E111", "AAA-777", "10 DE DICIEMBRE 2018", "18 DE DICIEMBRE 2018", "CASH");
         losAl[0]= new Alquiler(001, 6500000.00, "A1111", "E111", "AAA-777", "10 DE DICIEMBRE 2018", "18 DE DICIEMBRE 2018", "CASH");
  
         for (int w = 2; w < losAl.length; w++) {
            losAl[w]=new Alquiler();
         }// fin del for
    }// fin de inicializa.
    
     public static int buscaEspacioAl(){//devuelve el indice donde
        int ind=-1;                      //hay un espacio vacío
        for (int w = 0; w < losAl.length; w++) {
           if(losAl[w].getMatri()==null){//encontré un espacio vacío
              ind=w;
              break;
           } 
        }//fin for
        return ind;
    }//fin de buscaEspacio
     
      public static void registraAl(){
        int posicVacia=buscaEspacioAl();
        if(posicVacia==-1){
            JOptionPane.showMessageDialog(null,"No hay espacio para"
                    + " registrar una nueva venta");
        }else{
            int nAlq=Integer.parseInt(JOptionPane.showInputDialog("digite el numero de alquiler: "));
            double prec=Double.parseDouble(JOptionPane.showInputDialog("digite el monto por el alquiler: "));
            String idCli=JOptionPane.showInputDialog("digite el ID del cliente: ").toUpperCase();
            String idEmp=JOptionPane.showInputDialog("digite el ID del vendedor: ").toUpperCase();
            String matri=JOptionPane.showInputDialog("digite la matricula del vehiculo: ").toUpperCase();
            String fecSalida=JOptionPane.showInputDialog("digite la fecha de inicio del alquiler: ").toUpperCase();
            String fecRetorno=JOptionPane.showInputDialog("digite la fecha de la finalizacion del alquiler: ").toUpperCase();
            String metPago=JOptionPane.showInputDialog("digite el metodo de pago: ").toUpperCase();
           
            
            losAl[posicVacia]=new Alquiler(nAlq, prec, idCli, idEmp, matri, fecSalida, fecRetorno, metPago);
            
        }
    }//fin de registra
      
        public static int buscaAl(String matri){
        int indLibre=-1;
        for (int w = 0; w < losAl.length; w++) {
            if(losAl[w].getMatri()!=null)
            {
            if(losAl[w].getMatri().equals(matri)){
               indLibre=w;
                break; 
            }  
            
            }//fin if
        }//fin for
        return indLibre;
    }//fin busca 
      
        public static void buscarAl(){
         String matri=JOptionPane.showInputDialog("indique la mtricula del carro alquilado que desea buscar: ").toUpperCase();
         int posicion= buscaAl(matri);
         if (posicion==-1) {
             JOptionPane.showMessageDialog(null, matri+" no esta registrada");
             
         }else{
             JOptionPane.showMessageDialog(null, losAl[posicion]);       
                     }
     }//fin del buscador.
       
        
          
          
         public static void modificarAl(){
         String mat=JOptionPane.showInputDialog("indique la matricula del carro alquilado a modificar informacion: ").toUpperCase();
         int posicion= buscaAl(mat);
         if (posicion==-1) {
             JOptionPane.showMessageDialog(null, mat+" no esta registrada");
             
         }else{
             int nAlq=Integer.parseInt(JOptionPane.showInputDialog("digite el numero de alquiler: "));
            double prec=Double.parseDouble(JOptionPane.showInputDialog("digite el monto por el alquiler: "));
            String idCli=JOptionPane.showInputDialog("digite el ID del cliente: ").toUpperCase();
            String idEmp=JOptionPane.showInputDialog("digite el ID del vendedor: ").toUpperCase();
            String matri=JOptionPane.showInputDialog("digite la matricula del vehiculo: ").toUpperCase();
            String fecSalida=JOptionPane.showInputDialog("digite la fecha de inicio del alquiler: ").toUpperCase();
            String fecRetorno=JOptionPane.showInputDialog("digite la fecha de la finalizacion del alquiler: ").toUpperCase();
            String metPago=JOptionPane.showInputDialog("digite el metodo de pago: ").toUpperCase();
           
            
            losAl[posicion]=new Alquiler(nAlq, prec, idCli, idEmp, matri, fecSalida, fecRetorno, metPago);
           
                     }
     }//fin del modificador.
         
            public static void eliminarAl(){
         String matri=JOptionPane.showInputDialog("indique la matricula del auto alquilado cuya informacion desea borrar: ").toUpperCase();
         int posicion= buscaAl(matri);
         if (posicion==-1) {
             JOptionPane.showMessageDialog(null, matri+" no esta registrada");
             
         }else{
            
            losAl[posicion]= new Alquiler();// me deja la posiciion en blanco     
                     }
     }//fin del borra 
    
               
          public static void listarAl(){
       for (int i = 0; i <= losAl.length-1; i++) {
                if (losAl[i].getMatri()!=null) {
                     JOptionPane.showMessageDialog(null, losAl[i]); 
          
                }
            }
    }// fin de listar el arreglo
        
    
    
    
    // creacion de menu
    public void menuAlquiler(){
        
          MenuPrin MenuPrin = new MenuPrin();
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "Elija el menu deseado:\n"
                        + "1 = Ingresar Alquiler.\n"
                        + "2 = Consultar Alquiler.\n"
                        + "3 = Lista de Ventas.\n"
                        + "4 = Modificar Alquiler.\n"
                        + "5 = Eliminar Alquiler.\n"
                        + "6 = Regresar al Menu Principal.\n" ));
         switch(opcion){
            case(1):
            {
                Alquiler.registraAl();
                break;
            }
            
            case(2):
            {
                Alquiler.buscarAl();
                break;
            }
            case(3):
            {
                Alquiler.listarAl();
                break;
            }
            
            case(4):
            {
                Alquiler.modificarAl();
                break;
            }
            
            case(5):
            {
                Alquiler.eliminarAl();
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

    public int getnAlq() {
        return nAlq;
    }

    public void setnAlq(int nAlq) {
        this.nAlq = nAlq;
    }

    public double getPrec() {
        return prec;
    }

    public void setPrec(double prec) {
        this.prec = prec;
    }

    public String getIdCli() {
        return idCli;
    }

    public void setIdCli(String idCli) {
        this.idCli = idCli;
    }

    public String getIdEmp() {
        return idEmp;
    }

    public void setIdEmp(String idEmp) {
        this.idEmp = idEmp;
    }

    public String getMatri() {
        return matri;
    }

    public void setMatri(String matri) {
        this.matri = matri;
    }

    public String getFecSalida() {
        return fecSalida;
    }

    public void setFecSalida(String fecSalida) {
        this.fecSalida = fecSalida;
    }

    public String getFecRetorno() {
        return fecRetorno;
    }

    public void setFecRetorno(String fecRetorno) {
        this.fecRetorno = fecRetorno;
    }

    public String getMetPago() {
        return metPago;
    }

    public void setMetPago(String metPago) {
        this.metPago = metPago;
    }
}
