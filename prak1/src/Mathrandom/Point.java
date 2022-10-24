package Mathrandom;

public class Point {
    private int z;
    private int p;

    public Point() {
    }

    public Point(int z, int p) {
        this.z = z;
        this.p = p;
    }

    public int getZ() {
        return this.z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getP() {
        return this.p;
    }

    public void setP(int p) {
        this.p = p;
    }

    public String toString() {
        return "Point{z=" + this.z + ", p=" + this.p + "}";
    }
}

