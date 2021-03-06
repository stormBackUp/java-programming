package com.tictactoe;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x=3;
        int y=3;
        boolean gameRunning=true;

        char[][] grid={{'.','.','.'},{'.','.','.'},{'.','.','.'}};
        print(grid,gameRunning);

    }
    public static void print(char[][] grid,boolean gameRunning){
        for(int i=0;i<3;i++){
            System.out.println(Arrays.deepToString(grid));
            while (gameRunning){
                int[] coords=move();
                int x=coords[0];
                int y=coords[1];
                moveCheck(x,y,grid,gameRunning);
            }


        }
    }
    public static void moveCheck(int x,int y,char[][] grid,boolean gameRunning){
        if(x!=3){
            if(y!=3){
                insertElm(x,y,grid);
                print(grid,gameRunning);
            }
        }
    }
    public static int[] move(){
        Scanner input=new Scanner(System.in);
        int[] coords=new int[2];
        System.out.print("x: ");
        coords[0]=input.nextInt();
        System.out.print("y: ");
        coords[1]=input.nextInt();
        return coords;
    }
    public static char[][] insertElm(int x,int y,char[][] grid){
        grid[x][y]='x';
        return grid;
    }
}
