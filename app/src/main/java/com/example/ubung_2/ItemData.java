package com.example.ubung_2;

public class ItemData {
    private String title;
    private  int image;

    public ItemData(String title, int image)
    {
        this.title = title;
        this.image = image;
    }
    public String getTitel()
    {
        return title;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }
    public int getImage()
    {
        return image;
    }
    public void setImage(int i)
    {
        image = i;
    }
}
