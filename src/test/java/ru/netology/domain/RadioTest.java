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

        assertEquals(10, radio.getMaxRadioStation());
        assertEquals(0, radio.getMinRadioStation());
        assertEquals(100, radio.getMaxSoundVolume());
        assertEquals(0, radio.getMinSoundVolume());
    }

    @Test
    public void currentRadioStationInValidRange() {
        radio.setCurrentRadioStation(7);
        int expected = 7;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void currentRadioStationEqualMaxRadioStation() {
        radio.setCurrentRadioStation(10);
        int expected = 10;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void currentRadioStationAboveLimitValue() {
        radio.setCurrentRadioStation(11);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void currentRadioStationBelowLimitValue() {
        radio.setCurrentRadioStation(-1);
        int expected = 0;
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
        radio.setCurrentRadioStation(10);
        radio.nextButton();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void previousRadioButtonBelowMinRadioStation() {
        radio.setCurrentRadioStation(-1);
        radio.previousButton();
        int expected = 10;
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
