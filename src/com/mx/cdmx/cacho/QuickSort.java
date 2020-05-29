package com.mx.cdmx.cacho;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
    	StringBuilder sb = new StringBuilder();
    	sb.append("hi");
    	sb.append("hi2");
    	System.out.println(sb.toString().equalsIgnoreCase("hihi21"));
        // int[] arr = {6,4,1,0,2,7,8,1,9,7,3,-1};
        // quickSort(arr, 0, arr.length -1);
        // System.out.println("2 - "+Arrays.toString(arr));
    }
    
    public static void quickSort(int[] arr, int init, int end){
        if (init < end){
        	int part = partition(arr, init, end);
        	quickSort(arr, init, part-1);
        	quickSort(arr, part+1, end);
        }
    }
    
    public static int partition(int[] arr, int init, int end){
    	int pivot = arr[end];
    	int partitionindex = init;
    	for (int i = init; i < end; i++) {
    		int a = arr[i];
    		if (a <= pivot) {
    			swap(arr, i, partitionindex);
    			partitionindex ++;
    			System.out.println("0 - "+Arrays.toString(arr));
    		}
    	}
    	swap(arr, partitionindex, end);
    	System.out.println("1 - "+Arrays.toString(arr));
        return partitionindex;
    }
    
    public static void swap(int[]arr, int left, int right){
        int l = arr[left];
        int r = arr[right];
        arr[right] = l;
        arr[left] = r;
    }
}
