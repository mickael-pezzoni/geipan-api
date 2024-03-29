package com.example.geipanapi.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;
import java.util.Date;

@Document(collection = "Cas")
public class Cas {

    @Id
    private String _id;
    private String id_cas;
    private String cas_nom_dossier;
    private String cas_zone_nom;
    private String cas_zone_code;
    private String cas_zone_type;
    private String cas_AAAA;
    private String cas_MM;
    private String cas_JJ;
    private String cas_resume;
    private String cas_resume_web;
    private String cas_public;
    private String cas_temoignages_nb;
    private String cas_temoins_nb;
    private Date cas_date_maj;
    private String cas_etrangete_calc;
    private String cas_etrangete_calc_err;
    private String cas_consistance_calc;
    private String cas_consistance_calc_err;
    private String cas_classification;
    private String cas_classification_calc;
    private String cas_numEtude;
    private Files[] files;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getId_cas() {
        return id_cas;
    }

    public void setId_cas(String id_cas) {
        this.id_cas = id_cas;
    }

    public String getCas_nom_dossier() {
        return cas_nom_dossier;
    }

    public void setCas_nom_dossier(String cas_nom_dossier) {
        this.cas_nom_dossier = cas_nom_dossier;
    }

    public String getCas_zone_nom() {
        return cas_zone_nom;
    }

    public void setCas_zone_nom(String cas_zone_nom) {
        this.cas_zone_nom = cas_zone_nom;
    }

    public String getCas_zone_code() {
        return cas_zone_code;
    }

    public void setCas_zone_code(String cas_zone_code) {
        this.cas_zone_code = cas_zone_code;
    }

    public String getCas_zone_type() {
        return cas_zone_type;
    }

    public void setCas_zone_type(String cas_zone_type) {
        this.cas_zone_type = cas_zone_type;
    }

    public String getCas_AAAA() {
        return cas_AAAA;
    }

    public void setCas_AAAA(String cas_AAAA) {
        this.cas_AAAA = cas_AAAA;
    }

    public String getCas_MM() {
        return cas_MM;
    }

    public void setCas_MM(String cas_MM) {
        this.cas_MM = cas_MM;
    }

    public String getCas_JJ() {
        return cas_JJ;
    }

    public void setCas_JJ(String cas_JJ) {
        this.cas_JJ = cas_JJ;
    }

    public String getCas_resume() {
        return cas_resume;
    }

    public void setCas_resume(String cas_resume) {
        this.cas_resume = cas_resume;
    }

    public String getCas_resume_web() {
        return cas_resume_web;
    }

    public void setCas_resume_web(String cas_resume_web) {
        this.cas_resume_web = cas_resume_web;
    }

    public String getCas_public() {
        return cas_public;
    }

    public void setCas_public(String cas_public) {
        this.cas_public = cas_public;
    }

    public String getCas_temoignages_nb() {
        return cas_temoignages_nb;
    }

    public void setCas_temoignages_nb(String cas_temoignages_nb) {
        this.cas_temoignages_nb = cas_temoignages_nb;
    }

    public String getCas_temoins_nb() {
        return cas_temoins_nb;
    }

    public void setCas_temoins_nb(String cas_temoins_nb) {
        this.cas_temoins_nb = cas_temoins_nb;
    }

    public Date getCas_date_maj() {
        return cas_date_maj;
    }

    public void setCas_date_maj(Date cas_date_maj) {
        this.cas_date_maj = cas_date_maj;
    }

    public String getCas_etrangete_calc() {
        return cas_etrangete_calc;
    }

    public void setCas_etrangete_calc(String cas_etrangete_calc) {
        this.cas_etrangete_calc = cas_etrangete_calc;
    }

    public String getCas_etrangete_calc_err() {
        return cas_etrangete_calc_err;
    }

    public void setCas_etrangete_calc_err(String cas_etrangete_calc_err) {
        this.cas_etrangete_calc_err = cas_etrangete_calc_err;
    }

    public String getCas_consistance_calc() {
        return cas_consistance_calc;
    }

    public void setCas_consistance_calc(String cas_consistance_calc) {
        this.cas_consistance_calc = cas_consistance_calc;
    }

    public String getCas_consistance_calc_err() {
        return cas_consistance_calc_err;
    }

    public void setCas_consistance_calc_err(String cas_consistance_calc_err) {
        this.cas_consistance_calc_err = cas_consistance_calc_err;
    }

    public String getCas_classification() {
        return cas_classification;
    }

    public void setCas_classification(String cas_classification) {
        this.cas_classification = cas_classification;
    }

    public String getCas_classification_calc() {
        return cas_classification_calc;
    }

    public void setCas_classification_calc(String cas_classification_calc) {
        this.cas_classification_calc = cas_classification_calc;
    }

    public String getCas_numEtude() {
        return cas_numEtude;
    }

    public void setCas_numEtude(String cas_numEtude) {
        this.cas_numEtude = cas_numEtude;
    }

    public Files[] getFiles() {
        return files;
    }

    public void setFiles(Files[] files) {
        this.files = files;
    }

    @Override
    public String toString() {
        return "Cas{" +
                "_id='" + _id + '\'' +
                ", id_cas='" + id_cas + '\'' +
                ", cas_nom_dossier='" + cas_nom_dossier + '\'' +
                ", cas_zone_nom='" + cas_zone_nom + '\'' +
                ", cas_zone_code='" + cas_zone_code + '\'' +
                ", cas_zone_type='" + cas_zone_type + '\'' +
                ", cas_AAAA='" + cas_AAAA + '\'' +
                ", cas_MM='" + cas_MM + '\'' +
                ", cas_JJ='" + cas_JJ + '\'' +
                ", cas_resume='" + cas_resume + '\'' +
                ", cas_resume_web='" + cas_resume_web + '\'' +
                ", cas_public='" + cas_public + '\'' +
                ", cas_temoignages_nb='" + cas_temoignages_nb + '\'' +
                ", cas_temoins_nb='" + cas_temoins_nb + '\'' +
                ", cas_date_maj=" + cas_date_maj +
                ", cas_etrangete_calc='" + cas_etrangete_calc + '\'' +
                ", cas_etrangete_calc_err='" + cas_etrangete_calc_err + '\'' +
                ", cas_consistance_calc='" + cas_consistance_calc + '\'' +
                ", cas_consistance_calc_err='" + cas_consistance_calc_err + '\'' +
                ", cas_classification='" + cas_classification + '\'' +
                ", cas_classification_calc='" + cas_classification_calc + '\'' +
                ", cas_numEtude='" + cas_numEtude + '\'' +
                ", files=" + Arrays.toString(files) +
                '}';
    }
}
