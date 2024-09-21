package com.example.recyclerview_12;

public class Info {
    private String GunName;
    private String GunDescription;
    private int GunImage;

    public Info(String gun_name, String gun_description, int gun_image)
    {
        this.GunName = gun_name;
        this.GunDescription = gun_description;
        this.GunImage = gun_image;
    }

    public String getGunName() {
        return this.GunName;
    }
    public void setGunName(String gunName) {
        this.GunName = gunName;
    }
    public String getGunDescription() {
        return this.GunDescription;
    }
    public void setGunDescription(String gunDescription) {
        this.GunDescription = gunDescription;
    }
    public int getGunImage() {
        return this.GunImage;
    }

    public void setGunImage(int gunImage) {
        this.GunImage = gunImage;
    }
}
