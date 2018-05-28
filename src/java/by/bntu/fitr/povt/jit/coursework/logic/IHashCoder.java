/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.jit.coursework.logic;

/**
 *
 * @author Swyatoslaw
 */
public interface IHashCoder {
        public String get_SHA_512_SecurePassword(String passwordToHash, String salt);
        public String get_SHA_512_SecurePasswordSimple(String passwordToHash);
}
