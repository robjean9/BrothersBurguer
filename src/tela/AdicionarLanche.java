/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tela;

import bd.BdComplemento;
import bd.BdLanche;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;
import vo.Complemento;
import vo.Lanche;

/**
 *
 * @author robson
 */
public class AdicionarLanche extends javax.swing.JFrame {

    /**
     * Creates new form AdicionarLanche
     */
    
    public AdicionarLanche() {
        initComponents();
        preencheComboLanche();
        preencheComboComplemento();
    }
    
    private void preencheComboLanche(){
        BdLanche bdl = new BdLanche();
        ArrayList l = (ArrayList) bdl.retornaTabela();
        for(Iterator it = l.iterator(); it.hasNext();){
            Lanche lanche = (Lanche) it.next();
            cmbLanche.addItem(lanche.getNome());
        }
        bdl.fecha();
    }
    
    private void preencheComboComplemento(){
        BdComplemento bdcp = new BdComplemento();
        ArrayList l = (ArrayList) bdcp.retornaTabela();
        for(Iterator it = l.iterator(); it.hasNext();){
            Complemento complemento = (Complemento) it.next();
            cmbComp1.addItem(complemento.getNome());
            cmbComp2.addItem(complemento.getNome());
            cmbComp3.addItem(complemento.getNome());
            cmbComp4.addItem(complemento.getNome());
            cmbComp5.addItem(complemento.getNome());
            cmbComp6.addItem(complemento.getNome());
            cmbComp7.addItem(complemento.getNome());
            cmbComp8.addItem(complemento.getNome());
        }
        bdcp.fecha();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cmbLanche = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        cmbComp1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        cmbComp2 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        cmbComp3 = new javax.swing.JComboBox();
        cmbComp4 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        cmbComp5 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmbComp6 = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        cmbComp7 = new javax.swing.JComboBox();
        cmbComp8 = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cmbPao = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Lanche:");

        cmbLanche.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Complemento 1:");

        cmbComp1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbComp1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nenhum" }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Complemento 2:");

        cmbComp2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbComp2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nenhum" }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Complemento 3:");

        cmbComp3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbComp3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nenhum" }));

        cmbComp4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbComp4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nenhum" }));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Complemento 4:");

        cmbComp5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbComp5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nenhum" }));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Complemento 5:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Complemento 6:");

        cmbComp6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbComp6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nenhum" }));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Complemento 7:");

        cmbComp7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbComp7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nenhum" }));

        cmbComp8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbComp8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nenhum" }));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Complemento 8:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Pão:");

        cmbPao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbPao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Macio", "Crocante" }));

        jButton1.setText("Adicionar");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbLanche, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbComp1, 0, 540, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbComp2, 0, 540, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbComp3, 0, 540, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbComp4, 0, 540, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbComp5, 0, 540, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbComp6, 0, 540, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbComp7, 0, 540, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbComp8, 0, 540, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbPao, 0, 636, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbLanche, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cmbPao, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbComp1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbComp2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbComp3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbComp4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbComp5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cmbComp6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cmbComp7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cmbComp8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) TelaVendaProdutos.tLanches.getModel();
        BdLanche bdl = new BdLanche();
        BdComplemento bdpc = new BdComplemento();
        
        double total = 0;
        
        Lanche l = bdl.localizaNome(cmbLanche.getSelectedItem().toString());
        total += l.getPreco();
        if(!cmbComp1.getSelectedItem().toString().equals("Nenhum")){
            Complemento cp1 = bdpc.localizaNome(cmbComp1.getSelectedItem().toString());
            total += cp1.getPreco();
        }
        if(!cmbComp2.getSelectedItem().toString().equals("Nenhum")){
            Complemento cp2 = bdpc.localizaNome(cmbComp2.getSelectedItem().toString());
            total += cp2.getPreco();
        }
        if(!cmbComp3.getSelectedItem().toString().equals("Nenhum")){
            Complemento cp3 = bdpc.localizaNome(cmbComp3.getSelectedItem().toString());
            total += cp3.getPreco();
        }
        if(!cmbComp4.getSelectedItem().toString().equals("Nenhum")){
            Complemento cp4 = bdpc.localizaNome(cmbComp4.getSelectedItem().toString());
            total += cp4.getPreco();
        }
        if(!cmbComp5.getSelectedItem().toString().equals("Nenhum")){
            Complemento cp5 = bdpc.localizaNome(cmbComp5.getSelectedItem().toString());
            total += cp5.getPreco();
        }
        if(!cmbComp6.getSelectedItem().toString().equals("Nenhum")){
            Complemento cp6 = bdpc.localizaNome(cmbComp6.getSelectedItem().toString());
            total += cp6.getPreco();
        }
        if(!cmbComp7.getSelectedItem().toString().equals("Nenhum")){
            Complemento cp7 = bdpc.localizaNome(cmbComp7.getSelectedItem().toString());
            total += cp7.getPreco();
        }
        if(!cmbComp8.getSelectedItem().toString().equals("Nenhum")){
            Complemento cp8 = bdpc.localizaNome(cmbComp8.getSelectedItem().toString());
            total += cp8.getPreco();
        }
        
        modelo.addRow(new Object[]{cmbLanche.getSelectedItem().toString(),cmbPao.getSelectedItem().toString(),cmbComp1.getSelectedItem().toString(),cmbComp2.getSelectedItem().toString(),cmbComp3.getSelectedItem().toString(),cmbComp4.getSelectedItem().toString(),cmbComp5.getSelectedItem().toString(),cmbComp6.getSelectedItem().toString(),cmbComp7.getSelectedItem().toString(),cmbComp8.getSelectedItem().toString(),total});
        TelaVendaProdutos.contaTotal();
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(AdicionarLanche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdicionarLanche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdicionarLanche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdicionarLanche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdicionarLanche().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbComp1;
    private javax.swing.JComboBox cmbComp2;
    private javax.swing.JComboBox cmbComp3;
    private javax.swing.JComboBox cmbComp4;
    private javax.swing.JComboBox cmbComp5;
    private javax.swing.JComboBox cmbComp6;
    private javax.swing.JComboBox cmbComp7;
    private javax.swing.JComboBox cmbComp8;
    private javax.swing.JComboBox cmbLanche;
    private javax.swing.JComboBox cmbPao;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
