package jgarciabt.renderingissues.overdraw;

public class ColorItem {

    String name;
    String hexCode;
    int resourceId;

    public ColorItem(String name, String hexCode, int resourceId) {

        this.name = name;
        this.hexCode = hexCode;
        this.resourceId = resourceId;
    }

    public String getName() {

        return name;
    }

    public String getHexCode() {

        return hexCode;
    }

    public int getResourceId() {

        return resourceId;
    }
}
