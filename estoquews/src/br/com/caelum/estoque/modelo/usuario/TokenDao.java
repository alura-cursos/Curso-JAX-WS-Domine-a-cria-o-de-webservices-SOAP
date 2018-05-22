package br.com.caelum.estoque.modelo.usuario;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;


public class TokenDao {

	private static Map<TokenUsuario, Usuario> USUARIOS = new LinkedHashMap<>();

	public TokenDao() {
		popularUsuariosNoMapa();
	}
	
	public boolean ehValido(TokenUsuario usuario) {
		return USUARIOS.containsKey(usuario);
	}
	
	private void popularUsuariosNoMapa() {
		USUARIOS.put(new TokenUsuario("AAA", parseDate("31/12/2015")), new Usuario.Builder().comNome("Nico").comLogin("nico").comSenha("pass").build());
		USUARIOS.put(new TokenUsuario("BBB", parseDate("31/12/2015")), new Usuario.Builder().comNome("Flavio").comLogin("flavio").comSenha("pass").build());
		USUARIOS.put(new TokenUsuario("CCC", parseDate("31/12/2015")), new Usuario.Builder().comNome("Fabio").comLogin("fabio").comSenha("pass").build());
		USUARIOS.put(new TokenUsuario("DDD", parseDate("31/12/2015")), new Usuario.Builder().comNome("Romulo").comLogin("Romulo").comSenha("pass").build());
	}


	private Date parseDate(String dataComoString) {
		try {
			return new SimpleDateFormat("dd/MM/yyyy").parse(dataComoString);
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
	}



}
