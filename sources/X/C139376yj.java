package X;

import android.os.Handler;
import java.util.Random;

/* renamed from: X.6yj  reason: invalid class name and case insensitive filesystem */
public class C139376yj {
    public int A00 = 0;
    public long A01;
    public long A02;
    public Runnable A03;
    public boolean A04;
    public long A05;
    public final Handler A06 = C17890vO.A0D();
    public final C18030ve A07;
    public final AnonymousClass00H A08;
    public final Random A09 = new Random();
    public final AnonymousClass18K A0A;

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x015f, code lost:
        if (r23.length() == 0) goto L_0x0161;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(java.lang.Integer r30, java.lang.Integer r31, java.lang.Integer r32, java.lang.String r33, int r34) {
        /*
            r29 = this;
            r2 = r29
            X.0ve r3 = r2.A07
            r0 = 1608(0x648, float:2.253E-42)
            X.0vf r1 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r1, r3, r0)
            if (r0 == 0) goto L_0x0114
            X.2H5 r0 = new X.2H5
            r0.<init>()
            r6 = r30
            r0.A00 = r6
            r7 = r34
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r0.A01 = r4
            long r4 = r2.A02
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r0.A07 = r4
            r5 = 20
            r4 = r31
            if (r7 != r5) goto L_0x00a1
            X.00H r5 = r2.A08
            java.lang.Object r10 = r5.get()
            X.AM6 r10 = (X.AM6) r10
            int r7 = r6.intValue()
            X.0ve r5 = r10.A00
            boolean r5 = X.C20045A4o.A01(r5)
            r23 = r33
            if (r5 == 0) goto L_0x0087
            X.8rN r11 = new X.8rN
            r11.<init>()
            r9 = 2
            if (r7 == r9) goto L_0x0157
            r5 = 4
            r8 = 1
            if (r7 == r5) goto L_0x0162
            r5 = 5
            if (r7 == r5) goto L_0x0151
            r5 = 0
        L_0x0053:
            r11.A00 = r5
            java.lang.Integer r5 = X.C17880vN.A0h()
            r11.A01 = r5
            java.lang.Integer r5 = X.AM6.A00(r4)
            r11.A02 = r5
            X.AM6.A01(r10, r11)
            if (r33 == 0) goto L_0x0082
            int r5 = r23.length()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r5)
            r12 = 0
            r15 = r12
            r16 = r12
            r17 = r12
            r18 = r12
            r19 = r12
            r20 = r12
            r21 = r12
            r22 = r12
            r14 = r12
            X.AM6.A02(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
        L_0x0082:
            X.18K r5 = r10.A01
            r5.CC7(r11)
        L_0x0087:
            r5 = 2
            if (r7 == r5) goto L_0x0134
            r5 = 5
            if (r7 != r5) goto L_0x00a1
            java.lang.Integer r12 = X.AM6.A00(r4)
            java.lang.Boolean r11 = X.AnonymousClass000.A0h()
            r13 = 0
            r17 = 1
            r15 = r13
            r16 = r13
            r14 = r13
            r18 = r17
            r10.A04(r11, r12, r13, r14, r15, r16, r17, r18)
        L_0x00a1:
            r5 = 5957(0x1745, float:8.348E-42)
            boolean r1 = X.C18020vd.A05(r1, r3, r5)
            if (r1 == 0) goto L_0x010f
            r0.A03 = r4
            X.00H r1 = r2.A08
            java.lang.Object r1 = r1.get()
            X.AM6 r1 = (X.AM6) r1
            X.AM6.A03(r1, r0)
            java.util.HashMap r7 = X.C17880vN.A11()
            r3 = 5
            int r1 = r6.intValue()
            r4 = 1
            if (r3 != r1) goto L_0x00ed
            boolean r1 = r2.A04
            if (r1 != 0) goto L_0x0115
            r2.A04 = r4
            java.lang.String r3 = "is_first_click"
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            r7.put(r3, r1)
        L_0x00d1:
            long r3 = java.lang.System.nanoTime()
            r2.A05 = r3
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r3 = java.lang.System.nanoTime()
            long r5 = r2.A01
            long r3 = r3 - r5
            long r3 = r1.toSeconds(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r1 = "elapsed_time_in_sec"
            r7.put(r1, r3)
        L_0x00ed:
            if (r32 == 0) goto L_0x00fe
            int r1 = r32.intValue()
            int r1 = r1 + 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = "item_rank"
            r7.put(r1, r3)
        L_0x00fe:
            boolean r1 = r7.isEmpty()
            if (r1 != 0) goto L_0x010f
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>(r7)
            java.lang.String r1 = r1.toString()
            r0.A0A = r1
        L_0x010f:
            X.18K r1 = r2.A0A
            r1.CC7(r0)
        L_0x0114:
            return
        L_0x0115:
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r3 = java.lang.System.nanoTime()
            long r5 = r2.A05
            long r3 = r3 - r5
            long r5 = r1.toSeconds(r3)
            r3 = 4
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            boolean r1 = X.C108975cc.A1A(r1)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            java.lang.String r1 = "is_quick_back_4s"
            r7.put(r1, r3)
            goto L_0x00d1
        L_0x0134:
            if (r33 == 0) goto L_0x00a1
            int r5 = r23.length()
            if (r5 <= 0) goto L_0x00a1
            r21 = 0
            r27 = 4
            r28 = 0
            r24 = r21
            r25 = r21
            r26 = r21
            r20 = r10
            r22 = r21
            r20.A04(r21, r22, r23, r24, r25, r26, r27, r28)
            goto L_0x00a1
        L_0x0151:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
            goto L_0x0053
        L_0x0157:
            if (r33 == 0) goto L_0x0161
            int r5 = r23.length()
            r8 = 10
            if (r5 != 0) goto L_0x0162
        L_0x0161:
            r8 = 0
        L_0x0162:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            goto L_0x0053
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C139376yj.A01(java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, int):void");
    }

    public C139376yj(C18030ve r2, AnonymousClass18K r3, AnonymousClass00H r4) {
        this.A0A = r3;
        this.A07 = r2;
        this.A08 = r4;
    }

    public static int A00(int i) {
        return C109005cf.A01(i);
    }
}
