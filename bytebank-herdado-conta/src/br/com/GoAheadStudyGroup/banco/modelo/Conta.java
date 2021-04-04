package br.com.GoAheadStudyGroup.banco.modelo;

import java.io.Serializable;

/**
 * Classe representa a modula da conta
 * @author Jesse Caetano dos Santos
 *
 */
public abstract class Conta extends Object implements Comparable<Conta>, Serializable {

   protected double saldo;
    private int agencia;
    private int numero;
    private transient Cliente titular;
   // private static int total=0;
    
    /**
     * Para inicializar o objeto Conta a partir da agencia e número
     * @param agencia
     * @param numero
     */
    
 
    public Conta( int agencia, int numero) {
       //	Conta.total++;
    	//System.out.println("O total de contas é " + Conta.total);
		this.numero = numero;
		this.agencia = agencia;
		//this.saldo;
		//System.out.println("Estou criando uma conta " + this.numero);
	}


	public abstract void deposita(double valor);
	
	/**
	 * Valor precisa ser maior que o saldo
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	

    public void saca(double valor) throws SaldoInsuficienteException {
    	
        if(this.saldo < valor) {
        	throw new SaldoInsuficienteException("Saldo: " + this.saldo +", Valor: "+ valor);
        }
        this.saldo -= valor;
    }

   
	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException{
        this.saca(valor);
        destino.deposita(valor);
       
    }
     public double getSaldo() {
    	 return this.saldo;
     }


	public int getAgencia() {
		return agencia;
	}


	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("Não pode valor meor ou igual a 0 !");
			return;
		}
		this.agencia = agencia;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		if(numero <= 0) {
			System.out.println("Não pode valor menor ou igual a 0 !");
			return;
		}
		this.numero = numero;
	}


	public Cliente getTitular() {
		return titular;
	}


	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	@Override
	public boolean equals(Object ref) {
		
		Conta outra= (Conta) ref;
		if(this.agencia !=outra.agencia) {
			return false;
		}
		if(this.numero != outra.numero) {
			return false;
		}
		return true;
	}
	
	@Override
		public int compareTo(Conta o) {
		
			return Double.compare(this.saldo, o.saldo);
		}
	
	
	@Override
	public String toString() {
		
		return "Número: " + 
		this.numero +
		", Agencia:  "+ this.agencia +
		", Saldo: " + this.saldo;
	}


     
     
    
    
    
}