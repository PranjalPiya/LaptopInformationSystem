/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LaptopIS;
//importing java packages
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Sanjaya Kumar Gurung, Pranjal Piya, Parash Raj Bhat, Sakar Pant
 */
public class SelectionSort {
     public static void sort(ArrayList<Device> deviceArrayList){
        for (int i=0; i<deviceArrayList.size()-1; i++){
            int minPos = minPosFinder(deviceArrayList,i);
            swap(deviceArrayList,minPos,i);
            
        }
    }
    
    public static int minPosFinder(ArrayList<Device> deviceArrayList, int from){
        int minPos = from;
        for (int i=from+1; i<deviceArrayList.size(); i++){
            if (deviceArrayList.get(i).getPrice()<deviceArrayList.get(minPos).getPrice())
                minPos = i;
        }
        return minPos;
    }
        
            
    public static void swap(ArrayList<Device> deviceArrayList, int minPos, int from){
        Collections.swap(deviceArrayList, minPos, from);
        
    }
}
