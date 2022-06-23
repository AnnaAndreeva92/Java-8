package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    @Test
    public void setTheNumberOfStations() {
        Radio radio = new Radio(20);
        radio.setCurrentRadioStation(10);

        assertEquals(10, radio.getCurrentRadioStation());

    }
    @Test
    public void validRadioStationValue() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);
        assertEquals(1,radio.getCurrentRadioStation());
    }
    @Test
    public void invalidRadioStationValue() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);
        assertEquals(0,radio.getCurrentRadioStation());
    }
    @Test
    public void exceedingTheMaximumValueOfRadioStations() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);
        assertEquals(0,radio.getCurrentRadioStation());
    }
    @Test
    public void increaseTheRadioStationByOne() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        radio.next();
        assertEquals(6,radio.getCurrentRadioStation());
    }
    @Test
    public void increaseTheRadioStationMoreThanTheMaximum() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.next();
        assertEquals(0, radio.getCurrentRadioStation());
    }
    @Test
    public void decreaseTheRadioStationByOne() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        radio.prev();
        assertEquals(4,radio.getCurrentRadioStation());
    }
    @Test
    public void reduceTheRadioStationBelowTheMinimum() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.prev();
        assertEquals(9,radio.getCurrentRadioStation());
    }
    @Test
    public void increaseVolumeByOne() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        assertEquals(11,radio.getCurrentVolume());
    }
    @Test
    public void decreaseVolumeByOne() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        radio.decreaseVolume();
        assertEquals(49,radio.getCurrentVolume());
    }
    @Test
    public void reduceTheVolumeBelowTheMinimum() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0,radio.getCurrentVolume());
    }
    @Test
    public void increaseTheSoundMoreThanTheMaximum() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        assertEquals(100,radio.getCurrentVolume());
    }
    @Test
    public void soundOverMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        assertEquals(100,radio.getCurrentVolume());
    }
    @Test
    public void soundLessThanMinimum() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        assertEquals(0,radio.getCurrentVolume());
    }
}