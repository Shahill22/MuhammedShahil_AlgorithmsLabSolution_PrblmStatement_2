package com.learning.sort;

public class MergeSort {
	public void merge(int[] arr,int left,int mid,int right) {
		int len1=mid-left+1;
		int len2=right-mid;
		int leftArr[]=new int[len1];
		int rightArr[]=new int[len2];
		for(int i=0;i<len1;i++) {
			leftArr[i]=arr[left+i];
		}
		for(int j=0;j<len2;j++) {
			rightArr[j]=arr[mid+1+j];
		}
		int i=0,j=0;
		int k=left;
		while(i<len1 && j<len2){
			if(leftArr[i]<=rightArr[j]) {
				arr[k]=rightArr[j];
				j++;
			}
			else {
				arr[k]=leftArr[i];
				i++;
			}
			k++;
		}
		while(i<len1){
			arr[k]=leftArr[i];
			i++;
			k++;
		}
		while(j<len2){
			arr[k]=rightArr[j];
			j++;
			k++;
		}
	}
	public void sort(int[] arr,int left,int right) {
		if(left<right) {
			int mid=(left+right) / 2;
			sort(arr,left,mid);
			sort(arr,mid+1,right);
			merge(arr,left,mid,right);	
		}
	}

}
