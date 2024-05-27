package com.algorithm;

import com.sun.corba.se.spi.ior.MakeImmutable;

public class BinaraySearchWork {
	public BinaraySearchWork(){
		cmp();
	}
	private void cmp()
	{
		int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 16;
        int result = binarySearch(arr, target);
        System.out.println("Element found at index Withoout Recursion : " + result);
        int result2 = binarySearchRecursion(arr, target);
        System.out.println("Element found at index With Recursion : " + result2);
	}
	
	public  int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left <= right) {
            int mid = right + left  / 2;
            
            if (arr[mid] == target)
            {
            	return mid;
            }
            if (arr[mid] < target)
            {
            	left = mid + 1;
            }
            else
            {
            	right = mid - 1;
            }
        }
        
        return -1;
	}
	public  int binarySearchRecursion(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left <= right) {
            int mid = left +(right-left) /*make defference (right-left)*/ / 2;
            
            if (arr[mid] == target)
            {
            	return mid;
            }
            if (arr[mid] < target)
            {
            	left = mid + 1;
            }
            else
            {
            	right = mid - 1;
            }
        }
        
        return -1;
	}
}
