package br.senai.rn.agenda.services;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;

import br.senai.rn.agenda.daos.FoneDAO;
import br.senai.rn.agenda.models.Fone;

public class FoneService {
	
	private FoneDAO dao = new FoneDAO();

	public Boolean salvar(Fone fone) {
		if (ObjectUtils.allNotNull(fone) || StringUtils.isNotEmpty(fone.getFone())) {
			dao.salvar(fone);
			return true;
		}
		return false;
	}
	
	
	
}
