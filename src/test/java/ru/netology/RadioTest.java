package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    void shouldChangeOnNextRadioStation() {
        Radio radio = new Radio();
        int radioStationNumber = 1;
        radio.setRadioStationNumber(radioStationNumber);
        radio.next();
        int expected = 2;
        Assertions.assertEquals(expected, radio.getRadioStationNumber());
    }

    @Test
    void shouldNotChangeOnNextRadioStationIfStationIsMax() {
        Radio radio = new Radio();
        int radioStationNumber = 10;
        radio.setRadioStationNumber(radioStationNumber);

        int expected = 0;
        Assertions.assertEquals(expected, radio.getRadioStationNumber());
    }

    @Test
    void shouldNotChangeOnNextRadioStationIfStationIsMin() {
        Radio radio = new Radio();
        int radioStationNumber = -1;
        radio.setRadioStationNumber(radioStationNumber);
        int expected = 0;
        Assertions.assertEquals(expected, radio.getRadioStationNumber());
    }

    @Test
    void next() {
        Radio radio = new Radio();

        int radioStationNumber = 9;
        radio.setRadioStationNumber(radioStationNumber);
        radio.next();
        int expected = 0;
        Assertions.assertEquals(expected, radio.getRadioStationNumber());
    }

    @Test
    public void prev() {
        Radio radio = new Radio();

        int radioStationNumber = 0;
        radio.setRadioStationNumber(radioStationNumber);
        radio.prev();
        int expected = 9;
        Assertions.assertEquals(expected, radio.getRadioStationNumber());

    }

    @Test
    void shouldChangeToThePreviousRadioStation() {
        Radio radio = new Radio();
        int radioStationNumber = 5;
        radio.setRadioStationNumber(radioStationNumber);
        radio.prev();
        int expected = 4;
        Assertions.assertEquals(expected, radio.getRadioStationNumber());
    }

    @Test
    void volumeUpForOne() {
        Radio radio = new Radio();
        int volume = 5;
        radio.setVolume(volume);
        radio.volumeUpForOne();
        int expected = 6;
        Assertions.assertEquals(expected, radio.getVolume());
    }

    @Test
    void volumeDownForOne() {
        Radio radio = new Radio();
        int volume = 7;
        radio.setVolume(volume);
        radio.volumeDownForOne();
        int expected = 6;
        Assertions.assertEquals(expected, radio.getVolume());
    }

    @Test
    void shouldSetVolumeIfVolumeIsOverMax() {
        Radio radio = new Radio();
        int volume = 11;
        radio.setVolume(volume);
        int expected = 0;
        Assertions.assertEquals(expected, radio.getVolume());
    }

    @Test
    void shouldSetVolumeIfVolumeIsUnderMin() {
        Radio radio = new Radio();
        int volume = -1;
        radio.setVolume(volume);
        int expected = 0;
        Assertions.assertEquals(expected, radio.getVolume());

    }

    @Test
    void shouldNotChangeVolumeIfVolumeIsMin() {
        Radio radio = new Radio();
        int volume = 0;
        radio.setVolume(volume);
        radio.volumeDownForOne();
        int expected = 0;
        assertEquals(expected, radio.getVolume());

    }

    @Test
    void shouldNotChangeVolumeIfVolumeIsMax() {
        Radio radio = new Radio();
        int volume = 10;
        radio.setVolume(volume);
        radio.volumeUpForOne();
        int expected = 10;
        assertEquals(expected, radio.getVolume());
    }
}




