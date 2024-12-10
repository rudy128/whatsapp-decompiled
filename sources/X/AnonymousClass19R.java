package X;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.19R  reason: invalid class name */
public class AnonymousClass19R {
    public static final AtomicInteger A09 = new AtomicInteger(0);
    public final AnonymousClass19I A00;
    public final AnonymousClass19O A01;
    public final AnonymousClass19Q A02;
    public final AnonymousClass10I A03;
    public final AnonymousClass00H A04;
    public final ConcurrentHashMap A05;
    public final AnonymousClass19A A06;
    public final AnonymousClass19S A07;
    public final ArrayBlockingQueue A08;

    public static void A00(AnonymousClass19R r3, int i) {
        ConcurrentHashMap concurrentHashMap = r3.A05;
        Integer valueOf = Integer.valueOf(i);
        AtomicInteger atomicInteger = (AtomicInteger) concurrentHashMap.get(valueOf);
        if (atomicInteger == null) {
            atomicInteger = new AtomicInteger(0);
            AtomicInteger atomicInteger2 = (AtomicInteger) concurrentHashMap.putIfAbsent(valueOf, atomicInteger);
            if (atomicInteger2 != null) {
                atomicInteger = atomicInteger2;
            }
        }
        atomicInteger.incrementAndGet();
    }

    public static void A01(AnonymousClass19R r7, C223419n r8, int i) {
        C223319m r6 = r8.A04;
        if (r6 != C223319m.A02) {
            for (C222319c r1 : r6.A00) {
                if (i != 1) {
                    r1.Bsc(r8);
                } else {
                    r1.C6D(r8);
                }
            }
            for (C222319c r2 : r6.A01) {
                if (r7.A08.offer(new C223519o(r2, r8, i))) {
                    A00(r7, r8.A01);
                } else {
                    r7.A06.BCt();
                }
            }
            r7.A03.CGL(r7.A07, "qpl_bg_listeners");
        }
    }

    public AnonymousClass19R(AnonymousClass19I r4, AnonymousClass19A r5, AnonymousClass19O r6, AnonymousClass19Q r7, AnonymousClass10I r8, AnonymousClass00H r9) {
        this.A04 = r9;
        this.A03 = r8;
        this.A06 = r5;
        this.A00 = r4;
        this.A01 = r6;
        this.A02 = r7;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(100);
        this.A08 = arrayBlockingQueue;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.A05 = concurrentHashMap;
        this.A07 = new AnonymousClass19S(r5, r9, arrayBlockingQueue, concurrentHashMap);
    }
}
