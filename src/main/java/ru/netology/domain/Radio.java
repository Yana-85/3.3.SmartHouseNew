package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    private String name = "Радио - Маяк";
    private int currentRadioStation;
    private int minRadioStation = 0;
    private int maxRadioStation = 10;
    private int currentSoundVolume;
    private int minSoundVolume = 0;
    private int maxSoundVolume = 100;
    private boolean on;

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        if (currentRadioStation < minRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void nextButton() {
        if (currentRadioStation < maxRadioStation) {
            this.currentRadioStation++;
        } else {
            currentRadioStation = minRadioStation;
        }
    }

    public void previousButton() {
        if (currentRadioStation > minRadioStation) {
            this.currentRadioStation--;
        } else {
            currentRadioStation = maxRadioStation;
        }
    }

    public void plusButton() {
        if (currentSoundVolume == maxSoundVolume) {
            return;
        }
        this.currentSoundVolume++;
    }

    public void minusButton() {
        if (currentSoundVolume == minSoundVolume) {
            return;
        }
        this.currentSoundVolume--;
    }
}

