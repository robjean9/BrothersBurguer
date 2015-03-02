/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vo;

/**
 *
 * @author Rafael
 */
public class Produto {
    private String idprod;
    private String nome;
    private String preco;

    /**
     * @return the idprod
     */
    public String getIdprod() {
        return idprod;
    }

    /**
     * @param idprod the idprod to set
     */
    public void setIdprod(String idprod) {
        this.idprod = idprod;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the preco
     */
    public String getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(String preco) {
        this.preco = preco;
    }
}
