import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class lab11 {
    public static void main(String args[])throws Exception {
        int s1 =0;
        int s2 =0;
        Scanner sc = new Scanner(System.in);
        int gen = sc.nextInt();
        sc.nextLine();
        String[]array = new String[20];
        String boardOne[][] = new String[20][20];
        String boardTwo[][] = new String[20][20];

        for(int i =0; i< array.length;i++){
            array[i]=sc.nextLine();
            for(int j =0; j < array[i].length();j++){
                if(array[i].charAt(j)=='1')
                boardOne[i][j]="1";
                else{
                boardOne[i][j]="0";
                }
            } 
        }
        for(int i =0; i< gen;i++ ){
        for(int j =0; j < boardOne.length;j++){
            for(int k = 0; k < boardOne[j].length;k++){
                 s1= liveCell(j,k,boardOne);
                if(s1< 2 && boardOne[j][k].equals("1")){
                	boardTwo[j][k]= "0";
                }else if((s1==2||s1==3)&& boardOne[j][k].equals("1")){
                	boardTwo[j][k]= "1";
                }else if(s1 > 3 && boardOne[j][k].equals("1")){
                	boardTwo[j][k]= "0";
                }else if(s1 == 3 && boardOne[j][k].equals("0")){
                	boardTwo[j][k]= "1";
                }else{
                	boardTwo[j][k]= "0";
                }
            }
        }
    nextGeneration(boardOne,boardTwo);
    }
    for(int i =0; i < boardTwo.length;i++){
        for(int j =0; j < boardTwo[i].length;j++){
            if(boardTwo[i][j].equals("1")){
                s2++;
            }
        }
    }
    System.out.println(s2);
    }

        



    public static int liveCell(int row,int col,String[][]board){
        int n =0;
        for(int i = row-1; i <= row+1;i++)
            if(i>= 0 && i< board.length)
            for(int j = col-1;j <= col+1; j++)
            if(j>=0 && j < board[i].length)
            if(i!=row||j!=col)
            if(board[i][j].equals("1"))
            n++;
        return n;
    }
    public static void nextGeneration(String[][]board,String[][]nBoard){
        for(int i =0; i < board.length;i++){
            for(int j =0; j < board[i].length;j++){
                board[i][j]=nBoard[i][j];
            }
        }
    }
}
