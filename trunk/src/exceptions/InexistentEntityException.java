/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exceptions;

/**
 *
 * @author romero
 */
public class InexistentEntityException extends Exception {
    public InexistentEntityException() {
        super("ERRO: A entidade que você está tentando remover não existe.");
    }
}
