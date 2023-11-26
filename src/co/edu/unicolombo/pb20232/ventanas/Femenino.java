/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package co.edu.unicolombo.pb20232.ventanas;

import java.awt.Color;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luis Maldonado
 */
public class Femenino extends javax.swing.JFrame {
 Random random = new Random();
 int saldoinicial = 1000;
  int juego = 0;
 
   public DefaultTableModel modelo;
    /**
     * Creates new form Femenino
     */
    public Femenino() {
        initComponents();
         modelo= new DefaultTableModel();
        modelo.addColumn("Nombre del equipo ");
        modelo.addColumn("Sedes");
        modelo.addColumn("Tipo de juego ");
        modelo.addColumn("Propietario");
        modelo.addColumn("PJ");
        modelo.addColumn("PG");
        modelo.addColumn("PP");
        modelo.addColumn("P");
       
        agregarEquipo("Rusia","Mosku","Femenino","Yuri Marichev");
        agregarEquipo2("Japon","Tokio","Femenino","Hirofumi Daimatsu");       
        agregarEquipo3("Argentina","Buenos Aires","Femenino","Goku");
        agregarEquipo4("Polonia","nidea","Femenino","un tal leon");
        agregarEquipo5("Estados Unidos","Washintong","Femenino","besto armador");
        
         
        
        
       
        
        
        
        
        this.tabla.setModel(modelo);
         saldo.setText(String.valueOf(saldoinicial));
        int saldoo = Integer.parseInt(saldo.getText());
        if (saldoo>0){
             saldo.setForeground(Color.GREEN);
        } else {
             saldo.setForeground(Color.RED);
        }
        
        
    }
    private void agregarEquipo(String nombreEquipo1, String sedeequipo1, String masculino, String propietario) {
        Object[] fila = {nombreEquipo1,sedeequipo1,masculino,propietario,0, 0, 0, 0};
        modelo.addRow(fila);
    }

private void agregarEquipo2(String nombreEquipo1, String sedeequipo1, String masculino, String yuri_Marichev) {
        Object[] fila = {nombreEquipo1,sedeequipo1,masculino,yuri_Marichev,0, 0, 0, 0};
        modelo.addRow(fila);
    }
private void agregarEquipo3(String nombreEquipo, String sedeequipo, String masculino, String propietario) {
        Object[] fila = {nombreEquipo,sedeequipo,masculino,propietario,0, 0, 0, 0};
        modelo.addRow(fila);
    }
private void agregarEquipo4(String nombreEquipo, String sedeequipo, String masculino, String propietario) {
        Object[] fila = {nombreEquipo,sedeequipo,masculino,propietario,0, 0, 0, 0};
        modelo.addRow(fila);
    }
private void agregarEquipo5(String nombreEquipo, String sedeequipo, String masculino, String propietario) {
        Object[] fila = {nombreEquipo,sedeequipo,masculino,propietario,0, 0, 0, 0};
        modelo.addRow(fila);
    }
 private void agregarEquipo6() {
       

        Object[] fila = {nombredelequipo.getText(), sede.getText(), tipodejuego.getSelectedItem(), propietario.getText(), 0, 0, 0, 0};
        modelo.addRow(fila);
        restarValorDeseado(500);
        
        
                
        if (!nombredelequipo.getText().isEmpty() || !sede.getText().isEmpty() || !propietario.getText().isEmpty()) {
            if (juego == 0) {
                Registrar.setEnabled(false);
                juego = 1;
            }

        }

    }
 public void sumarValorDeseado(int valor) {
        // Resta el valor deseado de la variable y actualiza el texto del JLabel
        saldoinicial += valor;
        saldo.setText("" + saldoinicial);
    }
 
 
 
 private void resetearColumnas(DefaultTableModel modelo, int columna) {
        int contador_de_fila = modelo.getRowCount();
        for (int i = 0; i < contador_de_fila; i++) {
            modelo.setValueAt(0, i, columna);
        }
    }

  private void restarValorDeseado(int valor) {
        // Resta el valor deseado de la variable y actualiza el texto del JLabel
        saldoinicial -= valor;
        saldo.setText("" + saldoinicial);
    }
  
 

private void sumarPartidoJugado() {
    
    
      //------------------------------------------------------------------------------------------------------------------------------
        
      // partidos jugados
      
      
      
      
      
      int filas = modelo.getRowCount();
        for (int i = 0; i < filas; i++) {
            int partidosJugados = (int) modelo.getValueAt(i, 4);
            modelo.setValueAt(partidosJugados + 1, i, 4);
        }//Cuando se presiona jugar a los partidos jugados se les suma uno
      
       
          //------------------------------------------------------------------------------------------------------------------------------
          
          
          // partidos ganados y perdidos
          
          
          
          
          
         int filas1 = modelo.getRowCount();
        for (int i = 0; i < filas1; i++) {
            double numeroaleatorio = random.nextDouble();
           if(numeroaleatorio < 0.5){
            int partidosGanados = (int) modelo.getValueAt(i, 5);
            modelo.setValueAt(partidosGanados+ 1, i, 5);
           } else {
                int partidosGanados = (int) modelo.getValueAt(i, 6);
                modelo.setValueAt(partidosGanados+ 1, i, 6);
           }
        }// Cuando se presiona jugar hay un 50% de probabilidad de que gane un partido
        
        //------------------------------------------------------------------------------------------------------------------------------
        
       
        
        
        
        
        
        
        
        
        //Sistema de puntos
        
        
          
            int partidosGanados1 = (int) modelo.getValueAt(0, 5);
           if( partidosGanados1 == 1 || partidosGanados1 == 2 || partidosGanados1 == 10 || partidosGanados1 == 3 || partidosGanados1 == 4 || partidosGanados1 == 5 || partidosGanados1 == 6 || partidosGanados1 == 7 || partidosGanados1 == 8 || partidosGanados1 == 9  ){
            modelo.setValueAt(partidosGanados1 + 3, 0, 7);// hago que le sume puntos a la columna de puntos
           }
        
           
            int partidosGanados2 = (int) modelo.getValueAt(1, 5);
           if( partidosGanados2 == 1 || partidosGanados2 == 2 || partidosGanados2 == 3 || partidosGanados2 == 4 || partidosGanados2 == 5 || partidosGanados2 == 6 || partidosGanados2 == 7 || partidosGanados2 == 8 || partidosGanados2 == 9 || partidosGanados2 == 10  ){
            modelo.setValueAt(partidosGanados2 + 3, 1, 7);
           }
        
            
            int partidosGanados3 = (int) modelo.getValueAt(2, 5);
           if(  partidosGanados3 == 1 || partidosGanados3 == 2 || partidosGanados3 == 3 || partidosGanados3 == 4 || partidosGanados3 == 5 || partidosGanados3 == 6 || partidosGanados3 == 7 || partidosGanados3 == 8 || partidosGanados3 == 9 || partidosGanados3 == 10  ){
            modelo.setValueAt(partidosGanados3 + 3, 2, 7);// hago que le sume puntos a la columna de puntos
           }
        
            
            int partidosGanados4 = (int) modelo.getValueAt(3, 5);
           if( partidosGanados4 == 1 || partidosGanados4 == 2 || partidosGanados4 == 3 || partidosGanados4 == 4 || partidosGanados4 == 5 || partidosGanados4 == 6 || partidosGanados4 == 7 || partidosGanados4 == 8 || partidosGanados4 == 9 || partidosGanados4 == 10 ){
            modelo.setValueAt(partidosGanados4 + 3, 3, 7);// hago que le sume puntos a la columna de puntos
           
        }
            
            int partidosGanados5 = (int) modelo.getValueAt(4, 5);
           if( partidosGanados5 == 1 || partidosGanados5 == 2 || partidosGanados5 == 3 || partidosGanados5 == 4 || partidosGanados5 == 5 || partidosGanados5 == 6 || partidosGanados5 == 7 || partidosGanados5 == 8 || partidosGanados5 == 9 || partidosGanados5 == 10 ){
            modelo.setValueAt(partidosGanados5 + 3, 4, 7);// hago que le sume puntos a la columna de puntos
           
        }
              
          
        
              
        
              
              //---------------------------------------------------------------------------------------------------------------------------------------
              
              
              //Sitema de ganador
              
             
            int puntos1 = (int) modelo.getValueAt(0, 7);
           if( puntos1 == 13  ){
            JOptionPane.showMessageDialog(this, " El equipo 1 ha ganado ");
           }
        
           
            int puntos2 = (int) modelo.getValueAt(1, 7);
           if( puntos2 == 13  ){
           JOptionPane.showMessageDialog(this, " El equipo 2 ha ganado ");
           }
        
           
            int puntos3 = (int) modelo.getValueAt(2, 7);
           if(  puntos3 == 13   ){
          JOptionPane.showMessageDialog(this, " El equipo 3 ha ganado ");
           }
        
            
            int puntos4 = (int) modelo.getValueAt(3, 7);
           if( puntos4 == 13 ){
           JOptionPane.showMessageDialog(this, " El equipo 4 ha ganado ");
           }
        
            
            int puntos5 = (int) modelo.getValueAt(4, 7);
           if( puntos5 == 13 ){
            JOptionPane.showMessageDialog(this, " El equipo numero 5 ha ganado ");
           }
        
             
           
        
              
              //---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
              
              
              
              
              
              
              
    }

private void sumarPartidoJugado2() {
    
    
      //------------------------------------------------------------------------------------------------------------------------------
        
      // partidos jugados
      
      
      
      
      
      int filas = modelo.getRowCount();
        for (int i = 0; i < filas; i++) {
            int partidosJugados = (int) modelo.getValueAt(i, 4);
            modelo.setValueAt(partidosJugados + 1, i, 4);
        }//Cuando se presiona jugar a los partidos jugados se les suma uno
      
       
          //------------------------------------------------------------------------------------------------------------------------------
          
          
          // partidos ganados y perdidos
          
          
          
          
          
         int filas1 = modelo.getRowCount();
        for (int i = 0; i < filas1; i++) {
            double numeroaleatorio = random.nextDouble();
           if(numeroaleatorio < 0.5){
            int partidosGanados = (int) modelo.getValueAt(i, 5);
            modelo.setValueAt(partidosGanados+ 1, i, 5);
           } else {
                int partidosGanados = (int) modelo.getValueAt(i, 6);
                modelo.setValueAt(partidosGanados+ 1, i, 6);
           }
        }// Cuando se presiona jugar hay un 50% de probabilidad de que gane un partido
        
        //------------------------------------------------------------------------------------------------------------------------------
        
       
        
        
        
        
        
        
        
        
        //Sistema de puntos
        
        
          
            int partidosGanados1 = (int) modelo.getValueAt(0, 5);
           if( partidosGanados1 == 1 || partidosGanados1 == 2 || partidosGanados1 == 10 || partidosGanados1 == 3 || partidosGanados1 == 4 || partidosGanados1 == 5 || partidosGanados1 == 6 || partidosGanados1 == 7 || partidosGanados1 == 8 || partidosGanados1 == 9  ){
            modelo.setValueAt(partidosGanados1 + 3, 0, 7);// hago que le sume puntos a la columna de puntos
           }
        
           
            int partidosGanados2 = (int) modelo.getValueAt(1, 5);
           if( partidosGanados2 == 1 || partidosGanados2 == 2 || partidosGanados2 == 3 || partidosGanados2 == 4 || partidosGanados2 == 5 || partidosGanados2 == 6 || partidosGanados2 == 7 || partidosGanados2 == 8 || partidosGanados2 == 9 || partidosGanados2 == 10  ){
            modelo.setValueAt(partidosGanados2 + 3, 1, 7);
           }
        
            
            int partidosGanados3 = (int) modelo.getValueAt(2, 5);
           if(  partidosGanados3 == 1 || partidosGanados3 == 2 || partidosGanados3 == 3 || partidosGanados3 == 4 || partidosGanados3 == 5 || partidosGanados3 == 6 || partidosGanados3 == 7 || partidosGanados3 == 8 || partidosGanados3 == 9 || partidosGanados3 == 10  ){
            modelo.setValueAt(partidosGanados3 + 3, 2, 7);// hago que le sume puntos a la columna de puntos
           }
        
            
            int partidosGanados4 = (int) modelo.getValueAt(3, 5);
           if( partidosGanados4 == 1 || partidosGanados4 == 2 || partidosGanados4 == 3 || partidosGanados4 == 4 || partidosGanados4 == 5 || partidosGanados4 == 6 || partidosGanados4 == 7 || partidosGanados4 == 8 || partidosGanados4 == 9 || partidosGanados4 == 10 ){
            modelo.setValueAt(partidosGanados4 + 3, 3, 7);// hago que le sume puntos a la columna de puntos
           
        }
            
            int partidosGanados5 = (int) modelo.getValueAt(4, 5);
           if( partidosGanados5 == 1 || partidosGanados5 == 2 || partidosGanados5 == 3 || partidosGanados5 == 4 || partidosGanados5 == 5 || partidosGanados5 == 6 || partidosGanados5 == 7 || partidosGanados5 == 8 || partidosGanados5 == 9 || partidosGanados5 == 10 ){
            modelo.setValueAt(partidosGanados5 + 3, 4, 7);// hago que le sume puntos a la columna de puntos
           
        }
              
            int partidosGanados = (int) modelo.getValueAt(5, 5);
           if( partidosGanados == 1 || partidosGanados == 2 || partidosGanados == 3 || partidosGanados == 4 || partidosGanados == 5 || partidosGanados == 6 || partidosGanados == 7 || partidosGanados == 8 || partidosGanados == 9 || partidosGanados == 10 ){
            modelo.setValueAt(partidosGanados + 3, 5, 7);// hago que le sume puntos a la columna de puntos
           }
        
              
        
              
              //---------------------------------------------------------------------------------------------------------------------------------------
              
              
              //Sitema de ganador
              
             
            int puntos1 = (int) modelo.getValueAt(0, 7);
           if( puntos1 == 13  ){
            JOptionPane.showMessageDialog(this, " El equipo 1 ha ganado ");
           }
        
           
            int puntos2 = (int) modelo.getValueAt(1, 7);
           if( puntos2 == 13  ){
           JOptionPane.showMessageDialog(this, " El equipo 2 ha ganado ");
           }
        
           
            int puntos3 = (int) modelo.getValueAt(2, 7);
           if(  puntos3 == 13   ){
          JOptionPane.showMessageDialog(this, " El equipo 3 ha ganado ");
           }
        
            
            int puntos4 = (int) modelo.getValueAt(3, 7);
           if( puntos4 == 13 ){
           JOptionPane.showMessageDialog(this, " El equipo 4 ha ganado ");
           }
        
            
            int puntos5 = (int) modelo.getValueAt(4, 7);
           if( puntos5 == 13 ){
            JOptionPane.showMessageDialog(this, " El equipo numero 5 ha ganado ");
           }
        
             
            int puntos = (int) modelo.getValueAt(5, 7);
           if( puntos == 13 ){
            JOptionPane.showMessageDialog(this, " El equipo numero 6 ha ganado ");
           }
        
              
              //---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
              
              
              
              
              
              
              
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nombredelequipo = new javax.swing.JTextField();
        Reiniciar = new javax.swing.JButton();
        sede = new javax.swing.JTextField();
        Reclamar = new javax.swing.JButton();
        propietario = new javax.swing.JTextField();
        Jugar = new javax.swing.JButton();
        tipodejuego = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        Contraseña = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtfila = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtcolumna = new javax.swing.JTextField();
        Registrar = new javax.swing.JButton();
        txtdatonuevo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        saldo = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        valor = new javax.swing.JTextField();
        recargar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        nombredelequipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombredelequipoActionPerformed(evt);
            }
        });

        Reiniciar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Reiniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/unicolombo/pb20232/ventanas/Imagenes/basura (1).png"))); // NOI18N
        Reiniciar.setText("Reiniciar");
        Reiniciar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(102, 0, 102), new java.awt.Color(51, 153, 255), null));
        Reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReiniciarActionPerformed(evt);
            }
        });

        sede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sedeActionPerformed(evt);
            }
        });

        Reclamar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Reclamar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/unicolombo/pb20232/ventanas/Imagenes/eliminar (1).png"))); // NOI18N
        Reclamar.setText("Reclamar premio");
        Reclamar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(102, 0, 102), new java.awt.Color(51, 153, 255), null));
        Reclamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReclamarActionPerformed(evt);
            }
        });

        propietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                propietarioActionPerformed(evt);
            }
        });

        Jugar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Jugar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/unicolombo/pb20232/ventanas/jugador-de-voleibol (2) (1).png"))); // NOI18N
        Jugar.setText("Jugar");
        Jugar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(102, 0, 102), new java.awt.Color(51, 153, 255), null));
        Jugar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JugarMouseClicked(evt);
            }
        });

        tipodejuego.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Femenino" }));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Ingrese la contraseña como administrador");

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/unicolombo/pb20232/ventanas/Imagenes/editar (1).png"))); // NOI18N
        jButton2.setText("Modificar");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(102, 0, 102), new java.awt.Color(51, 153, 255), null));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 102));
        jLabel6.setText("Modificar");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Ingrese la colunma :");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Ingrese el dato a reemplazar");

        txtfila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfilaActionPerformed(evt);
            }
        });

        tabla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setText("Registrar equipo");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Nombre del equipo :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Sede:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Tipo de juego :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Propietario :");

        txtcolumna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcolumnaActionPerformed(evt);
            }
        });

        Registrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/unicolombo/pb20232/ventanas/Imagenes/verificar (3).png"))); // NOI18N
        Registrar.setText("Registrar");
        Registrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(102, 0, 102), new java.awt.Color(51, 153, 255), null));
        Registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistrarMouseClicked(evt);
            }
        });
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Ingrese la fila :");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 204, 204));
        jLabel11.setText("Saldo:");

        saldo.setText("0.00");

        jLabel12.setText("$");

        jLabel13.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel13.setText("Ingrese el valor a recargar");

        recargar.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        recargar.setText("Recargar");
        recargar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(102, 0, 102), new java.awt.Color(0, 255, 255), null));
        recargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recargarActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("Eliminar");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setText("Eliminar todo");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/unicolombo/pb20232/ventanas/atras (1).png"))); // NOI18N
        jButton1.setText("Atras");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 51, 51), new java.awt.Color(255, 102, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tipodejuego, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(sede, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nombredelequipo, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(propietario, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(recargar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel12)
                        .addGap(6, 6, 6)
                        .addComponent(saldo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13)
                        .addGap(5, 5, 5)
                        .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Reiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Jugar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Reclamar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(1299, 1299, 1299))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtcolumna, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                        .addComponent(txtfila))
                                    .addGap(0, 1291, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(txtdatonuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1197, 1197, 1197))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel8))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(1184, 1184, 1184))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtfila, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2))
                                    .addComponent(jLabel10))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtcolumna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(34, 34, 34)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(txtdatonuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Reclamar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Jugar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(Reiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jLabel1))
                            .addComponent(jLabel11)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(saldo))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(nombredelequipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(sede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tipodejuego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(propietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(recargar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1670, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1136, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombredelequipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombredelequipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombredelequipoActionPerformed

    private void ReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReiniciarActionPerformed
        int filas = modelo.getRowCount();
        boolean equipoGanador = false;  // Variable para rastrear si ya hay un equipo ganador
        int filaEquipoGanador = -1;  // Almacena la fila del equipo ganador, si lo hay

// Bucle para verificar si hay un equipo ganador
        for (int i = 0; i < filas; i++) {
            int puntos = (int) modelo.getValueAt(i, 7);

            if (puntos >= 13) {
                equipoGanador = true;
                filaEquipoGanador = i;
                // No rompemos el bucle para verificar todas las filas y reiniciar valores en todas
            }
        }

// Verificar si hay un equipo ganador
        if (equipoGanador) {
            // Reiniciar valores de las columnas a 0 en todas las filas
            int columna_a_seleccionada_4 = 4;
            int columna_a_seleccionada_5 = 5;
            int columna_a_seleccionada_6 = 6;
            int columna_a_seleccionada_7 = 7;

            for (int i = 0; i < filas; i++) {
                modelo.setValueAt(0, i, columna_a_seleccionada_4);
                modelo.setValueAt(0, i, columna_a_seleccionada_5);
                modelo.setValueAt(0, i, columna_a_seleccionada_6);
                modelo.setValueAt(0, i, columna_a_seleccionada_7);
            }

            // Eliminar la fila número 5
            if (filaEquipoGanador < 5) {
                modelo.removeRow(5);
                if (juego == 1) {
                    juego = 0;
                    Registrar.setEnabled(true);
                    propietario.setText("");
                    nombredelequipo.setText("");
                    sede.setText("");
                    
                }
            } else {
                modelo.removeRow(filaEquipoGanador);
            }

            JOptionPane.showMessageDialog(this, "¡Hemos encontrado un ganador!");
        } else {
            // Verificar otras condiciones después de revisar todas las filas

            if (nombredelequipo.getText().isEmpty() || sede.getText().isEmpty() || propietario.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Debe registrarse primero");
            } else {
                JOptionPane.showMessageDialog(this, "Ningún equipo ha ganado aún");

                // Puedes agregar más lógica aquí si es necesario
            }
        }
    }//GEN-LAST:event_ReiniciarActionPerformed

    private void sedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sedeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sedeActionPerformed

    private void ReclamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReclamarActionPerformed
        if (nombredelequipo.getText().isEmpty() || sede.getText().isEmpty() || propietario.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe registrarse si quiere reclamar");
        } else {
            // Verificar si hay un equipo ganador
            boolean equipoGanadorFila6 = false;

            for (int i = 0; i < modelo.getRowCount(); i++) {
                int puntos = (int) modelo.getValueAt(i, 7);
                if (puntos >= 13 && i == 5) { // Verificar que sea el equipo de la fila 6, columna 7
                    equipoGanadorFila6 = true;
                    break;
                }
            }

            if (!equipoGanadorFila6) {
                JOptionPane.showMessageDialog(this, "Primero debe ganar el equipo de la fila 6 para presionar el botón, presione el boton reiniciar");
            } else {
                int puntosFila6 = (int) modelo.getValueAt(5, 7);

                if (puntosFila6 == 13) {
                    sumarValorDeseado(500);

                    // Eliminar la fila número 5
                    modelo.removeRow(5);
                    if (juego == 1) {
                    juego = 0;
                    Registrar.setEnabled(true);
                    propietario.setText("");
                    nombredelequipo.setText("");
                    sede.setText("");
                    }

                    // Método para establecer los valores de las columnas a cero para todas las filas
                    resetearColumnas(modelo, 4);
                    resetearColumnas(modelo, 5);
                    resetearColumnas(modelo, 6);
                    resetearColumnas(modelo, 7);
                } else {
                    // Mensaje si el valor de la fila 6, columna 7 no es igual a 13
                    JOptionPane.showMessageDialog(this, "El equipo en la fila 6 aún no ha ganado");
                }
            }
       }
    }//GEN-LAST:event_ReclamarActionPerformed

    private void propietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_propietarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_propietarioActionPerformed

    private void JugarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JugarMouseClicked
            if (nombredelequipo.getText().isEmpty() || sede.getText().isEmpty() ||

            propietario.getText().isEmpty())
        { 
             sumarPartidoJugado();
           
        }       
        else { sumarPartidoJugado2();
        
        }
    }//GEN-LAST:event_JugarMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked

    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String contraseña = "123";
        if(Contraseña.getText().equals(contraseña) ){
            int fila=Integer.parseInt(txtfila.getText());

            int columna=Integer.parseInt(txtcolumna.getText());
            if(columna<4){
                String datonuevo = txtdatonuevo.getText();
                modelo.setValueAt(txtdatonuevo.getText(), fila, columna);
            }
            else {
                JOptionPane.showMessageDialog(this, " Los eventos no se pueden modificar ");
            }
        }

        else{
            JOptionPane.showMessageDialog(this, "Contraseña incorrecta");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void RegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarMouseClicked
       
    }//GEN-LAST:event_RegistrarMouseClicked

    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
        if(saldoinicial==0){
             Registrar.setEnabled(true);
             JOptionPane.showMessageDialog(rootPane, "Si gusta en participar, por favor Recargue");
            
        
       } else{
           if (nombredelequipo.getText().isEmpty() || sede.getText().isEmpty()
                || propietario.getText().isEmpty()) {

            JOptionPane.showMessageDialog(rootPane, "Si gusta en participar, por favor complete todos los campos");
        } else {
            agregarEquipo6();
       }
        }
    }//GEN-LAST:event_RegistrarActionPerformed

    private void txtfilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfilaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfilaActionPerformed

    private void txtcolumnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcolumnaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcolumnaActionPerformed

    private void recargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recargarActionPerformed
        // TODO add your handling code here:
        if (valor.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Por favor llene el valor a recargar");
        } else{
            int entero = Integer.parseInt(valor.getText());
            sumarValorDeseado(entero);
        }
    }//GEN-LAST:event_recargarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int fila =tabla.getSelectedRow();
        if(fila>=0){
            modelo.removeRow(fila);

        }else{
            JOptionPane.showMessageDialog(null,"seleccione la fila");

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int fila=tabla.getRowCount();
        for (int i=fila-1; i>=0; i--){
            modelo.removeRow(i);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Ligas atrs = new Ligas();
        atrs.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Femenino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Femenino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Femenino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Femenino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Femenino().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Contraseña;
    private javax.swing.JButton Jugar;
    private javax.swing.JButton Reclamar;
    private javax.swing.JButton Registrar;
    private javax.swing.JButton Reiniciar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombredelequipo;
    private javax.swing.JTextField propietario;
    private javax.swing.JButton recargar;
    private javax.swing.JLabel saldo;
    private javax.swing.JTextField sede;
    private javax.swing.JTable tabla;
    private javax.swing.JComboBox<String> tipodejuego;
    private javax.swing.JTextField txtcolumna;
    private javax.swing.JTextField txtdatonuevo;
    private javax.swing.JTextField txtfila;
    private javax.swing.JTextField valor;
    // End of variables declaration//GEN-END:variables
}
