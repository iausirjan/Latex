package org.cloudbus.cloudsim.examples.power;

/*
 * Title:        CloudSim Toolkit
 * Description:  CloudSim (Cloud Simulation) Toolkit for Modeling and Simulation
 *               of Clouds
 * Licence:      GPL - http://www.gnu.org/copyleft/gpl.html
 *
 * Copyright (c) 2009, The University of Melbourne, Australia
 */

//import pso.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

import org.cloudbus.cloudsim.Cloudlet;
import org.cloudbus.cloudsim.CloudletSchedulerDynamicWorkload;
import org.cloudbus.cloudsim.DatacenterBroker;
import org.cloudbus.cloudsim.DatacenterCharacteristics;
import org.cloudbus.cloudsim.Log;
import org.cloudbus.cloudsim.Storage;
import org.cloudbus.cloudsim.UtilizationModelStochastic;
import org.cloudbus.cloudsim.Vm;
import org.cloudbus.cloudsim.VmSchedulerTimeShared;
import org.cloudbus.cloudsim.core.CloudSim;
import org.cloudbus.cloudsim.power.PowerDatacenter;
import org.cloudbus.cloudsim.power.PowerVm;
import org.cloudbus.cloudsim.power.PowerHost;
//import org.cloudbus.cloudsim.power.PowerPe;
import org.cloudbus.cloudsim.power.models.PowerModelLinear;
import org.cloudbus.cloudsim.provisioners.BwProvisionerSimple;
import org.cloudbus.cloudsim.provisioners.PeProvisionerSimple;
import org.cloudbus.cloudsim.File;


import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
//import org.apache.commons.collections4.CollectionUtils;
import java.io.*;

//import cs.umu.se.vmp.data.DataGenerator;

import java.util.Vector;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;


import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
//import org.apache.commons.collections.CollectionUtils;
import java.io.*;

//import cs.umu.se.vmp.schema.PlacementRequest;
//import cs.umu.se.vmp.data.DataGenerator;

import java.util.Vector;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;


import java.io.BufferedWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import org.cloudbus.cloudsim.Cloudlet;
import org.cloudbus.cloudsim.CloudletSchedulerDynamicWorkload;
import org.cloudbus.cloudsim.Datacenter;
import org.cloudbus.cloudsim.DatacenterBroker;
import org.cloudbus.cloudsim.DatacenterCharacteristics;
import org.cloudbus.cloudsim.Host;
import org.cloudbus.cloudsim.HostDynamicWorkload;
import org.cloudbus.cloudsim.HostStateHistoryEntry;
import org.cloudbus.cloudsim.Log;
import org.cloudbus.cloudsim.Pe;
import org.cloudbus.cloudsim.Storage;
import org.cloudbus.cloudsim.Vm;
import org.cloudbus.cloudsim.VmAllocationPolicy;
import org.cloudbus.cloudsim.VmSchedulerTimeSharedOverSubscription;
import org.cloudbus.cloudsim.VmStateHistoryEntry;
import org.cloudbus.cloudsim.power.PowerDatacenter;
import org.cloudbus.cloudsim.power.PowerDatacenterBroker;
import org.cloudbus.cloudsim.power.PowerVmAllocationPolicyAbstract;
import org.cloudbus.cloudsim.power.PowerVmAllocationPolicyMigrationAbstract;
import org.cloudbus.cloudsim.power.PowerVmAllocationPolicyMigrationInterQuartileRange;
import org.cloudbus.cloudsim.power.PowerVmAllocationPolicyMigrationLocalRegression;
import org.cloudbus.cloudsim.power.PowerVmAllocationPolicySimple;
import org.cloudbus.cloudsim.power.PowerHost;
import org.cloudbus.cloudsim.power.PowerHostUtilizationHistory;
import org.cloudbus.cloudsim.power.PowerVm;
import org.cloudbus.cloudsim.provisioners.BwProvisionerSimple;
import org.cloudbus.cloudsim.provisioners.PeProvisionerSimple;
import org.cloudbus.cloudsim.provisioners.RamProvisionerSimple;
import org.cloudbus.cloudsim.util.MathUtil;
import org.cloudbus.cloudsim.Host;
import org.cloudbus.cloudsim.Log;
import org.cloudbus.cloudsim.Vm;
import org.cloudbus.cloudsim.VmAllocationPolicy;
import org.cloudbus.cloudsim.core.CloudSim;
import org.cloudbus.cloudsim.power.PowerVmAllocationPolicySimple;
import org.cloudbus.cloudsim.power.PowerVmSelectionPolicy;
import org.cloudbus.cloudsim.Host;
import org.cloudbus.cloudsim.HostDynamicWorkload;
import org.cloudbus.cloudsim.Log;
import org.cloudbus.cloudsim.Vm;
import org.cloudbus.cloudsim.core.CloudSim;
import org.cloudbus.cloudsim.power.lists.PowerVmList;
import org.cloudbus.cloudsim.util.ExecutionTimeMeasurer;
import java.util.HashSet;
import org.cloudbus.cloudsim.UtilizationModelStochastic;
 import org.cloudbus.cloudsim.examples.power.Helper;
import org.cloudbus.cloudsim.power.PowerVmSelectionPolicy;
import org.cloudbus.cloudsim.power.PowerVmSelectionPolicyMaximumCorrelation;
import org.cloudbus.cloudsim.power.PowerVmSelectionPolicyMinimumMigrationTimebase;


import org.cloudbus.cloudsim.power.PowerVmSelectionPolicyMinimumUtilizationbase;
import org.cloudbus.cloudsim.power.PowerVmSelectionPolicyRandomSelection;
import org.cloudbus.cloudsim.CloudletSchedulerDynamicWorkload;
import org.cloudbus.cloudsim.Datacenter;
import org.cloudbus.cloudsim.DatacenterBroker;
import org.cloudbus.cloudsim.DatacenterCharacteristics;
import org.cloudbus.cloudsim.Host;
import org.cloudbus.cloudsim.HostDynamicWorkload;
import org.cloudbus.cloudsim.HostStateHistoryEntry;
import org.cloudbus.cloudsim.Log;
import org.cloudbus.cloudsim.Pe;
import org.cloudbus.cloudsim.Storage;
import org.cloudbus.cloudsim.Vm;
import org.cloudbus.cloudsim.VmAllocationPolicy;
import org.cloudbus.cloudsim.VmSchedulerTimeSharedOverSubscription;
import org.cloudbus.cloudsim.VmStateHistoryEntry;
import org.cloudbus.cloudsim.power.PowerDatacenter;
import org.cloudbus.cloudsim.power.PowerHostUtilizationHistory;

import org.cloudbus.cloudsim.power.PowerHost;
//import org.cloudbus.cloudsim.power.PowerVm;
import org.cloudbus.cloudsim.provisioners.BwProvisionerSimple;
import org.cloudbus.cloudsim.provisioners.PeProvisionerSimple;
import org.cloudbus.cloudsim.provisioners.RamProvisionerSimple;


import org.cloudbus.cloudsim.core.CloudSim;
import org.cloudbus.cloudsim.UtilizationModelStochastic;
import org.cloudbus.cloudsim.power.PowerVmAllocationPolicyMigrationLocalRegression;
import org.cloudbus.cloudsim.power.PowerVmAllocationPolicyMigrationStaticThreshold;
import org.cloudbus.cloudsim.power.PowerVmAllocationPolicyMigrationAbstract;
import org.cloudbus.cloudsim.power.PowerVmSelectionPolicy;
import org.cloudbus.cloudsim.power.PowerVmSelectionPolicyMinimumMigrationTime;
import org.cloudbus.cloudsim.VmAllocationPolicy;
import org.cloudbus.cloudsim.power.PowerVmAllocationPolicyMigrationLocalRegressionRobust;
import org.cloudbus.cloudsim.power.PowerVmAllocationPolicyMigrationAbstract;
import org.cloudbus.cloudsim.power.PowerVmAllocationPolicyMigrationMedianAbsoluteDeviation;

import java.sql.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;



/**
 * An example of a power aware data center. In this example the placement of VMs
 * is continuously adapted using VM migration in order to minimize the number
 * of physical nodes in use, while idle nodes are switched off to save energy.
 * The CPU utilization of each host is kept under the specified utilization threshold.
 */
public class B_M {

	/** The cloudlet list. */
	private static List<Cloudlet> cloudletList;

	/** The vm list. */
	private static List<Vm> vmList;
        //private static List<Vm> vmLists;

	//private static double utilizationThreshold = 0.8;

	//private static double hostsNumber =110;
       // private static List<Vm> vmList;

	//private static double utilizationThreshold = 0.8;

	private static double hostsNumber = 100;
	//private static double vmsNumber = 50;
	private static double cloudletsNumber =100;
          public static Vm[] vm=new PowerVm[100] ;
         public static int requestnumber=100;
	//private static double vmsNumber = 80;
	//private static double cloudletsNumber =10;
	//private static double vmsNumber = 10;//
	//private static double cloudletsNumber = 20;///

	/**
	 * Creates main() to run this example.
	 *
	 * @param args the args
	 */
        
        public static Connection con;

        //public static double[][] vmarray = new double[resource_num][5];
       // public static double[][] cloudarray = new double[task_num][2];

       // public static int[] vm_list = new int[task_num];
        public static LinkedList<Vm> list = new LinkedList<Vm>();
        public static LinkedList<Cloudlet> list2 = new LinkedList<Cloudlet>();

        //public static Vm[] vm = new PowerVm[resource_num];
       // public static Cloudlet[] cloudlet = new Cloudlet[task_num];
         public static int t ;
   

   
        private static List<Vm> createVmList(int brokerId,int requestnumber) {
           //requestnumber=50;
	List<Vm> vmlist = new ArrayList<Vm>();
		for (int i = 0; i < requestnumber ; i++) {
			int vmType = i / (int) Math.ceil((double) requestnumber / Constants.VM_TYPES);
			vm[i]=new PowerVm(
					i,
					brokerId,
					Constants.VM_MIPS[vmType],
					Constants.VM_PES[vmType],
                                        Constants.VM_RAM[vmType],
					Constants.VM_BW,
					Constants.VM_SIZE,
					1,
					"Xen",
					new CloudletSchedulerDynamicWorkload(Constants.VM_MIPS[vmType], Constants.VM_PES[vmType]),
					Constants.SCHEDULING_INTERVAL);
//                       wrapper   r =new  wrapper ();
                       vmlist.add(vm[i]);
		}

		
		return vmlist;
                //int vmType = i / (int) Math.ceil((double) requestnumber / Constants.VM_TYPES);
			
                
                
                
	}
        
        private static List<Cloudlet> createCloudletList(int brokerId ) {
	List<Cloudlet> list = new ArrayList<Cloudlet>();

		long length = 150000; // 10 min on 250 MIPS
		int pesNumber = 1;
		long fileSize = 300;
		long outputSize = 300;
               // cloudletsNumber =50;
		for (int i = 0; i < cloudletsNumber; i++) {
			Cloudlet cloudlet = new Cloudlet(i, length, pesNumber, fileSize, outputSize, new UtilizationModelStochastic(), new UtilizationModelStochastic(), new UtilizationModelStochastic());
			cloudlet.setUserId(brokerId);
			cloudlet.setVmId(i);
			list.add(cloudlet);
		}

		return list;
	
	}

     

	public static void main(String[] args) {
          
            
           
               
               Vector v = new Vector();
               int max = 0;
          
		try {
		 
			int num_user = 1; // number of cloud users
			Calendar calendar = Calendar.getInstance();
			boolean trace_flag = false; // mean trace GridSim events

			// Initialize the CloudSim library
			CloudSim.init(num_user, calendar, trace_flag);

			// Second step: Create Datacenters
			// Datacenters are the resource providers in CloudSim. We need at
			// list one of them to run a CloudSim simulation
                        PowerDatacenter datacenter = (PowerDatacenter) createDatacenter(
					"Datacenter0",
					PowerDatacenter.class);
					
					
					
			// Third step: Create Broker
			DatacenterBroker broker = createBroker();
			int brokerId = broker.getId();

                             
                           // vmarray.add(vmList);
                            
                             
                            vmList=createVmList(brokerId,requestnumber);
                        cloudletList = createCloudletList(brokerId);
                
                      broker.submitVmList(vmList);
                        broker.submitCloudletList(cloudletList);
                        
                        //for(i=0; i<task_num; i++){
                        //broker.bindCloudletToVm(cloudlet[i].getCloudletId(),vm_list[i]);
                        //}
                             

        
    

			// Fourth step: Create one virtual machine
			//vmList = createVms(brokerId);

			// submit vm list to the broker
			//broker.submitVmList(vmarray);

			// Fifth step: Create one cloudlet
                       // broker.submitVmList(vmarray);
			//cloudletList = createCloudletList(brokerId);

			// submit cloudlet list to the broker
			//broker.submitCloudletList(cloudletList);
                        

			// Sixth step: Starts the simulation
			double lastClock = CloudSim.startSimulation();

			// Final step: Print results when simulation is over
			List<Cloudlet> newList = broker.getCloudletReceivedList();
			Log.printLine("Received " + newList.size() + " cloudlets");

			CloudSim.stopSimulation();

			printCloudletList(datacenter,
					vmList,newList);

                        

			Log.printLine();
			Log.printLine(String.format("Total simulation time: %.2f sec", lastClock));
			Log.printLine(String.format("Energy consumption: %.2f kWh", datacenter.getPower() / (3600 * 1000)));
			Log.printLine(String.format("Number of VM migrations: %d", datacenter.getMigrationCount()));
			//Log.printLine(String.format("Number of SLA violations: %d", sla.size()));
			//Log.printLine(String.format("SLA violation percentage: %.2f%%", (double) sla.size() * 100 / numberOfAllocations));
			//Log.printLine(String.format("Average SLA violation: %.2f%%", averageSla));
			Log.printLine();

		} catch (Exception e) {
			e.printStackTrace();
			Log.printLine("Unwanted errors happen");
		}

		Log.printLine("SingleThreshold finished!");
	}

	/**
	 * Creates the cloudlet list.
	 *
	 * @param brokerId the broker id
	 *
	 * @return the cloudlet list
	 */
	
        

	/**
	 * Creates the vms.
	 *
	 * @param brokerId the broker id
	 *
	 * @return the list< vm>
	 */
	
         
	    
	 
	private static Datacenter createDatacenter(String name,
			Class<? extends Datacenter> datacenterClass)
			 throws Exception {
		// Here are the steps needed to create a PowerDatacenter:
		// 1. We need to create an object of HostList2 to store
		// our machine
		List<PowerHost> hostList = new ArrayList<PowerHost>();
                //Class<? extends Datacenter> datacenterClass;
		double maxPower = 250; // 250W
		double staticPowerPercent = 0.7; // 70%

		int[] mips = { 5000, 5500 };
		int [] ram = {4096, 4096}; // host memory (MB)
		long storage = 10000; // host storage
		int bw = 10000;
              int[] HOST_MIPS = { 5000, 4500 };
            int[] HOST_PES	 = { 1, 1 };
		for (int i = 0; i < hostsNumber; i++) {
			int hostType = i % Constants.HOST_TYPES;

			List<Pe> peList = new ArrayList<Pe>();
			for (int j = 0; j < Constants.HOST_PES[hostType]; j++) {
				peList.add(new Pe(j, new PeProvisionerSimple(HOST_MIPS[hostType])));
			}

			hostList.add(new PowerHostUtilizationHistory(
					i,
					new RamProvisionerSimple(ram[hostType]),
					new BwProvisionerSimple(Constants.HOST_BW),
					Constants.HOST_STORAGE,
					peList,
					new VmSchedulerTimeShared(peList),
					Constants.HOST_POWER[hostType]));// This is our machine
		}
                
		// 5. Create a DatacenterCharacteristics object that stores the
		// properties of a Grid resource: architecture, OS, list of
		// Machines, allocation policy: time- or space-shared, time zone
		// and its price (G$/PowerPe time unit).
		String arch = "x86"; // system architecture
		String os = "Linux"; // operating system
		String vmm = "Xen";
		double time_zone = 10.0; // time zone this resource located
		double cost = 3.0; // the cost of using processing in this resource
		double costPerMem = 0.05; // the cost of using memory in this resource
		double costPerStorage = 0.001; // the cost of using storage in this resource
		double costPerBw = 0.0; // the cost of using bw in this resource
                String vmAllocationPolicyName="mad";
			String vmSelectionPolicyName= "mmt";
			String parameterName="2.5";
                        VmAllocationPolicy vmAllocationPolicy = null;
		PowerVmSelectionPolicy vmSelectionPolicy = null;
		if (!vmSelectionPolicyName.isEmpty()) {
			vmSelectionPolicy = getVmSelectionPolicy(vmSelectionPolicyName);
		}
		double parameter = 0;
		if (!parameterName.isEmpty()) {
			parameter = Double.valueOf(parameterName);
		}
		
		 
			if (vmAllocationPolicyName.equals("iqr")) {
			PowerVmAllocationPolicyMigrationAbstract fallbackVmSelectionPolicy = new PowerVmAllocationPolicyMigrationStaticThreshold(
					hostList,
					vmSelectionPolicy,
					0.7);
			vmAllocationPolicy = new PowerVmAllocationPolicyMigrationInterQuartileRange(
					hostList,
					vmSelectionPolicy,
					parameter,
					fallbackVmSelectionPolicy);
		} else if (vmAllocationPolicyName.equals("mad")) {
			PowerVmAllocationPolicyMigrationAbstract fallbackVmSelectionPolicy = new PowerVmAllocationPolicyMigrationStaticThreshold(
					hostList,
					vmSelectionPolicy,
					0.7);
			vmAllocationPolicy = new PowerVmAllocationPolicyMigrationMedianAbsoluteDeviation(
					hostList,
					vmSelectionPolicy,
					parameter,
					fallbackVmSelectionPolicy);
		} else if (vmAllocationPolicyName.equals("lr")) {
			PowerVmAllocationPolicyMigrationAbstract fallbackVmSelectionPolicy = new PowerVmAllocationPolicyMigrationStaticThreshold(
					hostList,
					vmSelectionPolicy,
					0.7);
			vmAllocationPolicy = new PowerVmAllocationPolicyMigrationLocalRegression(
					hostList,
					vmSelectionPolicy,
					parameter,
					Constants.SCHEDULING_INTERVAL,
					fallbackVmSelectionPolicy);
		} else if (vmAllocationPolicyName.equals("lrr")) {
			PowerVmAllocationPolicyMigrationAbstract fallbackVmSelectionPolicy = new PowerVmAllocationPolicyMigrationStaticThreshold(
					hostList,
					vmSelectionPolicy,
					0.7);
			vmAllocationPolicy = new PowerVmAllocationPolicyMigrationLocalRegressionRobust(
					hostList,
					vmSelectionPolicy,
					parameter,
					Constants.SCHEDULING_INTERVAL,
					fallbackVmSelectionPolicy);
		} else if (vmAllocationPolicyName.equals("thr")) {
			vmAllocationPolicy = new PowerVmAllocationPolicyMigrationStaticThreshold(
					hostList,
					vmSelectionPolicy,
					parameter);
		} else if (vmAllocationPolicyName.equals("dvfs")) {
			vmAllocationPolicy = new PowerVmAllocationPolicySimple(hostList);
		} else {
			System.out.println("Unknown VM allocation policy: " + vmAllocationPolicyName);
			System.exit(0);
		}
		 

		DatacenterCharacteristics characteristics = new DatacenterCharacteristics(
				arch, os, vmm, hostList, time_zone, cost, costPerMem, costPerStorage, costPerBw);

		// 6. Finally, we need to create a PowerDatacenter object.
			Datacenter datacenter = null;
		try {
			 datacenter = datacenterClass.getConstructor(
					String.class,
					DatacenterCharacteristics.class,
					VmAllocationPolicy.class,
					List.class,
					Double.TYPE).newInstance(
					name,
					characteristics,
					vmAllocationPolicy,
					new LinkedList<Storage>(),
					Constants.SCHEDULING_INTERVAL);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return datacenter;
	}
protected static PowerVmSelectionPolicy getVmSelectionPolicy(String vmSelectionPolicyName) {
		PowerVmSelectionPolicy vmSelectionPolicy = null;
		
		 if (vmSelectionPolicyName.equals("mc")) {
			vmSelectionPolicy = new PowerVmSelectionPolicyMaximumCorrelation(
					new PowerVmSelectionPolicyMinimumMigrationTime());
		} else if (vmSelectionPolicyName.equals("mmt")) {
			vmSelectionPolicy = new PowerVmSelectionPolicyMinimumMigrationTimebase();
		} else if (vmSelectionPolicyName.equals("mu")) {
			vmSelectionPolicy = new PowerVmSelectionPolicyMinimumUtilizationbase();
		} else if (vmSelectionPolicyName.equals("rs")) {
			vmSelectionPolicy = new PowerVmSelectionPolicyRandomSelection();
		} else {
			System.out.println("Unknown VM selection policy: " + vmSelectionPolicyName);
			System.exit(0);
		}
		return vmSelectionPolicy;
	}
	// We strongly encourage users to develop their own broker policies, to
	// submit vms and cloudlets according
	// to the specific rules of the simulated scenario
	/**
	 * Creates the broker.
	 *
	 * @return the datacenter broker
	 */
	private static DatacenterBroker createBroker() {
		DatacenterBroker broker = null;
		try {
			broker = new DatacenterBroker("Broker");
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return broker;
	}

	/**
	 * Prints the Cloudlet objects.
	 *
	 * @param list list of Cloudlets
	 */
	private static void printCloudletList(PowerDatacenter datacenter,
			List<Vm> vms,List<Cloudlet> list) {
		int size = list.size();
                List<Host> hosts = datacenter.getHostList();

		int numberOfHosts = hosts.size();
		int numberOfVms = vms.size();
                Map<String, Double> slaMetrics = getSlaMetrics(vms);
                double slaOverall = slaMetrics.get("overall");
		double slaAverage = slaMetrics.get("average");
		double slaDegradationDueToMigration = slaMetrics.get("underallocated_migration");
                double slaTimePerActiveHost = getSlaTimePerActiveHost(hosts);

		double sla = slaTimePerActiveHost * slaDegradationDueToMigration;
                List<Double> timeBeforeHostShutdown = getTimesBeforeHostShutdown(hosts);

		int numberOfHostShutdowns = timeBeforeHostShutdown.size();

		Cloudlet cloudlet;

		String indent = "\t";
		Log.printLine();
		
                        Log.printLine();
			Log.printLine(String.format("%d", numberOfHosts));
                        Log.printLine(String.format("%d", numberOfVms));
                        Log.printLine(String.format("SLA: %.5f%%", sla * 100));
                         Log.printLine(String.format("SLA time per active host: %.2f%%", slaTimePerActiveHost * 100));
                         Log.printLine(String.format("SLA perf degradation due to migration: %.2f%%",
					slaDegradationDueToMigration * 100));
                         Log.printLine( String.format("Overall SLA violation: %.2f%%", slaOverall * 100));
                         Log.printLine(String.format("Average SLA violation: %.2f%%", slaAverage * 100));
                         Log.printLine(String.format("Number of host shutdowns: %d", numberOfHostShutdowns));
			
	}
        protected static Map<String, Double> getSlaMetrics(List<Vm> vms) {
		Map<String, Double> metrics = new HashMap<String, Double>();
		List<Double> slaViolation = new LinkedList<Double>();
		double totalAllocated = 0;
		double totalRequested = 0;
		double totalUnderAllocatedDueToMigration = 0;

		for (Vm vm : vms) {
			double vmTotalAllocated = 0;
			double vmTotalRequested = 0;
			double vmUnderAllocatedDueToMigration = 0;
			double previousTime = -1;
			double previousAllocated = 0;
			double previousRequested = 0;
			boolean previousIsInMigration = false;

			for (VmStateHistoryEntry entry : vm.getStateHistory()) {
				if (previousTime != -1) {
					double timeDiff = entry.getTime() - previousTime;
					vmTotalAllocated += previousAllocated * timeDiff;
					vmTotalRequested += previousRequested * timeDiff;

					if (previousAllocated < previousRequested) {
						slaViolation.add((previousRequested - previousAllocated) / previousRequested);
						if (previousIsInMigration) {
							vmUnderAllocatedDueToMigration += (previousRequested - previousAllocated)
									* timeDiff;
						}
					}
				}

				previousAllocated = entry.getAllocatedMips();
				previousRequested = entry.getRequestedMips();
				previousTime = entry.getTime();
				previousIsInMigration = entry.isInMigration();
			}

			totalAllocated += vmTotalAllocated;
			totalRequested += vmTotalRequested;
			totalUnderAllocatedDueToMigration += vmUnderAllocatedDueToMigration;
		}

		metrics.put("overall", (totalRequested - totalAllocated) / totalRequested);
		if (slaViolation.isEmpty()) {
			metrics.put("average", 0.);
		} else {
			metrics.put("average", MathUtil.mean(slaViolation));
		}
		metrics.put("underallocated_migration", totalUnderAllocatedDueToMigration / totalRequested);
		// metrics.put("sla_time_per_vm_with_migration", slaViolationTimePerVmWithMigration /
		// totalTime);
		// metrics.put("sla_time_per_vm_without_migration", slaViolationTimePerVmWithoutMigration /
		// totalTime);

		return metrics;
	}
        protected static double getSlaTimePerActiveHost(List<Host> hosts) {
		double slaViolationTimePerHost = 0;
		double totalTime = 0;

		for (Host _host : hosts) {
			HostDynamicWorkload host = (HostDynamicWorkload) _host;
			double previousTime = -1;
			double previousAllocated = 0;
			double previousRequested = 0;
			boolean previousIsActive = true;

			for (HostStateHistoryEntry entry : host.getStateHistory()) {
				if (previousTime != -1 && previousIsActive) {
					double timeDiff = entry.getTime() - previousTime;
					totalTime += timeDiff;
					if (previousAllocated < previousRequested) {
						slaViolationTimePerHost += timeDiff;
					}
				}

				previousAllocated = entry.getAllocatedMips();
				previousRequested = entry.getRequestedMips();
				previousTime = entry.getTime();
				previousIsActive = entry.isActive();
			}
		}

		return slaViolationTimePerHost / totalTime;
	}
        public static List<Double> getTimesBeforeHostShutdown(List<Host> hosts) {
		List<Double> timeBeforeShutdown = new LinkedList<Double>();
		for (Host host : hosts) {
			boolean previousIsActive = true;
			double lastTimeSwitchedOn = 0;
			for (HostStateHistoryEntry entry : ((HostDynamicWorkload) host).getStateHistory()) {
				if (previousIsActive == true && entry.isActive() == false) {
					timeBeforeShutdown.add(entry.getTime() - lastTimeSwitchedOn);
				}
				if (previousIsActive == false && entry.isActive() == true) {
					lastTimeSwitchedOn = entry.getTime();
				}
				previousIsActive = entry.isActive();
			}
		}
		return timeBeforeShutdown;
	}


        

}
