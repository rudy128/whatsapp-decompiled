package X;

import android.os.HandlerThread;
import android.os.Looper;

/* renamed from: X.1Nc  reason: invalid class name and case insensitive filesystem */
public class C25151Nc {
    public HandlerThread A00;

    public synchronized Looper A00() {
        if (this.A00 == null) {
            HandlerThread handlerThread = new HandlerThread("wa-shared-handler", 10);
            this.A00 = handlerThread;
            handlerThread.start();
        }
        return this.A00.getLooper();
    }
}
