package X;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.73e  reason: invalid class name and case insensitive filesystem */
public class C1408173e {
    public int A00 = 0;
    public int A01 = 1;
    public int A02 = 0;
    public long A03 = -1;
    public long A04 = -1;
    public long A05 = -1;
    public AnonymousClass70S A06;
    public C188859i7 A07;
    public Boolean A08;
    public Integer A09;
    public Integer A0A = null;
    public Integer A0B;
    public String A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F = false;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public final long A0J;
    public final C56202h4 A0K;
    public final AnonymousClass1SS A0L;
    public final AtomicBoolean A0M = new AtomicBoolean();
    public final boolean A0N;
    public final AnonymousClass11P A0O;
    public final AnonymousClass10I A0P;

    public synchronized int A04() {
        return this.A02;
    }

    /* JADX WARNING: Removed duplicated region for block: B:111:0x0287 A[Catch:{ URISyntaxException -> 0x01d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02a1 A[Catch:{ URISyntaxException -> 0x01d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01a8 A[Catch:{ URISyntaxException -> 0x01d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01bf A[Catch:{ URISyntaxException -> 0x01d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x020c A[Catch:{ URISyntaxException -> 0x01d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0236 A[Catch:{ URISyntaxException -> 0x01d0 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized X.AnonymousClass64X A05(X.C18030ve r15, int r16, int r17) {
        /*
            r14 = this;
            monitor-enter(r14)
            X.64X r6 = new X.64X     // Catch:{ all -> 0x0309 }
            r6.<init>()     // Catch:{ all -> 0x0309 }
            r0 = r16
            java.lang.Integer r5 = r14.A07(r15, r0)     // Catch:{ all -> 0x0309 }
            java.lang.Integer r9 = r14.A06(r0)     // Catch:{ all -> 0x0309 }
            r4 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x0309 }
            r6.A02 = r0     // Catch:{ all -> 0x0309 }
            int r0 = r14.A00     // Catch:{ all -> 0x0309 }
            java.lang.Long r0 = X.C17880vN.A0n(r0)     // Catch:{ all -> 0x0309 }
            r6.A0O = r0     // Catch:{ all -> 0x0309 }
            long r2 = r14.A03     // Catch:{ all -> 0x0309 }
            long r0 = r14.A0J     // Catch:{ all -> 0x0309 }
            java.lang.Long r0 = X.C108945cZ.A1B(r2, r0)     // Catch:{ all -> 0x0309 }
            boolean r2 = r14.A0G     // Catch:{ all -> 0x0309 }
            java.lang.Long r0 = X.C1409973w.A06(r0, r2)     // Catch:{ all -> 0x0309 }
            r6.A0d = r0     // Catch:{ all -> 0x0309 }
            X.2h4 r7 = r14.A0K     // Catch:{ all -> 0x0309 }
            long r0 = r7.A07     // Catch:{ all -> 0x0309 }
            java.lang.Long r0 = X.C1409973w.A05(r0, r2)     // Catch:{ all -> 0x0309 }
            r6.A0Y = r0     // Catch:{ all -> 0x0309 }
            int r0 = r7.A03     // Catch:{ all -> 0x0309 }
            java.lang.Long r0 = X.C17880vN.A0n(r0)     // Catch:{ all -> 0x0309 }
            r6.A0W = r0     // Catch:{ all -> 0x0309 }
            int r1 = r14.A02     // Catch:{ all -> 0x0309 }
            int r0 = r7.A0B     // Catch:{ all -> 0x0309 }
            r8 = 2
            boolean r0 = X.AnonymousClass000.A1T(r0, r8)
            int r0 = A00(r1, r0)     // Catch:{ all -> 0x0309 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0309 }
            r6.A0I = r0     // Catch:{ all -> 0x0309 }
            java.lang.Integer r0 = r14.A09     // Catch:{ all -> 0x0309 }
            r6.A0G = r0     // Catch:{ all -> 0x0309 }
            boolean r0 = r14.A0N     // Catch:{ all -> 0x0309 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0309 }
            r6.A04 = r0     // Catch:{ all -> 0x0309 }
            int r1 = r7.A00     // Catch:{ all -> 0x0309 }
            if (r1 == 0) goto L_0x0078
            r0 = 1
            if (r1 == r4) goto L_0x007f
            r0 = 2
            if (r1 == r8) goto L_0x007f
            r0 = 3
            if (r1 == r0) goto L_0x007f
            r0 = 4
            if (r1 == r0) goto L_0x007f
            java.lang.String r1 = "Unreachable code"
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x0309 }
            r0.<init>(r1)     // Catch:{ all -> 0x0309 }
            throw r0     // Catch:{ all -> 0x0309 }
        L_0x0078:
            java.lang.String r0 = "mediajobeventbuilder/key reuse type not set"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0309 }
            r0 = 0
            goto L_0x0083
        L_0x007f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0309 }
        L_0x0083:
            r6.A0F = r0     // Catch:{ all -> 0x0309 }
            r6.A0H = r9     // Catch:{ all -> 0x0309 }
            boolean r0 = r14.A0E     // Catch:{ all -> 0x0309 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0309 }
            r6.A03 = r0     // Catch:{ all -> 0x0309 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)     // Catch:{ all -> 0x0309 }
            r6.A0J = r0     // Catch:{ all -> 0x0309 }
            java.lang.Boolean r0 = r14.A08     // Catch:{ all -> 0x0309 }
            r6.A01 = r0     // Catch:{ all -> 0x0309 }
            java.lang.String r0 = r14.A0C     // Catch:{ all -> 0x0309 }
            r6.A0q = r0     // Catch:{ all -> 0x0309 }
            int r0 = r14.A01     // Catch:{ all -> 0x0309 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0309 }
            r6.A0M = r0     // Catch:{ all -> 0x0309 }
            java.lang.Integer r0 = r14.A0A     // Catch:{ all -> 0x0309 }
            if (r0 == 0) goto L_0x00ab
            r6.A0L = r0     // Catch:{ all -> 0x0309 }
        L_0x00ab:
            if (r15 == 0) goto L_0x00c3
            r1 = 4468(0x1174, float:6.261E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ all -> 0x0309 }
            boolean r0 = X.C18020vd.A05(r0, r15, r1)     // Catch:{ all -> 0x0309 }
            if (r0 == 0) goto L_0x00c3
            boolean r1 = r14.A0F     // Catch:{ all -> 0x0309 }
            r0 = 0
            if (r1 == 0) goto L_0x00bd
            r0 = 3
        L_0x00bd:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0309 }
            r6.A0N = r0     // Catch:{ all -> 0x0309 }
        L_0x00c3:
            long r0 = r14.A04     // Catch:{ all -> 0x0309 }
            r10 = -1
            int r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r2 == 0) goto L_0x00e4
            long r0 = r7.A08     // Catch:{ all -> 0x0309 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0309 }
            boolean r10 = r14.A0G     // Catch:{ all -> 0x0309 }
            java.lang.Long r0 = X.C1409973w.A06(r0, r10)     // Catch:{ all -> 0x0309 }
            r6.A0Z = r0     // Catch:{ all -> 0x0309 }
            long r0 = r14.A03     // Catch:{ all -> 0x0309 }
            long r2 = r14.A04     // Catch:{ all -> 0x0309 }
            long r0 = r0 - r2
            java.lang.Long r0 = X.C1409973w.A05(r0, r10)     // Catch:{ all -> 0x0309 }
            r6.A0f = r0     // Catch:{ all -> 0x0309 }
        L_0x00e4:
            X.70S r2 = r14.A06     // Catch:{ all -> 0x0309 }
            if (r2 == 0) goto L_0x011f
            X.64V r0 = r2.A01     // Catch:{ all -> 0x0309 }
            java.lang.Long r1 = r0.A0d     // Catch:{ all -> 0x0309 }
            boolean r0 = r14.A0G     // Catch:{ all -> 0x0309 }
            java.lang.Long r0 = X.C1409973w.A06(r1, r0)     // Catch:{ all -> 0x0309 }
            r6.A0e = r0     // Catch:{ all -> 0x0309 }
            X.64V r1 = r2.A01     // Catch:{ all -> 0x0309 }
            java.lang.Long r0 = r1.A0W     // Catch:{ all -> 0x0309 }
            r6.A0V = r0     // Catch:{ all -> 0x0309 }
            java.lang.Long r2 = r1.A0I     // Catch:{ all -> 0x0309 }
            java.lang.Long r1 = r1.A0K     // Catch:{ all -> 0x0309 }
            android.util.Pair r0 = new android.util.Pair     // Catch:{ all -> 0x0309 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x0309 }
            android.util.Pair r0 = X.C108945cZ.A0N(r2, r1)     // Catch:{ all -> 0x0309 }
            java.lang.Object r0 = r0.first     // Catch:{ all -> 0x0309 }
            if (r0 == 0) goto L_0x011f
            android.util.Pair r0 = X.C108945cZ.A0N(r2, r1)     // Catch:{ all -> 0x0309 }
            java.lang.Object r0 = r0.first     // Catch:{ all -> 0x0309 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x0309 }
            r6.A0P = r0     // Catch:{ all -> 0x0309 }
            android.util.Pair r0 = X.C108945cZ.A0N(r2, r1)     // Catch:{ all -> 0x0309 }
            java.lang.Object r0 = r0.second     // Catch:{ all -> 0x0309 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x0309 }
            r6.A0Q = r0     // Catch:{ all -> 0x0309 }
        L_0x011f:
            X.9i7 r11 = r14.A07     // Catch:{ all -> 0x0309 }
            if (r11 == 0) goto L_0x02ac
            java.lang.Boolean r0 = r11.A04     // Catch:{ all -> 0x0309 }
            r10 = 0
            if (r0 == 0) goto L_0x0134
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0309 }
            if (r0 == 0) goto L_0x0131
            r0 = 4
            goto L_0x0136
        L_0x0131:
            r0 = 3
            goto L_0x0136
        L_0x0134:
            r0 = r10
            goto L_0x013a
        L_0x0136:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0309 }
        L_0x013a:
            r6.A0a = r0     // Catch:{ all -> 0x0309 }
            java.lang.Long r0 = r11.A0D     // Catch:{ all -> 0x0309 }
            if (r0 == 0) goto L_0x01c4
            double r0 = r0.doubleValue()     // Catch:{ all -> 0x0309 }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ all -> 0x0309 }
        L_0x0148:
            r6.A0A = r0     // Catch:{ all -> 0x0309 }
            java.lang.Long r0 = r6.A0P     // Catch:{ all -> 0x0309 }
            if (r0 != 0) goto L_0x0156
            java.lang.Long r0 = r11.A0C     // Catch:{ all -> 0x0309 }
            r6.A0P = r0     // Catch:{ all -> 0x0309 }
            java.lang.Long r0 = r11.A0E     // Catch:{ all -> 0x0309 }
            r6.A0Q = r0     // Catch:{ all -> 0x0309 }
        L_0x0156:
            java.lang.Long r0 = r11.A0H     // Catch:{ all -> 0x0309 }
            r6.A0c = r0     // Catch:{ all -> 0x0309 }
            java.lang.Long r3 = r11.A0A     // Catch:{ all -> 0x0309 }
            if (r3 == 0) goto L_0x01c2
            long r12 = r3.longValue()     // Catch:{ all -> 0x0309 }
            r1 = 0
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x01c2
        L_0x0168:
            boolean r13 = r14.A0G     // Catch:{ all -> 0x0309 }
            java.lang.Long r0 = X.C1409973w.A06(r3, r13)     // Catch:{ all -> 0x0309 }
            r6.A0j = r0     // Catch:{ all -> 0x0309 }
            java.lang.Long r1 = r11.A0G     // Catch:{ all -> 0x0309 }
            if (r1 == 0) goto L_0x01c0
            java.lang.Long r0 = r11.A0F     // Catch:{ all -> 0x0309 }
            if (r0 == 0) goto L_0x01c0
            long r2 = r0.longValue()     // Catch:{ all -> 0x0309 }
            long r0 = r1.longValue()     // Catch:{ all -> 0x0309 }
            int r12 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r12 <= 0) goto L_0x01c0
            java.lang.Long r0 = X.C108945cZ.A1B(r2, r0)     // Catch:{ all -> 0x0309 }
        L_0x0188:
            java.lang.Long r0 = X.C1409973w.A06(r0, r13)     // Catch:{ all -> 0x0309 }
            r6.A0l = r0     // Catch:{ all -> 0x0309 }
            java.lang.Boolean r0 = r11.A02     // Catch:{ all -> 0x0309 }
            r6.A06 = r0     // Catch:{ all -> 0x0309 }
            java.lang.Long r0 = r11.A0B     // Catch:{ all -> 0x0309 }
            r6.A0k = r0     // Catch:{ all -> 0x0309 }
            java.lang.String r0 = r11.A0O     // Catch:{ all -> 0x0309 }
            java.lang.Integer r0 = A02(r0)     // Catch:{ all -> 0x0309 }
            r6.A0D = r0     // Catch:{ all -> 0x0309 }
            X.9i7 r2 = r14.A07     // Catch:{ all -> 0x0309 }
            java.lang.Boolean r0 = r2.A03     // Catch:{ all -> 0x0309 }
            r6.A07 = r0     // Catch:{ all -> 0x0309 }
            java.lang.Long r0 = r2.A09     // Catch:{ all -> 0x0309 }
            if (r0 == 0) goto L_0x01b0
            double r0 = r0.doubleValue()     // Catch:{ all -> 0x0309 }
            java.lang.Double r10 = java.lang.Double.valueOf(r0)     // Catch:{ all -> 0x0309 }
        L_0x01b0:
            r6.A0B = r10     // Catch:{ all -> 0x0309 }
            java.lang.String r0 = r2.A0P     // Catch:{ all -> 0x0309 }
            r6.A0o = r0     // Catch:{ all -> 0x0309 }
            java.lang.String r0 = r2.A0N     // Catch:{ all -> 0x0309 }
            r6.A0n = r0     // Catch:{ all -> 0x0309 }
            java.lang.String r1 = r2.A0R     // Catch:{ all -> 0x0309 }
            r2 = 0
            if (r1 == 0) goto L_0x01d6
            goto L_0x01c6
        L_0x01c0:
            r0 = 0
            goto L_0x0188
        L_0x01c2:
            r3 = 0
            goto L_0x0168
        L_0x01c4:
            r0 = r10
            goto L_0x0148
        L_0x01c6:
            java.net.URI r0 = new java.net.URI     // Catch:{ URISyntaxException -> 0x01d0 }
            r0.<init>(r1)     // Catch:{ URISyntaxException -> 0x01d0 }
            java.lang.String r2 = r0.getHost()     // Catch:{ URISyntaxException -> 0x01d0 }
            goto L_0x01d6
        L_0x01d0:
            r1 = move-exception
            java.lang.String r0 = "MediaJobEventBuilder/getDomainName syntax exception"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0309 }
        L_0x01d6:
            r6.A0s = r2     // Catch:{ all -> 0x0309 }
            X.9i7 r1 = r14.A07     // Catch:{ all -> 0x0309 }
            java.lang.Long r12 = r1.A0I     // Catch:{ all -> 0x0309 }
            if (r12 == 0) goto L_0x01f7
            long r10 = r12.longValue()     // Catch:{ all -> 0x0309 }
            r2 = 0
            int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x01f7
        L_0x01e8:
            r6.A0X = r12     // Catch:{ all -> 0x0309 }
            java.lang.Integer r0 = r1.A08     // Catch:{ all -> 0x0309 }
            r6.A0E = r0     // Catch:{ all -> 0x0309 }
            java.lang.Integer r0 = r1.A07     // Catch:{ all -> 0x0309 }
            r6.A0C = r0     // Catch:{ all -> 0x0309 }
            java.lang.String r0 = r1.A0M     // Catch:{ all -> 0x0309 }
            r6.A0r = r0     // Catch:{ all -> 0x0309 }
            goto L_0x01f9
        L_0x01f7:
            r12 = 0
            goto L_0x01e8
        L_0x01f9:
            r2 = 3
            if (r5 == 0) goto L_0x0204
            int r0 = r5.intValue()     // Catch:{ all -> 0x0309 }
            if (r0 == r4) goto L_0x0208
            if (r0 == r2) goto L_0x0208
        L_0x0204:
            java.lang.String r0 = r1.A0R     // Catch:{ all -> 0x0309 }
            r6.A0p = r0     // Catch:{ all -> 0x0309 }
        L_0x0208:
            X.6iI r3 = r1.A00     // Catch:{ all -> 0x0309 }
            if (r3 == 0) goto L_0x0230
            long r0 = r3.A00     // Catch:{ all -> 0x0309 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0309 }
            r6.A0R = r0     // Catch:{ all -> 0x0309 }
            long r0 = r3.A02     // Catch:{ all -> 0x0309 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0309 }
            r6.A0T = r0     // Catch:{ all -> 0x0309 }
            java.lang.Boolean r0 = r3.A03     // Catch:{ all -> 0x0309 }
            r6.A00 = r0     // Catch:{ all -> 0x0309 }
            long r0 = r3.A01     // Catch:{ all -> 0x0309 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0309 }
            r6.A0S = r0     // Catch:{ all -> 0x0309 }
            java.lang.String r0 = r3.A04     // Catch:{ all -> 0x0309 }
            java.lang.Integer r0 = A02(r0)     // Catch:{ all -> 0x0309 }
            r6.A0D = r0     // Catch:{ all -> 0x0309 }
        L_0x0230:
            X.9i7 r0 = r14.A07     // Catch:{ all -> 0x0309 }
            X.9eo r1 = r0.A01     // Catch:{ all -> 0x0309 }
            if (r1 == 0) goto L_0x0281
            java.lang.Long r0 = r1.A03     // Catch:{ all -> 0x0309 }
            r6.A0m = r0     // Catch:{ all -> 0x0309 }
            if (r5 == 0) goto L_0x0259
            int r0 = r5.intValue()     // Catch:{ all -> 0x0309 }
            if (r0 != r4) goto L_0x0259
            java.lang.Integer r0 = r1.A01     // Catch:{ all -> 0x0309 }
            if (r0 != 0) goto L_0x024f
            java.lang.String r0 = "ResumeCheckStat result is not set"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0309 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0309 }
        L_0x024f:
            int r0 = r0.intValue()     // Catch:{ all -> 0x0309 }
            if (r0 != r2) goto L_0x0259
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0309 }
        L_0x0259:
            X.6iI r2 = r1.A00     // Catch:{ all -> 0x0309 }
            if (r2 == 0) goto L_0x0281
            long r0 = r2.A00     // Catch:{ all -> 0x0309 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0309 }
            r6.A0g = r0     // Catch:{ all -> 0x0309 }
            long r0 = r2.A02     // Catch:{ all -> 0x0309 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0309 }
            r6.A0i = r0     // Catch:{ all -> 0x0309 }
            java.lang.Boolean r0 = r2.A03     // Catch:{ all -> 0x0309 }
            r6.A05 = r0     // Catch:{ all -> 0x0309 }
            long r0 = r2.A01     // Catch:{ all -> 0x0309 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0309 }
            r6.A0h = r0     // Catch:{ all -> 0x0309 }
            java.lang.String r0 = r2.A04     // Catch:{ all -> 0x0309 }
            java.lang.Integer r0 = A02(r0)     // Catch:{ all -> 0x0309 }
            r6.A0D = r0     // Catch:{ all -> 0x0309 }
        L_0x0281:
            X.9i7 r3 = r14.A07     // Catch:{ all -> 0x0309 }
            java.lang.Float r0 = r3.A05     // Catch:{ all -> 0x0309 }
            if (r0 == 0) goto L_0x029d
            float r2 = r0.floatValue()     // Catch:{ all -> 0x0309 }
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r1 = X.C108945cZ.A00(r0, r2)     // Catch:{ all -> 0x0309 }
            r0 = 1
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x029d
            double r0 = (double) r2     // Catch:{ all -> 0x0309 }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ all -> 0x0309 }
            r6.A08 = r0     // Catch:{ all -> 0x0309 }
        L_0x029d:
            java.lang.Float r0 = r3.A06     // Catch:{ all -> 0x0309 }
            if (r0 == 0) goto L_0x02ac
            float r0 = r0.floatValue()     // Catch:{ all -> 0x0309 }
            double r0 = (double) r0     // Catch:{ all -> 0x0309 }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ all -> 0x0309 }
            r6.A09 = r0     // Catch:{ all -> 0x0309 }
        L_0x02ac:
            java.lang.String r0 = r7.A0D     // Catch:{ all -> 0x0309 }
            java.util.UUID r0 = java.util.UUID.fromString(r0)     // Catch:{ all -> 0x0309 }
            long r2 = r0.getMostSignificantBits()     // Catch:{ all -> 0x0309 }
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r2 = r2 & r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0309 }
            r6.A0U = r0     // Catch:{ all -> 0x0309 }
            X.70S r2 = r14.A06     // Catch:{ all -> 0x0309 }
            r0 = 0
            if (r2 == 0) goto L_0x0304
            X.64V r2 = r2.A01     // Catch:{ all -> 0x0309 }
            java.lang.Long r2 = r2.A0Q     // Catch:{ all -> 0x0309 }
            if (r2 == 0) goto L_0x0304
            long r2 = r2.longValue()     // Catch:{ all -> 0x0309 }
        L_0x02d2:
            X.9i7 r4 = r14.A07     // Catch:{ all -> 0x0309 }
            if (r4 == 0) goto L_0x02e7
            java.lang.Long r7 = r4.A0K     // Catch:{ all -> 0x0309 }
            if (r7 == 0) goto L_0x02e7
            java.lang.Long r4 = r4.A0J     // Catch:{ all -> 0x0309 }
            if (r4 == 0) goto L_0x02e7
            long r0 = r7.longValue()     // Catch:{ all -> 0x0309 }
            long r7 = r4.longValue()     // Catch:{ all -> 0x0309 }
            long r0 = r0 - r7
        L_0x02e7:
            java.lang.Long r0 = X.C17880vN.A0o(r2, r0)     // Catch:{ all -> 0x0309 }
            r6.A0b = r0     // Catch:{ all -> 0x0309 }
            java.lang.Integer r0 = A01(r9, r5)     // Catch:{ all -> 0x0309 }
            r6.A0K = r0     // Catch:{ all -> 0x0309 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0309 }
            java.lang.String r0 = "MediaJobEventBuilder/postWamMediaUpload2Event "
            r1.append(r0)     // Catch:{ all -> 0x0309 }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0309 }
            X.C17890vO.A1A(r1, r0)     // Catch:{ all -> 0x0309 }
            goto L_0x0307
        L_0x0304:
            r2 = 0
            goto L_0x02d2
        L_0x0307:
            monitor-exit(r14)
            return r6
        L_0x0309:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1408173e.A05(X.0ve, int, int):X.64X");
    }

    public synchronized void A08() {
        if (!this.A0I) {
            this.A0B = AnonymousClass3MY.A0f();
        } else {
            this.A0B = C17880vN.A0h();
        }
    }

    public synchronized void A09() {
        this.A04 = SystemClock.uptimeMillis();
        this.A05 = AnonymousClass11P.A01(this.A0O);
    }

    public synchronized void A0A(int i) {
        this.A02 = i;
    }

    public synchronized void A0B(int i, int i2, boolean z) {
        synchronized (this) {
            this.A09 = Integer.valueOf(C1409973w.A01(i, i2, z));
            this.A0G = z;
        }
    }

    public synchronized void A0C(AnonymousClass70S r2) {
        this.A06 = r2;
    }

    public synchronized void A0D(C188859i7 r2) {
        this.A07 = r2;
    }

    public static int A00(int i, boolean z) {
        if (z) {
            return 7;
        }
        if (i == 0 || i == 2) {
            return 1;
        }
        if (i == 3) {
            return 5;
        }
        if (i == 4) {
            return 8;
        }
        throw new AssertionError("Unreachable code");
    }

    public static Integer A01(Integer num, Integer num2) {
        if (num2 == null || num2.intValue() != 12 || num == null || num.intValue() != 1) {
            return num2;
        }
        return 30;
    }

    public static void A03(C1408173e r8) {
        C56202h4 r7 = r8.A0K;
        long j = r8.A03;
        r7.A07 += j - r8.A0J;
        long j2 = r8.A04;
        if (j2 != -1) {
            r7.A08 += j - j2;
        }
        AnonymousClass7RA.A00(r8.A0P, r8, 36);
    }

    public Integer A07(C18030ve r2, int i) {
        if (this.A07 == null && i == 0) {
            return null;
        }
        return Integer.valueOf(C1409973w.A03(r2, i, this.A0M.get()));
    }

    public C1408173e(AnonymousClass11P r3, C56202h4 r4, AnonymousClass1SS r5, AnonymousClass10I r6, boolean z) {
        this.A0O = r3;
        this.A0P = r6;
        this.A0L = r5;
        this.A0K = r4;
        this.A0N = z;
        this.A0J = SystemClock.uptimeMillis();
    }

    public static Integer A02(String str) {
        int i;
        if (!TextUtils.isEmpty(str)) {
            if ("h3".equalsIgnoreCase(str)) {
                i = 2;
            } else if ("h2".equalsIgnoreCase(str)) {
                i = 1;
            } else if ("http/1.1".equalsIgnoreCase(str)) {
                i = 0;
            }
            return Integer.valueOf(i);
        }
        return null;
    }

    public Integer A06(int i) {
        Integer valueOf = Integer.valueOf(i);
        C17960vV.A07(valueOf);
        if (valueOf.intValue() == 14) {
            return C17880vN.A0k();
        }
        if (!this.A0D) {
            return 0;
        }
        if (C42171xk.A00(this.A0B, 0)) {
            return 0;
        }
        return this.A0B;
    }
}
