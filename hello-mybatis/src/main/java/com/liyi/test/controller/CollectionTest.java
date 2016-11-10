package com.liyi.test.controller;

import java.util.ArrayList;
import java.util.List;

public class CollectionTest {
	static int pageSize=5;
	public static void main(String[] args) {
		int start=0;
		int end =pageSize;
		
		List<String> listAll = new ArrayList<String>();
		listAll.add("1");
		listAll.add("2");
		listAll.add("3");
		listAll.add("4");
		listAll.add("5");
		listAll.add("6");
		listAll.add("7");
		listAll.add("8");
		listAll.add("9");
		listAll.add("10");
		listAll.add("11");
		listAll.add("12");
		listAll.add("13");
		int count = listAll.size()%pageSize==0?listAll.size()/pageSize:listAll.size()/pageSize+1;
		List<Integer> rightList = new ArrayList<Integer>();
		List<String> errorList = new ArrayList<String>();
		List<String> removeList = new ArrayList<String>();
		
		for(int i=0;i<count;i++){
			List<Integer> roundList = eachRound(listAll,start,end);
			for (Integer integer : roundList) {
				if(integer<=5){
					rightList.add(integer);
				}else{
					errorList.add(String.valueOf(integer));
				}
			}
			removeList.addAll(errorList);
			for (Integer integer : rightList) {
				removeList.add(String.valueOf(integer));
			}
			start+=pageSize;
			end = end+pageSize>=listAll.size()-1?listAll.size()-1:end+pageSize;
		}
		listAll.removeAll(removeList);
		System.out.println(listAll.size());
	}
	
	public static List<Integer> eachRound(List<String> listAll,int start,int end){
		List<Integer> roundList = new ArrayList<Integer>();
		for(int i=start;i<=end;i++){
			roundList.add(Integer.valueOf(listAll.get(i)));
		}
		return roundList;
	}
	
}
