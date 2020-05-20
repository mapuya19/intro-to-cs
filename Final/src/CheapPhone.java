public class CheapPhone {
    private double pFail;

    public static void main(String[] args) {
        CheapPhone phone = new CheapPhone(0.8);

        boolean notSuccess = true;
        while(notSuccess)
            try {
                phone.call();
                break;
            } catch(CallFailureException e) {
                System.out.println("Call failed, trying again...");
            }
     }

    public CheapPhone(double pFail) {
        this.pFail = pFail;
    }

    public void call() throws CallFailureException {
        double threshold = Math.random() * 1;
        System.out.println(threshold);
        if (threshold > pFail)
            System.out.println("Success!");
        else
            throw new CallFailureException("Call not successful!");
    }
}
