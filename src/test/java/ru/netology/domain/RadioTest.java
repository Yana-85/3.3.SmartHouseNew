package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldGetAndSetNameRadio() {

        assertEquals("Радио - Маяк", radio.getName());
    }

    @Test
    public void shouldGetAndSet() {

        assertEquals(9, radio.getQuantityRadioStation());
        assertEquals(0, radio.getMinRadioStation());
        assertEquals(100, radio.getMaxSoundVolume());
        assertEquals(0, radio.getMinSoundVolume());
    }

    @Test
    public void switchingToPreviousRadioButtonQuantityRadioStationNine() {
        Radio radio = new Radio(9);
        radio.setCurrentRadioStation(9);
        radio.previousButton();
        int expected = 8;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void switchingToNextRadioButtonQuantityRadioStationEight() {
        Radio radio = new Radio(8);
        radio.setCurrentRadioStation(6);
        radio.nextButton();
        int expected = 7;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void switchingToNextRadioStationAboveLimitValue() {
        Radio radio = new Radio(10);
        radio.setCurrentRadioStation(9);
        radio.nextButton();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void switchingToNextRadioButtonQuantityRadioStationOne() {
        Radio radio = new Radio(1);
        radio.setCurrentRadioStation(1);
        radio.nextButton();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void switchingToPreviousRadioButtonQuantityRadioStationOne() {
        Radio radio = new Radio(1);
        radio.setCurrentRadioStation(1);
        radio.previousButton();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void switchingToPreviousRadioStationBelowLimitValue() {
        Radio radio = new Radio(10);
        radio.setCurrentRadioStation(0);
        radio.previousButton();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void currentRadioStationInValidRange() {

        radio.setCurrentRadioStation(7);
        int expected = 7;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void increasingCurrentRadioStation() {

        radio.setCurrentRadioStation(0);
        radio.nextButton();
        int expected = 1;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void decreasingCurrentRadioStation() {

        radio.setCurrentRadioStation(1);
        radio.previousButton();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationButton() {

        radio.setCurrentRadioStation(0);
        radio.nextButton();
        int expected = 1;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationButton() {

        radio.setCurrentRadioStation(6);
        radio.previousButton();
        int expected = 5;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void nextRadioButtonAboveMaxRadioStation() {

        radio.setCurrentRadioStation(9);
        radio.nextButton();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void previousRadioButtonBelowMinRadioStation() {

        radio.setCurrentRadioStation(-1);
        radio.previousButton();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void currentSoundVolumeAboveLimitValue() {

        radio.setCurrentSoundVolume(100);
        radio.plusButton();
        int expected = 100;
        int actual = radio.getCurrentSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void currentSoundVolumeBelowLimitValue() {

        radio.setCurrentSoundVolume(0);
        radio.minusButton();
        int expected = 0;
        int actual = radio.getCurrentSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void increaseSoundVolume() {

        radio.setCurrentSoundVolume(5);
        radio.plusButton();
        int expected = 6;
        int actual = radio.getCurrentSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void decreaseSoundVolume() {

        radio.setCurrentSoundVolume(7);
        radio.minusButton();
        int expected = 6;
        int actual = radio.getCurrentSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldRadioIsOn() {

        radio.isOn();
        assertFalse(radio.isOn());
    }
}
