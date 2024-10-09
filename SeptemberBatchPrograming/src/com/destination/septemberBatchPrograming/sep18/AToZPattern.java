package com.destination.septemberBatchProgram.oct1;

import java.util.Scanner;  

public class AToZPattern {  
  
  public static int absValue(int n) {  
      if(n < 0) {  
          return (-1 * n);  
      }else {  
          return n;  
      }  
  }  
  //  pattern of 'A'  
  public static void drawPatternA(int h, int w){  
      int n = w / 2;  
      for (int i = 0; i < h; i++) {  
          for (int j = 0; j <= w; j++) {  
              if (j == n || j == (w - n) || (i == h / 2 && j > n && j < (w - n))) {  
                  System.out.printf("*");  
              } else {  
                  System.out.printf(" ");  
              }  
          }  
          System.out.printf("\n");  
          n--;  
      }  
  }  
  // of 'B'  
  public static void drawPatternB(int h, int w){  
      int mid = (h / 2);  
      for(int i = 0; i < h; i++) {  
          System.out.printf("*");  
          for(int j = 0; j < w; j++) {  
              if((i == 0 || i == h - 1 || i == mid) && j < (w - 2)) {  
                  System.out.printf("*");  
              } else if (j == (w - 2) && !(i == 0 || i == h - 1 || i == mid)) {  
                  System.out.printf("*");  
              } else {  
                  System.out.printf(" ");  
              }  
          }  
          System.out.printf("\n");  
      }  
  }  
  //  pattern of 'C'  
  public static void drawPatternC(int h){  
      for(int i = 0; i < h; i++) {  
          System.out.printf("*");  
          for (int j = 0; j < (h - 1); j++) {  
              if (i == 0 || i == h - 1) {  
                  System.out.printf("*");  
              } else {  
                  continue;  
              }  
          }  
          System.out.printf("\n");  
      }  
  }  
  // pattern of 'D'  
  public static void drawPatternD(int h){  
      for(int i = 0; i < h; i++) {  
          System.out.printf("*");  
          for (int j = 0; j < h; j++) {  
              if((i == 0 || i == h - 1) && j < h - 1) {  
                  System.out.printf("*");  
              }else if (j == h - 1 && i != 0 && i != h - 1) {  
                  System.out.printf("*");  
              }else {  
                  System.out.printf(" ");  
              }  
          }  
          System.out.printf("\n");  
      }  
  }  
  //  pattern of 'E'  
  public static void drawPatternE(int h){  
      for (int i = 0; i < h; i++) {  
          System.out.printf("*");  
          for (int j = 0; j < h; j++) {  
              if ((i == h / 2 && j <= h / 2) || (i == 0 || i == h - 1)) {  
                  System.out.printf("*");  
              } else {  
                  continue;  
              }  
          }  
          System.out.printf("\n");  
      }  
  }  
  //  pattern of 'F'  
  public static void drawPatternF(int h){  
      for (int i = 0; i < h; i++) {  
          System.out.printf("*");  
          for (int j = 0; j < h; j++) {  
              if ((i == h / 2 && j <= h / 2) || i == 0) {  
                  System.out.printf("*");  
              } else {  
                  continue;  
              }  
          }  
          System.out.printf("\n");  
      }  
  }  
  //  pattern of 'G'  
  public static void drawPatternG(int h, int w){  
      w--;  
      for(int i = 0; i < h; i++) {  
          for(int j = 0; j < w; j++) {  
              if((j == 0 || j == w -1 ) && (i == 0 || i == h -1)) {  
                  System.out.printf(" ");  
              }else if(j == 0) {  
                  System.out.printf("*");  
              }else if(i == 0 && j <= h) {  
                  System.out.printf("*");  
              }else if(i == h / 2 && j > h / 2) {  
                  System.out.printf("*");  
              }else if(i > h / 2 && j == w - 1) {  
                  System.out.printf("*");  
              }else if(i == h - 1 && j < w) {  
                  System.out.printf("*");  
              }else {  
                  System.out.printf(" ");  
              }  
          }  
          System.out.printf("\n");  
      }  
  }  
  //  pattern of 'H'  
  public static void drawPatternH(int h){  
      for(int i = 0; i < h; i++) {  
          System.out.printf("*");  
          for(int j = 0; j < h; j++) {  
              if((j == h - 1) || (i == h / 2)) {  
                  System.out.printf("*");  
              }else {  
                  System.out.printf(" ");  
              }  
          }  
          System.out.printf("\n");  
      }  
  }  
  //  pattern of 'I'  
  public static void drawPatternI(int h){  
        
      for(int i = 0; i < h; i++) {  
          for(int j = 0; j < h; j++) {  
              if((i == h - 1) || (i == 0)) {  
                  System.out.printf("*");  
              }else if(j == h / 2){  
                  System.out.printf("*");  
              }else {  
                  System.out.printf(" ");  
              }  
          }  
          System.out.printf("\n");  
      }  
  }  
  //  pattern of 'J'  
  public static void drawPatternJ(int h){  
        
      for(int i = 0; i < h; i++) {  
          for(int j = 0; j < h; j++) {  
              if((i == h - 1) && (j > 0 && j < h - 1)) {  
                  System.out.printf("*");  
              }else if((j == h - 1 && i != h - 1) || (i > (h / 2) - 1 && j == 0 && i != h - 1 )){  
                  System.out.printf("*");  
              }else {  
                  System.out.printf(" ");  
              }  
          }  
          System.out.printf("\n");  
      }  
  }  
  //  pattern of 'K'  
  public static void drawPatternK(int h){  
      int mid = h / 2;  
      int temp = mid;  
        
      for(int i = 0; i < h; i++) {  
          System.out.printf("*");  
          for(int j = 0; j <= mid; j++) {  
              if(j == absValue(temp)) {  
                  System.out.printf("*");  
              }else {  
                  System.out.printf(" ");  
              }  
          }  
          System.out.printf("\n");  
          temp = temp - 1;  
      }  
  }  
  //  pattern of 'L'  
  public static void drawPatternL(int h){  
      for(int i = 0; i < h; i++) {  
          System.out.printf("*");  
          for(int j = 0; j <= h; j++) {  
              if(i == h - 1) {  
                  System.out.printf("*");  
              }else {  
                  System.out.printf(" ");  
              }  
          }  
          System.out.printf("\n");  
      }  
  }  
  //  pattern of 'M'  
  public static void drawPatternM(int h){  
      int count = 0;  
      for(int i = 0; i < h; i++) {  
          System.out.printf("*");  
          for(int j = 0; j <= h; j++) {  
              if(j == h) {  
                  System.out.printf("*");  
              }else if(j == count || j == (h - count - 1)){  
                  System.out.printf("*");  
              }else {  
                  System.out.printf(" ");  
              }  
          }  
          if(count == h / 2) {  
              count = -99999;  
          }else {  
              count = count + 1;  
          }  
          System.out.printf("\n");  
      }  
  }  
  //  pattern of 'N'  
  public static void drawPatternN(int h){  
      int count = 0;  
      for(int i = 0; i < h; i++) {  
          System.out.printf("*");  
          for(int j = 0; j <= h; j++) {  
              if(j == h) {  
                  System.out.printf("*");  
              }else if(j == count){  
                  System.out.printf("*");  
              }else {  
                  System.out.printf(" ");  
              }  
          }  
          count = count + 1;  
          System.out.printf("\n");  
      }  
  }  
  //  pattern of 'O'  
  public static void drawPatternO(int h){  
        
      int spc = h / 3;  
      int w = h / 2 + h / 5 + spc + spc;  
      for(int i = 0; i < h; i++) {  
          for(int j = 0; j <= w; j++) {  
              if(j == (w - absValue(spc)) || j == absValue(spc)) {  
                  System.out.printf("*");  
              }else if((i == 0 || i == (h - 1)) && j > absValue(spc) && j < (w - absValue(spc))){  
                  System.out.printf("*");  
              }else {  
                  System.out.printf(" ");  
              }  
          }  
          if(spc != 0 && i < h / 2) {  
              spc = spc - 1;  
          }else if(i >= (h / 2 + h / 5)) {  
              spc = spc - 1;  
          }  
          System.out.printf("\n");  
      }  
  }  
  //  pattern of 'P'  
  public static void drawPatternP(int h){  
        
      for(int i = 0; i < h; i++) {  
          System.out.printf("*");  
          for(int j = 0; j <= h; j++) {  
              if((i == 0 || i == h / 2) && j < h - 1) {  
                  System.out.printf("*");  
              }else if(i < h / 2 && j == h - 1 && i != 0){  
                  System.out.printf("*");  
              }else {  
                  System.out.printf(" ");  
              }  
          }  
          System.out.printf("\n");  
      }  
  }     
  //  pattern of 'Q'  
  public static void drawPatternQ(int h){  
        
      int temp = h;  
        
      // call drawPatternO() method to print pattern of 'O'  
      drawPatternO(h);  
      for(int i = 0; i < h / 2; i++) {  
          for(int j = 0; j <= temp; j++) {  
              if(j == temp) {  
                  System.out.printf("*");  
              }else {  
                  System.out.printf(" ");  
              }  
          }  
          System.out.printf("\n");  
          temp = temp + 1;  
      }  
  }  
  // pattern of 'R'  
  public static void drawPatternR(int h, int w){  
        
      int mid = h / 2;  
        
      for(int i = 0; i < h; i++) {  
          System.out.printf("*");  
          for(int j = 0; j < w; j++) {  
              if((i == 0 || i == mid) && j < (w - 2)) {  
                  System.out.printf("*");  
              }else if(j == (w - 2) && !(i == 0 || i == mid)){  
                  System.out.printf("*");  
              }else {  
                  System.out.printf(" ");  
              }  
          }  
          System.out.printf("\n");  
      }  
  }  
  // pattern of 'S'  
  public static void drawPatternS(int h){  
        
      for(int i = 0; i < h; i++) {  
          for(int j = 0; j < h; j++) {  
              if((i == 0 || i == h / 2 || i == h - 1)) {  
                  System.out.printf("*");  
              }else if(i < h / 2 && j == 0){  
                  System.out.printf("*");  
              }else if(i > h / 2 && j == h - 1){  
                  System.out.printf("*");  
              }else {  
                  System.out.printf(" ");  
              }  
          }  
          System.out.printf("\n");  
      }  
  }  
  //  pattern of 'T'  
  public static void drawPatternT(int h){  
        
      for(int i = 0; i < h; i++) {  
          for(int j = 0; j < h; j++) {  
              if(i == 0) {  
                  System.out.printf("*");  
              }else if(j == h / 2){  
                  System.out.printf("*");  
              }else {  
                  System.out.printf(" ");  
              }  
          }  
          System.out.printf("\n");  
      }  
  }  
  //  pattern of 'U'  
  public static void drawPatternU(int h){  
        
      for(int i = 0; i < h; i++) {  
          if(i != 0 && i != h - 1) {  
              System.out.printf("*");  
          }else {  
              System.out.printf(" ");  
          }  
          for(int j = 0; j < h; j++) {  
              if(((i == h - 1) && j >= 0 && j < h - 1)) {  
                  System.out.printf("*");  
              }else if(j == h - 1 && i != 0 && i != h - 1){  
                  System.out.printf("*");  
              }else {  
                  System.out.printf(" ");  
              }  
          }  
          System.out.printf("\n");  
      }  
  }  
  // pattern of 'V'  
  public static void drawPatternV(int h, int w){  
        
      int count = 0;  
        
      for(int i = 0; i < h; i++) {  
          for(int j = 0; j <= w; j++) {  
              if(j == count || j == (w - count - 1)) {  
                  System.out.printf("*");  
              }else {  
                  System.out.printf(" ");  
              }  
          }  
          count = count + 1;  
          System.out.printf("\n");  
      }  
  }  
  //  pattern of 'W'  
  public static void drawPatternW(int h){  
        
      int count = h / 2;  
        
      for(int i = 0; i < h; i++) {  
          System.out.printf("*");  
          for(int j = 0; j <= h; j++) {  
              if(j == h) {  
                  System.out.printf("*");  
              }else if((i >= h / 2) && (j == count || j == h - count - 1)){  
                  System.out.printf("*");  
              }else {  
                  System.out.printf(" ");  
              }  
          }  
          if(i >= h / 2) {  
              count = count + 1;  
          }  
          System.out.printf("\n");  
      }  
  }  
  // pattern of 'X'  
  public static void drawPatternX(int h){  
        
      int count = 0;  
        
      for(int i = 0; i <= h; i++) {  
          for(int j = 0; j <= h; j++) {  
              if(j == count || j == h - count) {  
                  System.out.printf("*");  
              }else {  
                  System.out.printf(" ");  
              }  
          }  
          count = count + 1;  
          System.out.printf("\n");  
      }  
  }  
  //  pattern of 'Y'  
  public static void drawPatternY(int h){  
        
      int count = 0;  
        
      for(int i = 0; i <= h; i++) {  
          for(int j = 0; j < h; j++) {  
              if(j == count || j == h - count && i <= h / 2) {  
                  System.out.printf("*");  
              }else {  
                  System.out.printf(" ");  
              }  
          }  
          if(i < h / 2) {  
              count = count + 1;  
          }  
          System.out.printf("\n");  
      }  
  }  
  // pattern of 'Z'  
  public static void drawPatternZ(int h){  
        
      int count = h - 1;  
        
      for(int i = 0; i < h; i++) {  
          for(int j = 0; j < h; j++) {  
              if(i == 0 || i == h - 1 || j == count) {  
                  System.out.printf("*");  
              }else {  
                  System.out.printf(" ");  
              }  
          }  
          count = count - 1;  
          System.out.printf("\n");  
      }  
  }  
 
  
  public static void main(String args[]){   
    
      char c;   
    
      int n;   
      Scanner sc = new Scanner(System.in);  
    
      System.out.println("Enter height of the pattern:");  
      n = sc.nextInt();  
        
      System.out.println("Enter character from A-Z to print:");  
      c = sc.next().charAt(0);  
      
    
      switch (c) {  
          case 'A':  
              drawPatternA(n, (2 * n) - 1);   
              break;  
          case 'B':  
              drawPatternB(n, (2 * n) - 1);   
              break;  
          case 'C':  
              drawPatternC(n);  
              break;  
          case 'D':  
              drawPatternD(n);  
              break;  
          case 'E':  
              drawPatternE(n);  
              break;  
          case 'F':  
              drawPatternF(n);  
              break;  
          case 'G':  
              drawPatternG(n, (2 * n) - 1);   
              break;  
          case 'H':  
              drawPatternF(n);  
              break;  
          case 'I':  
              drawPatternF(n);  
              break;  
          case 'J':  
              drawPatternF(n);  
              break;  
          case 'K':  
              drawPatternF(n);  
              break;  
          case 'L':  
              drawPatternF(n);  
              break;  
          case 'M':  
              drawPatternF(n);  
              break;  
          case 'N':  
              drawPatternF(n);  
              break;  
          case 'O':  
              drawPatternF(n);  
              break;  
          case 'P':  
              drawPatternF(n);  
              break;  
          case 'Q':  
              drawPatternF(n);  
              break;  
          case 'R':  
              drawPatternR(n, (2 * n) - 1);   
              break;  
          case 'S':  
              drawPatternF(n);  
              break;  
          case 'T':  
              drawPatternF(n);  
              break;  
          case 'U':  
              drawPatternF(n);  
              break;  
          case 'V':  
              drawPatternV(n, (2 * n) - 1);   
              break;  
          case 'W':  
              drawPatternF(n);  
              break;  
          case 'X':  
              drawPatternF(n);  
              break;  
          case 'Y':  
              drawPatternF(n);  
              break;  
          case 'Z':  
              drawPatternF(n);  
              break;  
      }  
  }  
}  