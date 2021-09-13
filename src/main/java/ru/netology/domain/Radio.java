package ru.netology.domain;

public class Radio {
    private String name = "Радио - Маяк";
    private int currentRadioStation;
    private int minRadioStation = 0;
    private int quantityRadioStation;
    private int currentSoundVolume;
    private int minSoundVolume = 0;
    private int maxSoundVolume = 100;
    private boolean on;

    public Radio(int quantityRadioStation) {
        this.quantityRadioStation = quantityRadioStation - 1;
    }

    public Radio() {
        this.quantityRadioStation = 9;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantityRadioStation() {
        return quantityRadioStation;
    }

    public void setQuantityRadioStation(int quantityRadioStation) {
        this.quantityRadioStation = quantityRadioStation;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public void setMinRadioStation(int minRadioStation) {
        this.minRadioStation = minRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > quantityRadioStation) {
            return;
        }
        if (currentRadioStation < minRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void nextButton() {
        if (currentRadioStation >= quantityRadioStation) {
            this.currentRadioStation = minRadioStation;
        } else {
            this.currentRadioStation++;
        }
    }

    public void previousButton() {
        if (currentRadioStation <= minRadioStation) {
            this.currentRadioStation = quantityRadioStation;
        } else {
            this.currentRadioStation--;
        }
    }

    public int getMaxSoundVolume() {
        return maxSoundVolume;
    }

    public void setMaxSoundVolume(int maxSoundVolume) {
        this.maxSoundVolume = maxSoundVolume;
    }

    public int getMinSoundVolume() {
        return minSoundVolume;
    }

    public void setMinSoundVolume(int minSoundVolume) {
        this.minSoundVolume = minSoundVolume;
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void setCurrentSoundVolume(int currentSoundVolume) {
        this.currentSoundVolume = currentSoundVolume;
    }

    public void plusButton() {
        if (currentSoundVolume < maxSoundVolume) {
            currentSoundVolume++;
        }
    }

    public void minusButton() {
        if (currentSoundVolume > minSoundVolume) {
            currentSoundVolume--;
        }
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
}

