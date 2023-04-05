package org.example.machine;

public enum CPU {
    ONECPU(1),
    TWOCPUS(2),
    FOURCPUS(4),
    EIGHTCPUS(8);

    private int value;

    CPU(int value) {
        this.value = value;
    }

    public int getCPU() {
        return value;
    }
}
