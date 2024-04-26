package Recursion;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        //System.out.println(step(3,3));
        //path("",3,3);
      //  System.out.println(pathRet("",3,3));
       // System.out.println(pathDiagonalRet("",3,3));
        Boolean [][]maze={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
      // pathRestrictioncount("",maze,0,0);
       // System.out.println(pathRestriction("",maze,0,0));
        System.out.println(includeallPath("",maze,0,0));
    }
    static int step(int r, int c){
        if(r==1||c==1){
            return 1;
        }
        int left=step(r-1,c);
        int right=step(r,c-1);
        return left+right;
    }
    static ArrayList<String> pathRet(String p,int r,int c){


        if(r==1&&c==1){
            ArrayList<String> list=new ArrayList<>();


            list.add(p);
            return list;
        }
        ArrayList<String> as=new ArrayList<>();
        if(r>1){
           as.addAll(pathRet(p+'D',r-1,c));
        }
        if(c>1){
          as.addAll(pathRet(p+'R',r,c-1));
        }
        return as;
    }
    static void path(String p,int r ,int c){
        if(r==1&&c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            path(p+'D',r-1,c);
        }
        if(c>1){
            path(p+'R',r,c-1);
        }

    }
    static ArrayList<String> pathDiagonalRet(String p,int r,int c){


        if(r==1&&c==1){
            ArrayList<String> list=new ArrayList<>();


            list.add(p);
            return list;
        }
        ArrayList<String> as=new ArrayList<>();
        if(r>1){
            as.addAll(pathDiagonalRet(p+'V',r-1,c));
        }
        if(c>1){
            as.addAll(pathDiagonalRet(p+'H',r,c-1));
        }
        if(r>1&&c>1){
            as.addAll(pathDiagonalRet(p+'D',r-1,c-1));
        }
        return as;
    }

    //Maze with obstacle let mid index is block
    static ArrayList<String> pathRestriction(String p,Boolean[][]maze,int r,int c){


        if(r==maze.length-1&&c==maze[0].length-1){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> as=new ArrayList<>();
        if(maze[r][c]) {

            if (r < maze.length - 1) {
                as.addAll(pathRestriction(p + 'V', maze, r + 1, c));
            }
            if (c < maze[0].length - 1) {
                as.addAll(pathRestriction(p + 'H', maze, r, c + 1));
            }
        }

        return as;
    }

    static void pathRestrictioncount(String p,Boolean[][]maze,int r,int c){


        if(r==maze.length-1&&c==maze[0].length-1){
            System.out.println(p);
            return ;
        }


        if(!maze[r][c]) {
            return ;
        }
        if (r < maze.length - 1) {
            pathRestrictioncount(p + 'V', maze, r + 1, c);
        }
        if (c < maze[0].length-1) {
        pathRestrictioncount(p + 'H', maze, r, c + 1);
        }


        return ;
    }
    // what if it include all path
    //backtracking
    static ArrayList<String> includeallPath(String p,Boolean[][]maze,int r,int c){


        if(r==maze.length-1&&c==maze[0].length-1){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> as=new ArrayList<>();
        if(maze[r][c]) {
            maze[r][c] = false;


            if (r < maze.length - 1) {
                as.addAll(includeallPath(p + 'D', maze, r + 1, c));
            }
            if (c < maze[0].length - 1) {
                as.addAll(includeallPath(p + 'R', maze, r, c + 1));
            }
            if (c > 0) {
                as.addAll(includeallPath(p + 'L', maze, r, c - 1));
            }
            if (r > 0) {
                as.addAll(includeallPath(p + 'U', maze, r - 1, c));
            }


        maze[r][c]=true;}
        return as;
    }
    //structued format

}
