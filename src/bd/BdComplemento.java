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
import vo.Complemento;
import vo.Produto;

/**
 *
 * @author rafael
 */
public class BdComplemento extends bd.Bd {
     public BdComplemento(){
    try{
            conexao();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }

    
    
    
    public void insere(Complemento C){
        String sql="insert into complemento (idcomp, nome, preco)values(?,?,?)";
        try{
            PreparedStatement ps= getCon().prepareStatement(sql);
            ps.setInt(1, C.getIdcomplemento());
            ps.setString(2, C.getNome());
            ps.setDouble(3, C.getPreco());
            ps.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }

}
    public void atualiza(Complemento C){
        String sql="update complemento set nome=?, preco=? where idcomp=?";
        try{
            PreparedStatement ps= getCon().prepareStatement(sql);
            ps.setString(1, C.getNome());
            ps.setDouble(2, C.getPreco());
            ps.setInt(3, C.getIdcomplemento());
            ps.execute();}
        catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro SQL " +e.getMessage());
        }

    }
    public Complemento localizaId(int idComplemento){
        String sql="select * from Complemento where idcomp='" + idComplemento +"'";
        Complemento registro = new Complemento();
        try{
            PreparedStatement  ps = getCon().prepareStatement(sql);
            //ps.setString(1, idprod);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                registro.setIdcomplemento(rs.getInt("idcomp"));
                registro.setNome(rs.getString("nome"));
                registro.setPreco(rs.getDouble("preco"));
            }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro SQL: " + e.getMessage());
        }
        return registro;
    }

    public Complemento localizaNome(String nome){
        String sql="select * from complemento where nome='" + nome +"'";
        Complemento registro = new Complemento();
        try{
            Statement st=getCon().createStatement();
            ResultSet rs=st.executeQuery(sql);
            if(rs.next()){
                registro.setIdcomplemento(rs.getInt("idcomp"));
                registro.setNome(rs.getString("nome"));
                registro.setPreco(rs.getDouble("preco"));

            }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro SQL: " + e.getMessage());
        }
        return registro;
    }

public List pesquisaNomeTabela(String busca){
    String sql = "select * from complemento where nome like '%" + busca + "%'";
    List lista = new ArrayList();
    try{
        Statement st=getCon().createStatement();
        ResultSet rs=st.executeQuery(sql);
        while (rs.next()){
            Complemento registro=new Complemento();
                registro.setIdcomplemento(rs.getInt("idcomp"));
                registro.setNome(rs.getString("nome"));
                registro.setPreco(rs.getDouble("preco"));
            lista.add(registro);
           }
    } catch (SQLException e){
               JOptionPane.showMessageDialog(null, "Erro SQL: " +e.getMessage());
           }
           return lista;
    }
public List pesquisaIdcomplementoTabela(String busca){
    String sql = "select * from Complemento where idcomp like '%" + busca + "%'";
    List lista = new ArrayList();
    try{
        Statement st=getCon().createStatement();
        ResultSet rs=st.executeQuery(sql);
        while (rs.next()){
            Complemento registro=new Complemento();
                registro.setIdcomplemento(rs.getInt("idcomp"));
                registro.setNome(rs.getString("nome"));
                registro.setPreco(rs.getDouble("preco"));
            lista.add(registro);
           }
    } catch (SQLException e){
               JOptionPane.showMessageDialog(null, "Erro SQL: " +e.getMessage());
           }
           return lista;
    }

public List retornaTabela() {
          String sql = "select idcomp,nome,preco from complemento ORDER BY idcomp";
            List lista = new ArrayList();
            try {
               PreparedStatement st = getCon().prepareStatement(sql);
               ResultSet rs = st.executeQuery();
               while (rs.next()) {
               Complemento registro = new Complemento();
               registro.setIdcomplemento(rs.getInt("idcomp"));
                registro.setNome(rs.getString("nome"));
                registro.setPreco(rs.getDouble("preco"));
               lista.add(registro);
               }
            } catch (SQLException e) {
              JOptionPane.showMessageDialog(null, "Erro SQL: " + e.getMessage());
           }
            return lista;
        }
public List pesquisaComboBox(){
    String sql = "select nome from complemento order by nome";
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


public void exclui(int idComplemento){
    String sql="delete from complemento where idcomp=?";
    try{
        Statement st= getCon().createStatement();
        PreparedStatement ps=getCon().prepareStatement(sql);
        ps.setInt(1, idComplemento);
        ps.execute();
    } catch (SQLException e){
        JOptionPane.showMessageDialog(null, "Erro SQL: " + e.getMessage());
}
}
public boolean verificaNome(String nome) throws Exception{  
        PreparedStatement ps=getCon().prepareStatement("SELECT  nome FROM complemento WHERE nome = ?");  
            ps.setString(1, nome);   
            ResultSet rs = ps.executeQuery();  
            boolean existe = rs.next();      
            return existe;   
    }

}
