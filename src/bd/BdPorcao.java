/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import vo.Porcao;
import vo.Porcao;
import vo.Produto;

/**
 *
 * @author rafael
 */
public class BdPorcao extends bd.Bd {
     public BdPorcao(){
    try{
            conexao();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }

    
    
    
    public void insere(Porcao P){
        String sql="insert into porcao (idporcao, nome, preco)values(?,?,?)";
        try{
            PreparedStatement ps= getCon().prepareStatement(sql);
            ps.setInt(1, P.getIdporcao());
            ps.setString(2, P.getNome());
            ps.setString(3, P.getPreco());
            ps.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }

}
    public void atualiza(Porcao P){
        String sql="update porcao set nome=?, preco=? where idporcao=?";
        try{
            PreparedStatement ps= getCon().prepareStatement(sql);
            ps.setString(1, P.getNome());
            ps.setString(2, P.getPreco());
            ps.setInt(3, P.getIdporcao());
            ps.execute();}
        catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro SQL " +e.getMessage());
        }

    }
    public Porcao localizaId(String idPorcao){
        String sql="select * from porcao where idporcao='" + idPorcao +"'";
        Porcao registro = new Porcao();
        try{
            PreparedStatement  ps = getCon().prepareStatement(sql);
            //ps.setString(1, idprod);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                registro.setIdporcao(rs.getInt("idporcao"));
                registro.setNome(rs.getString("nome"));
                registro.setPreco(rs.getString("preco"));
            }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro SQL: " + e.getMessage());
        }
        return registro;
    }

    public Porcao localizaNome(String nome){
        String sql="select * from porcao where nome='" + nome +"'";
        Porcao registro = new Porcao();
        try{
            Statement st=getCon().createStatement();
            ResultSet rs=st.executeQuery(sql);
            if(rs.next()){
                registro.setIdporcao(rs.getInt("idporcao"));
                registro.setNome(rs.getString("nome"));
                registro.setPreco(rs.getString("preco"));

            }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro SQL: " + e.getMessage());
        }
        return registro;
    }

public List pesquisaNomeTabela(String busca){
    String sql = "select * from porcao where nome like '%" + busca + "%'";
    List lista = new ArrayList();
    try{
        Statement st=getCon().createStatement();
        ResultSet rs=st.executeQuery(sql);
        while (rs.next()){
            Porcao registro=new Porcao();
                registro.setIdporcao(rs.getInt("idporcao"));
                registro.setNome(rs.getString("nome"));
                registro.setPreco(rs.getString("preco"));
            lista.add(registro);
           }
    } catch (SQLException e){
               JOptionPane.showMessageDialog(null, "Erro SQL: " +e.getMessage());
           }
           return lista;
    }
public List pesquisaIdporcaoTabela(String busca){
    String sql = "select * from Porcao where idporcao like '%" + busca + "%'";
    List lista = new ArrayList();
    try{
        Statement st=getCon().createStatement();
        ResultSet rs=st.executeQuery(sql);
        while (rs.next()){
            Porcao registro=new Porcao();
                registro.setIdporcao(rs.getInt("idporcao"));
                registro.setNome(rs.getString("nome"));
                registro.setPreco(rs.getString("preco"));
            lista.add(registro);
           }
    } catch (SQLException e){
               JOptionPane.showMessageDialog(null, "Erro SQL: " +e.getMessage());
           }
           return lista;
    }

public List retornaTabela() {
          String sql = "select idporcao,nome,preco from porcao ORDER BY idporcao";
            List lista = new ArrayList();
            try {
               PreparedStatement st = getCon().prepareStatement(sql);
               ResultSet rs = st.executeQuery();
               while (rs.next()) {
               Porcao registro = new Porcao();
               registro.setIdporcao(rs.getInt("idporcao"));
                registro.setNome(rs.getString("nome"));
                registro.setPreco(rs.getString("preco"));
               lista.add(registro);
               }
            } catch (SQLException e) {
              JOptionPane.showMessageDialog(null, "Erro SQL: " + e.getMessage());
           }
            return lista;
        }
public List pesquisaComboBox(){
    String sql = "select nome from porcao order by nome";
    List lista = new ArrayList();
    try{
        Statement st=getCon().createStatement();
        ResultSet rs=st.executeQuery(sql);
        while (rs.next()){
            Produto registro=new Produto();
                registro.setNome(rs.getString("nome"));
            lista.add(registro);
           }
    } catch (SQLException e){
               JOptionPane.showMessageDialog(null, "Erro SQL: " +e.getMessage());
           }
           return lista;
    }


public void exclui(int idBebida){
    String sql="delete from porcao where idporcao=?";
    try{
        Statement st= getCon().createStatement();
        PreparedStatement ps=getCon().prepareStatement(sql);
        ps.setInt(1, idBebida);
        ps.execute();
    } catch (SQLException e){
        JOptionPane.showMessageDialog(null, "Erro SQL: " + e.getMessage());
}
}

}
