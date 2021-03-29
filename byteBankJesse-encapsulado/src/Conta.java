
public class Conta {

    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private int total;
    
 

    public Conta( int numero, Cliente titular) {
    	super();
    	this.total++;
    	System.out.println("O total de contas é " + total);
		this.saldo = saldo;
		this.agencia = agencia;
		this.numero = numero;
		this.titular = titular;
	}


	public void deposita(double valor) {
        this.saldo = this.saldo + valor;
    }

    public boolean saca(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        return false;
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


     
     
    
    
    
}