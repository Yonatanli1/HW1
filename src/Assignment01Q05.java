public class Assignment01Q05 {
    public static int[] BFS(int[][] G, int s){
        int n = G[0].length;
        int [] pi = new int[n];
        int [] color = new int[n];
        int [] q = new int[n];
        int [] d = new int[n]; 
        int head = 0; int tail = 0;
        for (int i = 0; i < n; i++){
            pi[i] = -1; d[i] = -1; color[i] = 0; // color = 0 means white, 1 means gray, 2 means black
        }
        pi[s] = s; d[s] = 0; color[s] = 1; q[0] = s; tail +=1;
        while (head < tail){
            int curr_vertice = q[head]; head +=1; 
            for (int i = 0; i < n; i++){
                if(G[curr_vertice][i] == 1 && color[i] == 0){
                    q[tail] = i; tail += 1;
                    pi[i] = curr_vertice;
                    d[i] = d[curr_vertice] + 1;
                    color[i] = 1;
                }
            }
        }
        return (d);    

    }
    public static int findShortestPath(int[][] m, int i, int j) {
        int[] d = BFS(m, i);
        return d[j];
    }

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}
