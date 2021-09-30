class solve 
{
    private static boolean isSafe(int node,List<Integer>[] G,int [] color,int n,int col){
        for(int it:G[node]){
            if(color[it]==col)
            return false;
        }
        return true;
    }
    private static boolean solve(int node,List<Integer>[]G,int [] color,int n,int C){
        if(node==n)
        return true;
        
        for(int i=1;i<=C;i++){
            if(isSafe(node,G,color,n,i)){
                color[node]=i;
                if(solve(node+1,G,color,n,C)==true)
                return true;
                color[node]=0;
            }
        }
        return false;
    }
    //Function to determine if graph can be coloured with at most M colours such
    //that no two adjacent vertices of graph are coloured with same colour.
    public static boolean graphColoring(List<Integer>[] G, int [] color, int i, int C) 
    {
        // Your code here
        int n = G.length;
        if(solve(0,G,color,n,C)==true)
        return true;
        return false;
    }
}