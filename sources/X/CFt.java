package X;

import android.os.HandlerThread;

public abstract class CFt {
    public static final HandlerThread A00;

    static {
        HandlerThread handlerThread = new HandlerThread("Bloks_ACQ_ResponseThread", -4);
        handlerThread.start();
        A00 = handlerThread;
    }
}
