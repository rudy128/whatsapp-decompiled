package X;

import android.net.Uri;
import android.os.ConditionVariable;
import com.whatsapp.media.WamediaManager;
import com.whatsapp.media.attachment.Kaleidoscope;
import com.whatsapp.media.magi.Magi;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.5ti  reason: invalid class name and case insensitive filesystem */
public class C115295ti extends C167258fi implements Comparable, C72283Li {
    public C190089kM A00;
    public C56202h4 A01;
    public File A02;
    public File A03;
    public URL A04;
    public boolean A05;
    public final int A06;
    public final int A07;
    public final long A08;
    public final ConditionVariable A09;
    public final AnonymousClass190 A0A;
    public final C218617r A0B;
    public final AnonymousClass1KB A0C;
    public final AnonymousClass181 A0D;
    public final AnonymousClass1TJ A0E;
    public final AnonymousClass1TJ A0F;
    public final AnonymousClass1TJ A0G = new AnonymousClass1TJ();
    public final AnonymousClass1TJ A0H = new AnonymousClass1TJ();
    public final AnonymousClass1TJ A0I = new AnonymousClass1TJ();
    public final AnonymousClass1TJ A0J = new AnonymousClass1TJ();
    public final AnonymousClass1TJ A0K = new AnonymousClass1TJ();
    public final AnonymousClass11P A0L;
    public final AnonymousClass118 A0M;
    public final AnonymousClass11Z A0N;
    public final C132326mb A0O;
    public final AnonymousClass1ST A0P;
    public final C18030ve A0Q;
    public final AnonymousClass18K A0R;
    public final C24371Kb A0S;
    public final AnonymousClass1KX A0T;
    public final C26421Sb A0U;
    public final C32381h6 A0V;
    public final WamediaManager A0W;
    public final Kaleidoscope A0X = ((Kaleidoscope) C221618v.A02(Kaleidoscope.class));
    public final AnonymousClass1SK A0Y;
    public final C32571hP A0Z;
    public final AnonymousClass1RN A0a;
    public final AnonymousClass1SS A0b;
    public final C26501Sj A0c;
    public final C136996uk A0d;
    public final C139666zF A0e;
    public final C127376eF A0f;
    public final C145127Ka A0g;
    public final Magi A0h = ((Magi) C221618v.A02(Magi.class));
    public final C32411h9 A0i;
    public final C26431Sc A0j;
    public final AnonymousClass70W A0k;
    public final C18010vc A0l;
    public final C22394B5x A0m;
    public final C24421Kg A0n;
    public final AnonymousClass1Nb A0o;
    public final C1185864a A0p;
    public final C138906xt A0q;
    public final C136956ug A0r;
    public final C62272r8 A0s;
    public final C131756lc A0t;
    public final C1408873l A0u;
    public final AnonymousClass10I A0v;
    public final AnonymousClass19K A0w;
    public final LinkedList A0x = new LinkedList();
    public final CountDownLatch A0y = new CountDownLatch(1);
    public final AtomicBoolean A0z = new AtomicBoolean();
    public final C24361Ka A10;
    public final AnonymousClass1PT A11;
    public final C26521Sl A12;
    public final C34481kY A13;
    public final JniBridge A14;
    public volatile int A15;
    public volatile boolean A16;
    public volatile boolean A17;

    public static C1194768h A00(C115295ti r8, boolean z) {
        C115295ti r7 = r8;
        AnonymousClass11P r3 = r8.A0L;
        C18030ve r5 = r8.A0Q;
        C1194768h r1 = new C1194768h(r8.A0D, r3, r8.A0N, r5, r7.A0S, r7, r8.A0n, z);
        r1.BB6(new C144797Is(r7));
        return r1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A06(X.C115295ti r12, X.C136996uk r13, java.io.File r14, java.lang.String r15, boolean r16) {
        /*
            r6 = r15
            long r0 = r14.length()
            r13.A0B(r0)
            X.6zF r2 = r12.A0e
            java.io.File r0 = r2.A0D
            if (r0 == 0) goto L_0x0025
            boolean r1 = r0.exists()
            if (r1 != 0) goto L_0x0025
            int r1 = com.whatsapp.files.FileUtils$OsRename.attempt(r14, r0)
            if (r1 <= 0) goto L_0x00ae
            int r1 = com.whatsapp.files.FileUtils$OsRename.attempt(r14, r0)
            if (r1 <= 0) goto L_0x00a9
            java.lang.String r1 = "media-file-utils/Second try rename failed"
            com.whatsapp.util.Log.i((java.lang.String) r1)
        L_0x0025:
            boolean r9 = r2.A0Z
            java.lang.Integer r4 = r2.A0E
            boolean r10 = r2.A0V
            boolean r11 = r2.A0c
            X.1So r3 = r2.A0A
            int r7 = r2.A04
            int r8 = r2.A01
            java.lang.String r5 = r2.A0K
            java.lang.String r1 = r2.A0L
            if (r15 != 0) goto L_0x003f
            if (r1 == 0) goto L_0x00a7
            java.lang.String r6 = X.C64062u9.A09(r1)
        L_0x003f:
            X.17r r1 = r12.A0B
            X.0vc r2 = r12.A0l
            java.io.File r2 = X.C26511Sk.A0F(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r13.A0D(r2)
            int r1 = com.whatsapp.files.FileUtils$OsRename.attempt(r14, r2)
            if (r1 <= 0) goto L_0x005b
            int r1 = com.whatsapp.files.FileUtils$OsRename.attempt(r14, r2)
            if (r1 <= 0) goto L_0x00a4
            java.lang.String r1 = "media-file-utils/Second try rename failed"
        L_0x0058:
            com.whatsapp.util.Log.i((java.lang.String) r1)
        L_0x005b:
            if (r16 != 0) goto L_0x00b3
            java.io.File r5 = r13.A03()
            java.io.File r4 = r12.A03
            if (r5 == 0) goto L_0x00a3
            X.1So r1 = X.C26551So.A0E
            boolean r1 = X.C63972u0.A04(r1)
            if (r1 == 0) goto L_0x00a3
            X.0ve r3 = r12.A0Q
            r2 = 3116(0xc2c, float:4.366E-42)
            if (r9 == 0) goto L_0x0075
            r2 = 6269(0x187d, float:8.785E-42)
        L_0x0075:
            X.0vf r1 = X.C18040vf.A01
            boolean r1 = X.C18020vd.A05(r1, r3, r2)
            if (r1 == 0) goto L_0x00a3
            if (r0 == 0) goto L_0x0090
            java.lang.String r2 = r5.getAbsolutePath()
            java.lang.String r1 = r0.getAbsolutePath()
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x0090
            X.C108985cd.A1C(r0)
        L_0x0090:
            if (r4 == 0) goto L_0x00a3
            java.lang.String r1 = r5.getAbsolutePath()
            java.lang.String r0 = r4.getAbsolutePath()
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00a3
            X.C108985cd.A1C(r4)
        L_0x00a3:
            return
        L_0x00a4:
            java.lang.String r1 = "media-file-utils/Second try rename succeeded"
            goto L_0x0058
        L_0x00a7:
            r6 = 0
            goto L_0x003f
        L_0x00a9:
            java.lang.String r1 = "media-file-utils/Second try rename succeeded"
            com.whatsapp.util.Log.i((java.lang.String) r1)
        L_0x00ae:
            r13.A0D(r0)
            if (r16 == 0) goto L_0x00a3
        L_0x00b3:
            java.io.File r0 = r13.A03()
            if (r0 == 0) goto L_0x00a3
            X.1Sl r1 = r12.A12
            java.io.File r0 = r13.A03()
            r1.A0m(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C115295ti.A06(X.5ti, X.6uk, java.io.File, java.lang.String, boolean):void");
    }

    public static C58092k8 A01(C115295ti r8) {
        Integer valueOf;
        String A022 = C25291Nq.A02(r8.A06);
        String A012 = C25291Nq.A01(r8.A15);
        C18030ve r1 = r8.A0Q;
        JniBridge jniBridge = r8.A14;
        String str = r8.A0e.A0A.A02;
        C190089kM r0 = r8.A00;
        if (r0 == null) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(r0.A01.get());
        }
        C18070vi.A0j(r1, jniBridge);
        return new C58092k8(r1, jniBridge, valueOf, A022, str, A012, (String) null, false);
    }

    private void A02(C1409173o r5) {
        C139666zF r3 = this.A0e;
        C139666zF.A00(r3);
        if (this.A17) {
            this.A0n.unregisterObserver(this.A0m);
        }
        this.A0d.A0C(r5, r3.A01, r5.A03());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02d3, code lost:
        if (r12 == 23) goto L_0x02d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x030f, code lost:
        if (r3.A0r.A0H == false) goto L_0x0311;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x032d, code lost:
        if (r14 == X.C26551So.A0a) goto L_0x032f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x04a7, code lost:
        if (r6 == 15) goto L_0x04a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0097, code lost:
        if (r3.A0r.A0H == false) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0143, code lost:
        if (r1 == X.C26551So.A0a) goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0217, code lost:
        if (r13 == 15) goto L_0x0219;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(X.C1409173o r25, X.C115295ti r26) {
        /*
            r3 = r26
            X.70W r2 = r3.A0k
            r1 = 0
            r26 = r25
            r0 = r26
            X.C18070vi.A0d(r0, r1)
            r2.A0H = r0
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2.A07 = r0
            r0 = 4
            r2.A03 = r0
            X.11P r0 = r3.A0L
            long r0 = X.AnonymousClass11P.A01(r0)
            r2.A08 = r0
            r0 = r26
            int r12 = r0.A01
            r0 = 22
            if (r12 != r0) goto L_0x0043
            X.1Ka r5 = r3.A10
            java.lang.Exception r1 = r2.A0M
            boolean r0 = r1 instanceof X.C122836Sc
            if (r0 == 0) goto L_0x0043
            r1.getCause()
            X.0ve r4 = r5.A01
            r1 = 5478(0x1566, float:7.676E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r4, r1)
            if (r0 == 0) goto L_0x0043
            java.lang.String r0 = ""
            r5.A01(r0)
        L_0x0043:
            X.2h4 r6 = r3.A01
            if (r6 == 0) goto L_0x0075
            long r4 = r2.A04()
            long r0 = r6.A07
            long r0 = r0 + r4
            r6.A07 = r0
            X.6zF r0 = r3.A0e
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x0066
            X.6ug r0 = r3.A0r
            boolean r0 = r0.A0I
            if (r0 == 0) goto L_0x0066
            X.2h4 r1 = r3.A01
            int r0 = r1.A02
            int r0 = r0 + 1
            r1.A02 = r0
        L_0x0066:
            boolean r4 = r26.A03()
            X.10I r1 = r3.A0v
            r0 = 24
            if (r4 == 0) goto L_0x0072
            r0 = 23
        L_0x0072:
            X.AnonymousClass7RA.A00(r1, r3, r0)
        L_0x0075:
            r0 = r26
            boolean r0 = r0.A04
            if (r0 == 0) goto L_0x0081
            java.lang.String r0 = "MediaDownload/sendStat skipping reporting events as we found media in the cache"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0080:
            return
        L_0x0081:
            java.lang.Integer r0 = X.AnonymousClass00R.A03
            X.1h9 r5 = r3.A0i
            int r9 = r3.A07
            r5.A03(r9, r0)
            X.6zF r7 = r3.A0e
            boolean r19 = r7.A02()
            if (r19 == 0) goto L_0x0099
            X.6ug r0 = r3.A0r
            boolean r0 = r0.A0H
            r15 = 1
            if (r0 != 0) goto L_0x009a
        L_0x0099:
            r15 = 0
        L_0x009a:
            X.2h4 r6 = r3.A01
            X.0ve r8 = r5.A00
            r0 = 9143(0x23b7, float:1.2812E-41)
            X.0vf r10 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r10, r8, r0)
            if (r0 != 0) goto L_0x00b5
            r0 = 9145(0x23b9, float:1.2815E-41)
            boolean r0 = X.C18020vd.A05(r10, r8, r0)
            if (r0 != 0) goto L_0x00b5
        L_0x00b0:
            X.6uk r4 = r3.A0d
            monitor-enter(r4)
            goto L_0x02ca
        L_0x00b5:
            java.util.HashMap r1 = r5.A04
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            java.lang.Object r4 = r1.get(r0)
            if (r4 != 0) goto L_0x00c9
            X.2gL r4 = new X.2gL
            r4.<init>()
            r1.put(r0, r4)
        L_0x00c9:
            X.2gL r4 = (X.C55772gL) r4
            r1 = r12
            java.lang.Boolean r0 = r2.A0L
            r11 = 0
            boolean r0 = X.C18070vi.A19(r0, r11)
            if (r0 == 0) goto L_0x00db
            r0 = 13
            if (r12 != r0) goto L_0x00db
            r1 = 24
        L_0x00db:
            int r0 = X.C1409973w.A00(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A05 = r0
            if (r6 == 0) goto L_0x02c6
            java.lang.String r0 = r6.A0D
            java.util.UUID r0 = java.util.UUID.fromString(r0)
            long r0 = r0.getMostSignificantBits()
            r13 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r0 = r0 & r13
        L_0x00f7:
            r4.A03 = r0
            long r0 = r2.A0F
            int r13 = (int) r0
            r4.A00 = r13
            if (r6 == 0) goto L_0x0102
            int r11 = r6.A03
        L_0x0102:
            r4.A02 = r11
            r0 = 9143(0x23b7, float:1.2812E-41)
            boolean r0 = X.C18020vd.A05(r10, r8, r0)
            if (r0 == 0) goto L_0x0122
            X.10s r1 = r5.A03
            r25 = 34
            X.Aiu r0 = new X.Aiu
            r20 = r0
            r21 = r4
            r22 = r5
            r23 = r7
            r24 = r9
            r20.<init>(r21, r22, r23, r24, r25)
            r1.execute(r0)
        L_0x0122:
            if (r15 != 0) goto L_0x00b0
            r0 = 9145(0x23b9, float:1.2815E-41)
            boolean r0 = X.C18020vd.A05(r10, r8, r0)
            if (r0 == 0) goto L_0x00b0
            X.1h6 r11 = r5.A01
            int r14 = r4.A01
            X.0ve r4 = r11.A01
            java.lang.Boolean r1 = r2.A0L
            X.73o r0 = r2.A0H
            int r13 = X.C32381h6.A00(r4, r0, r1)
            X.1So r1 = r2.A0m
            X.1So r0 = X.C26551So.A0L
            if (r1 == r0) goto L_0x0145
            X.1So r0 = X.C26551So.A0a
            r5 = 0
            if (r1 != r0) goto L_0x0146
        L_0x0145:
            r5 = 1
        L_0x0146:
            X.64S r4 = new X.64S
            r4.<init>()
            int r0 = r7.A05
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A0C = r0
            long r0 = r2.A0F
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A0P = r0
            long r0 = r7.A07
            double r8 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r8)
            r4.A04 = r0
            java.lang.Boolean r0 = X.AnonymousClass000.A0i()
            r4.A01 = r0
            int r0 = r2.A02
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A0B = r0
            java.lang.Integer r0 = r2.A0Q
            r4.A06 = r0
            java.lang.String r0 = r2.A0Z
            r4.A0V = r0
            java.net.URL r0 = r2.A0e
            if (r0 == 0) goto L_0x02c3
            java.lang.String r0 = r0.getHost()
        L_0x0182:
            r4.A0W = r0
            long r0 = r2.A04()
            r17 = 0
            int r8 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r8 <= 0) goto L_0x0194
            java.lang.Long r0 = X.C1409973w.A05(r0, r5)
            r4.A0Q = r0
        L_0x0194:
            long r0 = r2.A0A
            r15 = -1
            int r8 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r8 != 0) goto L_0x02be
            r0 = 0
        L_0x019e:
            java.lang.Long r0 = X.C1409973w.A05(r0, r5)
            r4.A0O = r0
            java.lang.Long r0 = r2.A0X
            r4.A0L = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            r4.A0A = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)
            r4.A08 = r0
            int r1 = r2.A00
            boolean r0 = r7.A0a
            int r0 = X.C1409973w.A02(r1, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A07 = r0
            java.lang.Long r0 = r2.A0U
            java.lang.Long r0 = X.C1409973w.A06(r0, r5)
            r4.A0J = r0
            long r0 = r2.A09
            int r8 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r8 != 0) goto L_0x01d2
            r0 = 0
        L_0x01d2:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A0H = r0
            long r0 = r2.A01()
            java.lang.Long r0 = X.C1409973w.A05(r0, r5)
            r4.A0E = r0
            long r0 = r2.A02()
            java.lang.Long r0 = X.C1409973w.A05(r0, r5)
            r4.A0G = r0
            java.lang.Boolean r0 = r2.A0I
            r4.A00 = r0
            java.lang.Long r0 = r2.A0W
            r4.A0F = r0
            java.lang.String r0 = r2.A0c
            java.lang.Integer r0 = X.C1408173e.A02(r0)
            r4.A09 = r0
            long r0 = r2.A05()
            double r8 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r8)
            r4.A02 = r0
            long r0 = r2.A03()
            java.lang.Long r0 = X.C1409973w.A05(r0, r5)
            r4.A0I = r0
            r0 = 1
            if (r13 == r0) goto L_0x0219
            r0 = 15
            r8 = 1
            if (r13 != r0) goto L_0x021a
        L_0x0219:
            r8 = 0
        L_0x021a:
            r1 = 0
            if (r8 == 0) goto L_0x02bb
            java.lang.String r0 = r2.A0d
        L_0x021f:
            r4.A0T = r0
            if (r8 == 0) goto L_0x02b8
            java.net.URL r0 = r2.A0e
            if (r0 == 0) goto L_0x02b5
            java.lang.String r0 = r0.toString()
        L_0x022b:
            r4.A0U = r0
            if (r8 == 0) goto L_0x0231
            java.lang.String r1 = r2.A0a
        L_0x0231:
            r4.A0S = r1
            if (r6 == 0) goto L_0x02ac
            long r0 = r6.A07
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L_0x023b:
            java.lang.Long r1 = X.C1409973w.A06(r0, r5)
            r4.A0M = r1
            java.lang.Long r0 = r4.A0O
            if (r1 != 0) goto L_0x02a7
            r5 = 0
        L_0x0247:
            if (r0 != 0) goto L_0x02a2
            r0 = 0
        L_0x024b:
            long r5 = r5 + r0
            int r0 = (r5 > r17 ? 1 : (r5 == r17 ? 0 : -1))
            if (r0 != 0) goto L_0x029d
            r0 = 0
        L_0x0251:
            r4.A0N = r0
            java.lang.Float r1 = r2.A0N
            if (r1 == 0) goto L_0x026d
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r5 = r1.floatValue()
            float r1 = X.C108945cZ.A00(r0, r5)
            r0 = 1
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x026d
            double r0 = (double) r5
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r4.A03 = r0
        L_0x026d:
            int r0 = r2.A04
            if (r0 <= 0) goto L_0x0277
            java.lang.Long r0 = X.C17880vN.A0n(r0)
            r4.A0D = r0
        L_0x0277:
            int r0 = r2.A05
            if (r0 <= 0) goto L_0x0281
            java.lang.Long r0 = X.C17880vN.A0n(r0)
            r4.A0K = r0
        L_0x0281:
            java.lang.String r1 = r7.A0F
            java.lang.String r0 = r7.A0L
            int r0 = r11.A01(r1, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A05 = r0
            X.10s r5 = r11.A05
            r1 = 19
            X.7R0 r0 = new X.7R0
            r0.<init>(r11, r7, r4, r1)
            r5.execute(r0)
            goto L_0x00b0
        L_0x029d:
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            goto L_0x0251
        L_0x02a2:
            long r0 = r0.longValue()
            goto L_0x024b
        L_0x02a7:
            long r5 = r1.longValue()
            goto L_0x0247
        L_0x02ac:
            java.lang.Long r0 = java.lang.Long.valueOf(r17)
            r4.A0P = r0
            java.lang.Long r0 = r4.A0Q
            goto L_0x023b
        L_0x02b5:
            r0 = 0
            goto L_0x022b
        L_0x02b8:
            r0 = r1
            goto L_0x022b
        L_0x02bb:
            r0 = r1
            goto L_0x021f
        L_0x02be:
            long r8 = r2.A0l
            long r0 = r0 - r8
            goto L_0x019e
        L_0x02c3:
            r0 = 0
            goto L_0x0182
        L_0x02c6:
            r0 = 0
            goto L_0x00f7
        L_0x02ca:
            boolean r0 = r4.A0G     // Catch:{ all -> 0x05e8 }
            monitor-exit(r4)
            if (r0 != 0) goto L_0x02d5
            r0 = 23
            r17 = 0
            if (r12 != r0) goto L_0x02d7
        L_0x02d5:
            r17 = 1
        L_0x02d7:
            boolean r0 = r7.A0R
            if (r0 != 0) goto L_0x0304
            r0 = r26
            X.64W r1 = r0.A00
            if (r1 == 0) goto L_0x0304
            X.18K r0 = r3.A0R
            r0.CC7(r1)
        L_0x02e6:
            X.10I r6 = r3.A0v
            r0 = 25
            X.AnonymousClass7RA.A00(r6, r3, r0)
            long r4 = r2.A05()
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0080
            r2 = 33
            X.7Qr r1 = new X.7Qr
            r0 = r26
            r1.<init>(r3, r0, r2)
            r6.CGF(r1)
            return
        L_0x0304:
            X.1h6 r12 = r3.A0V
            X.2h4 r11 = r3.A01
            if (r19 == 0) goto L_0x0311
            X.6ug r0 = r3.A0r
            boolean r0 = r0.A0H
            r1 = 1
            if (r0 != 0) goto L_0x0312
        L_0x0311:
            r1 = 0
        L_0x0312:
            int r0 = r3.A06
            r18 = r0
            java.lang.Integer r8 = r4.A06
            if (r1 != 0) goto L_0x02e6
            X.0ve r13 = r12.A01
            java.lang.Boolean r1 = r2.A0L
            X.73o r0 = r2.A0H
            int r6 = X.C32381h6.A00(r13, r0, r1)
            X.1So r14 = r2.A0m
            X.1So r0 = X.C26551So.A0L
            if (r14 == r0) goto L_0x032f
            X.1So r0 = X.C26551So.A0a
            r5 = 0
            if (r14 != r0) goto L_0x0330
        L_0x032f:
            r5 = 1
        L_0x0330:
            X.64W r4 = new X.64W
            r4.<init>()
            int r9 = r7.A05
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r4.A0M = r0
            boolean r0 = r2.A0g
            if (r0 == 0) goto L_0x05e4
            r0 = 4
        L_0x0343:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A0f = r0
            long r0 = r2.A0F
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A0h = r0
            long r0 = r7.A07
            double r15 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r15)
            r4.A0C = r0
            r15 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r15)
            r4.A06 = r0
            r4.A07 = r0
            int r0 = r2.A02
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A0H = r0
            java.lang.Integer r0 = r2.A0Q
            r4.A0D = r0
            java.lang.String r0 = r2.A0Z
            r4.A0o = r0
            java.net.URL r0 = r2.A0e
            if (r0 == 0) goto L_0x05e1
            java.lang.String r0 = r0.getHost()
        L_0x037b:
            r4.A0p = r0
            int r1 = r14.A00
            boolean r0 = X.AnonymousClass25A.A0I(r1)
            if (r0 != 0) goto L_0x038a
            r0 = 82
            if (r1 == r0) goto L_0x038a
            r15 = 0
        L_0x038a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r15)
            r4.A05 = r0
            long r0 = r2.A0E
            r15 = 0
            int r14 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r14 <= 0) goto L_0x05dd
            long r14 = java.lang.System.currentTimeMillis()
            long r14 = r14 - r0
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r14 = r14 / r0
        L_0x03a1:
            java.lang.Long r0 = java.lang.Long.valueOf(r14)
            r4.A0O = r0
            r0 = 8
            if (r6 == r0) goto L_0x03d9
            r0 = 6
            if (r6 == r0) goto L_0x03d9
            r0 = 9
            if (r6 == r0) goto L_0x03d9
            r0 = 29
            if (r6 == r0) goto L_0x03d9
            r0 = 10
            if (r6 == r0) goto L_0x03d9
            r0 = 35
            if (r6 == r0) goto L_0x03d9
            r0 = 36
            if (r6 == r0) goto L_0x03d9
            r0 = 37
            if (r6 == r0) goto L_0x03d9
            r0 = 38
            if (r6 == r0) goto L_0x03d9
            r0 = 39
            if (r6 == r0) goto L_0x03d9
            r0 = 14
            if (r6 == r0) goto L_0x03d9
            r0 = 2
            if (r6 == r0) goto L_0x03d9
            r0 = 25
            if (r6 != r0) goto L_0x03e5
        L_0x03d9:
            r0 = 3820(0xeec, float:5.353E-42)
            boolean r0 = X.C18020vd.A05(r10, r13, r0)
            if (r0 == 0) goto L_0x03e5
            java.lang.String r0 = r2.A0Y
            r4.A0k = r0
        L_0x03e5:
            X.6r5 r1 = r7.A09
            if (r1 == 0) goto L_0x03f4
            r0 = 2
            if (r9 != r0) goto L_0x05c0
            r0 = 3349(0xd15, float:4.693E-42)
            boolean r0 = X.C18020vd.A05(r10, r13, r0)
            if (r0 != 0) goto L_0x05cb
        L_0x03f4:
            int r0 = r2.A01
            long r0 = (long) r0
            r13 = 32
            int r9 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r9 <= 0) goto L_0x03fe
            r13 = r0
        L_0x03fe:
            java.lang.Long r0 = java.lang.Long.valueOf(r13)
            r4.A0P = r0
            if (r17 == 0) goto L_0x040a
            java.lang.Integer r8 = X.C17880vN.A0i()
        L_0x040a:
            r4.A0E = r8
            long r0 = r2.A04()
            r15 = 0
            int r8 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r8 <= 0) goto L_0x041c
            java.lang.Long r0 = X.C1409973w.A05(r0, r5)
            r4.A0i = r0
        L_0x041c:
            long r0 = r2.A0A
            r13 = -1
            int r8 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r8 != 0) goto L_0x05bb
            r0 = 0
        L_0x0426:
            java.lang.Long r0 = X.C1409973w.A05(r0, r5)
            r4.A0g = r0
            java.lang.Long r0 = r2.A0X
            if (r0 == 0) goto L_0x0432
            r4.A0b = r0
        L_0x0432:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r4.A0L = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r18)
            r4.A0K = r0
            int r1 = r2.A00
            boolean r0 = r7.A0a
            int r0 = X.C1409973w.A02(r1, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A0J = r0
            java.lang.Long r0 = r2.A0U
            java.lang.Long r0 = X.C1409973w.A06(r0, r5)
            r4.A0e = r0
            long r0 = r2.A09
            int r8 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r8 != 0) goto L_0x045c
            r0 = 0
        L_0x045c:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A0T = r0
            long r0 = r2.A01()
            java.lang.Long r0 = X.C1409973w.A05(r0, r5)
            r4.A0Q = r0
            long r0 = r2.A02()
            java.lang.Long r0 = X.C1409973w.A05(r0, r5)
            r4.A0S = r0
            java.lang.Boolean r0 = r2.A0I
            r4.A00 = r0
            java.lang.Long r0 = r2.A0W
            r4.A0R = r0
            java.lang.String r0 = r2.A0c
            java.lang.Integer r0 = X.C1408173e.A02(r0)
            r4.A0G = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r19)
            r4.A01 = r0
            long r0 = r2.A05()
            double r8 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r8)
            r4.A08 = r0
            long r0 = r2.A03()
            java.lang.Long r0 = X.C1409973w.A05(r0, r5)
            r4.A0U = r0
            r0 = 1
            if (r6 == r0) goto L_0x04a9
            r0 = 15
            r8 = 1
            if (r6 != r0) goto L_0x04aa
        L_0x04a9:
            r8 = 0
        L_0x04aa:
            r1 = 0
            if (r8 == 0) goto L_0x05b8
            java.lang.String r0 = r2.A0d
        L_0x04af:
            r4.A0m = r0
            java.lang.String r0 = r2.A0b
            r4.A0q = r0
            if (r8 == 0) goto L_0x05b5
            java.net.URL r0 = r2.A0e
            if (r0 == 0) goto L_0x05b2
            java.lang.String r0 = r0.toString()
        L_0x04bf:
            r4.A0n = r0
            if (r8 == 0) goto L_0x04c5
            java.lang.String r1 = r2.A0a
        L_0x04c5:
            r4.A0l = r1
            java.lang.Boolean r0 = r2.A0K
            r4.A03 = r0
            if (r11 == 0) goto L_0x059e
            int r0 = r11.A03
            java.lang.Long r0 = X.C17880vN.A0n(r0)
            r4.A0a = r0
            long r0 = r11.A07
            java.lang.Long r0 = X.C1409973w.A05(r0, r5)
            r4.A0c = r0
            java.lang.String r0 = r11.A0D
            java.util.UUID r0 = java.util.UUID.fromString(r0)
            long r5 = r0.getMostSignificantBits()
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r5 = r5 & r0
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            r4.A0Z = r0
        L_0x04f3:
            java.lang.Long r1 = r4.A0c
            java.lang.Long r0 = r4.A0g
            if (r1 != 0) goto L_0x0598
            r5 = 0
        L_0x04fb:
            if (r0 != 0) goto L_0x0592
            r0 = 0
        L_0x04ff:
            long r5 = r5 + r0
            int r0 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1))
            if (r0 != 0) goto L_0x058c
            r0 = 0
        L_0x0505:
            r4.A0d = r0
            java.lang.Float r1 = r2.A0N
            if (r1 == 0) goto L_0x0521
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r5 = r1.floatValue()
            float r1 = X.C108945cZ.A00(r0, r5)
            r0 = 1
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0521
            double r0 = (double) r5
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r4.A09 = r0
        L_0x0521:
            java.lang.Float r0 = r2.A0O
            if (r0 == 0) goto L_0x0530
            float r0 = r0.floatValue()
            double r0 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r4.A0A = r0
        L_0x0530:
            int r0 = r2.A04
            if (r0 <= 0) goto L_0x053a
            java.lang.Long r0 = X.C17880vN.A0n(r0)
            r4.A0N = r0
        L_0x053a:
            int r0 = r2.A05
            if (r0 <= 0) goto L_0x0544
            java.lang.Long r0 = X.C17880vN.A0n(r0)
            r4.A0Y = r0
        L_0x0544:
            java.lang.String r0 = r7.A0F
            java.lang.String r8 = r7.A0L
            int r0 = r12.A01(r0, r8)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A0I = r0
            boolean r0 = r2.A0f
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.A02 = r0
            long r5 = r2.A0B
            double r0 = (double) r5
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r4.A0B = r0
            long r0 = r2.A0C
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A0V = r0
            java.lang.Integer r0 = r2.A0S
            if (r0 == 0) goto L_0x0571
            r4.A0F = r0
        L_0x0571:
            boolean r0 = r7.A0X
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.A04 = r0
            X.10s r1 = r12.A05
            r14 = 32
            X.AkN r0 = new X.AkN
            r9 = r0
            r10 = r12
            r11 = r7
            r12 = r4
            r13 = r8
            r9.<init>(r10, r11, r12, r13, r14)
            r1.execute(r0)
            goto L_0x02e6
        L_0x058c:
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            goto L_0x0505
        L_0x0592:
            long r0 = r0.longValue()
            goto L_0x04ff
        L_0x0598:
            long r5 = r1.longValue()
            goto L_0x04fb
        L_0x059e:
            java.lang.Long r0 = java.lang.Long.valueOf(r15)
            r4.A0h = r0
            r4.A0a = r0
            r4.A0Z = r0
            java.lang.Long r0 = r4.A0i
            java.lang.Long r0 = X.C1409973w.A06(r0, r5)
            r4.A0c = r0
            goto L_0x04f3
        L_0x05b2:
            r0 = 0
            goto L_0x04bf
        L_0x05b5:
            r0 = r1
            goto L_0x04bf
        L_0x05b8:
            r0 = r1
            goto L_0x04af
        L_0x05bb:
            long r8 = r2.A0l
            long r0 = r0 - r8
            goto L_0x0426
        L_0x05c0:
            r0 = 3
            if (r9 != r0) goto L_0x03f4
            r0 = 4468(0x1174, float:6.261E-42)
            boolean r0 = X.C18020vd.A05(r10, r13, r0)
            if (r0 == 0) goto L_0x03f4
        L_0x05cb:
            int r0 = r1.A00
            java.lang.Long r0 = X.C17880vN.A0n(r0)
            r4.A0W = r0
            int r0 = r1.A01
            java.lang.Long r0 = X.C17880vN.A0n(r0)
            r4.A0X = r0
            goto L_0x03f4
        L_0x05dd:
            r14 = -1
            goto L_0x03a1
        L_0x05e1:
            r0 = 0
            goto L_0x037b
        L_0x05e4:
            r0 = 3
            goto L_0x0343
        L_0x05e8:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C115295ti.A03(X.73o, X.5ti):void");
    }

    public static void A05(C115295ti r6) {
        File file = r6.A02;
        if (file != null) {
            synchronized (file) {
                if (file.exists() && file.length() == 0) {
                    A08(r6.A0B, file);
                }
            }
        }
    }

    private void A07(File file) {
        C18030ve r2 = this.A0Q;
        int i = this.A0e.A04;
        long length = file.length();
        if (i == 7 && length < ((long) C18020vd.A00(C18040vf.A02, r2, 6736)) * 1024) {
            try {
                List A012 = AnonymousClass72d.A01(this.A13.A01(Uri.fromFile(file)));
                if (A012 != null) {
                    C136996uk r1 = this.A0d;
                    Integer valueOf = Integer.valueOf(A012.size());
                    synchronized (r1) {
                        r1.A05 = valueOf;
                    }
                }
            } catch (IOException e) {
                Log.e("vcardloader/splitvcards/exception", e);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:205:?, code lost:
        r14.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0469, code lost:
        r17.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x046c, code lost:
        if (r16 == null) goto L_0x049d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x046e, code lost:
        r14 = r16.intValue();
        r13 = 2;
        r12 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0475, code lost:
        if (r14 == 1) goto L_0x0489;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0477, code lost:
        if (r14 == 0) goto L_0x048e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0479, code lost:
        r13 = 5;
        r12 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x047d, code lost:
        if (r14 == 4) goto L_0x0489;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x047f, code lost:
        if (r14 == 3) goto L_0x0484;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0481, code lost:
        if (r14 == 2) goto L_0x048e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0484, code lost:
        r0 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0489, code lost:
        r0 = java.lang.Integer.valueOf(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x048e, code lost:
        r0 = java.lang.Integer.valueOf(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0492, code lost:
        if (r0 == null) goto L_0x049d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0494, code lost:
        r7.A0S = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x05e8, code lost:
        if (r3.A02.isCancelled() != false) goto L_0x05ea;
     */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x034b A[Catch:{ Exception -> 0x040a }] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x035f  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x044a A[Catch:{ all -> 0x063e, all -> 0x0645, all -> 0x064a }] */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x0497 A[SYNTHETIC, Splitter:B:220:0x0497] */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x0602  */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x034f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01db A[SYNTHETIC, Splitter:B:73:0x01db] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x023b A[Catch:{ Exception -> 0x040a }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x026a A[Catch:{ Exception -> 0x040a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A0E() {
        /*
            r35 = this;
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            r3 = r35
            X.1h9 r10 = r3.A0i
            int r9 = r3.A07
            r10.A03(r9, r0)
            java.lang.Integer r0 = X.AnonymousClass00R.A0Y
            r10.A03(r9, r0)
            X.6zF r2 = r3.A0e
            java.lang.String r8 = r2.A0H
            r19 = 0
            if (r8 != 0) goto L_0x00a8
            java.lang.String r0 = "MediaDownload/call/media hash is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r5 = 28
        L_0x001f:
            r4 = 0
            X.73o r0 = new X.73o
            r1 = r19
            r0.<init>(r5, r1, r4)
        L_0x0027:
            X.11P r5 = r3.A0L
            X.AnonymousClass11P.A01(r5)
            boolean r1 = r0.A03()
            if (r1 == 0) goto L_0x0602
            r3.A02(r0)
            X.6uk r8 = r3.A0d
            java.io.File r1 = r3.A02
            long r6 = r1.length()
            r8.A0B(r6)
            X.6ug r7 = r3.A0r
            r1 = 2
            r7.A03(r1)
            boolean r1 = r2.A0a
            if (r1 != 0) goto L_0x0076
            int r4 = r8.A00()
            r1 = 1
            if (r4 == r1) goto L_0x0076
            int r4 = r8.A00()
            r1 = 3
            if (r4 != r1) goto L_0x005d
            java.lang.String r1 = "MediaDownload/updateMessageAfterExecution/keeping suspicious download file"
            com.whatsapp.util.Log.i((java.lang.String) r1)
        L_0x005d:
            java.io.File r4 = r0.A02
            if (r4 == 0) goto L_0x009f
            r4.getAbsolutePath()
            java.io.File r1 = r3.A02
            r1.getAbsolutePath()
            java.io.File r1 = r3.A02
            r1.getAbsolutePath()
            r8.A0D(r4)
            java.io.File r1 = r3.A02
            r1.delete()
        L_0x0076:
            r1 = 3
            r7.A03(r1)
            java.util.List r3 = r7.A05
            r3.clear()
            boolean r1 = r2.A02()
            if (r1 == 0) goto L_0x0634
            java.io.File r1 = r8.A03()
            r7.A0C = r1
            java.util.Iterator r3 = r3.iterator()
        L_0x008f:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x05f6
            java.lang.Object r1 = r3.next()
            X.8Ab r1 = (X.C160828Ab) r1
            r1.BuV()
            goto L_0x008f
        L_0x009f:
            java.io.File r6 = r3.A02
            java.lang.String r4 = r0.A03
            r1 = 0
            A06(r3, r8, r6, r4, r1)
            goto L_0x0076
        L_0x00a8:
            java.io.File r0 = r2.A0B
            X.C17960vV.A07(r0)
            r3.A02 = r0
            X.70W r7 = r3.A0k
            X.1SK r0 = r3.A0Y
            r25 = r0
            r4 = 1
            java.lang.Float r0 = r0.BNL(r4)
            r7.A0N = r0
            X.0ve r0 = r3.A0Q
            r24 = r0
            boolean r0 = X.C50262Tt.A00(r24)
            if (r0 == 0) goto L_0x00ce
            r0 = r25
            java.lang.Float r0 = r0.BNM(r4)
            r7.A0O = r0
        L_0x00ce:
            X.6ug r1 = r3.A0r
            r1.A03(r4)
            boolean r20 = r2.A02()
            r17 = 0
            if (r20 == 0) goto L_0x0108
            java.io.File r0 = r3.A02
            r1.A0C = r0
            java.util.List r0 = r1.A05
            java.util.Iterator r1 = r0.iterator()
        L_0x00e5:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00f5
            java.lang.Object r0 = r1.next()
            X.8Ab r0 = (X.C160828Ab) r0
            r0.BuV()
            goto L_0x00e5
        L_0x00f5:
            java.io.File r0 = r3.A02
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x0560
            java.io.File r0 = r3.A02
            boolean r0 = r0.createNewFile()
            if (r0 != 0) goto L_0x0108
            X.C123836Wa.A00(r8)
        L_0x0108:
            int r0 = r3.A15
            if (r0 == 0) goto L_0x0160
            android.os.ConditionVariable r1 = r3.A09
            if (r1 == 0) goto L_0x0117
            boolean r0 = r3.A16
            if (r0 != 0) goto L_0x0117
            r1.block()
        L_0x0117:
            r3.A0F()
            X.11Z r0 = r3.A0N
            long r5 = r0.A01()
            long r15 = r0.A03()
            long r0 = r2.A07
            r12 = 1291(0x50b, float:1.809E-42)
            r11 = r24
            long r13 = X.C108995ce.A07(r11, r12)
            r11 = 32000000(0x1e84800, double:1.58101007E-316)
            long r12 = java.lang.Math.max(r11, r13)
            boolean r11 = r2.A0a
            if (r11 != 0) goto L_0x0160
            long r12 = r12 + r0
            int r11 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r11 >= 0) goto L_0x0160
            java.lang.StringBuilder r9 = X.AnonymousClass000.A10()
            java.lang.String r4 = "MediaDownload/call/nospace total: "
            r9.append(r4)
            r7 = r15
            r9.append(r7)
            java.lang.String r4 = " free: "
            r9.append(r4)
            r9.append(r5)
            java.lang.String r4 = " need: "
            X.C17900vP.A0l(r4, r9, r0)
            r1 = 4
        L_0x0159:
            X.73o r0 = new X.73o
            r0.<init>(r1)
            goto L_0x0027
        L_0x0160:
            long r0 = android.os.SystemClock.elapsedRealtime()
            r7.A0A = r0
            r0 = 0
            r7.A03 = r0
            X.1Sb r11 = r3.A0U
            java.lang.String r6 = r2.A0I
            int r0 = r3.A15
            boolean r5 = X.AnonymousClass000.A1P(r0)
            boolean r12 = r2.A0a
            if (r6 == 0) goto L_0x0199
            X.1SS r1 = r11.A0I
            r0 = 1
            if (r12 == 0) goto L_0x017d
            r0 = 3
        L_0x017d:
            X.2h4 r1 = r1.A03(r6, r0)
            if (r1 == 0) goto L_0x0199
            if (r5 == 0) goto L_0x018b
            int r0 = r1.A03
            int r0 = r0 + 1
            r1.A03 = r0
        L_0x018b:
            r3.A01 = r1
            java.lang.String r5 = r1.A0D
            boolean r0 = r5.equals(r6)
            if (r0 != 0) goto L_0x01b6
            X.6uk r1 = r3.A0d
            monitor-enter(r1)
            goto L_0x01a4
        L_0x0199:
            X.1SS r1 = r11.A0I
            r0 = 1
            if (r12 == 0) goto L_0x019f
            r0 = 3
        L_0x019f:
            X.2h4 r1 = r1.A02(r6, r0)
            goto L_0x018b
        L_0x01a4:
            r1.A0D = r5     // Catch:{ all -> 0x0638 }
            monitor-exit(r1)
            X.2h4 r0 = r3.A01
            java.lang.String r1 = r0.A0D
            X.1TJ r0 = r3.A0K
            r0.A04(r1)
            X.2h4 r0 = r3.A01
            int r0 = r0.A02
            r7.A06 = r0
        L_0x01b6:
            X.11P r0 = r3.A0L
            r32 = r0
            long r5 = android.os.SystemClock.elapsedRealtime()
            X.1Kg r0 = r3.A0n
            r23 = r0
            r23.A0D()
            long r0 = android.os.SystemClock.elapsedRealtime()
            java.lang.Long r0 = X.C108945cZ.A1B(r0, r5)
            r7.A0X = r0
            r3.A0F()
            X.0vc r0 = r3.A0l
            X.17r r11 = r3.A0B
            X.C26511Sk.A0P(r11, r0)
            if (r12 == 0) goto L_0x021b
            int r1 = r2.A05     // Catch:{ Exception -> 0x040a }
            r0 = 9
            if (r1 != r0) goto L_0x021b
            java.lang.String r5 = r2.A0F     // Catch:{ Exception -> 0x040a }
            if (r5 == 0) goto L_0x021b
            java.lang.String r1 = r2.A0G     // Catch:{ Exception -> 0x040a }
            boolean r0 = X.AnonymousClass1YF.A0T(r5)     // Catch:{ Exception -> 0x040a }
            r0 = r0 ^ 1
            if (r0 == r4) goto L_0x01fa
            if (r1 == 0) goto L_0x021b
            boolean r0 = X.AnonymousClass1YF.A0T(r1)     // Catch:{ Exception -> 0x040a }
            r0 = r0 ^ 1
            if (r0 != r4) goto L_0x021b
            r5 = r1
        L_0x01fa:
            java.io.File r13 = r11.A0d(r5)     // Catch:{ Exception -> 0x040a }
            long r5 = r13.length()     // Catch:{ Exception -> 0x040a }
            int r0 = (r5 > r17 ? 1 : (r5 == r17 ? 0 : -1))
            if (r0 <= 0) goto L_0x021b
            java.lang.String r0 = r13.getAbsolutePath()     // Catch:{ Exception -> 0x040a }
            java.lang.String r14 = X.C64062u9.A09(r0)     // Catch:{ Exception -> 0x040a }
            r15 = 0
            X.73o r0 = new X.73o     // Catch:{ Exception -> 0x040a }
            r16 = r15
            r17 = r4
            r12 = r0
            r12.<init>(r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x040a }
            goto L_0x0027
        L_0x021b:
            X.190 r0 = r3.A0A     // Catch:{ Exception -> 0x040a }
            r34 = r0
            X.1ST r12 = r3.A0P     // Catch:{ Exception -> 0x040a }
            X.1Nb r0 = r3.A0o     // Catch:{ Exception -> 0x040a }
            r22 = r0
            X.2d7 r1 = r2.A01()     // Catch:{ Exception -> 0x040a }
            if (r1 == 0) goto L_0x034b
            X.1So r0 = r2.A0A     // Catch:{ Exception -> 0x040a }
            boolean r0 = X.C63972u0.A04(r0)     // Catch:{ Exception -> 0x040a }
            if (r0 == 0) goto L_0x034b
            int[] r5 = r1.A01     // Catch:{ Exception -> 0x040a }
            if (r5 == 0) goto L_0x034b
            int r1 = r5.length     // Catch:{ Exception -> 0x040a }
            r0 = 4
            if (r1 != r0) goto L_0x034b
            r0 = 0
            r1 = r5[r0]     // Catch:{ Exception -> 0x040a }
            r0 = r5[r4]     // Catch:{ Exception -> 0x040a }
            int r1 = r1 + r0
            r0 = 2
            r0 = r5[r0]     // Catch:{ Exception -> 0x040a }
            int r1 = r1 + r0
            long r0 = (long) r1     // Catch:{ Exception -> 0x040a }
        L_0x0246:
            java.lang.String r5 = "mediadownload/findexistingfile"
            X.1Ez r6 = new X.1Ez     // Catch:{ Exception -> 0x040a }
            r6.<init>((java.lang.String) r5)     // Catch:{ Exception -> 0x040a }
            X.C17960vV.A07(r8)     // Catch:{ Exception -> 0x040a }
            X.1So r5 = r2.A0A     // Catch:{ Exception -> 0x040a }
            r33 = r5
            int r5 = r5.A00     // Catch:{ Exception -> 0x040a }
            java.util.ArrayList r5 = r12.A0E(r8, r5)     // Catch:{ Exception -> 0x040a }
            r6.A02()     // Catch:{ Exception -> 0x040a }
            r5.size()     // Catch:{ Exception -> 0x040a }
            java.util.Iterator r18 = r5.iterator()     // Catch:{ Exception -> 0x040a }
        L_0x0264:
            boolean r5 = r18.hasNext()     // Catch:{ Exception -> 0x040a }
            if (r5 == 0) goto L_0x034f
            X.21V r17 = X.C17880vN.A0b(r18)     // Catch:{ Exception -> 0x040a }
            r6 = r17
            r5 = r22
            int r6 = X.C26521Sl.A01(r6, r5)     // Catch:{ Exception -> 0x040a }
            int r5 = r2.A01     // Catch:{ Exception -> 0x040a }
            if (r6 != r5) goto L_0x0264
            X.2rc r5 = X.AnonymousClass206.A00(r17)     // Catch:{ Exception -> 0x040a }
            java.io.File r5 = r5.A0G     // Catch:{ Exception -> 0x040a }
            r21 = r5
            X.C17960vV.A07(r21)     // Catch:{ Exception -> 0x040a }
            java.lang.String r6 = r2.A0M     // Catch:{ Exception -> 0x040a }
            java.lang.String r16 = "MediaDownload/call/could not get hash for existing file; file="
            if (r6 == 0) goto L_0x0318
            r12 = -1
            int r5 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r5 == 0) goto L_0x0318
            java.security.MessageDigest r14 = X.C108945cZ.A1I()     // Catch:{ IOException | NoSuchAlgorithmException -> 0x033d }
            java.io.FileInputStream r5 = X.C108945cZ.A18(r21)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x033d }
            java.io.BufferedInputStream r12 = new java.io.BufferedInputStream     // Catch:{ IOException | NoSuchAlgorithmException -> 0x033d }
            r12.<init>(r5)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x033d }
            X.6QY r5 = new X.6QY     // Catch:{ all -> 0x030e }
            r5.<init>(r12, r0)     // Catch:{ all -> 0x030e }
            X.9HQ r13 = new X.9HQ     // Catch:{ all -> 0x030e }
            r13.<init>(r5, r14)     // Catch:{ all -> 0x030e }
            X.6QZ r14 = new X.6QZ     // Catch:{ all -> 0x0304 }
            r14.<init>(r13, r12)     // Catch:{ all -> 0x0304 }
            java.security.MessageDigest r5 = X.C108945cZ.A1I()     // Catch:{ all -> 0x02fa }
            X.C1402370n.A02(r14, r5)     // Catch:{ all -> 0x02fa }
            byte[] r5 = r5.digest()     // Catch:{ all -> 0x02fa }
            java.lang.String r15 = X.C108955ca.A14(r5)     // Catch:{ all -> 0x02fa }
            boolean r5 = r15.equals(r8)     // Catch:{ all -> 0x02fa }
            if (r5 != 0) goto L_0x02f0
            java.lang.String r5 = r13.A00()     // Catch:{ all -> 0x02fa }
            boolean r5 = r5.equals(r6)     // Catch:{ all -> 0x02fa }
            if (r5 != 0) goto L_0x02f0
            java.lang.StringBuilder r6 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x02fa }
            java.lang.String r5 = "MediaDownload/call/file exists for hash, but existing file hash ("
            r6.append(r5)     // Catch:{ all -> 0x02fa }
            r6.append(r15)     // Catch:{ all -> 0x02fa }
            java.lang.String r5 = ") does not match to stored value ("
            r6.append(r5)     // Catch:{ all -> 0x02fa }
            r6.append(r8)     // Catch:{ all -> 0x02fa }
            java.lang.String r5 = "), probably the file has been replaced"
            X.C17890vO.A1A(r6, r5)     // Catch:{ all -> 0x02fa }
            r14.close()     // Catch:{ all -> 0x0304 }
            r13.close()     // Catch:{ all -> 0x030e }
            r12.close()     // Catch:{ IOException | NoSuchAlgorithmException -> 0x033d }
            goto L_0x0264
        L_0x02f0:
            r14.close()     // Catch:{ all -> 0x0304 }
            r13.close()     // Catch:{ all -> 0x030e }
            r12.close()     // Catch:{ IOException | NoSuchAlgorithmException -> 0x033d }
            goto L_0x0351
        L_0x02fa:
            r6 = move-exception
            r14.close()     // Catch:{ all -> 0x02ff }
            goto L_0x0303
        L_0x02ff:
            r5 = move-exception
            X.AnonymousClass0DT.A00(r6, r5)     // Catch:{ all -> 0x0304 }
        L_0x0303:
            throw r6     // Catch:{ all -> 0x0304 }
        L_0x0304:
            r6 = move-exception
            r13.close()     // Catch:{ all -> 0x0309 }
            goto L_0x030d
        L_0x0309:
            r5 = move-exception
            X.AnonymousClass0DT.A00(r6, r5)     // Catch:{ all -> 0x030e }
        L_0x030d:
            throw r6     // Catch:{ all -> 0x030e }
        L_0x030e:
            r6 = move-exception
            r12.close()     // Catch:{ all -> 0x0313 }
            goto L_0x0317
        L_0x0313:
            r5 = move-exception
            X.AnonymousClass0DT.A00(r6, r5)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x033d }
        L_0x0317:
            throw r6     // Catch:{ IOException | NoSuchAlgorithmException -> 0x033d }
        L_0x0318:
            java.lang.String r12 = X.C1402370n.A00(r21)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x033d }
            boolean r5 = r12.equals(r8)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x033d }
            if (r5 != 0) goto L_0x0351
            java.lang.StringBuilder r6 = X.AnonymousClass000.A10()     // Catch:{ IOException | NoSuchAlgorithmException -> 0x033d }
            java.lang.String r5 = "MediaDownload/call/file exists for hash, but existing file hash ("
            r6.append(r5)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x033d }
            r6.append(r12)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x033d }
            java.lang.String r5 = ") does not match to stored value ("
            r6.append(r5)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x033d }
            r6.append(r8)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x033d }
            java.lang.String r5 = "), probably the file has been replaced"
            X.C17890vO.A1A(r6, r5)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x033d }
            goto L_0x0264
        L_0x033d:
            r13 = move-exception
            java.lang.StringBuilder r12 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x040a }
            r6 = r21
            r5 = r16
            X.C108995ce.A1J(r6, r5, r12, r13)     // Catch:{ Exception -> 0x040a }
            goto L_0x0264
        L_0x034b:
            r0 = -1
            goto L_0x0246
        L_0x034f:
            r17 = r19
        L_0x0351:
            X.C17960vV.A07(r17)     // Catch:{ Exception -> 0x040a }
            X.2rc r6 = X.AnonymousClass206.A00(r17)     // Catch:{ Exception -> 0x040a }
            java.io.File r1 = r6.A0G     // Catch:{ Exception -> 0x040a }
            X.C17960vV.A07(r1)     // Catch:{ Exception -> 0x040a }
            if (r1 == 0) goto L_0x040f
            X.C123836Wa.A00(r8)
            r1.getAbsolutePath()
            X.18K r12 = r3.A0R
            com.whatsapp.media.attachment.Kaleidoscope r10 = r3.A0X
            X.1Sc r4 = r3.A0j
            com.whatsapp.media.WamediaManager r9 = r3.A0W
            X.6uk r5 = r3.A0d
            X.6xt r7 = r3.A0q
            X.64a r0 = r3.A0p
            r21 = r11
            r22 = r24
            r23 = r12
            r24 = r9
            r25 = r10
            r26 = r3
            r27 = r5
            r28 = r2
            r29 = r4
            r30 = r0
            r31 = r7
            r32 = r1
            X.AnonymousClass74L.A0B(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            if (r20 == 0) goto L_0x03b5
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            X.C17960vV.A07(r8)
            X.C108995ce.A1N(r4, r8)
            java.lang.String r0 = ".chk.tmp"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r4)
            java.io.File r4 = r11.A0a(r0)
            boolean r0 = r4.exists()
            if (r0 == 0) goto L_0x03b5
            boolean r0 = r4.delete()
            if (r0 != 0) goto L_0x03b5
            java.lang.String r0 = "MediaDownload/call/unable to delete chunk store file on file hash match"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x03b5:
            boolean r4 = r2.A0Z
            boolean r0 = X.C25291Nq.A06(r33)
            if (r0 != 0) goto L_0x03cb
            boolean r0 = X.C63972u0.A07(r33)
            if (r0 != 0) goto L_0x03cb
            boolean r0 = X.C63972u0.A04(r33)
            if (r0 == 0) goto L_0x03f5
            if (r4 == 0) goto L_0x03f5
        L_0x03cb:
            X.2r8 r4 = r3.A0s
            X.73l r0 = r3.A0u
            r8 = r34
            r10 = r5
            r11 = r2
            r12 = r7
            r13 = r4
            r14 = r0
            r15 = r1
            X.AnonymousClass74L.A0A(r8, r9, r10, r11, r12, r13, r14, r15)
            r3.A0G()
        L_0x03dd:
            r3.A07(r1)
            java.lang.String r0 = r1.getAbsolutePath()
            java.lang.String r6 = X.C64062u9.A09(r0)
            r7 = 34
            r8 = 0
            X.73o r0 = new X.73o
            r4 = r0
            r9 = r8
            r5 = r1
            r4.<init>(r5, r6, r7, r8, r9)
            goto L_0x0027
        L_0x03f5:
            int r0 = r6.A02
            monitor-enter(r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x063b }
            r5.A07 = r0     // Catch:{ all -> 0x063b }
            monitor-exit(r5)
            int r0 = r6.A03
            monitor-enter(r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x063b }
            r5.A08 = r0     // Catch:{ all -> 0x063b }
            monitor-exit(r5)
            goto L_0x03dd
        L_0x040a:
            java.lang.String r0 = "MediaDownload/call/unable to find existing file."
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x040f:
            java.io.File r0 = r3.A02
            long r0 = r0.length()
            r7.A09 = r0
            java.io.File r1 = r2.A0C
            java.lang.String r5 = r2.A0G
            if (r5 == 0) goto L_0x049d
            r12 = 8867(0x22a3, float:1.2425E-41)
            X.0vf r6 = X.C18040vf.A02
            r0 = r24
            boolean r0 = X.C18020vd.A05(r6, r0, r12)
            if (r0 == 0) goto L_0x049d
            X.1RN r0 = r3.A0a
            X.1RM r0 = r0.A01
            X.1at r17 = r0.get()
            r0 = r17
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x064a }
            X.1Ev r13 = r0.A02     // Catch:{ all -> 0x064a }
            java.lang.String r12 = "SELECT download_state FROM express_path_download_data WHERE enc_file_hash=?"
            java.lang.String[] r6 = new java.lang.String[r4]     // Catch:{ all -> 0x064a }
            r0 = 0
            r6[r0] = r5     // Catch:{ all -> 0x064a }
            java.lang.String r0 = "ExpressPathDownloadDataStore/queryDownloadState"
            android.database.Cursor r14 = r13.A0A(r12, r0, r6)     // Catch:{ all -> 0x064a }
            boolean r0 = r14.moveToLast()     // Catch:{ all -> 0x063e }
            if (r0 == 0) goto L_0x0497
            java.lang.String r0 = "download_state"
            int r15 = X.C17890vO.A01(r14, r0)     // Catch:{ all -> 0x063e }
            r0 = 5
            java.lang.Integer[] r13 = X.AnonymousClass00R.A00(r0)     // Catch:{ all -> 0x063e }
            int r12 = r13.length     // Catch:{ all -> 0x063e }
            r6 = 0
        L_0x0457:
            if (r6 >= r12) goto L_0x0464
            r16 = r13[r6]     // Catch:{ all -> 0x063e }
            int r0 = X.C123846Wb.A00(r16)     // Catch:{ all -> 0x063e }
            if (r0 == r15) goto L_0x0466
            int r6 = r6 + 1
            goto L_0x0457
        L_0x0464:
            r16 = 0
        L_0x0466:
            r14.close()     // Catch:{ all -> 0x064a }
            r17.close()
            if (r16 == 0) goto L_0x049d
            int r14 = r16.intValue()
            r13 = 2
            r0 = 0
            r12 = 1
            if (r14 == r4) goto L_0x0489
            if (r14 == r0) goto L_0x048e
            r13 = 5
            r6 = 2
            r12 = 3
            r0 = 4
            if (r14 == r0) goto L_0x0489
            if (r14 == r12) goto L_0x0484
            if (r14 == r6) goto L_0x048e
            goto L_0x049d
        L_0x0484:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0494
        L_0x0489:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            goto L_0x0492
        L_0x048e:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
        L_0x0492:
            if (r0 == 0) goto L_0x049d
        L_0x0494:
            r7.A0S = r0
            goto L_0x049d
        L_0x0497:
            r14.close()     // Catch:{ all -> 0x064a }
            r17.close()
        L_0x049d:
            r3.A0F()
            if (r5 == 0) goto L_0x04a9
            byte[] r0 = r2.A0e
            if (r0 != 0) goto L_0x04a9
            r5 = 5
            goto L_0x001f
        L_0x04a9:
            int r0 = r2.A03
            r12 = 2
            if (r0 != r12) goto L_0x04b6
            java.lang.String r0 = r2.A0L
            if (r0 != 0) goto L_0x04da
            r1 = 8
            goto L_0x0159
        L_0x04b6:
            X.1So r0 = r2.A0A
            java.lang.String r6 = r0.A02
            boolean r0 = X.C63972u0.A06(r0)
            if (r0 != 0) goto L_0x04c1
            r8 = r5
        L_0x04c1:
            java.lang.String r5 = r2.A0F
            int r0 = r3.A15
            if (r0 == 0) goto L_0x04c8
            r12 = 1
        L_0x04c8:
            X.C17960vV.A0D(r4)
            r18 = 0
            r13 = r23
            r14 = r6
            r15 = r8
            r16 = r5
            r17 = r12
            X.9kM r0 = X.C24421Kg.A00(r13, r14, r15, r16, r17, r18)
            goto L_0x050f
        L_0x04da:
            X.37w r12 = new X.37w
            r12.<init>(r0)
            android.net.Uri r6 = android.net.Uri.parse(r0)
            java.lang.String r0 = "category"
            java.lang.String r6 = r6.getQueryParameter(r0)
            java.lang.String r0 = "PSA"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x0559
            r8 = 2037(0x7f5, float:2.854E-42)
            X.0vf r6 = X.C18040vf.A02
            r0 = r24
            boolean r0 = X.C18020vd.A05(r6, r0, r8)
            if (r0 == 0) goto L_0x0559
            X.1So r0 = r2.A0A
            java.lang.String r0 = r0.A02
            r17 = r4
            r12 = r23
            r13 = r0
            r14 = r5
            r15 = r19
            r16 = r4
            X.9kM r0 = X.C24421Kg.A00(r12, r13, r14, r15, r16, r17)
        L_0x050f:
            r3.A00 = r0
            boolean r0 = r2.A0N
            if (r0 == 0) goto L_0x051e
            r3.A17 = r4
            X.B5x r5 = r3.A0m
            r0 = r23
            r0.registerObserver(r5)
        L_0x051e:
            java.lang.Integer r0 = X.AnonymousClass00R.A0j
            r10.A03(r9, r0)
            java.lang.Integer r0 = X.AnonymousClass00R.A0u
            r10.A03(r9, r0)
            X.9kM r5 = r3.A00
            r8 = 0
            X.7Io r0 = new X.7Io
            r0.<init>(r3, r1, r8)
            java.lang.Object r0 = r5.A00(r0)
            X.73o r0 = (X.C1409173o) r0
            java.lang.Integer r1 = X.AnonymousClass00R.A19
            r10.A03(r9, r1)
            X.9kM r1 = r3.A00
            java.util.concurrent.atomic.AtomicInteger r1 = r1.A01
            int r1 = r1.get()
            long r5 = (long) r1
            r7.A0F = r5
            java.lang.Integer r1 = X.AnonymousClass00R.A02
            r10.A03(r9, r1)
            X.AnonymousClass11P.A01(r32)
            if (r0 != 0) goto L_0x056a
            java.lang.String r0 = "MediaDownload/call/didn't get a selected route"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r1 = 11
            goto L_0x0159
        L_0x0559:
            r0 = r23
            X.9kM r0 = r0.A0A(r12, r4)
            goto L_0x050f
        L_0x0560:
            java.lang.System.currentTimeMillis()
            java.io.File r0 = r3.A02
            r0.lastModified()
            goto L_0x0108
        L_0x056a:
            boolean r1 = r0.A03()
            if (r1 == 0) goto L_0x05f3
            X.1So r1 = r7.A0m
            long r15 = r7.A05()
            long r17 = r7.A02()
            r12 = r25
            r13 = r1
            r14 = r4
            r12.BBK(r13, r14, r15, r17)
            X.AnonymousClass11P.A01(r32)
            X.190 r12 = r3.A0A
            X.18K r13 = r3.A0R
            com.whatsapp.media.attachment.Kaleidoscope r6 = r3.A0X
            X.1Sc r5 = r3.A0j
            com.whatsapp.media.WamediaManager r10 = r3.A0W
            X.6uk r9 = r3.A0d
            X.6xt r7 = r3.A0q
            X.64a r4 = r3.A0p
            java.io.File r1 = r3.A02
            r20 = r11
            r21 = r24
            r22 = r13
            r23 = r10
            r24 = r6
            r25 = r3
            r26 = r9
            r27 = r2
            r28 = r5
            r29 = r4
            r30 = r7
            r31 = r1
            X.AnonymousClass74L.A0B(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            X.AnonymousClass11P.A01(r32)
            java.util.concurrent.FutureTask r1 = r3.A02
            boolean r1 = r1.isCancelled()
            r6 = 13
            if (r1 != 0) goto L_0x05ea
            X.2r8 r5 = r3.A0s
            X.73l r4 = r3.A0u
            java.io.File r1 = r3.A02
            r21 = r10
            r22 = r9
            r23 = r2
            r24 = r7
            r25 = r5
            r26 = r4
            r27 = r1
            r20 = r12
            X.AnonymousClass74L.A0A(r20, r21, r22, r23, r24, r25, r26, r27)
            X.AnonymousClass11P.A01(r32)
            java.io.File r1 = r3.A02
            r3.A07(r1)
            X.AnonymousClass11P.A01(r32)
        L_0x05e2:
            java.util.concurrent.FutureTask r1 = r3.A02
            boolean r1 = r1.isCancelled()
            if (r1 == 0) goto L_0x0027
        L_0x05ea:
            X.73o r0 = new X.73o
            r1 = r19
            r0.<init>(r6, r1, r8)
            goto L_0x0027
        L_0x05f3:
            r6 = 13
            goto L_0x05e2
        L_0x05f6:
            r7.A01()
            java.io.File r1 = r2.A0C
            X.C17960vV.A07(r1)
            r1.delete()
            goto L_0x0634
        L_0x0602:
            int r2 = r0.A01
            r1 = 14
            if (r2 != r1) goto L_0x062d
            r3.A02(r0)
            X.6uk r4 = r3.A0d
            java.io.File r1 = r3.A02
            long r1 = r1.length()
            r4.A0B(r1)
            monitor-enter(r4)
            r1 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x062a }
            r4.A03 = r1     // Catch:{ all -> 0x062a }
            r4.A04 = r1     // Catch:{ all -> 0x062a }
            r2 = 14
            X.73o r1 = new X.73o     // Catch:{ all -> 0x062a }
            r1.<init>(r2)     // Catch:{ all -> 0x062a }
            r4.A01 = r1     // Catch:{ all -> 0x062a }
            goto L_0x0633
        L_0x062a:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x062d:
            r1 = r19
            A04(r0, r3, r1)
            goto L_0x0634
        L_0x0633:
            monitor-exit(r4)
        L_0x0634:
            X.AnonymousClass11P.A01(r5)
            return r0
        L_0x0638:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x063b:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x063e:
            r1 = move-exception
            if (r14 == 0) goto L_0x0649
            r14.close()     // Catch:{ all -> 0x0645 }
            goto L_0x0649
        L_0x0645:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x064a }
        L_0x0649:
            throw r1     // Catch:{ all -> 0x064a }
        L_0x064a:
            r1 = move-exception
            r17.close()     // Catch:{ all -> 0x064f }
            throw r1
        L_0x064f:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C115295ti.A0E():java.lang.Object");
    }

    public void A0G() {
        byte[] A0G2 = this.A0d.A0G();
        if (A0G2 != null) {
            this.A0J.A04(A0G2);
            return;
        }
        if (C18020vd.A05(C18040vf.A02, this.A0Q, 2959) || this.A0e.A05 == 53) {
            this.A0J.A04(new byte[0]);
        }
    }

    public void A0H(C1409173o r5) {
        C136996uk r2 = this.A0d;
        C139666zF.A00(this.A0e);
        this.A0E.A04(r2.A02());
        LinkedList linkedList = this.A0x;
        synchronized (linkedList) {
            C136996uk A022 = r2.A02();
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((BC9) it.next()).BsD(r5, A022);
            }
            linkedList.clear();
        }
    }

    public boolean A0I() {
        if (this.A15 == 3 || this.A15 == 4) {
            return true;
        }
        return false;
    }

    public void BB6(BC9 bc9) {
        LinkedList linkedList = this.A0x;
        synchronized (linkedList) {
            linkedList.add(bc9);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0020, code lost:
        if (r3 == false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BEU(boolean r12) {
        /*
            r11 = this;
            if (r12 == 0) goto L_0x0005
            r11.A0D()
        L_0x0005:
            X.6zF r4 = r11.A0e
            java.lang.String r1 = r4.A0H
            X.C123836Wa.A00(r1)
            r11.cancel()
            X.6uk r2 = r11.A0d
            java.lang.Boolean r0 = r2.A04()
            r9 = 0
            if (r0 == 0) goto L_0x0044
            java.lang.Boolean r0 = r2.A04()
            boolean r3 = r0.booleanValue()
            if (r3 != 0) goto L_0x0040
        L_0x0022:
            r6 = 0
            r8 = 13
            X.73o r5 = new X.73o
            r7 = r6
            r10 = r9
            r5.<init>(r6, r7, r8, r9, r10)
            int r0 = r4.A01
            r2.A0C(r5, r0, r9)
            r2.A06()
            X.C123836Wa.A00(r1)
            X.1TJ r1 = r11.A0E
            X.6uk r0 = r2.A02()
            r1.A04(r0)
        L_0x0040:
            java.util.LinkedList r2 = r11.A0x
            monitor-enter(r2)
            goto L_0x0046
        L_0x0044:
            r3 = 0
            goto L_0x0022
        L_0x0046:
            java.util.Iterator r1 = r2.iterator()     // Catch:{ all -> 0x005f }
        L_0x004a:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x005f }
            if (r0 == 0) goto L_0x005a
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x005f }
            X.BC9 r0 = (X.BC9) r0     // Catch:{ all -> 0x005f }
            r0.BsC(r3)     // Catch:{ all -> 0x005f }
            goto L_0x004a
        L_0x005a:
            r2.clear()     // Catch:{ all -> 0x005f }
            monitor-exit(r2)     // Catch:{ all -> 0x005f }
            return
        L_0x005f:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x005f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C115295ti.BEU(boolean):void");
    }

    public int compareTo(Object obj) {
        if (!(obj instanceof C115295ti)) {
            return 0;
        }
        long j = ((C115295ti) obj).A08;
        long j2 = this.A08;
        if (j < j2) {
            return -1;
        }
        if (j2 >= j) {
            return 0;
        }
        return 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(X.C1409173o r6, X.C115295ti r7, java.lang.Runnable r8) {
        /*
            r7.A02(r6)
            X.6ug r2 = r7.A0r
            r5 = 4
            r2.A03(r5)
            java.util.List r0 = r2.A05
            r0.clear()
            X.6zF r0 = r7.A0e
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x0026
            int r1 = r6.A01
            boolean r0 = X.C1409173o.A02(r1)
            monitor-enter(r2)
            r2.A0G = r0     // Catch:{ all -> 0x0022 }
            r2.A09 = r1     // Catch:{ all -> 0x0022 }
            goto L_0x0025
        L_0x0022:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0025:
            monitor-exit(r2)
        L_0x0026:
            X.0ve r2 = r7.A0Q
            r1 = 6039(0x1797, float:8.462E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0059
            boolean r0 = X.C22781De.A03()
            if (r0 == 0) goto L_0x0055
            X.10I r1 = r7.A0v
            r0 = 21
        L_0x003c:
            X.AnonymousClass7RA.A00(r1, r7, r0)
        L_0x003f:
            int r1 = r6.A01
            r0 = 5
            if (r1 == r0) goto L_0x004a
            r0 = 12
            if (r1 == r0) goto L_0x004a
            if (r1 != r5) goto L_0x004f
        L_0x004a:
            X.6uk r0 = r7.A0d
            r0.A06()
        L_0x004f:
            if (r8 == 0) goto L_0x0054
            r8.run()
        L_0x0054:
            return
        L_0x0055:
            A05(r7)
            goto L_0x003f
        L_0x0059:
            java.io.File r0 = r7.A02
            if (r0 == 0) goto L_0x003f
            long r3 = r0.length()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x003f
            boolean r0 = X.C22781De.A03()
            if (r0 == 0) goto L_0x0072
            X.10I r1 = r7.A0v
            r0 = 22
            goto L_0x003c
        L_0x0072:
            java.io.File r1 = r7.A02
            if (r1 == 0) goto L_0x007c
            X.17r r0 = r7.A0B
            A08(r0, r1)
            goto L_0x003f
        L_0x007c:
            java.lang.String r0 = "MediaDownload/deleteDownloadFileLegacyFlow/download file is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x003f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C115295ti.A04(X.73o, X.5ti, java.lang.Runnable):void");
    }

    public static boolean A08(C218617r r2, File file) {
        File A0P2 = r2.A0P(file);
        if (A0P2.exists() && !A0P2.delete()) {
            C17900vP.A0Z(A0P2, "MediaDownload/MMS failed to delete stream check success file ", AnonymousClass000.A10());
        }
        return file.delete();
    }

    public void A0D() {
        super.A0D();
        this.A0I.A01();
        this.A0G.A01();
        this.A0J.A01();
        this.A0F.A01();
        this.A0E.A01();
        this.A0H.A01();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x016b, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r5, 8961) == false) goto L_0x016d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C115295ti(android.os.ConditionVariable r9, X.AnonymousClass190 r10, X.C218617r r11, X.AnonymousClass1KB r12, X.AnonymousClass181 r13, X.AnonymousClass11P r14, X.AnonymousClass118 r15, X.AnonymousClass11Z r16, X.C24361Ka r17, X.C132326mb r18, X.AnonymousClass1ST r19, X.C18030ve r20, X.AnonymousClass18K r21, X.C24371Kb r22, X.AnonymousClass1KX r23, X.C26421Sb r24, X.C32381h6 r25, com.whatsapp.media.WamediaManager r26, X.AnonymousClass1SK r27, X.C32571hP r28, X.AnonymousClass1RN r29, X.AnonymousClass1SS r30, X.C26501Sj r31, X.C139666zF r32, X.C127376eF r33, X.C145127Ka r34, X.C32411h9 r35, X.C26431Sc r36, X.AnonymousClass1PT r37, X.C18010vc r38, X.C24421Kg r39, X.AnonymousClass1Nb r40, X.C1185864a r41, X.C138906xt r42, X.C62272r8 r43, X.C26521Sl r44, X.C131756lc r45, X.C1408873l r46, X.AnonymousClass10I r47, X.C34481kY r48, com.whatsapp.wamsys.JniBridge r49, X.AnonymousClass19K r50, int r51, int r52, long r53, boolean r55) {
        /*
            r8 = this;
            r8.<init>()
            r3 = 1
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r0.<init>(r3)
            r8.A0y = r0
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r8.A0x = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r8.A0z = r0
            java.lang.Class<com.whatsapp.media.magi.Magi> r0 = com.whatsapp.media.magi.Magi.class
            java.lang.Object r0 = X.C221618v.A02(r0)
            com.whatsapp.media.magi.Magi r0 = (com.whatsapp.media.magi.Magi) r0
            r8.A0h = r0
            java.lang.Class<com.whatsapp.media.attachment.Kaleidoscope> r0 = com.whatsapp.media.attachment.Kaleidoscope.class
            java.lang.Object r0 = X.C221618v.A02(r0)
            com.whatsapp.media.attachment.Kaleidoscope r0 = (com.whatsapp.media.attachment.Kaleidoscope) r0
            r8.A0X = r0
            X.1TJ r0 = new X.1TJ
            r0.<init>()
            r8.A0I = r0
            X.1TJ r0 = new X.1TJ
            r0.<init>()
            r8.A0K = r0
            X.1TJ r0 = new X.1TJ
            r0.<init>()
            r8.A0G = r0
            X.1TJ r0 = new X.1TJ
            r0.<init>()
            r8.A0J = r0
            X.1TJ r0 = new X.1TJ
            r0.<init>()
            r8.A0H = r0
            X.1TJ r2 = new X.1TJ
            r2.<init>()
            r8.A0F = r2
            X.1TJ r0 = new X.1TJ
            r0.<init>()
            r8.A0E = r0
            r4 = 0
            X.Ade r0 = new X.Ade
            r0.<init>(r8, r4)
            r8.A0m = r0
            java.util.UUID r0 = java.util.UUID.randomUUID()
            long r0 = r0.getLeastSignificantBits()
            int r5 = (int) r0
            r8.A07 = r5
            r8.A0L = r14
            r5 = r20
            r8.A0Q = r5
            r8.A0C = r12
            r8.A0M = r15
            r8.A0A = r10
            r0 = r47
            r8.A0v = r0
            r8.A0B = r11
            r8.A0D = r13
            r0 = r21
            r8.A0R = r0
            r0 = r49
            r8.A14 = r0
            r0 = r25
            r8.A0V = r0
            r0 = r48
            r8.A13 = r0
            r0 = r24
            r8.A0U = r0
            r0 = r16
            r8.A0N = r0
            r0 = r17
            r8.A10 = r0
            r0 = r39
            r8.A0n = r0
            r0 = r43
            r8.A0s = r0
            r0 = r42
            r8.A0q = r0
            r0 = r37
            r8.A11 = r0
            r0 = r36
            r8.A0j = r0
            r0 = r46
            r8.A0u = r0
            r0 = r26
            r8.A0W = r0
            r0 = r44
            r8.A12 = r0
            r0 = r50
            r8.A0w = r0
            r0 = r27
            r8.A0Y = r0
            r0 = r40
            r8.A0o = r0
            r0 = r19
            r8.A0P = r0
            r0 = r30
            r8.A0b = r0
            r0 = r31
            r8.A0c = r0
            r0 = r45
            r8.A0t = r0
            r0 = r23
            r8.A0T = r0
            r0 = r18
            r8.A0O = r0
            r0 = r22
            r8.A0S = r0
            r0 = r34
            r8.A0g = r0
            r0 = r38
            r8.A0l = r0
            r0 = r41
            r8.A0p = r0
            r0 = r33
            r8.A0f = r0
            r8.A09 = r9
            r0 = r29
            r8.A0a = r0
            r0 = r35
            r8.A0i = r0
            r6 = r32
            r8.A0e = r6
            r0 = r51
            r8.A15 = r0
            r0 = r28
            r8.A0Z = r0
            X.1So r7 = r6.A0A
            int r0 = r8.A15
            X.C18070vi.A0d(r7, r3)
            X.70W r1 = new X.70W
            r1.<init>(r7, r0)
            r8.A0k = r1
            int r0 = r6.A03
            boolean r0 = X.AnonymousClass000.A1P(r0)
            r1.A0g = r0
            r8.A16 = r4
            r0 = r53
            r8.A08 = r0
            r0 = r52
            r8.A06 = r0
            X.6uk r0 = new X.6uk
            r0.<init>()
            r8.A0d = r0
            boolean r4 = r6.A02()
            r1 = 14
            X.7Nc r0 = new X.7Nc
            r0.<init>(r8, r1)
            java.util.concurrent.Executor r7 = r12.A05
            r8.A0A(r0, r7)
            r0 = 15
            X.7Nc r1 = new X.7Nc
            r1.<init>(r8, r0)
            X.1TJ r0 = r8.A00
            r0.A03(r1, r7)
            r0 = 16
            X.7Nc r1 = new X.7Nc
            r1.<init>(r8, r0)
            X.1TJ r0 = r8.A00
            r0.A03(r1, r7)
            boolean r0 = r6.A0R
            if (r0 != 0) goto L_0x016d
            r1 = 8961(0x2301, float:1.2557E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r0, r5, r1)
            r0 = 1
            if (r1 != 0) goto L_0x016e
        L_0x016d:
            r0 = 0
        L_0x016e:
            X.6ug r5 = new X.6ug
            r5.<init>(r0)
            r8.A0r = r5
            long r0 = r6.A07
            monitor-enter(r5)
            r5.A01 = r0     // Catch:{ all -> 0x019d }
            monitor-exit(r5)
            r1 = 3
            int r0 = r8.A15
            if (r1 == r0) goto L_0x0190
            r1 = 4
            int r0 = r8.A15
            if (r1 == r0) goto L_0x0190
            r1 = 5
            int r0 = r8.A15
            if (r1 == r0) goto L_0x0190
            r1 = 6
            int r0 = r8.A15
            if (r1 == r0) goto L_0x0190
            r3 = 0
        L_0x0190:
            X.6eE r0 = new X.6eE
            r0.<init>(r3, r4)
            r2.A04(r0)
            r0 = r55
            r8.A05 = r0
            return
        L_0x019d:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C115295ti.<init>(android.os.ConditionVariable, X.190, X.17r, X.1KB, X.181, X.11P, X.118, X.11Z, X.1Ka, X.6mb, X.1ST, X.0ve, X.18K, X.1Kb, X.1KX, X.1Sb, X.1h6, com.whatsapp.media.WamediaManager, X.1SK, X.1hP, X.1RN, X.1SS, X.1Sj, X.6zF, X.6eF, X.7Ka, X.1h9, X.1Sc, X.1PT, X.0vc, X.1Kg, X.1Nb, X.64a, X.6xt, X.2r8, X.1Sl, X.6lc, X.73l, X.10I, X.1kY, com.whatsapp.wamsys.JniBridge, X.19K, int, int, long, boolean):void");
    }
}
