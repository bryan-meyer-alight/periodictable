package com.brm.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Element {

    private String name;
    private String appearance;
    private double atomic_mass;
    private double boil;
    private String category;
    private double density;
    private String discovered_by;
    private double melt;
    private double molar_heat;
    private String named_by;
    private int number;
    private int period;
    private int group;
    private String phase;
    private String source;
    private String bohr_model_image;
    private String bohr_model_3d;
    private String spectral_img;
    private String summary;
    private String symbol;
    private int xpos;
    private int ypos;
    private int wxpos;
    private int wypos;
    private List<Integer> shells;
    private String electron_configuration;
    private String electron_configuration_semantic;
    private double electron_affinity;
    private double electronegativity_pauling;
    private List<Integer> ionization_energies;
    @JsonProperty("cpk-hex")
    private String cpkHex;
    private Image image;
    private String block;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAppearance() {
        return appearance;
    }

    public void setAppearance(String appearance) {
        this.appearance = appearance;
    }

    public double getAtomic_mass() {
        return atomic_mass;
    }

    public void setAtomic_mass(double atomic_mass) {
        this.atomic_mass = atomic_mass;
    }

    public double getBoil() {
        return boil;
    }

    public void setBoil(double boil) {
        this.boil = boil;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public String getDiscovered_by() {
        return discovered_by;
    }

    public void setDiscovered_by(String discovered_by) {
        this.discovered_by = discovered_by;
    }

    public double getMelt() {
        return melt;
    }

    public void setMelt(double melt) {
        this.melt = melt;
    }

    public double getMolar_heat() {
        return molar_heat;
    }

    public void setMolar_heat(double molar_heat) {
        this.molar_heat = molar_heat;
    }

    public String getNamed_by() {
        return named_by;
    }

    public void setNamed_by(String named_by) {
        this.named_by = named_by;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getBohr_model_image() {
        return bohr_model_image;
    }

    public void setBohr_model_image(String bohr_model_image) {
        this.bohr_model_image = bohr_model_image;
    }

    public String getBohr_model_3d() {
        return bohr_model_3d;
    }

    public void setBohr_model_3d(String bohr_model_3d) {
        this.bohr_model_3d = bohr_model_3d;
    }

    public String getSpectral_img() {
        return spectral_img;
    }

    public void setSpectral_img(String spectral_img) {
        this.spectral_img = spectral_img;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getXpos() {
        return xpos;
    }

    public void setXpos(int xpos) {
        this.xpos = xpos;
    }

    public int getYpos() {
        return ypos;
    }

    public void setYpos(int ypos) {
        this.ypos = ypos;
    }

    public int getWxpos() {
        return wxpos;
    }

    public void setWxpos(int wxpos) {
        this.wxpos = wxpos;
    }

    public int getWypos() {
        return wypos;
    }

    public void setWypos(int wypos) {
        this.wypos = wypos;
    }

    public List<Integer> getShells() {
        return shells;
    }

    public void setShells(List<Integer> shells) {
        this.shells = shells;
    }

    public String getElectron_configuration() {
        return electron_configuration;
    }

    public void setElectron_configuration(String electron_configuration) {
        this.electron_configuration = electron_configuration;
    }

    public String getElectron_configuration_semantic() {
        return electron_configuration_semantic;
    }

    public void setElectron_configuration_semantic(String electron_configuration_semantic) {
        this.electron_configuration_semantic = electron_configuration_semantic;
    }

    public double getElectron_affinity() {
        return electron_affinity;
    }

    public void setElectron_affinity(double electron_affinity) {
        this.electron_affinity = electron_affinity;
    }

    public double getElectronegativity_pauling() {
        return electronegativity_pauling;
    }

    public void setElectronegativity_pauling(double electronegativity_pauling) {
        this.electronegativity_pauling = electronegativity_pauling;
    }

    public List<Integer> getIonization_energies() {
        return ionization_energies;
    }

    public void setIonization_energies(List<Integer> ionization_energies) {
        this.ionization_energies = ionization_energies;
    }

    public String getCpkHex() {
        return cpkHex;
    }

    public void setCpkHex(String cpkHex) {
        this.cpkHex = cpkHex;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }
}
