package br.com.GoAheadStudyGroup.banco.modelo;

/**
 * Classe que representa um cliente no GrupoAheadGrupo
 * @author Jesse Caetano dos Santos
 * @version 0.1
 */
public class SaldoInsuficienteException extends Exception {
	
	public SaldoInsuficienteException(String msg) {
		super(msg);
	}

}
