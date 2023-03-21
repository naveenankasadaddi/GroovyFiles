class Demo {
    static void main(String[] args) {
        int currentline=1
        new File("/home/naveenmahantesh/groovy/untitled/src/Hello.txt").eachLine {
            line -> println "line : $currentline $line"
                currentline++
        }
    }
}