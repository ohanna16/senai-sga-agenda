package br.senai.rn.agenda.services;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;


import br.senai.rn.agenda.daos.ContatoDAO;
import br.senai.rn.agenda.models.Contato;


public class ContatoService {

	private ContatoDAO dao = new ContatoDAO();

	public Boolean salvar(Contato contato) {
		if (ObjectUtils.allNotNull(contato) || StringUtils.isNotEmpty(contato.getcontato())) {
			dao.salvar(contato);
			return true;
		}
		return false;
	}
	
	public Boolean excluir(Contato contato) {
		if(ObjectUtils.allNotNull(contato)) {
			dao.excluir(contato);
			return true;
		}
	return false;
	}







}	
