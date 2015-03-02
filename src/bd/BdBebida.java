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
import vo.Bebida;
import vo.Produto;

/**
 *
 * @author rafael
 */
public class BdBebida extends bd.Bd {
     public BdBebida(){
    try{
            conexao();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }

    
    
    
    public void insere(Bebida C){
        String sql="insert into bebida (idbebida, nome, preco)values(?,?,?)";
        try{
            PreparedStatement ps= getCon().prepareStatement(sql);
            ps.setInt(1, C.getIdbebida());
            ps.setString(2, C.getNome());
            ps.setString(3, C.getPreco());
            ps.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }

}
    public void atualiza(Bebida C){
        String sql="update bebida set nome=?, preco=? where idbebida=?";
        try{
            PreparedStatement ps= getCon().prepareStatement(sql);
            ps.setString(2, C.getNome());
            ps.setString(3, C.getPreco());
            ps.setInt(1, C.getIdbebida());
            ps.execute();}
        catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro SQL " +e.getMessage());
        }

    }
    public Bebida localizaId(String idBebida){
        String sql="select * from Bebida where idBebida='" + idBebida +"'";
        Bebida registro = new Bebida();
        try{
            PreparedStatement  ps = getCon().prepareStatement(sql);
            //ps.setString(1, idprod);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                registro.setIdbebida(rs.getInt("idbebida"));
                registro.setNome(rs.getString("nome"));
                registro.setPreco(rs.getString("preco"));
            }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro SQL: " + e.getMessage());
        }
        return registro;
    }

    public Bebida localizaNome(String nome){
        String sql="select * from bebida where nome='" + nome +"'";
        Bebida registro = new Bebida();
        try{
            Statement st=getCon().createStatement();
            ResultSet rs=st.executeQuery(sql);
            if(rs.next()){
                registro.setIdbebida(rs.getInt("idbebida"));
                registro.setNome(rs.getString("nome"));
                registro.setPreco(rs.getString("preco"));

            }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro SQL: " + e.getMessage());
        }
        return registro;
    }

public List pesquisaNomeTabela(String busca){
    String sql = "select * from bebida where nome like '%" + busca + "%'";
    List lista = new ArrayList();
    try{
        Statement st=getCon().createStatement();
        ResultSet rs=st.executeQuery(sql);
        while (rs.next()){
            Bebida registro=new Bebida();
                registro.setIdbebida(rs.getInt("idbebida"));
                registro.setNome(rs.getString("nome"));
                registro.setPreco(rs.getString("preco"));
            lista.add(registro);
           }
    } catch (SQLException e){
               JOptionPane.showMessageDialog(null, "Erro SQL: " +e.getMessage());
           }
           return lista;
    }
public List pesquisaIdbebidaTabela(String busca){
    String sql = "select * from Bebida where idbebida like '%" + busca + "%'";
    List lista = new ArrayList();
    try{
        Statement st=getCon().createStatement();
        ResultSet rs=st.executeQuery(sql);
        while (rs.next()){
            Bebida registro=new Bebida();
                registro.setIdbebida(rs.getInt("idbebida"));
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
          String sql = "select idbebida,nome,preco from bebida ORDER BY idbebida";
            List lista = new ArrayList();
            try {
               PreparedStatement st = getCon().prepareStatement(sql);
               ResultSet rs = st.executeQuery();
               while (rs.next()) {
               Bebida registro = new Bebida();
               registro.setIdbebida(rs.getInt("idbebida"));
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
    String sql = "select nome from bebida order by nome";
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
    String sql="delete from bebida where idbebida=?";
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
