package X;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.DTd  reason: case insensitive filesystem */
public final class C27078DTd implements Runnable {
    public static C22612BFs A07;
    public static final Executor A08;
    public static final BlockingQueue A09;
    public static final ThreadFactory A0A;
    public static volatile Executor A0B;
    public final CountDownLatch A00;
    public final FutureTask A01;
    public final AtomicBoolean A02;
    public final AtomicBoolean A03;
    public final C27132DVt A04;
    public volatile Integer A05;
    public final /* synthetic */ C22702BLf A06;

    static {
        DWA dwa = new DWA();
        A0A = dwa;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        A09 = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1, TimeUnit.SECONDS, linkedBlockingQueue, dwa);
        A08 = threadPoolExecutor;
        A0B = threadPoolExecutor;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C27078DTd(C22702BLf bLf) {
        this();
        this.A06 = bLf;
        this.A00 = BE7.A0u();
    }

    public void A00(Object obj) {
        C22612BFs bFs;
        synchronized (C27078DTd.class) {
            bFs = A07;
            if (bFs == null) {
                bFs = new C22612BFs();
                A07 = bFs;
            }
        }
        BE7.A18(bFs, new CMQ(this, AnonymousClass000.A1b(obj, 1)), 1);
    }

    public void run() {
        this.A06.A08();
    }

    public C27078DTd() {
        this.A05 = AnonymousClass00R.A00;
        this.A02 = new AtomicBoolean();
        this.A03 = new AtomicBoolean();
        C27132DVt dVt = new C27132DVt((Object) this, 0);
        this.A04 = dVt;
        this.A01 = new C27337Dc9(this, dVt);
    }
}
