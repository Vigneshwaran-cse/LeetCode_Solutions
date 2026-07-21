class MapSum {
    HashMap<String,Integer>hm;
    public MapSum() {
        hm=new HashMap<>();
    }
    
    public void insert(String key, int val) {
        hm.put(key,val);
    }
    
    public int sum(String prefix) {
        int a=0;
        for(String b:hm.keySet())
        {
            if(b.startsWith(prefix))
            {
                a+=hm.get(b);
            }
        }
        return a;
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */