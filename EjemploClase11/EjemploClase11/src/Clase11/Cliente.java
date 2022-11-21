/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase11;

import javax.swing.JOptionPane;

/**
 *
 * 
 */
public class Cliente {

    @Override
    public String toString() {
        return "Cliente{" + "idCli=" + idCli + ", nomCli=" + nomCli + ", emailCli=" + emailCli + ", telefCli=" + telefCli + ", geneCli=" + geneCli + '}';
    }
    private String idCli;
    private String nomCli;
    private String emailCli;
    private String telefCli;
    private String geneCli;

    public Cliente(String idCli, String nomCli, String emailCli, String telefCli, String geneCli) {
        this.idCli = idCli;
        this.nomCli = nomCli;
        this.emailCli = emailCli;
        this.telefCli = telefCli;
        this.geneCli = geneCli;

    }

    

    public Cliente(){
    
    }
    
      public String getIdCli() {
        return idCli;
    }

    public void setIdCli(String idCli) {
        this.idCli = idCli;
    }

    public String getNomCli() {
        return nomCli;
    }

    public void setNomCli(String nomCli) {
        this.nomCli = nomCli;
    }

    public String getEmailCli() {
        return emailCli;
    }

    public void setEmailCli(String emailCli) {
        this.emailCli = emailCli;
    }

    public String getTelefCli() {
        return telefCli;
    }

    public void setTelefCli(String telefCli) {
        this.telefCli = telefCli;
    }

    public String getGeneCli() {
        return geneCli;
    }

    public void setGeneCli(String geneCli) {
        this.geneCli = geneCli;
    }
    

  
    
    static Cliente losCltes[]=new Cliente[10];
    
    public static void iniciaCltes(){
        losCltes[0]= new Cliente("A2432", "CARLOS PEREZ", "carlos@gmail.com", "22945496", "MASCULINO" );
        losCltes[1]= new Cliente("A1111", "DANIEL PEREZ", "daniel@gmail.com", "24944796", "MASCULINO" );
         for (int w = 2; w < losCltes.length; w++) {
            losCltes[w]=new Cliente();
         }// fin del for
    }// fin de inicializa.
    
     public static int buscaEspacioCltes(){//devuelve el indice donde
        int ind=-1;                      //hay un espacio vacío
        for (int w = 0; w < losCltes.length; w++) {
           if(losCltes[w].getIdCli()==null){//encontré un espacio vacío
              ind=w;
              break;
           } 
        }//fin for
        return ind;
    }//fin de buscaEspacio
     
      public static void registraClte(){
        int posicVacia=buscaEspacioCltes();
        if(posicVacia==-1){
            JOptionPane.showMessageDialog(null,"No hay espacio para"
                    + " registrar un nuevo Cliente");
        }else{
            
            String idCli=JOptionPane.showInputDialog("digite la cedula del cliente: ").toUpperCase();
            String nomCli=JOptionPane.showInputDialog("digite el nombre del cliente: ").toUpperCase();
            String emailCli=JOptionPane.showInputDialog("digite el Email del cliente: ");
            String telefCli=JOptionPane.showInputDialog("digite el telefono del cliente: ").toUpperCase();
            String geneCli=JOptionPane.showInputDialog("digite el gener del cliente: ").toUpperCase();
           
            
            losCltes[posicVacia]=new Cliente(idCli, nomCli, emailCli, telefCli, geneCli);
            
        }
    }//fin de registra
      
        public static int buscaClte(String idCli){
        int indLibre=-1;
        for (int w = 0; w < losCltes.length; w++) {
            if(losCltes[w].getIdCli()!=null)
            {
            if(losCltes[w].getIdCli().equals(idCli)){
               indLibre=w;
                break; 
            }  
            
            }//fin if
        }//fin for
        return indLibre;
    }//fin busca 
      
        public static void buscarClte(){
         String idCli=JOptionPane.showInputDialog("indique el ID del cliente que desea buscar: ").toUpperCase();
         int posicion= buscaClte(idCli);
         if (posicion==-1) {
             JOptionPane.showMessageDialog(null, idCli+" no esta registrada");
             
         }else{
             JOptionPane.showMessageDialog(null, losCltes[posicion]);       
                     }
     }//fin del buscador.
        
        
        public static void listarCltes(){
            for (int i = 0; i <= losCltes.length-1; i++) {
                if (losCltes[i].getIdCli()!=null) {
                     JOptionPane.showMessageDialog(null, losCltes[i]);
          
                }
            }
           
        
    }// fin de listar el arreglo
        
          
          
         public static void modificarClte(){
         String id=JOptionPane.showInputDialog("indique el ID del cliente a modificar informacion: ").toUpperCase();
         int posicion= buscaClte(id);
         if (posicion==-1) {
             JOptionPane.showMessageDialog(null, id+" no esta registrada");
             
         }else{
             String idCli=JOptionPane.showInputDialog("digite la cedula del cliente: ").toUpperCase();
            String nomCli=JOptionPane.showInputDialog("digite el nombre del cliente: ").toUpperCase();
            String emailCli=JOptionPane.showInputDialog("digite el Email del cliente: ");
            String telefCli=JOptionPane.showInputDialog("digite el telefono del cliente: ").toUpperCase();
            String geneCli=JOptionPane.showInputDialog("digite el gener del cliente: ").toUpperCase();
           
            
           losCltes[posicion]=new Cliente(idCli, nomCli, emailCli, telefCli, geneCli);
                     }
     }//fin del modificador.
         
            public static void eliminarClte(){
         String id=JOptionPane.showInputDialog("indique el ID de cliente que desea borrar: ").toUpperCase();
         int posicion= buscaClte(id);
         if (posicion==-1) {
             JOptionPane.showMessageDialog(null, id+" no esta registrada");
             
         }else{
            
            losCltes[posicion]= new Cliente();// me deja la posiciion en blanco     
                     }
     }//fin del borra carro.
    
    public void menuCliente(){
        
        //Menu
        //Regresar a Menu 
        MenuPrin MenuPrin = new MenuPrin();
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "Elija el menu deseado:\n"
                        + "1 = Ingresar Cliente.\n"
                        + "2 = Consultar Cliente.\n"
                        + "3 = Lista de Clientes.\n"
                        + "4 = Modificar Cliente.\n"
                        + "5 = Eliminar Cliente.\n"
                        + "6 = Regresar al Menu Principal.\n" ));
        
        switch(opcion){
            case(1):
            {
                Cliente.registraClte();
                break;
            }
            
            case(2):
            {
                Cliente.buscarClte();
                break;
            }
            
            case(3):
            {
                Cliente.listarCltes();
                break;
            }
            
            case(4):
            {
                Cliente.modificarClte();
                break;
            }
            
            case(5):
            {
                Cliente.eliminarClte();
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

  
}
