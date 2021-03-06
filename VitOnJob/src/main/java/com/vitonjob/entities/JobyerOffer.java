package com.vitonjob.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "JOBYER_OFFER")
public class JobyerOffer implements Serializable {

	/**
	 * Serial Version UID
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "JOBYER_OFFER_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "TARIF_A_L_HEURE")
	private Double tarifALHeure;

	@Column(name = "TITRE")
	private String titre;

	@Column(name = "DESCRIPTION")
	private String description;

	@ManyToOne
	@JoinColumn(name = "JOBYER_ID")
	private Jobyer jobyer;

	@ManyToOne
	@JoinColumn(name = "JOBYER_ADDRESS_ID")
	private JobyerAddress jobyerAddress;

	@ManyToOne
	@JoinColumn(name = "JOB_ID")
	private Job job;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getTarifALHeure() {
		return tarifALHeure;
	}

	public void setTarifALHeure(Double tarifALHeure) {
		this.tarifALHeure = tarifALHeure;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Jobyer getJobyer() {
		return jobyer;
	}

	public void setJobyer(Jobyer jobyer) {
		this.jobyer = jobyer;
	}

	public JobyerAddress getJobyerAddress() {
		return jobyerAddress;
	}

	public void setJobyerAddress(JobyerAddress jobyerAddress) {
		this.jobyerAddress = jobyerAddress;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

}