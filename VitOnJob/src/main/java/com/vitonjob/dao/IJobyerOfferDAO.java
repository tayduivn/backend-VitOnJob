package com.vitonjob.dao;

import java.util.List;

import com.vitonjob.dto.JobyerOfferDTO;
import com.vitonjob.entities.JobyerOffer;

public interface IJobyerOfferDAO extends IGenericDao<JobyerOffer> {

	/**
	 * récupére la liste des jobyer offer par job libelle.
	 *
	 * @param libelleJob
	 *            le libellé du job.
	 * @param maxResults
	 *            le nombre maximale des résultats à récupérer.
	 * @return {@link List} des {@link JobyerOfferDTO}
	 */
	List<JobyerOfferDTO> getListJobyerOfferByLibelleJob(String libelleJob, int maxResults);

	/**
	 * récupére la liste des jobyer offer par l'id de l'offre de l'entreprise.
	 *
	 * @param entrepriseOfferId
	 *            l'id de l'offre de l'entreprise.
	 * @param maxResults
	 *            le nombre maximale des résultats à récupérer.
	 * @return {@link List} des {@link JobyerOfferDTO}
	 */
	List<JobyerOfferDTO> getListJobyerOfferByEntrepriseOfferId(Long entrepriseOfferId, int maxResults);
}
