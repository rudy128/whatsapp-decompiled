package X;

import android.os.Process;

/* renamed from: X.DaI  reason: case insensitive filesystem */
public final class C27238DaI extends Thread {
    public final /* synthetic */ C24848CMr A00;

    public C27238DaI(C24848CMr cMr) {
        this.A00 = cMr;
    }

    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                ((C27087DTm) this.A00.A00.take()).run();
            } catch (InterruptedException unused) {
            }
        }
    }
}
