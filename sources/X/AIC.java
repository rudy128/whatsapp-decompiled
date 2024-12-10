package X;

import android.os.Handler;
import android.os.SystemClock;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

public class AIC implements C71993Kd {
    public long A00;
    public final Handler A01;
    public final Runnable A02 = new C21466AkX((Object) this, 44);
    public final AtomicBoolean A03 = C108965cb.A0w();
    public final B4V[] A04;
    public final long A05 = 250;
    public final Runnable A06 = new C21466AkX((Object) this, 45);
    public final ConcurrentLinkedQueue A07 = new ConcurrentLinkedQueue();

    public AIC(B4V[] b4vArr) {
        long j = 250;
        this.A04 = b4vArr;
        C185279cK r0 = C185279cK.A02;
        if (r0 == null) {
            r0 = new C185279cK();
            C185279cK.A02 = r0;
        }
        this.A01 = new Handler(r0.A01.getLooper());
        this.A00 = !C30221da.A02.A00.get() ? 60000 : j;
        C30221da.A02.A00(this);
    }

    public static void A00(AIC aic) {
        AIC aic2 = aic;
        ConcurrentLinkedQueue concurrentLinkedQueue = aic2.A07;
        int size = concurrentLinkedQueue.size();
        if (size != 0) {
            while (true) {
                int i = size - 1;
                if (size > 0) {
                    AnonymousClass8Ka r10 = (AnonymousClass8Ka) concurrentLinkedQueue.poll();
                    if (r10 != null) {
                        if (r10.A06) {
                            for (B4V b4v : aic2.A04) {
                                AIF aif = (AIF) b4v;
                                synchronized (aif) {
                                    aif.A02 = r10;
                                }
                                LinkedList linkedList = aif.A08;
                                synchronized (linkedList) {
                                    r10.A00++;
                                    linkedList.addFirst(r10);
                                }
                            }
                            r10.A06 = false;
                        } else if (r10.A05) {
                            for (B4V b4v2 : aic2.A04) {
                                AIF aif2 = (AIF) b4v2;
                                synchronized (aif2) {
                                    aif2.A02 = null;
                                }
                                LinkedList linkedList2 = aif2.A08;
                                synchronized (linkedList2) {
                                    long j = aif2.A06;
                                    long j2 = r10.A04;
                                    if (j2 == -1 || j2 - r10.A02 <= j) {
                                        Class cls = aif2.A0B[0];
                                        if (cls == null || r10.A08 != cls || r10.A06 != null) {
                                            Class[] clsArr = aif2.A0A;
                                            int i2 = 0;
                                            while (true) {
                                                Class cls2 = clsArr[i2];
                                                if (cls2 != null && r10.A06 == cls2) {
                                                    break;
                                                }
                                                i2++;
                                                if (i2 >= 4) {
                                                    if (r10.A02 - aif2.A01 < 500) {
                                                        r10.A00();
                                                        linkedList2.removeFirst();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    aif2.A01 = j2;
                                    if (!linkedList2.isEmpty()) {
                                        long uptimeMillis = SystemClock.uptimeMillis() - aif2.A04;
                                        do {
                                            AnonymousClass8Ka r3 = (AnonymousClass8Ka) linkedList2.peekLast();
                                            if (r3 != null) {
                                                if (r3.A04 > uptimeMillis) {
                                                    break;
                                                }
                                                r3.A00();
                                            }
                                            linkedList2.removeLast();
                                        } while (!linkedList2.isEmpty());
                                    }
                                }
                            }
                            r10.A05 = false;
                        } else {
                            continue;
                        }
                    }
                    size = i;
                } else {
                    return;
                }
            }
            while (true) {
            }
        }
    }

    public void A01(AnonymousClass8Ka r3) {
        ConcurrentLinkedQueue concurrentLinkedQueue = this.A07;
        concurrentLinkedQueue.add(r3);
        if (concurrentLinkedQueue.size() >= 256) {
            AtomicBoolean atomicBoolean = this.A03;
            if (!atomicBoolean.get()) {
                atomicBoolean.set(true);
                this.A01.post(this.A06);
            }
        }
    }

    public void BKR(boolean z) {
        long j;
        if (z) {
            j = this.A05;
        } else {
            j = 60000;
        }
        this.A00 = j;
        Handler handler = this.A01;
        Runnable runnable = this.A02;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, this.A00);
    }
}
