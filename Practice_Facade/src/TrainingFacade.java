public class TrainingFacade {
    private WarmUp warmUp;
    private Workout workOut;
    private Recovery recovery;

    public TrainingFacade() {
        this.warmUp = new WarmUp();
        this.workOut = new Workout();
        this.recovery = new Recovery();
    }
    public void StartTraining() {
        System.out.println("Starting training");
        warmUp.stretch();
        workOut.BenchPress();
        recovery.Sleep();
    }

}