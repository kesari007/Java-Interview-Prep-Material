package patterns.dsa;

/*
 * Click `Run` to execute the snippet below!
 */

import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 *
2 1 1 0
1 1 0 0
0 1 1 0
0 0 0 0
 Min 0
[[2,1,1],
[1,1,0],
[0,1,1] ]

Min 1
[[2,2,1],
[2,1,0],
[0,1,1] ]

Min 2
[[2,2,2],
[2,2,0],
[0,1,1] ]

Min 3
[[2,2,2],
[2,2,0],
[0,2,1] ]

Min 4
[[2,2,2],
[2,2,0],
[0,2,2] ]

 * If you need more classes, simply define them inline.
 */

class Triplet {
    int first ;
    int second ;
    int third ;
    Triplet(int first, int second, int third){
        this.first = first ;
        this.second = second ;
        this.third = third; // distance
    }
}
class Solution {
    public static int[][] directions = {{0,1}, {0,-1}, {-1,0}, {1,0}};
    public static void bfs(int[][] matrix, Queue<Triplet> q , int[] ans){

        while(!q.isEmpty()){
            int first = q.peek().first;
            int second = q.peek().second;
            int minutes = q.peek().third;
            q.remove();


            for(int[] dir : directions){
                int row = first + dir[0];
                int col = second + dir[1];
                if(row >=0 && row < matrix.length && col >=0 && col < matrix[0].length && matrix[row][col] == 1){
                    matrix[row][col] = 2 ;
                    ans[0] = minutes + 1 ;
                    q.add(new Triplet(row, col, ans[0]));
                }
            }

        }

    }
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("Hello, World!");
        strings.add("Welcome to CoderPad.");
        //strings.add("This pad is running Java " + Runtime.version().feature());
        int[][] matrix = new int[4][4];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.println("Enter the number at " + i + " " + j);
                matrix[i][j]  = sc.nextInt();
            }
        }

        int row = matrix.length ;
        int col = matrix[0].length;

        Queue<Triplet> q = new LinkedList<>();
        int[] ans = new int[1];

        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(matrix[i][j] == 2){
                    q.add(new Triplet(i, j, 0));
                }
            }
        }

        bfs(matrix, q, ans);
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(matrix[i][j] == 1){
                    System.out.print("Ans = -1");
                }
            }
        }
        System.out.print("Minutes taken = " + ans[0]);


        for (String string : strings) {
            System.out.println(string);
        }
    }
}

