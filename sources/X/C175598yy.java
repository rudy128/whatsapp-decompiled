package X;

import android.content.Context;

/* renamed from: X.8yy  reason: invalid class name and case insensitive filesystem */
public class C175598yy extends C195729to {
    public final Context A00;
    public final AnonymousClass1KI A01;
    public final C20074A6a A02;
    public final C191389mW A03;
    public final C190749lS A04;
    public final String A05;
    public final String A06;
    public final AnonymousClass1OZ A07;
    public final String A08;
    public final String A09;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0022, code lost:
        if (r2 != 5) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C175598yy r26, java.lang.String r27) {
        /*
            r12 = 0
            java.lang.String r0 = "PAY: BrazilVerifyCardOTPSendAction sendOtp"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r4 = r26
            X.1OZ r14 = r4.A07
            java.lang.String r3 = r14.A0B()
            java.lang.String r8 = r4.A05
            java.lang.String r7 = r4.A09
            java.lang.String r6 = r4.A08
            X.1KH r9 = r4.A04
            X.AEs r0 = r9.A08(r8)
            X.8pK r0 = (X.AnonymousClass8pK) r0
            if (r0 == 0) goto L_0x0024
            int r2 = r0.A01
            r1 = 5
            r0 = 1
            if (r2 == r1) goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            r5 = 0
            r2 = 0
            if (r0 == 0) goto L_0x00ae
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            X.9nS r11 = r4.A09
            X.9go r0 = r11.A00
            if (r0 == 0) goto L_0x0117
            java.lang.String r10 = r0.A02
            r0.A02 = r12
        L_0x0037:
            r1.append(r10)
            X.9mW r5 = r4.A03
            r0 = 5
            java.lang.String r0 = r5.A00(r0)
            r1.append(r0)
            X.1QD r0 = r11.A0A
            java.lang.String r0 = r0.A07()
            r1.append(r0)
            X.AEs r0 = r9.A08(r8)
            if (r0 == 0) goto L_0x005b
            X.8pb r0 = r0.A08
            X.8pT r0 = (X.AnonymousClass8pT) r0
            if (r0 == 0) goto L_0x005b
            java.lang.String r2 = r0.A05
        L_0x005b:
            r1.append(r2)
            java.lang.String r0 = r4.A06
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
            X.A6a r0 = r4.A02
            java.lang.String r9 = r0.A06(r1)
            java.lang.String r2 = r0.A07(r1)
            r5 = 1
            X.AnonymousClass8BX.A1J(r9, r2, r10, r5)
            java.lang.String r0 = "elo"
            X.1cX r1 = X.C108945cZ.A0t(r0)
            r16 = 1
            r18 = 10000(0x2710, double:4.9407E-320)
            r20 = 0
            r15 = r9
            boolean r0 = X.C29601cY.A04(r15, r16, r18, r20)
            if (r0 == 0) goto L_0x008a
            java.lang.String r0 = "device_signature"
            X.C29591cX.A01(r1, r0, r9)
        L_0x008a:
            r21 = r2
            r22 = r16
            r24 = r18
            r26 = r20
            boolean r0 = X.C29601cY.A04(r21, r22, r24, r26)
            if (r0 == 0) goto L_0x009d
            java.lang.String r0 = "wallet_signature"
            X.C29591cX.A01(r1, r0, r2)
        L_0x009d:
            r21 = r10
            boolean r0 = X.C29601cY.A04(r21, r22, r24, r26)
            if (r0 == 0) goto L_0x00aa
            java.lang.String r0 = "challenge_id"
            X.C29591cX.A01(r1, r0, r10)
        L_0x00aa:
            X.1ca r12 = r1.A03()
        L_0x00ae:
            r11 = 1
            r0 = 2
            r13 = r27
            X.C18070vi.A0f(r8, r0, r13)
            X.1cX r10 = X.C108955ca.A0Y()
            X.AnonymousClass8BY.A13(r10)
            boolean r9 = X.AnonymousClass8BY.A1X(r10, r3)
            X.1cX r2 = X.AnonymousClass8BS.A0R()
            java.lang.String r1 = "action"
            java.lang.String r0 = "br-verify-send-otp"
            X.C29591cX.A01(r2, r1, r0)
            r0 = 1
            X.AnonymousClass8BY.A1B(r2, r8, r9)
            boolean r8 = X.AnonymousClass8BV.A1Y(r7, r0, r9)
            if (r8 == 0) goto L_0x00db
            java.lang.String r8 = "nonce"
            X.C29591cX.A01(r2, r8, r7)
        L_0x00db:
            r18 = 2000(0x7d0, double:9.88E-321)
            r20 = r9
            r15 = r13
            r16 = r0
            boolean r7 = X.C29601cY.A04(r15, r16, r18, r20)
            if (r7 == 0) goto L_0x00ed
            java.lang.String r7 = "otp"
            X.C29591cX.A01(r2, r7, r13)
        L_0x00ed:
            if (r6 == 0) goto L_0x00fa
            boolean r0 = X.AnonymousClass8BV.A1Y(r6, r0, r11)
            if (r0 == 0) goto L_0x00fa
            java.lang.String r0 = "identifier"
            X.C29591cX.A01(r2, r0, r6)
        L_0x00fa:
            if (r5 == 0) goto L_0x00ff
            r2.A05(r12)
        L_0x00ff:
            X.1ca r2 = X.C29591cX.A00(r2, r10)
            android.content.Context r6 = r4.A00
            X.1KB r1 = r4.A01
            X.1jG r0 = r4.A05
            r10 = 9
            X.8yf r5 = new X.8yf
            r7 = r0
            r8 = r1
            r9 = r4
            r5.<init>(r6, r7, r8, r9, r10)
            X.AnonymousClass8BW.A1B(r14, r5, r2, r3)
            return
        L_0x0117:
            r10 = r12
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175598yy.A00(X.8yy, java.lang.String):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C175598yy(android.content.Context r13, X.AnonymousClass1KB r14, X.AnonymousClass11S r15, X.AnonymousClass11P r16, X.AnonymousClass1KI r17, X.AnonymousClass1KH r18, X.AnonymousClass1OZ r19, X.C20074A6a r20, X.C33711jG r21, X.C31061ex r22, X.AnonymousClass1QS r23, X.A54 r24, X.C191949nS r25, X.C191389mW r26, X.C190749lS r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31) {
        /*
            r12 = this;
            r10 = r24
            r9 = r23
            r8 = r22
            r7 = r21
            r6 = r18
            r5 = r16
            r4 = r15
            r3 = r14
            r2 = r13
            r11 = r25
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.A00 = r13
            r0 = r19
            r12.A07 = r0
            r0 = r17
            r12.A01 = r0
            r0 = r26
            r12.A03 = r0
            r0 = r20
            r12.A02 = r0
            r0 = r28
            r12.A06 = r0
            r0 = r29
            r12.A09 = r0
            r0 = r30
            r12.A05 = r0
            r0 = r31
            r12.A08 = r0
            r0 = r27
            r12.A04 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175598yy.<init>(android.content.Context, X.1KB, X.11S, X.11P, X.1KI, X.1KH, X.1OZ, X.A6a, X.1jG, X.1ex, X.1QS, X.A54, X.9nS, X.9mW, X.9lS, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
