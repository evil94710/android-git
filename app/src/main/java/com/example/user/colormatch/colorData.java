package com.example.user.colormatch;


public class colorData {
    private String Name;
    private String C1;
    private String C2;
    private String C3;
    private String C4;
    private String C5;

    public colorData(String Name, String C1,String C2,String C3,String C4,String C5) {
        this.Name = Name;
        this.C1 = C1;
        this.C2 = C2;
        this.C3 = C3;
        this.C4 = C4;
        this.C5 = C5;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getC1() {
        return C1;
    }

    public void setC1(String r1) {
        C1 = r1;
    }

    public String getC2() {
        return C2;
    }

    public void setC2(String r2) {
        C2 = r2;
    }

    public String getC3() {
        return C3;
    }

    public void setC3(String r3) {
        C3 = r3;
    }

    public String getC4() {
        return C4;
    }

    public void setC4(String r4) {
        C4 = r4;
    }

    public String getC5() {
        return C5;
    }

    public void setC5(String r5) {
        C5 = r5;
    }


}
