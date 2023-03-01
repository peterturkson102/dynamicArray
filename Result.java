public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
    // Write your code here
          ArrayList<Integer> results = new ArrayList<Integer>();
        ArrayList<Integer>[] arr = new ArrayList[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = new ArrayList<Integer>();
        }
        int lastAnswer = 0;
        for(int i = 0; i < queries.size(); i++)
        {
            int x = queries.get(i).get(1);
            int y = queries.get(i).get(2);
            int idx = (x^lastAnswer) % n;
            if(queries.get(i).get(0) == 1)
            {
                arr[idx].add(y);
            }
            else
            {
                int size = arr[idx].size();
                lastAnswer = arr[idx].get(y % size);
                results.add(lastAnswer);
            }
        }
        
        return results;
    }
}
