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
import vo.Lanche;
import vo.Produto;

/**
 *
 * @author rafael
 */
public class BdLanche extends bd.Bd {
     public BdLanche(){
    try{
            conexao();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }

    
    
    
    public void insere(Lanche L){
        String sql="insert into lanche (idlanche, nome, preco)values(?,?,?)";
        try{
            PreparedStatement ps= getCon().prepareStatement(sql);
            ps.setInt(1, L.getIdlanche());
            ps.setString(2, L.getNome());
            ps.setDouble(3, L.getPreco());
            ps.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }

}
    public void atualiza(Lanche L){
        String sql="update lanche set nome=?, preco=? where idlanche=?";
        try{
            PreparedStatement ps= getCon().prepareStatement(sql);
            ps.setString(2, L.getNome());
            ps.setDouble(3, L.getPreco());
            ps.setInt(1, L.getIdlanche());
            ps.execute();}
        catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro SQL " +e.getMessage());
        }

    }
    public Lanche localizaId(String idlanche){
        String sql="select * from lanche where idlanche='" + idlanche +"'";
        Lanche registro = new Lanche();
        try{
            PreparedStatement  ps = getCon().prepareStatement(sql);
            //ps.setString(1, idprod);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                registro.setIdlanche(rs.getInt("idlanche"));
                registro.setNome(rs.getString("nome"));
                registro.setPreco(rs.getDouble("preco"));
            }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro SQL: " + e.getMessage());
        }
        return registro;
    }

    public Lanche localizaNome(String nome){
        String sql="select * from lanche where nome='" + nome +"'";
        Lanche registro = new Lanche();
        try{
            Statement st=getCon().createStatement();
            ResultSet rs=st.executeQuery(sql);
            if(rs.next()){
                registro.setIdlanche(rs.getInt("idlanche"));
                registro.setNome(rs.getString("nome"));
                registro.setPreco(rs.getDouble("preco"));

            }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro SQL: " + e.getMessage());
        }
        return registro;
    }

public List pesquisaNomeTabela(String busca){
    String sql = "select * from lanche where nome like '%" + busca + "%'";
    List lista = new ArrayList();
    try{
        Statement st=getCon().createStatement();
        ResultSet rs=st.executeQuery(sql);
        while (rs.next()){
            Lanche registro=new Lanche();
                registro.setIdlanche(rs.getInt("idlanche"));
                registro.setNome(rs.getString("nome"));
                registro.setPreco(rs.getDouble("preco"));
            lista.add(registro);
           }
    } catch (SQLException e){
               JOptionPane.showMessageDialog(null, "Erro SQL: " +e.getMessage());
           }
           return lista;
    }
public List pesquisaIdlancheTabela(String busca){
    String sql = "select * from lanche where idlanche like '%" + busca + "%'";
    List lista = new ArrayList();
    try{
        Statement st=getCon().createStatement();
        ResultSet rs=st.executeQuery(sql);
        while (rs.next()){
            Lanche registro=new Lanche();
                registro.setIdlanche(rs.getInt("idlanche"));
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
          String sql = "select idlanche,nome,preco from lanche ORDER BY idlanche";
            List lista = new ArrayList();
            try {
               PreparedStatement st = getCon().prepareStatement(sql);
               ResultSet rs = st.executeQuery();
               while (rs.next()) {
               Lanche registro = new Lanche();
               registro.setIdlanche(rs.getInt("idlanche"));
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


public void exclui(int idlanche){
    String sql="delete from lanche where id=?";
    try{
        Statement st= getCon().createStatement();
        PreparedStatement ps=getCon().prepareStatement(sql);
        ps.setInt(1, idlanche);
        ps.execute();
    } catch (SQLException e){
        JOptionPane.showMessageDialog(null, "Erro SQL: " + e.getMessage());
}
}
public boolean verificaNome(String nome) throws Exception{  
        PreparedStatement ps=getCon().prepareStatement("SELECT  nome FROM lanche WHERE nome = ?");  
            ps.setString(1, nome);   
            ResultSet rs = ps.executeQuery();  
            boolean existe = rs.next();      
            return existe;   
    }
}

