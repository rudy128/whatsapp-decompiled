package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: X.CnB  reason: case insensitive filesystem */
public class C25850CnB {
    public static final UUID A06 = UUID.randomUUID();
    public Handler A00;
    public UUID A01;
    public final Handler A02;
    public final Handler A03;
    public final HandlerThread A04;
    public final HandlerThread A05;

    public synchronized C27338DcA A00(C6E c6e, String str, Callable callable) {
        C27338DcA dcA;
        UUID uuid = this.A01;
        C28111Yx.A02(uuid);
        dcA = new C27338DcA(this, str, uuid, callable);
        if (c6e != null) {
            dcA.A02(c6e);
        }
        this.A03.postAtTime(dcA, this.A01, SystemClock.uptimeMillis());
        return dcA;
    }

    public synchronized C27338DcA A02(String str, Callable callable, long j) {
        C27338DcA dcA;
        UUID uuid = this.A01;
        C28111Yx.A02(uuid);
        dcA = new C27338DcA(this, str, uuid, callable);
        this.A03.postAtTime(dcA, this.A01, SystemClock.uptimeMillis() + j);
        return dcA;
    }

    public Object A03(String str, Callable callable) {
        C27338DcA dcA;
        synchronized (this) {
            UUID uuid = this.A01;
            C28111Yx.A02(uuid);
            dcA = new C27338DcA(this, str, uuid, callable);
            this.A02.post(dcA);
        }
        return dcA.get();
    }

    public Object A04(String str, Callable callable) {
        C27338DcA dcA;
        synchronized (this) {
            UUID uuid = this.A01;
            C28111Yx.A02(uuid);
            dcA = new C27338DcA(this, str, uuid, callable);
            this.A02.post(dcA);
        }
        E7d e7d = (E7d) dcA.get();
        e7d.BDG();
        return e7d.BYK();
    }

    public synchronized void A05(Runnable runnable, UUID uuid) {
        UUID uuid2 = this.A01;
        if ((uuid2 != null && uuid2.equals(uuid)) || A06.equals(uuid)) {
            Handler handler = this.A00;
            if (handler != null) {
                handler.postAtTime(runnable, uuid, SystemClock.uptimeMillis());
            } else {
                long uptimeMillis = SystemClock.uptimeMillis();
                synchronized (C26078Crs.class) {
                    C26078Crs.A00.postAtTime(runnable, uuid, uptimeMillis);
                }
            }
        }
    }

    public synchronized void A07(String str, Callable callable) {
        A00((C6E) null, str, callable);
    }

    public synchronized void A08(FutureTask futureTask) {
        this.A03.removeCallbacks(futureTask);
    }

    public synchronized C27338DcA A01(C6E c6e, Callable callable) {
        C27338DcA dcA;
        UUID uuid = A06;
        dcA = new C27338DcA(this, "load_camera_infos", uuid, callable);
        dcA.A02(c6e);
        this.A03.postAtTime(dcA, uuid, SystemClock.uptimeMillis());
        return dcA;
    }

    public boolean A09() {
        return AnonymousClass000.A1Z(this.A03.getLooper().getThread(), Thread.currentThread());
    }

    public void finalize() {
        HandlerThread handlerThread = this.A04;
        handlerThread.quitSafely();
        try {
            handlerThread.join();
        } catch (InterruptedException unused) {
            AnonymousClass8BS.A0x();
        }
        HandlerThread handlerThread2 = this.A05;
        handlerThread2.quitSafely();
        try {
            handlerThread2.join();
        } catch (InterruptedException unused2) {
            AnonymousClass8BS.A0x();
        }
    }

    public C25850CnB() {
        HandlerThread handlerThread = new HandlerThread("Optic-Task-Handler-Thread");
        this.A05 = handlerThread;
        Looper A0G = BE7.A0G(handlerThread);
        C28111Yx.A02(A0G);
        this.A03 = new Handler(A0G);
        HandlerThread handlerThread2 = new HandlerThread("Optic-Camera-Handler-Thread");
        this.A04 = handlerThread2;
        Looper A0G2 = BE7.A0G(handlerThread2);
        C28111Yx.A02(A0G2);
        this.A02 = new Handler(A0G2);
    }

    public void A06(String str) {
        if (!A09()) {
            StringBuilder A11 = AnonymousClass000.A11(str);
            A11.append(" Current thread: ");
            throw BE9.A0n(Thread.currentThread().getName(), A11);
        }
    }
}
