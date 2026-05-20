class Stopwatch{
    private int seconds;
    private boolean isRunning;
    Stopwatch(){
        seconds = 0;
        isRunning = false;
    }
    void start(){
        if(!isRunning){
            isRunning = true;
            System.out.println("Stopwatch Started...");
        }
        else{
            System.out.println("Stopwatch is already running.");
        }
    }
    void stop(){
        if(isRunning){
            isRunning = false;
            System.out.println("Stopwatch Stopped...");
        }
        else{
            System.out.println("Stopwatch is not running.");
        }
    }
    void tick(){
        if (isRunning){
            seconds++;
        }
    }
    void reset(){
        seconds = 0;
        isRunning = false;
        System.out.println("Stopwatch Reset.");
    }
    int getElapsedTime(){
        return seconds;
    }
}
public class report{
    public static void main(String[] args){
        Stopwatch sw = new Stopwatch();
        sw.start();
        for (int i = 1; i <= 5; i++){
            sw.tick();
        }
        sw.stop();
        System.out.println("Elapsed Time: " + sw.getElapsedTime() + " seconds");
        System.out.println("\nResuming Stopwatch...");
        sw.start();
        for(int i = 1; i <= 3; i++){ 
            sw.tick();
        }
        sw.stop();
        System.out.println("Elapsed Time: " + sw.getElapsedTime() + " seconds");
        sw.reset();
        System.out.println("Elapsed Time: " + sw.getElapsedTime() + " seconds");
    }
}