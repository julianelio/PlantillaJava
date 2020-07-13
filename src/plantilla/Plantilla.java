
package plantilla;


public class Plantilla {

    
    public static void main(String[] args) {
        
        String nombre ="Juan";
        int numero = 89000;
        String fecha= "13/7/2020";
        String saludo;
        String sexo;
        String hora ="16:00Hs";
        String direccion = "calle Corrientes al 1200";
        
        sexo="H";
         if (sexo.equals("M")){
             saludo ="Estimada";
             
         } else{
             if (sexo.equals("H")){
                 saludo = "Estimado";
             }else{
                 saludo = "Estimado/a";
                 
             }
         }
         System.out.println(saludo + " " + nombre + ",");
         System.out.println("Confirmamos tu turno n°" + numero + " para realizar el trámite de Aptos Médicos."
                 + "Deberá presentarte el " + fecha + " a las " + hora + " en "+ direccion +" 6to A. ");
    }
}
                
    
    

