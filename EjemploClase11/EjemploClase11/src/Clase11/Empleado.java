/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase11;

/**
 *
 * @author 
 */
import javax.swing.JOptionPane;

public class Empleado {
    private String idEmp;
    private String nomEmp;
    private String emailEmp;
    private String telefEmp;
    private String genEmp;
    private int salario;

    public Empleado(String idEmp, String nomEmp, String emailEmp, String telefEmp, String genEmp, int salario) {
        this.idEmp = idEmp;
        this.nomEmp = nomEmp;
        this.emailEmp = emailEmp;
        this.telefEmp = telefEmp;
        this.genEmp = genEmp;
        this.salario = salario;
    }
    
    
    
    public Empleado(){
    
    }

    @Override
    public String toString() {
        return "Empleado{" + "idEmp=" + idEmp + ", nomEmp=" + nomEmp + ", emailEmp=" + emailEmp + ", telefEmp=" + telefEmp + ", genEmp=" + genEmp + ", salario=" + salario + '}';
    }
    
    
    static Empleado losEmp[]=new Empleado[10];
    
     public static void iniciaEmp(){
        losEmp[0]= new Empleado("E111", "RUBEN PEREZ", "carlos@gmail.com", "22585496", "MASCULINO", 1000000 );
        losEmp[1]= new Empleado("E222", "JUAN PEREZ", "daniel@gmail.com", "24944496", "MASCULINO", 1500000 );
         for (int w = 2; w < losEmp.length; w++) {
            losEmp[w]=new Empleado();
         }// fin del for
    }// fin de inicializa.
    
     public static int buscaEspacioEmp(){//devuelve el indice donde
        int ind=-1;                      //hay un espacio vacío
        for (int w = 0; w < losEmp.length; w++) {
           if(losEmp[w].getIdEmp()==null){//encontré un espacio vacío
              ind=w;
              break;
           } 
        }//fin for
        return ind;
    }//fin de buscaEspacio
     
      public static void registraEmp(){
        int posicVacia=buscaEspacioEmp();
        if(posicVacia==-1){
            JOptionPane.showMessageDialog(null,"No hay espacio para"
                    + " registrar un nuevo Empleado");
        }else{
            
            String idEmp=JOptionPane.showInputDialog("digite la cedula del empleado: ").toUpperCase();
            String nomEmp=JOptionPane.showInputDialog("digite el nombre del empleado: ").toUpperCase();
            String emailEmp=JOptionPane.showInputDialog("digite el Email del empleado: ");
            String telefEmp=JOptionPane.showInputDialog("digite el telefono del empleado: ").toUpperCase();
            String geneEmp=JOptionPane.showInputDialog("digite el genero del empleado: ").toUpperCase();
            int salario=Integer.parseInt(JOptionPane.showInputDialog("digite el salario mensual del trabajador: "));
           
            
            losEmp[posicVacia]=new Empleado(idEmp, nomEmp, emailEmp, telefEmp, geneEmp, salario);
            
        }
    }//fin de registra
      
        public static int buscaEmp(String idEmp){
        int indLibre=-1;
        for (int w = 0; w < losEmp.length; w++) {
            if(losEmp[w].getIdEmp()!=null)
            {
            if(losEmp[w].getIdEmp().equals(idEmp)){
               indLibre=w;
                break; 
            }  
            
            }//fin if
        }//fin for
        return indLibre;
    }//fin busca 
      
        public static void buscarEmp(){
         String idEmp=JOptionPane.showInputDialog("indique el ID del trabajador que desea buscar: ").toUpperCase();
         int posicion= buscaEmp(idEmp);
         if (posicion==-1) {
             JOptionPane.showMessageDialog(null, idEmp+" no esta registrada");
             
         }else{
             JOptionPane.showMessageDialog(null, losEmp[posicion]);       
                     }
     }//fin del buscador.
        
        
          public static void listarEmp(){
       for (int i = 0; i <= losEmp.length-1; i++) {
                if (losEmp[i].getIdEmp()!=null) {
                     JOptionPane.showMessageDialog(null, losEmp[i]);
          
                }
            }
    }// fin de listar el arreglo
        
          
          
         public static void modificarEmp(){
         String id=JOptionPane.showInputDialog("indique el ID del trabajador a modificar informacion: ").toUpperCase();
         int posicion= buscaEmp(id);
         if (posicion==-1) {
             JOptionPane.showMessageDialog(null, id+" no esta registrada");
             
         }else{
             String idEmp=JOptionPane.showInputDialog("digite la cedula del empleado: ").toUpperCase();
            String nomEmp=JOptionPane.showInputDialog("digite el nombre del empleado: ").toUpperCase();
            String emailEmp=JOptionPane.showInputDialog("digite el Email del empleado: ");
            String telefEmp=JOptionPane.showInputDialog("digite el telefono del empleado: ").toUpperCase();
            String geneEmp=JOptionPane.showInputDialog("digite el genero del empleado: ").toUpperCase();
            int salario=Integer.parseInt(JOptionPane.showInputDialog("digite el salario mensual del trabajador: "));
           
            
           losEmp[posicion]=new Empleado(idEmp, nomEmp, emailEmp, telefEmp, geneEmp, salario);
                     }
     }//fin del modificador.
         
            public static void eliminarEmp(){
         String id=JOptionPane.showInputDialog("indique el ID del empleado que desea borrar: ").toUpperCase();
         int posicion= buscaEmp(id);
         if (posicion==-1) {
             JOptionPane.showMessageDialog(null, id+" no esta registrada");
             
         }else{
            
            losEmp[posicion]= new Empleado();// me deja la posiciion en blanco     
                     }
     }//fin del borra 
    
    
    
    public void menuEmpleado(){
        
        //Menu
        //Regresar a Menu 
        MenuPrin MenuPrin = new MenuPrin();
        
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "Elija el menu deseado:\n"
                        + "1 = Ingresar Empleado.\n"
                        + "2 = Consultar Empleado.\n"
                        + "3 = Lista de Empleados.\n"
                        + "4 = Modificar Empleado.\n"
                        + "5 = Eliminar Empleado.\n"
                        + "6 = Regresar al Menu Principal.\n" ));
        
        switch(opcion){
            case(1):
            {
                Empleado.registraEmp();
                       
                break;
            }
            
            case(2):
            {
                Empleado.buscarEmp();
                break;
            }
            
            case(3):
            {
                Empleado.listarEmp();
                break;
            }
            
            case(4):
            {
                Empleado.modificarEmp();
                break;
            }
            
            case(5):
            {
                Empleado.eliminarEmp();
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

    public String getIdEmp() {
        return idEmp;
    }

    public void setIdEmp(String idEmp) {
        this.idEmp = idEmp;
    }

    public String getNomEmp() {
        return nomEmp;
    }

    public void setNomEmp(String nomEmp) {
        this.nomEmp = nomEmp;
    }

    public String getEmailEmp() {
        return emailEmp;
    }

    public void setEmailEmp(String emailEmp) {
        this.emailEmp = emailEmp;
    }

    public String getTelefEmp() {
        return telefEmp;
    }

    public void setTelefEmp(String telefEmp) {
        this.telefEmp = telefEmp;
    }

    public String getGenEmp() {
        return genEmp;
    }

    public void setGenEmp(String genEmp) {
        this.genEmp = genEmp;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
}
