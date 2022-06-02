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

    public void setVolumeLevel(int newVolumeLevel) {
        if (newVolumeLevel < 10) {
            newVolumeLevel = newVolumeLevel + 1;
        }
        if (newVolumeLevel > 10) {
            newVolumeLevel = 10;
        }
        if (newVolumeLevel < 0) {
            newVolumeLevel = 0;
        }
        volumeLevel = newVolumeLevel;
    }
    public int getVolumeLevel() {
        return volumeLevel;
    }
}
