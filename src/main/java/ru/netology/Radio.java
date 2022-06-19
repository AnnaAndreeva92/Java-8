package ru.netology;

import lombok.Data;

@Data
public class Radio {
    private int minNumber = 0;
    private int maxNumber = 9;
    private int currentRadioStation;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume;



    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }


    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < minNumber) {
            return;
        }
        if (currentRadioStation > maxNumber) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void nextStation() {
        if (currentRadioStation >= maxNumber) {
            setCurrentRadioStation(minNumber);
        } else {
            setCurrentRadioStation(currentRadioStation + 1);
        }
    }

    public void prevStation() {
        if (currentRadioStation <= minNumber) {
            setCurrentRadioStation(maxNumber);
        } else {
            setCurrentRadioStation(currentRadioStation - 1);
        }
    }

    public void volumeUpForOne() {
        setCurrentVolume(currentVolume + 1);
    }

    public void volumeDownForOne() {
        setCurrentVolume(currentVolume - 1);
    }
}