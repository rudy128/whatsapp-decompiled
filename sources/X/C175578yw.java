package X;

import android.content.Context;

/* renamed from: X.8yw  reason: invalid class name and case insensitive filesystem */
public class C175578yw extends C177699Af {
    public final int A00;
    public final int A01;
    public final Context A02;
    public final AnonymousClass1KB A03;
    public final AnonymousClass11S A04;
    public final AnonymousClass11E A05;
    public final AnonymousClass11P A06;
    public final AnonymousClass1KI A07;
    public final AnonymousClass1OZ A08;
    public final C33711jG A09;
    public final AnonymousClass1QD A0A;
    public final C31061ex A0B;
    public final AnonymousClass1QS A0C;
    public final AnonymousClass1QE A0D = AnonymousClass1QE.A00("BaseTokenAddCardAction", "network", "COMMON");
    public final C191949nS A0E;
    public final C20037A4g A0F;
    public final C190209kY A0G;
    public final C30931ek A0H;
    public final AnonymousClass17E A0I;
    public final C50412Ui A0J;
    public final AnonymousClass10I A0K;
    public final Boolean A0L;
    public final String A0M;
    public final String A0N;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C175578yw(android.content.Context r13, X.AnonymousClass1KB r14, X.AnonymousClass11S r15, X.AnonymousClass11E r16, X.AnonymousClass11P r17, X.AnonymousClass1KI r18, X.AnonymousClass1OZ r19, X.C33711jG r20, X.AnonymousClass1QD r21, X.C31061ex r22, X.AnonymousClass1QS r23, X.C191949nS r24, X.C20037A4g r25, X.C190209kY r26, X.C30931ek r27, X.AnonymousClass17E r28, X.C50412Ui r29, X.AnonymousClass10I r30, java.lang.Boolean r31, java.lang.String r32, java.lang.String r33, int r34, int r35) {
        /*
            r12 = this;
            r2 = r30
            r10 = r28
            r3 = r27
            r4 = r23
            X.C18070vi.A0w(r14, r2, r10, r3, r4)
            r9 = r22
            r8 = r21
            r5 = r20
            r7 = r16
            r11 = r29
            X.C18070vi.A0x(r8, r11, r9, r7, r5)
            r0 = r33
            r1 = r32
            X.C72473Md.A1L(r1, r0)
            r6 = r12
            r6.<init>(r7, r8, r9, r10, r11)
            r12.A03 = r14
            r12.A0K = r2
            r12.A0I = r10
            r12.A0H = r3
            r12.A0C = r4
            r12.A0A = r8
            r12.A0J = r11
            r12.A0B = r9
            r12.A05 = r7
            r12.A09 = r5
            r12.A0M = r1
            r12.A0N = r0
            r0 = r34
            r12.A00 = r0
            r0 = r35
            r12.A01 = r0
            java.lang.String r2 = "network"
            java.lang.String r1 = "COMMON"
            java.lang.String r0 = "BaseTokenAddCardAction"
            X.1QE r0 = X.AnonymousClass1QE.A00(r0, r2, r1)
            r12.A0D = r0
            r0 = r17
            r12.A06 = r0
            r12.A02 = r13
            r12.A04 = r15
            r0 = r19
            r12.A08 = r0
            r0 = r25
            r12.A0F = r0
            r0 = r24
            r12.A0E = r0
            r0 = r18
            r12.A07 = r0
            r0 = r31
            r12.A0L = r0
            r0 = r26
            r12.A0G = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175578yw.<init>(android.content.Context, X.1KB, X.11S, X.11E, X.11P, X.1KI, X.1OZ, X.1jG, X.1QD, X.1ex, X.1QS, X.9nS, X.A4g, X.9kY, X.1ek, X.17E, X.2Ui, X.10I, java.lang.Boolean, java.lang.String, java.lang.String, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x013b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0H(java.lang.Object r32) {
        /*
            r31 = this;
            r0 = r32
            X.0yx r0 = (X.C19760yx) r0
            r4 = 0
            if (r0 == 0) goto L_0x0026
            java.lang.Object r1 = r0.A00
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r4 = r0.A01
            X.A7B r4 = (X.A7B) r4
        L_0x000f:
            r3 = 0
            r0 = r31
            if (r1 != 0) goto L_0x0028
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "PAY: BrazilAddCardAction token error: "
            X.C17900vP.A0Y(r4, r1, r2)
            X.9kY r2 = r0.A0G
            r6 = 0
            r7 = r6
            r5 = r3
            r2.A00(r3, r4, r5, r6, r7)
            return
        L_0x0026:
            r1 = r4
            goto L_0x000f
        L_0x0028:
            java.lang.String r2 = "PAY: BrazilAddCardAction sendAddCard token success"
            com.whatsapp.util.Log.i((java.lang.String) r2)
            X.11P r4 = r0.A06
            X.11S r2 = r0.A04
            java.lang.String r8 = X.AnonymousClass8BS.A0e(r2, r4)
            X.1OZ r2 = r0.A08
            r30 = r2
            java.lang.String r11 = r30.A0B()
            X.1ek r2 = r0.A0H
            java.lang.String r7 = r2.A01()
            java.util.Locale r4 = java.util.Locale.US
            java.lang.Object[] r2 = X.AnonymousClass3MW.A1a()
            int r6 = r0.A00
            X.AnonymousClass000.A1L(r2, r6)
            java.lang.String r13 = "%02d"
            java.lang.String r9 = java.lang.String.format(r4, r13, r2)
            int r14 = r0.A01
            java.lang.String r17 = java.lang.Integer.toString(r14)
            java.lang.Boolean r2 = r0.A0L
            if (r2 == 0) goto L_0x01a8
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x01a8
            java.lang.String r16 = "0"
        L_0x0066:
            X.9nS r10 = r0.A0E
            java.lang.String r15 = r0.A0M
            X.9go r12 = r10.A00
            if (r12 == 0) goto L_0x00b8
            int r2 = r12.A00
            r5 = 5
            if (r2 != r5) goto L_0x00b8
            java.lang.String r4 = r12.A02
            r12.A02 = r3
            X.9mW r2 = r10.A0D
            java.lang.String r5 = r2.A00(r5)
            X.1QD r2 = r10.A0A
            java.lang.String r2 = r2.A07()
            java.lang.StringBuilder r12 = X.C17900vP.A0H(r4, r5, r2)
            java.lang.String r5 = "\\s"
            java.lang.String r2 = ""
            java.lang.String r2 = r15.replaceAll(r5, r2)
            r12.append(r2)
            r12.append(r6)
            java.util.Locale r6 = java.util.Locale.US
            java.lang.Object[] r5 = X.AnonymousClass3MW.A1a()
            int r2 = r14 % 100
            boolean r23 = X.C72453Mb.A1b(r5, r2)
            java.lang.String r2 = java.lang.String.format(r6, r13, r5)
            java.lang.String r6 = X.AnonymousClass000.A0y(r2, r12)
            X.A6a r5 = r10.A09
            java.lang.String r2 = r5.A06(r6)
            if (r2 != 0) goto L_0x0156
            X.1QE r4 = r10.A01
            java.lang.String r2 = "device_signature is null"
        L_0x00b5:
            r4.A05(r2)
        L_0x00b8:
            r13 = 0
        L_0x00b9:
            java.lang.String r6 = "id"
            r10 = 1
            r4 = 2
            r2 = r17
            X.C72473Md.A1M(r7, r9, r2, r4)
            java.lang.String[] r5 = new java.lang.String[r4]
            r4 = 0
            java.lang.String r2 = "0"
            r5[r4] = r2
            java.lang.String r2 = "1"
            java.util.List r12 = X.C18070vi.A0O(r2, r5, r10)
            X.1cX r10 = X.C108955ca.A0Y()
            X.AnonymousClass8BY.A13(r10)
            r4 = 0
            r2 = 0
            boolean r4 = X.AnonymousClass8BU.A1Z(r11, r4, r2)
            X.AnonymousClass8BW.A1F(r10, r6, r11, r4)
            X.1cX r6 = X.AnonymousClass8BS.A0R()
            java.lang.String r5 = "action"
            java.lang.String r4 = "br-add-card"
            X.C29591cX.A01(r6, r5, r4)
            r4 = 1
            X.AnonymousClass8BY.A1C(r6, r7, r2)
            boolean r4 = X.AnonymousClass8BV.A1Y(r8, r4, r2)
            if (r4 == 0) goto L_0x00fb
            java.lang.String r4 = "nonce"
            X.C29591cX.A01(r6, r4, r8)
        L_0x00fb:
            r19 = 2
            r21 = r19
            r23 = r2
            r18 = r9
            boolean r4 = X.C29601cY.A04(r18, r19, r21, r23)
            if (r4 == 0) goto L_0x010e
            java.lang.String r4 = "card-expiry-month"
            X.C29591cX.A01(r6, r4, r9)
        L_0x010e:
            r18 = 4
            r20 = r18
            r22 = r2
            boolean r4 = X.C29601cY.A04(r17, r18, r20, r22)
            if (r4 == 0) goto L_0x0121
            java.lang.String r5 = "card-expiry-year"
            r4 = r17
            X.C29591cX.A01(r6, r5, r4)
        L_0x0121:
            r18 = 1
            r20 = 10000(0x2710, double:4.9407E-320)
            r17 = r1
            boolean r4 = X.C29601cY.A04(r17, r18, r20, r22)
            if (r4 == 0) goto L_0x0132
            java.lang.String r4 = "token"
            X.C29591cX.A01(r6, r4, r1)
        L_0x0132:
            java.lang.String r4 = "is_first_card"
            r1 = r16
            r6.A08(r1, r4, r12)
            if (r13 == 0) goto L_0x013e
            r6.A05(r3)
        L_0x013e:
            X.1ca r3 = X.C29591cX.A00(r6, r10)
            android.content.Context r5 = r0.A02
            X.1KB r1 = r0.A03
            X.1jG r6 = r0.A09
            X.8yf r4 = new X.8yf
            r7 = r1
            r8 = r0
            r9 = r2
            r4.<init>(r5, r6, r7, r8, r9)
            r0 = r30
            X.AnonymousClass8BW.A1B(r0, r4, r3, r11)
            return
        L_0x0156:
            java.lang.String r5 = r5.A07(r6)
            if (r5 != 0) goto L_0x0162
            X.1QE r4 = r10.A01
            java.lang.String r2 = "wallet_signature is null"
            goto L_0x00b5
        L_0x0162:
            if (r4 != 0) goto L_0x016a
            X.1QE r4 = r10.A01
            java.lang.String r2 = "challenge_id is null"
            goto L_0x00b5
        L_0x016a:
            java.lang.String r3 = "elo"
            X.1cX r3 = X.C108945cZ.A0t(r3)
            r19 = 1
            r21 = 10000(0x2710, double:4.9407E-320)
            r18 = r2
            boolean r6 = X.C29601cY.A04(r18, r19, r21, r23)
            if (r6 == 0) goto L_0x0181
            java.lang.String r6 = "device_signature"
            X.C29591cX.A01(r3, r6, r2)
        L_0x0181:
            r24 = r5
            r25 = r19
            r27 = r21
            r29 = r23
            boolean r2 = X.C29601cY.A04(r24, r25, r27, r29)
            if (r2 == 0) goto L_0x0194
            java.lang.String r2 = "wallet_signature"
            X.C29591cX.A01(r3, r2, r5)
        L_0x0194:
            r24 = r4
            boolean r2 = X.C29601cY.A04(r24, r25, r27, r29)
            if (r2 == 0) goto L_0x01a1
            java.lang.String r2 = "challenge_id"
            X.C29591cX.A01(r3, r2, r4)
        L_0x01a1:
            X.1ca r3 = r3.A03()
            r13 = 1
            goto L_0x00b9
        L_0x01a8:
            java.lang.String r16 = "1"
            goto L_0x0066
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175578yw.A0H(java.lang.Object):void");
    }
}
