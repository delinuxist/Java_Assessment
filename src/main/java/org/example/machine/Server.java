package org.example.machine;

import org.example.custom_exception.MachineNotCreatedException;
import org.example.interfaces.AuthorisingService;
import org.example.interfaces.SystemBuildService;
import org.example.interfaces.VirtualMachineRequestor;

import java.util.HashMap;
import java.util.Map;

public class Server extends Machine implements AuthorisingService, SystemBuildService, VirtualMachineRequestor {
    private String distributionName;
    private int distributionNumber;
    private String kernelVersion;

    private int buildCount;

    private static Map<String,Map<MachineType,Integer>> totalBuildsByUserForDay;

    private final MachineType machineType = MachineType.DESKTOP;


    private Map<String,String> administrativeTeam;

    public Server(String hostname,String requestorName,CPU cpu,RAM ram,int hardDisk,int windowsVersion,String buildNumber){
        super(hostname,requestorName,cpu,ram,hardDisk);
    }

    @Override
    public boolean isAuthorised(String user) {
        return false;
    }

    @Override
    public void createNewRequest(Machine machine) {
        try {
            if(machine != null) {
                Map<MachineType,Integer> virtualMachine = new HashMap<>();
                virtualMachine.put(this.machineType,this.buildCount++);
                totalBuildsByUserForDay.put(getRequestorName(),virtualMachine);
            }else {
                totalFailedBuildsForDay++;
                throw new MachineNotCreatedException("Machine not created");
            }
        }catch(MachineNotCreatedException e){
            System.out.println(e.getMessage());
        }

    }

    @Override
    public String createNewMachine(Machine machine) {
        return null;
    }
}
