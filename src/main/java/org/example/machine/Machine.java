package org.example.machine;

import java.util.ArrayList;
import java.util.Map;

public abstract class Machine {
    private String hostname;
    private String requestorName;
    private CPU cpu;
    private RAM ram;

    private int hardDisk;


    protected static int totalFailedBuildsForDay;


    public Machine(String hostname, String requestorName, CPU cpu, RAM ram, int hardDisk){
        this.hostname = hostname;
        this.requestorName = requestorName;
        this.cpu = cpu;
        this.ram = ram;
        this.hardDisk = hardDisk;
    }

    public static int getTotalFailedBuildsForDay() {
        return totalFailedBuildsForDay;
    }

    public String getHostname() {
        return hostname;
    }

    public String getRequestorName() {
        return requestorName;
    }

    public CPU getCpu() {
        return cpu;
    }

    public RAM getRam() {
        return ram;
    }

    public int getHardDisk() {
        return hardDisk;
    }
}
