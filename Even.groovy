def userInput(){
    print("Enter the number :")
    def num= System.console().readLine().toInteger()

}
def checker(int num){
    if(num%2==0)
        println "Even";
    else
        println "Odd";
}

num=userInput();
checker(num);
