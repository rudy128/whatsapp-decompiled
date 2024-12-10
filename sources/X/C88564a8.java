package X;

import android.widget.ProgressBar;

/* renamed from: X.4a8  reason: invalid class name and case insensitive filesystem */
public abstract class C88564a8 {
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
        if (r8 < 0) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00cf, code lost:
        if (r0 > 2592000000L) goto L_0x00d1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(android.view.ViewGroup r15, android.widget.TextView r16, X.AnonymousClass4N9 r17, X.C18000vb r18, X.C32861hs r19, X.AnonymousClass21V r20) {
        /*
            r4 = r20
            X.2rc r3 = X.AnonymousClass206.A00(r4)
            long r1 = r3.A0C
            int r0 = (int) r1
            r1 = r19
            int r0 = A00(r1, r4, r0)
            long r6 = (long) r0
            boolean r0 = A03(r1, r4, r6)
            r14 = r16
            r13 = r17
            if (r0 != 0) goto L_0x0110
            boolean r0 = r3.A0f
            if (r0 == 0) goto L_0x0110
            boolean r0 = r3.A0d
            if (r0 != 0) goto L_0x0110
            long r8 = android.os.SystemClock.elapsedRealtime()
            r2 = r18
            if (r18 == 0) goto L_0x010c
            long r0 = r4.A01
            java.lang.String r20 = X.C88584aA.A02(r2, r0)
        L_0x0030:
            r4 = 100
            r18 = 0
            int r0 = (r6 > r18 ? 1 : (r6 == r18 ? 0 : -1))
            if (r0 <= 0) goto L_0x0041
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0041
            int r0 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            r2 = 0
            if (r0 >= 0) goto L_0x0042
        L_0x0041:
            r2 = 1
        L_0x0042:
            boolean r1 = r13.A00
            r0 = 8
            if (r1 != 0) goto L_0x0054
            if (r2 == 0) goto L_0x0054
            r14.setVisibility(r0)
            if (r15 == 0) goto L_0x0053
            r0 = 0
        L_0x0050:
            r15.setVisibility(r0)
        L_0x0053:
            return
        L_0x0054:
            long r4 = r4 - r6
            X.00H r10 = r13.A02
            java.lang.Object r3 = r10.get()
            X.15z r3 = (X.C214415z) r3
            long r0 = r3.A02
            int r2 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r2 >= 0) goto L_0x006d
            long r0 = r3.A01
            int r2 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r2 >= 0) goto L_0x006d
            r3.A02 = r8
            r3.A01 = r4
        L_0x006d:
            java.lang.Object r10 = r10.get()
            X.15z r10 = (X.C214415z) r10
            long r0 = r10.A02
            long r11 = r8 - r0
            int r2 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r2 < 0) goto L_0x0053
            int r2 = (r6 > r18 ? 1 : (r6 == r18 ? 0 : -1))
            if (r2 <= 0) goto L_0x0053
            r16 = 100
            int r2 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r2 >= 0) goto L_0x0053
            int r2 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r2 < 0) goto L_0x0053
            int r2 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r2 < 0) goto L_0x0053
            long r2 = r10.A01
            int r0 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r0 < 0) goto L_0x0053
            r16 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r0 < 0) goto L_0x0053
            long r2 = r2 - r4
            double r0 = (double) r2
            double r2 = (double) r11
            double r0 = r0 / r2
            double r2 = r10.A00
            r16 = 0
            int r11 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r11 < 0) goto L_0x00b2
            r11 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            double r0 = r0 * r11
            r11 = 4607092346807469998(0x3fefae147ae147ae, double:0.99)
            double r2 = r2 * r11
            double r0 = r0 + r2
        L_0x00b2:
            r10.A00 = r0
            double r2 = (double) r4
            double r2 = r2 / r0
            long r0 = (long) r2
            r10.A02 = r8
            r10.A01 = r4
            int r2 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r2 < 0) goto L_0x0053
            boolean r8 = r13.A00
            r3 = 10000(0x2710, double:4.9407E-320)
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 < 0) goto L_0x00d1
            r4 = 2592000000(0x9a7ec800, double:1.280618154E-314)
            int r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            r2 = 1
            if (r3 <= 0) goto L_0x00d2
        L_0x00d1:
            r2 = 0
        L_0x00d2:
            r8 = r8 | r2
            r13.A00 = r8
            if (r8 == 0) goto L_0x0053
            X.4XF r2 = r13.A01
            android.text.SpannableStringBuilder r0 = r2.A00(r6, r0)
            r14.setText(r0)
            if (r20 == 0) goto L_0x0102
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r2 = " "
            r3.append(r2)
            android.content.Context r1 = r14.getContext()
            r0 = 2131898822(0x7f1231c6, float:1.9432573E38)
            java.lang.String r0 = r1.getString(r0)
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r2, r3)
            r14.append(r0)
            r0 = r20
            r14.append(r0)
        L_0x0102:
            r0 = 0
            r14.setVisibility(r0)
            if (r15 == 0) goto L_0x0053
            r0 = 8
            goto L_0x0050
        L_0x010c:
            r20 = 0
            goto L_0x0030
        L_0x0110:
            r1 = 0
            r13.A00 = r1
            r0 = 8
            r14.setVisibility(r0)
            if (r15 == 0) goto L_0x011d
            r15.setVisibility(r1)
        L_0x011d:
            X.00H r0 = r13.A02
            java.lang.Object r2 = r0.get()
            X.15z r2 = (X.C214415z) r2
            r0 = -9223372036854775808
            r2.A02 = r0
            r2.A01 = r0
            r0 = -4503599627370496(0xfff0000000000000, double:-Infinity)
            r2.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88564a8.A02(android.view.ViewGroup, android.widget.TextView, X.4N9, X.0vb, X.1hs, X.21V):void");
    }

    public static boolean A04(AnonymousClass21V r2, C32021gV r3) {
        C62572rc r0;
        if (r2.A0v.A02 || (r0 = r2.A02) == null) {
            return false;
        }
        r0.A0c = true;
        r3.A0J(r2, AnonymousClass00R.A00);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0029, code lost:
        if (r1.A08(r2) != false) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(X.C32861hs r1, X.AnonymousClass21V r2, int r3) {
        /*
            X.2tS r0 = X.C32861hs.A00(r1, r2)
            X.34B r0 = r1.A04(r0)
            if (r0 == 0) goto L_0x0032
            X.2kI r0 = r0.A02()
            boolean r0 = r0.A0L
            if (r0 == 0) goto L_0x0032
            X.2tS r0 = X.C32861hs.A00(r1, r2)
            X.34B r0 = r1.A04(r0)
            if (r0 == 0) goto L_0x002b
            X.2kI r0 = r0.A02()
            boolean r0 = r0.A0L
            if (r0 == 0) goto L_0x002b
            boolean r1 = r1.A08(r2)
            r0 = 1
            if (r1 == 0) goto L_0x002c
        L_0x002b:
            r0 = 0
        L_0x002c:
            int r3 = r3 / 2
            if (r0 != 0) goto L_0x0032
            int r3 = r3 + 50
        L_0x0032:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88564a8.A00(X.1hs, X.21V, int):int");
    }

    public static int A01(C32861hs r5, AnonymousClass21V r6, C28931bI r7) {
        C62572rc A00 = AnonymousClass206.A00(r6);
        if (!A00.A0f || A00.A0d) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("ConversationRowMediaUtils");
            r7.A08(new C98244qo(7), AnonymousClass000.A0y("#updateProgress", A10));
            return 0;
        }
        ProgressBar progressBar = (ProgressBar) r7.A02();
        progressBar.setVisibility(0);
        int A002 = A00(r5, r6, (int) A00.A0C);
        boolean A03 = A03(r5, r6, (long) A002);
        if (A002 > 0 && (A002 < 100 || A03)) {
            progressBar.setProgress(A002);
            progressBar.setIndeterminate(A03);
        }
        return A002;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r0.A02().A0L == false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A03(X.C32861hs r4, X.AnonymousClass21V r5, long r6) {
        /*
            X.2tS r0 = X.C32861hs.A00(r4, r5)
            X.34B r0 = r4.A04(r0)
            if (r0 == 0) goto L_0x0013
            X.2kI r0 = r0.A02()
            boolean r0 = r0.A0L
            r3 = 1
            if (r0 != 0) goto L_0x0014
        L_0x0013:
            r3 = 0
        L_0x0014:
            r1 = 100
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0024
            if (r3 == 0) goto L_0x0022
            boolean r0 = r4.A08(r5)
            if (r0 == 0) goto L_0x0024
        L_0x0022:
            r0 = 1
            return r0
        L_0x0024:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88564a8.A03(X.1hs, X.21V, long):boolean");
    }
}
