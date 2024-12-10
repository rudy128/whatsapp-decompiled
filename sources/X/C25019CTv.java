package X;

import android.os.Handler;
import android.os.MessageQueue;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.CTv  reason: case insensitive filesystem */
public class C25019CTv {
    public MessageQueue.IdleHandler A00;
    public final Handler A01;
    public final Handler A02;
    public final C27066DRp A03;
    public final Map A04 = BE8.A0q();
    public final ConcurrentLinkedQueue A05 = new ConcurrentLinkedQueue();
    public final AtomicReference A06 = new AtomicReference();
    public final C25593CiY A07;
    public volatile boolean A08 = false;
    public volatile boolean A09 = true;

    public C25019CTv(Handler handler, Handler handler2, C27066DRp dRp, C25593CiY ciY) {
        this.A03 = dRp;
        this.A07 = ciY;
        this.A01 = handler;
        this.A02 = handler2;
        if (dRp.enableStopWarmupSchedulerEmpty) {
            this.A00 = new C26403Cz3(this, 0);
        }
    }
}
