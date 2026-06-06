class Stopwatch{
    private long startTime;
    private long elapsedTime;
    private boolean isRunning;
    public Stopwatch(){
        startTime = 0;
        elapsedTime = 0;
        isRunning = false;
    }
    public void start(){
        if(!isRunning){
            startTime = System.currentTimeMillis();
            isRunning = true;
            System.out.println("Stopwatch Started...");
        }
    }
    public void stop(){
        if(isRunning){
            elapsedTime = elapsedTime + (System.currentTimeMillis() - startTime);
            isRunning = false;
            System.out.println("Stopwatch Stopped...");
        }
    }
    public void reset(){
        startTime = 0;
        elapsedTime = 0;
        isRunning = false;
        System.out.println("Stopwatch Reset.");
    }
    public long getElapsedTime(){
        if(isRunning){
            return elapsedTime + (System.currentTimeMillis() - startTime);
        }
        return elapsedTime;
    }
}
public class updated{
    public static void main(String[] args){
        Stopwatch sw = new Stopwatch();
        sw.start();
        try{
            Thread.sleep(2500); 
        }
        catch(InterruptedException e){
        }
        sw.stop();
        System.out.println("Elapsed Time: "+ sw.getElapsedTime() + " ms");
        System.out.println("\nResuming Stopwatch...");
        sw.start();
        try{
            Thread.sleep(1500);
        }
        catch(InterruptedException e){
        }
        sw.stop();
        System.out.println("Elapsed Tiime: " + sw.getElapsedTime()+ " ms");
        sw.reset();
        System.out.println("Elapsed Time: "+ sw.getElapsedTime() + " ms");
    }
}