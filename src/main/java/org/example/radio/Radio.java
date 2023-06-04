package org.example.radio;

public class Radio {

    private int minRadioStation = 0;
    private int maxRadioStation = 9;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentRadioStation = minRadioStation;
    private int currentVolume = minVolume;

    public Radio() {
    }


    public Radio(int quantityRadioStation) {
        this.maxRadioStation = quantityRadioStation - 1;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }


    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation >= minRadioStation) {
            if (newCurrentRadioStation <= maxRadioStation) {
                currentRadioStation = newCurrentRadioStation;
            }
        }
    }

    public void prevCurrentStation() {
        if (currentRadioStation == minRadioStation) {
            currentRadioStation = maxRadioStation;
        } else if (currentRadioStation <= maxRadioStation) {
            currentRadioStation--;
        }
    }

    public void nextCurrentStation() {
        if (currentRadioStation == maxRadioStation) {
            currentRadioStation = minRadioStation;
        } else if (currentRadioStation >= minRadioStation) {
            currentRadioStation++;
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > minVolume) {
            if (newCurrentVolume <= maxVolume) {
                currentVolume = newCurrentVolume;
            }
        }
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }
}
