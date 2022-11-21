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
public class Proveedor {
    
    private String idProv;
    private String nomProv;
    private String emailProv;
    private String telefProv;
    private String desc;
    
    

    public Proveedor(){
    
    }

    public Proveedor(String idProv, String nomProv, String emailProv, String telefProv, String desc) {
        this.idProv = idProv;
        this.nomProv = nomProv;
        this.emailProv = emailProv;
        this.telefProv = telefProv;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "idProv=" + idProv + ", nomProv=" + nomProv + ", emailProv=" + emailProv + ", telefProv=" + telefProv + ", desc=" + desc + '}';
    }
    
    
    
      static Proveedor losProv[]=new Proveedor[10];
    
     public static void iniciaProv(){
        losProv[0]= new Proveedor("P01", "FACO", "faco@hotmail.com", "88877766", "PROVEEDOR DE VEHICULOS MARCA HONDA" );
     losProv[1]= new Proveedor("P02", "GQ", "GQ@hotmail.com", "88899966", "PROVEEDOR DE VEHICULOS MARCA HYUNDAI Y KIA" );
         for (int w = 2; w < losProv.length; w++) {
            losProv[w]=new Proveedor();
         }// fin del for
    }// fin de inicializa.
    
     public static int buscaEspacioProv(){//devuelve el indice donde
        int ind=-1;                      //hay un espacio vacío
        for (int w = 0; w < losProv.length; w++) {
           if(losProv[w].getIdProv()==null){//encontré un espacio vacío
              ind=w;
              break;
           } 
        }//fin for
        return ind;
    }//fin de buscaEspacio
     
      public static void registraProv(){
        int posicVacia=buscaEspacioProv();
        if(posicVacia==-1){
            JOptionPane.showMessageDialog(null,"No hay espacio para"
                    + " registrar un nuevo proveedor");
        }else{
            
            String idProv=JOptionPane.showInputDialog("digite el ID del proveedor: ").toUpperCase();
            String nomProv=JOptionPane.showInputDialog("digite el nombre del proveedor: ").toUpperCase();
            String emailProv=JOptionPane.showInputDialog("digite el Email de contacto del proveedor: ");
            String telefProv=JOptionPane.showInputDialog("digite el telefono de contacto del proveedor: ").toUpperCase();
            String desc=JOptionPane.showInputDialog("Caracteristicas del proveedor en efecto: ").toUpperCase();
          
           
            
            losProv[posicVacia]=new Proveedor(idProv, nomProv, emailProv, telefProv, desc);
            
        }
    }//fin de registra
      
        public static int buscaProv(String idProv){
        int indLibre=-1;
        for (int w = 0; w < losProv.length; w++) {
            if(losProv[w].getIdProv()!=null)
            {
            if(losProv[w].getIdProv().equals(idProv)){
               indLibre=w;
                break; 
            }  
            
            }//fin if
        }//fin for
        return indLibre;
    }//fin busca 
      
        public static void buscarProv(){
         String idProv=JOptionPane.showInputDialog("indique el ID del proveeedor que desea buscar: ").toUpperCase();
         int posicion= buscaProv(idProv);
         if (posicion==-1) {
             JOptionPane.showMessageDialog(null, idProv+" no esta registrada");
             
         }else{
             JOptionPane.showMessageDialog(null, losProv[posicion]);       
                     }
     }//fin del buscador.
        
        
          public static void listarProv(){
       for (int i = 0; i <= losProv.length-1; i++) {
                if (losProv[i].getIdProv()!=null) {
                     JOptionPane.showMessageDialog(null, losProv[i]); 
          
                }
            }
    }// fin de listar el arreglo
        
          
          
         public static void modificarProv(){
         String id=JOptionPane.showInputDialog("indique el ID del proveedor a modificar informacion: ").toUpperCase();
         int posicion= buscaProv(id);
         if (posicion==-1) {
             JOptionPane.showMessageDialog(null, id+" no esta registrada");
             
         }else{
             String idProv=JOptionPane.showInputDialog("digite el ID del proveedor: ").toUpperCase();
            String nomProv=JOptionPane.showInputDialog("digite el nombre del proveedor: ").toUpperCase();
            String emailProv=JOptionPane.showInputDialog("digite el Email de contacto del proveedor: ");
            String telefProv=JOptionPane.showInputDialog("digite el telefono de contacto del proveedor: ").toUpperCase();
            String desc=JOptionPane.showInputDialog("Caracteristicas del proveedor en efecto: ").toUpperCase();
          
           
            
            losProv[posicion]=new Proveedor(idProv, nomProv, emailProv, telefProv, desc);
                     }
     }//fin del modificador.
         
            public static void eliminarProv(){
         String id=JOptionPane.showInputDialog("indique el ID del Proveedor que desea borrar: ").toUpperCase();
         int posicion= buscaProv(id);
         if (posicion==-1) {
             JOptionPane.showMessageDialog(null, id+" no esta registrada");
             
         }else{
            
            losProv[posicion]= new Proveedor();// me deja la posiciion en blanco     
                     }
     }//fin del borra 
    
    public void menuProveedor(){
        
        //Menu
        //Regresar a Menu 
        MenuPrin MenuPrin = new MenuPrin();
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "Elija el menu deseado:\n"
                        + "1 = Ingresar Proveedor.\n"
                        + "2 = Consultar Proveedor.\n"
                        + "3 = Lista de Proveedores.\n"
                        + "4 = Modificar Proveedor.\n"
                        + "5 = Eliminar Proveedor.\n"
                        + "6 = Regresar al Menu Principal.\n" ));
        
        switch(opcion){
            case(1):
            {
                Proveedor.registraProv();
                break;
            }
            
            case(2):
            {
                Proveedor.buscarProv();
                break;
            }
            
            case(3):
            {
                Proveedor.listarProv();
                break;
            }
            
            case(4):
            {
                Proveedor.modificarProv();
                break;
            }
            
            case(5):
            {
                Proveedor.eliminarProv();
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

    public String getIdProv() {
        return idProv;
    }

    public void setIdProv(String idProv) {
        this.idProv = idProv;
    }

    public String getNomProv() {
        return nomProv;
    }

    public void setNomProv(String nomProv) {
        this.nomProv = nomProv;
    }

    public String getEmailProv() {
        return emailProv;
    }

    public void setEmailProv(String emailProv) {
        this.emailProv = emailProv;
    }

    public String getTelefProv() {
        return telefProv;
    }

    public void setTelefProv(String telefProv) {
        this.telefProv = telefProv;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
