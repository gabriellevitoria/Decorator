package br.padroesGOF.decorator;

public abstract class CoquetelDecorator extends Coquetel {
	Coquetel coquetel; //var de instância -> é o objeto coquetel que será decorado

	public CoquetelDecorator(Coquetel umCoquetel) {
		coquetel = umCoquetel; // construtor -> função que tem o mesmo nome da classe 
		// e serve para construir um objeto
	}

	@Override
	public String getNome() {
		return coquetel.getNome() + " + " + nome;
	}

	public double getPreco() {
		return coquetel.getPreco() + preco;
	}
}
