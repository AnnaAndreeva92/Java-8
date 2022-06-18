package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void checkCurrentStation() {
        radio.setCurrentRadioStation(2);

        assertEquals(2, radio.getCurrentRadioStation());

    }

    @Test
    public void changeOverLastRadioStation() {
        radio.setCurrentRadioStation(10);
        radio.nextStation();

        assertEquals(1, radio.getCurrentRadioStation());
    }

    @Test
    public void changeUnderInitialRadioStation() {
        radio.setCurrentRadioStation(-1);
        radio.prevStation();

        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void nextRadioStation() {
        radio.setCurrentRadioStation(5);
        radio.nextStation();

        assertEquals(6, radio.getCurrentRadioStation());
    }

    @Test
    public void nextRadioStationAboveTheMaximum() {
        radio.setCurrentRadioStation(9);
        radio.nextStation();

        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void prevRadioStation() {
        radio.setCurrentRadioStation(6);
        radio.prevStation();

        assertEquals(5, radio.getCurrentRadioStation());
    }


    @Test
    public void radioSetToHigh() {
        radio.setMaxNumber(12);
        radio.getMaxNumber();

        assertEquals(0, radio.getCurrentRadioStation());
    }


    @Test
    public void radioStationBelowTheMinimum() {
        radio.setMinNumber(-2);
        radio.getMinNumber();

        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void volumeUp() {
        radio.setCurrentVolume(50);
        radio.volumeUpForOne();

        assertEquals(51, radio.getCurrentVolume());
    }

    @Test
    public void volumeDown() {
        radio.setCurrentVolume(30);
        radio.volumeDownForOne();

        assertEquals(29, radio.getCurrentVolume());
    }

    @Test
    public void volumeExceedsTheMaximumValue() {
        radio.setCurrentVolume(102);
        radio.setMaxVolume(100);

        assertEquals(100, radio.getMaxVolume());

    }

    @Test
    public void volumeDownUnderMin() {
        radio.setCurrentVolume(-1);
        radio.setMinVolume(0);

        assertEquals(0, radio.getMinVolume());
    }

}


