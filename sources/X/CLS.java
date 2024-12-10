package X;

public class CLS {
    public final CWF A00;

    public CLS() {
        CWF cwf = new CWF();
        C199610h.A08(!cwf.A01, "This stopwatch is already running.");
        cwf.A01 = true;
        cwf.A00 = System.nanoTime();
        this.A00 = cwf;
    }
}
