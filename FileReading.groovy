import java.io.File
class Example {
    static void main(String[] args) {
        new File("Hello.txt").eachLine {
            line -> println "line : $line";
        }
    }
}