/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

/**
 *
 * @author romero
 */
class InexistentEntityException extends Exception {
    public InexistentEntityException() {
        super("ERRO: A entidade que você está tentando remover não existe.");
    }
}
