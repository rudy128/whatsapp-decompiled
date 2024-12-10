package X;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.RemoteException;
import android.util.LruCache;
import android.view.Surface;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.CwF  reason: case insensitive filesystem */
public class C26270CwF {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public Surface A04;
    public C25238CbZ A05;
    public C26204Cub A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public volatile Surface A0A;
    public final /* synthetic */ C26378Cye A0B;

    public static void A05(C26270CwF cwF) {
        cwF.A01 = 0;
        cwF.A00 = 0;
        cwF.A05 = null;
        C26378Cye cye = cwF.A0B;
        AtomicInteger atomicInteger = C26378Cye.A0T;
        cye.A0L = 1.0f;
        cwF.A02 = 0;
        cwF.A03 = 0;
        cye.A0P = 0;
        cye.A0R = false;
        cye.A0A = false;
        cye.A08.set(new D49());
        cye.A0J.set(D40.A0D);
        List list = cye.A0H;
        synchronized (list) {
            list.clear();
            cye.A00 = -1;
        }
        cwF.A09 = false;
    }

    public static void A06(C26270CwF cwF, C26378Cye cye, String str) {
        C26378Cye.A06(cye, str, new Object[0]);
        A03(cwF);
    }

    public C26270CwF(C26378Cye cye) {
        this.A0B = cye;
    }

    public static C26204Cub A00(C26270CwF cwF) {
        C26204Cub cub = cwF.A06;
        if (cub != null) {
            return cub;
        }
        throw new RemoteException("No service api available");
    }

    public static void A02(C26270CwF cwF) {
        String str;
        HandlerThread handlerThread;
        C26381Cyh A002;
        C26270CwF cwF2 = cwF;
        C26378Cye cye = cwF2.A0B;
        AtomicInteger atomicInteger = C26378Cye.A0T;
        C24859CNc cNc = cye.A03;
        C26204Cub cub = cNc.A00;
        if (cub == null) {
            cub = cNc.A01.A00;
            cNc.A00 = cub;
        }
        cwF2.A06 = cub;
        if (cwF2.A05 != null) {
            try {
                long j = cye.A0N;
                C25238CbZ cbZ = cwF2.A05;
                C28612EAg eAg = cye.A04;
                boolean z = cwF2.A09;
                CZ4 cz4 = cub.A0U;
                Context context = cub.A06;
                Handler A003 = C26204Cub.A00(cub);
                AtomicReference atomicReference = cub.A0J;
                C26029Cqn cqn = cub.A03;
                Map map = cub.A0F;
                AtomicBoolean atomicBoolean = cub.A0H;
                synchronized (cz4) {
                    if (cbZ == null) {
                        str = null;
                    } else {
                        str = cbZ.A0C.A0H;
                    }
                    Object[] A1b = AnonymousClass3MW.A1b();
                    AnonymousClass3MX.A1S(A1b, 0, j);
                    A1b[1] = str;
                    C25905CoJ.A02("id [%d]: verifyOrCreatePlayer, videoId: %s", A1b);
                    C26381Cyh A004 = cz4.A00(j);
                    if (j <= 0 || A004 == null || (A002 = cz4.A00(j)) == null || A002.A12 == null) {
                        if (j > 0) {
                            cz4.A01(j, true);
                        }
                        C27066DRp dRp = cz4.A03;
                        long addAndGet = cz4.A04.addAndGet(1);
                        Long valueOf = Long.valueOf(addAndGet);
                        C25905CoJ.A02("id [%d]: Create player", valueOf);
                        LruCache lruCache = cz4.A00;
                        Iterator A15 = AnonymousClass000.A15(lruCache.snapshot());
                        while (A15.hasNext()) {
                            Map.Entry A16 = AnonymousClass000.A16(A15);
                            if (((C26381Cyh) A16.getValue()).A15) {
                                lruCache.get(A16.getKey());
                            }
                        }
                        C25905CoJ.A02("id [%d]: refreshed LRUCached for playing players", valueOf);
                        if (!dRp.useMainThreadForHeroPlayer) {
                            C25905CoJ.A02("id [%d]: creating handlerThread", valueOf);
                            if (dRp.useHandlerThreadPool) {
                                C24706CGs.A00 = dRp.handlerThreadPoolSize;
                                ConcurrentLinkedQueue concurrentLinkedQueue = C24706CGs.A01;
                                if (concurrentLinkedQueue.size() < C24706CGs.A00) {
                                    StringBuilder A10 = AnonymousClass000.A10();
                                    C17890vO.A14("HeroHandlerThreadPool-", A10, concurrentLinkedQueue);
                                    handlerThread = new HandlerThread(A10.toString());
                                    handlerThread.start();
                                    handlerThread.getLooper();
                                } else {
                                    handlerThread = (HandlerThread) concurrentLinkedQueue.remove();
                                }
                                concurrentLinkedQueue.add(handlerThread);
                                StringBuilder A102 = AnonymousClass000.A10();
                                A102.append("using handler thread ");
                                A102.append(handlerThread.getName());
                                A102.append(", ti ");
                                A102.append(handlerThread.getId());
                                C25922Cog.A01("HeroHandlerThreadPool", AnonymousClass001.A1E(concurrentLinkedQueue, ", pool ", A102), new Object[0]);
                            } else {
                                handlerThread = new HandlerThread("HeroServicePlayer");
                                handlerThread.start();
                            }
                            C25905CoJ.A02("id [%d]: created handlerThread", valueOf);
                        } else {
                            handlerThread = null;
                        }
                        AtomicReference atomicReference2 = atomicReference;
                        C26381Cyh cyh = new C26381Cyh(context, A003, handlerThread, cqn, cbZ, eAg, cz4.A02, cz4, map, atomicBoolean, atomicReference2, addAndGet);
                        C25905CoJ.A02("id [%d]: created HeroServicePlayer", valueOf);
                        j = cyh.A0k;
                        Long valueOf2 = Long.valueOf(j);
                        lruCache.put(valueOf2, cyh);
                        if (dRp.enableBackgroundServicePlayerReuse) {
                            cz4.A01.put(valueOf2, 1);
                        }
                    } else {
                        C26381Cyh.A0E(A004, "leaveWarmUpIfNeed", new Object[0]);
                        if (A004.A0t.get()) {
                            BE7.A17(A004.A0l, A004, eAg, 19);
                        }
                        if (cz4.A03.enableBackgroundServicePlayerReuse && z) {
                            DGM dgm = A004.A0o;
                            dgm.C5I(dgm.A00.A0k);
                            dgm.A01 = eAg;
                        }
                    }
                }
                if (j != cye.A0N) {
                    cwF2.A04 = null;
                }
                cye.A0N = j;
                long[] jArr = cye.A0K;
                jArr[1] = jArr[0];
                jArr[0] = cye.A0N;
                cwF2.A09 = false;
            } catch (IllegalStateException | NullPointerException e) {
                String str2 = "Error occurs while creating player";
                try {
                    if (cye.A05.enableLogExceptionMessageOnError) {
                        str2 = BEA.A0j(e, "Error occurs while creating player with exception ", AnonymousClass000.A10());
                    }
                    C26378Cye cye2 = cye;
                    C26378Cye.A02(cye2, C0S.A0I, C0Q.A0S, str2, cwF2.A05.A06, e);
                    cye.A0N = 0;
                    throw new RemoteException(C17900vP.A0C("Failed ensure service player, ", AnonymousClass000.A10(), e));
                } catch (Throwable th) {
                    cwF2.A09 = false;
                    throw th;
                }
            }
        }
    }

    public static void A03(C26270CwF cwF) {
        C26378Cye cye = cwF.A0B;
        AtomicInteger atomicInteger = C26378Cye.A0T;
        cye.A0P = 0;
        long[] jArr = cye.A0K;
        jArr[1] = 0;
        jArr[0] = 0;
        if (AnonymousClass000.A1O((cye.A0N > 0 ? 1 : (cye.A0N == 0 ? 0 : -1)))) {
            cye.A0N = 0;
            cwF.A04 = null;
        }
    }

    public static void A04(C26270CwF cwF) {
        C26378Cye cye = cwF.A0B;
        AtomicInteger atomicInteger = C26378Cye.A0T;
        synchronized (cye.A0G) {
        }
        try {
            if (!AnonymousClass000.A1O((cye.A0N > 0 ? 1 : (cye.A0N == 0 ? 0 : -1)))) {
                BE6.A1D(cye, "Before reset(), service player was evicted. Lazy recover at next play()");
            } else {
                C26204Cub A002 = A00(cwF);
                long j = cye.A0N;
                Object[] A1a = AnonymousClass3MW.A1a();
                AnonymousClass3MX.A1S(A1a, 0, j);
                C26381Cyh A022 = C26204Cub.A02(A002, "id [%d]: reset", A1a, j);
                if (A022 == null) {
                    A06(cwF, cye, "When reset(), service player is noticed to be evicted earlier. Lazy recover at next play()");
                } else {
                    C26381Cyh.A0E(A022, "Reset", new Object[0]);
                    C26381Cyh.A08(A022.A0l.obtainMessage(11), A022);
                }
            }
        } catch (RemoteException e) {
            C26378Cye.A05(cye, "Error occurs while pausing the video", e, new Object[0]);
        } catch (Throwable th) {
            A05(cwF);
            throw th;
        }
        A05(cwF);
    }

    public static void A07(C26270CwF cwF, D49 d49) {
        boolean z;
        C26378Cye cye = cwF.A0B;
        AtomicInteger atomicInteger = C26378Cye.A0T;
        AtomicReference atomicReference = cye.A08;
        synchronized (atomicReference) {
            if (((D49) atomicReference.get()).A0H <= d49.A0H) {
                atomicReference.set(d49);
                if (d49.A0D < cye.A0P) {
                    z = true;
                } else if (d49.A0R) {
                    z = false;
                }
                cye.A0S = z;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [boolean, int] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.C26270CwF r13) {
        /*
            A02(r13)
            android.view.Surface r0 = r13.A0A
            if (r0 == 0) goto L_0x0021
            android.view.Surface r1 = r13.A0A
            android.view.Surface r0 = r13.A04
            if (r1 == r0) goto L_0x0021
            X.Cub r3 = r13.A06
            X.Cye r1 = r13.A0B
            java.util.concurrent.atomic.AtomicInteger r0 = X.C26378Cye.A0T
            long r1 = r1.A0N
            android.view.Surface r0 = r13.A0A
            boolean r0 = r3.A09(r0, r1)
            if (r0 == 0) goto L_0x0021
            android.view.Surface r0 = r13.A0A
            r13.A04 = r0
        L_0x0021:
            X.CbZ r5 = r13.A05
            if (r5 == 0) goto L_0x00d8
            long r3 = r13.A02
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x013b
            boolean r2 = r5.A00()
            if (r2 == 0) goto L_0x0114
            X.Cub r6 = r13.A06
            X.Cye r3 = r13.A0B
            java.util.concurrent.atomic.AtomicInteger r2 = X.C26378Cye.A0T
            long r4 = r3.A0N
            long r2 = r13.A03
            r6.A06(r4, r2)
        L_0x0040:
            r13.A02 = r0
            r13.A03 = r0
        L_0x0044:
            X.Cub r6 = r13.A06
            X.Cye r2 = r13.A0B
            java.util.concurrent.atomic.AtomicInteger r0 = X.C26378Cye.A0T
            long r0 = r2.A0N
            X.CbZ r5 = r13.A05
            boolean r9 = r13.A08
            float r11 = r2.A0M
            boolean r8 = r2.A0R
            java.lang.Object[] r10 = X.AnonymousClass8BR.A1a()
            boolean r4 = X.BE8.A1b(r10, r0)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r9)
            r7 = 1
            r10[r7] = r2
            if (r5 != 0) goto L_0x0110
            r3 = 0
        L_0x0066:
            r2 = 2
            r10[r2] = r3
            java.lang.String r2 = "id [%d]: prepareAndMayPlay, shouldPlay=%b, videoSource=%s"
            X.Cyh r3 = X.C26204Cub.A02(r6, r2, r10, r0)
            if (r3 == 0) goto L_0x00d8
            if (r9 == 0) goto L_0x010d
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.A0I
            boolean r2 = r0.compareAndSet(r7, r4)
        L_0x0079:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r0 = "Set volume"
            X.C26381Cyh.A0E(r3, r0, r1)
            android.os.Handler r10 = r3.A0l
            r1 = 5
            java.lang.Float r0 = java.lang.Float.valueOf(r11)
            X.BE7.A17(r10, r3, r0, r1)
            if (r5 != 0) goto L_0x00f5
            java.lang.String r0 = "can't prepare null videoplayrequest"
            X.BE6.A1E(r3, r0, r4)
        L_0x0091:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r0 = "Set Looping"
            X.C26381Cyh.A0E(r3, r0, r1)
            r1 = 18
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            X.BE7.A17(r10, r3, r0, r1)
            if (r9 == 0) goto L_0x00dc
            r0 = -1
            r3.A0O(r0, r2)
        L_0x00a8:
            if (r5 == 0) goto L_0x00d8
            X.D47 r0 = r5.A0C
            java.lang.String r2 = r0.A0H
            if (r2 == 0) goto L_0x00d8
            X.DRp r1 = r6.A0A
            boolean r0 = r1.enableCancelPrefetchInQueuePrepare
            if (r0 == 0) goto L_0x00b9
            r6.A05(r2, r4)
        L_0x00b9:
            boolean r0 = r1.enableBoostOngoingPrefetchPriorityPrepare
            if (r0 == 0) goto L_0x00c0
            X.C26204Cub.A03(r6, r2)
        L_0x00c0:
            boolean r0 = r1.enableMemoryAwareBufferSizeUsingRed
            if (r0 != 0) goto L_0x00c8
            boolean r0 = r1.enableMemoryAwareBufferSizeUsingYellow
            if (r0 == 0) goto L_0x00d8
        L_0x00c8:
            X.CTu r0 = r6.A0T
            if (r0 == 0) goto L_0x00d8
            X.CTu r1 = r6.A0T
            java.util.concurrent.atomic.AtomicReference r0 = r6.A0L
            r1.A00 = r0
            X.CTu r1 = r6.A0T
            java.util.concurrent.atomic.AtomicReference r0 = r6.A0N
            r1.A01 = r0
        L_0x00d8:
            r0 = 0
            r13.A07 = r0
            return
        L_0x00dc:
            java.lang.Object[] r2 = new java.lang.Object[r7]
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            r2[r4] = r1
            java.lang.String r0 = "Pause: finishPlayback=%b"
            X.C26381Cyh.A0E(r3, r0, r2)
            java.lang.Object[] r1 = X.AnonymousClass3MX.A1b(r1, r4)
            r0 = 0
            r1[r7] = r0
            r0 = 3
            X.BE7.A17(r10, r3, r1, r0)
            goto L_0x00a8
        L_0x00f5:
            java.lang.Object[] r1 = new java.lang.Object[r7]
            X.D47 r0 = r5.A0C
            r1[r4] = r0
            java.lang.String r0 = "Prepare: %s"
            X.C26381Cyh.A0E(r3, r0, r1)
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.A0q
            r0.set(r7)
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r4] = r5
            X.BE7.A17(r10, r3, r0, r7)
            goto L_0x0091
        L_0x010d:
            r2 = 0
            goto L_0x0079
        L_0x0110:
            X.D47 r3 = r5.A0C
            goto L_0x0066
        L_0x0114:
            java.util.concurrent.atomic.AtomicLong r2 = X.C26378Cye.A0U
            long r10 = r2.incrementAndGet()
            X.Cub r5 = r13.A06
            X.Cye r4 = r13.A0B
            long r6 = r4.A0N
            long r8 = r13.A02
            r12 = 0
            boolean r2 = r5.A07(r6, r8, r10, r12)
            if (r2 == 0) goto L_0x0137
            long r2 = r13.A02
            r4.A0O = r2
            r4.A0P = r10
            long r2 = android.os.SystemClock.elapsedRealtime()
            r4.A0Q = r2
            goto L_0x0040
        L_0x0137:
            r4.A0P = r0
            goto L_0x0040
        L_0x013b:
            int r2 = r13.A01
            if (r2 <= 0) goto L_0x0162
            java.util.concurrent.atomic.AtomicLong r2 = X.C26378Cye.A0U
            long r9 = r2.incrementAndGet()
            X.Cub r4 = r13.A06
            X.Cye r2 = r13.A0B
            long r5 = r2.A0N
            int r3 = r13.A01
            long r7 = (long) r3
            r11 = 0
            boolean r3 = r4.A07(r5, r7, r9, r11)
            if (r3 == 0) goto L_0x0176
            int r0 = r13.A01
            long r0 = (long) r0
            r2.A0O = r0
            r2.A0P = r9
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2.A0Q = r0
        L_0x0162:
            int r0 = r13.A00
            if (r0 <= 0) goto L_0x0044
            X.Cub r4 = r13.A06
            X.Cye r1 = r13.A0B
            java.util.concurrent.atomic.AtomicInteger r0 = X.C26378Cye.A0T
            long r2 = r1.A0N
            int r0 = r13.A00
            long r0 = (long) r0
            r4.A06(r2, r0)
            goto L_0x0044
        L_0x0176:
            r2.A0P = r0
            goto L_0x0162
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26270CwF.A01(X.CwF):void");
    }
}
