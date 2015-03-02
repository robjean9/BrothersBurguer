/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bd;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import vo.Produto;

/**
 *
 * @author Rafael
 */
public class BdItensPedido extends Bd.bd{
    public void insere(Produto P){
        String sql="insert into produto (idprod, nome, preco)values(?,?,?)";
       // try{
           // PreparedStatement ps= getCon().prepareStatement(sql);
          //  ps.setString(1, P.getIdprod());
           // ps.setString(2, P.getNome());
           // ps.setString(3, P.getPreco());
           // ps.execute();
       // } catch (SQLException e) {
          //  JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }

}

