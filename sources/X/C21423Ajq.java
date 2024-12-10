package X;

import android.os.Process;

/* renamed from: X.Ajq  reason: case insensitive filesystem */
public class C21423Ajq implements Runnable {
    public final int A00;

    public C21423Ajq(int i) {
        this.A00 = i;
    }

    public static void A00(Object[] objArr, int i, int i2) {
        objArr[i2] = new C21423Ajq(i);
    }

    public final void run() {
        if (26 - this.A00 == 0) {
            Process.killProcess(Process.myPid());
        }
    }
}
