package ru.netology;

public class Radio {

    private int radioStationNumber;
    private int volume;

    public int getRadioStationNumber() {
        return radioStationNumber;
    }


    public void setRadioStationNumber(int newRadioStationNumber) {

        if (newRadioStationNumber < 0) {
            return;
        }
        if (newRadioStationNumber > 9) {
            return;
        }
        this.radioStationNumber = newRadioStationNumber;
    }


    public void next() {
        if (radioStationNumber == 9) {
            this.radioStationNumber = 0;
            return;
        }
        this.radioStationNumber++;
    }

    public void prev() {
        if (radioStationNumber == 0) {
            this.radioStationNumber = 9;
            return;
        }
        this.radioStationNumber--;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume < 0) {
            return;
        }
        if (volume > 10) {
            return;
        }
        this.volume = volume;
    }

    public void volumeUpForOne() {
        if (volume == 10) {
            this.volume = volume;
        }
        if (volume < 10) {
            this.volume++;
        }
    }

    public void volumeDownForOne() {
        if (volume == 0) {
            this.volume = volume;
        }
        if (volume > 0) {
            this.volume--;
        }
    }
}









