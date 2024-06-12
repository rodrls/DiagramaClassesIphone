package usuario;

import funcoesIphone.navegador.*;
import funcoesIphone.reprodutor.*;
import funcoesIphone.ligacao.Ligacao;
import iphone.Iphone;

public class Usuario {

	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		
		Ligacao ligacao = iphone;
		ligacao.ligar();
		
		Navegar navegar = iphone;
		navegar.navegar();
		
		Reproduzir musicas = iphone;
		musicas.reproduzir();
		
	}
}
