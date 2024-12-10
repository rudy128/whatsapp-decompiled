package X;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.PowerManager;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import java.io.IOException;
import java.util.AbstractList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Cyh  reason: case insensitive filesystem */
public class C26381Cyh implements Handler.Callback {
    public static int A17;
    public static final AtomicBoolean A18 = C108965cb.A0w();
    public static final AtomicReference A19 = new AtomicReference();
    public float A00 = 1.0f;
    public float A01;
    public int A02 = 1;
    public int A03 = 10;
    public int A04 = 1;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public Context A0D;
    public Handler A0E;
    public HandlerThread A0F;
    public Surface A0G;
    public Surface A0H;
    public Surface A0I;
    public CR1 A0J;
    public CU1 A0K = null;
    public C26029Cqn A0L;
    public E1O A0M;
    public C3S A0N;
    public DGK A0O;
    public CZ4 A0P;
    public E1P A0Q;
    public Integer A0R = null;
    public Integer A0S = AnonymousClass00R.A0N;
    public String A0T = "";
    public String A0U;
    public Map A0V;
    public AtomicReference A0W;
    public boolean A0X = false;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a = false;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public final long A0k;
    public final Handler A0l;
    public final C25018CTu A0m;
    public final C24795CKo A0n;
    public final DGM A0o;
    public final C27066DRp A0p;
    public final AtomicBoolean A0q;
    public final AtomicBoolean A0r;
    public final AtomicBoolean A0s;
    public final AtomicBoolean A0t;
    public final AtomicInteger A0u = new AtomicInteger();
    public final Map A0v = C17880vN.A11();
    public final AtomicInteger A0w = new AtomicInteger(0);
    public final AtomicReference A0x;
    public volatile D40 A0y = D40.A0D;
    public volatile D49 A0z = new D49();
    public volatile C25238CbZ A10;
    public volatile C25725Ckv A11 = new C25725Ckv();
    public volatile C26205Cuc A12;
    public volatile boolean A13;
    public volatile boolean A14;
    public volatile boolean A15;
    public volatile boolean A16;

    private void A05() {
        this.A10 = null;
        this.A0Z = false;
        this.A0S = AnonymousClass00R.A0N;
        this.A0b = false;
        this.A0a = false;
        this.A15 = false;
        this.A0j = false;
        this.A0f = false;
        this.A01 = 0.0f;
        this.A00 = 1.0f;
        this.A02 = 1;
        this.A0e = false;
        this.A04 = 1;
        this.A03 = 10;
        this.A08 = -1;
        this.A0Y = false;
        this.A13 = false;
        this.A0A = 0;
        this.A0z = new D49();
        this.A0y = D40.A0D;
        C26205Cuc cuc = this.A12;
        cuc.A0P.clear();
        cuc.A01.A0M.clear();
        this.A0g = false;
        this.A0q.set(true);
        this.A0i = false;
        this.A09 = -1;
        this.A0K = null;
        this.A0T = "";
        this.A0U = null;
        this.A12.A04 = null;
        if (this.A0p.improveLooping) {
            this.A12.A01.A08(0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0057, code lost:
        if (r1 > r0) goto L_0x0059;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A07(long r12) {
        /*
            r11 = this;
            r0 = 0
            X.D49 r7 = r11.A01(r12, r0)
            X.D49 r8 = r11.A0z
            X.DRp r6 = r11.A0p
            int r0 = r6.needUpdatePlayerStateThresholdMs
            long r2 = (long) r0
            int r0 = r6.needUpdateStateByPositionOffsetThresholdMs
            long r9 = (long) r0
            long r4 = r7.A0H
            long r0 = r8.A0H
            long r4 = r4 - r0
            boolean r1 = r7.A0R
            boolean r0 = r8.A0R
            if (r1 != r0) goto L_0x00b2
            boolean r1 = r7.A0U
            boolean r0 = r8.A0U
            if (r1 != r0) goto L_0x00b2
            boolean r1 = r7.A0P
            boolean r0 = r8.A0P
            if (r1 != r0) goto L_0x00b2
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x00b2
            float r1 = r7.A00
            float r0 = r8.A00
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x00b2
            long r2 = r7.A08
            long r0 = r8.A08
            long r2 = r2 - r0
            long r2 = r2 - r4
            long r1 = java.lang.Math.abs(r2)
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x00b2
            long r2 = r7.A0E
            long r0 = r8.A0E
            long r2 = r2 - r0
            long r2 = r2 - r4
            long r1 = java.lang.Math.abs(r2)
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x00b2
            int r1 = r11.A03
            int r0 = r6.checkPlayerStateIntervalIncreaseMs
            int r1 = r1 + r0
            r11.A03 = r1
            int r0 = r6.checkPlayerStateMaxIntervalMs
            if (r1 <= r0) goto L_0x005b
        L_0x0059:
            r11.A03 = r0
        L_0x005b:
            X.CbZ r0 = r11.A10
            if (r0 == 0) goto L_0x0089
            X.CbZ r0 = r11.A10
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0089
            boolean r0 = r6.enableLiveBroadcastErrorUI
            if (r0 == 0) goto L_0x0089
            X.D40 r0 = r11.A0y
            int r1 = r0.A00
            int r0 = r6.staleManifestThresholdToShowInterruptUI
            r3 = 1
            r2 = 0
            boolean r1 = X.C108975cc.A1C(r1, r0)
            boolean r0 = r11.A0c
            if (r0 != 0) goto L_0x00a3
            if (r1 == 0) goto L_0x0089
            int r1 = r11.A04
            r0 = 2
            if (r1 != r0) goto L_0x0089
            X.DGM r0 = r11.A0o
            r0.Bwm(r3)
            r11.A0c = r3
        L_0x0089:
            X.CbZ r1 = r11.A10
            android.os.Handler r3 = r11.A0l
            r2 = 10
            r3.removeMessages(r2)
            boolean r0 = r11.A15
            if (r0 == 0) goto L_0x00a2
            if (r1 == 0) goto L_0x00bc
            boolean r0 = r1.A07
            if (r0 == 0) goto L_0x00bc
            int r1 = android.os.Build.VERSION.SDK_INT
            int r0 = r6.sdkVersionToBypassHeroStateRefresh
            if (r1 > r0) goto L_0x00bc
        L_0x00a2:
            return
        L_0x00a3:
            if (r1 == 0) goto L_0x00aa
            int r1 = r11.A04
            r0 = 3
            if (r1 != r0) goto L_0x0089
        L_0x00aa:
            X.DGM r0 = r11.A0o
            r0.Bwm(r2)
            r11.A0c = r2
            goto L_0x0089
        L_0x00b2:
            X.DGM r0 = r11.A0o
            r0.C0s(r7)
            r11.A0z = r7
            int r0 = r6.checkPlayerStateMinIntervalMs
            goto L_0x0059
        L_0x00bc:
            int r0 = r11.A03
            long r0 = (long) r0
            r3.sendEmptyMessageDelayed(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26381Cyh.A07(long):void");
    }

    private void A0I(boolean z) {
        A0E(this, "enableVideoTrackInternal", new Object[0]);
        if (this.A12.A03(0) == -1 && z) {
            C25905CoJ.A00(this, "HeroService", "Enable video track", new Object[0]);
            this.A12.A06(0, 0);
        } else if (this.A12.A03(0) != -1 && !z) {
            C25905CoJ.A00(this, "HeroService", "Disable video track", new Object[0]);
            this.A12.A06(0, -1);
        }
    }

    private void A0J(boolean z) {
        A0E(this, "resetInternal", new Object[0]);
        if (this.A14) {
            this.A0o.CAR("EXOPLAYER2_UNEXPECTED", "RESET_INTERNAL_REQUESTED_AFTER_RELEASED", "resetInternal requested after released");
        }
        A0L(false, (String) null);
        C27066DRp dRp = this.A0p;
        if (!dRp.enablePauseNow) {
            A06(this.A04, SystemClock.elapsedRealtime(), false, false);
        }
        Surface surface = this.A0H;
        if (dRp.releaseSurfaceInServicePlayerReset) {
            this.A0I = null;
            this.A0G = null;
            this.A0H = null;
            this.A0C = -1;
            this.A07 = -1;
            A09((Surface) null, this, true);
        }
        this.A0H = surface;
        this.A12.A01.A0C(true);
        D9J d9j = this.A12.A01.A0I;
        if (d9j.A0n) {
            d9j.A0h.A01(0);
        }
        d9j.A0f.A01(0);
        A05();
        this.A12.A09(this.A0O);
        if (z) {
            this.A0l.removeMessages(9);
        }
    }

    private void A0K(boolean z) {
        C26206Cue cue;
        A0E(this, "retryInternal", new Object[0]);
        if (!(!z || (cue = this.A12.A01) == null || cue.A07.A00 == 1)) {
            BE6.A1E(this, "Stopping non idle exoplayer", 0);
            this.A12.A01.A0C(false);
        }
        C26206Cue cue2 = this.A12.A01;
        E9e e9e = cue2.A09;
        if (e9e != null && cue2.A07.A00 == 1) {
            cue2.A0B(e9e, false, false);
        }
    }

    public void A0N() {
        BE6.A1E(this, C17900vP.A0D("Enabling Text Track: ", AnonymousClass000.A10(), false), 0);
        BE7.A17(this.A0l, this, false, 34);
    }

    public void A0O(long j, boolean z) {
        A0E(this, "Play", new Object[0]);
        this.A0q.set(false);
        this.A0r.compareAndSet(false, z);
        Handler handler = this.A0l;
        Object[] A1a = AnonymousClass3MW.A1a();
        AnonymousClass3MX.A1S(A1a, 0, j);
        BE7.A17(handler, this, A1a, 2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0039, code lost:
        if (r0.A15 == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x011a, code lost:
        if (r5.A09(r1.A0J, r1.A04(), 0).A0A == false) goto L_0x011c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private X.D49 A01(long r59, boolean r61) {
        /*
            r58 = this;
            r7 = 0
            r2 = -1
            r6 = 0
            r0 = r58
            r26 = r59
            if (r61 == 0) goto L_0x015b
            long r4 = r0.A08
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 <= 0) goto L_0x015b
            boolean r11 = r0.A0Y
            r0.A08 = r2
            r0.A0Y = r6
            r44 = r26
        L_0x0019:
            long r2 = r0.A09
            int r1 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r1 > 0) goto L_0x0029
            X.Cuc r1 = r0.A12
            X.Cue r1 = r1.A01
            long r1 = r1.A05()
            r0.A09 = r1
        L_0x0029:
            X.Cuc r1 = r0.A12
            X.Cl2 r10 = r1.A03
            X.Cuc r1 = r0.A12
            X.Cue r1 = r1.A01
            boolean r1 = r1.A0E
            if (r1 == 0) goto L_0x003b
            boolean r1 = r0.A15
            r52 = 1
            if (r1 != 0) goto L_0x003d
        L_0x003b:
            r52 = 0
        L_0x003d:
            boolean r1 = r0.A0j
            r17 = r1
            long r1 = r0.A08
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            boolean r54 = X.AnonymousClass000.A1R(r3)
            long r1 = r0.A09
            r20 = r1
            X.Cuc r1 = r0.A12
            long r32 = r1.A04()
            X.Cuc r1 = r0.A12
            X.Cue r1 = r1.A01
            X.D9J r6 = r1.A0I
            boolean r1 = r6.A0n
            r2 = 1000(0x3e8, double:4.94E-321)
            if (r1 == 0) goto L_0x0153
            X.DA1 r1 = r6.A0h
            long r34 = r1.BXM()
        L_0x0065:
            long r34 = r34 / r2
            X.Cuc r2 = r0.A12
            X.DRp r1 = r2.A0O
            boolean r1 = r1.isExo2UseAbsolutePosition
            if (r1 == 0) goto L_0x013d
            X.Cue r1 = r2.A01
            X.CqU r1 = r1.A07
            long r1 = r1.A0C
            java.util.UUID r3 = X.C24736CHy.A04
            long r1 = com.facebook.android.exoplayer2.util.Util.A05(r1)
        L_0x007b:
            X.Cuc r3 = r0.A12
            X.Cue r3 = r3.A01
            X.CqU r3 = r3.A07
            long r6 = r3.A0B
            java.util.UUID r3 = X.C24736CHy.A04
            long r38 = com.facebook.android.exoplayer2.util.Util.A05(r6)
            X.Cuc r3 = r0.A12
            X.EAG r3 = r3.A02
            if (r3 == 0) goto L_0x013a
            X.CbB r3 = r3.BMx()
            if (r3 == 0) goto L_0x013a
            int r3 = r3.A00()
        L_0x0099:
            long r14 = (long) r3
            java.lang.Integer r3 = r0.A0S
            int r3 = r3.intValue()
            switch(r3) {
                case 1: goto L_0x0136;
                case 2: goto L_0x0132;
                case 3: goto L_0x012e;
                case 4: goto L_0x012a;
                case 5: goto L_0x0126;
                default: goto L_0x00a3;
            }
        L_0x00a3:
            java.lang.String r16 = "UNKNOWN"
        L_0x00a5:
            r18 = 0
            long r12 = r0.A0A
            X.CU1 r3 = r0.A0K
            if (r3 == 0) goto L_0x0122
            int r6 = r3.A03
            int r7 = r3.A0A
            int r6 = r6 + r7
            int r9 = r3.A07
            int r8 = r3.A00
        L_0x00b6:
            float r10 = r10.A01
            X.Cuc r3 = r0.A12
            X.Cue r3 = r3.A01
            int r25 = r3.A04()
            X.Cuc r3 = r0.A12
            if (r3 == 0) goto L_0x0120
            X.CUI r3 = r3.A05
            if (r3 == 0) goto L_0x0120
            boolean r7 = r3.A0C
        L_0x00ca:
            r48 = -1
            r30 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            X.D49 r3 = new X.D49
            r22 = r18
            r24 = r18
            r57 = r18
            r19 = r18
            r28 = r20
            r36 = r1
            r40 = r14
            r42 = r4
            r46 = r12
            r50 = r48
            r53 = r17
            r55 = r11
            r56 = r7
            r15 = r3
            r17 = r10
            r20 = r6
            r21 = r9
            r23 = r8
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r28, r30, r32, r34, r36, r38, r40, r42, r44, r46, r48, r50, r52, r53, r54, r55, r56, r57)
            X.Cuc r0 = r0.A12
            X.Cue r1 = r0.A01
            X.CqU r0 = r1.A07
            com.facebook.android.exoplayer2.Timeline r5 = r0.A03
            int r0 = r5.A01()
            boolean r0 = X.AnonymousClass000.A1P(r0)
            if (r0 != 0) goto L_0x011c
            int r4 = r1.A04()
            X.ClG r2 = r1.A0J
            r0 = 0
            X.ClG r0 = r5.A09(r2, r4, r0)
            boolean r1 = r0.A0A
            r0 = 1
            if (r1 != 0) goto L_0x011d
        L_0x011c:
            r0 = 0
        L_0x011d:
            r3.A0T = r0
            return r3
        L_0x0120:
            r7 = 0
            goto L_0x00ca
        L_0x0122:
            r6 = 0
            r9 = 0
            r8 = 0
            goto L_0x00b6
        L_0x0126:
            java.lang.String r16 = "HLS"
            goto L_0x00a5
        L_0x012a:
            java.lang.String r16 = "RTC_LIVE"
            goto L_0x00a5
        L_0x012e:
            java.lang.String r16 = "PROGRESSIVE_DOWNLOAD"
            goto L_0x00a5
        L_0x0132:
            java.lang.String r16 = "DASH_LIVE"
            goto L_0x00a5
        L_0x0136:
            java.lang.String r16 = "DASH"
            goto L_0x00a5
        L_0x013a:
            r3 = 0
            goto L_0x0099
        L_0x013d:
            X.Cue r3 = r2.A01
            boolean r1 = X.C26206Cue.A03(r3)
            if (r1 == 0) goto L_0x0149
            long r1 = r3.A05
            goto L_0x007b
        L_0x0149:
            X.CqU r1 = r3.A07
            long r1 = r1.A0C
            long r1 = X.C26206Cue.A00(r3, r1)
            goto L_0x007b
        L_0x0153:
            X.DA0 r1 = r6.A0f
            long r34 = r1.BXM()
            goto L_0x0065
        L_0x015b:
            r4 = -1
            r44 = -1
            r11 = 0
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26381Cyh.A01(long, boolean):X.D49");
    }

    private C27064DRk A02() {
        C26185Cu9 cu9;
        int A002;
        int i;
        C27066DRp dRp = this.A0p;
        if (dRp.useNetworkAwareSettingsForUnstallBuffer && (cu9 = (C26185Cu9) this.A0x.get()) != null) {
            if (this.A10 != null && this.A10.A00()) {
                A002 = C26185Cu9.A00(cu9, 4);
                i = 5;
            } else if (this.A10 == null || !"fb_stories".equalsIgnoreCase(this.A10.A0C.A0B) || dRp.disableStoriesCustomizedUnstallBuffer) {
                A002 = C26185Cu9.A00(cu9, 2);
                i = 3;
            } else {
                A002 = C26185Cu9.A00(cu9, 6);
                i = 7;
            }
            C27064DRk dRk = new C27064DRk(A002, C26185Cu9.A00(cu9, i));
            if (dRk.minBufferMs > 0 && dRk.minRebufferMs > 0) {
                return dRk;
            }
        }
        if (this.A10 != null && this.A10.A00()) {
            C27064DRk dRk2 = dRp.unstallBufferSettingLive;
            if (dRk2.minBufferMs > 0 && dRk2.minRebufferMs > 0) {
                return dRk2;
            }
        }
        return dRp.unstallBufferSetting;
    }

    private String A03() {
        if (this.A10 == null || this.A10.A0C.A05 == null) {
            return "";
        }
        return this.A10.A0C.A05.toString();
    }

    private String A04() {
        C25238CbZ cbZ = this.A10;
        if (cbZ != null) {
            return cbZ.A0C.A0H;
        }
        return null;
    }

    public static void A08(Message message, C26381Cyh cyh) {
        if (!cyh.A14) {
            cyh.A0l.sendMessage(message);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003d, code lost:
        X.AnonymousClass8BS.A0x();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A09(android.view.Surface r3, X.C26381Cyh r4, boolean r5) {
        /*
            X.Cuc r0 = r4.A12
            X.Cue r2 = r0.A01
            X.ECg[] r1 = r0.A0E
            r0 = 0
            r0 = r1[r0]
            X.Cbw r2 = r2.A06(r0)
            r0 = 1
            r2.A01(r0)
            r2.A02(r3)
            r2.A00()
            if (r5 == 0) goto L_0x0040
            monitor-enter(r2)     // Catch:{ InterruptedException -> 0x003d }
            boolean r0 = r2.A07     // Catch:{ all -> 0x003a }
            X.C26056CrS.A03(r0)     // Catch:{ all -> 0x003a }
            android.os.Looper r0 = r2.A03     // Catch:{ all -> 0x003a }
            java.lang.Thread r1 = r0.getThread()     // Catch:{ all -> 0x003a }
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x003a }
            boolean r0 = X.AnonymousClass3Ma.A1Z(r1, r0)
            X.C26056CrS.A03(r0)     // Catch:{ all -> 0x003a }
        L_0x0030:
            boolean r0 = r2.A06     // Catch:{ all -> 0x003a }
            if (r0 != 0) goto L_0x0038
            r2.wait()     // Catch:{ all -> 0x003a }
            goto L_0x0030
        L_0x0038:
            monitor-exit(r2)     // Catch:{ InterruptedException -> 0x003d }
            goto L_0x0040
        L_0x003a:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ InterruptedException -> 0x003d }
            throw r0     // Catch:{ InterruptedException -> 0x003d }
        L_0x003d:
            X.AnonymousClass8BS.A0x()
        L_0x0040:
            r4.A0G = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26381Cyh.A09(android.view.Surface, X.Cyh, boolean):void");
    }

    public static void A0A(C26381Cyh cyh) {
        if (cyh.A0Z && cyh.A13) {
            BE6.A1E(cyh, "Call ExoPlayer.prepare()", 0);
            C26205Cuc cuc = cyh.A12;
            boolean z = cyh.A0h;
            E9e e9e = cuc.A04;
            if (e9e != null) {
                cuc.A01.A0B(e9e, z, true);
            }
            if (cyh.A0h) {
                cyh.A0h = false;
            }
            C27066DRp dRp = cyh.A0p;
            if (dRp.forceStereoToMonoConversion) {
                A0E(cyh, "convertStereoToMono", new Object[0]);
                BE7.A17(cyh.A0l, cyh, true, 32);
            }
            if (dRp.enableWifiLockManager) {
                throw AnonymousClass000.A0s("isOnWifi");
            }
            C25238CbZ cbZ = cyh.A10;
            Set set = dRp.wakelockOriginLists;
            if (!set.isEmpty() && cbZ != null && (set.contains("all_origin") || set.contains(cbZ.A0C.A0C))) {
                cyh.A0Q(true);
            }
            cyh.A13 = false;
        }
    }

    public static void A0E(C26381Cyh cyh, String str, Object... objArr) {
        C25905CoJ.A00(cyh, "HeroServicePlayer", str, objArr);
    }

    public static void A0F(C26381Cyh cyh, boolean z) {
        long j = cyh.A0C;
        if (j != -1 && z) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - j;
            cyh.A07 = elapsedRealtime;
            Object[] A1a = AnonymousClass3MW.A1a();
            BE8.A1N(A1a, elapsedRealtime);
            C25905CoJ.A00(cyh, "HeroService", "blackscreen detected for %d ms", A1a);
            cyh.A0C = -1;
        }
    }

    private void A0G(Exception exc) {
        C24399C1u c1u;
        if (exc instanceof BOK) {
            c1u = (C24399C1u) exc;
        } else if (exc instanceof IOException) {
            c1u = BOK.A00(exc, 0, 2000);
        } else if (exc instanceof RuntimeException) {
            c1u = BOK.A00(exc, 2, 1000);
        } else {
            c1u = null;
        }
        A0P(c1u, C0Q.A0V);
    }

    private void A0H(String str) {
        String str2 = this.A0U;
        if (str2 != null) {
            str = AnonymousClass001.A1H("; ", str, AnonymousClass000.A11(str2));
        }
        this.A0U = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0063, code lost:
        r1 = X.AnonymousClass8BS.A0t("Proxy-Status", r1);
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0071  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0P(X.C24399C1u r18, X.C0Q r19) {
        /*
            r17 = this;
            r7 = r19
            X.C0S r6 = X.C0S.A0N
            r11 = r18
            java.lang.String r10 = r11.getMessage()
            java.lang.Throwable r0 = r11.getCause()
            boolean r0 = r0 instanceof java.io.IOException
            r12 = 0
            r9 = 1
            java.lang.String r3 = ""
            r16 = r3
            r5 = r17
            if (r0 == 0) goto L_0x023b
            java.lang.Throwable r2 = r11.getCause()
            boolean r0 = r2 instanceof X.C24215BxS
            if (r0 == 0) goto L_0x0026
            X.C0Q r7 = X.C0Q.A01
            X.C0S r6 = X.C0S.A02
        L_0x0026:
            boolean r0 = r2 instanceof X.BPM
            if (r0 != 0) goto L_0x0036
            java.lang.Throwable r0 = r2.getCause()
            boolean r0 = r0 instanceof X.BPM
            if (r0 == 0) goto L_0x0077
            java.lang.Throwable r2 = r2.getCause()
        L_0x0036:
            X.BPM r2 = (X.BPM) r2
            if (r2 == 0) goto L_0x0077
            int r1 = r2.responseCode
            r0 = 200(0xc8, float:2.8E-43)
            r3 = 417(0x1a1, float:5.84E-43)
            if (r1 == r0) goto L_0x0214
            r0 = 302(0x12e, float:4.23E-43)
            if (r1 == r0) goto L_0x0210
            r0 = 410(0x19a, float:5.75E-43)
            if (r1 == r0) goto L_0x020c
            if (r1 == r3) goto L_0x0214
            r0 = 429(0x1ad, float:6.01E-43)
            if (r1 == r0) goto L_0x0208
            r0 = 500(0x1f4, float:7.0E-43)
            if (r1 == r0) goto L_0x0204
            r0 = 403(0x193, float:5.65E-43)
            if (r1 == r0) goto L_0x0200
            r0 = 404(0x194, float:5.66E-43)
            if (r1 == r0) goto L_0x01fc
            switch(r1) {
                case 502: goto L_0x01f8;
                case 503: goto L_0x01f4;
                case 504: goto L_0x01f0;
                default: goto L_0x005f;
            }
        L_0x005f:
            java.util.Map r1 = r2.headerFields
            if (r1 == 0) goto L_0x01ed
            java.lang.String r0 = "Proxy-Status"
            java.util.List r1 = X.AnonymousClass8BS.A0t(r0, r1)
            if (r1 == 0) goto L_0x01ed
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x01ed
            java.lang.Object r3 = X.C108955ca.A0p(r1)
            java.lang.String r3 = (java.lang.String) r3
        L_0x0077:
            r2 = 5
            r15 = 0
            if (r10 == 0) goto L_0x01bd
            java.lang.String r0 = "TigonError"
            boolean r0 = r10.contains(r0)
            if (r0 == 0) goto L_0x01bd
            X.C0Q r7 = X.C0Q.A0P
            java.lang.String r0 = "TigonLigerErrorDomain"
            boolean r0 = r10.contains(r0)
            if (r0 == 0) goto L_0x01a5
            X.C0S r6 = X.C0S.A1M
        L_0x008f:
            X.C0Q r0 = X.C0Q.A08
            if (r7 != r0) goto L_0x00a0
            r13 = r11
            java.lang.String r10 = r11.getMessage()
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 == 0) goto L_0x010c
            java.lang.String r10 = "Decoder init failed"
        L_0x00a0:
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            r8 = 2
            if (r0 == 0) goto L_0x00c5
            java.lang.Throwable r0 = r11.getCause()
            if (r0 == 0) goto L_0x0107
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.String r0 = X.C108955ca.A0x(r11)
            r1[r15] = r0
            java.lang.Throwable r0 = r11.getCause()
            java.lang.String r0 = X.C108955ca.A0x(r0)
            r1[r9] = r0
            java.lang.String r0 = "%s. Cause: %s"
            java.lang.String r10 = java.lang.String.format(r0, r1)
        L_0x00c5:
            X.C0S r0 = X.C0S.A0X
            if (r6 != r0) goto L_0x02b0
            java.lang.Throwable r14 = r11.getCause()
            r13 = 1
        L_0x00ce:
            if (r14 == 0) goto L_0x02b0
            java.lang.Throwable r0 = r14.getCause()
            if (r0 == 0) goto L_0x02b0
            java.lang.Throwable r0 = r14.getCause()
            java.lang.String r1 = X.C108955ca.A0x(r0)
            boolean r0 = r10.contains(r1)
            if (r0 != 0) goto L_0x00fe
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r4[r15] = r10
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            r4[r9] = r0
            X.BE7.A1F(r1, r0, r4)
            java.lang.String r1 = X.BE7.A0p(r14)
            r0 = 4
            r4[r0] = r1
            java.lang.String r0 = "%s [Cause%d: %s; Message%d: %s]"
            java.lang.String r10 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe((java.lang.String) r0, (java.lang.Object[]) r4)
        L_0x00fe:
            java.lang.Throwable r14 = r14.getCause()
            int r13 = r13 + 1
            if (r13 >= r2) goto L_0x02b0
            goto L_0x00ce
        L_0x0107:
            java.lang.String r10 = X.C108955ca.A0x(r11)
            goto L_0x00c5
        L_0x010c:
            java.lang.String r0 = ","
            java.lang.String[] r0 = r10.split(r0)
            r1 = r0[r15]
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x011b
            r10 = r1
        L_0x011b:
            java.lang.Throwable r0 = r11.getCause()
            java.lang.String r8 = "%s. Cause: %s"
            r1 = 2
            if (r0 == 0) goto L_0x019c
            java.lang.String r0 = X.BE7.A0p(r11)
            if (r0 == 0) goto L_0x019c
            java.lang.Object[] r4 = new java.lang.Object[r1]
            r4[r15] = r10
            java.lang.String r0 = X.BE7.A0p(r11)
        L_0x0132:
            java.lang.String r10 = X.AnonymousClass8BS.A0l(r0, r8, r4, r9)
            X.DRp r0 = r5.A0p
            boolean r0 = r0.enableAdditionalDecoderInitFailureMessage
            if (r0 == 0) goto L_0x0168
            java.lang.Throwable r0 = r11.getCause()
            if (r0 == 0) goto L_0x0197
            java.lang.Throwable r0 = r11.getCause()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            if (r0 == 0) goto L_0x0197
            java.lang.Throwable r0 = r11.getCause()
            java.lang.String r8 = android.util.Log.getStackTraceString(r0)
        L_0x0154:
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x0168
            java.lang.StringBuilder r4 = X.AnonymousClass000.A11(r10)
            java.lang.String r0 = ". Stack Track: "
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r4)
            java.lang.String r10 = X.C17900vP.A0A(r0, r8)
        L_0x0168:
            java.lang.Throwable r0 = r13.getCause()
            boolean r0 = r0 instanceof X.C2Q
            if (r0 == 0) goto L_0x0190
            java.lang.Throwable r0 = r13.getCause()
            X.C2Q r0 = (X.C2Q) r0
            java.lang.String r0 = r0.diagnosticInfo
            if (r0 == 0) goto L_0x0190
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r15] = r10
            java.lang.Throwable r0 = r13.getCause()
            X.C2Q r0 = (X.C2Q) r0
            java.lang.String r0 = r0.diagnosticInfo
            r1[r9] = r0
            java.lang.String r0 = "%s. DiagnosticInfo: %s"
            java.lang.String r10 = java.lang.String.format(r12, r0, r1)
            goto L_0x00a0
        L_0x0190:
            java.lang.Throwable r13 = r13.getCause()
            if (r13 == 0) goto L_0x00a0
            goto L_0x0168
        L_0x0197:
            java.lang.String r8 = android.util.Log.getStackTraceString(r11)
            goto L_0x0154
        L_0x019c:
            java.lang.Object[] r4 = new java.lang.Object[r1]
            r4[r15] = r10
            java.lang.Throwable r0 = r11.getCause()
            goto L_0x0132
        L_0x01a5:
            java.lang.String r0 = "TigonIdleTimeoutDomain"
            boolean r0 = r10.contains(r0)
            if (r0 == 0) goto L_0x01b1
            X.C0S r6 = X.C0S.A1L
            goto L_0x008f
        L_0x01b1:
            java.lang.String r0 = "TigonConnectionTimeoutDomain"
            boolean r0 = r10.contains(r0)
            if (r0 == 0) goto L_0x008f
            X.C0S r6 = X.C0S.A1K
            goto L_0x008f
        L_0x01bd:
            X.C0S r8 = X.C0S.A0F
            if (r6 != r8) goto L_0x01c5
            X.C0Q r7 = X.C0Q.A08
            goto L_0x008f
        L_0x01c5:
            X.C0S r0 = X.C0S.A0P
            if (r6 != r0) goto L_0x01cd
            X.C0Q r7 = X.C0Q.A0I
            goto L_0x008f
        L_0x01cd:
            r4 = r11
            r1 = 0
        L_0x01cf:
            java.lang.Throwable r0 = r4.getCause()
            if (r0 == 0) goto L_0x008f
            java.lang.Throwable r0 = r4.getCause()
            boolean r0 = r0 instanceof X.C2Q
            if (r0 == 0) goto L_0x01e2
            X.C0Q r7 = X.C0Q.A08
            r6 = r8
            goto L_0x008f
        L_0x01e2:
            java.lang.Throwable r4 = r4.getCause()
            int r1 = r1 + 1
            if (r1 >= r2) goto L_0x008f
            if (r4 == 0) goto L_0x008f
            goto L_0x01cf
        L_0x01ed:
            r3 = 0
            goto L_0x0077
        L_0x01f0:
            X.C0S r6 = X.C0S.A1B
            goto L_0x005f
        L_0x01f4:
            X.C0S r6 = X.C0S.A1A
            goto L_0x005f
        L_0x01f8:
            X.C0S r6 = X.C0S.A19
            goto L_0x005f
        L_0x01fc:
            X.C0S r6 = X.C0S.A14
            goto L_0x005f
        L_0x0200:
            X.C0S r6 = X.C0S.A13
            goto L_0x005f
        L_0x0204:
            X.C0S r6 = X.C0S.A18
            goto L_0x005f
        L_0x0208:
            X.C0S r6 = X.C0S.A17
            goto L_0x005f
        L_0x020c:
            X.C0S r6 = X.C0S.A15
            goto L_0x005f
        L_0x0210:
            X.C0S r6 = X.C0S.A12
            goto L_0x005f
        L_0x0214:
            r5.A0a = r9
            java.util.Map r1 = r2.headerFields
            java.lang.String r0 = "x-fb-video-replica"
            java.util.List r1 = X.AnonymousClass8BS.A0t(r0, r1)
            if (r1 == 0) goto L_0x0234
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0234
            java.lang.Object r10 = X.C108955ca.A0p(r1)
            java.lang.String r10 = (java.lang.String) r10
        L_0x022c:
            int r0 = r2.responseCode
            if (r0 != r3) goto L_0x0237
            X.C0S r6 = X.C0S.A16
            goto L_0x005f
        L_0x0234:
            java.lang.String r10 = "invalid-replica-number"
            goto L_0x022c
        L_0x0237:
            X.C0S r6 = X.C0S.A0P
            goto L_0x005f
        L_0x023b:
            java.lang.String r0 = r11.getMessage()
            java.lang.String r1 = "Decoder init failed"
            if (r0 == 0) goto L_0x0251
            java.lang.String r0 = r11.getMessage()
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0251
        L_0x024d:
            X.C0S r6 = X.C0S.A0F
            goto L_0x0077
        L_0x0251:
            java.lang.Throwable r0 = r11.getCause()
            if (r0 == 0) goto L_0x0272
            java.lang.String r0 = X.BE7.A0p(r11)
            if (r0 == 0) goto L_0x0272
            java.lang.String r0 = X.BE7.A0p(r11)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0272
            java.lang.String r0 = X.BE7.A0p(r11)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0272
            goto L_0x024d
        L_0x0272:
            java.lang.Throwable r0 = r11.getCause()
            boolean r0 = r0 instanceof X.C24401C1w
            if (r0 == 0) goto L_0x027e
            X.C0S r6 = X.C0S.A03
            goto L_0x0077
        L_0x027e:
            java.lang.Throwable r0 = r11.getCause()
            boolean r1 = r0 instanceof java.lang.IllegalStateException
            java.lang.Throwable r0 = r11.getCause()
            if (r1 == 0) goto L_0x02a4
            java.lang.String r0 = r0.getMessage()
            if (r0 == 0) goto L_0x02a0
            java.lang.String r1 = X.BE7.A0p(r11)
            java.lang.String r0 = "Media source is null"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x02a0
            X.C0S r6 = X.C0S.A0u
            goto L_0x0077
        L_0x02a0:
            X.C0S r6 = X.C0S.A0X
            goto L_0x0077
        L_0x02a4:
            boolean r0 = r0 instanceof X.C24414C2n
            if (r0 == 0) goto L_0x02ac
            X.C0S r6 = X.C0S.A1O
            goto L_0x0077
        L_0x02ac:
            X.C0S r6 = X.C0S.A0x
            goto L_0x0077
        L_0x02b0:
            boolean r0 = r11 instanceof X.BOK
            if (r0 == 0) goto L_0x031a
            r4 = r11
            X.BOK r4 = (X.BOK) r4
            int r0 = r4.type
            if (r0 != r9) goto L_0x031a
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r10)
            java.lang.String r0 = ". Renderer index="
            r1.append(r0)
            int r10 = r4.rendererIndex
            r1.append(r10)
            java.lang.String r0 = ", type="
            r1.append(r0)
            X.Cuc r0 = r5.A12
            if (r0 == 0) goto L_0x03e6
            X.ECg[] r0 = r0.A0E
            if (r0 != 0) goto L_0x03d0
            java.lang.String r0 = "?"
        L_0x02d8:
            r1.append(r0)
            java.lang.String r0 = ", format="
            r1.append(r0)
            X.D48 r0 = r4.rendererFormat
            r1.append(r0)
            java.lang.String r0 = ", rendererSupport="
            r1.append(r0)
            int r0 = r4.rendererFormatSupport
            java.lang.String r0 = com.facebook.android.exoplayer2.util.Util.A07(r0)
            java.lang.String r10 = X.AnonymousClass000.A0y(r0, r1)
            int r0 = r4.type
            boolean r0 = X.BE8.A1T(r0)
            X.C26056CrS.A03(r0)
            java.lang.Throwable r1 = r4.getCause()
            X.C26056CrS.A01(r1)
            java.lang.Exception r1 = (java.lang.Exception) r1
            boolean r0 = r1 instanceof X.C2Q
            if (r0 == 0) goto L_0x03bf
            X.C2Q r1 = (X.C2Q) r1
            X.Csn r0 = r1.codecInfo
            if (r0 != 0) goto L_0x03bb
            java.lang.Throwable r0 = r1.getCause()
            boolean r0 = r0 instanceof X.C1L
            if (r0 == 0) goto L_0x03af
            java.lang.String r12 = "error querying decoder"
        L_0x031a:
            X.DRp r4 = r5.A0p
            boolean r0 = r4.enableUnexpectedExoExceptionLogging
            if (r0 == 0) goto L_0x033e
            X.C0S r0 = X.C0S.A0x
            if (r6 != r0) goto L_0x033e
            X.C0Q r0 = X.C0Q.A0G
            if (r7 != r0) goto L_0x033e
            java.lang.String r11 = android.util.Log.getStackTraceString(r11)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "message: "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = " stacktrace: "
            java.lang.String r10 = X.AnonymousClass001.A1H(r0, r11, r1)
        L_0x033e:
            X.CpJ r11 = new X.CpJ
            r11.<init>(r6, r7, r10, r3)
            if (r12 == 0) goto L_0x0347
            r11.A00 = r12
        L_0x0347:
            java.lang.String r3 = r11.A03
            r5.A0T = r3
            android.os.Handler r10 = r5.A0l
            java.lang.Object[] r7 = new java.lang.Object[r2]
            X.C0Q r6 = r11.A02
            java.lang.String r0 = r6.value
            r7[r15] = r0
            X.C0S r0 = r11.A01
            java.lang.String r2 = r0.name()
            r7[r9] = r2
            r7[r8] = r3
            java.lang.String r1 = r11.A04
            if (r1 != 0) goto L_0x0365
            r1 = r16
        L_0x0365:
            r0 = 3
            r7[r0] = r1
            java.lang.String r0 = r11.A00
            if (r0 == 0) goto L_0x036e
            r16 = r0
        L_0x036e:
            r0 = 4
            r7[r0] = r16
            r0 = 12
            X.BE7.A17(r10, r5, r7, r0)
            boolean r0 = r4.reportExceptionsAsSoftErrors
            if (r0 == 0) goto L_0x03ae
            java.util.Set r1 = r4.softErrorErrorDomainBlacklist
            java.lang.String r0 = r6.name()
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x03ae
            java.util.Set r0 = r4.softErrorErrorCodeBlacklist
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x03ae
            if (r3 == 0) goto L_0x03ae
            java.util.Set r0 = r4.softErrorErrorMessageBlacklist
            java.util.Iterator r2 = r0.iterator()
        L_0x0396:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x03ae
            java.lang.String r1 = X.C17880vN.A0v(r2)
            if (r1 == 0) goto L_0x0396
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0396
            boolean r0 = r3.contains(r1)
            if (r0 == 0) goto L_0x0396
        L_0x03ae:
            return
        L_0x03af:
            boolean r0 = r1.secureDecoderRequired
            if (r0 == 0) goto L_0x03b7
            java.lang.String r12 = "error no secure decoder"
            goto L_0x031a
        L_0x03b7:
            java.lang.String r12 = "no secure decoder"
            goto L_0x031a
        L_0x03bb:
            java.lang.String r12 = "error instantiating decoder"
            goto L_0x031a
        L_0x03bf:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "exoplayer_error_type_"
            r1.append(r0)
            int r0 = r4.type
            java.lang.String r12 = X.C17880vN.A0t(r1, r0)
            goto L_0x031a
        L_0x03d0:
            r0 = r0[r10]
            X.D8i r0 = (X.C26659D8i) r0
            int r0 = r0.A0B
            if (r0 == r9) goto L_0x03e2
            if (r0 == r8) goto L_0x03de
            java.lang.String r0 = "text"
            goto L_0x02d8
        L_0x03de:
            java.lang.String r0 = "video"
            goto L_0x02d8
        L_0x03e2:
            java.lang.String r0 = "audio"
            goto L_0x02d8
        L_0x03e6:
            r0 = r16
            goto L_0x02d8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26381Cyh.A0P(X.C1u, X.C0Q):void");
    }

    public void A0Q(boolean z) {
        CR1 cr1 = this.A0J;
        if (cr1 == null) {
            cr1 = new CR1(this.A0D);
            this.A0J = cr1;
        }
        if (z && cr1.A00 == null) {
            PowerManager powerManager = cr1.A03;
            if (powerManager == null) {
                Log.w("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                return;
            }
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
            cr1.A00 = newWakeLock;
            newWakeLock.setReferenceCounted(false);
        }
        cr1.A01 = z;
        PowerManager.WakeLock wakeLock = cr1.A00;
        if (wakeLock == null) {
            return;
        }
        if (!z || !cr1.A02) {
            wakeLock.release();
        } else {
            wakeLock.acquire();
        }
    }

    /* JADX WARNING: type inference failed for: r14v4, types: [java.net.URLStreamHandler, X.Dap] */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0336, code lost:
        A0E(r0, r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0339, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0041, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0445, code lost:
        if (r3.equals(r0.A11) != false) goto L_0x09c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0447, code lost:
        r0.A11 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0449, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0497, code lost:
        if (r10.equals(r0.A0y) != false) goto L_0x09c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0499, code lost:
        r0.A0y = r10;
        r0.A0o.Bwn(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x04a0, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x04ae, code lost:
        r0 = r0.A01.A06(r0.A0E[1]);
        r0.A01(r3);
        r0.A02(r4);
        r0.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x04c1, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x05de, code lost:
        if (r5 == X.C0Q.A01) goto L_0x05e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0696, code lost:
        if (r12.enableKillVideoProcessForAudioTrackInitFailed == false) goto L_0x0698;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0698, code lost:
        r7 = r0.A0p;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x069c, code lost:
        if (r7.disableAudioRendererOnAudioTrackInitFailed == false) goto L_0x0820;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x06a0, code lost:
        if (r0.A10 == null) goto L_0x0820;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x06aa, code lost:
        if (r0.A10.A0C.A07 == X.AnonymousClass00R.A00) goto L_0x06b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x06b4, code lost:
        if (r0.A10.A0C.A07 != X.AnonymousClass00R.A0C) goto L_0x0820;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x06b6, code lost:
        r3 = A17 + 1;
        A17 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x06be, code lost:
        if (r3 < r7.audioTrackInitFailedFallbackApplyThreshold) goto L_0x0820;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x06c0, code lost:
        A0H("disableAudioTrack");
        r9 = r0.A0o;
        r3 = r5.value;
        r7 = r6.name();
        r9.BtM(r3, r7, r8, r25, A03(), "disableAudioTrack", r0.A10.A06);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x06e9, code lost:
        if (r0.A12.A03(1) == -1) goto L_0x06f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x06eb, code lost:
        A0E(r0, "disable AudioTrack", new java.lang.Object[0]);
        r0.A12.A06(1, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x06f7, code lost:
        r0.A0X = true;
        A0K(true);
        r9.CAR(r5.name(), "AUDIO_TRACK_INIT_FAILED_VIDEO_ONLY_FALLBACK", r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x070d, code lost:
        if (r12.enableKillVideoProcessForIllegalStateException != false) goto L_0x070f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0758, code lost:
        if ((r17 - r19) >= r12.killVideoProcessOnExoPlaybackExceptionRetryTimeMs) goto L_0x075a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0791, code lost:
        if (r6 != r23) goto L_0x0793;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0793, code lost:
        r7 = r0.A0p;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0797, code lost:
        if (r7.enableCheckAudioError == false) goto L_0x0820;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0799, code lost:
        if (r6 != r11) goto L_0x0820;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x079d, code lost:
        if (r5 != X.C0Q.A0E) goto L_0x0820;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x079f, code lost:
        if (r8 == null) goto L_0x0820;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x07a7, code lost:
        if (r8.contains("Audio") == false) goto L_0x0820;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x0822, code lost:
        if (r7.setPlayWhenReadyOnError == false) goto L_0x0831;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x082a, code lost:
        if (r0.A12.A01.A0E == false) goto L_0x0831;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x082c, code lost:
        r0.A12.A0A(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x0831, code lost:
        r3 = r0.A0o;
        r4 = r5.name();
        r5 = r6.name();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x083d, code lost:
        if (r0.A10 == null) goto L_0x084d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x083f, code lost:
        r0 = r0.A10.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x0843, code lost:
        r3.Bt3(r4, r5, r8, r25, r0, r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x084c, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x084d, code lost:
        r0 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x0958, code lost:
        if (r5 != 3) goto L_0x095a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x09c2, code lost:
        A07(android.os.SystemClock.elapsedRealtime());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x09c9, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003e, code lost:
        r0.A09(r4, r2);
     */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x0692  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x0707  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x0729  */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x074c  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x0751  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x07fc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean handleMessage(android.os.Message r62) {
        /*
            r61 = this;
            r6 = r62
            int r2 = r6.what
            r5 = 4
            r7 = 3
            r3 = 2
            r1 = 1
            r4 = 0
            r0 = r61
            switch(r2) {
                case 1: goto L_0x09ce;
                case 2: goto L_0x0905;
                case 3: goto L_0x08f2;
                case 4: goto L_0x08ba;
                case 5: goto L_0x08b0;
                case 6: goto L_0x089b;
                case 7: goto L_0x0877;
                case 8: goto L_0x0971;
                case 9: goto L_0x0854;
                case 10: goto L_0x09c2;
                case 11: goto L_0x0850;
                case 12: goto L_0x04c2;
                case 13: goto L_0x04a8;
                case 14: goto L_0x04a1;
                case 15: goto L_0x044a;
                case 16: goto L_0x0053;
                case 17: goto L_0x03d7;
                case 18: goto L_0x03b2;
                case 19: goto L_0x0374;
                case 20: goto L_0x000e;
                case 21: goto L_0x033a;
                case 22: goto L_0x0332;
                case 23: goto L_0x0328;
                case 24: goto L_0x0322;
                case 25: goto L_0x09c9;
                case 26: goto L_0x02f7;
                case 27: goto L_0x02ed;
                case 28: goto L_0x02e9;
                case 29: goto L_0x02df;
                case 30: goto L_0x09c9;
                case 31: goto L_0x09c9;
                case 32: goto L_0x02b3;
                case 33: goto L_0x024f;
                case 34: goto L_0x020f;
                case 35: goto L_0x0209;
                case 36: goto L_0x0203;
                case 37: goto L_0x01fd;
                case 38: goto L_0x013a;
                case 39: goto L_0x000e;
                case 40: goto L_0x012d;
                case 41: goto L_0x0120;
                case 42: goto L_0x00c6;
                case 43: goto L_0x009d;
                case 44: goto L_0x000e;
                case 45: goto L_0x0093;
                case 46: goto L_0x0083;
                case 47: goto L_0x0042;
                case 48: goto L_0x002f;
                case 49: goto L_0x001c;
                case 50: goto L_0x0014;
                case 51: goto L_0x000f;
                default: goto L_0x000e;
            }
        L_0x000e:
            return r4
        L_0x000f:
            r2 = -1
            r0.A09 = r2
            return r1
        L_0x0014:
            X.Cuc r0 = r0.A12
            X.Cue r0 = r0.A01
            r0.A0C(r4)
            return r1
        L_0x001c:
            java.lang.Object r3 = r6.obj
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            r2 = r3[r4]
            int r4 = X.AnonymousClass000.A0M(r2)
            long r2 = X.BE8.A0I(r3, r1)
            X.Cuc r0 = r0.A12
            X.Cue r0 = r0.A01
            goto L_0x003e
        L_0x002f:
            java.lang.Object r2 = r6.obj
            int r4 = X.AnonymousClass000.A0M(r2)
            X.Cuc r0 = r0.A12
            X.Cue r0 = r0.A01
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x003e:
            r0.A09(r4, r2)
            return r1
        L_0x0042:
            X.Cuc r0 = r0.A12
            X.Cue r4 = r0.A01
            int r0 = r4.A04()
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4.A09(r0, r2)
            return r1
        L_0x0053:
            java.lang.Object r2 = r6.obj
            long r4 = X.C17880vN.A05(r2)
            java.lang.Object[] r3 = X.BE6.A1Z()
            java.lang.String r2 = "setRelativePositionInternal"
            A0E(r0, r2, r3)
            java.lang.Integer r3 = r0.A0S
            java.lang.Integer r2 = X.AnonymousClass00R.A0C
            if (r3 != r2) goto L_0x09c2
            X.Cuc r2 = r0.A12
            X.Cue r2 = r2.A01
            X.D9J r9 = r2.A0I
            boolean r2 = r9.A0n
            r7 = 1000(0x3e8, double:4.94E-321)
            if (r2 == 0) goto L_0x007b
            X.DA1 r6 = r9.A0h
            long r2 = r4 * r7
            r6.A01(r2)
        L_0x007b:
            X.DA0 r2 = r9.A0f
            long r4 = r4 * r7
            r2.A01(r4)
            goto L_0x09c2
        L_0x0083:
            java.lang.Object r3 = r6.obj
            X.Cuc r0 = r0.A12
            java.util.List r2 = r0.A0P
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x09c9
            r2.remove(r3)
            return r1
        L_0x0093:
            java.lang.Object r2 = r6.obj
            X.E9x r2 = (X.C28606E9x) r2
            X.Cuc r0 = r0.A12
            r0.A09(r2)
            return r1
        L_0x009d:
            java.lang.Object r2 = r6.obj
            boolean r5 = X.AnonymousClass000.A1Y(r2)
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.String r2 = "enableSRInternal"
            A0E(r0, r2, r3)
            X.Cuc r0 = r0.A12
            X.Cue r2 = r0.A01
            X.ECg[] r0 = r0.A0E
            r0 = r0[r4]
            X.Cbw r2 = r2.A06(r0)
            r0 = 10001(0x2711, float:1.4014E-41)
            r2.A01(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r2.A02(r0)
            r2.A00()
            return r1
        L_0x00c6:
            java.lang.Object r2 = r6.obj
            boolean r7 = X.AnonymousClass000.A1Y(r2)
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.String r2 = "moveToWarmupInternal"
            A0E(r0, r2, r3)
            r2 = 0
            r0.A0L(r4, r2)
            X.DRp r2 = r0.A0p
            boolean r2 = r2.enablePauseNow
            if (r2 != 0) goto L_0x00ea
            int r2 = r0.A04
            long r10 = android.os.SystemClock.elapsedRealtime()
            r13 = r4
            r8 = r0
            r9 = r2
            r12 = r4
            r8.A06(r9, r10, r12, r13)
        L_0x00ea:
            android.os.Handler r3 = r0.A0l
            r2 = 9
            r3.removeMessages(r2)
            X.DGM r6 = r0.A0o
            X.BVp r5 = new X.BVp
            r5.<init>()
            X.Cyh r2 = r6.A00
            long r2 = r2.A0k
            r6.C5I(r2)
            r6.A01 = r5
            java.util.concurrent.atomic.AtomicBoolean r2 = r0.A0t
            r2.set(r1)
            r0.A0b = r4
            if (r7 == 0) goto L_0x0112
            X.Cuc r0 = r0.A12
            r2 = 0
            r0.A08(r2, r4)
            return r1
        L_0x0112:
            int r2 = r0.A04
            long r7 = android.os.SystemClock.elapsedRealtime()
            r10 = r4
            r5 = r0
            r6 = r2
            r9 = r4
            r5.A06(r6, r7, r9, r10)
            return r1
        L_0x0120:
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.String r2 = "stopInternal"
            A0E(r0, r2, r3)
            r0.A16 = r1
            r0.A0J(r4)
            return r1
        L_0x012d:
            X.DRp r0 = r0.A0p
            boolean r0 = r0.enableWifiLockManager
            if (r0 == 0) goto L_0x09c9
            java.lang.String r0 = "isOnWifi"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x013a:
            java.lang.Object r3 = r6.obj
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            r2 = r3[r4]
            int r6 = X.AnonymousClass000.A0M(r2)
            long r3 = X.BE8.A0I(r3, r1)
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()
            java.lang.String r2 = "onPositionDiscontinuity "
            java.lang.String r5 = X.AnonymousClass001.A1I(r2, r5, r6)
            r2 = 0
            X.BE6.A1E(r0, r5, r2)
            X.DRp r2 = r0.A0p
            boolean r2 = r2.improveLooping
            if (r2 == 0) goto L_0x09c9
            if (r6 != 0) goto L_0x09c9
            X.D49 r2 = r0.A0z
            int r5 = r2.A0W
            X.Cuc r2 = r0.A12
            X.Cue r2 = r2.A01
            int r2 = r2.A04()
            if (r5 != r2) goto L_0x09c9
            X.D49 r11 = r0.A01(r3, r1)
            long r14 = r11.A0H
            boolean r2 = r11.A0R
            r51 = r2
            boolean r2 = r11.A0U
            r52 = r2
            long r8 = r11.A0X
            long r6 = r11.A09
            long r4 = r11.A0I
            java.lang.String r13 = r11.A0N
            java.lang.String r12 = ""
            if (r13 != 0) goto L_0x0187
            r13 = r12
        L_0x0187:
            int r2 = r11.A05
            r60 = r2
            int r2 = r11.A04
            r59 = r2
            long r2 = r11.A0D
            int r10 = r11.A03
            r58 = r10
            int r10 = r11.A06
            r57 = r10
            int r10 = r11.A01
            r21 = r10
            int r10 = r11.A02
            r22 = r10
            float r10 = r11.A00
            r20 = r10
            int r10 = r11.A07
            r23 = r10
            boolean r10 = r11.A0O
            r19 = r10
            int r10 = r11.A0W
            r18 = r10
            boolean r10 = r11.A0Q
            r17 = r10
            boolean r10 = r11.A0V
            r16 = r10
            r11 = 0
            r35 = 0
            X.D49 r10 = new X.D49
            r31 = r8
            r33 = r8
            r41 = r35
            r43 = r35
            r47 = r35
            r49 = r35
            r24 = r18
            r25 = r14
            r27 = r8
            r29 = r6
            r37 = r35
            r39 = r4
            r45 = r2
            r53 = r11
            r54 = r19
            r55 = r17
            r56 = r16
            r14 = r10
            r15 = r13
            r16 = r20
            r17 = r60
            r18 = r59
            r19 = r58
            r20 = r57
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r45, r47, r49, r51, r52, r53, r54, r55, r56)
            X.DGM r3 = r0.A0o
            X.CbZ r2 = r0.A10
            if (r2 == 0) goto L_0x01f9
            X.CbZ r0 = r0.A10
            java.lang.String r12 = r0.A06
        L_0x01f9:
            r3.BpR(r10, r12, r11)
            return r1
        L_0x01fd:
            java.lang.Object r3 = r6.obj
            X.Ckv r3 = (X.C25725Ckv) r3
            goto L_0x043f
        L_0x0203:
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.String r2 = "onRenderInternal"
            goto L_0x0336
        L_0x0209:
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.String r2 = "onBeforeRenderInternal"
            goto L_0x0336
        L_0x020f:
            java.lang.Object r2 = r6.obj
            boolean r7 = X.AnonymousClass000.A1Y(r2)
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String r2 = "enableVideoTrackInternal"
            A0E(r0, r2, r5)
            X.Cuc r2 = r0.A12
            int r2 = r2.A03(r3)
            r6 = -1
            if (r2 != r6) goto L_0x0236
            if (r7 == 0) goto L_0x0236
            java.lang.String r6 = "Enable Text track"
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String r2 = "HeroService"
            X.C25905CoJ.A00(r0, r2, r6, r5)
            X.Cuc r0 = r0.A12
            r0.A06(r3, r4)
            return r1
        L_0x0236:
            X.Cuc r2 = r0.A12
            int r2 = r2.A03(r3)
            if (r2 == r6) goto L_0x09c9
            if (r7 != 0) goto L_0x09c9
            java.lang.String r5 = "Disable Text track"
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r2 = "HeroService"
            X.C25905CoJ.A00(r0, r2, r5, r4)
            X.Cuc r0 = r0.A12
            r0.A06(r3, r6)
            return r1
        L_0x024f:
            java.lang.Object r7 = r6.obj
            X.Ckv r7 = (X.C25725Ckv) r7
            if (r7 == 0) goto L_0x09c9
            java.lang.String r2 = r7.A00
            if (r2 != 0) goto L_0x027a
            boolean r2 = r7.A02
            if (r2 == 0) goto L_0x027a
            X.Ckv r2 = r0.A11
            java.util.List r2 = r2.A01
            java.util.HashSet r5 = X.AnonymousClass8BR.A12(r2)
            int r2 = r5.size()
            if (r2 != r1) goto L_0x027a
            java.util.Iterator r2 = r5.iterator()
            java.lang.String r5 = X.C17880vN.A0v(r2)
            java.util.List r2 = r7.A01
            X.Ckv r7 = new X.Ckv
            r7.<init>(r5, r2, r1)
        L_0x027a:
            X.Cuc r6 = r0.A12
            X.BPD r0 = r6.A06
            java.util.concurrent.atomic.AtomicReference r0 = r0.A02
            java.lang.Object r0 = r0.get()
            X.BPC r0 = (X.BPC) r0
            X.BPB r5 = new X.BPB
            r5.<init>(r0)
            int r2 = r6.A03(r3)
            boolean r0 = r7.A02
            if (r0 == 0) goto L_0x02ad
            r0 = -1
            if (r2 != r0) goto L_0x09c9
            r5.A00(r3, r4)
            java.lang.String r2 = r7.A00
            if (r2 != 0) goto L_0x02a5
            r5.A0O = r1
        L_0x029f:
            X.BPD r0 = r6.A06
            r0.A01(r5)
            return r1
        L_0x02a5:
            java.lang.String[] r0 = new java.lang.String[r1]
            r0[r4] = r2
            r5.A01(r0)
            goto L_0x029f
        L_0x02ad:
            if (r2 != 0) goto L_0x09c9
            r5.A00(r3, r1)
            goto L_0x029f
        L_0x02b3:
            java.lang.Object r2 = r6.obj
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r7 = r2.booleanValue()
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r3[r4] = r2
            java.lang.String r2 = "convert Stereo to Mono: %s"
            A0E(r0, r2, r3)
            X.Cuc r6 = r0.A12
            X.Cl2 r0 = r6.A03
            float r4 = r0.A01
            float r3 = r0.A00
            boolean r0 = r0.A04
            X.Cl2 r2 = new X.Cl2
            r2.<init>(r4, r3, r0, r7)
            X.Cue r0 = r6.A01
            X.D9J r0 = r0.A0I
            X.Cp1 r0 = r0.A0g
            X.C25646Cjc.A00(r0, r2, r5)
            r6.A03 = r2
            return r1
        L_0x02df:
            java.lang.Object r2 = r6.obj
            boolean r2 = X.AnonymousClass000.A1Y(r2)
            r0.A0I(r2)
            return r1
        L_0x02e9:
            r0.A0K(r4)
            return r1
        L_0x02ed:
            java.lang.Object r2 = r6.obj
            float r2 = X.AnonymousClass000.A04(r2)
            A0B(r0, r2)
            return r1
        L_0x02f7:
            java.lang.Object r2 = r6.obj
            long r6 = X.C17880vN.A05(r2)
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.String r2 = "preSeekToInternal"
            A0E(r0, r2, r3)
            X.Cuc r0 = r0.A12
            X.Cue r2 = r0.A01
            r4 = -1
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            X.D9J r2 = r2.A0I
            if (r0 == 0) goto L_0x0316
            java.util.UUID r0 = X.C24736CHy.A04
            long r4 = com.facebook.android.exoplayer2.util.Util.A04(r6)
        L_0x0316:
            X.Cp1 r3 = r2.A0g
            r2 = 16
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            X.C25646Cjc.A00(r3, r0, r2)
            return r1
        L_0x0322:
            java.lang.Object r10 = r6.obj
            X.D40 r10 = (X.D40) r10
            goto L_0x0491
        L_0x0328:
            java.lang.Object r2 = r6.obj
            int r2 = X.AnonymousClass000.A0M(r2)
            A0D(r0, r2)
            return r1
        L_0x0332:
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.String r2 = "liveLatencyMode"
        L_0x0336:
            A0E(r0, r2, r3)
            return r1
        L_0x033a:
            java.lang.Object r5 = r6.obj
            java.util.List r5 = (java.util.List) r5
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.String r2 = "onTimestampGapsChanged"
            A0E(r0, r2, r3)
            java.util.ArrayList r8 = X.AnonymousClass000.A13()
            java.util.Iterator r7 = r5.iterator()
        L_0x034d:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x036e
            java.lang.Object r3 = r7.next()
            android.util.Pair r3 = (android.util.Pair) r3
            java.lang.Object r2 = r3.first
            long r5 = X.C17880vN.A05(r2)
            java.lang.Object r2 = r3.second
            long r3 = X.C17880vN.A05(r2)
            X.D3O r2 = new X.D3O
            r2.<init>(r5, r3)
            r8.add(r2)
            goto L_0x034d
        L_0x036e:
            X.DGM r0 = r0.A0o
            r0.C8i(r8)
            return r1
        L_0x0374:
            java.lang.Object r7 = r6.obj
            X.EAg r7 = (X.C28612EAg) r7
            java.lang.Object[] r3 = new java.lang.Object[r1]
            android.view.Surface r2 = r0.A0H
            r3[r4] = r2
            java.lang.String r2 = "leaveWarmUpInternal, surface: %s"
            A0E(r0, r2, r3)
            X.DGM r6 = r0.A0o
            X.EAg r5 = r6.A01
            boolean r2 = r5 instanceof X.C22927BVp
            if (r2 == 0) goto L_0x09c9
            X.BVp r5 = (X.C22927BVp) r5
            X.Cyh r2 = r6.A00
            long r2 = r2.A0k
            r6.C5I(r2)
            r6.A01 = r7
            r5.A00 = r6
        L_0x0398:
            java.util.Queue r3 = r5.A01
            boolean r2 = r3.isEmpty()
            if (r2 != 0) goto L_0x03ac
            java.lang.Object r2 = r3.poll()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            if (r2 == 0) goto L_0x0398
            r2.run()
            goto L_0x0398
        L_0x03ac:
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A0t
            r0.set(r4)
            return r1
        L_0x03b2:
            java.lang.Object r2 = r6.obj
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r6 = r2.booleanValue()
            java.lang.Object[] r5 = new java.lang.Object[r1]
            r3 = 0
            r5[r4] = r2
            java.lang.String r2 = "setLoopingInternal %b"
            A0E(r0, r2, r5)
            r0.A0f = r6
            X.DRp r2 = r0.A0p
            boolean r2 = r2.improveLooping
            if (r2 == 0) goto L_0x09c9
            X.Cuc r0 = r0.A12
            if (r6 == 0) goto L_0x03d1
            r3 = 2
        L_0x03d1:
            X.Cue r0 = r0.A01
            r0.A08(r3)
            return r1
        L_0x03d7:
            java.lang.Object r2 = r6.obj
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            X.D40 r6 = r0.A0y
            long r9 = X.BE8.A0I(r2, r4)
            long r11 = X.BE8.A0I(r2, r3)
            long r13 = X.BE8.A0I(r2, r7)
            long r15 = X.BE8.A0I(r2, r1)
            long r19 = android.os.SystemClock.elapsedRealtime()
            long r21 = X.BE8.A0I(r2, r5)
            r3 = 5
            r3 = r2[r3]
            boolean r27 = X.AnonymousClass000.A1Y(r3)
            r3 = 6
            long r23 = X.BE8.A0I(r2, r3)
            r3 = 7
            long r25 = X.BE8.A0I(r2, r3)
            r3 = 8
            r3 = r2[r3]
            boolean r28 = X.AnonymousClass000.A1Y(r3)
            r3 = 10
            r7 = r2[r3]
            java.lang.String r7 = (java.lang.String) r7
            int r8 = r6.A00
            long r3 = r6.A02
            X.D40 r6 = new X.D40
            r17 = r3
            r6.<init>(r7, r8, r9, r11, r13, r15, r17, r19, r21, r23, r25, r27, r28)
            X.D40 r3 = r0.A0y
            boolean r3 = r6.equals(r3)
            if (r3 != 0) goto L_0x042e
            r0.A0y = r6
            X.DGM r3 = r0.A0o
            r3.Bwn(r6)
        L_0x042e:
            X.Ckv r6 = r0.A11
            r3 = 9
            r5 = r2[r3]
            java.util.List r5 = (java.util.List) r5
            java.lang.String r4 = r6.A00
            boolean r2 = r6.A02
            X.Ckv r3 = new X.Ckv
            r3.<init>(r4, r5, r2)
        L_0x043f:
            X.Ckv r2 = r0.A11
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x09c9
            r0.A11 = r3
            return r1
        L_0x044a:
            java.lang.Object r3 = r6.obj
            long[] r3 = (long[]) r3
            X.D40 r10 = r0.A0y
            r5 = r3[r1]
            int r2 = (int) r5
            r37 = r2
            r22 = r3[r4]
            long r24 = android.os.SystemClock.elapsedRealtime()
            long r2 = r10.A03
            r35 = r2
            long r14 = r10.A07
            long r12 = r10.A06
            long r8 = r10.A08
            long r6 = r10.A01
            boolean r2 = r10.A0B
            r16 = r2
            long r4 = r10.A04
            long r2 = r10.A05
            boolean r11 = r10.A0C
            java.lang.String r10 = r10.A0A
            r34 = r10
            X.D40 r10 = new X.D40
            r26 = r6
            r28 = r4
            r30 = r2
            r32 = r16
            r33 = r11
            r16 = r14
            r18 = r12
            r20 = r8
            r11 = r10
            r12 = r34
            r13 = r37
            r14 = r35
            r11.<init>(r12, r13, r14, r16, r18, r20, r22, r24, r26, r28, r30, r32, r33)
        L_0x0491:
            X.D40 r2 = r0.A0y
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto L_0x09c9
            r0.A0y = r10
            X.DGM r0 = r0.A0o
            r0.Bwn(r10)
            return r1
        L_0x04a1:
            java.lang.Object r4 = r6.obj
            X.Cuc r0 = r0.A12
            r3 = 10002(0x2712, float:1.4016E-41)
            goto L_0x04ae
        L_0x04a8:
            java.lang.Object r4 = r6.obj
            X.Cuc r0 = r0.A12
            r3 = 10001(0x2711, float:1.4014E-41)
        L_0x04ae:
            X.Cue r2 = r0.A01
            X.ECg[] r0 = r0.A0E
            r0 = r0[r1]
            X.Cbw r0 = r2.A06(r0)
            r0.A01(r3)
            r0.A02(r4)
            r0.A00()
            return r1
        L_0x04c2:
            java.lang.Object r9 = r6.obj
            java.lang.Object[] r9 = (java.lang.Object[]) r9
            r6 = r9[r4]
            java.lang.String r6 = (java.lang.String) r6
            r4 = r9[r1]
            java.lang.String r4 = (java.lang.String) r4
            r8 = r9[r3]
            java.lang.String r8 = (java.lang.String) r8
            r25 = r9[r7]
            r2 = r25
            java.lang.String r2 = (java.lang.String) r2
            r25 = r2
            r24 = r9[r5]
            r2 = r24
            java.lang.String r2 = (java.lang.String) r2
            r24 = r2
            X.C0Q r5 = X.C0Q.A00(r6)
            X.C0S r6 = X.C0S.A00(r4)
            java.lang.Object[] r4 = new java.lang.Object[r7]
            X.AnonymousClass3MY.A1V(r5, r6, r4)
            java.lang.String r2 = r0.A04()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r4[r3] = r2
            java.lang.String r2 = "onPlayerError: %s, %s, %s"
            A0E(r0, r2, r4)
            X.C0S r23 = X.C0S.A03
            r4 = 0
            r2 = r23
            if (r6 != r2) goto L_0x05d0
            X.DRp r7 = r0.A0p
            boolean r2 = r7.enableEvictPlayerOnAudioTrackInitFailed
            if (r2 == 0) goto L_0x05d0
            int r3 = r0.A06
            int r2 = r7.maxRetryCountByEvictPlayerOnAudioTrackInitFailed
            if (r3 >= r2) goto L_0x05d0
            java.lang.String r2 = "evictPlayer"
            r0.A0H(r2)
            X.DGM r9 = r0.A0o
            java.lang.String r3 = r5.value
            java.lang.String r7 = "AUDIO_TRACK_INIT_FAILED"
            java.lang.String r14 = r0.A03()
            java.lang.StringBuilder r10 = X.AnonymousClass000.A10()
            java.lang.String r2 = "evictPlayer:"
            r10.append(r2)
            int r2 = r0.A06
            java.lang.String r15 = X.C17880vN.A0t(r10, r2)
            X.CbZ r2 = r0.A10
            if (r2 == 0) goto L_0x0553
            X.CbZ r2 = r0.A10
            java.lang.String r2 = r2.A06
        L_0x0537:
            r10 = r3
            r11 = r7
            r12 = r8
            r13 = r25
            r16 = r2
            r9.BtM(r10, r11, r12, r13, r14, r15, r16)
            int r2 = r0.A06
            int r2 = r2 + 1
            r0.A06 = r2
            java.util.concurrent.atomic.AtomicInteger r19 = com.facebook.android.exoplayer2.audio.DefaultAudioSink.A0h
            int r11 = r19.get()
            X.CZ4 r12 = r0.A0P
            long r2 = r0.A0k
            monitor-enter(r12)
            goto L_0x0556
        L_0x0553:
            java.lang.String r2 = ""
            goto L_0x0537
        L_0x0556:
            android.util.LruCache r10 = r12.A00     // Catch:{ all -> 0x05cc }
            r20 = r10
            java.util.Map r10 = r20.snapshot()     // Catch:{ all -> 0x05cc }
            java.util.Iterator r18 = X.AnonymousClass000.A15(r10)     // Catch:{ all -> 0x05cc }
        L_0x0562:
            boolean r10 = r18.hasNext()     // Catch:{ all -> 0x05cc }
            if (r10 == 0) goto L_0x05cf
            java.util.Map$Entry r13 = X.AnonymousClass000.A16(r18)     // Catch:{ all -> 0x05cc }
            if (r13 == 0) goto L_0x0562
            java.lang.Object r10 = r13.getValue()     // Catch:{ all -> 0x05cc }
            if (r10 == 0) goto L_0x0562
            java.lang.Object r15 = r13.getValue()     // Catch:{ all -> 0x05cc }
            X.Cyh r15 = (X.C26381Cyh) r15     // Catch:{ all -> 0x05cc }
            java.lang.Object r14 = r13.getKey()     // Catch:{ all -> 0x05cc }
            java.lang.Long r14 = (java.lang.Long) r14     // Catch:{ all -> 0x05cc }
            long r16 = r14.longValue()     // Catch:{ all -> 0x05cc }
            int r10 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r10 == 0) goto L_0x05cf
            X.Cuc r10 = r15.A12     // Catch:{ all -> 0x05cc }
            X.ECg[] r10 = r10.A0E     // Catch:{ all -> 0x05cc }
            if (r10 == 0) goto L_0x0562
            r10 = r10[r1]     // Catch:{ all -> 0x05cc }
            X.D8i r10 = (X.C26659D8i) r10     // Catch:{ all -> 0x05cc }
            int r13 = r10.A01     // Catch:{ all -> 0x05cc }
            if (r13 == r1) goto L_0x0599
            r10 = 2
            if (r13 != r10) goto L_0x0562
        L_0x0599:
            boolean r10 = r15.A15     // Catch:{ all -> 0x05cc }
            if (r10 != 0) goto L_0x0562
            java.lang.String r13 = "id [%d]: Evict player, id=%d"
            java.lang.Object[] r10 = X.AnonymousClass3MW.A1b()     // Catch:{ all -> 0x05cc }
            X.AnonymousClass3MX.A1S(r10, r4, r2)     // Catch:{ all -> 0x05cc }
            r10[r1] = r14     // Catch:{ all -> 0x05cc }
            X.C25905CoJ.A02(r13, r10)     // Catch:{ all -> 0x05cc }
            r2 = r20
            r2.remove(r14)     // Catch:{ all -> 0x05cc }
            monitor-exit(r12)
            r12 = 0
            int r2 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
            if (r2 == 0) goto L_0x05d0
            r10 = 0
        L_0x05b8:
            r2 = 50
            java.lang.Thread.sleep(r2)     // Catch:{ InterruptedException -> 0x05bd }
        L_0x05bd:
            int r2 = r19.get()
            if (r2 < r11) goto L_0x0803
            if (r2 > r11) goto L_0x05d0
            int r10 = r10 + 1
            r2 = 20
            if (r10 >= r2) goto L_0x05d0
            goto L_0x05b8
        L_0x05cc:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        L_0x05cf:
            monitor-exit(r12)
        L_0x05d0:
            X.C0S r11 = X.C0S.A0X
            if (r6 != r11) goto L_0x05d8
            X.C0Q r2 = X.C0Q.A0E
            if (r5 == r2) goto L_0x05e0
        L_0x05d8:
            X.C0S r2 = X.C0S.A02
            if (r6 != r2) goto L_0x068e
            X.C0Q r2 = X.C0Q.A01
            if (r5 != r2) goto L_0x0793
        L_0x05e0:
            X.CbZ r2 = r0.A10
            if (r2 == 0) goto L_0x068e
            X.CbZ r2 = r0.A10
            X.D47 r2 = r2.A0C
            java.lang.Integer r3 = r2.A07
            java.lang.Integer r2 = X.AnonymousClass00R.A00
            if (r3 == r2) goto L_0x05f8
            X.CbZ r2 = r0.A10
            X.D47 r2 = r2.A0C
            java.lang.Integer r3 = r2.A07
            java.lang.Integer r2 = X.AnonymousClass00R.A0C
            if (r3 != r2) goto L_0x068e
        L_0x05f8:
            X.DRp r7 = r0.A0p
            boolean r2 = r7.enableEvictCacheOnExoplayerErrors
            if (r2 == 0) goto L_0x068e
            int r3 = r0.A05
            int r2 = r7.maxRetryCountByEvictCacheOnExoplayerErrors
            if (r3 >= r2) goto L_0x068e
            java.lang.String r2 = "evictCache"
            r0.A0H(r2)
            X.DGM r9 = r0.A0o
            java.lang.String r10 = r5.value
            java.lang.String r7 = r6.name()
            java.lang.String r14 = r0.A03()
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r2 = "evictCache:"
            r3.append(r2)
            int r2 = r0.A05
            java.lang.String r15 = X.C17880vN.A0t(r3, r2)
            X.CbZ r2 = r0.A10
            java.lang.String r2 = r2.A06
            r11 = r7
            r12 = r8
            r13 = r25
            r16 = r2
            r9.BtM(r10, r11, r12, r13, r14, r15, r16)
            int r2 = r0.A05
            int r2 = r2 + 1
            r0.A05 = r2
            X.Cqn r10 = r0.A0L
            java.lang.String[] r3 = new java.lang.String[r1]
            java.lang.String r2 = r0.A04()
            java.util.List r3 = X.AnonymousClass8BR.A15(r2, r3, r4)
            X.ECn r13 = r10.A02()
            if (r13 == 0) goto L_0x0803
            r13.BNw()
            java.util.Set r2 = r13.BTn()
            java.util.HashSet r11 = X.AnonymousClass8BR.A12(r3)
            java.util.Iterator r12 = r2.iterator()
        L_0x0658:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L_0x0800
            java.lang.String r3 = X.C17880vN.A0v(r12)
            java.lang.String r2 = X.C24578C9z.A00(r3)
            boolean r2 = r11.contains(r2)
            if (r2 == 0) goto L_0x0658
            X.ECn r6 = r10.A02()
            if (r6 == 0) goto L_0x0658
            java.util.NavigableSet r2 = r6.BNz(r3)
            if (r2 == 0) goto L_0x0658
            java.util.Iterator r4 = r2.iterator()
        L_0x067c:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x0658
            java.lang.Object r3 = r4.next()
            X.DSC r3 = (X.DSC) r3
            java.lang.String r2 = "api_eviction"
            r6.CF1(r3, r2)
            goto L_0x067c
        L_0x068e:
            r2 = r23
            if (r6 != r2) goto L_0x0707
            X.DRp r12 = r0.A0p
            boolean r2 = r12.enableKillVideoProcessForAudioTrackInitFailed
            if (r2 != 0) goto L_0x070f
        L_0x0698:
            X.DRp r7 = r0.A0p
            boolean r2 = r7.disableAudioRendererOnAudioTrackInitFailed
            if (r2 == 0) goto L_0x0820
            X.CbZ r2 = r0.A10
            if (r2 == 0) goto L_0x0820
            X.CbZ r2 = r0.A10
            X.D47 r2 = r2.A0C
            java.lang.Integer r3 = r2.A07
            java.lang.Integer r2 = X.AnonymousClass00R.A00
            if (r3 == r2) goto L_0x06b6
            X.CbZ r2 = r0.A10
            X.D47 r2 = r2.A0C
            java.lang.Integer r3 = r2.A07
            java.lang.Integer r2 = X.AnonymousClass00R.A0C
            if (r3 != r2) goto L_0x0820
        L_0x06b6:
            int r2 = A17
            int r3 = r2 + 1
            A17 = r3
            int r2 = r7.audioTrackInitFailedFallbackApplyThreshold
            if (r3 < r2) goto L_0x0820
            java.lang.String r10 = "disableAudioTrack"
            r0.A0H(r10)
            X.DGM r9 = r0.A0o
            java.lang.String r3 = r5.value
            java.lang.String r7 = r6.name()
            java.lang.String r16 = r0.A03()
            X.CbZ r2 = r0.A10
            java.lang.String r2 = r2.A06
            r11 = r9
            r12 = r3
            r13 = r7
            r14 = r8
            r15 = r25
            r17 = r10
            r18 = r2
            r11.BtM(r12, r13, r14, r15, r16, r17, r18)
            X.Cuc r2 = r0.A12
            int r2 = r2.A03(r1)
            r6 = -1
            if (r2 == r6) goto L_0x06f7
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.String r2 = "disable AudioTrack"
            A0E(r0, r2, r3)
            X.Cuc r2 = r0.A12
            r2.A06(r1, r6)
        L_0x06f7:
            r0.A0X = r1
            r0.A0K(r1)
            java.lang.String r3 = r5.name()
            java.lang.String r2 = "AUDIO_TRACK_INIT_FAILED_VIDEO_ONLY_FALLBACK"
            r9.CAR(r3, r2, r8)
            goto L_0x080b
        L_0x0707:
            if (r6 != r11) goto L_0x078f
            X.DRp r12 = r0.A0p
            boolean r2 = r12.enableKillVideoProcessForIllegalStateException
            if (r2 == 0) goto L_0x0793
        L_0x070f:
            android.content.Context r2 = r0.A0D
            android.content.Context r2 = r2.getApplicationContext()
            android.content.SharedPreferences r10 = android.preference.PreferenceManager.getDefaultSharedPreferences(r2)
            java.lang.String r3 = ""
            java.lang.String r22 = "KillVideoPidOnExoException_VideoId"
            r2 = r22
            java.lang.String r13 = r10.getString(r2, r3)
            java.lang.String r2 = r0.A04()
            if (r2 == 0) goto L_0x07fc
            java.lang.String r9 = r0.A04()
        L_0x072d:
            java.lang.String r21 = "KillVideoPidOnExoException_KillTime"
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r21
            long r19 = r10.getLong(r7, r2)
            long r17 = java.lang.System.currentTimeMillis()
            java.lang.String r16 = "KillVideoPidOnExoException_RetryCount"
            r7 = r16
            int r7 = r10.getInt(r7, r4)
            boolean r13 = r9.equals(r13)
            if (r13 != 0) goto L_0x074d
            r7 = 0
        L_0x074d:
            int r13 = (r19 > r2 ? 1 : (r19 == r2 ? 0 : -1))
            if (r13 == 0) goto L_0x075a
            long r14 = r17 - r19
            long r2 = r12.killVideoProcessOnExoPlaybackExceptionRetryTimeMs
            int r13 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            r15 = 0
            if (r13 < 0) goto L_0x075b
        L_0x075a:
            r15 = 1
        L_0x075b:
            r2 = 6
            java.lang.Object[] r14 = new java.lang.Object[r2]
            r14[r4] = r9
            long r2 = r0.A0M()
            X.AnonymousClass3MX.A1S(r14, r1, r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            r13 = 2
            r14[r13] = r2
            int r2 = r12.killVideoProcessOnExoPlaybackExceptionMaximumRetryCount
            X.C17890vO.A1G(r14, r2)
            r2 = 4
            X.AnonymousClass8BR.A1L(r14, r2, r15)
            long r2 = r12.killVideoProcessOnExoPlaybackExceptionRetryTimeMs
            X.C17890vO.A1Q(r14, r2)
            java.lang.String r2 = "maybeRetryByRebirth: [vid=%s; currentPosition=%dMs; retryCount=%d(max=%d); coolingDownCompleted=%b(max=%d)]"
            java.lang.String r14 = java.lang.String.format(r2, r14)
            if (r7 != 0) goto L_0x07ab
            if (r15 != 0) goto L_0x07b1
        L_0x0786:
            java.lang.Object[] r3 = X.C108945cZ.A1a(r14, r6, r13, r1)
            java.lang.String r2 = "%s, errorCode=%s, skip"
            A0E(r0, r2, r3)
        L_0x078f:
            r2 = r23
            if (r6 == r2) goto L_0x0698
        L_0x0793:
            X.DRp r7 = r0.A0p
            boolean r2 = r7.enableCheckAudioError
            if (r2 == 0) goto L_0x0820
            if (r6 != r11) goto L_0x0820
            X.C0Q r2 = X.C0Q.A0E
            if (r5 != r2) goto L_0x0820
            if (r8 == 0) goto L_0x0820
            java.lang.String r2 = "Audio"
            boolean r2 = r8.contains(r2)
            if (r2 == 0) goto L_0x0820
            goto L_0x0698
        L_0x07ab:
            if (r7 <= 0) goto L_0x0786
            int r2 = r12.killVideoProcessOnExoPlaybackExceptionMaximumRetryCount
            if (r7 >= r2) goto L_0x0786
        L_0x07b1:
            java.lang.String r2 = "restartVps"
            r0.A0H(r2)
            java.lang.Object[] r3 = X.C108945cZ.A1a(r14, r6, r13, r1)
            java.lang.String r2 = "%s, errorCode=%s, kill"
            A0E(r0, r2, r3)
            X.DGM r2 = r0.A0o
            r19 = r2
            java.lang.String r15 = r5.name()
            java.lang.String r12 = r6.name()
            java.lang.StringBuilder r3 = X.AnonymousClass000.A11(r8)
            java.lang.String r2 = ". "
            java.lang.String r3 = X.AnonymousClass001.A1H(r2, r14, r3)
            r2 = r19
            r2.CAR(r15, r12, r3)
            android.content.SharedPreferences$Editor r10 = r10.edit()
            r2 = r22
            r10.putString(r2, r9)
            r9 = r21
            r2 = r17
            r10.putLong(r9, r2)
            int r3 = r7 + 1
            r2 = r16
            r10.putInt(r2, r3)
            r10.commit()
            int r2 = android.os.Process.myPid()
            android.os.Process.killProcess(r2)
            goto L_0x0786
        L_0x07fc:
            java.lang.String r9 = "null"
            goto L_0x072d
        L_0x0800:
            r13.BNw()
        L_0x0803:
            r0.A0K(r1)
            float r2 = r0.A01
            A0C(r0, r2)
        L_0x080b:
            java.lang.String r3 = r5.name()
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            X.AnonymousClass8BT.A1V(r2, r8)
            java.lang.String r0 = r0.A0U
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r2)
            r9.CAR(r3, r7, r0)
            return r1
        L_0x0820:
            boolean r2 = r7.setPlayWhenReadyOnError
            if (r2 == 0) goto L_0x0831
            X.Cuc r2 = r0.A12
            X.Cue r2 = r2.A01
            boolean r2 = r2.A0E
            if (r2 == 0) goto L_0x0831
            X.Cuc r2 = r0.A12
            r2.A0A(r4)
        L_0x0831:
            X.DGM r3 = r0.A0o
            java.lang.String r4 = r5.name()
            java.lang.String r5 = r6.name()
            X.CbZ r2 = r0.A10
            if (r2 == 0) goto L_0x084d
            X.CbZ r0 = r0.A10
            java.lang.String r0 = r0.A06
        L_0x0843:
            r6 = r8
            r7 = r25
            r8 = r0
            r9 = r24
            r3.Bt3(r4, r5, r6, r7, r8, r9)
            return r1
        L_0x084d:
            java.lang.String r0 = ""
            goto L_0x0843
        L_0x0850:
            r0.A0J(r1)
            return r1
        L_0x0854:
            java.lang.Object r5 = r6.obj
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            r2 = r5[r4]
            int r2 = X.AnonymousClass000.A0M(r2)
            boolean r11 = X.AnonymousClass000.A1T(r2, r1)
            r2 = r5[r1]
            int r8 = X.AnonymousClass000.A0M(r2)
            long r9 = X.BE8.A0I(r5, r3)
            r2 = r5[r7]
            boolean r12 = X.AnonymousClass000.A1Y(r2)
            r7 = r0
            r7.A06(r8, r9, r11, r12)
            return r1
        L_0x0877:
            java.lang.Object r5 = r6.obj
            android.os.ResultReceiver r5 = (android.os.ResultReceiver) r5
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.String r2 = "releaseSurfaceInternal"
            A0E(r0, r2, r3)
            r4 = 0
            r0.A0I = r4     // Catch:{ all -> 0x0896 }
            r0.A0G = r4     // Catch:{ all -> 0x0896 }
            r0.A0H = r4     // Catch:{ all -> 0x0896 }
            r2 = -1
            r0.A0C = r2     // Catch:{ all -> 0x0896 }
            r0.A07 = r2     // Catch:{ all -> 0x0896 }
            A09(r4, r0, r1)     // Catch:{ all -> 0x0896 }
            r5.send(r1, r4)
            return r1
        L_0x0896:
            r0 = move-exception
            r5.send(r1, r4)
            throw r0
        L_0x089b:
            java.lang.Object r5 = r6.obj
            android.view.Surface r5 = (android.view.Surface) r5
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.String r2 = "setSurfaceInternal"
            A0E(r0, r2, r3)
            r0.A0H = r5
            X.DRp r2 = r0.A0p
            boolean r2 = r2.useBlockingSetSurfaceExo2
            A09(r5, r0, r2)
            return r1
        L_0x08b0:
            java.lang.Object r2 = r6.obj
            float r2 = X.AnonymousClass000.A04(r2)
            A0C(r0, r2)
            return r1
        L_0x08ba:
            java.lang.Object r2 = r6.obj
            long[] r2 = (long[]) r2
            r5 = r2[r4]
            r7 = r2[r1]
            r11 = 1
            r9 = r2[r3]
            int r2 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x08cb
            r4 = 1
        L_0x08cb:
            java.lang.Object[] r3 = X.BE6.A1Z()
            java.lang.String r2 = "seekToInternal"
            A0E(r0, r2, r3)
            boolean r3 = r0.A0e
            X.Cuc r2 = r0.A12
            if (r3 == 0) goto L_0x08ee
            r2.A08(r5, r4)
        L_0x08dd:
            r0.A0A = r7
            X.DGM r4 = r0.A0o
            long r2 = android.os.SystemClock.elapsedRealtime()
            X.D49 r2 = r0.A01(r2, r1)
            r4.C4t(r2, r5)
            goto L_0x09c2
        L_0x08ee:
            r2.A07(r5)
            goto L_0x08dd
        L_0x08f2:
            java.lang.Object r5 = r6.obj
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            r2 = r5[r4]
            boolean r3 = X.AnonymousClass000.A1Y(r2)
            r2 = r5[r1]
            java.lang.String r2 = (java.lang.String) r2
            r0.A0L(r3, r2)
            goto L_0x09c2
        L_0x0905:
            java.lang.Object r2 = r6.obj
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            long r3 = X.BE8.A0I(r2, r4)
            r8 = 0
            X.Cuc r6 = r0.A12
            java.lang.Object[] r5 = new java.lang.Object[r1]
            X.AnonymousClass3MX.A1S(r5, r8, r3)
            java.lang.String r2 = "playInternal: %d"
            A0E(r0, r2, r5)
            boolean r2 = r0.A0X
            if (r2 == 0) goto L_0x0933
            X.Cuc r2 = r0.A12
            int r5 = r2.A03(r1)
            r2 = -1
            if (r5 != r2) goto L_0x0931
            java.lang.String r2 = "enable AudioTrack"
            X.BE6.A1E(r0, r2, r8)
            X.Cuc r2 = r0.A12
            r2.A06(r1, r8)
        L_0x0931:
            r0.A0X = r8
        L_0x0933:
            boolean r2 = r0.A0d
            if (r2 == 0) goto L_0x093c
            r0.A0I(r1)
            r0.A0d = r8
        L_0x093c:
            A0A(r0)
            r9 = 0
            int r2 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r2 < 0) goto L_0x0969
            long r9 = r6.A04()
            int r2 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0969
            X.Cuc r2 = r0.A12
            X.Cue r2 = r2.A01
            if (r2 == 0) goto L_0x095a
            X.CqU r2 = r2.A07
            int r5 = r2.A00
            r2 = 1
            if (r5 == r7) goto L_0x095b
        L_0x095a:
            r2 = 0
        L_0x095b:
            r0.A0g = r2
            r6.A07(r3)
            boolean r2 = r0.A0g
            if (r2 == 0) goto L_0x0969
            java.lang.String r2 = "Delay sending play due to seek"
            X.BE6.A1E(r0, r2, r8)
        L_0x0969:
            boolean r2 = r0.A0g
            if (r2 != 0) goto L_0x09c2
            r6.A0A(r1)
            goto L_0x09c2
        L_0x0971:
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.String r2 = "releaseInternal"
            A0E(r0, r2, r3)
            boolean r2 = r0.A14
            if (r2 != 0) goto L_0x09c2
            boolean r2 = r0.A15
            if (r2 == 0) goto L_0x098a
            X.DRp r2 = r0.A0p
            boolean r2 = r2.pausePlayingVideoWhenRelease
            if (r2 == 0) goto L_0x098a
            r2 = 0
            r0.A0L(r4, r2)
        L_0x098a:
            X.Cuc r3 = r0.A12
            java.util.List r2 = r3.A0P
            r2.clear()
            X.Cue r2 = r3.A01
            r2.A07()
            android.os.HandlerThread r3 = r0.A0F
            if (r3 == 0) goto L_0x09a3
            X.DRp r2 = r0.A0p
            boolean r2 = r2.quitHandlerSafely
            if (r2 == 0) goto L_0x09ca
            r3.quitSafely()
        L_0x09a3:
            r0.A14 = r1
            r0.A05()
            r2 = 0
            r0.A0I = r2
            r0.A0G = r2
            r0.A0H = r2
            r2 = -1
            r0.A0C = r2
            r0.A07 = r2
            X.CR1 r2 = r0.A0J
            if (r2 == 0) goto L_0x09c2
            r2.A02 = r4
            android.os.PowerManager$WakeLock r2 = r2.A00
            if (r2 == 0) goto L_0x09c2
            r2.release()
        L_0x09c2:
            long r2 = android.os.SystemClock.elapsedRealtime()
            r0.A07(r2)
        L_0x09c9:
            return r1
        L_0x09ca:
            r3.quit()
            goto L_0x09a3
        L_0x09ce:
            java.lang.Object r2 = r6.obj
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r7 = r2[r4]
            X.CbZ r7 = (X.C25238CbZ) r7
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String r2 = "prepareInternal"
            A0E(r0, r2, r5)
            X.C26056CrS.A01(r7)
            X.D47 r2 = r7.A0C
            X.C26056CrS.A01(r2)
            X.CbZ r5 = r0.A10
            if (r5 == 0) goto L_0x0a1f
            X.CbZ r5 = r0.A10
            X.D47 r5 = r5.A0C
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L_0x0a1f
            X.CbZ r2 = r0.A10
            if (r2 == 0) goto L_0x0a05
            X.CbZ r2 = r0.A10
            X.ByY r3 = r2.A03
            X.ByY r2 = r7.A03
            if (r3 == r2) goto L_0x0a05
            X.CbZ r3 = r0.A10
            X.ByY r2 = r7.A03
            r3.A03 = r2
        L_0x0a05:
            X.CbZ r2 = r0.A10
            if (r2 == 0) goto L_0x0a19
            X.CbZ r2 = r0.A10
            java.lang.String r2 = r2.A06
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0a19
            X.CbZ r3 = r0.A10
            java.lang.String r2 = r7.A06
            r3.A06 = r2
        L_0x0a19:
            java.lang.String r2 = "skip prepareInternal due to same request"
            X.BE6.A1E(r0, r2, r4)
            return r1
        L_0x0a1f:
            r0.A10 = r7
            X.Cuc r5 = r0.A12
            X.Cue r5 = r5.A01
            if (r5 == 0) goto L_0x0a39
            X.CqU r5 = r5.A07
            int r5 = r5.A00
            if (r5 == r1) goto L_0x0a39
            java.lang.String r5 = "Stopping non idle exoplayer"
            X.BE6.A1E(r0, r5, r4)
            X.Cuc r5 = r0.A12
            X.Cue r5 = r5.A01
            r5.A0C(r1)
        L_0x0a39:
            java.util.concurrent.atomic.AtomicBoolean r5 = r0.A0s
            boolean r5 = r5.get()
            if (r5 == 0) goto L_0x0a80
            r8 = 19
            monitor-enter(r0)
            java.lang.String r5 = "downgradePlaybackPriority"
            X.BE6.A1E(r0, r5, r4)     // Catch:{ all -> 0x0a77 }
            java.lang.Integer r5 = r0.A0R     // Catch:{ all -> 0x0a77 }
            if (r5 != 0) goto L_0x0a7a
            X.Cuc r5 = r0.A12     // Catch:{ all -> 0x0a77 }
            if (r5 == 0) goto L_0x0a7a
            X.Cuc r5 = r0.A12     // Catch:{ all -> 0x0a77 }
            X.Cue r5 = r5.A01     // Catch:{ all -> 0x0a77 }
            X.D9J r5 = r5.A0I     // Catch:{ all -> 0x0a77 }
            android.os.HandlerThread r5 = r5.A0W     // Catch:{ all -> 0x0a77 }
            if (r5 == 0) goto L_0x0a7a
            int r5 = r5.getThreadId()     // Catch:{ all -> 0x0a77 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0a77 }
            if (r5 == 0) goto L_0x0a7a
            int r6 = r5.intValue()     // Catch:{ Exception | IllegalArgumentException -> 0x0a7a }
            int r5 = android.os.Process.getThreadPriority(r6)     // Catch:{ Exception | IllegalArgumentException -> 0x0a7a }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception | IllegalArgumentException -> 0x0a7a }
            r0.A0R = r5     // Catch:{ Exception | IllegalArgumentException -> 0x0a7a }
            android.os.Process.setThreadPriority(r6, r8)     // Catch:{ Exception | IllegalArgumentException -> 0x0a7a }
            goto L_0x0a7a
        L_0x0a77:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0a7a:
            monitor-exit(r0)
            java.util.concurrent.atomic.AtomicInteger r5 = r0.A0u
            r5.set(r8)
        L_0x0a80:
            X.DRk r8 = r0.A02()
            X.Cuc r5 = r0.A12
            if (r5 == 0) goto L_0x0a9e
            int r6 = r8.minBufferMs
            int r9 = r8.minRebufferMs
            X.EAG r8 = r5.A02
            boolean r5 = r8 instanceof X.C26657D8g
            if (r5 == 0) goto L_0x0a9e
            X.D8g r8 = (X.C26657D8g) r8
            int r5 = r6 * 1000
            long r5 = (long) r5
            r8.A04 = r5
            int r5 = r9 * 1000
            long r5 = (long) r5
            r8.A03 = r5
        L_0x0a9e:
            java.lang.Object[] r6 = new java.lang.Object[r4]
            java.lang.String r5 = "buildMediaSource"
            A0E(r0, r5, r6)
            r0.A13 = r1
            X.Cuc r8 = r0.A12
            X.CbZ r5 = r8.A09
            boolean r5 = r7.equals(r5)
            if (r5 != 0) goto L_0x0adf
            r5 = 0
            r8.A05 = r5
            java.lang.String r5 = r2.A0A     // Catch:{ C1S | IOException -> 0x0ac1 }
            if (r5 == 0) goto L_0x0adf
            X.DRp r5 = r8.A0O     // Catch:{ C1S | IOException -> 0x0ac1 }
            X.CUI r5 = X.C26219Cv7.A01(r7, r5)     // Catch:{ C1S | IOException -> 0x0ac1 }
            r8.A05 = r5     // Catch:{ C1S | IOException -> 0x0ac1 }
            goto L_0x0adf
        L_0x0ac1:
            r6 = move-exception
            com.facebook.video.heroplayer.service.ServiceEventCallbackImpl r12 = r8.A0A
            java.lang.String r11 = r2.A0H
            java.lang.String r10 = "MANIFEST"
            java.lang.String r9 = "MANIFEST_PARSE_ERROR"
            java.lang.String r5 = "Exception: "
            java.lang.StringBuilder r5 = X.BE6.A0u(r5)
            X.AnonymousClass8BS.A1I(r5, r6)
            java.lang.String r6 = r5.toString()
            X.BVo r5 = new X.BVo
            r5.<init>(r11, r10, r9, r6)
            r12.A00()
        L_0x0adf:
            X.DRp r10 = r8.A0O
            boolean r5 = r10.playerRespawnExo2
            if (r5 != 0) goto L_0x0ae9
            boolean r5 = r10.isExo2Vp9Enabled
            if (r5 == 0) goto L_0x0b0c
        L_0x0ae9:
            X.CbZ r5 = r8.A09
            if (r5 == 0) goto L_0x0b0c
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L_0x0b0c
            X.Cue r5 = r8.A01
            if (r5 == 0) goto L_0x0b09
            r5.A07()
            r8.A05()
            X.Cv7 r9 = r8.A0B
            X.Cyh r6 = r8.A0M
            X.CUI r5 = r8.A05
            X.ECg[] r5 = r9.A06(r5, r7, r6)
            r8.A0E = r5
        L_0x0b09:
            X.C26205Cuc.A01(r7, r8, r1)
        L_0x0b0c:
            boolean r5 = r10.checkLiveSourceUri
            if (r5 == 0) goto L_0x0b43
            boolean r5 = r7.A00()
            if (r5 == 0) goto L_0x0b43
            android.net.Uri r5 = r2.A05
            if (r5 != 0) goto L_0x0b43
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()
            java.lang.String r3 = "Media source is null, Null source video Uri for live video Manifest: "
            r5.append(r3)
            java.lang.String r2 = r2.A0A
            java.lang.IllegalStateException r5 = X.AnonymousClass000.A0o(r2, r5)
            java.lang.Object[] r3 = new java.lang.Object[r1]
            X.BE6.A1M(r5, r3, r4)
            java.lang.String r2 = "prepareMediaSource onError: %s"
            A0E(r0, r2, r3)
            r0.A0G(r5)
        L_0x0b36:
            r2 = -1
            r0.A08 = r2
            r0.A0Y = r4
            X.DRp r2 = r0.A0p
            int r2 = r2.checkPlayerStateMinIntervalMs
            r0.A03 = r2
            return r1
        L_0x0b43:
            X.CkU r11 = r8.A0C
            X.D9R r6 = r8.A0N
            X.Cv7 r5 = r8.A0B
            r5.A05(r2)
            android.net.Uri r5 = r2.A05
            r13 = 0
            if (r5 != 0) goto L_0x0b6b
            java.lang.Integer r9 = r2.A07
            java.lang.Integer r5 = X.AnonymousClass00R.A0Y
            if (r9 == r5) goto L_0x0b6b
        L_0x0b57:
            java.lang.String r2 = "Media source is null"
            java.lang.IllegalStateException r5 = X.AnonymousClass000.A0n(r2)
            java.lang.Object[] r3 = new java.lang.Object[r1]
            X.BE6.A1M(r5, r3, r4)
            java.lang.String r2 = "prepareMediaSource onError: %s"
            A0E(r0, r2, r3)
            r0.A0G(r5)
            goto L_0x0b36
        L_0x0b6b:
            java.lang.String r9 = "HeroExo2VodInitHelper"
            java.lang.String r5 = "creating Progressive MediaSource"
            android.util.Log.d(r9, r5)
            X.DRp r10 = r11.A06
            boolean r5 = r10.enableMP3Extractor
            if (r5 == 0) goto L_0x0bab
            android.net.Uri r5 = r2.A05
            if (r5 == 0) goto L_0x0b9e
            java.lang.String r5 = r5.getLastPathSegment()
            if (r5 == 0) goto L_0x0b9e
            android.net.Uri r5 = r2.A05
            java.lang.String r9 = r5.getLastPathSegment()
            java.lang.String r5 = ".mp3"
            boolean r5 = r9.endsWith(r5)
            if (r5 == 0) goto L_0x0b9e
        L_0x0b90:
            X.D8v r12 = new X.D8v
            r12.<init>(r7, r11, r4)
        L_0x0b95:
            java.lang.Integer r9 = r2.A07
            java.lang.Integer r5 = X.AnonymousClass00R.A0Y
            if (r9 != r5) goto L_0x0bd8
            byte[] r9 = r2.A0S
            goto L_0x0bb1
        L_0x0b9e:
            java.lang.String r9 = r2.A0G
            if (r9 == 0) goto L_0x0bab
            java.lang.String r5 = "undefined"
            boolean r5 = r9.equals(r5)
            if (r5 == 0) goto L_0x0bab
            goto L_0x0b90
        L_0x0bab:
            X.D8v r12 = new X.D8v
            r12.<init>(r7, r11, r1)
            goto L_0x0b95
        L_0x0bb1:
            java.lang.String r15 = "bytes:///video"
            X.Dap r14 = new X.Dap     // Catch:{ MalformedURLException -> 0x0cd7, URISyntaxException -> 0x0cd1 }
            r14.<init>()     // Catch:{ MalformedURLException -> 0x0cd7, URISyntaxException -> 0x0cd1 }
            r14.A00 = r9     // Catch:{ MalformedURLException -> 0x0cd7, URISyntaxException -> 0x0cd1 }
            java.net.URL r5 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0cd7, URISyntaxException -> 0x0cd1 }
            r5.<init>(r13, r15, r14)     // Catch:{ MalformedURLException -> 0x0cd7, URISyntaxException -> 0x0cd1 }
            java.net.URI r5 = r5.toURI()     // Catch:{ MalformedURLException -> 0x0cd7, URISyntaxException -> 0x0cd1 }
            java.lang.String r5 = r5.toString()     // Catch:{ MalformedURLException -> 0x0cd7, URISyntaxException -> 0x0cd1 }
            android.net.Uri r5 = X.C26215Cuu.A01(r5)     // Catch:{ MalformedURLException -> 0x0cd7, URISyntaxException -> 0x0cd1 }
            r2.A05 = r5
            X.BPH r5 = new X.BPH
            r5.<init>(r9)
            X.D9g r15 = new X.D9g
            r15.<init>(r5)
            goto L_0x0bf1
        L_0x0bd8:
            X.CTJ r14 = r11.A05
            X.Bzs r16 = X.C24357Bzs.PROGRESSIVE
            java.util.concurrent.atomic.AtomicBoolean r9 = r11.A09
            java.util.concurrent.atomic.AtomicBoolean r5 = r11.A08
            X.E41 r15 = r7.A02
            if (r15 != 0) goto L_0x0bf1
            X.D9h r15 = new X.D9h
            r20 = r5
            r18 = r14
            r19 = r9
            r17 = r7
            r15.<init>(r16, r17, r18, r19, r20)
        L_0x0bf1:
            android.net.Uri r5 = r2.A05
            if (r5 == 0) goto L_0x0b57
            X.BOy r9 = new X.BOy
            r9.<init>(r5, r12, r15)
            boolean r5 = r10.enableHeroPlayerMaxLoopCount
            if (r5 == 0) goto L_0x0c0a
            boolean r5 = r7.A08
            if (r5 == 0) goto L_0x0c0a
            int r12 = r7.A00
            X.BOt r5 = new X.BOt
            r5.<init>(r9, r12)
            r9 = r5
        L_0x0c0a:
            android.net.Uri r5 = r2.A04
            if (r5 == 0) goto L_0x0c5a
            java.lang.String r15 = "0"
            java.lang.String r14 = "application/x-subrip"
            X.E0X r5 = X.D48.CREATOR
            X.CkX r12 = new X.CkX
            r12.<init>()
            r12.A0P = r15
            r12.A0R = r14
            r12.A0F = r3
            r12.A0Q = r13
            X.D48 r5 = new X.D48
            r5.<init>(r12)
            X.CTJ r13 = r11.A05
            X.Bzs r15 = X.C24357Bzs.DASH_TEXT
            java.util.concurrent.atomic.AtomicBoolean r12 = r11.A09
            java.util.concurrent.atomic.AtomicBoolean r11 = r11.A08
            X.D9h r14 = new X.D9h
            r19 = r11
            r17 = r13
            r18 = r12
            r16 = r7
            r14.<init>(r15, r16, r17, r18, r19)
            android.net.Uri r11 = r2.A04
            boolean r10 = r10.subtitleDurationToMaxValue
            if (r10 == 0) goto L_0x0ccd
            r17 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x0c46:
            X.BOx r13 = new X.BOx
            r15 = r5
            r16 = r14
            r14 = r11
            r13.<init>(r14, r15, r16, r17)
            X.E9e[] r3 = new X.E9e[r3]
            r3[r4] = r9
            r3[r1] = r13
            X.BOu r9 = new X.BOu
            r9.<init>(r3)
        L_0x0c5a:
            boolean r2 = r2.A0R
            if (r2 == 0) goto L_0x0c73
            X.E9e[] r10 = new X.E9e[r1]
            r10[r4] = r9
            java.util.Random r5 = new java.util.Random
            r5.<init>()
            int[] r3 = new int[r4]
            X.D9Y r2 = new X.D9Y
            r2.<init>(r5, r3)
            X.BOv r9 = new X.BOv
            r9.<init>(r2, r10)
        L_0x0c73:
            java.lang.Integer r2 = X.AnonymousClass00R.A0N
            X.CNd r10 = new X.CNd
            r10.<init>(r9, r2)
            r6.A00 = r7
            X.E9e r9 = r10.A00
            android.os.Handler r5 = r8.A0K
            r2 = r9
            X.D9Q r2 = (X.D9Q) r2
            X.CtM r3 = r2.A03
            boolean r2 = X.AnonymousClass000.A1W(r5)
            X.C26056CrS.A02(r2)
            java.util.concurrent.CopyOnWriteArrayList r3 = r3.A02
            X.CMn r2 = new X.CMn
            r2.<init>(r5, r6)
            r3.add(r2)
            r8.A04 = r9
            r8.A09 = r7
            X.CUI r2 = r8.A05
            X.CA7.A00(r2)
            java.lang.Integer r5 = r10.A01
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.String r2 = "prepareMediaSource onCompleted"
            A0E(r0, r2, r3)
            X.AkN r6 = new X.AkN
            r6.<init>(r7, r0, r5)
            android.os.Looper r5 = android.os.Looper.myLooper()
            android.os.Handler r3 = r0.A0l
            android.os.Looper r2 = r3.getLooper()
            if (r5 == r2) goto L_0x0cc9
            r3.post(r6)
        L_0x0cbc:
            boolean r2 = r8.A0Q
            if (r2 == 0) goto L_0x0b36
            X.Cge r2 = new X.Cge
            r2.<init>()
            r8.A07 = r2
            goto L_0x0b36
        L_0x0cc9:
            r6.run()
            goto L_0x0cbc
        L_0x0ccd:
            r17 = -2
            goto L_0x0c46
        L_0x0cd1:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0x(r0)
            throw r0
        L_0x0cd7:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0x(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26381Cyh.handleMessage(android.os.Message):boolean");
    }

    public C26381Cyh(Context context, Handler handler, HandlerThread handlerThread, C26029Cqn cqn, C25238CbZ cbZ, C28612EAg eAg, C25018CTu cTu, CZ4 cz4, Map map, AtomicBoolean atomicBoolean, AtomicReference atomicReference, long j) {
        Looper mainLooper;
        AtomicBoolean atomicBoolean2 = new AtomicBoolean();
        this.A0t = atomicBoolean2;
        this.A0q = BE6.A16(true);
        this.A0r = BE6.A16(false);
        this.A0C = -1;
        this.A07 = -1;
        this.A0Z = false;
        this.A0i = false;
        this.A06 = 0;
        this.A05 = 0;
        this.A09 = -1;
        this.A0U = null;
        this.A16 = false;
        this.A0d = false;
        this.A0M = null;
        this.A0Q = null;
        this.A0n = new C24795CKo(this);
        this.A0k = j;
        this.A0o = new DGM(eAg, this);
        if (eAg instanceof C22927BVp) {
            atomicBoolean2.set(true);
        }
        this.A0m = cTu;
        this.A0p = cTu.A05;
        this.A0x = cTu.A08;
        this.A08 = -1;
        this.A0Y = false;
        this.A0D = context;
        this.A0E = handler;
        this.A0W = atomicReference;
        this.A0P = cz4;
        this.A0L = cqn;
        this.A0V = map;
        this.A0F = handlerThread;
        if (handlerThread != null) {
            mainLooper = handlerThread.getLooper();
        } else {
            mainLooper = Looper.getMainLooper();
        }
        Handler handler2 = new Handler(mainLooper, this);
        this.A0l = handler2;
        new Object();
        this.A0s = atomicBoolean;
        C27076DTa.A00(handler2, this, cbZ, 33);
    }

    public static C24463C5d A00(AbstractList abstractList, int i) {
        return (C24463C5d) abstractList.get(i);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    private void A06(int r38, long r39, boolean r41, boolean r42) {
        /*
            r37 = this;
            java.lang.Object[] r1 = X.BE6.A1a()
            r24 = r41
            java.lang.Boolean r22 = java.lang.Boolean.valueOf(r24)
            r4 = 0
            r1[r4] = r22
            r14 = r38
            java.lang.Integer r21 = java.lang.Integer.valueOf(r14)
            r3 = 1
            r1[r3] = r21
            r2 = r37
            boolean r0 = r2.A15
            X.AnonymousClass8BU.A1Q(r1, r0)
            boolean r0 = r2.A0b
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r23 = 3
            r1[r23] = r0
            java.lang.String r0 = "onPlayerStateChanged start: play=%b, state=%d, startedPlaying=%b, isPrepared=%b"
            A0E(r2, r0, r1)
            boolean r0 = r2.A16
            if (r0 == 0) goto L_0x0039
            if (r14 != r3) goto L_0x0039
            r2.A16 = r4
            X.DGM r0 = r2.A0o
            r0.C78()
        L_0x0039:
            X.CbZ r0 = r2.A10
            if (r0 != 0) goto L_0x0043
            java.lang.String r0 = "onPlayerStateChanged, play request not set yet, skip the state change"
            X.BE6.A1E(r2, r0, r4)
            return
        L_0x0043:
            java.lang.String r26 = r2.A04()
            boolean r0 = android.text.TextUtils.isEmpty(r26)
            java.lang.String r25 = ""
            r36 = r25
            if (r0 == 0) goto L_0x0053
            r26 = r25
        L_0x0053:
            X.DRp r0 = r2.A0p
            r35 = r0
            boolean r0 = r0.enableSecondaryChannelLoggingForLite
            if (r0 == 0) goto L_0x0074
            java.lang.String r0 = r2.A04()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x03cd
            r5 = r25
        L_0x0067:
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x0074
            X.DGM r1 = r2.A0o
            r0 = r26
            r1.Bsa(r0, r5)
        L_0x0074:
            r0 = r23
            if (r14 != r0) goto L_0x007b
            r0 = 1
            if (r41 != 0) goto L_0x007c
        L_0x007b:
            r0 = 0
        L_0x007c:
            r2.A0j = r0
            r5 = 0
            r10 = 0
            r0 = r39
            if (r41 != 0) goto L_0x03c2
            boolean r7 = r2.A15
            if (r7 == 0) goto L_0x0339
            r2.A15 = r4
            X.D49 r7 = r2.A01(r0, r3)
            A0F(r2, r3)
            X.DGM r15 = r2.A0o
            long r8 = r2.A07
            java.lang.String r13 = r2.A0T
            java.lang.String r11 = r2.A0U
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 != 0) goto L_0x0335
            java.lang.String r12 = r2.A0U
        L_0x00a2:
            X.CbZ r11 = r2.A10
            java.lang.String r11 = r11.A06
            r33 = r42
            r26 = r15
            r27 = r7
            r28 = r13
            r29 = r12
            r30 = r11
            r31 = r8
            r26.C0C(r27, r28, r29, r30, r31, r33)
            r2.A07 = r5
        L_0x00b9:
            r5 = r25
            r2.A0T = r5
        L_0x00bd:
            r2.A0U = r10
        L_0x00bf:
            if (r14 == r3) goto L_0x032b
            r5 = 2
            if (r14 == r5) goto L_0x02aa
            r5 = r23
            if (r14 == r5) goto L_0x015c
            r5 = 4
            if (r14 != r5) goto L_0x0648
            boolean r6 = r2.A15
            boolean r5 = r2.A0f
            if (r5 != 0) goto L_0x00d3
            r2.A15 = r4
        L_0x00d3:
            X.D49 r7 = r2.A01(r0, r3)
            if (r6 == 0) goto L_0x00e2
            X.DGM r6 = r2.A0o
            X.CbZ r5 = r2.A10
            java.lang.String r5 = r5.A06
            r6.BpR(r7, r5, r4)
        L_0x00e2:
            boolean r5 = r2.A0f
            if (r5 == 0) goto L_0x00f3
            r5 = r35
            boolean r5 = r5.improveLooping
            if (r5 != 0) goto L_0x00f3
            X.Cuc r8 = r2.A12
            r5 = 0
            r8.A08(r5, r4)
        L_0x00f3:
            r2.A0U = r10
        L_0x00f5:
            r4 = r35
            int r4 = r4.checkPlayerStateMinIntervalMs
            r2.A03 = r4
            if (r7 != 0) goto L_0x014f
            r2.A07(r0)
        L_0x0100:
            r2.A04 = r14
            r0 = r24
            r2.A0e = r0
            X.CR1 r0 = r2.A0J
            if (r0 == 0) goto L_0x0127
            if (r14 == r3) goto L_0x0113
            r0 = 2
            if (r14 == r0) goto L_0x0148
            r0 = r23
            if (r14 == r0) goto L_0x0148
        L_0x0113:
            r4 = 0
        L_0x0114:
            X.CR1 r0 = r2.A0J
            if (r0 == 0) goto L_0x0127
            r0.A02 = r4
            android.os.PowerManager$WakeLock r1 = r0.A00
            if (r1 == 0) goto L_0x0127
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x0144
            if (r4 == 0) goto L_0x0144
            r1.acquire()
        L_0x0127:
            r4 = 4
            r1 = r22
            r0 = r21
            java.lang.Object[] r3 = X.C108945cZ.A1a(r1, r0, r4, r3)
            boolean r0 = r2.A15
            X.AnonymousClass8BU.A1Q(r3, r0)
            boolean r1 = r2.A0b
            r0 = r23
            X.AnonymousClass8BR.A1L(r3, r0, r1)
            java.lang.String r1 = "onPlayerStateChanged end: play=%b, state=%d, startedPlaying=%b, isPrepared=%b"
            java.lang.String r0 = "HeroService"
            X.C25905CoJ.A00(r2, r0, r1, r3)
            return
        L_0x0144:
            r1.release()
            goto L_0x0127
        L_0x0148:
            X.Cuc r0 = r2.A12
            X.Cue r0 = r0.A01
            boolean r4 = r0.A0E
            goto L_0x0114
        L_0x014f:
            r2.A0z = r7
            android.os.Handler r5 = r2.A0l
            int r0 = r2.A03
            long r0 = (long) r0
            r4 = 10
            r5.sendEmptyMessageDelayed(r4, r0)
            goto L_0x0100
        L_0x015c:
            java.lang.String r5 = "Player is ready"
            X.BE6.A1E(r2, r5, r4)
            r5 = r35
            boolean r5 = r5.clearBufferingWhenInWarmup
            if (r5 == 0) goto L_0x0173
            java.util.concurrent.atomic.AtomicBoolean r5 = r2.A0t
            boolean r5 = r5.get()
            if (r5 == 0) goto L_0x0173
            r5 = -1
            r2.A08 = r5
        L_0x0173:
            X.Cuc r5 = r2.A12
            X.ECg[] r5 = r5.A0E
            r8 = 0
            if (r5 == 0) goto L_0x0186
            r5 = r5[r4]
            X.D8i r5 = (X.C26659D8i) r5
            int r6 = r5.A01
            if (r6 == r3) goto L_0x0185
            r5 = 2
            if (r6 != r5) goto L_0x0186
        L_0x0185:
            r8 = 1
        L_0x0186:
            boolean r5 = r2.A0b
            if (r5 != 0) goto L_0x01a5
            android.view.Surface r5 = r2.A0G
            if (r5 != 0) goto L_0x0198
            java.util.concurrent.atomic.AtomicBoolean r5 = r2.A0t
            boolean r5 = r5.get()
            if (r5 == 0) goto L_0x0198
            if (r8 != 0) goto L_0x01a5
        L_0x0198:
            r2.A0b = r3
            X.D49 r7 = r2.A01(r0, r4)
            X.DGM r6 = r2.A0o
            r5 = r36
            r6.C1b(r7, r5)
        L_0x01a5:
            if (r41 == 0) goto L_0x0291
            boolean r5 = r2.A15
            if (r5 != 0) goto L_0x0291
            r2.A15 = r3
            X.D49 r7 = r2.A01(r0, r3)
            X.Cuc r5 = r2.A12
            X.Cue r5 = r5.A01
            X.CqU r5 = r5.A07
            java.lang.Integer r5 = r5.A07
            int r5 = r5.intValue()
            switch(r5) {
                case 1: goto L_0x028d;
                case 2: goto L_0x0289;
                case 3: goto L_0x0285;
                case 4: goto L_0x0281;
                case 5: goto L_0x027d;
                case 6: goto L_0x0279;
                default: goto L_0x01c0;
            }
        L_0x01c0:
            java.lang.String r12 = "unknown"
        L_0x01c2:
            java.lang.String r5 = "buffer_below_threshold"
            boolean r5 = r12.equals(r5)
            java.lang.String r8 = ":"
            if (r5 == 0) goto L_0x01dd
            java.lang.StringBuilder r6 = X.BE6.A0u(r12)
            r6.append(r8)
            X.DRk r5 = r2.A02()
            int r5 = r5.minBufferMs
            java.lang.String r12 = X.C17880vN.A0t(r6, r5)
        L_0x01dd:
            X.Cuc r5 = r2.A12
            X.Cue r5 = r5.A01
            X.CqU r5 = r5.A07
            boolean r5 = r5.A09
            r6 = 2
            if (r5 == 0) goto L_0x0209
            java.lang.StringBuilder r9 = X.BE6.A0u(r12)
            r9.append(r8)
            java.lang.String r8 = "audio_stall"
            java.lang.String r12 = X.AnonymousClass000.A0y(r8, r9)
            java.lang.Object[] r8 = new java.lang.Object[r6]
            X.AnonymousClass8BR.A1L(r8, r4, r5)
            java.lang.String r5 = r2.A04()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r8[r3] = r5
            java.lang.String r5 = "handleStartedPlaying isAudioStall: %s %s"
            A0E(r2, r5, r8)
        L_0x0209:
            java.lang.String r8 = r2.A0U
            if (r8 == 0) goto L_0x0230
            int r5 = r12.length()
            if (r5 <= 0) goto L_0x0277
            java.lang.StringBuilder r9 = X.AnonymousClass000.A11(r12)
            java.lang.String r5 = "; "
            java.lang.String r12 = X.AnonymousClass001.A1H(r5, r8, r9)
        L_0x021d:
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r4] = r8
            java.lang.String r5 = r2.A04()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r6[r3] = r5
            java.lang.String r5 = "handleStartedPlaying: %s %s"
            A0E(r2, r5, r6)
        L_0x0230:
            X.DGM r11 = r2.A0o
            long r5 = r7.A0H
            long r8 = r2.A0B
            long r5 = r5 - r8
            java.lang.String r13 = r2.A0T
            java.lang.String r9 = r2.A0U
            X.CbZ r8 = r2.A10
            if (r8 == 0) goto L_0x0274
            X.CbZ r8 = r2.A10
            java.lang.String r8 = r8.A06
        L_0x0243:
            r25 = r11
            r26 = r7
            r27 = r12
            r28 = r13
            r29 = r9
            r30 = r8
            r31 = r5
            r25.C6S(r26, r27, r28, r29, r30, r31)
            r2.A0a = r4
            r5 = r36
            r2.A0T = r5
            r2.A0U = r10
            A17 = r4
            android.view.Surface r5 = r2.A0G
            if (r5 == 0) goto L_0x026c
            android.view.Surface r4 = r2.A0I
            if (r4 != r5) goto L_0x026c
            boolean r4 = r4.isValid()
            if (r4 != 0) goto L_0x00f5
        L_0x026c:
            long r4 = android.os.SystemClock.elapsedRealtime()
            r2.A0C = r4
            goto L_0x00f5
        L_0x0274:
            r8 = r36
            goto L_0x0243
        L_0x0277:
            r12 = r8
            goto L_0x021d
        L_0x0279:
            java.lang.String r12 = "buffer_below_threshold"
            goto L_0x01c2
        L_0x027d:
            java.lang.String r12 = "force_end"
            goto L_0x01c2
        L_0x0281:
            java.lang.String r12 = "surface_not_ready"
            goto L_0x01c2
        L_0x0285:
            java.lang.String r12 = "no_output_buffer"
            goto L_0x01c2
        L_0x0289:
            java.lang.String r12 = "waiting_for_keys"
            goto L_0x01c2
        L_0x028d:
            java.lang.String r12 = "null_format"
            goto L_0x01c2
        L_0x0291:
            if (r7 != 0) goto L_0x00f5
            X.D49 r7 = r2.A01(r0, r3)
            android.view.Surface r5 = r2.A0I
            android.view.Surface r4 = r2.A0G
            boolean r5 = X.AnonymousClass3Ma.A1Z(r5, r4)
            X.DGM r4 = r2.A0o
            r4.Bms(r7, r5)
            X.CgJ r4 = X.C25464CgJ.A02
            monitor-enter(r4)
            monitor-exit(r4)
            goto L_0x00f5
        L_0x02aa:
            boolean r5 = r2.A15
            if (r5 != 0) goto L_0x02b4
            r5 = r35
            boolean r5 = r5.includeAllBufferingEvents
            if (r5 == 0) goto L_0x02f3
        L_0x02b4:
            r2.A08 = r0
            X.Cuc r5 = r2.A12
            X.Cue r5 = r5.A01
            X.CqU r5 = r5.A07
            boolean r5 = r5.A09
            r2.A0Y = r5
            X.D49 r7 = r2.A01(r0, r4)
            android.view.Surface r6 = r2.A0I
            android.view.Surface r5 = r2.A0G
            boolean r8 = X.AnonymousClass3Ma.A1Z(r6, r5)
            X.DGM r6 = r2.A0o
            X.D40 r5 = r2.A0y
            r6.Bmr(r7, r5, r8)
            X.CgJ r9 = X.C25464CgJ.A02
            monitor-enter(r9)
            boolean r5 = X.C25464CgJ.A01     // Catch:{ all -> 0x0652 }
            if (r5 == 0) goto L_0x02f2
            java.util.Deque r8 = X.C25464CgJ.A03     // Catch:{ all -> 0x0652 }
            monitor-enter(r9)     // Catch:{ all -> 0x0652 }
            int r6 = r8.size()     // Catch:{ all -> 0x064f }
            r5 = 20
            if (r6 < r5) goto L_0x02e8
            r8.poll()     // Catch:{ all -> 0x064f }
        L_0x02e8:
            X.0vk r5 = X.C25464CgJ.A00     // Catch:{ all -> 0x064f }
            java.lang.Object r5 = r5.invoke()     // Catch:{ all -> 0x064f }
            r8.offer(r5)     // Catch:{ all -> 0x064f }
            monitor-exit(r9)     // Catch:{ all -> 0x0652 }
        L_0x02f2:
            monitor-exit(r9)
        L_0x02f3:
            boolean r5 = r2.A0g
            if (r5 == 0) goto L_0x0305
            if (r41 != 0) goto L_0x0305
            java.lang.String r5 = "Sending delayed play now due to seek"
            X.BE6.A1E(r2, r5, r4)
            X.Cuc r5 = r2.A12
            r5.A0A(r3)
            r2.A0g = r4
        L_0x0305:
            r5 = r35
            boolean r5 = r5.setPlayWhenReadyOnRetry
            if (r5 == 0) goto L_0x00f5
            java.lang.Integer r6 = r2.A0S
            java.lang.Integer r5 = X.AnonymousClass00R.A0C
            if (r6 != r5) goto L_0x00f5
            if (r41 == 0) goto L_0x00f5
            boolean r5 = r2.A15
            if (r5 != 0) goto L_0x00f5
            boolean r5 = r2.A0b
            if (r5 == 0) goto L_0x00f5
            java.lang.String r5 = r2.A0U
            if (r5 == 0) goto L_0x00f5
            java.lang.String r5 = "Sending play for retry after error"
            X.BE6.A1E(r2, r5, r4)
            X.Cuc r4 = r2.A12
            r4.A0A(r3)
            goto L_0x00f5
        L_0x032b:
            r5 = r35
            boolean r5 = r5.setPlayWhenReadyOnError
            if (r5 != 0) goto L_0x00f5
            r2.A15 = r4
            goto L_0x00f5
        L_0x0335:
            r12 = r25
            goto L_0x00a2
        L_0x0339:
            boolean r5 = r2.A0e
            if (r5 == 0) goto L_0x03c2
            r5 = 4
            if (r14 == r5) goto L_0x03c2
            boolean r5 = r2.A0a
            if (r5 != 0) goto L_0x03c2
            X.D49 r7 = r2.A01(r0, r3)
            X.Cuc r5 = r2.A12
            X.Cue r5 = r5.A01
            X.CqU r5 = r5.A07
            boolean r15 = r5.A09
            boolean r5 = r2.A0i
            if (r5 != 0) goto L_0x0394
            r5 = r35
            boolean r5 = r5.enableRetryErrorLoggingInCancel
            if (r5 == 0) goto L_0x0391
            java.lang.String r5 = r2.A0T
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x0391
            java.lang.String r30 = "cancel with error thrown"
        L_0x0364:
            X.DGM r13 = r2.A0o
            java.lang.String r12 = r2.A0T
            java.lang.String r5 = r2.A0U
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x038e
            java.lang.String r11 = r2.A0U
        L_0x0372:
            long r5 = r7.A0H
            long r8 = r2.A0B
            long r5 = r5 - r8
            X.CbZ r8 = r2.A10
            java.lang.String r8 = r8.A06
            r26 = r13
            r27 = r7
            r28 = r12
            r29 = r11
            r31 = r8
            r32 = r5
            r34 = r15
            r26.Bnr(r27, r28, r29, r30, r31, r32, r34)
            goto L_0x00b9
        L_0x038e:
            r11 = r25
            goto L_0x0372
        L_0x0391:
            r30 = r25
            goto L_0x0364
        L_0x0394:
            X.DGM r8 = r2.A0o
            java.lang.String r28 = "force_end"
            java.lang.String r6 = r2.A0T
            java.lang.String r5 = r2.A0U
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x03a6
            java.lang.String r5 = r2.A0U
            r25 = r5
        L_0x03a6:
            X.CbZ r5 = r2.A10
            java.lang.String r5 = r5.A06
            r32 = -1
            r26 = r8
            r27 = r7
            r29 = r6
            r30 = r25
            r31 = r5
            r26.C6S(r27, r28, r29, r30, r31, r32)
            X.CbZ r5 = r2.A10
            java.lang.String r5 = r5.A06
            r8.BpR(r7, r5, r3)
            goto L_0x00bd
        L_0x03c2:
            boolean r5 = r2.A0e
            if (r5 != 0) goto L_0x03ca
            if (r41 == 0) goto L_0x03ca
            r2.A0B = r0
        L_0x03ca:
            r7 = r10
            goto L_0x00bf
        L_0x03cd:
            X.Cuc r12 = r2.A12
            boolean r0 = r12.A0Q
            r5 = r25
            if (r0 == 0) goto L_0x0067
            X.Cge r0 = r12.A07
            java.util.ArrayList r8 = X.AnonymousClass000.A13()
            java.util.concurrent.BlockingDeque r0 = r0.A00
            r0.drainTo(r8)
            java.lang.StringBuilder r20 = X.AnonymousClass000.A10()
            r11 = 0
        L_0x03e5:
            int r0 = r8.size()
            if (r11 >= r0) goto L_0x060b
            int r1 = r8.size()
            int r1 = r1 - r11
            r0 = 2000(0x7d0, float:2.803E-42)
            int r5 = java.lang.Math.min(r1, r0)
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x060b
            if (r11 < 0) goto L_0x060b
            int r0 = r8.size()
            if (r11 >= r0) goto L_0x060b
            if (r5 <= 0) goto L_0x060b
            int r19 = r11 + r5
            int r1 = r8.size()
            r0 = r19
            if (r0 > r1) goto L_0x060b
            java.util.HashMap r13 = X.C17880vN.A11()
            X.C5d r7 = A00(r8, r11)
            r0 = r23
            java.lang.String[] r6 = new java.lang.String[r0]
            long r0 = r7.A03
            java.lang.String r0 = java.lang.Long.toString(r0)
            r6[r4] = r0
            long r0 = r7.A01
            java.lang.String r0 = java.lang.Long.toString(r0)
            r6[r3] = r0
            long r0 = r7.A02
            java.lang.String r1 = java.lang.Long.toString(r0)
            r0 = 2
            java.util.List r1 = X.AnonymousClass8BR.A15(r1, r6, r0)
            java.lang.String r0 = "f0"
            r13.put(r0, r1)
            java.lang.String r1 = "version"
            java.lang.Integer r18 = java.lang.Integer.valueOf(r3)
            r0 = r18
            r13.put(r1, r0)
            if (r5 <= r3) goto L_0x05e1
            r7 = r19
        L_0x044b:
            int r7 = r7 + -1
            if (r7 <= r11) goto L_0x04e9
            X.C5d r10 = A00(r8, r7)
            X.C5d r0 = A00(r8, r7)
            long r0 = r0.A03
            int r9 = r7 + -1
            X.C5d r5 = A00(r8, r9)
            long r5 = r5.A03
            long r0 = r0 - r5
            r10.A03 = r0
            X.C5d r10 = A00(r8, r7)
            X.C5d r0 = A00(r8, r7)
            long r0 = r0.A01
            X.C5d r5 = A00(r8, r9)
            long r5 = r5.A01
            long r0 = r0 - r5
            r10.A01 = r0
            X.C5d r10 = A00(r8, r7)
            X.C5d r0 = A00(r8, r7)
            long r0 = r0.A02
            X.C5d r5 = A00(r8, r9)
            long r5 = r5.A02
            long r0 = r0 - r5
            r10.A02 = r0
            X.C5d r15 = A00(r8, r7)
            X.C5d r0 = A00(r8, r9)
            long r0 = r0.A00
            r5 = 0
            r16 = -1
            int r9 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r9 != 0) goto L_0x04d9
            r0 = 0
        L_0x049e:
            r15.A00 = r0
            X.C5d r9 = A00(r8, r7)
            int r0 = r7 + -1
            X.C5d r0 = A00(r8, r0)
            long r0 = r0.A04
            int r10 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r10 == 0) goto L_0x04bf
            X.C5d r0 = A00(r8, r7)
            long r5 = r0.A04
            int r0 = r7 + -1
            X.C5d r0 = A00(r8, r0)
            long r0 = r0.A04
            long r5 = r5 - r0
        L_0x04bf:
            r0 = 100
            long r5 = r5 * r0
            r9.A04 = r5
            X.C5d r9 = A00(r8, r7)
            X.C5d r0 = A00(r8, r7)
            long r5 = r0.A02
            X.C5d r0 = A00(r8, r7)
            long r0 = r0.A01
            long r5 = r5 - r0
            r9.A02 = r5
            goto L_0x044b
        L_0x04d9:
            X.C5d r0 = A00(r8, r7)
            long r0 = r0.A00
            int r9 = r7 + -1
            X.C5d r9 = A00(r8, r9)
            long r9 = r9.A00
            long r0 = r0 - r9
            goto L_0x049e
        L_0x04e9:
            java.util.HashMap r15 = X.C17880vN.A11()
            int r7 = r11 + 1
            r5 = r7
            r6 = r7
        L_0x04f1:
            r0 = r19
            if (r7 >= r0) goto L_0x053a
            X.C5d r0 = A00(r8, r7)
            long r9 = r0.A03
            X.C5d r0 = A00(r8, r7)
            long r0 = r0.A01
            r16 = r0
            java.lang.Long r1 = java.lang.Long.valueOf(r9)
            boolean r0 = r15.containsKey(r1)
            if (r0 == 0) goto L_0x0537
            int r0 = X.BE9.A0D(r1, r15)
            int r0 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0517:
            r15.put(r1, r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r16)
            boolean r0 = r15.containsKey(r1)
            if (r0 == 0) goto L_0x0534
            int r0 = X.BE9.A0D(r1, r15)
            int r0 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x052e:
            r15.put(r1, r0)
            int r7 = r7 + 1
            goto L_0x04f1
        L_0x0534:
            r0 = r18
            goto L_0x052e
        L_0x0537:
            r0 = r18
            goto L_0x0517
        L_0x053a:
            java.util.Iterator r15 = X.C17890vO.A0i(r15)
            r9 = 3333(0xd05, double:1.6467E-320)
            r7 = 0
        L_0x0541:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x055b
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r15)
            int r1 = X.BE9.A0J(r0)
            if (r7 >= r1) goto L_0x0541
            java.lang.Object r0 = r0.getKey()
            long r9 = X.C17880vN.A05(r0)
            r7 = r1
            goto L_0x0541
        L_0x055b:
            r0 = r19
            if (r6 >= r0) goto L_0x057c
            X.C5d r7 = A00(r8, r6)
            X.C5d r0 = A00(r8, r6)
            long r0 = r0.A03
            long r0 = r0 - r9
            r7.A03 = r0
            X.C5d r7 = A00(r8, r6)
            X.C5d r0 = A00(r8, r6)
            long r0 = r0.A01
            long r0 = r0 - r9
            r7.A01 = r0
            int r6 = r6 + 1
            goto L_0x055b
        L_0x057c:
            java.lang.Long r1 = java.lang.Long.valueOf(r9)
            java.lang.String r0 = "baseDelta"
            r13.put(r0, r1)
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            java.util.ArrayList r7 = X.AnonymousClass000.A13()
            r10 = 0
        L_0x058e:
            r0 = r19
            if (r5 >= r0) goto L_0x05c6
            X.C5d r0 = A00(r8, r5)
            long r0 = r0.A03
            X.C17880vN.A1R(r6, r0)
            X.C5d r0 = A00(r8, r5)
            long r0 = r0.A01
            X.C17880vN.A1R(r6, r0)
            X.C5d r0 = A00(r8, r5)
            long r0 = r0.A02
            X.C17880vN.A1R(r6, r0)
            X.C5d r0 = A00(r8, r5)
            long r0 = r0.A00
            X.C17880vN.A1R(r7, r0)
            X.C5d r0 = A00(r8, r5)
            long r0 = r0.A00
            r15 = 0
            int r9 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r9 == 0) goto L_0x05c3
            r10 = 1
        L_0x05c3:
            int r5 = r5 + 1
            goto L_0x058e
        L_0x05c6:
            java.lang.String r1 = "fn"
            java.lang.String r0 = X.C25483Cge.A00(r6)
            r13.put(r1, r0)
            java.lang.String r1 = "fAudio"
            java.lang.String r0 = X.C25483Cge.A00(r7)
            r13.put(r1, r0)
            java.lang.String r1 = "isSoundOn"
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            r13.put(r1, r0)
        L_0x05e1:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r13)
            java.lang.String r5 = r0.toString()
            int r1 = r5.length()
            r0 = 900000(0xdbba0, float:1.261169E-39)
            if (r1 <= r0) goto L_0x05f5
            java.lang.String r5 = "{\"err\":\"SIZE_EXCEED_MAX_CAP\"}"
        L_0x05f5:
            int r0 = r20.length()
            if (r0 == 0) goto L_0x0602
            java.lang.String r1 = "|"
            r0 = r20
            r0.append(r1)
        L_0x0602:
            r0 = r20
            r0.append(r5)
            int r11 = r11 + 2000
            goto L_0x03e5
        L_0x060b:
            java.lang.String r5 = r20.toString()
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x0640
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x0640
            java.lang.String r0 = r12.A0D
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0634
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = r12.A0D
            r1.append(r0)
            java.lang.String r0 = "|"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            r12.A0D = r0
        L_0x0634:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = r12.A0D
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r5, r1)
            r12.A0D = r0
        L_0x0640:
            java.lang.String r5 = r12.A0D
            r0 = r25
            r12.A0D = r0
            goto L_0x0067
        L_0x0648:
            java.lang.String r0 = "Invalid playbackState"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x064f:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0652 }
            throw r0     // Catch:{ all -> 0x0652 }
        L_0x0652:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26381Cyh.A06(int, long, boolean, boolean):void");
    }

    public static void A0B(C26381Cyh cyh, float f) {
        Object[] A1a = AnonymousClass3MW.A1a();
        AnonymousClass000.A1L(A1a, (int) (100.0f * f));
        A0E(cyh, "setPlaybackSpeedInternal to: %d (x100)", A1a);
        cyh.A00 = f;
        C26205Cuc cuc = cyh.A12;
        C25732Cl2 cl2 = cuc.A03;
        C25732Cl2 cl22 = new C25732Cl2(f, cl2.A00, cl2.A04, cl2.A03);
        C25646Cjc.A00(cuc.A01.A0I.A0g, cl22, 4);
        cuc.A03 = cl22;
        cyh.A07(SystemClock.elapsedRealtime());
    }

    public static void A0C(C26381Cyh cyh, float f) {
        Object[] A1a = AnonymousClass3MW.A1a();
        AnonymousClass000.A1L(A1a, (int) (100.0f * f));
        A0E(cyh, "setVolumeInternal to: %d (x100)", A1a);
        cyh.A01 = f;
        C26205Cuc cuc = cyh.A12;
        C25257Cbw A062 = cuc.A01.A06(cuc.A0E[1]);
        A062.A01(2);
        A062.A02(Float.valueOf(f));
        A062.A00();
    }

    public static void A0D(C26381Cyh cyh, int i) {
        A0E(cyh, "setAudioUsageInternal: %d", BEA.A1b(i));
        cyh.A02 = i;
        C26205Cuc cuc = cyh.A12;
        C25720Ckq ckq = new C25720Ckq(i);
        C25257Cbw A062 = cuc.A01.A06(cuc.A0E[1]);
        A062.A01(3);
        A062.A02(ckq);
        A062.A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008d, code lost:
        if (r0.A0C.A01() == false) goto L_0x008f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0L(boolean r13, java.lang.String r14) {
        /*
            r12 = this;
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1a()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r13)
            r10 = 0
            r1[r10] = r0
            java.lang.String r0 = "pauseInternal %b"
            r6 = r12
            A0E(r12, r0, r1)
            r12.A0g = r10
            r12.A0i = r13
            X.Cuc r0 = r12.A12
            r0.A0A(r10)
            X.DRp r5 = r12.A0p
            boolean r0 = r5.enableVodPausedLoading
            if (r0 == 0) goto L_0x005f
            java.lang.Integer r1 = r12.A0S
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r1 == r0) goto L_0x005f
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 != 0) goto L_0x005f
            java.util.Set r1 = r5.pausedLoadingTriggerTypes
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 != 0) goto L_0x005f
            boolean r0 = r1.contains(r14)
            if (r0 == 0) goto L_0x005f
            X.CbZ r0 = r12.A10
            if (r0 == 0) goto L_0x005f
            X.CbZ r0 = r12.A10
            X.D47 r0 = r0.A0C
            java.lang.String r1 = r0.A0B
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x005f
            java.lang.String r0 = r5.playerOriginPausedLoadingBlackList
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x005f
            X.Cuc r4 = r12.A12
            int r0 = r5.maxBufferToDownloadInPausedLoadingMs
            long r2 = (long) r0
            int r0 = r5.maxTimeAllowedSpentInPausedLoadingMs
            long r0 = (long) r0
            X.EAG r4 = r4.A02
            r4.CJt(r2, r0)
        L_0x005f:
            boolean r0 = r5.enablePauseNow
            if (r0 == 0) goto L_0x006d
            int r7 = r12.A04
            long r8 = android.os.SystemClock.elapsedRealtime()
            r11 = r10
            r6.A06(r7, r8, r10, r11)
        L_0x006d:
            if (r14 == 0) goto L_0x009b
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 != 0) goto L_0x009b
            java.lang.String r0 = "short_form_video_invisible"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x009b
            boolean r0 = r5.disableVideoTrackForInVisibleVDD
            if (r0 == 0) goto L_0x009b
            X.CbZ r0 = r12.A10
            r2 = 1
            if (r0 == 0) goto L_0x008f
            X.D47 r0 = r0.A0C
            boolean r0 = r0.A01()
            r1 = 1
            if (r0 != 0) goto L_0x0090
        L_0x008f:
            r1 = 0
        L_0x0090:
            boolean r0 = r5.shouldDisableAV1VideoTrackOnlyforVDD
            if (r0 == 0) goto L_0x0096
            if (r1 == 0) goto L_0x009b
        L_0x0096:
            r12.A0I(r10)
            r12.A0d = r2
        L_0x009b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26381Cyh.A0L(boolean, java.lang.String):void");
    }

    public long A0M() {
        long BXM;
        A0E(this, "Retrieve service player current position", BE6.A1Z());
        if (this.A12 == null) {
            return 0;
        }
        boolean A1Z = AnonymousClass000.A1Z(this.A0S, AnonymousClass00R.A0C);
        C26205Cuc cuc = this.A12;
        if (!A1Z) {
            return cuc.A04();
        }
        D9J d9j = cuc.A01.A0I;
        if (d9j.A0n) {
            BXM = d9j.A0h.BXM();
        } else {
            BXM = d9j.A0f.BXM();
        }
        return BXM / 1000;
    }
}
