package org.example.machine;

public enum RAM {
    RAM16GB(16),
    RAM64GB(64),
    RAM128GB(128);

    private int value;

    RAM(int value){
        this.value=value;
    }

    public int getRAM() {
        return value;
    }
}
