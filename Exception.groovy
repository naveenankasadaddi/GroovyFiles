try{
    def num=1/0;

}
catch (java.lang.Exception e){
    println e.getMessage();
    println e.getCause();
}

finally {
    println 'Stupid';
}