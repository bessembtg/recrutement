package com.sancella.recrutement.entity;

import jakarta.persistence.*;

import javax.xml.crypto.Data;
import java.time.LocalDate;

@Entity
@Table(name = "ListeDeCv")
public class ListeDeCv {

    @Id
    @GeneratedValue
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

    public String getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(String commentaires) {
        this.commentaires = commentaires;
    }

    private String specialite;
    private String commentaires;

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    // Champs remplis par l'administrateur

    private LocalDate date;
    private String entretienTelephonique;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public byte[] getCv() {
        return cv;
    }

    public void setCv(byte[] cv) {
        this.cv = cv;
    }

    @Lob
    @Column(name = "fichier", columnDefinition = "LONGBLOB")
    private byte[] cv;

    // No-argument constructor for JPA
    public ListeDeCv() {
    }

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


    public String getEntretienTelephonique() {
        return entretienTelephonique;
    }

    public void setEntretienTelephonique(String entretienTelephonique) {
        this.entretienTelephonique = entretienTelephonique;
    }

}
