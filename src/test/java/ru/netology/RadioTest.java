package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    void number() {
        Radio cond = new Radio();
        cond.setRadioStationNumber(1);

        int actual = cond.getRadioStationNumber();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void aboveTheMaximum() {
        Radio cond = new Radio();
        cond.setRadioStationNumber(10);

        int actual = cond.getRadioStationNumber();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void belowTheMinimum() {
        Radio cond = new Radio();
        cond.setRadioStationNumber(-1);

        int actual = cond.getRadioStationNumber();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void volumeUp() {
        Radio cond = new Radio();
        cond.setVolumeUp(5);

        int actual = cond.getVolumeLevel();
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    void volumeUpMax() {
        Radio cond = new Radio();
        cond.setVolumeUp(11);

        int actual = cond.getVolumeLevel();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    void volumeUpMin() {
        Radio cond = new Radio();
        cond.setVolumeUp(-2);

        int actual = cond.getVolumeLevel();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void volumeDown() {
        Radio cond = new Radio();
        cond.setVolumeDown(5);

        int actual = cond.getVolumeLevel();
        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    void volumeDownMax() {
        Radio cond = new Radio();
        cond.setVolumeDown(11);

        int actual = cond.getVolumeLevel();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    void volumeDownMin() {
        Radio cond = new Radio();
        cond.setVolumeDown(-1);

        int actual = cond.getVolumeLevel();
        int expected = 0;

        assertEquals(expected, actual);

    }

}
