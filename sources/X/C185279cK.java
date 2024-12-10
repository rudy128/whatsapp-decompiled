package X;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: X.9cK  reason: invalid class name and case insensitive filesystem */
public final class C185279cK {
    public static C185279cK A02;
    public final Handler A00;
    public final HandlerThread A01;

    public C185279cK() {
        HandlerThread handlerThread = new HandlerThread("MQD_Bg_Executor", 10);
        this.A01 = handlerThread;
        handlerThread.start();
        this.A00 = new Handler(handlerThread.getLooper());
    }
}
