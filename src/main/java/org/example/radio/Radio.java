package org.example.radio;

public class Radio {

    private int currentRadioStation;
    private int currentVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > 9) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    // public void setCurrentRadioStation(int newCurrentRadioStation) {
    //   if (newCurrentRadioStation >= 0) {
    //   if (newCurrentRadioStation <= 9) {
    //      currentRadioStation = newCurrentRadioStation;
    //  }
    //  }
    //  }


    public void prevCurrentStation() {
        if (currentRadioStation != 0) {
            currentRadioStation--;
        } else
            currentRadioStation = 9;
    }

    public void nextCurrentStation() {
        if (currentRadioStation != 9) {
            currentRadioStation++;
            return;
        }
        currentRadioStation = 0;
    }


    // public void setCurrentVolume(int newCurrentVolume) {
    //   if (newCurrentVolume > 0) {
    //      if (newCurrentVolume <= 100) {
    //         currentVolume = newCurrentVolume;
    //    }
    //}
    // }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
