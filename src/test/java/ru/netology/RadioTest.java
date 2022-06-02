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
    void maximumVolume() {
        Radio cond = new Radio();
        cond.setVolumeLevel(11);

        int actual = cond.getVolumeLevel();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    void minimumVolume() {
        Radio cond = new Radio();
        cond.setVolumeLevel(-2);

        int actual = cond.getVolumeLevel();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void volume() {
        Radio cond = new Radio();
        cond.setVolumeLevel(5);

        int actual = cond.getVolumeLevel();
        int expected = 6;

        assertEquals(expected, actual);
    }
}
