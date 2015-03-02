/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package brothersburguer;


import java.awt.Point;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author robson
 */
public class TelaVendaProdutos extends javax.swing.JFrame {
    /**
     * Creates new form TelaVendaProdutos
     */
    public TelaVendaProdutos() {
        initComponents();
        
    }
    
     private Calendar getDate(){
        Calendar data = Calendar.getInstance();
        return data;
    }
    
     private String getTime(){
         DateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
         Date date = new Date();
         return dateFormat.format(date);
     }
    
    
    public static void calcSubTotUnit(){
        DefaultTableModel modelo = (DefaultTableModel) tProdutos.getModel();
        int i = modelo.getRowCount();
        for(int r = 0; r < i; r++){
            String val = (String) modelo.getValueAt(r, 3);
            String quant = (String) modelo.getValueAt(r, 2);
            double valor = Double.parseDouble(val);
            int qtde = Integer.parseInt(quant);
            double subTotal = valor*qtde;
            modelo.setValueAt(subTotal, r, 4);
        }
    }
    
        
    
     private void getTableItens(int codVenda){
        LancProd lp = new LancProd();
        DefaultTableModel modelo = (DefaultTableModel) tServicos.getModel();
        int  i = modelo.getRowCount();
        for(int r = 0; r < i; r++){
            lp.setCodigo_Venda(codVenda);
            lp.setCodigo_produto(Integer.parseInt((String) modelo.getValueAt(r, 0)));
            lp.setQuantidade((Integer) modelo.getValueAt(r, 2));
            lp.setPrec_unit((double) modelo.getValueAt(r, 3));
            lp.setPrec_total((double) modelo.getValueAt(r, 4));
            bdlp.insere(lp);
        }
     }
    
    public static void contaTotal(){
        DefaultTableModel modLanche = (DefaultTableModel) tLanches.getModel();
        DefaultTableModel modPorcao = (DefaultTableModel) tPorcoes.getModel();
        DefaultTableModel modBebida = (DefaultTableModel) tBebidas.getModel();
        
        int iLanche = modLanche.getRowCount();
        int iPorcao = modPorcao.getRowCount();
        int iBebida = modBebida.getRowCount();
        double total = 0;
        for(int r = 0; r < iLanche; r++) {
            double valor = Double.parseDouble(modLanche.getValueAt(r, 10).toString());
            total += valor;
        }
        for(int r = 0; r < iPorcao; r++){
            double valor = Double.parseDouble(modPorcao.getValueAt(r, 2).toString());
            total += valor;
        }
        for(int r = 0; r< iBebida; r++){
            double valor = Double.parseDouble(modBebida.getValueAt(r, 2).toString());
            total += valor;
        }
        
        tTotal.setText( Double.toString(total));  
        
        
        
    }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        tTotal = new javax.swing.JLabel();
        bAddLanche = new javax.swing.JButton();
        bConcluir = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tBebidas = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tLanches = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tPorcoes = new javax.swing.JTable();
        bAddBebidas = new javax.swing.JButton();
        bAddPorcao = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setText("Total R$:");

        tTotal.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        bAddLanche.setText("Adicionar Lanche");
        bAddLanche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddLancheActionPerformed(evt);
            }
        });

        bConcluir.setText("Concluir Pedido");
        bConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConcluirActionPerformed(evt);
            }
        });

        bCancelar.setText("Cancelar Pedido");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Bebidas"));

        tBebidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Preço Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tBebidas.getTableHeader().setReorderingAllowed(false);
        tBebidas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tBebidasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tBebidas);
        if (tBebidas.getColumnModel().getColumnCount() > 0) {
            tBebidas.getColumnModel().getColumn(0).setResizable(false);
            tBebidas.getColumnModel().getColumn(1).setResizable(false);
            tBebidas.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Lanches"));

        tLanches.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Pão", "Com.1", "Com.2", "Com.3", "Com.4", "Com.5", "Com.6", "Com.7", "Com.8", "Preço Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tLanches.getTableHeader().setReorderingAllowed(false);
        tLanches.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tLanchesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tLanches);
        if (tLanches.getColumnModel().getColumnCount() > 0) {
            tLanches.getColumnModel().getColumn(0).setResizable(false);
            tLanches.getColumnModel().getColumn(0).setPreferredWidth(100);
            tLanches.getColumnModel().getColumn(1).setResizable(false);
            tLanches.getColumnModel().getColumn(2).setResizable(false);
            tLanches.getColumnModel().getColumn(3).setResizable(false);
            tLanches.getColumnModel().getColumn(4).setResizable(false);
            tLanches.getColumnModel().getColumn(5).setResizable(false);
            tLanches.getColumnModel().getColumn(6).setResizable(false);
            tLanches.getColumnModel().getColumn(7).setResizable(false);
            tLanches.getColumnModel().getColumn(8).setResizable(false);
            tLanches.getColumnModel().getColumn(9).setResizable(false);
            tLanches.getColumnModel().getColumn(10).setResizable(false);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 823, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Porções"));

        tPorcoes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Preço Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tPorcoes.getTableHeader().setReorderingAllowed(false);
        tPorcoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tPorcoesMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tPorcoes);
        if (tPorcoes.getColumnModel().getColumnCount() > 0) {
            tPorcoes.getColumnModel().getColumn(0).setResizable(false);
            tPorcoes.getColumnModel().getColumn(1).setResizable(false);
            tPorcoes.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
        );

        bAddBebidas.setText("Adicionar Bebidas");
        bAddBebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddBebidasActionPerformed(evt);
            }
        });

        bAddPorcao.setText("Adicionar Porção");
        bAddPorcao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddPorcaoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Pedido Num:");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextField1.setText("1");
        jTextField1.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bAddLanche, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(bAddPorcao, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bAddBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bConcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(172, 172, 172)
                        .addComponent(bCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bAddLanche, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bAddPorcao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bAddBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(184, 184, 184)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bConcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                            .addComponent(bCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(70, 70, 70)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(462, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bAddLancheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddLancheActionPerformed
        AdicionarLanche t = new AdicionarLanche();
        t.setVisible(true);
    }//GEN-LAST:event_bAddLancheActionPerformed

    private void bConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConcluirActionPerformed

    }//GEN-LAST:event_bConcluirActionPerformed

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_bCancelarActionPerformed

    private void bAddBebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddBebidasActionPerformed
        AdicionarBebida t = new AdicionarBebida();
        t.setVisible(true);
    }//GEN-LAST:event_bAddBebidasActionPerformed

    private void bAddPorcaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddPorcaoActionPerformed
        AdicionarPorcao t = new AdicionarPorcao();
        t.setVisible(true);
    }//GEN-LAST:event_bAddPorcaoActionPerformed

    private void tLanchesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tLanchesMouseClicked
       if(evt.getClickCount() == 2){
           int resposta = JOptionPane.showConfirmDialog(this, "Deseja Excluir esse item?");
           System.out.println(resposta);
           if(resposta==0){
               DefaultTableModel modelo = (DefaultTableModel) tLanches.getModel();
               Point p = evt.getPoint();
               int row = tLanches.rowAtPoint(p);
               modelo.removeRow(row);
               contaTotal();
           }           
       }
    }//GEN-LAST:event_tLanchesMouseClicked

    private void tPorcoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tPorcoesMouseClicked
        if(evt.getClickCount() == 2){
           int resposta = JOptionPane.showConfirmDialog(this, "Deseja Excluir esse item?");
           System.out.println(resposta);
           if(resposta==0){
               DefaultTableModel modelo = (DefaultTableModel) tPorcoes.getModel();
               Point p = evt.getPoint();
               int row = tPorcoes.rowAtPoint(p);
               modelo.removeRow(row);
               contaTotal();
           }           
       }
    }//GEN-LAST:event_tPorcoesMouseClicked

    private void tBebidasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tBebidasMouseClicked
        if(evt.getClickCount() == 2){
           int resposta = JOptionPane.showConfirmDialog(this, "Deseja Excluir esse item?");
           System.out.println(resposta);
           if(resposta==0){
               DefaultTableModel modelo = (DefaultTableModel) tBebidas.getModel();
               Point p = evt.getPoint();
               int row = tBebidas.rowAtPoint(p);
               modelo.removeRow(row);
               contaTotal();
           }           
       }
    }//GEN-LAST:event_tBebidasMouseClicked

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
            java.util.logging.Logger.getLogger(TelaVendaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVendaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVendaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVendaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVendaProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAddBebidas;
    private javax.swing.JButton bAddLanche;
    private javax.swing.JButton bAddPorcao;
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bConcluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    public static javax.swing.JTable tBebidas;
    public static javax.swing.JTable tLanches;
    public static javax.swing.JTable tPorcoes;
    private static javax.swing.JLabel tTotal;
    // End of variables declaration//GEN-END:variables
}
