package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    private static Object ArrayList;

    public static void main(String[] args) {
	// write your code here


        int[][] spaceData=new int[][]{{1,1,1,0,0},{2,3,4,0,0},{3,5,5,0,0},{4,6,2,0,0},{5,7,8,0,0}};// space data(index, capable length, capable width, type, groupid)
        int[][] projectData=new int[][]{{0,3,3,1,0,101},{0,6,1,5,0,102},{0,7,9,2,0,103},{0,2,2,3,0,104},{0,1,1,4,0,105}};//uses input(postion,length,width,type,status,groupid)
        spaceAllocation test=new spaceAllocation(spaceData,projectData);
        test.getAllocation();

        int [][]arr=test.getAllocation();



        for(int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println(test.checkSameType());




    }
}
