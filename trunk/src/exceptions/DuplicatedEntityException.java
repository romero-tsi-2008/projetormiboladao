/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exceptions;

/**
 *
 * @author romero
 */
public class DuplicatedEntityException extends Exception {
    public DuplicatedEntityException() {
        super("ERRO: Esta entidade já existe cadastrada no banco.");
    }
}
