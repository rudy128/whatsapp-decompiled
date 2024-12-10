package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.CyX  reason: case insensitive filesystem */
public final class C26371CyX implements Handler.Callback {
    public boolean A00 = false;
    public final Handler A01;
    public final E5I A02;
    public final Object A03 = C17880vN.A0p();
    public final ArrayList A04 = AnonymousClass000.A13();
    public final ArrayList A05 = AnonymousClass000.A13();
    public final ArrayList A06 = AnonymousClass000.A13();
    public final AtomicInteger A07 = new AtomicInteger(0);
    public volatile boolean A08 = false;

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            C28566E7w e7w = (C28566E7w) message.obj;
            synchronized (this.A03) {
                if (this.A08 && this.A02.isConnected() && this.A05.contains(e7w)) {
                    e7w.onConnected((Bundle) null);
                }
            }
            return true;
        }
        Log.wtf("GmsClientEvents", AnonymousClass001.A1I("Don't know how to handle message: ", AnonymousClass000.A10(), i), new Exception());
        return false;
    }

    public C26371CyX(Looper looper, E5I e5i) {
        this.A02 = e5i;
        this.A01 = new BG6(looper, this);
    }
}
