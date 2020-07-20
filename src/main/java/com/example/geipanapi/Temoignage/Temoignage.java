package com.example.geipanapi.Temoignage;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Date;

@Document(collection = "Temoignage")
public class Temoignage {
    @Id
    public String _id;
    public int id_cas;
    public String id_temoignage;
    //public Date tem_chrono;
    public String obs_chrono;
    public String tem_nom_dossier;
    public String tem_resume;
    public String tem_Ti_type;
    public String tem_age;
    public String tem_genre;
    public String tem_adr_commune;
    public String cas_numEtude;
    public String tem_adr_CP;
    public String tem_adr_dpt;
    public String tem_adr_pays;
    public String tem_xp_activite_type;
    public String tem_xp_astro;
    public String tem_obs_moyen;
    public String tem_numSEPRA;
    public String id_observation;
    public String obs_nb;
    public String obs_commune_or_trajet;
    public String obs_AAAA;
    public String obs_MM;
    public String obs_JJ;
    public Date obs_date_heure;
    public String obs_heure_plage;
    public String obs_heure_delta;
    public String obs_duree_hms;
    public String obs_1_adr_commune;
    public String obs_1_adr_CP;
    public String obs_1_adr_dpt;
    public String obs_1_adr_pays;
    public String obs_1_adr_commune_2;
    public String obs_1_cadre_reference_type;
    public String obs_1_lat;
    public String obs_1_lon;
    public String obs_1_env_sol;
    public String obs_1_env_sol_type;
    public String obs_conditions_tem_activite;
    public String obs_1_heure;
    public String obs_1_azimut_lib;
    public String obs_1_elevation_lib;
    public String obs_1_alt;
    public String obs_1_trajectoire_lib;
    public String obs_1_tem_reaction_types;
    public String obs_conditions_apparition;
    public String obs_conditions_tem_activite_lib;
    public String obs_conditions_meteo;
    public String obs_conditions_meteo_lib;
    public String obs_conditions_astro_lib;
    public String obs_1_forme_lib;
    public String obs_conditions_disparition_txt;
    public int[] coordonne;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public int getId_cas() {
        return id_cas;
    }

    public void setId_cas(int id_cas) {
        this.id_cas = id_cas;
    }

    public String getId_temoignage() {
        return id_temoignage;
    }

    public void setId_temoignage(String id_temoignage) {
        this.id_temoignage = id_temoignage;
    }

    public String getObs_chrono() {
        return obs_chrono;
    }

    public void setObs_chrono(String obs_chrono) {
        this.obs_chrono = obs_chrono;
    }

    public String getTem_nom_dossier() {
        return tem_nom_dossier;
    }

    public void setTem_nom_dossier(String tem_nom_dossier) {
        this.tem_nom_dossier = tem_nom_dossier;
    }

    public String getTem_resume() {
        return tem_resume;
    }

    public void setTem_resume(String tem_resume) {
        this.tem_resume = tem_resume;
    }

    public String getTem_Ti_type() {
        return tem_Ti_type;
    }

    public void setTem_Ti_type(String tem_Ti_type) {
        this.tem_Ti_type = tem_Ti_type;
    }

    public String getTem_age() {
        return tem_age;
    }

    public void setTem_age(String tem_age) {
        this.tem_age = tem_age;
    }

    public String getTem_genre() {
        return tem_genre;
    }

    public void setTem_genre(String tem_genre) {
        this.tem_genre = tem_genre;
    }

    public String getTem_adr_commune() {
        return tem_adr_commune;
    }

    public void setTem_adr_commune(String tem_adr_commune) {
        this.tem_adr_commune = tem_adr_commune;
    }

    public String getCas_numEtude() {
        return cas_numEtude;
    }

    public void setCas_numEtude(String cas_numEtude) {
        this.cas_numEtude = cas_numEtude;
    }

    public String getTem_adr_CP() {
        return tem_adr_CP;
    }

    public void setTem_adr_CP(String tem_adr_CP) {
        this.tem_adr_CP = tem_adr_CP;
    }

    public String getTem_adr_dpt() {
        return tem_adr_dpt;
    }

    public void setTem_adr_dpt(String tem_adr_dpt) {
        this.tem_adr_dpt = tem_adr_dpt;
    }

    public String getTem_adr_pays() {
        return tem_adr_pays;
    }

    public void setTem_adr_pays(String tem_adr_pays) {
        this.tem_adr_pays = tem_adr_pays;
    }

    public String getTem_xp_activite_type() {
        return tem_xp_activite_type;
    }

    public void setTem_xp_activite_type(String tem_xp_activite_type) {
        this.tem_xp_activite_type = tem_xp_activite_type;
    }

    public String getTem_xp_astro() {
        return tem_xp_astro;
    }

    public void setTem_xp_astro(String tem_xp_astro) {
        this.tem_xp_astro = tem_xp_astro;
    }

    public String getTem_obs_moyen() {
        return tem_obs_moyen;
    }

    public void setTem_obs_moyen(String tem_obs_moyen) {
        this.tem_obs_moyen = tem_obs_moyen;
    }

    public String getTem_numSEPRA() {
        return tem_numSEPRA;
    }

    public void setTem_numSEPRA(String tem_numSEPRA) {
        this.tem_numSEPRA = tem_numSEPRA;
    }

    public String getId_observation() {
        return id_observation;
    }

    public void setId_observation(String id_observation) {
        this.id_observation = id_observation;
    }

    public String getObs_nb() {
        return obs_nb;
    }

    public void setObs_nb(String obs_nb) {
        this.obs_nb = obs_nb;
    }

    public String getObs_commune_or_trajet() {
        return obs_commune_or_trajet;
    }

    public void setObs_commune_or_trajet(String obs_commune_or_trajet) {
        this.obs_commune_or_trajet = obs_commune_or_trajet;
    }

    public String getObs_AAAA() {
        return obs_AAAA;
    }

    public void setObs_AAAA(String obs_AAAA) {
        this.obs_AAAA = obs_AAAA;
    }

    public String getObs_MM() {
        return obs_MM;
    }

    public void setObs_MM(String obs_MM) {
        this.obs_MM = obs_MM;
    }

    public String getObs_JJ() {
        return obs_JJ;
    }

    public void setObs_JJ(String obs_JJ) {
        this.obs_JJ = obs_JJ;
    }

    public Date getObs_date_heure() {
        return obs_date_heure;
    }

    public void setObs_date_heure(Date obs_date_heure) {
        this.obs_date_heure = obs_date_heure;
    }

    public String getObs_heure_plage() {
        return obs_heure_plage;
    }

    public void setObs_heure_plage(String obs_heure_plage) {
        this.obs_heure_plage = obs_heure_plage;
    }

    public String getObs_heure_delta() {
        return obs_heure_delta;
    }

    public void setObs_heure_delta(String obs_heure_delta) {
        this.obs_heure_delta = obs_heure_delta;
    }

    public String getObs_duree_hms() {
        return obs_duree_hms;
    }

    public void setObs_duree_hms(String obs_duree_hms) {
        this.obs_duree_hms = obs_duree_hms;
    }

    public String getObs_1_adr_commune() {
        return obs_1_adr_commune;
    }

    public void setObs_1_adr_commune(String obs_1_adr_commune) {
        this.obs_1_adr_commune = obs_1_adr_commune;
    }

    public String getObs_1_adr_CP() {
        return obs_1_adr_CP;
    }

    public void setObs_1_adr_CP(String obs_1_adr_CP) {
        this.obs_1_adr_CP = obs_1_adr_CP;
    }

    public String getObs_1_adr_dpt() {
        return obs_1_adr_dpt;
    }

    public void setObs_1_adr_dpt(String obs_1_adr_dpt) {
        this.obs_1_adr_dpt = obs_1_adr_dpt;
    }

    public String getObs_1_adr_pays() {
        return obs_1_adr_pays;
    }

    public void setObs_1_adr_pays(String obs_1_adr_pays) {
        this.obs_1_adr_pays = obs_1_adr_pays;
    }

    public String getObs_1_adr_commune_2() {
        return obs_1_adr_commune_2;
    }

    public void setObs_1_adr_commune_2(String obs_1_adr_commune_2) {
        this.obs_1_adr_commune_2 = obs_1_adr_commune_2;
    }

    public String getObs_1_cadre_reference_type() {
        return obs_1_cadre_reference_type;
    }

    public void setObs_1_cadre_reference_type(String obs_1_cadre_reference_type) {
        this.obs_1_cadre_reference_type = obs_1_cadre_reference_type;
    }

    public String getObs_1_lat() {
        return obs_1_lat;
    }

    public void setObs_1_lat(String obs_1_lat) {
        this.obs_1_lat = obs_1_lat;
    }

    public String getObs_1_lon() {
        return obs_1_lon;
    }

    public void setObs_1_lon(String obs_1_lon) {
        this.obs_1_lon = obs_1_lon;
    }

    public String getObs_1_env_sol() {
        return obs_1_env_sol;
    }

    public void setObs_1_env_sol(String obs_1_env_sol) {
        this.obs_1_env_sol = obs_1_env_sol;
    }

    public String getObs_1_env_sol_type() {
        return obs_1_env_sol_type;
    }

    public void setObs_1_env_sol_type(String obs_1_env_sol_type) {
        this.obs_1_env_sol_type = obs_1_env_sol_type;
    }

    public String getObs_conditions_tem_activite() {
        return obs_conditions_tem_activite;
    }

    public void setObs_conditions_tem_activite(String obs_conditions_tem_activite) {
        this.obs_conditions_tem_activite = obs_conditions_tem_activite;
    }

    public String getObs_1_heure() {
        return obs_1_heure;
    }

    public void setObs_1_heure(String obs_1_heure) {
        this.obs_1_heure = obs_1_heure;
    }

    public String getObs_1_azimut_lib() {
        return obs_1_azimut_lib;
    }

    public void setObs_1_azimut_lib(String obs_1_azimut_lib) {
        this.obs_1_azimut_lib = obs_1_azimut_lib;
    }

    public String getObs_1_elevation_lib() {
        return obs_1_elevation_lib;
    }

    public void setObs_1_elevation_lib(String obs_1_elevation_lib) {
        this.obs_1_elevation_lib = obs_1_elevation_lib;
    }

    public String getObs_1_alt() {
        return obs_1_alt;
    }

    public void setObs_1_alt(String obs_1_alt) {
        this.obs_1_alt = obs_1_alt;
    }

    public String getObs_1_trajectoire_lib() {
        return obs_1_trajectoire_lib;
    }

    public void setObs_1_trajectoire_lib(String obs_1_trajectoire_lib) {
        this.obs_1_trajectoire_lib = obs_1_trajectoire_lib;
    }

    public String getObs_1_tem_reaction_types() {
        return obs_1_tem_reaction_types;
    }

    public void setObs_1_tem_reaction_types(String obs_1_tem_reaction_types) {
        this.obs_1_tem_reaction_types = obs_1_tem_reaction_types;
    }

    public String getObs_conditions_apparition() {
        return obs_conditions_apparition;
    }

    public void setObs_conditions_apparition(String obs_conditions_apparition) {
        this.obs_conditions_apparition = obs_conditions_apparition;
    }

    public String getObs_conditions_tem_activite_lib() {
        return obs_conditions_tem_activite_lib;
    }

    public void setObs_conditions_tem_activite_lib(String obs_conditions_tem_activite_lib) {
        this.obs_conditions_tem_activite_lib = obs_conditions_tem_activite_lib;
    }

    public String getObs_conditions_meteo() {
        return obs_conditions_meteo;
    }

    public void setObs_conditions_meteo(String obs_conditions_meteo) {
        this.obs_conditions_meteo = obs_conditions_meteo;
    }

    public String getObs_conditions_meteo_lib() {
        return obs_conditions_meteo_lib;
    }

    public void setObs_conditions_meteo_lib(String obs_conditions_meteo_lib) {
        this.obs_conditions_meteo_lib = obs_conditions_meteo_lib;
    }

    public String getObs_conditions_astro_lib() {
        return obs_conditions_astro_lib;
    }

    public void setObs_conditions_astro_lib(String obs_conditions_astro_lib) {
        this.obs_conditions_astro_lib = obs_conditions_astro_lib;
    }

    public String getObs_1_forme_lib() {
        return obs_1_forme_lib;
    }

    public void setObs_1_forme_lib(String obs_1_forme_lib) {
        this.obs_1_forme_lib = obs_1_forme_lib;
    }

    public String getObs_conditions_disparition_txt() {
        return obs_conditions_disparition_txt;
    }

    public void setObs_conditions_disparition_txt(String obs_conditions_disparition_txt) {
        this.obs_conditions_disparition_txt = obs_conditions_disparition_txt;
    }

    public int[] getCoordonne() {
        return coordonne;
    }

    public void setCoordonne(int[] coordonne) {
        this.coordonne = coordonne;
    }
}