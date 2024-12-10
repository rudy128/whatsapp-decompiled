package X;

import android.os.Process;

/* renamed from: X.DaE  reason: case insensitive filesystem */
public class C27234DaE extends Thread {
    public void run() {
        int myTid = Process.myTid();
        C25567Ci5 ci5 = C25567Ci5.A03;
        Integer valueOf = Integer.valueOf(myTid);
        synchronized (ci5) {
            if (valueOf != null) {
                ci5.A01.add(valueOf);
            }
        }
        super.run();
        synchronized (ci5) {
            if (valueOf != null) {
                ci5.A01.remove(valueOf);
                ci5.A00.remove(valueOf);
            }
        }
    }
}
