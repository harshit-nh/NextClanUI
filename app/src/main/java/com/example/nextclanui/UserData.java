package com.example.nextclanui;

public class UserData {

    int userImg;
    String userName;
    String locationTxt;
    String distanceTxt;
    String aboutTxt;
    String descriptionTxt;


    public UserData(int userImg, String userName, String locationTxt, String distanceTxt, String aboutTxt, String descriptionTxt) {
        this.userImg = userImg;
        this.userName = userName;
        this.locationTxt = locationTxt;
        this.distanceTxt = distanceTxt;
        this.aboutTxt = aboutTxt;
        this.descriptionTxt = descriptionTxt;
    }

    public int getUserImg() {
        return userImg;
    }

    public void setUserImg(int userImg) {
        this.userImg = userImg;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLocationTxt() {
        return locationTxt;
    }

    public void setLocationTxt(String locationTxt) {
        this.locationTxt = locationTxt;
    }

    public String getDistanceTxt() {
        return distanceTxt;
    }

    public void setDistanceTxt(String distanceTxt) {
        this.distanceTxt = distanceTxt;
    }

    public String getAboutTxt() {
        return aboutTxt;
    }

    public void setAboutTxt(String aboutTxt) {
        this.aboutTxt = aboutTxt;
    }

    public String getDescriptionTxt() {
        return descriptionTxt;
    }

    public void setDescriptionTxt(String descriptionTxt) {
        this.descriptionTxt = descriptionTxt;
    }
}
