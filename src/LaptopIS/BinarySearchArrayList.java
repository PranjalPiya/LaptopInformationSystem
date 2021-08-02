/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LaptopIS;
//importing java packages
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Sanjaya Kumar Gurung, Pranjal Piya, Parash Raj Bhat, Sakar Pant
 */
public class BinarySearchArrayList {
    public static int BinarySearch(List<Device> deviceArrayList, int valueToSearch) {

        int start = 0;
        int end = deviceArrayList.size();
        

        while(start < end){
            int middlePoint = (start + end)/2;
            
            System.out.println(deviceArrayList.get(middlePoint).Price);
            System.out.println(valueToSearch);
            if (deviceArrayList.get(middlePoint).Price == valueToSearch) {
                return middlePoint;
            } else if(deviceArrayList.get(middlePoint).Price < valueToSearch){ // right half of the array is searched
                start = middlePoint + 1;
            } else {
                end = middlePoint;
            }
        } return -1;
    }
}
