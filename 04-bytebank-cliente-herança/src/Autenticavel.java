//Interface é uma classe abstrata com todos os métodos abstratos

//contrato Autenticavel
	//Quem assinar esse contrato, precisar implementar:
		//método setSenha;
		//método autentica.

public interface Autenticavel{
			
	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);
	
}
