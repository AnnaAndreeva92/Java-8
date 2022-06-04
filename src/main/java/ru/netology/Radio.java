package ru.netology;

public class Radio {

    private int radioStationNumber;

    public void setRadioStationNumber(int newRadioStationNumber) {
        if (newRadioStationNumber < 0) {
            newRadioStationNumber = 9;
        }
        if (newRadioStationNumber > 9) {
            newRadioStationNumber = 0;
        }
        radioStationNumber = newRadioStationNumber;
    }

    public int getRadioStationNumber() {
        return radioStationNumber;
    }

    private int volumeLevel;

    public void setVolumeUp(int newVolumeUp) {
        if (newVolumeUp < 10) {
            newVolumeUp = newVolumeUp + 1;
        }
        if (newVolumeUp > 10) {
            newVolumeUp = 10;
        }
        if (newVolumeUp < 0) {
            newVolumeUp = 0;
        }
        volumeLevel = newVolumeUp;
    }

    public void setVolumeDown(int newVolumeDown) {
        if (newVolumeDown <= 10) {
            newVolumeDown = newVolumeDown - 1;
        }
        if (newVolumeDown > 10) {
            newVolumeDown = 10;
        }
        if (newVolumeDown < 0) {
            newVolumeDown = 0;
        }
        volumeLevel = newVolumeDown;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }
}
