package X;

import android.util.Pair;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.19n  reason: invalid class name and case insensitive filesystem */
public class C223419n {
    public static final AtomicInteger A0I = new AtomicInteger(0);
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final C223319m A04;
    public final Integer A05;
    public final ConcurrentHashMap A06 = new ConcurrentHashMap();
    public final ConcurrentHashMap A07 = new ConcurrentHashMap();
    public final ConcurrentHashMap A08 = new ConcurrentHashMap();
    public final ConcurrentHashMap A09 = new ConcurrentHashMap();
    public final AtomicInteger A0A = new AtomicInteger(-1);
    public final AtomicLong A0B = new AtomicLong(-1);
    public final boolean A0C;
    public final boolean A0D;
    public final AnonymousClass19A A0E;
    public final AnonymousClass19R A0F;
    public final AtomicInteger A0G = new AtomicInteger(0);
    public final AtomicInteger A0H = new AtomicInteger(0);

    public void A01(long j, String str, String str2) {
        AtomicInteger atomicInteger = this.A0H;
        if (atomicInteger.get() >= 1000) {
            this.A0E.BjH(this.A00);
        } else if (str.length() > 50) {
            this.A0E.CBm(this.A00, str);
        } else if (str2 == null || str2.length() <= 1000) {
            int andIncrement = atomicInteger.getAndIncrement();
            this.A09.put(Integer.valueOf(andIncrement), new C223719q(j, str, str2));
        } else {
            this.A0E.CBl(this.A00, str2);
        }
    }

    public void A02(long j, short s) {
        if (this.A0B.compareAndSet(-1, j)) {
            this.A0A.set(s);
            AnonymousClass19R.A01(this.A0F, this, 2);
        }
    }

    public void A03(Serializable serializable, String str, String str2) {
        Pair pair = new Pair(str, str2);
        ConcurrentHashMap concurrentHashMap = this.A08;
        if (serializable == null) {
            concurrentHashMap.remove(pair);
        } else {
            concurrentHashMap.put(pair, serializable);
        }
    }

    public boolean A05(String str) {
        AtomicInteger atomicInteger = this.A0H;
        int i = atomicInteger.get() - 1;
        while (i >= 0) {
            ConcurrentHashMap concurrentHashMap = this.A09;
            C223719q r1 = (C223719q) concurrentHashMap.get(Integer.valueOf(i));
            if (r1 == null || !r1.A02.equals(str)) {
                i--;
            } else {
                long j = r1.A00;
                this.A0B.set(j);
                for (int i2 = atomicInteger.get() - 1; i2 >= 0; i2--) {
                    C223719q r0 = (C223719q) concurrentHashMap.get(Integer.valueOf(i2));
                    if (r0 != null && r0.A00 > j) {
                        concurrentHashMap.remove(Integer.valueOf(i2));
                    }
                }
                return true;
            }
        }
        return false;
    }

    public C223419n(AnonymousClass19A r4, C223319m r5, AnonymousClass19R r6, Integer num, int i, long j, long j2, boolean z, boolean z2) {
        this.A0E = r4;
        this.A0F = r6;
        this.A00 = i;
        this.A04 = r5;
        this.A05 = num;
        this.A03 = j2;
        this.A02 = j;
        this.A0D = z;
        this.A01 = A0I.incrementAndGet();
        this.A0C = z2;
    }

    public void A00(int i, String str, Object obj) {
        if (str.length() > 50) {
            this.A0E.BC7(this.A00, str);
            return;
        }
        AtomicInteger atomicInteger = this.A0G;
        if (atomicInteger.get() + i >= 1000) {
            this.A0E.BC9(this.A00, str, i);
            return;
        }
        atomicInteger.addAndGet(i);
        if (this.A06.putIfAbsent(str, obj) != null) {
            atomicInteger.addAndGet(-i);
        }
    }

    public void A04(String str, String str2) {
        A00(str2.length(), str, str2);
    }
}
