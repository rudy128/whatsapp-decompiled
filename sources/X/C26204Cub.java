package X;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.LruCache;
import com.facebook.video.heroplayer.service.ServiceEventCallbackImpl;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Cub  reason: case insensitive filesystem */
public class C26204Cub {
    public static C26204Cub A0W;
    public Handler A00;
    public HandlerThread A01;
    public C91 A02;
    public C26029Cqn A03;
    public CUG A04;
    public C24789CKi A05;
    public final Context A06;
    public final C92 A07;
    public final C25484Cgf A08;
    public final ServiceEventCallbackImpl A09;
    public final C27066DRp A0A;
    public final CAC A0B;
    public final C25019CTv A0C;
    public final C25593CiY A0D;
    public final Object A0E = C17880vN.A0p();
    public final Map A0F;
    public final AtomicBoolean A0G;
    public final AtomicBoolean A0H;
    public final AtomicBoolean A0I;
    public final AtomicReference A0J;
    public final AtomicReference A0K;
    public final AtomicReference A0L;
    public final AtomicReference A0M;
    public final AtomicReference A0N;
    public final AtomicReference A0O;
    public final AtomicReference A0P;
    public final AtomicBoolean A0Q;
    public final AtomicBoolean A0R;
    public final AtomicReference A0S;
    public volatile C25018CTu A0T;
    public volatile CZ4 A0U;
    public volatile C28620EAs A0V;

    /* JADX WARNING: type inference failed for: r0v4, types: [X.C92, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v5, types: [X.CAC, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v32, types: [java.lang.Object, X.C91] */
    public C26204Cub(Context context, C27066DRp dRp, C28620EAs eAs, HashMap hashMap) {
        C25496Cgr cgr;
        C25502Cgz cgz;
        String str;
        AtomicReference atomicReference = new AtomicReference((Object) null);
        this.A0J = atomicReference;
        this.A0M = new AtomicReference((Object) null);
        this.A0O = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        this.A0P = atomicReference2;
        ServiceEventCallbackImpl serviceEventCallbackImpl = new ServiceEventCallbackImpl(atomicReference);
        this.A09 = serviceEventCallbackImpl;
        this.A08 = new C25484Cgf(serviceEventCallbackImpl);
        this.A07 = new Object();
        this.A0B = new Object();
        this.A0G = BE6.A16(false);
        this.A0H = BE6.A16(false);
        this.A0I = BE6.A16(true);
        this.A0Q = BE6.A16(false);
        this.A0R = BE6.A16(false);
        this.A0K = new AtomicReference(new C24788CKh());
        C0W c0w = C0W.GREEN;
        this.A0N = new AtomicReference(c0w);
        this.A0L = new AtomicReference(c0w);
        this.A0S = new AtomicReference(c0w);
        this.A0V = C28620EAs.A00;
        C25304Cd8.A01("initHeroManager");
        try {
            atomicReference2.set((Object) null);
            this.A0F = hashMap;
            C27066DRp dRp2 = dRp;
            this.A0A = dRp2;
            this.A06 = context;
            if (dRp2.enableCreateByteBufferFromABufferNullCheckHooks || dRp2.enableFillBufferHooks || dRp2.enableFreeNodeHooks || dRp2.enableOnMessageReceivedHooks || dRp2.enableSendCommandHooks || dRp2.enableOnOMXEmptyBufferDoneHooks || dRp2.enableFillFreeBufferCheckNodeHooks) {
                synchronized (C94.class) {
                }
            }
            if (!dRp2.reportExceptionsAsSoftErrors || (str = dRp2.serviceInjectorClassName) == null) {
                C25922Cog.A00 = dRp2.enableDebugLogs;
                C25922Cog.A01 = dRp2.skipDebugLogs;
                AtomicReference atomicReference3 = this.A0M;
                CAC cac = this.A0B;
                atomicReference3.set(new C26185Cu9(dRp2, cac));
                if (dRp2.enableGlobalStallMonitor) {
                    synchronized (C25464CgJ.A02) {
                        C25464CgJ.A01 = true;
                    }
                }
                if (dRp2.enableGlobalNetworkMonitor) {
                    synchronized (C25502Cgz.class) {
                        try {
                            cgz = C25502Cgz.A01;
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                    synchronized (cgz) {
                    }
                }
                if (dRp2.enableVodDrmPrefetch) {
                    synchronized (C25496Cgr.class) {
                        cgr = C25496Cgr.A01;
                    }
                    int i = dRp2.drmSessionStoreCapacity;
                    synchronized (cgr) {
                        cgr.A00 = new LruCache(i);
                    }
                }
                C24791CKk cKk = null;
                this.A02 = new Object();
                synchronized (C25682CkD.class) {
                    C25682CkD.A07 = new C25682CkD(C28617EAp.A00);
                }
                AtomicReference atomicReference4 = this.A0O;
                C24794CKn cKn = new C24794CKn(atomicReference4);
                C91 c91 = this.A02;
                C92 c92 = this.A07;
                AtomicReference atomicReference5 = this.A0K;
                this.A0T = new C25018CTu(c91, c92, cKn, dRp2, cac, atomicReference3, atomicReference5, new AtomicReference((Object) null));
                Context context2 = this.A06;
                C25018CTu cTu = this.A0T;
                C26056CrS.A01(cTu);
                this.A0U = new CZ4(cTu, dRp2);
                if (this.A03 == null) {
                    Map map = this.A0F;
                    C26029Cqn cqn = new C26029Cqn(context2, A00(this), new C24793CKm(this), (C26185Cu9) atomicReference3.get(), dRp2, map);
                    this.A03 = cqn;
                    C24794CKn cKn2 = new C24794CKn(atomicReference4);
                    C26185Cu9 cu9 = (C26185Cu9) atomicReference3.get();
                    this.A04 = new CUG(context2, c92, cqn, (dRp2.enablePrefetchCancelCallback || dRp2.isVideoQplPipelineEnabled) ? new C24791CKk(this) : cKk, cKn2, cu9, dRp2, cac, map, atomicReference5);
                    if (dRp2.enableWarmCodec) {
                        Looper A0G2 = BE7.A0G(new HandlerThread("HeroWarmupThread"));
                        C27076DTa.A00(new Handler(A0G2), this, A0G2, 32);
                    }
                    if (dRp2.isEarlyPreallocateCodec && dRp2.earlyPreallocateCodecOnAppNotScrolling && !dRp2.enableAlwaysCallPreallocateCodec) {
                        this.A0G.compareAndSet(false, true);
                    }
                }
                this.A0V = eAs;
                C25593CiY ciY = new C25593CiY(new C24792CKl(this), dRp2, this.A0V);
                this.A0D = ciY;
                if (dRp2.enableWarmupScheduler) {
                    C25019CTv cTv = new C25019CTv(A00(this), C17890vO.A0D(), dRp2, ciY);
                    this.A0C = cTv;
                    cTv.A06.set(this);
                    if (!cTv.A03.enableStopWarmupSchedulerEmpty && !cTv.A08) {
                        C27080DTf.A00(cTv.A02, cTv, 0);
                        cTv.A08 = true;
                    }
                } else {
                    this.A0C = null;
                }
                if (dRp2.usePrefetchFilter) {
                    this.A05 = new C24789CKi();
                }
                C25304Cd8.A00();
                return;
            }
            try {
                Class.forName(str).newInstance();
                throw AnonymousClass000.A0s("init");
            } catch (Exception e) {
                throw AnonymousClass8BR.A0x(e);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            C25304Cd8.A00();
            throw th3;
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [boolean, int] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A08(android.os.ResultReceiver r5, long r6) {
        /*
            r4 = this;
            r3 = 1
            java.lang.Object[] r2 = new java.lang.Object[r3]
            boolean r1 = X.BE8.A1b(r2, r6)
            java.lang.String r0 = "id [%d]: releaseSurface"
            X.Cyh r2 = A02(r4, r0, r2, r6)
            if (r2 != 0) goto L_0x0010
            return r1
        L_0x0010:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = "Release surface"
            X.C26381Cyh.A0E(r2, r0, r1)
            android.os.Handler r1 = r2.A0l
            r0 = 7
            X.BE7.A17(r1, r2, r5, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26204Cub.A08(android.os.ResultReceiver, long):boolean");
    }

    public static Handler A00(C26204Cub cub) {
        if (cub.A0A.useMainThreadForHeroPlayer) {
            return C17890vO.A0D();
        }
        if (cub.A00 == null) {
            synchronized (cub.A0E) {
                if (cub.A00 == null) {
                    if (cub.A01 == null) {
                        HandlerThread handlerThread = new HandlerThread("HeroManagerBackgroundHandlerThread", 10);
                        cub.A01 = handlerThread;
                        handlerThread.start();
                    }
                    cub.A00 = new Handler(cub.A01.getLooper());
                }
            }
        }
        return cub.A00;
    }

    public static C26204Cub A01(Context context, C27066DRp dRp, C28620EAs eAs, HashMap hashMap) {
        C26204Cub cub = A0W;
        if (cub != null) {
            return cub;
        }
        synchronized (C26204Cub.class) {
            C26204Cub cub2 = A0W;
            if (cub2 != null) {
                return cub2;
            }
            A0W = new C26204Cub(context, dRp, eAs, hashMap);
            C25905CoJ.A00 = false;
            return A0W;
        }
    }

    public void A04() {
        CZ4 cz4 = this.A0U;
        if (cz4 != null) {
            cz4.A00.evictAll();
        }
        if (this.A0A.shouldCleanupHeroManagerThread) {
            synchronized (this.A0E) {
                HandlerThread handlerThread = this.A01;
                if (handlerThread != null) {
                    this.A00 = null;
                    handlerThread.quit();
                    this.A01 = null;
                }
            }
        }
    }

    public static C26381Cyh A02(C26204Cub cub, String str, Object[] objArr, long j) {
        C25905CoJ.A02(str, objArr);
        return cub.A0U.A00(j);
    }

    public static void A03(C26204Cub cub, String str) {
        C25905CoJ.A02("boostOngoingPrefetchPriorityForVideo %s", AnonymousClass8BV.A1b(str));
        CRG crg = cub.A04.A00;
        synchronized (crg.A01) {
            Iterator it = crg.A00.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass000.A0s("mTask");
            }
        }
    }

    public void A05(String str, boolean z) {
        Object[] A1a = C17890vO.A1a(str);
        AnonymousClass8BR.A1L(A1a, 1, z);
        C25905CoJ.A02("cancelPrefetchForVideo %s, %b", A1a);
        C24789CKi cKi = this.A05;
        if (cKi != null) {
            synchronized (cKi) {
                cKi.A00.remove(str);
            }
        }
        CUG cug = this.A04;
        CRG crg = cug.A00;
        LinkedList A14 = AnonymousClass8BR.A14();
        LinkedList linkedList = crg.A01;
        synchronized (linkedList) {
            ListIterator listIterator = linkedList.listIterator();
            if (listIterator.hasNext()) {
                listIterator.next();
                throw BE6.A0m();
            }
        }
        A14.size();
        if (cug.A01 != null) {
            C25922Cog.A01("ServiceEventCallbackImpl", "skipping log because listener is null", BE6.A1Z());
        }
        if (z) {
            synchronized (linkedList) {
                Iterator it = crg.A00.iterator();
                if (it.hasNext()) {
                    it.next();
                    throw AnonymousClass000.A0s("mTask");
                }
            }
        }
        if (cug.A02.enableCancelFollowupPrefetch) {
            synchronized (linkedList) {
                Iterator it2 = crg.A00.iterator();
                if (it2.hasNext()) {
                    it2.next();
                    throw AnonymousClass000.A0s("mTask");
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [boolean] */
    public boolean A06(long j, long j2) {
        Object[] A1b = AnonymousClass3MW.A1b();
        ? A1b2 = BE8.A1b(A1b, j);
        Object valueOf = Long.valueOf(j2);
        A1b[1] = valueOf;
        C26381Cyh A022 = A02(this, "id [%d]: setRelativePosition %d", A1b, j);
        if (A022 == null) {
            return A1b2;
        }
        Object[] objArr = new Object[1];
        objArr[A1b2] = valueOf;
        C26381Cyh.A0E(A022, "Set relative position to %d", objArr);
        BE7.A17(A022.A0l, A022, valueOf, 16);
        return true;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [boolean] */
    public boolean A07(long j, long j2, long j3, boolean z) {
        Object[] A1b = AnonymousClass3MW.A1b();
        ? A1b2 = BE8.A1b(A1b, j);
        Object valueOf = Long.valueOf(j2);
        A1b[1] = valueOf;
        C26381Cyh A022 = A02(this, "id [%d]: seekTo %d", A1b, j);
        if (A022 == null) {
            return A1b2;
        }
        Object[] objArr = new Object[1];
        objArr[A1b2] = valueOf;
        C26381Cyh.A0E(A022, "Seek to %d", objArr);
        Handler handler = A022.A0l;
        long[] jArr = new long[3];
        jArr[A1b2] = j2;
        jArr[1] = j3;
        jArr[2] = AnonymousClass8BX.A06(z ? 1 : 0);
        BE7.A17(handler, A022, jArr, 4);
        return true;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [boolean, int] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A09(android.view.Surface r5, long r6) {
        /*
            r4 = this;
            java.lang.Object[] r2 = X.AnonymousClass3MW.A1b()
            boolean r1 = X.BE8.A1b(r2, r6)
            r3 = 1
            r2[r3] = r5
            java.lang.String r0 = "id [%d]: setSurface: %s"
            X.Cyh r2 = A02(r4, r0, r2, r6)
            if (r2 != 0) goto L_0x0014
            return r1
        L_0x0014:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = "Set surface"
            X.C26381Cyh.A0E(r2, r0, r1)
            android.os.Handler r1 = r2.A0l
            r0 = 6
            X.BE7.A17(r1, r2, r5, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26204Cub.A09(android.view.Surface, long):boolean");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [boolean, int] */
    public boolean A0A(String str, long j, boolean z) {
        C25238CbZ cbZ;
        String str2;
        Object[] A1b = AnonymousClass3MW.A1b();
        ? A1b2 = BE8.A1b(A1b, j);
        Object valueOf = Boolean.valueOf(z);
        A1b[1] = valueOf;
        C26381Cyh A022 = A02(this, "id [%d]: pause, finishPlayback: %b", A1b, j);
        if (A022 == null) {
            return A1b2;
        }
        Object[] objArr = new Object[1];
        objArr[A1b2] = valueOf;
        C26381Cyh.A0E(A022, "Pause: finishPlayback=%b", objArr);
        Handler handler = A022.A0l;
        Object[] A1b3 = AnonymousClass3MX.A1b(valueOf, A1b2);
        A1b3[1] = str;
        BE7.A17(handler, A022, A1b3, 3);
        C27066DRp dRp = this.A0A;
        if (!((!dRp.enableDemoteOngoingPrefetchPriorityPause && !dRp.enableCancelOngoingPrefetchPause) || (cbZ = A022.A10) == null || (str2 = cbZ.A0C.A0H) == null)) {
            if (dRp.enableDemoteOngoingPrefetchPriorityPause) {
                Object[] objArr2 = new Object[1];
                objArr2[A1b2] = str2;
                C25905CoJ.A02("demoteOngoingPrefetchPriorityForVideo %s", objArr2);
                CRG crg = this.A04.A00;
                synchronized (crg.A01) {
                    Iterator it = crg.A00.iterator();
                    if (it.hasNext()) {
                        it.next();
                        throw AnonymousClass000.A0s("mTask");
                    }
                }
                return true;
            } else if (dRp.enableCancelOngoingPrefetchPause) {
                A05(str2, true);
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        if (r0.enableMediaCodecReuseOptimizeLock == false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void finalize() {
        /*
            r7 = this;
            java.lang.Object[] r1 = X.BE6.A1Z()
            java.lang.String r0 = "HeroService destroy"
            X.C25905CoJ.A02(r0, r1)
            X.CZ4 r2 = r7.A0U
            X.CiY r3 = r7.A0D
            X.CTv r4 = r7.A0C
            X.DRp r0 = r7.A0A
            if (r0 == 0) goto L_0x0018
            boolean r0 = r0.enableMediaCodecReuseOptimizeLock
            r6 = 1
            if (r0 != 0) goto L_0x0019
        L_0x0018:
            r6 = 0
        L_0x0019:
            android.os.Handler r0 = A00(r7)
            r5 = 3
            X.7RT r1 = new X.7RT
            r1.<init>(r2, r3, r4, r5, r6)
            r0.post(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26204Cub.finalize():void");
    }
}
