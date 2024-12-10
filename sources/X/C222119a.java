package X;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* renamed from: X.19a  reason: invalid class name and case insensitive filesystem */
public class C222119a {
    public long A00;
    public AnonymousClass2H8 A01;
    public boolean A02;
    public final long A03;
    public final AnonymousClass18K A04;
    public final C222219b A05;
    public final AnonymousClass19Y A06;
    public final AnonymousClass19T A07;
    public final String A08;
    public final AnonymousClass11P A09;
    public final AnonymousClass118 A0A;
    public final AnonymousClass19V A0B;
    public final AnonymousClass198 A0C;
    public final AnonymousClass10I A0D;

    public void A09(String str, int i, long j, boolean z) {
        String str2 = str;
        int i2 = i;
        long j2 = j;
        if (z) {
            this.A07.markerAnnotate(this.A05.A06, i2, str2, j2);
        } else {
            this.A06.markerAnnotate(this.A05.A06, i2, str2, j2);
        }
    }

    private void A00() {
        AnonymousClass2H8 r8 = this.A01;
        if (r8 != null && !this.A02) {
            C222219b r1 = this.A05;
            r8.A05 = Integer.valueOf(r1.A00);
            r8.A0C = r1.A01;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            long j = this.A00;
            if (j <= 0) {
                j = this.A03;
            }
            r8.A0B = Long.valueOf(timeUnit.convert(elapsedRealtimeNanos - j, TimeUnit.NANOSECONDS));
            this.A04.CC7(this.A01);
            this.A02 = true;
        }
    }

    public void A01(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_end");
        A03(i, sb.toString());
    }

    public void A02(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_start");
        A03(i, sb.toString());
    }

    public void A03(int i, String str) {
        C222219b r2 = this.A05;
        if (r2.A01()) {
            this.A07.markerPoint(r2.A06, i, str);
        }
    }

    public void A04(int i, short s) {
        C222219b r2 = this.A05;
        if (r2.A01()) {
            this.A07.markerEnd(r2.A06, i, s);
        }
        if (r2.A05 && !this.A06.A00()) {
            A00();
        }
    }

    public void A05(long j) {
        AnonymousClass19T r4 = this.A07;
        int i = this.A05.A06;
        StringBuilder sb = new StringBuilder();
        sb.append("launch_2_");
        String str = this.A08;
        sb.append(str);
        sb.append("_start");
        String obj = sb.toString();
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        r4.markerPoint(i, obj, j, timeUnit);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("launch_2_");
        sb2.append(str);
        sb2.append("_end");
        String obj2 = sb2.toString();
        long j2 = this.A03;
        r4.markerPoint(i, obj2, j2, timeUnit);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("init_2_");
        sb3.append(str);
        sb3.append("_start");
        r4.markerPoint(i, sb3.toString(), j2, timeUnit);
        StringBuilder sb4 = new StringBuilder();
        sb4.append("init_2_");
        sb4.append(str);
        A06(sb4.toString());
    }

    public void A06(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_end");
        A08(sb.toString());
    }

    public void A07(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_start");
        A08(sb.toString());
    }

    public void A08(String str) {
        C222219b r2 = this.A05;
        if (r2.A01()) {
            this.A07.markerPoint(r2.A06, str);
        }
    }

    public void A0A(String str, String str2, boolean z) {
        if (z) {
            this.A07.markerAnnotate(this.A05.A06, str, str2);
        } else {
            this.A06.markerAnnotate(this.A05.A06, str, str2);
        }
    }

    public void A0B(String str, boolean z, boolean z2) {
        if (z2) {
            this.A07.markerAnnotate(this.A05.A06, str, z);
        } else {
            this.A06.markerAnnotate(this.A05.A06, str, z);
        }
    }

    public void A0C(short s) {
        C222219b r2 = this.A05;
        if (r2.A01()) {
            this.A07.markerEnd(r2.A06, s);
        }
        if (r2.A05 && !this.A06.A00()) {
            A00();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003a, code lost:
        if (r1 != false) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0D(java.lang.String r11, long r12) {
        /*
            r10 = this;
            X.19b r3 = r10.A05
            boolean r0 = r3.A01()
            if (r0 != 0) goto L_0x000e
            boolean r0 = r3.A05
            if (r0 != 0) goto L_0x000e
            r0 = 0
            return r0
        L_0x000e:
            r7 = r12
            r10.A00 = r12
            boolean r0 = r3.A05
            if (r0 == 0) goto L_0x001c
            X.2H8 r0 = new X.2H8
            r0.<init>()
            r10.A01 = r0
        L_0x001c:
            boolean r0 = r3.A01()
            if (r0 == 0) goto L_0x0044
            r1 = 0
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0048
            X.19Y r2 = r10.A06
            int r4 = r3.A06
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.NANOSECONDS
            boolean r1 = r3.A03
            java.lang.String r5 = "perf_origin"
            java.lang.String r6 = "Censored"
            boolean r0 = r2.A00()
            if (r0 == 0) goto L_0x0046
            if (r1 == 0) goto L_0x0041
        L_0x003c:
            X.19T r3 = r2.A01
            r3.markerStart(r4, r5, r6, r7, r9)
        L_0x0041:
            r10.A05(r12)
        L_0x0044:
            r0 = 1
            return r0
        L_0x0046:
            r6 = r11
            goto L_0x003c
        L_0x0048:
            X.19Y r5 = r10.A06
            int r4 = r3.A06
            boolean r3 = r3.A03
            java.lang.String r2 = "perf_origin"
            java.lang.String r1 = "Censored"
            boolean r0 = r5.A00()
            if (r0 == 0) goto L_0x005b
            if (r3 == 0) goto L_0x0044
            r11 = r1
        L_0x005b:
            X.19T r0 = r5.A01
            r0.markerStart(r4, r2, r11)
            goto L_0x0044
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C222119a.A0D(java.lang.String, long):boolean");
    }

    public boolean A0E(String str, boolean z, int i) {
        C222219b r1 = this.A05;
        if (!r1.A01() && !r1.A05) {
            return false;
        }
        this.A00 = -1;
        if (r1.A05) {
            this.A01 = new AnonymousClass2H8();
        }
        if (!r1.A01()) {
            return true;
        }
        AnonymousClass19Y r2 = this.A06;
        int i2 = r1.A06;
        boolean z2 = r1.A03;
        String str2 = "Censored";
        if (!r2.A00()) {
            str2 = str;
        } else if (!z2) {
            return true;
        }
        r2.A01.Bj4("perf_origin", str2, i2, i, z);
        return true;
    }

    public C222119a(AnonymousClass11P r3, AnonymousClass118 r4, AnonymousClass18K r5, C222219b r6, AnonymousClass19V r7, AnonymousClass19Y r8, AnonymousClass19T r9, AnonymousClass198 r10, AnonymousClass10I r11, String str) {
        this.A00 = -1;
        this.A02 = false;
        this.A07 = r9;
        this.A08 = str;
        this.A09 = r3;
        this.A0A = r4;
        this.A0D = r11;
        this.A04 = r5;
        this.A0C = r10;
        this.A05 = r6;
        this.A0B = r7;
        this.A03 = SystemClock.elapsedRealtimeNanos();
        this.A06 = r8;
    }

    public C222119a(AnonymousClass11P r12, AnonymousClass118 r13, C18030ve r14, AnonymousClass18K r15, AnonymousClass19V r16, AnonymousClass19Y r17, AnonymousClass19T r18, AnonymousClass198 r19, AnonymousClass10I r20, String str, int i) {
        this(r12, r13, r15, new C222219b(r14, i), r16, r17, r18, r19, r20, str);
    }
}
