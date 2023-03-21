class Lists{
    static void main(String[] args){
        def li=[1,2,3,4,5,6,7,8,9,10]
        for(int i=0;i<li.size();i++){
            println(li[i])
        }
        println(li.contains(11))
    }
}