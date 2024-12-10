package X;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.Surface;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Cye  reason: case insensitive filesystem */
public class C26378Cye implements Handler.Callback {
    public static final AtomicInteger A0T = new AtomicInteger();
    public static final AtomicLong A0U = new AtomicLong(0);
    public static final Set A0V = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
    public long A00;
    public long A01;
    public CWC A02;
    public C24859CNc A03;
    public C28612EAg A04;
    public C27066DRp A05;
    public String A06;
    public List A07;
    public AtomicReference A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final Handler A0C;
    public final C26270CwF A0D;
    public final DGH A0E;
    public final Object A0F;
    public final Object A0G;
    public final List A0H;
    public final TreeMap A0I;
    public final AtomicReference A0J;
    public final long[] A0K;
    public volatile float A0L;
    public volatile float A0M;
    public volatile long A0N;
    public volatile long A0O;
    public volatile long A0P;
    public volatile long A0Q;
    public volatile boolean A0R;
    public volatile boolean A0S;

    public void A0B() {
        BE6.A1D(this, "pause");
        C108955ca.A1F(this.A0C, (Object) null, 3);
        synchronized (this.A0G) {
        }
        this.A0A = false;
    }

    public void A0C() {
        C25238CbZ cbZ;
        A06(this, "play", new Object[0]);
        this.A0A = true;
        C27066DRp dRp = this.A05;
        if (dRp.blockDRMPlaybackOnHDMI && dRp.fixDRMPlaybackOnHDMI) {
            C26270CwF cwF = this.A0D;
            if (cwF == null || (cbZ = cwF.A05) == null) {
                C25922Cog.A01("HeroPlayer", "Couldn't find isProtectedContent status. Considering it as non-protected.", new Object[0]);
            } else {
                String str = cbZ.A0C.A0A;
                if (str != null && str.contains("ContentProtection")) {
                    AtomicReference atomicReference = C25501Cgy.A01;
                    if (atomicReference.get() == null) {
                        AnonymousClass00N.A00((Object) null, new C25501Cgy(), atomicReference);
                    }
                    if (((C25501Cgy) atomicReference.get()).A00.get()) {
                        C25922Cog.A01("HeroPlayer", "Pausing DRM playback because HDMI is connected.", new Object[0]);
                        A0B();
                        return;
                    }
                }
            }
        }
        C108955ca.A1F(this.A0C, AnonymousClass8BV.A0a(), 2);
    }

    public void A0I(C25238CbZ cbZ) {
        String str;
        Uri uri;
        D47 d47 = cbZ.A0C;
        A06(this, "setVideoPlaybackParams: %s", d47);
        boolean z = false;
        if (!AnonymousClass000.A1Z(d47.A07, AnonymousClass00R.A01) || ((uri = d47.A05) != null && !TextUtils.isEmpty(uri.toString()))) {
            if (d47.A07 == AnonymousClass00R.A0C) {
                Uri uri2 = d47.A05;
                if (uri2 == null) {
                    str = "Progressive with null url";
                } else if (uri2.getPath() == null) {
                    str = "Progressive with null url path";
                } else if (d47.A05.getPath().endsWith(".mpd")) {
                    str = "Progressive with MPD";
                }
            }
            if (d47.A05 != null || !TextUtils.isEmpty(d47.A0A)) {
                z = true;
                str = "";
            } else {
                str = "VOD with null url and empty manifest";
            }
        } else {
            str = "DashLive with null or empty url";
        }
        Pair A0N2 = C108945cZ.A0N(z, str);
        if (!AnonymousClass000.A1Y(A0N2.first)) {
            IllegalArgumentException A0k = AnonymousClass000.A0k("Invalid video source");
            C0Q c0q = C0Q.A0Q;
            C0S c0s = C0S.A0b;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Invalid video source: ");
            A02(this, c0s, c0q, AnonymousClass000.A0y((String) A0N2.second, A10), cbZ.A06, A0k);
            return;
        }
        A06(this, "dash manifest: %s", d47.A0A);
        C108955ca.A1F(this.A0C, cbZ, 1);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C26378Cye(X.C28613EAh r3, X.C26204Cub r4, X.C27066DRp r5) {
        /*
            r2 = this;
            boolean r0 = r5.useMainThreadForHeroPlayer
            if (r0 == 0) goto L_0x000c
            android.os.Looper r0 = android.os.Looper.getMainLooper()
        L_0x0008:
            r2.<init>(r0, r3, r4, r5)
            return
        L_0x000c:
            java.lang.String r1 = "HeroPlayerInternalThread"
            r0 = -2
            android.os.Looper r0 = X.BEA.A0L(r1, r0)
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26378Cye.<init>(X.EAh, X.Cub, X.DRp):void");
    }

    public static long A00(C26378Cye cye) {
        if (!AnonymousClass000.A1O((cye.A0N > 0 ? 1 : (cye.A0N == 0 ? 0 : -1)))) {
            return 0;
        }
        D49 A0E2 = C108965cb.A0E(cye);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!A0E2.A0R || A0E2.A0P) {
            return 0;
        }
        return (long) (A0E2.A00 * ((float) (elapsedRealtime - A0E2.A0H)));
    }

    public static void A03(C26378Cye cye, D49 d49) {
        if (!cye.A05.enableClearStallOnBroadcastEnd) {
            return;
        }
        if (d49.A0F > 0 || d49.A0P) {
            d49.A0P = false;
            d49.A0F = -1;
            d49.A0G = -1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007a, code lost:
        if (r0.isValid() == false) goto L_0x007c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(X.C26378Cye r25, X.D49 r26, boolean r27) {
        /*
            r9 = r25
            X.CwF r10 = r9.A0D
            r8 = r26
            X.C26270CwF.A07(r10, r8)
            long r3 = r8.A0F
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0069
            long r1 = r8.A0G
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0069
            long r15 = r8.A00()
            long r6 = r8.A0F
            long r4 = r8.A0G
            boolean r0 = r8.A0R
            r20 = r0 ^ 1
            boolean r12 = r8.A0O
            java.lang.String r1 = "onBufferingStopped, %dms"
            java.lang.Object[] r0 = X.AnonymousClass3MW.A1a()
            long r2 = r4 - r6
            X.C17890vO.A1L(r0, r2)
            A06(r9, r1, r0)
            X.DRp r0 = r9.A05
            int r0 = r0.reportStallThresholdMs
            long r0 = (long) r0
            long r13 = r6 + r0
            int r0 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x0060
            java.util.List r11 = r9.A0H
            monitor-enter(r11)
            X.CPl r0 = new X.CPl     // Catch:{ all -> 0x005d }
            r24 = r12
            r25 = r4
            r21 = r0
            r22 = r6
            r21.<init>(r22, r24, r25)     // Catch:{ all -> 0x005d }
            r11.add(r0)     // Catch:{ all -> 0x005d }
            long r0 = r9.A00     // Catch:{ all -> 0x005d }
            r5 = -1
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r4 != 0) goto L_0x005b
            r9.A00 = r15     // Catch:{ all -> 0x005d }
        L_0x005b:
            monitor-exit(r11)     // Catch:{ all -> 0x005d }
            goto L_0x0060
        L_0x005d:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x005d }
            throw r0
        L_0x0060:
            X.DGH r14 = r9.A0E
            r19 = r27
            r17 = r2
            r14.C72(r15, r17, r19, r20)
        L_0x0069:
            boolean r0 = r9.A0B
            boolean r3 = r8.A0U
            if (r0 == r3) goto L_0x008b
            r9.A0B = r3
            android.view.Surface r0 = r10.A0A
            if (r0 == 0) goto L_0x007c
            boolean r0 = r0.isValid()
            r2 = 1
            if (r0 != 0) goto L_0x007d
        L_0x007c:
            r2 = 0
        L_0x007d:
            java.lang.Object[] r1 = X.BE6.A1Z()
            java.lang.String r0 = "onVisualPlayStateChanged"
            A06(r9, r0, r1)
            X.DGH r0 = r9.A0E
            r0.CAH(r3, r2)
        L_0x008b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26378Cye.A04(X.Cye, X.D49, boolean):void");
    }

    public static void A05(C26378Cye cye, String str, Throwable th, Object... objArr) {
        if (cye.A09) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append(cye.hashCode());
            A10.append(", playerId[");
            A10.append(cye.A0N);
            A10.append("]: ");
            A10.append(str);
            Log.e("HeroPlayer", String.format(C17900vP.A0C(", message = ", A10, th), objArr), th);
        }
    }

    public static void A06(C26378Cye cye, String str, Object... objArr) {
        if (cye.A09) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append(cye.hashCode());
            A10.append(", playerId[");
            A10.append(cye.A0N);
            BE7.A1M(AnonymousClass001.A1H("]: ", str, A10), "HeroPlayer", objArr);
        }
    }

    public static boolean A07(C26378Cye cye) {
        if (!cye.A0S || SystemClock.elapsedRealtime() - cye.A0Q > ((long) cye.A05.returnRequestedSeekTimeTimeoutMs)) {
            return false;
        }
        return true;
    }

    public int A08() {
        C26381Cyh A012;
        C26206Cue cue;
        C26270CwF cwF = this.A0D;
        try {
            C26378Cye cye = cwF.A0B;
            if (!AnonymousClass000.A1O((cye.A0N > 0 ? 1 : (cye.A0N == 0 ? 0 : -1))) || (A012 = A01(cwF, cye)) == null) {
                return 0;
            }
            C26205Cuc cuc = A012.A12;
            if (cuc == null || (cue = cuc.A01) == null) {
                return 1;
            }
            return cue.A07.A00;
        } catch (RemoteException e) {
            A05(cwF.A0B, "Error occurs while getPlaybackState", e, new Object[0]);
            return 0;
        }
    }

    public long A09() {
        C25238CbZ cbZ;
        if (!AnonymousClass000.A1O((this.A0N > 0 ? 1 : (this.A0N == 0 ? 0 : -1)))) {
            return 0;
        }
        C26270CwF cwF = this.A0D;
        if (cwF.A05 == null || !A07(this) || ((cbZ = cwF.A05) != null && cbZ.A00())) {
            return C108965cb.A0E(this).A00() + A00(this);
        }
        return this.A0O;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.CA0, java.lang.Object] */
    public CA0 A0A() {
        List<CPl> list = this.A0H;
        synchronized (list) {
            for (CPl cPl : list) {
                long j = cPl.A00;
                long j2 = cPl.A01;
                if (j <= j2 || j2 <= 0 || j <= 0) {
                    IllegalStateException A0n = AnonymousClass000.A0n("Start stall time is greater or equal to end stall time");
                    Object[] A1b = AnonymousClass3MW.A1b();
                    C17890vO.A1L(A1b, j2);
                    C17890vO.A1M(A1b, j);
                    A05(this, "stallStartMs = %d, stallEndMs = %d", A0n, A1b);
                } else {
                    C25238CbZ cbZ = this.A0D.A05;
                    if (cbZ != null && cbZ.A00()) {
                        C25922Cog.A02(this.A0I, this.A05.staleManifestThreshold, j2, j);
                    }
                }
            }
            list.clear();
            this.A0I.clear();
            this.A00 = -1;
        }
        return new Object();
    }

    public void A0E() {
        C26381Cyh A012;
        C26270CwF cwF = this.A0D;
        try {
            C26378Cye cye = cwF.A0B;
            if (AnonymousClass000.A1O((cye.A0N > 0 ? 1 : (cye.A0N == 0 ? 0 : -1))) && (A012 = A01(cwF, cye)) != null) {
                C26381Cyh.A08(A012.A0l.obtainMessage(48), A012);
            }
        } catch (RemoteException e) {
            A05(cwF.A0B, "Error occurs while seek to default position", e, BE6.A1Z());
        }
    }

    public void A0F(float f) {
        Object[] objArr = new Object[2];
        Float valueOf = Float.valueOf(f);
        boolean A1X = BE7.A1X(valueOf, "unknown", objArr);
        A06(this, "setVolume %f, trigger: %s", objArr);
        C108955ca.A1F(this.A0C, C108945cZ.A1a(valueOf, "unknown", 2, A1X ? 1 : 0), 5);
    }

    public void A0G(int i, long j) {
        this.A0O = j;
        this.A0P = A0U.incrementAndGet();
        this.A0Q = SystemClock.elapsedRealtime();
        Handler handler = this.A0C;
        Object[] A1b = AnonymousClass3MW.A1b();
        C17880vN.A1T(A1b, i, 0);
        AnonymousClass3MX.A1S(A1b, 1, j);
        C108955ca.A1F(handler, A1b, 46);
    }

    public boolean A0J() {
        if (this.A0A) {
            return true;
        }
        if (AnonymousClass000.A1O((this.A0N > 0 ? 1 : (this.A0N == 0 ? 0 : -1))) && C108965cb.A0E(this).A0R) {
            return true;
        }
        if (!AnonymousClass000.A1O((this.A0N > 0 ? 1 : (this.A0N == 0 ? 0 : -1))) || !C108965cb.A0E(this).A0P) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01eb, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01ec, code lost:
        A05(r6.A0B, "Error occurs while stop player", r4, new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:448:0x0981, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:449:0x0982, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:458:0x0997, code lost:
        if (r6 != null) goto L_0x0999;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:606:0x0cbe, code lost:
        if (r11 != null) goto L_0x0cc0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean handleMessage(android.os.Message r23) {
        /*
            r22 = this;
            r1 = r23
            int r3 = r1.what
            r2 = 2
            r0 = 1
            r8 = 0
            r7 = r22
            switch(r3) {
                case 1: goto L_0x0c09;
                case 2: goto L_0x0b8d;
                case 3: goto L_0x0b4b;
                case 4: goto L_0x0af3;
                case 5: goto L_0x0a85;
                case 6: goto L_0x0a2e;
                case 7: goto L_0x094e;
                case 8: goto L_0x08c1;
                case 9: goto L_0x088c;
                case 10: goto L_0x0810;
                case 11: goto L_0x0806;
                case 12: goto L_0x07fb;
                case 13: goto L_0x07bb;
                case 14: goto L_0x07b0;
                case 15: goto L_0x0777;
                case 16: goto L_0x073e;
                case 17: goto L_0x068f;
                case 18: goto L_0x0659;
                case 19: goto L_0x0608;
                case 20: goto L_0x000c;
                case 21: goto L_0x09a9;
                case 22: goto L_0x05b3;
                case 23: goto L_0x0548;
                case 24: goto L_0x0512;
                case 25: goto L_0x04be;
                case 26: goto L_0x0456;
                case 27: goto L_0x0449;
                case 28: goto L_0x0406;
                case 29: goto L_0x03bb;
                case 30: goto L_0x0374;
                case 31: goto L_0x032d;
                case 32: goto L_0x0326;
                case 33: goto L_0x02e2;
                case 34: goto L_0x0291;
                case 35: goto L_0x0246;
                case 36: goto L_0x01fb;
                case 37: goto L_0x01ac;
                case 38: goto L_0x0c84;
                case 39: goto L_0x0159;
                case 40: goto L_0x0118;
                case 41: goto L_0x000c;
                case 42: goto L_0x000c;
                case 43: goto L_0x000c;
                case 44: goto L_0x00eb;
                case 45: goto L_0x00c5;
                case 46: goto L_0x0088;
                case 47: goto L_0x0069;
                case 48: goto L_0x005d;
                case 49: goto L_0x0035;
                case 50: goto L_0x000d;
                default: goto L_0x000c;
            }
        L_0x000c:
            return r8
        L_0x000d:
            X.CwF r5 = r7.A0D
            X.Cye r4 = r5.A0B     // Catch:{ RemoteException -> 0x01a5 }
            long r6 = r4.A0N     // Catch:{ RemoteException -> 0x01a5 }
            r2 = 0
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1O(r1)     // Catch:{ RemoteException -> 0x01a5 }
            if (r1 != 0) goto L_0x0023
            java.lang.String r1 = "Before resetforreuse(), service player was evicted. Skip it"
            X.BE6.A1D(r4, r1)     // Catch:{ RemoteException -> 0x01a5 }
            return r0
        L_0x0023:
            X.Cyh r3 = A01(r5, r4)     // Catch:{ RemoteException -> 0x01a5 }
            if (r3 == 0) goto L_0x0a2d
            android.os.Handler r2 = r3.A0l     // Catch:{ RemoteException -> 0x01a5 }
            r1 = 51
            android.os.Message r1 = r2.obtainMessage(r1)     // Catch:{ RemoteException -> 0x01a5 }
            X.C26381Cyh.A08(r1, r3)     // Catch:{ RemoteException -> 0x01a5 }
            return r0
        L_0x0035:
            X.CwF r5 = r7.A0D
            X.Cye r4 = r5.A0B     // Catch:{ RemoteException -> 0x01a5 }
            long r6 = r4.A0N     // Catch:{ RemoteException -> 0x01a5 }
            r2 = 0
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1O(r1)     // Catch:{ RemoteException -> 0x01a5 }
            if (r1 != 0) goto L_0x004b
            java.lang.String r1 = "Before stopExo(), service player was evicted. Skip it"
            X.BE6.A1D(r4, r1)     // Catch:{ RemoteException -> 0x01a5 }
            return r0
        L_0x004b:
            X.Cyh r3 = A01(r5, r4)     // Catch:{ RemoteException -> 0x01a5 }
            if (r3 == 0) goto L_0x0a2d
            android.os.Handler r2 = r3.A0l     // Catch:{ RemoteException -> 0x01a5 }
            r1 = 50
            android.os.Message r1 = r2.obtainMessage(r1)     // Catch:{ RemoteException -> 0x01a5 }
            X.C26381Cyh.A08(r1, r3)     // Catch:{ RemoteException -> 0x01a5 }
            return r0
        L_0x005d:
            X.CwF r1 = r7.A0D
            X.C26270CwF.A02(r1)     // Catch:{ RemoteException -> 0x0063 }
            return r0
        L_0x0063:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0x(r0)
            throw r0
        L_0x0069:
            X.CwF r9 = r7.A0D
            java.lang.Object r1 = r1.obj
            boolean r7 = X.AnonymousClass000.A1Y(r1)
            X.Cye r6 = r9.A0B     // Catch:{ RemoteException -> 0x0a23 }
            long r4 = r6.A0N     // Catch:{ RemoteException -> 0x0a23 }
            r2 = 0
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1O(r1)     // Catch:{ RemoteException -> 0x0a23 }
            if (r1 == 0) goto L_0x0a2d
            X.Cyh r1 = A01(r9, r6)     // Catch:{ RemoteException -> 0x0a23 }
            if (r1 == 0) goto L_0x0a2d
            r1.A0h = r7     // Catch:{ RemoteException -> 0x0a23 }
            return r0
        L_0x0088:
            java.lang.Object r3 = r1.obj
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            X.CwF r7 = r7.A0D
            r1 = r3[r8]
            int r11 = X.AnonymousClass000.A0M(r1)
            long r3 = X.BE8.A0I(r3, r0)
            X.Cye r12 = r7.A0B     // Catch:{ RemoteException -> 0x00bc }
            long r5 = r12.A0N     // Catch:{ RemoteException -> 0x00bc }
            r9 = 0
            int r1 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1O(r1)     // Catch:{ RemoteException -> 0x00bc }
            if (r1 == 0) goto L_0x0a2d
            X.Cyh r6 = A01(r7, r12)     // Catch:{ RemoteException -> 0x00bc }
            if (r6 == 0) goto L_0x0a2d
            android.os.Handler r5 = r6.A0l     // Catch:{ RemoteException -> 0x00bc }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ RemoteException -> 0x00bc }
            X.C17880vN.A1T(r2, r11, r8)     // Catch:{ RemoteException -> 0x00bc }
            X.AnonymousClass3MX.A1S(r2, r0, r3)     // Catch:{ RemoteException -> 0x00bc }
            r1 = 49
            X.BE7.A17(r5, r6, r2, r1)     // Catch:{ RemoteException -> 0x00bc }
            return r0
        L_0x00bc:
            r4 = move-exception
            X.Cye r3 = r7.A0B
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.String r1 = "Error occurs while seek to default position"
            goto L_0x0a2a
        L_0x00c5:
            java.lang.Object r9 = r1.obj
            X.CwF r7 = r7.A0D
            X.Cye r6 = r7.A0B     // Catch:{ RemoteException -> 0x0111 }
            long r4 = r6.A0N     // Catch:{ RemoteException -> 0x0111 }
            r2 = 0
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1O(r1)     // Catch:{ RemoteException -> 0x0111 }
            if (r1 != 0) goto L_0x00dd
            java.lang.String r1 = "Before addExoPlayerListener, service player was evicted. Skip it"
            X.BE6.A1D(r6, r1)     // Catch:{ RemoteException -> 0x0111 }
            return r0
        L_0x00dd:
            X.Cyh r3 = A01(r7, r6)     // Catch:{ RemoteException -> 0x0111 }
            if (r3 == 0) goto L_0x0a2d
            android.os.Handler r2 = r3.A0l     // Catch:{ RemoteException -> 0x0111 }
            r1 = 46
            X.BE7.A17(r2, r3, r9, r1)     // Catch:{ RemoteException -> 0x0111 }
            return r0
        L_0x00eb:
            java.lang.Object r9 = r1.obj
            X.CwF r7 = r7.A0D
            X.Cye r6 = r7.A0B     // Catch:{ RemoteException -> 0x0111 }
            long r4 = r6.A0N     // Catch:{ RemoteException -> 0x0111 }
            r2 = 0
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1O(r1)     // Catch:{ RemoteException -> 0x0111 }
            if (r1 != 0) goto L_0x0103
            java.lang.String r1 = "Before addExoPlayerListener, service player was evicted. Skip it"
            X.BE6.A1D(r6, r1)     // Catch:{ RemoteException -> 0x0111 }
            return r0
        L_0x0103:
            X.Cyh r3 = A01(r7, r6)     // Catch:{ RemoteException -> 0x0111 }
            if (r3 == 0) goto L_0x0a2d
            android.os.Handler r2 = r3.A0l     // Catch:{ RemoteException -> 0x0111 }
            r1 = 45
            X.BE7.A17(r2, r3, r9, r1)     // Catch:{ RemoteException -> 0x0111 }
            return r0
        L_0x0111:
            r4 = move-exception
            X.Cye r3 = r7.A0B
            java.lang.String r2 = "Error occurs while addExoplayerListener"
            goto L_0x07f5
        L_0x0118:
            java.lang.Object r1 = r1.obj
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            X.CwF r6 = r7.A0D
            r1 = r1[r0]
            boolean r7 = X.AnonymousClass000.A1Y(r1)
            X.Cye r11 = r6.A0B     // Catch:{ RemoteException -> 0x0152 }
            long r3 = r11.A0N     // Catch:{ RemoteException -> 0x0152 }
            r9 = 0
            int r1 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1O(r1)     // Catch:{ RemoteException -> 0x0152 }
            if (r1 != 0) goto L_0x0138
            java.lang.String r1 = "Before reconfigureVrPlayer, service player was evicted. Skip it"
            X.BE6.A1D(r11, r1)     // Catch:{ RemoteException -> 0x0152 }
            return r0
        L_0x0138:
            X.Cub r5 = X.C26270CwF.A00(r6)     // Catch:{ RemoteException -> 0x0152 }
            long r3 = r11.A0N     // Catch:{ RemoteException -> 0x0152 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ RemoteException -> 0x0152 }
            java.lang.Long r1 = java.lang.Long.valueOf(r3)     // Catch:{ RemoteException -> 0x0152 }
            X.BE8.A1A(r1, r2, r8, r7, r0)     // Catch:{ RemoteException -> 0x0152 }
            java.lang.String r1 = "id [%d]: reconfigureVrPlayer %d"
            X.C25905CoJ.A02(r1, r2)     // Catch:{ RemoteException -> 0x0152 }
            X.CZ4 r1 = r5.A0U     // Catch:{ RemoteException -> 0x0152 }
            r1.A00(r3)     // Catch:{ RemoteException -> 0x0152 }
            return r0
        L_0x0152:
            r4 = move-exception
            X.Cye r3 = r6.A0B
            java.lang.String r2 = "Error occurs while reconfigureVrPlayer "
            goto L_0x07f5
        L_0x0159:
            X.CwF r5 = r7.A0D
            java.lang.Object r1 = r1.obj
            boolean r6 = X.AnonymousClass000.A1Y(r1)
            X.Cye r11 = r5.A0B     // Catch:{ RemoteException -> 0x01a5 }
            long r3 = r11.A0N     // Catch:{ RemoteException -> 0x01a5 }
            r9 = 0
            int r1 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1O(r1)     // Catch:{ RemoteException -> 0x01a5 }
            if (r1 != 0) goto L_0x0175
            java.lang.String r1 = "Before enableSR(), service player was evicted. Skip it"
            X.BE6.A1D(r11, r1)     // Catch:{ RemoteException -> 0x01a5 }
            return r0
        L_0x0175:
            X.Cub r7 = X.C26270CwF.A00(r5)     // Catch:{ RemoteException -> 0x01a5 }
            long r3 = r11.A0N     // Catch:{ RemoteException -> 0x01a5 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ RemoteException -> 0x01a5 }
            java.lang.Long r1 = java.lang.Long.valueOf(r3)     // Catch:{ RemoteException -> 0x01a5 }
            X.BE8.A1A(r1, r2, r8, r6, r0)     // Catch:{ RemoteException -> 0x01a5 }
            java.lang.String r1 = "id [%d]: enableSR %d"
            X.Cyh r4 = X.C26204Cub.A02(r7, r1, r2, r3)     // Catch:{ RemoteException -> 0x01a5 }
            if (r4 == 0) goto L_0x0a2d
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ RemoteException -> 0x01a5 }
            java.lang.String r1 = "Enabling SR: "
            java.lang.String r1 = X.C17900vP.A0D(r1, r2, r6)     // Catch:{ RemoteException -> 0x01a5 }
            X.BE6.A1E(r4, r1, r8)     // Catch:{ RemoteException -> 0x01a5 }
            android.os.Handler r3 = r4.A0l     // Catch:{ RemoteException -> 0x01a5 }
            r2 = 43
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)     // Catch:{ RemoteException -> 0x01a5 }
            X.BE7.A17(r3, r4, r1, r2)     // Catch:{ RemoteException -> 0x01a5 }
            return r0
        L_0x01a5:
            r4 = move-exception
            X.Cye r3 = r5.A0B
            java.lang.String r2 = "Error occurs while set enableSR "
            goto L_0x07f5
        L_0x01ac:
            X.CwF r6 = r7.A0D
            X.Cye r9 = r6.A0B     // Catch:{ RemoteException -> 0x01eb }
            long r2 = r9.A0N     // Catch:{ RemoteException -> 0x01eb }
            r4 = 0
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1O(r1)     // Catch:{ RemoteException -> 0x01eb }
            if (r1 != 0) goto L_0x01c2
            java.lang.String r1 = "Before stop(), service player was evicted. Skip it"
            X.BE6.A1D(r9, r1)     // Catch:{ RemoteException -> 0x01eb }
            goto L_0x01f5
        L_0x01c2:
            X.Cub r5 = X.C26270CwF.A00(r6)     // Catch:{ RemoteException -> 0x01eb }
            long r2 = r9.A0N     // Catch:{ RemoteException -> 0x01eb }
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x01eb }
            X.AnonymousClass3MX.A1S(r4, r8, r2)     // Catch:{ RemoteException -> 0x01eb }
            java.lang.String r1 = "id [%d]: stop"
            X.Cyh r3 = X.C26204Cub.A02(r5, r1, r4, r2)     // Catch:{ RemoteException -> 0x01eb }
            if (r3 == 0) goto L_0x01f5
            monitor-enter(r3)     // Catch:{ RemoteException -> 0x01eb }
            java.lang.String r1 = "Stop player"
            X.BE6.A1E(r3, r1, r8)     // Catch:{ all -> 0x01e8 }
            android.os.Handler r2 = r3.A0l     // Catch:{ all -> 0x01e8 }
            r1 = 41
            android.os.Message r1 = r2.obtainMessage(r1)     // Catch:{ all -> 0x01e8 }
            X.C26381Cyh.A08(r1, r3)     // Catch:{ all -> 0x01e8 }
            monitor-exit(r3)     // Catch:{ RemoteException -> 0x01eb }
            goto L_0x01f5
        L_0x01e8:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ RemoteException -> 0x01eb }
            throw r1     // Catch:{ RemoteException -> 0x01eb }
        L_0x01eb:
            r4 = move-exception
            X.Cye r3 = r6.A0B
            java.lang.String r2 = "Error occurs while stop player"
            java.lang.Object[] r1 = new java.lang.Object[r8]
            A05(r3, r2, r4, r1)
        L_0x01f5:
            X.CWC r2 = r7.A02
            java.lang.String r1 = "stop"
            goto L_0x0cae
        L_0x01fb:
            X.CwF r7 = r7.A0D
            java.lang.Object r1 = r1.obj
            boolean r10 = X.AnonymousClass000.A1Y(r1)
            X.Cye r9 = r7.A0B     // Catch:{ RemoteException -> 0x023f }
            long r3 = r9.A0N     // Catch:{ RemoteException -> 0x023f }
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1O(r1)     // Catch:{ RemoteException -> 0x023f }
            if (r1 != 0) goto L_0x0217
            java.lang.String r1 = "Before onRender(), service player was evicted. Skip it"
            X.BE6.A1D(r9, r1)     // Catch:{ RemoteException -> 0x023f }
            return r0
        L_0x0217:
            X.Cub r6 = X.C26270CwF.A00(r7)     // Catch:{ RemoteException -> 0x023f }
            long r3 = r9.A0N     // Catch:{ RemoteException -> 0x023f }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ RemoteException -> 0x023f }
            X.AnonymousClass3MX.A1S(r2, r8, r3)     // Catch:{ RemoteException -> 0x023f }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r10)     // Catch:{ RemoteException -> 0x023f }
            r2[r0] = r5     // Catch:{ RemoteException -> 0x023f }
            java.lang.String r1 = "id [%d]: onRender %b"
            X.Cyh r3 = X.C26204Cub.A02(r6, r1, r2, r3)     // Catch:{ RemoteException -> 0x023f }
            if (r3 == 0) goto L_0x0a2d
            java.lang.Object[] r2 = new java.lang.Object[r8]     // Catch:{ RemoteException -> 0x023f }
            java.lang.String r1 = "onRender"
            X.C26381Cyh.A0E(r3, r1, r2)     // Catch:{ RemoteException -> 0x023f }
            android.os.Handler r2 = r3.A0l     // Catch:{ RemoteException -> 0x023f }
            r1 = 36
            X.BE7.A17(r2, r3, r5, r1)     // Catch:{ RemoteException -> 0x023f }
            return r0
        L_0x023f:
            r4 = move-exception
            X.Cye r3 = r7.A0B
            java.lang.String r2 = "Error occurs while set onRender "
            goto L_0x07f5
        L_0x0246:
            X.CwF r7 = r7.A0D
            java.lang.Object r1 = r1.obj
            long r10 = X.C17880vN.A05(r1)
            X.Cye r9 = r7.A0B     // Catch:{ RemoteException -> 0x028a }
            long r3 = r9.A0N     // Catch:{ RemoteException -> 0x028a }
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1O(r1)     // Catch:{ RemoteException -> 0x028a }
            if (r1 != 0) goto L_0x0262
            java.lang.String r1 = "Before onBeforeRender(), service player was evicted. Skip it"
            X.BE6.A1D(r9, r1)     // Catch:{ RemoteException -> 0x028a }
            return r0
        L_0x0262:
            X.Cub r6 = X.C26270CwF.A00(r7)     // Catch:{ RemoteException -> 0x028a }
            long r3 = r9.A0N     // Catch:{ RemoteException -> 0x028a }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ RemoteException -> 0x028a }
            X.AnonymousClass3MX.A1S(r2, r8, r3)     // Catch:{ RemoteException -> 0x028a }
            java.lang.Long r5 = java.lang.Long.valueOf(r10)     // Catch:{ RemoteException -> 0x028a }
            r2[r0] = r5     // Catch:{ RemoteException -> 0x028a }
            java.lang.String r1 = "id [%d]: onBeforeRender %d"
            X.Cyh r3 = X.C26204Cub.A02(r6, r1, r2, r3)     // Catch:{ RemoteException -> 0x028a }
            if (r3 == 0) goto L_0x0a2d
            java.lang.Object[] r2 = new java.lang.Object[r8]     // Catch:{ RemoteException -> 0x028a }
            java.lang.String r1 = "onBeforeRender"
            X.C26381Cyh.A0E(r3, r1, r2)     // Catch:{ RemoteException -> 0x028a }
            android.os.Handler r2 = r3.A0l     // Catch:{ RemoteException -> 0x028a }
            r1 = 35
            X.BE7.A17(r2, r3, r5, r1)     // Catch:{ RemoteException -> 0x028a }
            return r0
        L_0x028a:
            r4 = move-exception
            X.Cye r3 = r7.A0B
            java.lang.String r2 = "Error occurs while set onBeforeRender"
            goto L_0x07f5
        L_0x0291:
            X.CwF r4 = r7.A0D
            java.lang.Object r6 = r1.obj
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r9 = r6.booleanValue()
            X.Cye r5 = r4.A0B
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r3[r8] = r6
            java.lang.String r1 = "convert stereo to mono: %s"
            A06(r5, r1, r3)
            X.Cub r7 = X.C26270CwF.A00(r4)     // Catch:{ RemoteException -> 0x02dd }
            long r3 = r5.A0N     // Catch:{ RemoteException -> 0x02dd }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ RemoteException -> 0x02dd }
            X.AnonymousClass3MX.A1S(r2, r8, r3)     // Catch:{ RemoteException -> 0x02dd }
            r2[r0] = r6     // Catch:{ RemoteException -> 0x02dd }
            java.lang.String r1 = "id [%d]: convertStereoToMono %s"
            X.Cyh r4 = X.C26204Cub.A02(r7, r1, r2, r3)     // Catch:{ RemoteException -> 0x02dd }
            if (r4 != 0) goto L_0x02c5
            java.lang.String r2 = "Fail to convertStereoToMono to : %s"
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x02dd }
        L_0x02bf:
            r1[r8] = r6     // Catch:{ RemoteException -> 0x02dd }
            A06(r5, r2, r1)     // Catch:{ RemoteException -> 0x02dd }
            goto L_0x02dc
        L_0x02c5:
            java.lang.Object[] r2 = new java.lang.Object[r8]     // Catch:{ RemoteException -> 0x02dd }
            java.lang.String r1 = "convertStereoToMono"
            X.C26381Cyh.A0E(r4, r1, r2)     // Catch:{ RemoteException -> 0x02dd }
            android.os.Handler r3 = r4.A0l     // Catch:{ RemoteException -> 0x02dd }
            r2 = 32
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)     // Catch:{ RemoteException -> 0x02dd }
            X.BE7.A17(r3, r4, r1, r2)     // Catch:{ RemoteException -> 0x02dd }
            java.lang.String r2 = "convert Stereo to Mono successfully to : %s"
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x02dd }
            goto L_0x02bf
        L_0x02dc:
            return r0
        L_0x02dd:
            r3 = move-exception
            java.lang.String r2 = "Error occurs while setting shouldConvertStereoToMono to the video"
            goto L_0x0aed
        L_0x02e2:
            X.CwF r4 = r7.A0D
            java.lang.Object r7 = r1.obj
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r9 = r7.booleanValue()
            X.Cye r5 = r4.A0B
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r3[r8] = r7
            java.lang.String r1 = "enableWakeLock: %s"
            A06(r5, r1, r3)
            X.Cub r6 = X.C26270CwF.A00(r4)     // Catch:{ RemoteException -> 0x0321 }
            long r3 = r5.A0N     // Catch:{ RemoteException -> 0x0321 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ RemoteException -> 0x0321 }
            java.lang.Long r1 = java.lang.Long.valueOf(r3)     // Catch:{ RemoteException -> 0x0321 }
            X.BE8.A1A(r1, r2, r8, r9, r0)     // Catch:{ RemoteException -> 0x0321 }
            java.lang.String r1 = "id [%d]: enableWakeLock %d"
            X.Cyh r1 = X.C26204Cub.A02(r6, r1, r2, r3)     // Catch:{ RemoteException -> 0x0321 }
            if (r1 != 0) goto L_0x0318
            java.lang.String r2 = "Fail to enableWakeLock to : %s"
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0321 }
        L_0x0312:
            r1[r8] = r7     // Catch:{ RemoteException -> 0x0321 }
            A06(r5, r2, r1)     // Catch:{ RemoteException -> 0x0321 }
            goto L_0x0320
        L_0x0318:
            r1.A0Q(r9)     // Catch:{ RemoteException -> 0x0321 }
            java.lang.String r2 = "enableWakeLock successfully to : %s"
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0321 }
            goto L_0x0312
        L_0x0320:
            return r0
        L_0x0321:
            r3 = move-exception
            java.lang.String r2 = "Error occurs while setting enableWakeLock to the video"
            goto L_0x0aed
        L_0x0326:
            X.CwF r1 = r7.A0D
            r1.A09 = r0
            r1.A07 = r0
            return r0
        L_0x032d:
            X.CwF r4 = r7.A0D
            java.lang.Object r6 = r1.obj
            X.Cye r5 = r4.A0B
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r3[r8] = r6
            java.lang.String r1 = "streamLatencyMode: %d"
            A06(r5, r1, r3)
            X.Cub r7 = X.C26270CwF.A00(r4)     // Catch:{ RemoteException -> 0x036f }
            long r3 = r5.A0N     // Catch:{ RemoteException -> 0x036f }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ RemoteException -> 0x036f }
            X.AnonymousClass3MX.A1S(r2, r8, r3)     // Catch:{ RemoteException -> 0x036f }
            r2[r0] = r6     // Catch:{ RemoteException -> 0x036f }
            java.lang.String r1 = "id [%d]: streamLatencyMode %d"
            X.Cyh r3 = X.C26204Cub.A02(r7, r1, r2, r3)     // Catch:{ RemoteException -> 0x036f }
            if (r3 != 0) goto L_0x035b
            java.lang.String r2 = "Fail to streamLatencyMode to : %d"
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x036f }
        L_0x0355:
            r1[r8] = r6     // Catch:{ RemoteException -> 0x036f }
            A06(r5, r2, r1)     // Catch:{ RemoteException -> 0x036f }
            goto L_0x036e
        L_0x035b:
            java.lang.Object[] r2 = new java.lang.Object[r8]     // Catch:{ RemoteException -> 0x036f }
            java.lang.String r1 = "Enable stream latency toggle"
            X.C26381Cyh.A0E(r3, r1, r2)     // Catch:{ RemoteException -> 0x036f }
            android.os.Handler r2 = r3.A0l     // Catch:{ RemoteException -> 0x036f }
            r1 = 31
            X.BE7.A17(r2, r3, r6, r1)     // Catch:{ RemoteException -> 0x036f }
            java.lang.String r2 = "streamLatencyMode successfully to : %d"
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x036f }
            goto L_0x0355
        L_0x036e:
            return r0
        L_0x036f:
            r3 = move-exception
            java.lang.String r2 = "Error occurs while setting streamLatencyMode the video"
            goto L_0x0aed
        L_0x0374:
            X.CwF r4 = r7.A0D
            java.lang.Object r6 = r1.obj
            X.Cye r5 = r4.A0B
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r3[r8] = r6
            java.lang.String r1 = "should enable live low latency optimization: %s"
            A06(r5, r1, r3)
            X.Cub r7 = X.C26270CwF.A00(r4)     // Catch:{ RemoteException -> 0x03b6 }
            long r3 = r5.A0N     // Catch:{ RemoteException -> 0x03b6 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ RemoteException -> 0x03b6 }
            X.AnonymousClass3MX.A1S(r2, r8, r3)     // Catch:{ RemoteException -> 0x03b6 }
            r2[r0] = r6     // Catch:{ RemoteException -> 0x03b6 }
            java.lang.String r1 = "id [%d]: setFullScreen %s"
            X.Cyh r3 = X.C26204Cub.A02(r7, r1, r2, r3)     // Catch:{ RemoteException -> 0x03b6 }
            if (r3 != 0) goto L_0x03a2
            java.lang.String r2 = "Fail to enable live low latency optimization to : %s"
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x03b6 }
        L_0x039c:
            r1[r8] = r6     // Catch:{ RemoteException -> 0x03b6 }
            A06(r5, r2, r1)     // Catch:{ RemoteException -> 0x03b6 }
            goto L_0x03b5
        L_0x03a2:
            java.lang.Object[] r2 = new java.lang.Object[r8]     // Catch:{ RemoteException -> 0x03b6 }
            java.lang.String r1 = "Enable live low latency optimization"
            X.C26381Cyh.A0E(r3, r1, r2)     // Catch:{ RemoteException -> 0x03b6 }
            android.os.Handler r2 = r3.A0l     // Catch:{ RemoteException -> 0x03b6 }
            r1 = 30
            X.BE7.A17(r2, r3, r6, r1)     // Catch:{ RemoteException -> 0x03b6 }
            java.lang.String r2 = "enable live low latency optimization successfully to : %s"
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x03b6 }
            goto L_0x039c
        L_0x03b5:
            return r0
        L_0x03b6:
            r3 = move-exception
            java.lang.String r2 = "Error occurs while enabling live low latency optimization"
            goto L_0x0aed
        L_0x03bb:
            X.CwF r7 = r7.A0D
            java.lang.Object r1 = r1.obj
            boolean r10 = X.AnonymousClass000.A1Y(r1)
            X.Cye r9 = r7.A0B     // Catch:{ RemoteException -> 0x03ff }
            long r3 = r9.A0N     // Catch:{ RemoteException -> 0x03ff }
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1O(r1)     // Catch:{ RemoteException -> 0x03ff }
            if (r1 != 0) goto L_0x03d7
            java.lang.String r1 = "Before enableVideoTrack(), service player was evicted. Skip it"
            X.BE6.A1D(r9, r1)     // Catch:{ RemoteException -> 0x03ff }
            return r0
        L_0x03d7:
            X.Cub r6 = X.C26270CwF.A00(r7)     // Catch:{ RemoteException -> 0x03ff }
            long r3 = r9.A0N     // Catch:{ RemoteException -> 0x03ff }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ RemoteException -> 0x03ff }
            X.AnonymousClass3MX.A1S(r2, r8, r3)     // Catch:{ RemoteException -> 0x03ff }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r10)     // Catch:{ RemoteException -> 0x03ff }
            r2[r0] = r5     // Catch:{ RemoteException -> 0x03ff }
            java.lang.String r1 = "id [%d]: enable video track %b"
            X.Cyh r3 = X.C26204Cub.A02(r6, r1, r2, r3)     // Catch:{ RemoteException -> 0x03ff }
            if (r3 == 0) goto L_0x0a2d
            java.lang.Object[] r2 = new java.lang.Object[r8]     // Catch:{ RemoteException -> 0x03ff }
            java.lang.String r1 = "Enable Video Track"
            X.C26381Cyh.A0E(r3, r1, r2)     // Catch:{ RemoteException -> 0x03ff }
            android.os.Handler r2 = r3.A0l     // Catch:{ RemoteException -> 0x03ff }
            r1 = 29
            X.BE7.A17(r2, r3, r5, r1)     // Catch:{ RemoteException -> 0x03ff }
            return r0
        L_0x03ff:
            r4 = move-exception
            X.Cye r3 = r7.A0B
            java.lang.String r2 = "Error occurs while set video track visibilty"
            goto L_0x07f5
        L_0x0406:
            X.CwF r6 = r7.A0D
            X.Cye r7 = r6.A0B     // Catch:{ RemoteException -> 0x0442 }
            long r4 = r7.A0N     // Catch:{ RemoteException -> 0x0442 }
            r2 = 0
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1O(r1)     // Catch:{ RemoteException -> 0x0442 }
            if (r1 != 0) goto L_0x041c
            java.lang.String r1 = "Before retry(), service player was evicted. Lazy recover at next play()"
            X.BE6.A1D(r7, r1)     // Catch:{ RemoteException -> 0x0442 }
            return r0
        L_0x041c:
            X.Cub r5 = X.C26270CwF.A00(r6)     // Catch:{ RemoteException -> 0x0442 }
            long r3 = r7.A0N     // Catch:{ RemoteException -> 0x0442 }
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0442 }
            X.AnonymousClass3MX.A1S(r2, r8, r3)     // Catch:{ RemoteException -> 0x0442 }
            java.lang.String r1 = "id [%d]: retry playback"
            X.Cyh r3 = X.C26204Cub.A02(r5, r1, r2, r3)     // Catch:{ RemoteException -> 0x0442 }
            if (r3 == 0) goto L_0x0a2d
            java.lang.Object[] r2 = new java.lang.Object[r8]     // Catch:{ RemoteException -> 0x0442 }
            java.lang.String r1 = "retry"
            X.C26381Cyh.A0E(r3, r1, r2)     // Catch:{ RemoteException -> 0x0442 }
            android.os.Handler r2 = r3.A0l     // Catch:{ RemoteException -> 0x0442 }
            r1 = 28
            android.os.Message r1 = r2.obtainMessage(r1)     // Catch:{ RemoteException -> 0x0442 }
            X.C26381Cyh.A08(r1, r3)     // Catch:{ RemoteException -> 0x0442 }
            return r0
        L_0x0442:
            r4 = move-exception
            X.Cye r3 = r6.A0B
            java.lang.String r2 = "Error occurs while retrying the same video playback"
            goto L_0x07f5
        L_0x0449:
            X.CwF r3 = r7.A0D
            java.lang.Object r2 = r1.obj
            java.lang.String r2 = (java.lang.String) r2
            X.CbZ r1 = r3.A05
            if (r1 == 0) goto L_0x0a2d
            r1.A05 = r2
            return r0
        L_0x0456:
            X.CwF r9 = r7.A0D
            java.lang.Object r1 = r1.obj
            float r6 = X.AnonymousClass000.A04(r1)
            r4 = 1082130432(0x40800000, float:4.0)
            r3 = 1048576000(0x3e800000, float:0.25)
            int r1 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r1 < 0) goto L_0x046a
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x0471
        L_0x046a:
            X.Cye r2 = r9.A0B
            java.lang.String r1 = "Trying to set playback speed with invalid value"
            X.BE6.A1D(r2, r1)
        L_0x0471:
            X.Cye r5 = r9.A0B
            float r1 = X.BE8.A01(r4, r6, r3)
            r5.A0L = r1
            long r2 = r5.A0N     // Catch:{ RemoteException -> 0x04b9 }
            r6 = 0
            int r1 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1O(r1)     // Catch:{ RemoteException -> 0x04b9 }
            if (r1 != 0) goto L_0x048b
            java.lang.String r1 = "Before setPlaybackSpeed(), service player was evicted. Lazy recover at next play()"
            X.BE6.A1D(r5, r1)     // Catch:{ RemoteException -> 0x04b9 }
            return r0
        L_0x048b:
            X.Cub r7 = X.C26270CwF.A00(r9)     // Catch:{ RemoteException -> 0x04b9 }
            long r2 = r5.A0N     // Catch:{ RemoteException -> 0x04b9 }
            float r6 = r5.A0L     // Catch:{ RemoteException -> 0x04b9 }
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x04b9 }
            X.AnonymousClass3MX.A1S(r4, r8, r2)     // Catch:{ RemoteException -> 0x04b9 }
            java.lang.String r1 = "id [%d]: setPlaybackSpeed"
            X.Cyh r4 = X.C26204Cub.A02(r7, r1, r4, r2)     // Catch:{ RemoteException -> 0x04b9 }
            if (r4 != 0) goto L_0x04a6
            java.lang.String r1 = "When setPlaybackSpeed(), service player is noticed to be evicted earlier. Lazy recover at next play()"
            X.C26270CwF.A06(r9, r5, r1)     // Catch:{ RemoteException -> 0x04b9 }
            return r0
        L_0x04a6:
            java.lang.Object[] r2 = new java.lang.Object[r8]     // Catch:{ RemoteException -> 0x04b9 }
            java.lang.String r1 = "Set playback speed"
            X.C26381Cyh.A0E(r4, r1, r2)     // Catch:{ RemoteException -> 0x04b9 }
            android.os.Handler r3 = r4.A0l     // Catch:{ RemoteException -> 0x04b9 }
            r2 = 27
            java.lang.Float r1 = java.lang.Float.valueOf(r6)     // Catch:{ RemoteException -> 0x04b9 }
            X.BE7.A17(r3, r4, r1, r2)     // Catch:{ RemoteException -> 0x04b9 }
            return r0
        L_0x04b9:
            r3 = move-exception
            java.lang.String r2 = "Error occurs while setting playback speed"
            goto L_0x0aed
        L_0x04be:
            X.CwF r10 = r7.A0D
            java.lang.Object r1 = r1.obj
            int r11 = X.AnonymousClass000.A0M(r1)
            X.Cye r5 = r10.A0B
            java.lang.Object[] r3 = new java.lang.Object[r8]
            java.lang.String r1 = "Pre Seek To"
            A06(r5, r1, r3)
            long r3 = r5.A0N     // Catch:{ RemoteException -> 0x0543 }
            r6 = 0
            int r1 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1O(r1)     // Catch:{ RemoteException -> 0x0543 }
            if (r1 != 0) goto L_0x04e1
            java.lang.String r1 = "Before preSeekTo(), service player was evicted. Lazy recover at next play()"
            X.BE6.A1D(r5, r1)     // Catch:{ RemoteException -> 0x0543 }
            return r0
        L_0x04e1:
            X.Cub r9 = X.C26270CwF.A00(r10)     // Catch:{ RemoteException -> 0x0543 }
            long r3 = r5.A0N     // Catch:{ RemoteException -> 0x0543 }
            long r6 = (long) r11     // Catch:{ RemoteException -> 0x0543 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ RemoteException -> 0x0543 }
            X.AnonymousClass3MX.A1S(r2, r8, r3)     // Catch:{ RemoteException -> 0x0543 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ RemoteException -> 0x0543 }
            r2[r0] = r6     // Catch:{ RemoteException -> 0x0543 }
            java.lang.String r1 = "id [%d]: preSeekTo %d"
            X.Cyh r3 = X.C26204Cub.A02(r9, r1, r2, r3)     // Catch:{ RemoteException -> 0x0543 }
            if (r3 != 0) goto L_0x0501
            java.lang.String r1 = "When preSeekTo(), service player is noticed to be evicted earlier. Lazy recover at next play()"
            X.C26270CwF.A06(r10, r5, r1)     // Catch:{ RemoteException -> 0x0543 }
            return r0
        L_0x0501:
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0543 }
            r2[r8] = r6     // Catch:{ RemoteException -> 0x0543 }
            java.lang.String r1 = "preSeekTo %d"
            X.C26381Cyh.A0E(r3, r1, r2)     // Catch:{ RemoteException -> 0x0543 }
            android.os.Handler r2 = r3.A0l     // Catch:{ RemoteException -> 0x0543 }
            r1 = 26
            X.BE7.A17(r2, r3, r6, r1)     // Catch:{ RemoteException -> 0x0543 }
            return r0
        L_0x0512:
            X.CwF r9 = r7.A0D
            X.Cye r5 = r9.A0B
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.String r1 = "Force Video To End triggered"
            A06(r5, r1, r2)
            long r6 = r5.A0N     // Catch:{ RemoteException -> 0x0543 }
            r2 = 0
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1O(r1)     // Catch:{ RemoteException -> 0x0543 }
            if (r1 != 0) goto L_0x052f
            java.lang.String r1 = "Before pause(), service player was evicted. Lazy recover at next play()"
            X.BE6.A1D(r5, r1)     // Catch:{ RemoteException -> 0x0543 }
            return r0
        L_0x052f:
            X.Cub r4 = X.C26270CwF.A00(r9)     // Catch:{ RemoteException -> 0x0543 }
            long r2 = r5.A0N     // Catch:{ RemoteException -> 0x0543 }
            java.lang.String r1 = ""
            boolean r1 = r4.A0A(r1, r2, r0)     // Catch:{ RemoteException -> 0x0543 }
            if (r1 != 0) goto L_0x0a2d
            java.lang.String r1 = "When pause(), service player is noticed to be evicted earlier. Lazy recover at next play()"
            X.C26270CwF.A06(r9, r5, r1)     // Catch:{ RemoteException -> 0x0543 }
            return r0
        L_0x0543:
            r3 = move-exception
            java.lang.String r2 = "Error occurs while pausing the video"
            goto L_0x0aed
        L_0x0548:
            X.CwF r6 = r7.A0D
            java.lang.Object r7 = r1.obj
            java.lang.Number r7 = (java.lang.Number) r7
            int r9 = r7.intValue()
            X.Cye r5 = r6.A0B
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r3[r8] = r7
            java.lang.String r1 = "setAudioUsage: %d"
            A06(r5, r1, r3)
            long r3 = r5.A0N     // Catch:{ RemoteException -> 0x05ae }
            r10 = 0
            int r1 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1O(r1)     // Catch:{ RemoteException -> 0x05ae }
            if (r1 != 0) goto L_0x0571
            java.lang.String r2 = "player must be valid before updating the audioUsage"
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ RemoteException -> 0x05ae }
        L_0x056d:
            A06(r5, r2, r1)     // Catch:{ RemoteException -> 0x05ae }
            goto L_0x05ad
        L_0x0571:
            X.Cub r10 = X.C26270CwF.A00(r6)     // Catch:{ RemoteException -> 0x05ae }
            long r3 = r5.A0N     // Catch:{ RemoteException -> 0x05ae }
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ RemoteException -> 0x05ae }
            X.AnonymousClass3MX.A1S(r6, r8, r3)     // Catch:{ RemoteException -> 0x05ae }
            r6[r0] = r7     // Catch:{ RemoteException -> 0x05ae }
            java.lang.String r1 = "id [%d]: setAudioUsage %d"
            X.Cyh r4 = X.C26204Cub.A02(r10, r1, r6, r3)     // Catch:{ RemoteException -> 0x05ae }
            if (r4 != 0) goto L_0x058d
            java.lang.String r2 = "failed to setAudioUsage to : %d"
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x05ae }
        L_0x058a:
            r1[r8] = r7     // Catch:{ RemoteException -> 0x05ae }
            goto L_0x056d
        L_0x058d:
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x05ae }
            r3[r8] = r7     // Catch:{ RemoteException -> 0x05ae }
            java.lang.String r1 = "Set audioUsage: %d"
            X.C26381Cyh.A0E(r4, r1, r3)     // Catch:{ RemoteException -> 0x05ae }
            r1 = 1
            if (r9 == r0) goto L_0x059d
            r1 = 2
            if (r9 == r2) goto L_0x059d
            r1 = 0
        L_0x059d:
            android.os.Handler r3 = r4.A0l     // Catch:{ RemoteException -> 0x05ae }
            r2 = 23
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ RemoteException -> 0x05ae }
            X.BE7.A17(r3, r4, r1, r2)     // Catch:{ RemoteException -> 0x05ae }
            java.lang.String r2 = "setAudioUsage successfully to : %d"
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x05ae }
            goto L_0x058a
        L_0x05ad:
            return r0
        L_0x05ae:
            r3 = move-exception
            java.lang.String r2 = "error occurred while setting audio usage"
            goto L_0x0aed
        L_0x05b3:
            X.CwF r4 = r7.A0D
            java.lang.Object r1 = r1.obj
            boolean r9 = X.AnonymousClass000.A1Y(r1)
            X.Cye r5 = r4.A0B
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
            r3[r8] = r7
            java.lang.String r1 = "liveLatencyMode: %d"
            A06(r5, r1, r3)
            X.Cub r6 = X.C26270CwF.A00(r4)     // Catch:{ RemoteException -> 0x0603 }
            long r3 = r5.A0N     // Catch:{ RemoteException -> 0x0603 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ RemoteException -> 0x0603 }
            X.AnonymousClass3MX.A1S(r2, r8, r3)     // Catch:{ RemoteException -> 0x0603 }
            r2[r0] = r7     // Catch:{ RemoteException -> 0x0603 }
            java.lang.String r1 = "id [%d]: liveLatencyMode %d"
            X.Cyh r4 = X.C26204Cub.A02(r6, r1, r2, r3)     // Catch:{ RemoteException -> 0x0603 }
            if (r4 != 0) goto L_0x05e9
            java.lang.String r2 = "Fail to setLiveLatencyMode to : %d"
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0603 }
        L_0x05e3:
            r1[r8] = r7     // Catch:{ RemoteException -> 0x0603 }
            A06(r5, r2, r1)     // Catch:{ RemoteException -> 0x0603 }
            goto L_0x0602
        L_0x05e9:
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0603 }
            r2[r8] = r7     // Catch:{ RemoteException -> 0x0603 }
            java.lang.String r1 = "Set rewindableVideoMode: %d"
            X.C26381Cyh.A0E(r4, r1, r2)     // Catch:{ RemoteException -> 0x0603 }
            android.os.Handler r3 = r4.A0l     // Catch:{ RemoteException -> 0x0603 }
            r2 = 22
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)     // Catch:{ RemoteException -> 0x0603 }
            X.BE7.A17(r3, r4, r1, r2)     // Catch:{ RemoteException -> 0x0603 }
            java.lang.String r2 = "setLiveLatencyMode successfully to : %d"
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0603 }
            goto L_0x05e3
        L_0x0602:
            return r0
        L_0x0603:
            r3 = move-exception
            java.lang.String r2 = "Error occurs while setting liveLatencyMode the video"
            goto L_0x0aed
        L_0x0608:
            X.CwF r9 = r7.A0D
            java.lang.Object r1 = r1.obj
            boolean r10 = X.AnonymousClass000.A1Y(r1)
            X.Cye r5 = r9.A0B
            r5.A0R = r10
            long r3 = r5.A0N     // Catch:{ RemoteException -> 0x0654 }
            r6 = 0
            int r1 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1O(r1)     // Catch:{ RemoteException -> 0x0654 }
            if (r1 != 0) goto L_0x0626
            java.lang.String r1 = "Before setLooping(), service player was evicted. Lazy recover at next play()"
            X.BE6.A1D(r5, r1)     // Catch:{ RemoteException -> 0x0654 }
            return r0
        L_0x0626:
            X.Cub r7 = X.C26270CwF.A00(r9)     // Catch:{ RemoteException -> 0x0654 }
            long r3 = r5.A0N     // Catch:{ RemoteException -> 0x0654 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ RemoteException -> 0x0654 }
            X.AnonymousClass3MX.A1S(r2, r8, r3)     // Catch:{ RemoteException -> 0x0654 }
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r10)     // Catch:{ RemoteException -> 0x0654 }
            r2[r0] = r6     // Catch:{ RemoteException -> 0x0654 }
            java.lang.String r1 = "id [%d]: setLooping %s"
            X.Cyh r3 = X.C26204Cub.A02(r7, r1, r2, r3)     // Catch:{ RemoteException -> 0x0654 }
            if (r3 != 0) goto L_0x0645
            java.lang.String r1 = "When setLooping(), service player is noticed to be evicted earlier. Lazy recover at next play()"
            X.C26270CwF.A06(r9, r5, r1)     // Catch:{ RemoteException -> 0x0654 }
            return r0
        L_0x0645:
            java.lang.Object[] r2 = new java.lang.Object[r8]     // Catch:{ RemoteException -> 0x0654 }
            java.lang.String r1 = "Set Looping"
            X.C26381Cyh.A0E(r3, r1, r2)     // Catch:{ RemoteException -> 0x0654 }
            android.os.Handler r2 = r3.A0l     // Catch:{ RemoteException -> 0x0654 }
            r1 = 18
            X.BE7.A17(r2, r3, r6, r1)     // Catch:{ RemoteException -> 0x0654 }
            return r0
        L_0x0654:
            r3 = move-exception
            java.lang.String r2 = "Error occurs while setting looping"
            goto L_0x0aed
        L_0x0659:
            X.CwF r7 = r7.A0D
            int r1 = r1.arg1
            r7.A00 = r1
            X.Cye r6 = r7.A0B     // Catch:{ RemoteException -> 0x0688 }
            long r2 = r6.A0N     // Catch:{ RemoteException -> 0x0688 }
            r4 = 0
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1O(r1)     // Catch:{ RemoteException -> 0x0688 }
            if (r1 != 0) goto L_0x0673
            java.lang.String r1 = "Before setRelativePosition(), service player was evicted. Lazy recover at next play()"
            X.BE6.A1D(r6, r1)     // Catch:{ RemoteException -> 0x0688 }
            return r0
        L_0x0673:
            X.Cub r5 = X.C26270CwF.A00(r7)     // Catch:{ RemoteException -> 0x0688 }
            long r3 = r6.A0N     // Catch:{ RemoteException -> 0x0688 }
            int r1 = r7.A00     // Catch:{ RemoteException -> 0x0688 }
            long r1 = (long) r1     // Catch:{ RemoteException -> 0x0688 }
            boolean r1 = r5.A06(r3, r1)     // Catch:{ RemoteException -> 0x0688 }
            if (r1 != 0) goto L_0x0a2d
            java.lang.String r1 = "When setRelativePosition(), service player is noticed to be evicted earlier. Lazy recover at next play()"
            X.C26270CwF.A06(r7, r6, r1)     // Catch:{ RemoteException -> 0x0688 }
            return r0
        L_0x0688:
            r4 = move-exception
            X.Cye r3 = r7.A0B
            java.lang.String r2 = "Error occurs while setting relative position of the video"
            goto L_0x07f5
        L_0x068f:
            java.lang.Object r6 = r1.obj
            java.lang.String[] r6 = (java.lang.String[]) r6
            X.CwF r5 = r7.A0D
            r8 = r6[r8]
            r7 = r6[r0]
            r4 = r6[r2]
            r1 = 3
            r3 = r6[r1]
            r1 = 4
            r14 = r6[r1]
            X.CbZ r1 = r5.A05
            if (r1 == 0) goto L_0x0713
            boolean r6 = r1.A00()
            if (r6 == 0) goto L_0x0713
            java.lang.Integer r18 = X.AnonymousClass00R.A0C
            X.D47 r3 = r1.A0C
            java.lang.Integer r3 = r3.A07
            int r4 = r3.intValue()
            if (r4 == r0) goto L_0x06c1
            r3 = 0
            if (r4 == r3) goto L_0x06e0
            r3 = 3
            if (r4 == r3) goto L_0x06dd
            if (r4 != r2) goto L_0x06c1
            java.lang.Integer r18 = X.AnonymousClass00R.A0N
        L_0x06c1:
            X.Cye r2 = r5.A0B
            java.lang.String r3 = "force live video to complete upon 410 dismiss error"
            r13 = 0
            X.BE6.A1D(r2, r3)
            boolean r3 = r5.A08
            if (r3 == 0) goto L_0x0a2d
            X.CA0 r15 = r2.A0A()
            X.D49 r5 = X.C108965cb.A0E(r2)
            if (r5 != 0) goto L_0x06e3
            java.lang.String r1 = "Force Video To End terminated early"
            X.BE6.A1D(r2, r1)
            return r0
        L_0x06dd:
            java.lang.Integer r18 = X.AnonymousClass00R.A0j
            goto L_0x06c1
        L_0x06e0:
            java.lang.Integer r18 = X.AnonymousClass00R.A01
            goto L_0x06c1
        L_0x06e3:
            A03(r2, r5)
            boolean r3 = r5.A0R
            if (r3 != 0) goto L_0x06fd
            X.DGH r3 = r2.A0E
            X.D40 r4 = X.BE8.A0N(r2)
            java.lang.String r6 = "unknown"
            r7 = 0
            java.lang.String r10 = r1.A06
            r11 = -1
            r9 = r7
            r8 = r7
            r14 = r13
            r3.CA4(r4, r5, r6, r7, r8, r9, r10, r11, r13, r14)
        L_0x06fd:
            X.DGH r14 = r2.A0E
            X.D40 r16 = X.BE8.A0N(r2)
            boolean r2 = r2.A0R
            java.lang.String r1 = r1.A06
            r17 = r5
            r19 = r1
            r20 = r13
            r21 = r2
            r14.C9x(r15, r16, r17, r18, r19, r20, r21)
            return r0
        L_0x0713:
            X.Cye r2 = r5.A0B
            X.DRp r1 = r2.A05
            boolean r1 = r1.logStallOnPauseOnError
            if (r1 == 0) goto L_0x073c
            X.CA0 r10 = r2.A0A()
        L_0x071f:
            X.DGH r9 = r2.A0E
            X.D49 r13 = X.C108965cb.A0E(r2)
            X.D40 r12 = X.BE8.A0N(r2)
            X.C0Q r2 = X.C0Q.valueOf(r8)
            X.C0S r1 = X.C0S.valueOf(r7)
            X.CpJ r11 = new X.CpJ
            r11.<init>(r1, r2, r4, r3)
            java.lang.String r15 = ""
            r9.C0l(r10, r11, r12, r13, r14, r15)
            return r0
        L_0x073c:
            r10 = 0
            goto L_0x071f
        L_0x073e:
            X.CwF r6 = r7.A0D
            java.lang.Object r7 = r1.obj
            X.Cye r9 = r6.A0B     // Catch:{ RemoteException -> 0x0771 }
            long r2 = r9.A0N     // Catch:{ RemoteException -> 0x0771 }
            r4 = 0
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1O(r1)     // Catch:{ RemoteException -> 0x0771 }
            if (r1 != 0) goto L_0x0756
            java.lang.String r1 = "Before setSpatialAudioFocus(), service player was evicted. Skip setting spatial audio focus"
            X.BE6.A1D(r9, r1)     // Catch:{ RemoteException -> 0x0771 }
            return r0
        L_0x0756:
            X.Cub r5 = X.C26270CwF.A00(r6)     // Catch:{ RemoteException -> 0x0771 }
            long r3 = r9.A0N     // Catch:{ RemoteException -> 0x0771 }
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0771 }
            X.AnonymousClass3MX.A1S(r2, r8, r3)     // Catch:{ RemoteException -> 0x0771 }
            java.lang.String r1 = "id [%d]: setSpatialAudioFocus"
            X.Cyh r3 = X.C26204Cub.A02(r5, r1, r2, r3)     // Catch:{ RemoteException -> 0x0771 }
            if (r3 == 0) goto L_0x0a2d
            android.os.Handler r2 = r3.A0l     // Catch:{ RemoteException -> 0x0771 }
            r1 = 14
            X.BE7.A17(r2, r3, r7, r1)     // Catch:{ RemoteException -> 0x0771 }
            return r0
        L_0x0771:
            r4 = move-exception
            X.Cye r3 = r6.A0B
            java.lang.String r2 = "Error occurs while setting spatial audio focus"
            goto L_0x07f5
        L_0x0777:
            X.CwF r6 = r7.A0D
            java.lang.Object r7 = r1.obj
            X.Cye r9 = r6.A0B     // Catch:{ RemoteException -> 0x07aa }
            long r2 = r9.A0N     // Catch:{ RemoteException -> 0x07aa }
            r4 = 0
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1O(r1)     // Catch:{ RemoteException -> 0x07aa }
            if (r1 != 0) goto L_0x078f
            java.lang.String r1 = "Before setDeviceOrientationFrame(), service player was evicted. Skip setting device orientation frame"
            X.BE6.A1D(r9, r1)     // Catch:{ RemoteException -> 0x07aa }
            return r0
        L_0x078f:
            X.Cub r5 = X.C26270CwF.A00(r6)     // Catch:{ RemoteException -> 0x07aa }
            long r3 = r9.A0N     // Catch:{ RemoteException -> 0x07aa }
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x07aa }
            X.AnonymousClass3MX.A1S(r2, r8, r3)     // Catch:{ RemoteException -> 0x07aa }
            java.lang.String r1 = "id [%d]: setDeviceOrientationFrame"
            X.Cyh r3 = X.C26204Cub.A02(r5, r1, r2, r3)     // Catch:{ RemoteException -> 0x07aa }
            if (r3 == 0) goto L_0x0a2d
            android.os.Handler r2 = r3.A0l     // Catch:{ RemoteException -> 0x07aa }
            r1 = 13
            X.BE7.A17(r2, r3, r7, r1)     // Catch:{ RemoteException -> 0x07aa }
            return r0
        L_0x07aa:
            r4 = move-exception
            X.Cye r3 = r6.A0B
            java.lang.String r2 = "Error occurs while setting device orientation frame"
            goto L_0x07f5
        L_0x07b0:
            X.CwF r1 = r7.A0D
            X.C26270CwF.A04(r1)
            X.CWC r2 = r7.A02
            java.lang.String r1 = "reset"
            goto L_0x0cae
        L_0x07bb:
            X.CwF r6 = r7.A0D
            java.lang.Object r7 = r1.obj
            X.Cye r11 = r6.A0B     // Catch:{ RemoteException -> 0x07f0 }
            long r3 = r11.A0N     // Catch:{ RemoteException -> 0x07f0 }
            r9 = 0
            int r1 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1O(r1)     // Catch:{ RemoteException -> 0x07f0 }
            if (r1 != 0) goto L_0x07d3
            java.lang.String r1 = "Before setCustomQuality(), service player was evicted. Skip setting custom quality"
            X.BE6.A1D(r11, r1)     // Catch:{ RemoteException -> 0x07f0 }
            return r0
        L_0x07d3:
            X.Cub r5 = X.C26270CwF.A00(r6)     // Catch:{ RemoteException -> 0x07f0 }
            long r3 = r11.A0N     // Catch:{ RemoteException -> 0x07f0 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ RemoteException -> 0x07f0 }
            X.AnonymousClass3MX.A1S(r2, r8, r3)     // Catch:{ RemoteException -> 0x07f0 }
            r2[r0] = r7     // Catch:{ RemoteException -> 0x07f0 }
            java.lang.String r1 = "id [%d]: setCustomQuality: %s"
            X.Cyh r3 = X.C26204Cub.A02(r5, r1, r2, r3)     // Catch:{ RemoteException -> 0x07f0 }
            if (r3 == 0) goto L_0x0a2d
            android.os.Handler r2 = r3.A0l     // Catch:{ RemoteException -> 0x07f0 }
            r1 = 25
            X.BE7.A17(r2, r3, r7, r1)     // Catch:{ RemoteException -> 0x07f0 }
            return r0
        L_0x07f0:
            r4 = move-exception
            X.Cye r3 = r6.A0B
            java.lang.String r2 = "Error occurs while setting custom quality"
        L_0x07f5:
            java.lang.Object[] r1 = new java.lang.Object[r8]
            A05(r3, r2, r4, r1)
            return r0
        L_0x07fb:
            X.CwF r1 = r7.A0D
            X.C26270CwF.A03(r1)
            X.CWC r2 = r7.A02
            java.lang.String r1 = "servicePlayerRelease"
            goto L_0x0cae
        L_0x0806:
            X.CwF r2 = r7.A0D
            java.lang.Object r1 = r1.obj
            X.D49 r1 = (X.D49) r1
            X.C26270CwF.A07(r2, r1)
            return r0
        L_0x0810:
            X.CwF r5 = r7.A0D
            r1 = 0
            r5.A06 = r1
            r5.A04 = r1
            X.Cye r10 = r5.A0B
            long r2 = r10.A0N
            r8 = 0
            int r1 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1O(r1)
            if (r1 != 0) goto L_0x086a
            r3 = 0
        L_0x0827:
            r5.A02 = r3
            X.CbZ r1 = r5.A05
            if (r1 == 0) goto L_0x0867
            boolean r1 = r1.A00()
            if (r1 == 0) goto L_0x0867
            long r1 = r10.A09()
        L_0x0837:
            r5.A03 = r1
            X.D49 r11 = X.C108965cb.A0E(r10)
            long r8 = android.os.SystemClock.elapsedRealtime()
            long r5 = r11.A08
            boolean r1 = r11.A0R
            if (r1 == 0) goto L_0x0864
            boolean r1 = r11.A0P
            if (r1 != 0) goto L_0x0864
            float r12 = r11.A00
            long r3 = r11.A0H
            long r1 = r8 - r3
            float r3 = (float) r1
            float r12 = r12 * r3
            long r1 = (long) r12
        L_0x0854:
            long r5 = r5 + r1
            r11.A08 = r5
            long r3 = r11.A0E
            long r3 = r3 + r1
            r11.A0E = r3
            r11.A0P = r0
            r11.A0H = r8
            java.lang.Object r1 = r10.A0F
            monitor-enter(r1)
            goto L_0x087f
        L_0x0864:
            r1 = 0
            goto L_0x0854
        L_0x0867:
            r1 = 0
            goto L_0x0837
        L_0x086a:
            boolean r1 = A07(r10)
            if (r1 == 0) goto L_0x0873
            long r3 = r10.A0O
            goto L_0x0827
        L_0x0873:
            X.D49 r1 = X.C108965cb.A0E(r10)
            long r3 = r1.A08
            long r1 = A00(r10)
            long r3 = r3 + r1
            goto L_0x0827
        L_0x087f:
            r1.notifyAll()     // Catch:{ all -> 0x0889 }
            monitor-exit(r1)     // Catch:{ all -> 0x0889 }
            X.CWC r2 = r7.A02
            java.lang.String r1 = "disconnected"
            goto L_0x0cae
        L_0x0889:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0889 }
            throw r2
        L_0x088c:
            X.CwF r5 = r7.A0D
            java.lang.Object r1 = r1.obj
            boolean r2 = X.AnonymousClass000.A1Y(r1)
            X.Cye r3 = r5.A0B     // Catch:{ RemoteException -> 0x08b1 }
            X.DRp r1 = r3.A05     // Catch:{ RemoteException -> 0x08b1 }
            boolean r1 = r1.disableRecoverInBackground     // Catch:{ RemoteException -> 0x08b1 }
            if (r1 == 0) goto L_0x08a1
            if (r2 == 0) goto L_0x08a1
            r5.A07 = r0     // Catch:{ RemoteException -> 0x08b1 }
            goto L_0x08a4
        L_0x08a1:
            X.C26270CwF.A01(r5)     // Catch:{ RemoteException -> 0x08b1 }
        L_0x08a4:
            java.lang.Object[] r2 = new java.lang.Object[r8]     // Catch:{ RemoteException -> 0x08b1 }
            java.lang.String r1 = "onVideoServiceConnected"
            A06(r3, r1, r2)     // Catch:{ RemoteException -> 0x08b1 }
            X.DGH r1 = r3.A0E     // Catch:{ RemoteException -> 0x08b1 }
            r1.CA1()     // Catch:{ RemoteException -> 0x08b1 }
            goto L_0x08bb
        L_0x08b1:
            r4 = move-exception
            X.Cye r3 = r5.A0B
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.String r1 = "Error occurs in handleServiceConnected"
            A05(r3, r1, r4, r2)
        L_0x08bb:
            X.CWC r2 = r7.A02
            java.lang.String r1 = "connected"
            goto L_0x0cae
        L_0x08c1:
            X.CwF r9 = r7.A0D
            X.Cye r4 = r9.A0B     // Catch:{ RemoteException -> 0x08ef }
            long r1 = r4.A0N     // Catch:{ RemoteException -> 0x08ef }
            r5 = 0
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1O(r3)     // Catch:{ RemoteException -> 0x08ef }
            if (r1 != 0) goto L_0x08d7
            java.lang.String r1 = "Before release(), service player was evicted. Skip releasing"
            X.BE6.A1D(r4, r1)     // Catch:{ RemoteException -> 0x08ef }
            goto L_0x08f9
        L_0x08d7:
            X.Cub r6 = X.C26270CwF.A00(r9)     // Catch:{ RemoteException -> 0x08ef }
            long r1 = r4.A0N     // Catch:{ RemoteException -> 0x08ef }
            java.lang.Object[] r5 = X.AnonymousClass3MW.A1a()     // Catch:{ RemoteException -> 0x08ef }
            X.BE8.A1N(r5, r1)     // Catch:{ RemoteException -> 0x08ef }
            java.lang.String r3 = "id [%d]: release"
            X.C25905CoJ.A02(r3, r5)     // Catch:{ RemoteException -> 0x08ef }
            X.CZ4 r3 = r6.A0U     // Catch:{ RemoteException -> 0x08ef }
            r3.A01(r1, r8)     // Catch:{ RemoteException -> 0x08ef }
            goto L_0x08f9
        L_0x08ef:
            r3 = move-exception
            X.Cye r4 = r9.A0B     // Catch:{ all -> 0x0938 }
            java.lang.String r2 = "Error occurs while release player"
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x0938 }
            A05(r4, r2, r3, r1)     // Catch:{ all -> 0x0938 }
        L_0x08f9:
            r9.A08 = r8
            X.C26270CwF.A05(r9)
            r1 = 0
            r4.A0M = r1
            r2 = 0
            r4.A0N = r2
            long[] r1 = r4.A0K
            r1[r0] = r2
            r1[r8] = r2
            android.os.Handler r3 = r4.A0C
            android.os.Looper r1 = r3.getLooper()
            java.lang.Thread r1 = r1.getThread()
            java.lang.String r2 = "HeroPlayerInternalThread"
            java.lang.String r1 = r1.getName()
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x092e
            X.DRp r1 = r4.A05
            boolean r2 = r1.quitHandlerSafely
            android.os.Looper r1 = r3.getLooper()
            if (r2 == 0) goto L_0x0934
            r1.quitSafely()
        L_0x092e:
            X.CWC r2 = r7.A02
            java.lang.String r1 = "release"
            goto L_0x0cae
        L_0x0934:
            r1.quit()
            goto L_0x092e
        L_0x0938:
            r5 = move-exception
            r9.A08 = r8
            X.C26270CwF.A05(r9)
            X.Cye r4 = r9.A0B
            r1 = 0
            r4.A0M = r1
            r2 = 0
            r4.A0N = r2
            long[] r1 = r4.A0K
            r1[r0] = r2
            r1[r8] = r2
            throw r5
        L_0x094e:
            java.lang.Object r6 = r1.obj
            android.os.ResultReceiver r6 = (android.os.ResultReceiver) r6
            X.CwF r9 = r7.A0D
            r5 = 0
            r9.A0A = r5     // Catch:{ RemoteException -> 0x098a }
            X.Cye r4 = r9.A0B     // Catch:{ RemoteException -> 0x098a }
            long r1 = r4.A0N     // Catch:{ RemoteException -> 0x098a }
            r10 = 0
            int r3 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1O(r3)     // Catch:{ RemoteException -> 0x098a }
            if (r1 != 0) goto L_0x096b
            java.lang.String r1 = "Before releaseSurface(), service player was evicted. Lazy recover at next play()"
            X.BE6.A1D(r4, r1)     // Catch:{ RemoteException -> 0x098a }
            goto L_0x0997
        L_0x096b:
            X.Cub r3 = X.C26270CwF.A00(r9)     // Catch:{ RemoteException -> 0x098a }
            long r1 = r4.A0N     // Catch:{ RemoteException -> 0x098a }
            boolean r1 = r3.A08(r6, r1)     // Catch:{ RemoteException -> 0x098a }
            if (r1 == 0) goto L_0x0984
            java.lang.String r1 = "Surface release request already sent, let it complete"
            X.BE6.A1D(r4, r1)     // Catch:{ RemoteException -> 0x098a }
            r9.A04 = r5     // Catch:{ RemoteException -> 0x0981, all -> 0x097f }
            goto L_0x099c
        L_0x097f:
            r2 = move-exception
            throw r2
        L_0x0981:
            r4 = move-exception
            r6 = r5
            goto L_0x098b
        L_0x0984:
            java.lang.String r1 = "When releaseSurface(), service player is noticed to be evicted earlier. Lazy recover at next play()"
            X.C26270CwF.A06(r9, r4, r1)     // Catch:{ RemoteException -> 0x098a }
            goto L_0x0997
        L_0x098a:
            r4 = move-exception
        L_0x098b:
            X.Cye r3 = r9.A0B     // Catch:{ all -> 0x09a2 }
            java.lang.String r2 = "Error occurs while releasing surface"
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x09a2 }
            A05(r3, r2, r4, r1)     // Catch:{ all -> 0x09a2 }
            if (r6 == 0) goto L_0x099c
            goto L_0x0999
        L_0x0997:
            if (r6 == 0) goto L_0x099c
        L_0x0999:
            r6.send(r0, r5)
        L_0x099c:
            X.CWC r2 = r7.A02
            java.lang.String r1 = "releaseSurface"
            goto L_0x0cae
        L_0x09a2:
            r2 = move-exception
            if (r6 == 0) goto L_0x09dd
            r6.send(r0, r5)
            throw r2
        L_0x09a9:
            X.CwF r4 = r7.A0D
            java.lang.Object r7 = r1.obj
            X.CPm r7 = (X.CPm) r7
            X.Cye r9 = r4.A0B
            java.lang.Object[] r5 = new java.lang.Object[r2]
            long r2 = r7.A01
            X.AnonymousClass3MX.A1S(r5, r8, r2)
            X.CNb r1 = r7.A00
            if (r1 == 0) goto L_0x09de
            android.view.Surface r1 = r1.A01
        L_0x09be:
            r5[r0] = r1
            java.lang.String r1 = "switchToWarmupPlayer: player id: %d, surface: %s"
            A06(r9, r1, r5)
            X.CbZ r6 = r4.A05
            if (r6 == 0) goto L_0x09e0
            java.lang.String r5 = r7.A02
            X.DRp r1 = r9.A05
            java.lang.String r1 = X.C25593CiY.A00(r6, r1)
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x09e0
            java.lang.String r0 = "switchToWarmupPlayer is called after setVideoPlaybackParams"
            java.lang.IllegalStateException r2 = X.AnonymousClass000.A0n(r0)
        L_0x09dd:
            throw r2
        L_0x09de:
            r1 = 0
            goto L_0x09be
        L_0x09e0:
            long r5 = r9.A0N     // Catch:{ RemoteException -> 0x0a04 }
            r10 = 0
            int r1 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1O(r1)     // Catch:{ RemoteException -> 0x0a04 }
            if (r1 == 0) goto L_0x0a0c
            X.Cub r11 = X.C26270CwF.A00(r4)     // Catch:{ RemoteException -> 0x0a04 }
            long r5 = r9.A0N     // Catch:{ RemoteException -> 0x0a04 }
            java.lang.Object[] r10 = X.AnonymousClass3MW.A1a()     // Catch:{ RemoteException -> 0x0a04 }
            X.BE8.A1N(r10, r5)     // Catch:{ RemoteException -> 0x0a04 }
            java.lang.String r1 = "id [%d]: release"
            X.C25905CoJ.A02(r1, r10)     // Catch:{ RemoteException -> 0x0a04 }
            X.CZ4 r1 = r11.A0U     // Catch:{ RemoteException -> 0x0a04 }
            r1.A01(r5, r0)     // Catch:{ RemoteException -> 0x0a04 }
            goto L_0x0a0c
        L_0x0a04:
            r6 = move-exception
            java.lang.String r5 = "Error occurs while release player"
            java.lang.Object[] r1 = new java.lang.Object[r8]
            A05(r9, r5, r6, r1)
        L_0x0a0c:
            r9.A0N = r2
            long[] r3 = r9.A0K
            r1 = r3[r8]
            r3[r0] = r1
            long r1 = r9.A0N
            r3[r8] = r1
            X.CNb r1 = r7.A00
            if (r1 == 0) goto L_0x0a2d
            android.view.Surface r1 = r1.A01
            r4.A0A = r1
            r4.A04 = r1
            return r0
        L_0x0a23:
            r4 = move-exception
            X.Cye r3 = r9.A0B
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.String r1 = "Error occurs while apply shouldresetposition"
        L_0x0a2a:
            A05(r3, r1, r4, r2)
        L_0x0a2d:
            return r0
        L_0x0a2e:
            X.CwF r5 = r7.A0D
            java.lang.Object r4 = r1.obj
            android.view.Surface r4 = (android.view.Surface) r4
            r5.A0A = r4
            if (r4 == 0) goto L_0x0a4d
            android.view.Surface r1 = r5.A04
            if (r4 != r1) goto L_0x0a4d
            X.Cye r3 = r5.A0B
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r2[r8] = r4
            java.lang.String r1 = "surface already sent, skipping send again: %s"
            A06(r3, r1, r2)
        L_0x0a47:
            X.CWC r2 = r7.A02
            java.lang.String r1 = "setSurface"
            goto L_0x0cae
        L_0x0a4d:
            X.Cye r6 = r5.A0B     // Catch:{ RemoteException -> 0x0a7a }
            long r2 = r6.A0N     // Catch:{ RemoteException -> 0x0a7a }
            r9 = 0
            int r1 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1O(r1)     // Catch:{ RemoteException -> 0x0a7a }
            if (r1 != 0) goto L_0x0a61
            java.lang.String r1 = "Before setSurface(), service player was evicted. Lazy recover at next play()"
            X.BE6.A1D(r6, r1)     // Catch:{ RemoteException -> 0x0a7a }
            goto L_0x0a47
        L_0x0a61:
            X.Cub r4 = X.C26270CwF.A00(r5)     // Catch:{ RemoteException -> 0x0a7a }
            long r2 = r6.A0N     // Catch:{ RemoteException -> 0x0a7a }
            android.view.Surface r1 = r5.A0A     // Catch:{ RemoteException -> 0x0a7a }
            boolean r1 = r4.A09(r1, r2)     // Catch:{ RemoteException -> 0x0a7a }
            if (r1 != 0) goto L_0x0a75
            java.lang.String r1 = "When setSurface(), service player is noticed to be evicted earlier. Lazy recover at next play()"
            X.C26270CwF.A06(r5, r6, r1)     // Catch:{ RemoteException -> 0x0a7a }
            goto L_0x0a47
        L_0x0a75:
            android.view.Surface r1 = r5.A0A     // Catch:{ RemoteException -> 0x0a7a }
            r5.A04 = r1     // Catch:{ RemoteException -> 0x0a7a }
            goto L_0x0a47
        L_0x0a7a:
            r4 = move-exception
            X.Cye r3 = r5.A0B
            java.lang.String r2 = "Error occurs while setting surface"
            java.lang.Object[] r1 = new java.lang.Object[r8]
            A05(r3, r2, r4, r1)
            goto L_0x0a47
        L_0x0a85:
            java.lang.Object r1 = r1.obj
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            X.CwF r9 = r7.A0D
            r1 = r1[r8]
            float r6 = X.AnonymousClass000.A04(r1)
            r4 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            int r1 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r1 < 0) goto L_0x0a9c
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x0aa3
        L_0x0a9c:
            X.Cye r2 = r9.A0B
            java.lang.String r1 = "Trying to set volume with invalid value"
            X.BE6.A1D(r2, r1)
        L_0x0aa3:
            X.Cye r5 = r9.A0B
            float r1 = X.BE8.A01(r4, r6, r3)
            r5.A0M = r1
            long r2 = r5.A0N     // Catch:{ RemoteException -> 0x0aea }
            r6 = 0
            int r1 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1O(r1)     // Catch:{ RemoteException -> 0x0aea }
            if (r1 != 0) goto L_0x0abd
            java.lang.String r1 = "Before setVolume(), service player was evicted. Lazy recover at next play()"
            X.BE6.A1D(r5, r1)     // Catch:{ RemoteException -> 0x0aea }
            return r0
        L_0x0abd:
            X.Cub r7 = X.C26270CwF.A00(r9)     // Catch:{ RemoteException -> 0x0aea }
            long r3 = r5.A0N     // Catch:{ RemoteException -> 0x0aea }
            float r6 = r5.A0M     // Catch:{ RemoteException -> 0x0aea }
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0aea }
            X.AnonymousClass3MX.A1S(r2, r8, r3)     // Catch:{ RemoteException -> 0x0aea }
            java.lang.String r1 = "id [%d]: setVolume"
            X.Cyh r4 = X.C26204Cub.A02(r7, r1, r2, r3)     // Catch:{ RemoteException -> 0x0aea }
            if (r4 != 0) goto L_0x0ad8
            java.lang.String r1 = "When setVolume(), service player is noticed to be evicted earlier. Lazy recover at next play()"
            X.C26270CwF.A06(r9, r5, r1)     // Catch:{ RemoteException -> 0x0aea }
            return r0
        L_0x0ad8:
            java.lang.Object[] r2 = new java.lang.Object[r8]     // Catch:{ RemoteException -> 0x0aea }
            java.lang.String r1 = "Set volume"
            X.C26381Cyh.A0E(r4, r1, r2)     // Catch:{ RemoteException -> 0x0aea }
            android.os.Handler r3 = r4.A0l     // Catch:{ RemoteException -> 0x0aea }
            r2 = 5
            java.lang.Float r1 = java.lang.Float.valueOf(r6)     // Catch:{ RemoteException -> 0x0aea }
            X.BE7.A17(r3, r4, r1, r2)     // Catch:{ RemoteException -> 0x0aea }
            return r0
        L_0x0aea:
            r3 = move-exception
            java.lang.String r2 = "Error occurs while setting volume"
        L_0x0aed:
            java.lang.Object[] r1 = new java.lang.Object[r8]
            A05(r5, r2, r3, r1)
            return r0
        L_0x0af3:
            java.lang.Object r1 = r1.obj
            long[] r1 = (long[]) r1
            X.CwF r6 = r7.A0D
            r3 = r1[r8]
            int r9 = (int) r3
            r15 = r1[r0]
            r4 = 1
            r2 = r1[r2]
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x0b07
            r8 = 1
        L_0x0b07:
            r6.A01 = r9
            r9 = 0
            X.Cye r5 = r6.A0B     // Catch:{ RemoteException -> 0x0b37 }
            long r3 = r5.A0N     // Catch:{ RemoteException -> 0x0b37 }
            r1 = 0
            int r10 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            boolean r3 = X.AnonymousClass000.A1O(r10)     // Catch:{ RemoteException -> 0x0b37 }
            if (r3 != 0) goto L_0x0b20
            java.lang.String r3 = "Before seekTo(), service player was evicted. Lazy recover at next play()"
            X.BE6.A1D(r5, r3)     // Catch:{ RemoteException -> 0x0b37 }
            r5.A0P = r1     // Catch:{ RemoteException -> 0x0b37 }
            goto L_0x0b45
        L_0x0b20:
            X.Cub r10 = X.C26270CwF.A00(r6)     // Catch:{ RemoteException -> 0x0b37 }
            long r11 = r5.A0N     // Catch:{ RemoteException -> 0x0b37 }
            int r1 = r6.A01     // Catch:{ RemoteException -> 0x0b37 }
            long r13 = (long) r1     // Catch:{ RemoteException -> 0x0b37 }
            r17 = r8
            boolean r1 = r10.A07(r11, r13, r15, r17)     // Catch:{ RemoteException -> 0x0b37 }
            if (r1 != 0) goto L_0x0b45
            java.lang.String r1 = "When seekTo(), service player is noticed to be evicted earlier. Lazy recover at next play()"
            X.C26270CwF.A06(r6, r5, r1)     // Catch:{ RemoteException -> 0x0b37 }
            goto L_0x0b45
        L_0x0b37:
            r4 = move-exception
            X.Cye r3 = r6.A0B
            r1 = 0
            r3.A0P = r1
            java.lang.String r2 = "Error occurs while seeking the video"
            java.lang.Object[] r1 = new java.lang.Object[r9]
            A05(r3, r2, r4, r1)
        L_0x0b45:
            X.CWC r2 = r7.A02
            java.lang.String r1 = "seek"
            goto L_0x0cae
        L_0x0b4b:
            X.CwF r5 = r7.A0D
            java.lang.Object r6 = r1.obj
            java.lang.String r6 = (java.lang.String) r6
            r5.A08 = r8
            X.Cye r4 = r5.A0B     // Catch:{ RemoteException -> 0x0b7d }
            long r2 = r4.A0N     // Catch:{ RemoteException -> 0x0b7d }
            r9 = 0
            int r1 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1O(r1)     // Catch:{ RemoteException -> 0x0b7d }
            if (r1 != 0) goto L_0x0b67
            java.lang.String r1 = "Before pause(), service player was evicted. Lazy recover at next play()"
            X.BE6.A1D(r4, r1)     // Catch:{ RemoteException -> 0x0b7d }
            goto L_0x0b87
        L_0x0b67:
            X.Cub r3 = X.C26270CwF.A00(r5)     // Catch:{ RemoteException -> 0x0b7d }
            long r1 = r4.A0N     // Catch:{ RemoteException -> 0x0b7d }
            if (r6 != 0) goto L_0x0b71
            java.lang.String r6 = ""
        L_0x0b71:
            boolean r1 = r3.A0A(r6, r1, r8)     // Catch:{ RemoteException -> 0x0b7d }
            if (r1 != 0) goto L_0x0b87
            java.lang.String r1 = "When pause(), service player is noticed to be evicted earlier. Lazy recover at next play()"
            X.C26270CwF.A06(r5, r4, r1)     // Catch:{ RemoteException -> 0x0b7d }
            goto L_0x0b87
        L_0x0b7d:
            r4 = move-exception
            X.Cye r3 = r5.A0B
            java.lang.String r2 = "Error occurs while pausing the video"
            java.lang.Object[] r1 = new java.lang.Object[r8]
            A05(r3, r2, r4, r1)
        L_0x0b87:
            X.CWC r2 = r7.A02
            java.lang.String r1 = "pause"
            goto L_0x0cae
        L_0x0b8d:
            X.CwF r11 = r7.A0D
            java.lang.Object r1 = r1.obj
            long r3 = X.C17880vN.A05(r1)
            boolean r1 = r11.A07
            if (r1 == 0) goto L_0x0ba7
            X.C26270CwF.A01(r11)     // Catch:{ RemoteException -> 0x0b9d }
            goto L_0x0ba7
        L_0x0b9d:
            r6 = move-exception
            X.Cye r5 = r11.A0B
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.String r1 = "Error occurs while ensureAndRecoverServicePlayer in play"
            A05(r5, r1, r6, r2)
        L_0x0ba7:
            X.Cye r5 = r11.A0B
            X.DGH r1 = r5.A0E
            r1.CA0()
            r11.A08 = r0
            long r1 = r5.A0N     // Catch:{ RemoteException -> 0x0bfb }
            r9 = 0
            int r6 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1O(r6)     // Catch:{ RemoteException -> 0x0bfb }
            if (r1 != 0) goto L_0x0bc5
            java.lang.String r1 = "Before play(), service player was evicted. Recover now"
            X.BE6.A1D(r5, r1)     // Catch:{ RemoteException -> 0x0bfb }
        L_0x0bc1:
            X.C26270CwF.A01(r11)     // Catch:{ RemoteException -> 0x0bfb }
            goto L_0x0c03
        L_0x0bc5:
            X.Cub r6 = X.C26270CwF.A00(r11)     // Catch:{ RemoteException -> 0x0bfb }
            long r1 = r5.A0N     // Catch:{ RemoteException -> 0x0bfb }
            java.lang.Object[] r10 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0bfb }
            X.AnonymousClass3MX.A1S(r10, r8, r1)     // Catch:{ RemoteException -> 0x0bfb }
            java.lang.String r9 = "id [%d]: play"
            X.Cyh r2 = X.C26204Cub.A02(r6, r9, r10, r1)     // Catch:{ RemoteException -> 0x0bfb }
            if (r2 != 0) goto L_0x0bde
            java.lang.String r1 = "When play(), service player is noticed to be evicted earlier. Recover now"
            X.C26270CwF.A06(r11, r5, r1)     // Catch:{ RemoteException -> 0x0bfb }
            goto L_0x0bc1
        L_0x0bde:
            java.util.concurrent.atomic.AtomicBoolean r1 = r6.A0I     // Catch:{ RemoteException -> 0x0bfb }
            boolean r1 = r1.compareAndSet(r0, r8)     // Catch:{ RemoteException -> 0x0bfb }
            r2.A0O(r3, r1)     // Catch:{ RemoteException -> 0x0bfb }
            X.DRp r1 = r6.A0A     // Catch:{ RemoteException -> 0x0bfb }
            boolean r1 = r1.enableBoostOngoingPrefetchPriorityPlay     // Catch:{ RemoteException -> 0x0bfb }
            if (r1 == 0) goto L_0x0c03
            X.CbZ r1 = r2.A10     // Catch:{ RemoteException -> 0x0bfb }
            if (r1 == 0) goto L_0x0c03
            X.D47 r1 = r1.A0C     // Catch:{ RemoteException -> 0x0bfb }
            java.lang.String r1 = r1.A0H     // Catch:{ RemoteException -> 0x0bfb }
            if (r1 == 0) goto L_0x0c03
            X.C26204Cub.A03(r6, r1)     // Catch:{ RemoteException -> 0x0bfb }
            goto L_0x0c03
        L_0x0bfb:
            r3 = move-exception
            java.lang.String r2 = "Error occurs while sending play request"
            java.lang.Object[] r1 = new java.lang.Object[r8]
            A05(r5, r2, r3, r1)
        L_0x0c03:
            X.CWC r2 = r7.A02
            java.lang.String r1 = "play"
            goto L_0x0cae
        L_0x0c09:
            X.CwF r3 = r7.A0D
            java.lang.Object r6 = r1.obj
            X.CbZ r6 = (X.C25238CbZ) r6
            X.Cye r4 = r3.A0B
            java.lang.Object[] r2 = new java.lang.Object[r2]
            X.D47 r9 = r6.A0C
            java.lang.Integer r1 = r9.A07
            java.lang.String r1 = X.CA5.A00(r1)
            r2[r8] = r1
            android.net.Uri r1 = r9.A05
            r2[r0] = r1
            java.lang.String r1 = "prepareInternal, playRequest: %s, url: %s"
            A06(r4, r1, r2)
            X.CbZ r5 = r3.A05
            if (r5 == 0) goto L_0x0c46
            java.lang.String r2 = "WA_BOT"
            java.lang.String r1 = r5.A05
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x0c46
            X.D47 r1 = r5.A0C
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x0c46
            java.lang.String r1 = "prepareInternal, unchanged video source, skip preparing"
            X.BE6.A1D(r4, r1)
        L_0x0c41:
            X.CWC r2 = r7.A02
            java.lang.String r1 = "prepare"
            goto L_0x0cae
        L_0x0c46:
            X.C26270CwF.A05(r3)
            r3.A05 = r6
            r3.A07 = r0
            X.DRp r1 = r4.A05
            boolean r5 = r1.enableFixForOnPreparingCallback
            if (r5 == 0) goto L_0x0c64
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.String r1 = "onPreparing"
            A06(r4, r1, r2)
            java.util.concurrent.atomic.AtomicInteger r1 = A0T
            r1.incrementAndGet()
            X.DGH r1 = r4.A0E
            r1.C1c()
        L_0x0c64:
            X.C26270CwF.A01(r3)     // Catch:{ RemoteException -> 0x0c68 }
            goto L_0x0c70
        L_0x0c68:
            r3 = move-exception
            java.lang.String r2 = "Error occurs while ensureAndRecoverServicePlayer in prepare"
            java.lang.Object[] r1 = new java.lang.Object[r8]
            A05(r4, r2, r3, r1)
        L_0x0c70:
            if (r5 != 0) goto L_0x0c41
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.String r1 = "onPreparing"
            A06(r4, r1, r2)
            java.util.concurrent.atomic.AtomicInteger r1 = A0T
            r1.incrementAndGet()
            X.DGH r1 = r4.A0E
            r1.C1c()
            goto L_0x0c41
        L_0x0c84:
            java.lang.Object r2 = r1.obj
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            X.CwF r9 = r7.A0D
            r1 = r2[r8]
            boolean r14 = X.AnonymousClass000.A1Y(r1)
            r1 = r2[r0]
            android.graphics.SurfaceTexture r1 = (android.graphics.SurfaceTexture) r1
            X.Cye r6 = r9.A0B
            long r4 = r6.A0N
            r2 = 0
            int r10 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            boolean r4 = X.AnonymousClass000.A1O(r10)
            if (r4 != 0) goto L_0x0cb2
            java.lang.String r1 = "Before pause(), service player was evicted. Lazy recover at next play()"
            X.BE6.A1D(r6, r1)
        L_0x0ca7:
            X.C26270CwF.A04(r9)
        L_0x0caa:
            X.CWC r2 = r7.A02
            java.lang.String r1 = "pauseAndMoveToWarmupPool"
        L_0x0cae:
            r2.A00(r1)
            return r0
        L_0x0cb2:
            X.CNc r5 = r6.A03
            X.Cub r11 = r5.A00
            if (r11 != 0) goto L_0x0cc0
            X.CKg r4 = r5.A01
            X.Cub r11 = r4.A00
            r5.A00 = r11
            if (r11 == 0) goto L_0x0d38
        L_0x0cc0:
            long r4 = r6.A0N
            java.lang.Object[] r12 = new java.lang.Object[r0]
            X.AnonymousClass3MX.A1S(r12, r8, r4)
            java.lang.String r10 = "id [%d]: pauseAndMoveToWarmup"
            X.Cyh r13 = X.C26204Cub.A02(r11, r10, r12, r4)
            if (r13 == 0) goto L_0x0d3f
            X.CbZ r10 = r13.A10
            android.view.Surface r12 = r13.A0H
            if (r10 == 0) goto L_0x0d3f
            if (r12 == 0) goto L_0x0d3f
            java.lang.Object[] r5 = new java.lang.Object[r8]
            java.lang.String r4 = "moveToWarmup"
            X.C26381Cyh.A0E(r13, r4, r5)
            android.os.Handler r8 = r13.A0l
            r5 = 42
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r14)
            X.BE7.A17(r8, r13, r4, r5)
            X.CiY r14 = r11.A0D
            long r4 = r13.A0k
            X.DRp r11 = r14.A03
            java.lang.String r13 = X.C25593CiY.A00(r10, r11)
            X.CPm r8 = new X.CPm
            r8.<init>(r13, r4)
            X.CNb r4 = new X.CNb
            r4.<init>(r1, r12)
            r8.A00 = r4
            android.util.LruCache r13 = r14.A00
            int r4 = r13.size()
            int r1 = r13.maxSize()
            if (r4 != r1) goto L_0x0d31
            java.util.Map r1 = r13.snapshot()
            java.util.Iterator r4 = X.AnonymousClass000.A15(r1)
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0d31
            java.util.Map$Entry r12 = X.AnonymousClass000.A16(r4)
            java.lang.Object r1 = r12.getKey()
            r13.remove(r1)
            android.util.LruCache r5 = r14.A01
            java.lang.Object r4 = r12.getKey()
            java.lang.Object r1 = r12.getValue()
            r5.put(r4, r1)
        L_0x0d31:
            java.lang.String r1 = X.C25593CiY.A00(r10, r11)
            r13.put(r1, r8)
        L_0x0d38:
            X.C26270CwF.A05(r9)
            r6.A0N = r2
            goto L_0x0caa
        L_0x0d3f:
            java.lang.String r1 = "When pause(), service player is noticed to be evicted earlier. Lazy recover at next play()"
            X.C26270CwF.A06(r9, r6, r1)
            goto L_0x0ca7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26378Cye.handleMessage(android.os.Message):boolean");
    }

    public static C26381Cyh A01(C26270CwF cwF, C26378Cye cye) {
        C26204Cub A002 = C26270CwF.A00(cwF);
        return A002.A0U.A00(cye.A0N);
    }

    public static void A02(C26378Cye cye, C0S c0s, C0Q c0q, String str, String str2, Throwable th) {
        CA0 ca0;
        A05(cye, str, th, BE6.A1Z());
        if (cye.A05.logStallOnPauseOnError) {
            ca0 = cye.A0A();
        } else {
            ca0 = null;
        }
        DGH dgh = cye.A0E;
        D49 A0E2 = C108965cb.A0E(cye);
        dgh.C0l(ca0, new C25951CpJ(c0s, c0q, str, ""), BE8.A0N(cye), A0E2, str2, "");
    }

    public void A0D() {
        A06(this, "release", BE6.A1Z());
        Handler handler = this.A0C;
        handler.sendMessage(handler.obtainMessage(8));
    }

    public void A0H(Surface surface) {
        Object[] A1a = AnonymousClass3MW.A1a();
        C17880vN.A1T(A1a, AnonymousClass001.A0k(surface), 0);
        A06(this, "setSurface %x", A1a);
        C108955ca.A1F(this.A0C, surface, 6);
        A0V.add(surface);
    }

    public C26378Cye(Looper looper, C28613EAh eAh, C26204Cub cub, C27066DRp dRp) {
        Handler handler = new Handler(looper);
        this.A0D = new C26270CwF(this);
        this.A0F = C17880vN.A0p();
        this.A0K = new long[]{0, 0};
        this.A08 = new AtomicReference(new D49());
        this.A0J = new AtomicReference(D40.A0D);
        this.A0H = AnonymousClass8BR.A14();
        this.A0I = new TreeMap();
        this.A06 = "";
        this.A01 = -1;
        this.A09 = false;
        this.A0N = 0;
        this.A0L = 1.0f;
        this.A00 = -1;
        this.A07 = AnonymousClass000.A13();
        this.A0G = C17880vN.A0p();
        this.A0A = false;
        BE6.A1D(this, "Create HeroPlayer");
        this.A0C = new Handler(looper, this);
        this.A0E = new DGH(handler, eAh);
        this.A03 = new C24859CNc(new C24787CKg(cub));
        this.A05 = dRp;
        this.A09 |= dRp.enableDebugLogs;
        this.A04 = new DGN(this);
        this.A02 = new CWC(dRp.enablePlayerActionStateLoggingInFlytrap);
        this.A0D.A06 = cub;
    }
}
