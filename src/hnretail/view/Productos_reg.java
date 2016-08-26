/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hnretail.view;

import com.sun.glass.events.KeyEvent;
import hnretail.dml.dataAccess;
import hnretail.model.Producto;
import java.awt.Color;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;

/**
 *
 * @author abendezu
 */
public class Productos_reg extends javax.swing.JInternalFrame {
    
    dataAccess dA = new dataAccess();
    /**
     * Creates new form productos_vw
     */
    public Productos_reg() {
        System.out.println("1");
        initComponents();
        System.out.println("2");        
        clearScreen();
        System.out.println("3");        
        cboxes();
        System.out.println("4");        
        codigoBarra.requestFocus();
        System.out.println("5");        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        codigoBarra = new javax.swing.JTextField();
        nombreProducto = new javax.swing.JTextField();
        cantidad = new javax.swing.JTextField();
        precioVenta = new javax.swing.JTextField();
        precioCosto = new javax.swing.JTextField();
        jscroll = new javax.swing.JScrollPane();
        descProd = new javax.swing.JTextArea();
        categoriaCbox = new javax.swing.JComboBox<>();
        proveedorCbox = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Registro de Productos");

        jLabel2.setText("Codigo Barra");

        jLabel3.setText("Nombre Producto");

        jLabel4.setText("Descripcion Producto");

        jLabel5.setText("Cantidad");

        jLabel6.setText("Precio Costo");

        jLabel7.setText("Precio Venta");

        jLabel9.setText("Proveedor");

        jLabel10.setText("Categoria");

        codigoBarra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoBarraActionPerformed(evt);
            }
        });

        nombreProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreProductoActionPerformed(evt);
            }
        });

        cantidad.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadActionPerformed(evt);
            }
        });
        cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cantidadKeyPressed(evt);
            }
        });

        precioVenta.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        precioVenta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                precioVentaFocusLost(evt);
            }
        });
        precioVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioVentaActionPerformed(evt);
            }
        });
        precioVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                precioVentaKeyPressed(evt);
            }
        });

        precioCosto.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        precioCosto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                precioCostoFocusLost(evt);
            }
        });
        precioCosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioCostoActionPerformed(evt);
            }
        });
        precioCosto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                precioCostoKeyPressed(evt);
            }
        });

        descProd.setColumns(20);
        descProd.setRows(5);
        jscroll.setViewportView(descProd);

        categoriaCbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item  2", "Item  3", "Item  4" }));
        categoriaCbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriaCboxActionPerformed(evt);
            }
        });

        proveedorCbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item  3", "Item  4" }));

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jscroll, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(proveedorCbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(categoriaCbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)
                                .addGap(30, 30, 30)
                                .addComponent(jButton3))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(precioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(codigoBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(nombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(precioCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(271, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoBarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precioCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jLabel4)
                .addGap(12, 12, 12)
                .addComponent(jscroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(proveedorCbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoriaCbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void clearScreen()
    {
       codigoBarra.setText("");
       nombreProducto.setText("");
       cantidad.setText("");
       precioCosto.setText("");
       precioVenta.setText("");
       descProd.setText("");
    }
    
    public void cboxes(){
        System.out.println("11");        
        categoriaCbox.removeAllItems();
        System.out.println("12");        
        categoriaCbox.addItem("<--Seleccione-->");
        System.out.println("13");        
        proveedorCbox.removeAllItems();
        System.out.println("14");        
        proveedorCbox.addItem("<--Seleccione-->");
        System.out.println("15");        
        
        Object[] prov = dA.fill_combox("proveedor", "concat(NombreProveedor,' (',codigoProveedor,')')"); 
        System.out.println("16");        
        for(int i=0;i<prov.length;i++){
        System.out.println("17");            
            //proveedorCbox.addItem((String) prov[i]);
            proveedorCbox.addItem(prov[i].toString());
        }            
        System.out.println("18");
        Object[] cate = dA.fill_combox("categoria", "concat(tipoCategoria,' (',codigoCategoria,')')"); 
        System.out.println("19");        
        for(int i=0;i<cate.length;i++){
        System.out.println("20");            
            //categoriaCbox.addItem((String) cate[i]);
            categoriaCbox.addItem(cate[i].toString());            
        }            

    }

    public boolean todolleno(){
        boolean paso = true;
        if (codigoBarra.getText().trim().isEmpty()){
            paso = false;
            codigoBarra.requestFocus();
            codigoBarra.setBackground(Color.RED);
            return paso;            
        }
        if (nombreProducto.getText().trim().isEmpty()){
            paso = false;
            nombreProducto.requestFocus();
            nombreProducto.setBackground(Color.RED);
            return paso;            
        }
        if (nombreProducto.getText().trim().isEmpty()){
            paso = false;
            nombreProducto.requestFocus();
            nombreProducto.setBackground(Color.RED);
            return paso;            
        }
        if (cantidad.getText().trim().isEmpty()){
            paso = false;
            cantidad.requestFocus();
            cantidad.setBackground(Color.RED);
            return paso;            
        }
        if (precioCosto.getText().trim().isEmpty()){
            paso = false;
            precioCosto.requestFocus();
            precioCosto.setBackground(Color.RED);
            return paso;            
        }
        if (precioVenta.getText().trim().isEmpty()){
            paso = false;
            precioCosto.requestFocus();
            precioCosto.setBackground(Color.RED);
            return paso;            
        }
        if (descProd.getText().trim().isEmpty()){
            paso = false;
            descProd.requestFocus();
            descProd.setBackground(Color.RED);
            return paso;            
        }
        if (categoriaCbox.getSelectedIndex()==-1){
                        System.out.println("8");
            paso = false;
            categoriaCbox.requestFocus();
            categoriaCbox.setBackground(Color.RED);
            return paso;            
        }
        if (proveedorCbox.getSelectedIndex()==-1){
                        System.out.println("9");
            paso = false;
            proveedorCbox.requestFocus();
            proveedorCbox.setBackground(Color.RED);
            return paso;            
        }        
        return paso;        
    }
            
    private void codigoBarraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoBarraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoBarraActionPerformed

    private void nombreProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreProductoActionPerformed

    private void cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadActionPerformed

    private void precioVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioVentaActionPerformed

    private void precioCostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioCostoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioCostoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dA.cierra_Acceso();
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        clearScreen();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String cBoxValue;

/*            System.out.println("Que hay aqui "+categoriaCbox.getSelectedItem().toString());
            cBoxValue = categoriaCbox.getSelectedItem().toString();
            System.out.println("Este es el indice "+cBoxValue.indexOf("("));
            System.out.println("Este seria el substring"+cBoxValue.substring(cBoxValue.indexOf("(")+1,cBoxValue.lastIndexOf(")")));
            cBoxValue = cBoxValue.substring(cBoxValue.indexOf('('), 1);
            System.out.println("Este es el valor "+cBoxValue);*/
        
        if (todolleno()){            
            Producto prod = new Producto();
            prod.setCodigoBarra(codigoBarra.getText());
            prod.setNombreProducto(nombreProducto.getText());
            prod.setCantidad(parseInt(cantidad.getText()));
            prod.setPrecioCosto(parseDouble(precioCosto.getText()));
            prod.setPrecioVenta(parseDouble(precioVenta.getText()));
            prod.setDescripProd(descProd.getText());
            cBoxValue = categoriaCbox.getSelectedItem().toString();
            cBoxValue = cBoxValue.substring(cBoxValue.indexOf('(')+1, cBoxValue.lastIndexOf(")"));
            prod.setCategoriaProd(parseInt(cBoxValue));
            cBoxValue = proveedorCbox.getSelectedItem().toString();
            cBoxValue = cBoxValue.substring(cBoxValue.indexOf('(')+1, cBoxValue.lastIndexOf(")"));
            prod.setProveedorProd(parseInt(cBoxValue));
            dA = new dataAccess();
            if (dA.registra_producto(prod)){
                JOptionPane.showMessageDialog(null, "Listo", "Paso", JOptionPane.OK_OPTION);
                clearScreen();
                cboxes();
                codigoBarra.requestFocus();
            }else {
                JOptionPane.showMessageDialog(null, "No se pudo Guardar", "Error", JOptionPane.WARNING_MESSAGE);
            }
        }else {
            System.out.println("Nop no entro");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void categoriaCboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriaCboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoriaCboxActionPerformed

    private void cantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadKeyPressed
        int key=evt.getKeyCode();
        if((key>=evt.VK_0&&key<=evt.VK_9)||(key>=evt.VK_NUMPAD0&&key<=evt.VK_NUMPAD9)||key==KeyEvent.VK_BACKSPACE){
            cantidad.setEditable(true);            
        } else {
            cantidad.setEditable(false);
        }       
    }//GEN-LAST:event_cantidadKeyPressed

    private void precioCostoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precioCostoKeyPressed
        int key=evt.getKeyCode();
        if((key>=evt.VK_0&&key<=evt.VK_9)||(key>=evt.VK_NUMPAD0&&key<=evt.VK_NUMPAD9)||key==KeyEvent.VK_BACKSPACE||key==KeyEvent.VK_PERIOD){
            precioCosto.setEditable(true);            
        } else {
            precioCosto.setEditable(false);
        }       
    }//GEN-LAST:event_precioCostoKeyPressed

    private void precioVentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precioVentaKeyPressed
        int key=evt.getKeyCode();
        if((key>=evt.VK_0&&key<=evt.VK_9)||(key>=evt.VK_NUMPAD0&&key<=evt.VK_NUMPAD9)||key==KeyEvent.VK_BACKSPACE||key==KeyEvent.VK_PERIOD){ 
            precioVenta.setEditable(true);            
        } else {
            precioVenta.setEditable(false);
        }       
    }//GEN-LAST:event_precioVentaKeyPressed

    private void precioCostoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_precioCostoFocusLost
        Double valor;
        try{
            valor = Double.parseDouble(this.precioCosto.getText());            
            precioCosto.setBackground(Color.WHITE);
        } catch (NumberFormatException e) {            
            precioCosto.requestFocus();
            precioCosto.setBackground(Color.RED);
        }
    }//GEN-LAST:event_precioCostoFocusLost

    private void precioVentaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_precioVentaFocusLost
        Double valor;
        try{
            valor = Double.parseDouble(this.precioVenta.getText());            
            precioVenta.setBackground(Color.WHITE);
        } catch (NumberFormatException e) {            
            precioVenta.requestFocus();
            precioVenta.setBackground(Color.RED);
        }
    }//GEN-LAST:event_precioVentaFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cantidad;
    private javax.swing.JComboBox<String> categoriaCbox;
    private javax.swing.JTextField codigoBarra;
    private javax.swing.JTextArea descProd;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jscroll;
    private javax.swing.JTextField nombreProducto;
    private javax.swing.JTextField precioCosto;
    private javax.swing.JTextField precioVenta;
    private javax.swing.JComboBox<String> proveedorCbox;
    // End of variables declaration//GEN-END:variables
}
