package com.company.capgemini.Assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Assignment {
    static void minMax(int[] ar)
    {
        int min=ar[0];
        int max=ar[0];
        for(int i=0;i< ar.length;i++)
        {
            if(ar[i]<min)
                min=ar[i];
        }
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]>max)
                max=ar[i];
        }
        System.out.println("Minimum Element : "+min+"\nMaximum Element : "+max);
    }
    static void revArr(int[] ar)
    {
        int n= ar.length;
        int temp;
        for(int i=0;i<n/2;i++)
        {
            temp=ar[i];
            ar[i]=ar[n-1-i];
            ar[n-1-i]=temp;
        }
        System.out.println("Reversed Array :\n"+Arrays.toString(ar));

    }
    static void sortArr(int[] ar)
    {
        Arrays.sort(ar);
        System.out.println("Sorted Array : \n"+Arrays.toString(ar));
    }
    static void fileReadWrite() throws IOException
    {
        File file = new File("C:\\CapSpace\\src\\com\\company\\capgemini\\Assignment\\Content.txt");
        FileInputStream inputStream = new FileInputStream(file);
        Scanner sc = new Scanner(inputStream);
        StringBuffer buffer = new StringBuffer();
        while (sc.hasNext())
            buffer.append("\n"+sc.nextLine());
        File des = new File("C:\\CapSpace\\src\\com\\company\\capgemini\\Assignment\\CopiedFile.txt");
        FileWriter writer = new FileWriter(des);
        writer.write(buffer.toString());
        writer.flush();
        System.out.println("File content copied and written successfully.");
    }
    static void mapKeySort() {
        Map<String, String> map = new HashMap<>();
        map.put("10", "Teju");
        map.put("5","Harsha");
        map.put("2","Hari");
        map.put("20","Yoshita");
        map.put("15","Vardhan");

        Map<String,String>  sorted=new TreeMap<>(map);
        System.out.println("Sorted Map :");
        for(Map.Entry<String,String> entry:sorted.entrySet())
        {
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }
    }
        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number of elements : ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the Array Elements :");
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            System.out.println("========First Problem.========");
            minMax(arr);
            System.out.println("========Second Problem.========");
            revArr(arr);
            System.out.println("========Third Problem.========");
            sortArr(arr);
            System.out.println("========Fourth Problem.========");
            try {
                fileReadWrite();
            } catch (IOException e) {
                System.out.println("Invalid Files.");
            }
            System.out.println("========Fifth Problem.========");
            mapKeySort();
        }
    }
