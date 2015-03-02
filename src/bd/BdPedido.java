/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bd;

import bd.Bd;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import vo.Cliente;
import vo.Pedido;

/**
 *
 * @author 3INFO
 */
public class BdPedido extends Bd {
    public BdPedido(){
    try{
            conexao();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }

    
    
    
    public void insere(Pedido P){
        String sql="insert into pedido (idcliente) values (?)";
        try{
            PreparedStatement ps= getCon().prepareStatement(sql);
            ps.setString(1, P.getIdCliente());
            ps.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }

}
    public void atualiza(Cliente C){
        String sql="update cliente set id=?, nome=?, endereco=?, numero=?, complemento=?, bairro=?, cep=?, email=?, obs=? where telefone=?";
        try{
            PreparedStatement ps= getCon().prepareStatement(sql);
            ps.setString(1, C.getId());
            ps.setString(2, C.getNome());
            ps.setString(3, C.getEndereco());
            ps.setString(4, C.getNumero());
            ps.setString(5, C.getComplemento());
            ps.setString(6, C.getBairro());
            ps.setString(7, C.getCep());
            ps.setString(8, C.getEmail());
            ps.setString(9, C.getObs());
            ps.setString(10, C.getTelefone());
            ps.execute();}
        catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro SQL " +e.getMessage());
        }

    }
    public Pedido localizaId(){
        String sql="select * from pedido order by idped desc limit 1";
        Pedido registro = new Pedido();
        try{
            Statement st=getCon().createStatement();
            ResultSet rs=st.executeQuery(sql);
            if(rs.next()){
                registro.setIdPedido(rs.getString("idped"));
                registro.setIdCliente(rs.getString("idcliente"));
            }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro SQL: " + e.getMessage());
        }
        
        return registro;
    }

    public Cliente localizaNome(String nome){
        String sql="select * from cliente where nome='" + nome +"'";
        Cliente registro = new Cliente();
        try{
            Statement st=getCon().createStatement();
            ResultSet rs=st.executeQuery(sql);
            if(rs.next()){
                registro.setId(rs.getString("id"));
                registro.setNome(rs.getString("nome"));
                registro.setTelefone(rs.getString("telefone"));
                registro.setEndereco(rs.getString("endereco"));
                registro.setComplemento(rs.getString("complemento"));
                registro.setNumero(rs.getString("numero"));
                registro.setBairro(rs.getString("bairro"));
                registro.setCep(rs.getString("cep"));
                registro.setEmail(rs.getString("email"));
                registro.setObs(rs.getString("obs"));

            }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro SQL: " + e.getMessage());
        }
        return registro;
    }
public Cliente localizaTel(String telefone){
        String sql="select * from cliente where telefone=?";
        Cliente registro = new Cliente();
        try{
             PreparedStatement  ps = getCon().prepareStatement(sql);
            ps.setString(1, telefone);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                registro.setId(rs.getString("id"));
                registro.setNome(rs.getString("nome"));
                registro.setTelefone(rs.getString("telefone"));
                registro.setEndereco(rs.getString("endereco"));
                registro.setComplemento(rs.getString("complemento"));
                registro.setNumero(rs.getString("numero"));
                registro.setBairro(rs.getString("bairro"));
                registro.setCep(rs.getString("cep"));
                registro.setEmail(rs.getString("email"));
                registro.setObs(rs.getString("obs"));
            }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro SQL: " + e.getMessage());
        }
        return registro;
        
    }
public List pesquisaNomeTabela(String busca){
    String sql = "select * from cliente where nome like '%" + busca + "%'";
    List lista = new ArrayList();
    try{
        Statement st=getCon().createStatement();
        ResultSet rs=st.executeQuery(sql);
        while (rs.next()){
            Cliente registro=new Cliente();
                registro.setId(rs.getString("id"));
                registro.setNome(rs.getString("nome"));
                registro.setTelefone(rs.getString("telefone"));
                registro.setEndereco(rs.getString("endereco"));
                registro.setComplemento(rs.getString("complemento"));
                registro.setNumero(rs.getString("numero"));
                registro.setBairro(rs.getString("bairro"));
                registro.setCep(rs.getString("cep"));
                registro.setEmail(rs.getString("email"));
                registro.setObs(rs.getString("obs"));
            lista.add(registro);
           }
    } catch (SQLException e){
               JOptionPane.showMessageDialog(null, "Erro SQL: " +e.getMessage());
           }
           return lista;
    }
public List pesquisaTelefoneTabela(String busca){
    String sql = "select * from cliente where telefone like '%" + busca + "%'";
    List lista = new ArrayList();
    try{
        Statement st=getCon().createStatement();
        ResultSet rs=st.executeQuery(sql);
        while (rs.next()){
            Cliente registro=new Cliente();
                registro.setId(rs.getString("id"));
                registro.setNome(rs.getString("nome"));
                registro.setTelefone(rs.getString("telefone"));
                registro.setEndereco(rs.getString("endereco"));
                registro.setComplemento(rs.getString("complemento"));
                registro.setNumero(rs.getString("numero"));
                registro.setBairro(rs.getString("bairro"));
                registro.setCep(rs.getString("cep"));
                registro.setEmail(rs.getString("email"));
                registro.setObs(rs.getString("obs"));
            lista.add(registro);
           }
    } catch (SQLException e){
               JOptionPane.showMessageDialog(null, "Erro SQL: " +e.getMessage());
           }
           return lista;
    }

public List retornaTabela() {
          String sql = "select id,nome,telefone,endereco,numero,complemento,bairro,cep,email,obs from cliente ORDER BY Nome";
            List lista = new ArrayList();
            try {
               PreparedStatement st = getCon().prepareStatement(sql);
               ResultSet rs = st.executeQuery();
               while (rs.next()) {
               Cliente registro = new Cliente();
                registro.setId(rs.getString("id"));
                registro.setNome(rs.getString("nome"));
                registro.setTelefone(rs.getString("telefone"));
                registro.setEndereco(rs.getString("endereco"));
                registro.setComplemento(rs.getString("complemento"));
                registro.setNumero(rs.getString("numero"));
                registro.setBairro(rs.getString("bairro"));
                registro.setCep(rs.getString("cep"));
                registro.setEmail(rs.getString("email"));
                registro.setObs(rs.getString("obs"));
               lista.add(registro);
               }
            } catch (SQLException e) {
              JOptionPane.showMessageDialog(null, "Erro SQL: " + e.getMessage());
           }
            return lista;
        }

public ResultSet rs;
public Cliente buscaireport(){
        String sql="select * from cliente order by id desc limit 1";
        Cliente registro = new Cliente();
        try{
            Statement st=getCon().createStatement();
            rs=st.executeQuery(sql);
                registro.setId(rs.getString("id"));
                registro.setNome(rs.getString("nome"));
                registro.setTelefone(rs.getString("telefone"));
                registro.setEndereco(rs.getString("endereco"));
                registro.setComplemento(rs.getString("complemento"));
                registro.setNumero(rs.getString("numero"));
                registro.setBairro(rs.getString("bairro"));
                registro.setCep(rs.getString("cep"));
                registro.setEmail(rs.getString("email"));
                registro.setObs(rs.getString("obs"));
                
        } catch (SQLException e){
            //JOptionPane.showMessageDialog(null, "Erro SQL: " + e.getMessage());
        }
        return registro;
    }

public void exclui(String id){
    String sql="delete from cliente where id=?";
    try{
        Statement st= getCon().createStatement();
        PreparedStatement ps=getCon().prepareStatement(sql);
        ps.setString(1, id);
        ps.execute();
    } catch (SQLException e){
        JOptionPane.showMessageDialog(null, "Erro SQL: " + e.getMessage());
}
}

public boolean verificaNome(String nome) throws Exception{  
        PreparedStatement ps=getCon().prepareStatement("SELECT  nome FROM cliente WHERE nome = ?");  
            ps.setString(1, nome);   
            ResultSet rs = ps.executeQuery();  
            boolean existe = rs.next();      
            return existe;   
    }  

public boolean verificaTelefone(String telefone) throws Exception{    
          
            PreparedStatement ps=getCon().prepareStatement("SELECT  telefone FROM cliente WHERE telefone = ?");  
            ps.setString(1, telefone);   
            ResultSet rs = ps.executeQuery();  
            boolean existe = rs.next();      
            return existe;   
    } 



}
