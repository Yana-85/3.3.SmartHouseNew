package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void shouldGetAndSetNameRadio() {
        Radio radio = new Radio();
        String expected = "Радио - Маяк";

        assertNull(radio.getName());
        radio.setName(expected);
        assertEquals(expected, radio.getName());
    }

    @Test
    public void shouldGetAndSet() {
        Radio radio = new Radio();
        assertEquals(9, radio.getMaxRadioStation());
        assertEquals(0, radio.getMinRadioStation());
        assertEquals(10, radio.getMaxSoundVolume());
        assertEquals(0, radio.getMinSoundVolume());
    }

    @Test
    public void currentRadioStationInValidRange() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(7);
        int expected = 7;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void currentRadioStationAboveLimitValue() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void currentRadioStationBelowLimitValue() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationButton() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.nextButton();
        int expected = 1;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationButton() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(6);
        radio.previousButton();
        int expected = 5;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void nextRadioButtonAboveMaxRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.nextButton();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void previousRadioButtonBelowMinRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);
        radio.previousButton();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void currentSoundVolumeAboveLimitValue() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(10);
        radio.plusButton();
        int expected = 10;
        int actual = radio.getCurrentSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void currentSoundVolumeBelowLimitValue() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(0);
        radio.minusButton();
        int expected = 0;
        int actual = radio.getCurrentSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void increaseSoundVolume() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(5);
        radio.plusButton();
        int expected = 6;
        int actual = radio.getCurrentSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void decreaseSoundVolume() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(7);
        radio.minusButton();
        int expected = 6;
        int actual = radio.getCurrentSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldRadioIsOn() {
        Radio radio = new Radio();
        radio.isOn();
        assertFalse(radio.isOn());
    }
}