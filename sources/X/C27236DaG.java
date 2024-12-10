package X;

import android.os.Process;

/* renamed from: X.DaG  reason: case insensitive filesystem */
public class C27236DaG extends Thread {
    public final int A00 = 10;

    public C27236DaG(Runnable runnable) {
        super(runnable, "fonts-androidx");
    }

    public void run() {
        Process.setThreadPriority(this.A00);
        super.run();
    }
}
