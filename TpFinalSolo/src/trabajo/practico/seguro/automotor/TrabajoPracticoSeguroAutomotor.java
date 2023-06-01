
package trabajo.practico.seguro.automotor;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class TrabajoPracticoSeguroAutomotor {

    public static void main(String[] args) {    
        int fecha=2023;
        
        int importeUno = 500;
        int importeDos = 1000;
        int importeTres = 1500;
        int importeCuatro = 2000;
        
        int RC = 1000;
        int TC = 2000;
        int RT = 3000;
        
        int coberturaADICIONAL=0;
        String coberturas="";
        
        int total;
        
        String marca;
        String modelos="";
        
        //Logo
        ImageIcon Icon = new ImageIcon("src/Imagenes/logo33.png");
        ImageIcon Icon2 = new ImageIcon("src/Imagenes/logo2.png");
        
        JOptionPane.showMessageDialog(null,Icon);
        //Solicitud de datos
        String nombre = JOptionPane.showInputDialog(null,"Nombre del Cliente ","Poliza",JOptionPane.QUESTION_MESSAGE);
        String apellido = JOptionPane.showInputDialog(null,"Apellido del Cliente ","Poliza",JOptionPane.QUESTION_MESSAGE);
        String telefono = JOptionPane.showInputDialog(null,"Telefono ","Poliza",JOptionPane.QUESTION_MESSAGE);
        String mail = JOptionPane.showInputDialog(null,"Mail ","Poliza",JOptionPane.QUESTION_MESSAGE);
        
        //Marcas
        String [] marcas ={"Renault","Fiat","Ford","Citroen","VW"};

        marca = (String) JOptionPane.showInputDialog(null,"Seleccione una Marca :","Vehiculos :",JOptionPane.QUESTION_MESSAGE,null,marcas,marcas[0]);
        
        //Modelos
        String [] Renault = {"Sandero","Logan","Captur","Kicks","Twingo"};
        String [] Fiat = {"Uno","Mobi","Pulse","Argo","Cronos"};
        String [] Ford = {"Fiesta","Focus","Mondeo","KA","Falcon"};
        String [] Citroen = {"Picasso","Cactus","Aircros","C3","C4"};
        String [] VW = {"Polo","Nivus","Virtus","Taos","Vento"};
        
        
        if(marca.equalsIgnoreCase("Renault")){
            modelos = (String) JOptionPane.showInputDialog(null,"Selecione el modelo :" +marca , "Modelos :",JOptionPane.QUESTION_MESSAGE,null,Renault,Renault);
            
        }else if(marca.equalsIgnoreCase("Fiat")){
            modelos = (String) JOptionPane.showInputDialog(null,"Selecione el modelo :" +marca , "Modelos :",JOptionPane.QUESTION_MESSAGE,null,Fiat,Fiat);
            
        }else if(marca.equalsIgnoreCase("Ford")){
            modelos = (String) JOptionPane.showInputDialog(null,"Selecione el modelo :" +marca , "Modelos :",JOptionPane.QUESTION_MESSAGE,null,Ford,Ford);
            
        }else if(marca.equalsIgnoreCase("Citroen")){
            modelos = (String) JOptionPane.showInputDialog(null,"Selecione el modelo :" +marca , "Modelos :",JOptionPane.QUESTION_MESSAGE,null,Citroen,Citroen);
            
        }else if(marca.equalsIgnoreCase("VW")){
            modelos = (String) JOptionPane.showInputDialog(null,"Selecione el modelo :" +marca , "Modelos :",JOptionPane.QUESTION_MESSAGE,null,VW,VW);
            
        }

        //Dominio
        String dominio = JOptionPane.showInputDialog(null,"Ingrese Dominio ","Poliza",JOptionPane.QUESTION_MESSAGE);

        //Año de Antiguedad
        int antig = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese Año de Antiguedad ","Poliza",JOptionPane.QUESTION_MESSAGE));
        int resultado = (fecha - antig);
      
        JOptionPane.showMessageDialog(null,"Antiguedad :"+" " + resultado + " " + "Años");
        
        if (resultado <= 5){
            JOptionPane.showMessageDialog(null,"Adicional de $500");
                    resultado = importeUno;
        }else if ((resultado >= 5) && (resultado < 10)){
            JOptionPane.showMessageDialog(null,"Adicional de $1000");
                    resultado = importeDos;
        }else if ((resultado >= 10) && (resultado < 15)){
            JOptionPane.showMessageDialog(null,"Adicional de $1500");
                    resultado = importeTres;
        }else if ((resultado >= 15) && (resultado < 20)){
            JOptionPane.showMessageDialog(null,"Adicional de $2000");
                    resultado = importeCuatro;
        }else if (resultado >= 20){
            JOptionPane.showMessageDialog(null,"No se Asegura su Auto");
            System.exit(0);
        }
        
        //Tipo de cobertura
        int cobertura = JOptionPane.showOptionDialog(null,
            "Selecciona una opcion : \n Responsabilidad Civil: 1"+"\n Terceros Completo: 2"+"\n Riesgo Total: 3",
            "Poliza",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,Icon2,
            new Object[]{"1","2","3"},"3");

        switch(cobertura){
            case 0: JOptionPane.showMessageDialog(null,"Selecciono : Responsabilidad Civil");
            cobertura = RC;
            coberturas ="Responsabilidad Civil";
            break;
            
            case 1: JOptionPane.showMessageDialog(null,"Selecciono : Terceros Completo");
            cobertura = TC;
            coberturas ="Terceros Completo";
            break;
            
            case 2: JOptionPane.showMessageDialog(null,"Selecciono : Riesgo Total");
            cobertura = RT;
            coberturas ="Riesgo Total";
            break;
            
            default:      
        }
        // Adicional
 
        int resp1 =JOptionPane.showConfirmDialog(null, "Desea seleccionar Coberturas Adicionales ?");
            if(JOptionPane.OK_OPTION == resp1){
                String [] coberturaAD1 ={"Ganizo","Llantas Deportivas","Asistencia Mecanica","Localizador GPS"};
                JComboBox comboBoxcobAD1 = new JComboBox(coberturaAD1);    
                JOptionPane.showMessageDialog(null, comboBoxcobAD1, "Seleccione la Cobertura Adicional",JOptionPane.QUESTION_MESSAGE);
                coberturaADICIONAL+=300;
                    int resp2 =JOptionPane.showConfirmDialog(null, "Desea seleccionar Otra Coberturas Adicionales ?");
                        if(JOptionPane.OK_OPTION == resp2){
                        String [] coberturaAD2 ={"Ganizo","Llantas Deportivas","Asistencia Mecanica","Localizador GPS"};
                        JComboBox comboBoxcobAD2 = new JComboBox(coberturaAD2);    
                        JOptionPane.showMessageDialog(null, comboBoxcobAD2, "Seleccione la Cobertura Adicional",JOptionPane.QUESTION_MESSAGE);
                            int resp3 =JOptionPane.showConfirmDialog(null, "Desea seleccionar Otra Coberturas Adicionales ?");
                                if(JOptionPane.OK_OPTION == resp3){
                                String [] coberturaAD3 ={"Ganizo","Llantas Deportivas","Asistencia Mecanica","Localizador GPS"};
                                JComboBox comboBoxcobAD3 = new JComboBox(coberturaAD3);    
                                JOptionPane.showMessageDialog(null, comboBoxcobAD3, "Seleccione la Cobertura Adicional",JOptionPane.QUESTION_MESSAGE);
                                coberturaADICIONAL+=300;
                                    int resp4 =JOptionPane.showConfirmDialog(null, "Desea seleccionar Otra Coberturas Adicionales ?");
                                        if(JOptionPane.OK_OPTION == resp4){
                                        String [] coberturaAD4 ={"Ganizo","Llantas Deportivas","Asistencia Mecanica","Localizador GPS"};
                                        JComboBox comboBoxcobAD4 = new JComboBox(coberturaAD4);    
                                        JOptionPane.showMessageDialog(null, comboBoxcobAD4, "Seleccione la Cobertura Adicional",JOptionPane.QUESTION_MESSAGE);
                                        }
            } else {
                System.out.print("");
            }
        }
    }
            
            System.out.println("--------------------------------------------");
            System.out.println("---------------Presupuesto------------------");
            System.out.println("------------CFP 36 SEGURO----------------");
            System.out.println("--------------------------------------------");
            System.out.println("------------COMPRADOR---------------");
            System.out.println("NOMBRE :" + nombre);
            System.out.println("APELLIDO :" + apellido);
            System.out.println("TELEFONO :" + telefono);
            System.out.println("MAIL :" + mail);
            System.out.println("-----------VEHICULO ASEGURADO---------------");
            System.out.println("MARCA :" + marca);
            System.out.println("MODELO :" + modelos);
            System.out.println("DOMINIO :" + dominio);
            System.out.println("ANTIGUEDAD DEL VEHICULO :" + antig);
            System.out.println("--------------------------------------------");
            System.out.println("VALOR DE LA CUOTA :" + resultado);
            System.out.println("TIPO DE COBERTURA :" + coberturas);
            System.out.println("VALOR DE COBERTURA :" + cobertura);
            System.out.println("VALOR DE ADICIONALES :" + coberturaADICIONAL );
            total = resultado + cobertura + coberturaADICIONAL;
            System.out.println("--------------------------------------------");
            System.out.println("VALOR FINAL :" + total );
            System.out.println("--------------------------------------------");
            
            JOptionPane.showOptionDialog(null,
            "NOMBRE DEL CLIENTE :"+nombre+"\n APELLIDO DEL CLIENTE :"+apellido+"\n TELEFONO :"+telefono+"\n MAIL :"+mail+
                    "\n MARCA :"+marca+"\n MODELO :"+modelos+"\n DOMINIO :"+dominio+"\n ANTIGUEDAD DEL VEHICULO :"+antig+"\n VALOR DE LA CUOTA :"+resultado+
                    "\n TIPO DE COBERTURA :"+coberturas+"\n VALOR DE COBERTURA :"+cobertura+"\n ADICIONALES :"+coberturaADICIONAL+ "\n VALOR FINAL :"+total,
            "Poliza",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,Icon2,
            new Object[]{"IMPRIMIR POLIZA"},"");
    }
        
}