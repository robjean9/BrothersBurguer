/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tela;

import bd.BdLanche;
import java.awt.Point;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import vo.Lanche;

/**
 *
 * @author Rafael
 */
public class TabelaLanche extends javax.swing.JFrame {

    /**
     * Creates new form TabelaLanche
     */
    BdLanche bd;
    public TabelaLanche() {
        initComponents();
        preencheTabela();
    }
private void preencheTabela() {
      DefaultTableModel modelo = (DefaultTableModel) jTableLanche.getModel();
        int i = modelo.getRowCount();
        while (i--> 0) {
            modelo.removeRow(i);
        }
        bd = new BdLanche();
        List c = bd.retornaTabela();
        for (Iterator it = c.iterator(); it.hasNext();) {
            Lanche P = (Lanche) it.next();
            modelo.addRow(new Object[]{P.getIdlanche(), P.getNome(), P.getPreco()});

        }
        bd.fecha();
    }

     private void preencheTabelaPesquisaNome() {
      DefaultTableModel modelo = (DefaultTableModel) jTableLanche.getModel();
        int i = modelo.getRowCount();
        while (i--> 0) {
            modelo.removeRow(i);
        }
        bd = new BdLanche();
        List c = bd.pesquisaNomeTabela(tFiltro.getText());
        for (Iterator it = c.iterator(); it.hasNext();) {
            Lanche P = (Lanche) it.next();
            modelo.addRow(new Object[]{P.getIdlanche(), P.getNome(), P.getPreco()});

        }
        bd.fecha();
    }
     private void preencheTabelaPesquisaId() {
      DefaultTableModel modelo = (DefaultTableModel) jTableLanche.getModel();
        int i = modelo.getRowCount();
        while (i--> 0) {
            modelo.removeRow(i);
        }
        bd = new BdLanche();
        List c = bd.pesquisaIdlancheTabela(tFiltroId.getText());
        for (Iterator it = c.iterator(); it.hasNext();) {
            Lanche P = (Lanche) it.next();
            modelo.addRow(new Object[]{P.getIdlanche(), P.getNome(), P.getPreco()});

        }
        bd.fecha();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableLanche = new javax.swing.JTable();
        tFiltroId = new javax.swing.JTextField();
        tFiltro = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bCadastra = new javax.swing.JButton();
        bAtualiza1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTableLanche.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Nome", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableLanche.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableLancheMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableLanche);

        tFiltroId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tFiltroId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tFiltroIdActionPerformed(evt);
            }
        });
        tFiltroId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tFiltroIdKeyReleased(evt);
            }
        });

        tFiltro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tFiltroActionPerformed(evt);
            }
        });
        tFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tFiltroKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Buscar por nome");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Buscar por código");

        bCadastra.setText("Cadastrar lanche");
        bCadastra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCadastraActionPerformed(evt);
            }
        });

        bAtualiza1.setText("Atualizar");
        bAtualiza1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAtualiza1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addComponent(bCadastra, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tFiltroId, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(bAtualiza1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(647, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tFiltroId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(bCadastra, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(bAtualiza1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(553, 553, 553)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExibirLancheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExibirLancheActionPerformed
        // TODO add your handling code here:
        preencheTabela();
    }//GEN-LAST:event_btnExibirLancheActionPerformed

    private void btnCadastrarLancheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarLancheActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnCadastrarLancheActionPerformed

    private void tFiltroIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tFiltroIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tFiltroIdActionPerformed

    private void tFiltroIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tFiltroIdKeyReleased
        // TODO add your handling code here:
        preencheTabelaPesquisaId();
    }//GEN-LAST:event_tFiltroIdKeyReleased

    private void tFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tFiltroActionPerformed

    private void tFiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tFiltroKeyReleased
        // TODO add your handling code here:
        preencheTabelaPesquisaNome();
    }//GEN-LAST:event_tFiltroKeyReleased

    private void jTableLancheMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableLancheMouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount() == 2){
            Point p = evt.getPoint();
            int row = jTableLanche.rowAtPoint(p);
            DefaultTableModel modelo = (DefaultTableModel) jTableLanche.getModel();
            String idlanche =(String)  modelo.getValueAt(row, 0);
            CadastroLanche t = new CadastroLanche();
            t.setNovo(false);
            bd = new BdLanche();
            t.setL(bd.localizaId(idlanche));
            bd.fecha();
            t.setVisible(true);
        }
    }//GEN-LAST:event_jTableLancheMouseClicked

    private void bCadastraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCadastraActionPerformed
        // TODO add your handling code here:
        CadastroLanche t = new CadastroLanche();
        t.setVisible(true);
    }//GEN-LAST:event_bCadastraActionPerformed

    private void bAtualiza1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAtualiza1ActionPerformed
        // TODO add your handling code here:
        preencheTabela();
    }//GEN-LAST:event_bAtualiza1ActionPerformed

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
            java.util.logging.Logger.getLogger(TabelaLanche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TabelaLanche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TabelaLanche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TabelaLanche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TabelaLanche().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAtualiza1;
    private javax.swing.JButton bCadastra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableLanche;
    private javax.swing.JTextField tFiltro;
    private javax.swing.JTextField tFiltroId;
    // End of variables declaration//GEN-END:variables
}
