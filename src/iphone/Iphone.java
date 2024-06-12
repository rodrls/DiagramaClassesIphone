package iphone;

import funcoesIphone.ligacao.Ligacao;
import funcoesIphone.navegador.Navegar;
import funcoesIphone.reprodutor.Reproduzir;

public class Iphone implements Ligacao, Navegar, Reproduzir{

	@Override
	public void ligar() {
		System.out.println("ligando via iphone");
		
	}

	@Override
	public void navegar() {
		System.out.println("navegando na internet via iphone");
		
	}

	@Override
	public void reproduzir() {
		System.out.println("reproduzindo musica via iphone");
		
	}

}
