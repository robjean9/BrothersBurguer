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
import vo.Produto;

/**
 *
 * @author Rafael
 */
public class BdProduto extends bd.Bd {
     public BdProduto(){
    try{
            conexao();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }

    
    
    
    public void insere(Produto P){
        String sql="insert into produto (idprod, nome, preco)values(?,?,?)";
        try{
            PreparedStatement ps= getCon().prepareStatement(sql);
            ps.setString(1, P.getIdprod());
            ps.setString(2, P.getNome());
            ps.setString(3, P.getPreco());
            ps.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }

}
    public void atualiza(Produto P){
        String sql="update produto set nome=?, preco=? where idprod=?";
        try{
            PreparedStatement ps= getCon().prepareStatement(sql);
            ps.setString(1, P.getNome());
            ps.setString(2, P.getPreco());
            ps.setString(3, P.getIdprod());
            ps.execute();}
        catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro SQL " +e.getMessage());
        }

    }
    public Produto localizaId(String idprod){
        String sql="select * from produto where idprod='" + idprod +"'";
        Produto registro = new Produto();
        try{
            PreparedStatement  ps = getCon().prepareStatement(sql);
            //ps.setString(1, idprod);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                registro.setIdprod(rs.getString("idprod"));
                registro.setNome(rs.getString("nome"));
                registro.setPreco(rs.getString("preco"));
            }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro SQL: " + e.getMessage());
        }
        return registro;
    }

    public Produto localizaNome(String nome){
        String sql="select * from produto where nome='" + nome +"'";
        Produto registro = new Produto();
        try{
            Statement st=getCon().createStatement();
            ResultSet rs=st.executeQuery(sql);
            if(rs.next()){
                registro.setIdprod(rs.getString("idprod"));
                registro.setNome(rs.getString("nome"));
                registro.setPreco(rs.getString("preco"));

            }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro SQL: " + e.getMessage());
        }
        return registro;
    }

public List pesquisaNomeTabela(String busca){
    String sql = "select * from produto where nome like '%" + busca + "%'";
    List lista = new ArrayList();
    try{
        Statement st=getCon().createStatement();
        ResultSet rs=st.executeQuery(sql);
        while (rs.next()){
            Produto registro=new Produto();
                registro.setIdprod(rs.getString("idprod"));
                registro.setNome(rs.getString("nome"));
                registro.setPreco(rs.getString("preco"));
            lista.add(registro);
           }
    } catch (SQLException e){
               JOptionPane.showMessageDialog(null, "Erro SQL: " +e.getMessage());
           }
           return lista;
    }
public List pesquisaIdprodTabela(String busca){
    String sql = "select * from produto where idprod like '%" + busca + "%'";
    List lista = new ArrayList();
    try{
        Statement st=getCon().createStatement();
        ResultSet rs=st.executeQuery(sql);
        while (rs.next()){
            Produto registro=new Produto();
                registro.setIdprod(rs.getString("idprod"));
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
          String sql = "select idprod,nome,preco from produto ORDER BY idprod";
            List lista = new ArrayList();
            try {
               PreparedStatement st = getCon().prepareStatement(sql);
               ResultSet rs = st.executeQuery();
               while (rs.next()) {
               Produto registro = new Produto();
               registro.setIdprod(rs.getString("idprod"));
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
    String sql = "select nome from produto order by nome";
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


public void exclui(String idprod){
    String sql="delete from produto where idprod=?";
    try{
        Statement st= getCon().createStatement();
        PreparedStatement ps=getCon().prepareStatement(sql);
        ps.setString(1, idprod);
        ps.execute();
    } catch (SQLException e){
        JOptionPane.showMessageDialog(null, "Erro SQL: " + e.getMessage());
}
}

public boolean verificaNome(String nome) throws Exception{  
        PreparedStatement ps=getCon().prepareStatement("SELECT  nome FROM produto WHERE nome = ?");  
            ps.setString(1, nome);   
            ResultSet rs = ps.executeQuery();  
            boolean existe = rs.next();      
            return existe;   
    }   
}
