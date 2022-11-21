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
public class Venta {
    // declaracion de variables
    private int nVent;
    private double prec;
    private String metPago;
    private String idCli;
    private String idEmp;
    private String matri;
    private String fecVen;
    
    public Venta (){
        
    }

    public Venta(int nVent, double prec, String metPago, String idCli, String idEmp, String matri, String fecVen) {
        this.nVent = nVent;
        this.prec = prec;
        this.metPago = metPago;
        this.idCli = idCli;
        this.idEmp = idEmp;
        this.matri = matri;
        this.fecVen = fecVen;
    }

    @Override
    public String toString() {
        return "Venta{" + "nVent=" + nVent + ", prec=" + prec + ", metPago=" + metPago + ", idCli=" + idCli + ", idEmp=" + idEmp + ", matri=" + matri + ", fecVen=" + fecVen + '}';
    }
    
    static Venta lasVentas[]=new Venta[10];
    
     public static void iniciaVenta(){
        lasVentas[0]= new Venta(001, 6500000.00, "CASH", "A1111", "E111", "AAA-777", "10 DE DICIEMBRE 2018");
        lasVentas[1]= new Venta(002, 6000000.00, "CASH", "A2432", "E111", "AAA-989", "20 DE DICIEMBRE 2018");
  
         for (int w = 2; w < lasVentas.length; w++) {
            lasVentas[w]=new Venta();
         }// fin del for
    }// fin de inicializa.
    
     public static int buscaEspacioVenta(){//devuelve el indice donde
        int ind=-1;                      //hay un espacio vacío
        for (int w = 0; w < lasVentas.length; w++) {
           if(lasVentas[w].getMatri()==null){//encontré un espacio vacío
              ind=w;
              break;
           } 
        }//fin for
        return ind;
    }//fin de buscaEspacio
     
      public static void registraVenta(){
        int posicVacia=buscaEspacioVenta();
        if(posicVacia==-1){
            JOptionPane.showMessageDialog(null,"No hay espacio para"
                    + " registrar una nueva venta");
        }else{
            int nVent=Integer.parseInt(JOptionPane.showInputDialog("digite el numero de venta: "));
            double prec=Double.parseDouble(JOptionPane.showInputDialog("digite el valor de la venta: "));
            String metPago=JOptionPane.showInputDialog("digite el metodo de pago: ").toUpperCase();
            String idCli=JOptionPane.showInputDialog("digite el ID del cliente: ").toUpperCase();
            String idEmp=JOptionPane.showInputDialog("digite el ID del vendedor: ").toUpperCase();
            String matri=JOptionPane.showInputDialog("digite la matricula del vehiculo: ").toUpperCase();
            String fecVen=JOptionPane.showInputDialog("digite la fecha de la venta: ").toUpperCase();
          
           
            
            lasVentas[posicVacia]=new Venta(nVent, prec, metPago, idCli, idEmp, matri, fecVen);
            
        }
    }//fin de registra
      
        public static int buscaVenta(String matri){
        int indLibre=-1;
        for (int w = 0; w < lasVentas.length; w++) {
            if(lasVentas[w].getMatri()!=null)
            {
            if(lasVentas[w].getMatri().equals(matri)){
               indLibre=w;
                break; 
            }  
            
            }//fin if
        }//fin for
        return indLibre;
    }//fin busca 
      
        public static void buscarVenta(){
         String matri=JOptionPane.showInputDialog("indique la mtricula de la venta que desea buscar: ").toUpperCase();
         int posicion= buscaVenta(matri);
         if (posicion==-1) {
             JOptionPane.showMessageDialog(null, matri+" no esta registrada");
             
         }else{
             JOptionPane.showMessageDialog(null, lasVentas[posicion]);       
                     }
     }//fin del buscador.
       
        
          
          
         public static void modificarVenta(){
         String mat=JOptionPane.showInputDialog("indique la matri de la venta a modificar informacion: ").toUpperCase();
         int posicion= buscaVenta(mat);
         if (posicion==-1) {
             JOptionPane.showMessageDialog(null, mat+" no esta registrada");
             
         }else{
             int nVent=Integer.parseInt(JOptionPane.showInputDialog("digite el numero de venta: "));
            double prec=Double.parseDouble(JOptionPane.showInputDialog("digite el valor de la venta: "));
            String metPago=JOptionPane.showInputDialog("digite el metodo de pago: ").toUpperCase();
            String idCli=JOptionPane.showInputDialog("digite el ID del cliente: ").toUpperCase();
            String idEmp=JOptionPane.showInputDialog("digite el ID del vendedor: ").toUpperCase();
            String matri=JOptionPane.showInputDialog("digite la matricula del vehiculo: ").toUpperCase();
            String fecVen=JOptionPane.showInputDialog("digite la fecha de la venta: ").toUpperCase();
          
           
            
            lasVentas[posicion]=new Venta(nVent, prec, metPago, idCli, idEmp, matri, fecVen);
            
                     }
     }//fin del modificador.
         
            public static void eliminarVenta(){
         String matri=JOptionPane.showInputDialog("indique la matricula de la venta que desea borrar: ").toUpperCase();
         int posicion= buscaVenta(matri);
         if (posicion==-1) {
             JOptionPane.showMessageDialog(null, matri+" no esta registrada");
             
         }else{
            
            lasVentas[posicion]= new Venta();// me deja la posiciion en blanco     
                     }
     }//fin del borra 
    
               
          public static void listarVenta(){
       for (int i = 0; i <= lasVentas.length-1; i++) {
                if (lasVentas[i].getMatri()!=null) {
                     JOptionPane.showMessageDialog(null, lasVentas[i]); 
          
                }
            }
    }// fin de listar el arreglo
        
    
    
    // creacion del menu
    public void menuVenta(){
        MenuPrin MenuPrin= new MenuPrin();
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "Elija el menu deseado:\n"
                        + "1 = Ingresar Venta.\n"
                        + "2 = Consultar Venta.\n"
                        + "3 = Lista de Ventas.\n"
                        + "4 = Modificar Venta.\n"
                        + "5 = Eliminar Venta.\n"
                        + "6 = Regresar al Menu Principal.\n" ));
         switch(opcion){
            case(1):
            {
                Venta.registraVenta();
                break;
            }
            
            case(2):
            {
                Venta.buscarVenta();
                break;
            }
            
            case(3):
            {
                Venta.listarVenta();
                break;
            }
            case(4):
            {
                Venta.modificarVenta();
                break;
            }
            
            case(5):
            {
                Venta.eliminarVenta();
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

    public int getnVent() {
        return nVent;
    }

    public void setnVent(int nVent) {
        this.nVent = nVent;
    }

    public double getPrec() {
        return prec;
    }

    public void setPrec(double prec) {
        this.prec = prec;
    }

    public String getMetPago() {
        return metPago;
    }

    public void setMetPago(String metPago) {
        this.metPago = metPago;
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

    public String getFecVen() {
        return fecVen;
    }

    public void setFecVen(String fecVen) {
        this.fecVen = fecVen;
    }

   
}
