package ru.netology;

public class Radio {
    private int minNumber = 0;
    private int maxNumber = 9;
    private int currentRadioStation;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume;


    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getMinNumber() {
        return minNumber;
    }

    public void setMinNumber(int minNumber) {
        this.minNumber = minNumber;
    }

    public int getMaxNumber() {

        return maxNumber;
    }

    public void setMaxNumber(int maxNumber) {

        this.maxNumber = maxNumber;
    }

    public int getCurrentRadioStation() {

        return currentRadioStation;
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