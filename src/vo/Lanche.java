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
public class Lanche {
    private int idlanche;
    private String nome;
    private Double preco;

    /**
     * @return the idprod
     */

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
     * @return the idlanche
     */
    public int getIdlanche() {
        return idlanche;
    }

    /**
     * @param idlanche the idlanche to set
     */
    public void setIdlanche(int idlanche) {
        this.idlanche = idlanche;
    }

    /**
     * @return the preco
     */
    public Double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
