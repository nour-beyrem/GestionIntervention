package com.example.gestionintervention;

public class Intervention {

    private String titreIntervention;
    private String client;
    private String adresseClient;
    private String heureIntervention;
    private Boolean terminer;

    public Intervention(String titreIntervention, String client, String adresseClient, String heureIntervention, Boolean terminer) {
        this.titreIntervention = titreIntervention;
        this.client = client;
        this.adresseClient = adresseClient;
        this.heureIntervention = heureIntervention;
        this.terminer = terminer;
    }

    public String getTitreIntervention() {
        return titreIntervention;
    }

    public void setTitreIntervention(String titreIntervention) {
        this.titreIntervention = titreIntervention;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getAdresseClient() {
        return adresseClient;
    }

    public void setAdresseClient(String adresseClient) {
        this.adresseClient = adresseClient;
    }

    public String getHeureIntervention() {
        return heureIntervention;
    }

    public void setHeureIntervention(String heureIntervention) {
        this.heureIntervention = heureIntervention;
    }

    public Boolean getTerminer() {
        return terminer;
    }

    public void setTerminer(Boolean terminer) {
        this.terminer = terminer;
    }
}
