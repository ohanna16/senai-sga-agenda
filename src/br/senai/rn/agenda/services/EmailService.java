package br.senai.rn.agenda.services;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;

import br.senai.rn.agenda.daos.EmailDAO;
import br.senai.rn.agenda.models.Email;

public class EmailService {
	
	private EmailDAO dao = new EmailDAO();

	public Boolean salvar(Email email) {
		if (ObjectUtils.allNotNull(email) || StringUtils.isNotEmpty(email.getEmail())) {
			dao.salvar(email);
			return true;
		}
		return false;
	}
	
	public Boolean excluir(Email email) {
		if(ObjectUtils.allNotNull(email)) {
			dao.excluir(email);
			return true;
		}
	return false;
	}
	
	
	
}