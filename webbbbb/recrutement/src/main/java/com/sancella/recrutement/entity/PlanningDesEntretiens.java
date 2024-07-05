package com.sancella.recrutement.entity;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name="PlanningDesEntretiens")
public class PlanningDesEntretiens {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int EntretienId;
    private String Type_entretein;
    private String Date_entretien;

    public String getEnvoi_Etat() {
        return Envoi_Etat;
    }

    public void setEnvoi_Etat(String envoi_Etat) {
        Envoi_Etat = envoi_Etat;
    }

    private String Horaire;
    private String Lieu;
    private String Envoi_Etat;



    public int getEntretienId() {
        return EntretienId;
    }

    public void setEntretienId(int entretienId) {
        EntretienId = entretienId;
    }

    public String getType_entretein() {
        return Type_entretein;
    }

    public void setType_entretein(String type_entretein) {
        Type_entretein = type_entretein;
    }



    public String getDate_entretien() {
        return Date_entretien;
    }

    public void setDate_entretien(String date_entretien) {
        Date_entretien = date_entretien;
    }

    public String getHoraire() {
        return Horaire;
    }

    public void setHoraire(String horaire) {
        Horaire = horaire;
    }

    public String getLieu() {
        return Lieu;
    }

    public void setLieu(String lieu) {
        Lieu = lieu;
    }

    public String getEvaluateur_1() {
        return Evaluateur_1;
    }

    public void setEvaluateur_1(String evaluateur_1) {
        Evaluateur_1 = evaluateur_1;
    }

    public String getEvaluateur_2() {
        return Evaluateur_2;
    }

    public void setEvaluateur_2(String evaluateur_2) {
        Evaluateur_2 = evaluateur_2;
    }

    public String getEvaluateur_3() {
        return Evaluateur_3;
    }

    public void setEvaluateur_3(String evaluateur_3) {
        Evaluateur_3 = evaluateur_3;
    }



    public String getEnvoi_message() {
        return Envoi_message;
    }

    public void setEnvoi_message(String envoi_message) {
        Envoi_message = envoi_message;
    }

    private int numCv;

    private String nomPrenom;
    private int age;
    private String region;
    private String etude;
    private String diplome;
    private String experience;
    private String coordonnees;
    private String recommandationsDePoste;
    @Column(name = "email")
    private String email;
    private String specialite;
    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    private LocalDate date;
    // Champs remplis par l'administrateur







    // Getters and setters
    public int getNumCv() {
        return numCv;
    }

    public void setNumCv(int numCv) {
        this.numCv = numCv;
    }

    public String getNomPrenom() {
        return nomPrenom;
    }

    public void setNomPrenom(String nomPrenom) {
        this.nomPrenom = nomPrenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getEtude() {
        return etude;
    }

    public void setEtude(String etude) {
        this.etude = etude;
    }

    public String getDiplome() {
        return diplome;
    }

    public void setDiplome(String diplome) {
        this.diplome = diplome;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getCoordonnees() {
        return coordonnees;
    }

    public void setCoordonnees(String coordonnees) {
        this.coordonnees = coordonnees;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRecommandationsDePoste() {
        return recommandationsDePoste;
    }

    public void setRecommandationsDePoste(String recommandationsDePoste) {
        this.recommandationsDePoste = recommandationsDePoste;
    }


    public byte[] getCv_pdf() {
        return cv_pdf;
    }

    public void setCv_pdf(byte[] cv_pdf) {
        this.cv_pdf = cv_pdf;
    }

    @Lob
    @Column(name = "fichier", columnDefinition = "LONGBLOB")
    private byte[] cv_pdf;
    private String Evaluateur_1;
    private String Evaluateur_2;
    private String Evaluateur_3;
    private String Envoi_message;
}
