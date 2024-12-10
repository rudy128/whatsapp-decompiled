package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.1hG  reason: invalid class name and case insensitive filesystem */
public class C32481hG {
    public final C19880zA A00;
    public final AnonymousClass11S A01;
    public final AnonymousClass11P A02;
    public final AnonymousClass1CJ A03;
    public final AnonymousClass122 A04;
    public final C26141Qz A05;
    public final AnonymousClass1DL A06;
    public final AnonymousClass1Q6 A07;
    public final C26001Ql A08;
    public final AnonymousClass1RP A09;
    public final C24681Lg A0A;
    public final AnonymousClass1Cd A0B;
    public final AnonymousClass1WX A0C;
    public final C24661Le A0D;
    public final C32431hB A0E;
    public final AnonymousClass1N9 A0F;
    public final C32471hF A0G;
    public final AnonymousClass00H A0H;
    public final AnonymousClass00H A0I;
    public final AnonymousClass00H A0J;
    public final AnonymousClass00H A0K;
    public final AnonymousClass00H A0L;
    public final Object A0M = new Object();
    public final C22621Co A0N;
    public final AnonymousClass1LW A0O;
    public final AnonymousClass1Q2 A0P;
    public final C24751Ln A0Q;
    public final C18030ve A0R;
    public final AnonymousClass1RU A0S;
    public final C32451hD A0T;
    public final AnonymousClass00H A0U;
    public final AnonymousClass00H A0V;
    public final AnonymousClass00H A0W;

    /* JADX WARNING: type inference failed for: r11v19, types: [X.36a, java.lang.Object, X.229] */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0043, code lost:
        if (r9.A02 == false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0372, code lost:
        if (r6.A0E() != 1) goto L_0x0374;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0060, code lost:
        if (r11 == 83) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f5, code lost:
        if (r6 == null) goto L_0x0660;
     */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x029b  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x029f  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0343  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x034a  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x036d  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0391  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x039c  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x03a6  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x03d7 A[SYNTHETIC, Splitter:B:182:0x03d7] */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x044e A[Catch:{ all -> 0x043a, all -> 0x05fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x046d A[Catch:{ all -> 0x043a, all -> 0x05fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x049b A[Catch:{ all -> 0x043a, all -> 0x05fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x04c4 A[Catch:{ all -> 0x043a, all -> 0x05fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x0581 A[Catch:{ all -> 0x043a, all -> 0x05fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x0595 A[Catch:{ all -> 0x043a, all -> 0x05fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x059e A[Catch:{ all -> 0x043a, all -> 0x05fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x05c6 A[Catch:{ all -> 0x043a, all -> 0x05fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x05d2 A[Catch:{ all -> 0x043a, all -> 0x05fe }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(X.C32481hG r34, X.AnonymousClass206 r35, int r36, boolean r37) {
        /*
            r4 = r35
            boolean r10 = r4 instanceof X.AnonymousClass23N
            if (r10 == 0) goto L_0x00d9
            r0 = r4
            X.23N r0 = (X.AnonymousClass23N) r0
            java.lang.String r6 = r0.A01
        L_0x000b:
            r3 = 0
            if (r6 != 0) goto L_0x0031
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "msgstore/revoke/missing-old-id "
            r1.append(r0)
            X.205 r0 = r4.A0v
            r1.append(r0)
            java.lang.String r0 = " from="
            r1.append(r0)
            X.1BI r0 = r4.A0H()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x002d:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0030:
            return r3
        L_0x0031:
            X.205 r9 = r4.A0v
            X.1BI r5 = r9.A00
            X.1BI r0 = r4.A0H()
            boolean r0 = X.C42701yb.A01(r0)
            r2 = 1
            if (r0 != 0) goto L_0x0045
            boolean r1 = r9.A02
            r0 = 1
            if (r1 != 0) goto L_0x0046
        L_0x0045:
            r0 = 0
        L_0x0046:
            X.205 r1 = new X.205
            r1.<init>(r5, r6, r0)
            boolean r17 = X.C22971Dz.A0V(r5)
            r5 = r34
            X.11S r15 = r5.A01
            boolean r19 = X.AnonymousClass25A.A0N(r15, r4)
            int r11 = r4.A0u
            r0 = 64
            if (r11 == r0) goto L_0x0062
            r0 = 83
            r8 = 0
            if (r11 != r0) goto L_0x0063
        L_0x0062:
            r8 = 1
        L_0x0063:
            X.00H r0 = r5.A0K
            r35 = r0
            java.lang.Object r0 = r35.get()
            X.1W6 r0 = (X.AnonymousClass1W6) r0
            X.1W2 r0 = r0.A01
            X.206 r6 = r0.A05(r9)
            if (r6 == 0) goto L_0x00a2
            if (r17 != 0) goto L_0x00a2
            X.1BI r0 = r6.A0H()
            boolean r0 = X.C42701yb.A01(r0)
            if (r0 != 0) goto L_0x00a2
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "msgstore/revoking/has-placeholder "
            r7.append(r0)
            X.205 r0 = r6.A0v
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            boolean r0 = X.C20133A8t.A0A(r6)
            if (r0 == 0) goto L_0x00d1
            X.122 r0 = r5.A04
            r0.BIJ(r6, r2, r3)
        L_0x00a2:
            java.lang.Object r0 = r35.get()
            X.1W6 r0 = (X.AnonymousClass1W6) r0
            X.1W2 r0 = r0.A01
            X.206 r6 = r0.A05(r1)
            if (r17 == 0) goto L_0x00e7
            if (r6 != 0) goto L_0x00f7
            X.1BI r7 = r1.A00
            boolean r0 = r1.A02
            r6 = r0 ^ 1
            java.lang.String r0 = r1.A01
            X.205 r1 = new X.205
            r1.<init>(r7, r0, r6)
            java.lang.Object r0 = r35.get()
            X.1W6 r0 = (X.AnonymousClass1W6) r0
            X.1W2 r0 = r0.A01
            X.206 r6 = r0.A05(r1)
            if (r6 != 0) goto L_0x00f7
            java.lang.String r0 = "editmessagestore/newsletter/original message not found"
            goto L_0x002d
        L_0x00d1:
            if (r19 == 0) goto L_0x0030
            X.1N9 r0 = r5.A0F
            r0.A08(r4)
            return r3
        L_0x00d9:
            boolean r0 = r4 instanceof X.C444723o
            if (r0 == 0) goto L_0x00e4
            r0 = r4
            X.23o r0 = (X.C444723o) r0
            java.lang.String r6 = r0.A02
            goto L_0x000b
        L_0x00e4:
            r6 = 0
            goto L_0x000b
        L_0x00e7:
            if (r6 != 0) goto L_0x00f7
            X.00H r0 = r5.A0W
            java.lang.Object r0 = r0.get()
            X.2mE r0 = (X.C59392mE) r0
            X.206 r6 = r0.A00(r1)
            if (r6 == 0) goto L_0x0660
        L_0x00f7:
            X.36c r0 = X.C60492o7.A00(r6)
            if (r0 == 0) goto L_0x010c
            X.36c r0 = X.C60492o7.A00(r6)
            X.205 r0 = r0.A02
            java.lang.String r1 = r0.A01
            if (r10 == 0) goto L_0x0655
            r0 = r4
            X.23N r0 = (X.AnonymousClass23N) r0
            r0.A01 = r1
        L_0x010c:
            X.1Ln r7 = r5.A0Q
            com.whatsapp.jid.UserJid r1 = r6.A0I()
            com.whatsapp.jid.UserJid r0 = r4.A0I()
            boolean r0 = r7.A0Q(r1, r0)
            if (r0 != 0) goto L_0x0128
            if (r8 != 0) goto L_0x0128
            X.1BI r0 = r6.A0H()
            boolean r0 = X.C42701yb.A01(r0)
            if (r0 == 0) goto L_0x0660
        L_0x0128:
            X.205 r0 = r6.A0v
            r34 = r0
            X.1BI r0 = r0.A00
            r33 = r0
            boolean r0 = X.C22971Dz.A0a(r33)
            if (r0 == 0) goto L_0x016a
            r0 = r34
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x016a
            boolean r0 = r6 instanceof X.AnonymousClass21V
            if (r0 == 0) goto L_0x0148
            X.1hB r1 = r5.A0E
            r0 = r6
            X.21V r0 = (X.AnonymousClass21V) r0
            X.C32431hB.A06(r1, r0, r3, r3, r3)
        L_0x0148:
            X.122 r0 = r5.A04
            r0.BIJ(r6, r2, r2)
            if (r19 == 0) goto L_0x0154
            X.1N9 r0 = r5.A0F
            r0.A08(r4)
        L_0x0154:
            X.1Q2 r0 = r5.A0P
            android.os.Handler r3 = r0.A01
            r0 = 22
            X.3Bx r1 = new X.3Bx
            r1.<init>(r5, r6, r0)
        L_0x015f:
            r3.post(r1)
        L_0x0162:
            X.1Q6 r1 = r5.A07
            r0 = r34
            r1.A0C(r0)
        L_0x0169:
            return r2
        L_0x016a:
            boolean r0 = X.AnonymousClass25A.A0p(r4)
            if (r0 == 0) goto L_0x0162
            long r0 = r4.A0I
            long r7 = r6.A0I
            long r0 = r0 - r7
            boolean r7 = r6 instanceof X.AnonymousClass23N
            r12 = 259200000(0xf731400, double:1.280618154E-315)
            int r8 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            r12 = 0
            if (r8 <= 0) goto L_0x0180
            r12 = 1
        L_0x0180:
            java.lang.String r0 = X.AnonymousClass25B.A01(r6)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r8 = r0 ^ 1
            r0 = 83
            r1 = 0
            if (r11 != r0) goto L_0x0190
            r1 = 1
        L_0x0190:
            r0 = r34
            boolean r0 = r0.A02
            r16 = r0
            if (r0 == 0) goto L_0x01ab
            r0 = 64
            if (r11 != r0) goto L_0x01cd
            r0 = r4
            X.23O r0 = (X.AnonymousClass23O) r0
            com.whatsapp.jid.UserJid r0 = r0.A00
            boolean r0 = r15.A0O(r0)
            if (r0 == 0) goto L_0x01ab
            boolean r0 = r4.A19
            if (r0 == 0) goto L_0x01cd
        L_0x01ab:
            if (r8 != 0) goto L_0x01b1
            if (r12 != 0) goto L_0x01b1
            if (r7 == 0) goto L_0x01cd
        L_0x01b1:
            if (r1 != 0) goto L_0x01cd
            if (r17 != 0) goto L_0x01cd
            if (r8 == 0) goto L_0x01bf
            X.1N9 r1 = r5.A0F
            java.lang.String r0 = "revoke-drop-payment"
        L_0x01bb:
            r1.A0C(r4, r0)
            goto L_0x0162
        L_0x01bf:
            if (r12 == 0) goto L_0x01c6
            X.1N9 r1 = r5.A0F
            java.lang.String r0 = "revoke-drop-old"
            goto L_0x01bb
        L_0x01c6:
            if (r7 == 0) goto L_0x0162
            X.1N9 r1 = r5.A0F
            java.lang.String r0 = "revoke-drop-terminal"
            goto L_0x01bb
        L_0x01cd:
            r0 = 16777216(0x1000000, double:8.289046E-317)
            boolean r0 = r6.A11(r0)
            if (r0 == 0) goto L_0x01f6
            X.36k r0 = X.C60472o5.A00(r6)
            if (r0 != 0) goto L_0x01f6
            X.00H r0 = r5.A0U
            java.lang.Object r0 = r0.get()
            X.2ms r0 = (X.C59782ms) r0
            X.1Qe r7 = r0.A06
            X.25F[] r1 = new X.AnonymousClass25F[r2]
            java.lang.Class<X.36k> r0 = X.C692336k.class
            X.25F r0 = r6.A0M(r0)
            X.C18070vi.A0X(r0)
            r1[r3] = r0
            r7.A0A(r1)
        L_0x01f6:
            X.1hD r1 = r5.A0T
            if (r10 != 0) goto L_0x0206
            boolean r0 = r4 instanceof X.C444723o
            if (r0 != 0) goto L_0x0206
            java.lang.String r0 = "FMessageRevokedFactory/cloneMessageAndReplacingOriginalMessage message type not supported"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        L_0x0206:
            X.00H r0 = r1.A02     // Catch:{ 1R1 -> 0x06c5 }
            java.lang.Object r0 = r0.get()     // Catch:{ 1R1 -> 0x06c5 }
            X.2jC r0 = (X.C57512jC) r0     // Catch:{ 1R1 -> 0x06c5 }
            X.206 r7 = r0.A00(r4, r9)     // Catch:{ 1R1 -> 0x06c5 }
            long r0 = r6.A0I
            r7.A0I = r0
            long r0 = r6.A0G
            r7.A0G = r0
            long r0 = r4.A10
            r7.A10 = r0
            long r0 = r6.A0x
            r7.A0x = r0
            boolean r0 = r4.A0w()
            if (r0 == 0) goto L_0x03d3
            long r0 = r6.A0y
            r11 = -1
            int r8 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r8 != 0) goto L_0x03d3
            long r0 = r4.A0y
        L_0x0232:
            r7.A0y = r0
            java.lang.String r0 = r6.A0f
            r7.A0f = r0
            r7.A14(r2)
            int r0 = r6.A05
            r7.A0Z(r0)
            java.lang.Long r0 = r6.A0U
            r7.A0U = r0
            r7.A07 = r3
            boolean r0 = r6.A0q()
            r7.A0n(r0)
            boolean r0 = r7 instanceof X.AnonymousClass23Q
            if (r0 == 0) goto L_0x0284
            r0 = r7
            X.23Q r0 = (X.AnonymousClass23Q) r0
            r0.A17(r6)
            X.36a r0 = X.C50382Uf.A00(r6)
            if (r0 == 0) goto L_0x0284
            long r8 = r0.A02
            boolean r14 = r0.A06
            boolean r13 = r0.A07
            r12 = 0
            r0 = 0
            X.36a r11 = new X.36a
            r11.<init>()
            r11.A00 = r0
            r11.A05 = r12
            r11.A04 = r12
            r11.A01 = r0
            r11.A02 = r8
            r11.A03 = r0
            r11.A06 = r14
            r11.A07 = r13
            java.lang.Class<X.36a> r0 = X.C691336a.class
            X.25F r0 = r7.A0M(r0)
            r0.A02(r11)
        L_0x0284:
            r0 = 16777216(0x1000000, double:8.289046E-317)
            boolean r8 = r6.A11(r0)
            if (r8 == 0) goto L_0x03c2
            r7.A0b(r0)
            X.36k r0 = X.C60472o5.A00(r6)
        L_0x0294:
            X.C60472o5.A01(r0, r7)
        L_0x0297:
            boolean r0 = r4.A19
            if (r0 == 0) goto L_0x029d
            r7.A19 = r2
        L_0x029d:
            if (r10 == 0) goto L_0x03a6
            r8 = r7
            X.23N r8 = (X.AnonymousClass23N) r8
            r0 = r4
            X.23N r0 = (X.AnonymousClass23N) r0
            long r0 = r0.A00
            r8.A00 = r0
            X.1BI r0 = r6.A0H()
            r7.A0d(r0)
            java.lang.Integer r8 = r6.A0S
            if (r8 == 0) goto L_0x02c0
            r0 = 2
            int r1 = r8.intValue()
            if (r1 == r0) goto L_0x02c0
            r0 = 5
            if (r1 != r0) goto L_0x02c0
            r7.A0S = r8
        L_0x02c0:
            X.1RU r9 = r5.A0S
            X.1RV r9 = (X.AnonymousClass1RV) r9
            X.00H r10 = r9.A00
            java.lang.Object r1 = r10.get()
            X.0vd r1 = (X.C18020vd) r1
            r0 = 8783(0x224f, float:1.2308E-41)
            X.0vf r8 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r8, r1, r0)
            if (r0 == 0) goto L_0x0339
            java.lang.Object r1 = r10.get()
            X.0vd r1 = (X.C18020vd) r1
            r0 = 11259(0x2bfb, float:1.5777E-41)
            boolean r0 = X.C18020vd.A05(r8, r1, r0)
            if (r0 == 0) goto L_0x0339
            r0 = 67108864(0x4000000, double:3.31561842E-316)
            boolean r0 = r6.A11(r0)
            if (r0 == 0) goto L_0x0339
            X.00H r0 = r9.A03
            java.lang.Object r8 = r0.get()
            X.1Qe r8 = (X.C25931Qe) r8
            X.25F[] r1 = new X.AnonymousClass25F[r2]
            java.lang.Class<X.36t> r0 = X.C693236t.class
            X.25F r0 = r6.A0M(r0)
            X.C18070vi.A0X(r0)
            r1[r3] = r0
            r8.A0A(r1)
            X.36t r1 = X.C60512o9.A00(r6)
            if (r1 == 0) goto L_0x0339
            X.0vl r0 = r9.A0A
            java.lang.Object r0 = r0.getValue()
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            X.6RT r10 = r1.A01
            boolean r0 = r0.contains(r10)
            if (r0 == 0) goto L_0x0339
            long r0 = r1.A00
            r11 = 0
            X.36t r8 = new X.36t
            r8.<init>(r10, r11, r0)
            X.C60512o9.A01(r7, r8)
            X.00H r8 = r9.A02
            java.lang.Object r8 = r8.get()
            X.1W6 r8 = (X.AnonymousClass1W6) r8
            X.1W2 r8 = r8.A01
            X.206 r0 = r8.A03(r0)
            if (r0 == 0) goto L_0x0339
            r9.BCh(r7, r0, r10)
        L_0x0339:
            X.205 r10 = r7.A0v
            X.1BI r0 = r10.A00
            boolean r0 = r15.A0O(r0)
            if (r0 == 0) goto L_0x039c
            r0 = 13
        L_0x0345:
            r7.A0a(r0)
        L_0x0348:
            if (r17 == 0) goto L_0x0365
            X.00H r0 = r5.A0V
            java.lang.Object r0 = r0.get()
            X.1c4 r0 = (X.AnonymousClass1c4) r0
            X.0ve r8 = r0.A02
            r1 = 10657(0x29a1, float:1.4934E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r8, r1)
            if (r0 == 0) goto L_0x0365
            r0 = 7
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7.A0S = r0
        L_0x0365:
            int r0 = r7.A0E()
            r29 = 0
            if (r0 != r2) goto L_0x0374
            int r1 = r6.A0E()
            r0 = 1
            if (r1 == r2) goto L_0x0375
        L_0x0374:
            r0 = 0
        L_0x0375:
            X.C17960vV.A0C(r0)
            int r0 = r6.A0C()
            if (r0 != r2) goto L_0x0389
            int r0 = r6.A05
            if (r0 <= 0) goto L_0x0389
            r6.A07 = r3
            X.1Qz r0 = r5.A05
            r0.A09(r6)
        L_0x0389:
            X.0zA r1 = r5.A00
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x03d7
            r1.A03()
            java.lang.String r0 = "beforeRemoveAllLabelsFromMessage"
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r0)
            throw r1
        L_0x039c:
            boolean r0 = r7.A19
            if (r0 != 0) goto L_0x03a4
            if (r16 == 0) goto L_0x0348
            if (r19 == 0) goto L_0x0348
        L_0x03a4:
            r0 = 4
            goto L_0x0345
        L_0x03a6:
            boolean r0 = r7 instanceof X.C444723o
            if (r0 == 0) goto L_0x0339
            r8 = r7
            X.23j r8 = (X.C444223j) r8
            boolean r0 = r6 instanceof X.C444323k
            if (r0 == 0) goto L_0x0339
            r1 = r6
            X.23j r1 = (X.C444223j) r1
            java.lang.String r0 = r1.A02
            r8.A02 = r0
            int r0 = r1.A00
            r8.A00 = r0
            long r0 = r1.A01
            r8.A01 = r0
            goto L_0x0339
        L_0x03c2:
            if (r10 == 0) goto L_0x0297
            boolean r8 = r4.A11(r0)
            if (r8 == 0) goto L_0x0297
            r7.A0b(r0)
            X.36k r0 = X.C60472o5.A00(r4)
            goto L_0x0294
        L_0x03d3:
            long r0 = r6.A0y
            goto L_0x0232
        L_0x03d7:
            X.1Cd r0 = r5.A0B     // Catch:{ IOException -> 0x0612 }
            X.1au r18 = r0.A05()     // Catch:{ IOException -> 0x0612 }
            X.1xA r17 = r18.BD0()     // Catch:{ all -> 0x0608 }
            r9 = 0
            if (r19 != 0) goto L_0x03e5
            goto L_0x03e7
        L_0x03e5:
            r8 = r9
            goto L_0x03ed
        L_0x03e7:
            X.1RP r0 = r5.A09     // Catch:{ all -> 0x05fe }
            java.util.Set r8 = r0.A07(r7)     // Catch:{ all -> 0x05fe }
        L_0x03ed:
            boolean r0 = r6 instanceof X.AnonymousClass21V     // Catch:{ all -> 0x05fe }
            if (r0 == 0) goto L_0x03fb
            X.1hB r1 = r5.A0E     // Catch:{ all -> 0x05fe }
            r0 = r6
            X.21V r0 = (X.AnonymousClass21V) r0     // Catch:{ all -> 0x05fe }
            X.C32431hB.A06(r1, r0, r3, r2, r3)     // Catch:{ all -> 0x05fe }
            r29 = 1
        L_0x03fb:
            X.00H r0 = r5.A0L     // Catch:{ all -> 0x05fe }
            java.lang.Object r12 = r0.get()     // Catch:{ all -> 0x05fe }
            X.1Qp r12 = (X.C26041Qp) r12     // Catch:{ all -> 0x05fe }
            X.0ve r11 = r12.A02     // Catch:{ all -> 0x043a }
            r1 = 5718(0x1656, float:8.013E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ all -> 0x043a }
            boolean r0 = X.C18020vd.A05(r0, r11, r1)     // Catch:{ all -> 0x043a }
            if (r0 == 0) goto L_0x0438
            X.Ac2 r11 = X.C26041Qp.A00(r12, r6)     // Catch:{ all -> 0x043a }
            if (r11 != 0) goto L_0x041c
            X.Ac2 r11 = X.C26041Qp.A01(r12, r6)     // Catch:{ all -> 0x043a }
            if (r11 != 0) goto L_0x041c
            goto L_0x0438
        L_0x041c:
            java.lang.String r14 = r11.A02     // Catch:{ all -> 0x043a }
            long r0 = r11.A00     // Catch:{ all -> 0x043a }
            byte[] r13 = r11.A03     // Catch:{ all -> 0x043a }
            X.Ac2 r11 = new X.Ac2     // Catch:{ all -> 0x043a }
            r24 = r9
            r25 = r9
            r26 = r9
            r20 = r11
            r21 = r9
            r22 = r14
            r23 = r13
            r27 = r0
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)     // Catch:{ all -> 0x043a }
            goto L_0x0445
        L_0x0438:
            r11 = r9
            goto L_0x0445
        L_0x043a:
            r11 = move-exception
            X.1Qo r12 = r12.A00     // Catch:{ all -> 0x05fe }
            X.8oI r1 = X.AnonymousClass8oI.A09     // Catch:{ all -> 0x05fe }
            java.lang.String r0 = "getReportingInfoBeforeRevoke"
            r12.A01(r1, r0, r11)     // Catch:{ all -> 0x05fe }
            r11 = r9
        L_0x0445:
            X.C196899vp.A01(r7, r11)     // Catch:{ all -> 0x05fe }
            int r0 = r6.A0E()     // Catch:{ all -> 0x05fe }
            if (r0 != r2) goto L_0x045d
            X.122 r0 = r5.A04     // Catch:{ all -> 0x05fe }
            r32 = r2
            r27 = r0
            r28 = r6
            r30 = r2
            r31 = r3
            r27.BIK(r28, r29, r30, r31, r32)     // Catch:{ all -> 0x05fe }
        L_0x045d:
            r7.A0q = r3     // Catch:{ all -> 0x05fe }
            r7.A0l = r3     // Catch:{ all -> 0x05fe }
            r7.A0L = r9     // Catch:{ all -> 0x05fe }
            r0 = 0
            r7.A0F = r0     // Catch:{ all -> 0x05fe }
            boolean r0 = r7.A0q()     // Catch:{ all -> 0x05fe }
            if (r0 != 0) goto L_0x046f
            r7.A0h = r9     // Catch:{ all -> 0x05fe }
        L_0x046f:
            X.AnonymousClass25B.A04(r7, r9)     // Catch:{ all -> 0x05fe }
            java.lang.Object r0 = r35.get()     // Catch:{ all -> 0x05fe }
            X.1W6 r0 = (X.AnonymousClass1W6) r0     // Catch:{ all -> 0x05fe }
            r0.A04(r7)     // Catch:{ all -> 0x05fe }
            boolean r0 = r7 instanceof X.AnonymousClass23N     // Catch:{ all -> 0x05fe }
            if (r0 == 0) goto L_0x0495
            if (r19 == 0) goto L_0x0495
            r0 = 16777216(0x1000000, double:8.289046E-317)
            boolean r0 = r7.A11(r0)     // Catch:{ all -> 0x05fe }
            if (r0 == 0) goto L_0x0495
            X.36k r0 = X.C60472o5.A00(r7)     // Catch:{ all -> 0x05fe }
            if (r0 == 0) goto L_0x0495
            X.1Ql r0 = r5.A08     // Catch:{ all -> 0x05fe }
            r0.A02(r7)     // Catch:{ all -> 0x05fe }
        L_0x0495:
            X.36a r0 = X.C50382Uf.A00(r7)     // Catch:{ all -> 0x05fe }
            if (r0 == 0) goto L_0x04a2
            X.1hF r1 = r5.A0G     // Catch:{ all -> 0x05fe }
            r0 = r18
            r1.A03(r0, r7)     // Catch:{ all -> 0x05fe }
        L_0x04a2:
            X.00H r1 = r5.A0J     // Catch:{ all -> 0x05fe }
            r1.get()     // Catch:{ all -> 0x05fe }
            X.206 r11 = r6.A0K()     // Catch:{ all -> 0x05fe }
            X.1BI r0 = r6.A0H()     // Catch:{ all -> 0x05fe }
            boolean r0 = X.C42701yb.A01(r0)     // Catch:{ all -> 0x05fe }
            if (r0 == 0) goto L_0x04b8
            if (r11 == 0) goto L_0x04b8
            goto L_0x04ba
        L_0x04b8:
            r14 = 0
            goto L_0x04be
        L_0x04ba:
            X.205 r0 = r11.A0v     // Catch:{ all -> 0x05fe }
            boolean r14 = r0.A02     // Catch:{ all -> 0x05fe }
        L_0x04be:
            X.36h r11 = X.AnonymousClass2UW.A00(r6)     // Catch:{ all -> 0x05fe }
            if (r11 == 0) goto L_0x0563
            r1.get()     // Catch:{ all -> 0x05fe }
            boolean r0 = r6 instanceof X.AnonymousClass210     // Catch:{ all -> 0x05fe }
            if (r0 == 0) goto L_0x054c
            boolean r0 = X.C87494Vu.A00(r6)     // Catch:{ all -> 0x05fe }
            if (r0 == 0) goto L_0x054c
            X.36i r0 = X.AnonymousClass2UX.A00(r6)     // Catch:{ all -> 0x05fe }
            if (r0 == 0) goto L_0x054c
            X.36h r0 = X.AnonymousClass2UW.A00(r6)     // Catch:{ all -> 0x05fe }
            if (r0 == 0) goto L_0x054c
            X.36i r0 = X.AnonymousClass2UX.A00(r6)     // Catch:{ all -> 0x05fe }
            if (r0 == 0) goto L_0x04e7
            X.9Ij r0 = r0.A00     // Catch:{ all -> 0x05fe }
            if (r0 != 0) goto L_0x054c
        L_0x04e7:
            X.00H r0 = r5.A0I     // Catch:{ all -> 0x05fe }
            java.lang.Object r13 = r0.get()     // Catch:{ all -> 0x05fe }
            X.2l7 r13 = (X.C58702l7) r13     // Catch:{ all -> 0x05fe }
            java.lang.String r11 = r11.A02     // Catch:{ all -> 0x05fe }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x05fe }
            X.1PW r1 = (X.AnonymousClass1PW) r1     // Catch:{ all -> 0x05fe }
            r1.getClass()     // Catch:{ all -> 0x05fe }
            r0 = 22
            X.4sV r12 = new X.4sV     // Catch:{ all -> 0x05fe }
            r12.<init>(r1, r0)     // Catch:{ all -> 0x05fe }
            java.util.ArrayList r0 = r13.A00(r11)     // Catch:{ all -> 0x05fe }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x05fe }
            r11.<init>()     // Catch:{ all -> 0x05fe }
            java.util.Iterator r16 = r0.iterator()     // Catch:{ all -> 0x05fe }
        L_0x050e:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x05fe }
            if (r0 == 0) goto L_0x0528
            java.lang.Object r1 = r16.next()     // Catch:{ all -> 0x05fe }
            java.lang.Object r0 = r12.invoke(r1)     // Catch:{ all -> 0x05fe }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x05fe }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x05fe }
            if (r0 == 0) goto L_0x050e
            r11.add(r1)     // Catch:{ all -> 0x05fe }
            goto L_0x050e
        L_0x0528:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x05fe }
            r1.<init>(r11)     // Catch:{ all -> 0x05fe }
            java.util.Iterator r11 = r1.iterator()     // Catch:{ all -> 0x05fe }
        L_0x0531:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x05fe }
            if (r0 == 0) goto L_0x0544
            java.lang.Object r0 = r11.next()     // Catch:{ all -> 0x05fe }
            X.206 r0 = (X.AnonymousClass206) r0     // Catch:{ all -> 0x05fe }
            X.C18070vi.A0b(r0)     // Catch:{ all -> 0x05fe }
            r13.A01(r0)     // Catch:{ all -> 0x05fe }
            goto L_0x0531
        L_0x0544:
            X.121 r0 = r13.A02     // Catch:{ all -> 0x05fe }
            X.122 r0 = (X.AnonymousClass122) r0     // Catch:{ all -> 0x05fe }
            r0.A0V(r1, r3)     // Catch:{ all -> 0x05fe }
            goto L_0x0563
        L_0x054c:
            java.lang.Object r0 = r1.get()     // Catch:{ all -> 0x05fe }
            X.1PW r0 = (X.AnonymousClass1PW) r0     // Catch:{ all -> 0x05fe }
            boolean r0 = r0.A0C(r6)     // Catch:{ all -> 0x05fe }
            if (r0 == 0) goto L_0x0563
            X.00H r0 = r5.A0I     // Catch:{ all -> 0x05fe }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x05fe }
            X.2l7 r0 = (X.C58702l7) r0     // Catch:{ all -> 0x05fe }
            r0.A01(r6)     // Catch:{ all -> 0x05fe }
        L_0x0563:
            boolean r0 = r10.A02     // Catch:{ all -> 0x05fe }
            if (r0 != 0) goto L_0x057b
            boolean r0 = X.AnonymousClass25A.A0R(r15, r7)     // Catch:{ all -> 0x05fe }
            if (r0 != 0) goto L_0x057b
            int r1 = r7.A0u     // Catch:{ all -> 0x05fe }
            r0 = 83
            if (r1 != r0) goto L_0x0590
            X.1BI r0 = r7.A0K     // Catch:{ all -> 0x05fe }
            boolean r0 = r15.A0O(r0)     // Catch:{ all -> 0x05fe }
            if (r0 == 0) goto L_0x0590
        L_0x057b:
            boolean r0 = X.C22971Dz.A0a(r33)     // Catch:{ all -> 0x05fe }
            if (r0 == 0) goto L_0x0593
            java.lang.String r0 = "deleted self status, calling refreshMyStatusAndNotifyAboutStatusDeletion"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x05fe }
            X.122 r1 = r5.A04     // Catch:{ all -> 0x05fe }
            java.util.List r0 = java.util.Collections.singletonList(r7)     // Catch:{ all -> 0x05fe }
            r1.A0U(r0)     // Catch:{ all -> 0x05fe }
            goto L_0x0593
        L_0x0590:
            if (r14 != 0) goto L_0x057b
            goto L_0x05dd
        L_0x0593:
            if (r19 != 0) goto L_0x059c
            X.1Q6 r0 = r5.A07     // Catch:{ all -> 0x05fe }
            java.util.Map r0 = r0.A02     // Catch:{ all -> 0x05fe }
            r0.put(r10, r7)     // Catch:{ all -> 0x05fe }
        L_0x059c:
            if (r8 != 0) goto L_0x05a7
            if (r19 != 0) goto L_0x05a6
            X.1RP r0 = r5.A09     // Catch:{ all -> 0x05fe }
            java.util.Set r9 = r0.A07(r7)     // Catch:{ all -> 0x05fe }
        L_0x05a6:
            r8 = r9
        L_0x05a7:
            X.1WX r1 = r5.A0C     // Catch:{ all -> 0x05fe }
            r1.A01(r6)     // Catch:{ all -> 0x05fe }
            if (r8 == 0) goto L_0x05d8
            boolean r0 = r8.isEmpty()     // Catch:{ all -> 0x05fe }
            if (r0 != 0) goto L_0x05d8
            X.1RP r0 = r1.A02     // Catch:{ all -> 0x05fe }
            r0.A08(r7, r8)     // Catch:{ all -> 0x05fe }
            X.1Qw r0 = r1.A03     // Catch:{ all -> 0x05fe }
            X.1Qt r9 = X.C26111Qw.A00(r0, r7)     // Catch:{ all -> 0x05fe }
            r8.size()     // Catch:{ all -> 0x05fe }
            boolean r0 = r9 instanceof X.AnonymousClass2De     // Catch:{ all -> 0x05fe }
            if (r0 == 0) goto L_0x05d2
            r0 = r9
            X.2De r0 = (X.AnonymousClass2De) r0     // Catch:{ all -> 0x05fe }
            X.00z r0 = r0.A00     // Catch:{ all -> 0x05fe }
            r0.A05(r10)     // Catch:{ all -> 0x05fe }
        L_0x05ce:
            r9.A0C(r7, r8, r2)     // Catch:{ all -> 0x05fe }
            goto L_0x05d8
        L_0x05d2:
            long r0 = r7.A0x     // Catch:{ all -> 0x05fe }
            r9.A07(r0)     // Catch:{ all -> 0x05fe }
            goto L_0x05ce
        L_0x05d8:
            if (r37 == 0) goto L_0x05e8
            if (r19 == 0) goto L_0x05e8
            goto L_0x05e3
        L_0x05dd:
            X.1N9 r0 = r5.A0F     // Catch:{ all -> 0x05fe }
            r0.A08(r4)     // Catch:{ all -> 0x05fe }
            goto L_0x05e8
        L_0x05e3:
            X.1N9 r0 = r5.A0F     // Catch:{ all -> 0x05fe }
            r0.A08(r4)     // Catch:{ all -> 0x05fe }
        L_0x05e8:
            r17.A00()     // Catch:{ all -> 0x05fe }
            r0 = 17
            X.3C4 r1 = new X.3C4     // Catch:{ all -> 0x05fe }
            r1.<init>(r5, r6, r7, r0)     // Catch:{ all -> 0x05fe }
            r0 = r18
            r0.BJ7(r1)     // Catch:{ all -> 0x05fe }
            r17.close()     // Catch:{ all -> 0x0608 }
            r18.close()     // Catch:{ IOException -> 0x0612 }
            goto L_0x062b
        L_0x05fe:
            r1 = move-exception
            r17.close()     // Catch:{ all -> 0x0603 }
            goto L_0x0607
        L_0x0603:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0608 }
        L_0x0607:
            throw r1     // Catch:{ all -> 0x0608 }
        L_0x0608:
            r1 = move-exception
            r18.close()     // Catch:{ all -> 0x060d }
            goto L_0x0611
        L_0x060d:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x0612 }
        L_0x0611:
            throw r1     // Catch:{ IOException -> 0x0612 }
        L_0x0612:
            r4 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "msgstore/revoke: Failed to re-insert revoked message:"
            r1.append(r0)
            java.lang.String r0 = r4.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x062b:
            X.1CJ r0 = r5.A03
            X.AnonymousClass25A.A0E(r15, r0, r6)
            X.1Q2 r4 = r5.A0P
            android.os.Handler r1 = r4.A00
            r0 = 5
            r8 = r36
            android.os.Message r0 = android.os.Message.obtain(r1, r0, r8, r3, r7)
            r0.sendToTarget()
            android.os.Handler r3 = r4.A01
            r1 = 23
            X.3Bx r0 = new X.3Bx
            r0.<init>(r5, r6, r1)
            r3.post(r0)
            android.os.Handler r3 = r4.A02
            r0 = 24
            X.3Bx r1 = new X.3Bx
            r1.<init>(r5, r7, r0)
            goto L_0x015f
        L_0x0655:
            boolean r0 = r4 instanceof X.C444723o
            if (r0 == 0) goto L_0x010c
            r0 = r4
            X.23o r0 = (X.C444723o) r0
            r0.A02 = r1
            goto L_0x010c
        L_0x0660:
            if (r19 == 0) goto L_0x0169
            if (r37 == 0) goto L_0x0169
            X.1BI r14 = r4.A0H()
            boolean r0 = X.C22971Dz.A0b(r14)
            if (r0 != 0) goto L_0x0169
            boolean r0 = r4 instanceof X.AnonymousClass23O
            if (r0 == 0) goto L_0x06c3
            r0 = r4
            X.23O r0 = (X.AnonymousClass23O) r0
            com.whatsapp.jid.UserJid r8 = r0.A00
        L_0x0677:
            long r0 = r4.A0I
            if (r10 == 0) goto L_0x06b7
            r6 = r4
            X.23N r6 = (X.AnonymousClass23N) r6
            java.lang.String r12 = r6.A01
        L_0x0680:
            r19 = 0
            X.Ac2 r6 = X.C196899vp.A00(r4)
            if (r6 != 0) goto L_0x06ab
            r11 = r19
        L_0x068a:
            X.2gg r13 = new X.2gg
            r21 = r3
            r15 = r8
            r16 = r9
            r17 = r11
            r18 = r12
            r20 = r3
            r22 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r5.A02(r13)
            boolean r0 = r4.A0u()
            if (r0 != 0) goto L_0x0169
            X.1N9 r0 = r5.A0F
            r0.A08(r4)
            return r2
        L_0x06ab:
            byte[] r10 = r6.A03
            byte[] r7 = r6.A04
            java.lang.Integer r6 = r6.A01
            X.AVz r11 = new X.AVz
            r11.<init>(r6, r10, r7)
            goto L_0x068a
        L_0x06b7:
            boolean r6 = r4 instanceof X.C444723o
            if (r6 == 0) goto L_0x06c1
            r6 = r4
            X.23o r6 = (X.C444723o) r6
            java.lang.String r12 = r6.A02
            goto L_0x0680
        L_0x06c1:
            r12 = 0
            goto L_0x0680
        L_0x06c3:
            r8 = 0
            goto L_0x0677
        L_0x06c5:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Cannot clone message: "
            r1.append(r0)
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32481hG.A00(X.1hG, X.206, int, boolean):boolean");
    }

    public C55972gg A01(Cursor cursor) {
        C20719AVz aVz;
        Jid A0E2;
        Jid A0E3;
        Cursor cursor2 = cursor;
        String string = cursor2.getString(cursor2.getColumnIndexOrThrow("key_id"));
        boolean z = false;
        if (cursor2.getLong(cursor2.getColumnIndexOrThrow("from_me")) > 0) {
            z = true;
        }
        AnonymousClass1BI A0B2 = this.A0O.A0B(cursor2.getLong(cursor2.getColumnIndexOrThrow("chat_row_id")));
        Integer num = null;
        if (A0B2 == null) {
            return null;
        }
        byte[] blob = cursor2.getBlob(cursor2.getColumnIndexOrThrow("reporting_tag"));
        if (blob != null) {
            byte[] blob2 = cursor2.getBlob(cursor2.getColumnIndexOrThrow("reporting_token"));
            int columnIndexOrThrow = cursor2.getColumnIndexOrThrow("reporting_version");
            if (!cursor2.isNull(columnIndexOrThrow)) {
                num = Integer.valueOf(cursor2.getInt(columnIndexOrThrow));
            }
            aVz = new C20719AVz(num, blob, blob2);
        } else {
            aVz = null;
        }
        cursor2.getLong(cursor2.getColumnIndexOrThrow("_id"));
        AnonymousClass205 r12 = new AnonymousClass205(A0B2, string, z);
        Class<AnonymousClass1BI> cls = AnonymousClass1BI.class;
        int columnIndexOrThrow2 = cursor2.getColumnIndexOrThrow("sender_jid_row_id");
        if (cursor2.isNull(columnIndexOrThrow2)) {
            A0E2 = null;
        } else {
            A0E2 = this.A06.A0E(cls, cursor2.getLong(columnIndexOrThrow2));
        }
        AnonymousClass1BI r10 = (AnonymousClass1BI) A0E2;
        long j = cursor2.getLong(cursor2.getColumnIndexOrThrow("timestamp"));
        int i = cursor2.getInt(cursor2.getColumnIndexOrThrow("message_type"));
        String string2 = cursor2.getString(cursor2.getColumnIndexOrThrow("revoked_key_id"));
        Class<UserJid> cls2 = UserJid.class;
        int columnIndexOrThrow3 = cursor2.getColumnIndexOrThrow("admin_jid_row_id");
        if (cursor2.isNull(columnIndexOrThrow3)) {
            A0E3 = null;
        } else {
            A0E3 = this.A06.A0E(cls2, cursor2.getLong(columnIndexOrThrow3));
        }
        return new C55972gg(r10, (UserJid) A0E3, r12, aVz, string2, cursor2.getBlob(cursor2.getColumnIndexOrThrow("orphan_message_data")), i, cursor2.getInt(cursor2.getColumnIndexOrThrow("retry_count")), j);
    }

    public void A02(C55972gg r18) {
        String l;
        Cursor A0A2;
        long j;
        C55972gg A012;
        C55972gg r6 = r18;
        AnonymousClass205 r4 = r6.A05;
        AnonymousClass1LW r10 = this.A0O;
        AnonymousClass1BI r9 = r4.A00;
        C17960vV.A07(r9);
        String l2 = Long.toString(r10.A09(r9));
        AnonymousClass1BI r11 = r6.A03;
        if (r11 == null) {
            l = "";
        } else {
            l = Long.toString(this.A06.A09(r11));
        }
        C28791au A052 = this.A0B.A05();
        try {
            C41851xA BD0 = A052.BD0();
            try {
                C23141Ev r5 = ((C28801av) A052).A02;
                String str = r4.A01;
                boolean z = r4.A02;
                A0A2 = r5.A0A("SELECT _id, key_id, from_me, chat_row_id, sender_jid_row_id, timestamp, message_type, revoked_key_id, retry_count, admin_jid_row_id, orphan_message_data, reporting_token, reporting_tag, reporting_version  FROM message_orphaned_edit WHERE key_id = ? AND from_me = ? AND chat_row_id = ? AND sender_jid_row_id = ?", "GET_ORPHANED_MESSAGE_BY_KEY_SQL", new String[]{str, String.valueOf(z ? 1 : 0), l2, l});
                Long l3 = null;
                if (!A0A2.moveToLast() || (A012 = A01(A0A2)) == null || (A012.A01 == 1 && r6.A01 == 0)) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("key_id", str);
                    contentValues.put("from_me", Integer.valueOf(z));
                    C17960vV.A07(r9);
                    contentValues.put("chat_row_id", Long.valueOf(r10.A09(r9)));
                    if (r11 == null) {
                        j = 0;
                    } else {
                        j = this.A06.A09(r11);
                    }
                    contentValues.put("sender_jid_row_id", Long.valueOf(j));
                    contentValues.put("timestamp", Long.valueOf(r6.A02));
                    contentValues.put("message_type", Integer.valueOf(r6.A01));
                    contentValues.put("revoked_key_id", r6.A07);
                    contentValues.put("retry_count", Integer.valueOf(r6.A00));
                    UserJid userJid = r6.A04;
                    if (userJid != null) {
                        l3 = Long.valueOf(this.A06.A09(userJid));
                    }
                    contentValues.put("admin_jid_row_id", l3);
                    contentValues.put("orphan_message_data", r6.A08);
                    C20719AVz aVz = r6.A06;
                    if (aVz != null) {
                        contentValues.put("reporting_token", aVz.A02);
                        contentValues.put("reporting_tag", aVz.A01);
                        contentValues.put("reporting_version", aVz.A00);
                    }
                    r5.A07("message_orphaned_edit", "INSERT_MESSAGE_ORPHANED_EDIT_SQL", contentValues);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("EditMessageStore/storeOrphanedEditMessage/skipping-edit-store old message exists; msg.key=");
                    sb.append(r4);
                    Log.i(sb.toString());
                }
                BD0.A00();
                A0A2.close();
                BD0.close();
                A052.close();
                return;
            } catch (Throwable th) {
                BD0.close();
                throw th;
            }
            throw th;
        } catch (Throwable th2) {
            try {
                A052.close();
                throw th2;
            } catch (Throwable th3) {
                AnonymousClass0DT.A00(th2, th3);
                throw th2;
            }
        }
    }

    public void A03(AnonymousClass206 r4, boolean z) {
        ((C31931gM) this.A0H.get()).A01(new AnonymousClass7RF(this, r4, 43, z), 31);
    }

    public boolean A04(AnonymousClass206 r5, boolean z) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("msgstore/edit/revoke ");
        AnonymousClass205 r2 = r5.A0v;
        if (r2.A02) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("send deleteMedia=");
            sb2.append(z);
            str = sb2.toString();
        } else {
            str = "recv";
        }
        sb.append(str);
        sb.append(" key=");
        sb.append(r2);
        Log.i(sb.toString());
        return A00(this, r5, -1, true);
    }

    public C32481hG(C19880zA r2, AnonymousClass11S r3, AnonymousClass11P r4, C22621Co r5, AnonymousClass1LW r6, AnonymousClass1CJ r7, AnonymousClass122 r8, C26141Qz r9, AnonymousClass1Q2 r10, AnonymousClass1DL r11, AnonymousClass1Q6 r12, C26001Ql r13, AnonymousClass1RP r14, C24681Lg r15, AnonymousClass1Cd r16, AnonymousClass1WX r17, C24661Le r18, C24751Ln r19, C18030ve r20, C32431hB r21, AnonymousClass1N9 r22, C32471hF r23, AnonymousClass1RU r24, C32451hD r25, AnonymousClass00H r26, AnonymousClass00H r27, AnonymousClass00H r28, AnonymousClass00H r29, AnonymousClass00H r30, AnonymousClass00H r31, AnonymousClass00H r32, AnonymousClass00H r33) {
        this.A02 = r4;
        this.A0R = r20;
        this.A06 = r11;
        this.A0O = r6;
        this.A01 = r3;
        this.A03 = r7;
        this.A0N = r5;
        this.A0D = r18;
        this.A0F = r22;
        this.A0J = r26;
        this.A0P = r10;
        this.A0C = r17;
        this.A0Q = r19;
        this.A04 = r8;
        this.A0K = r27;
        this.A0A = r15;
        this.A0H = r28;
        this.A0W = r29;
        this.A07 = r12;
        this.A08 = r13;
        this.A0B = r16;
        this.A0L = r30;
        this.A0E = r21;
        this.A05 = r9;
        this.A0T = r25;
        this.A0G = r23;
        this.A0I = r31;
        this.A0U = r32;
        this.A0S = r24;
        this.A09 = r14;
        this.A00 = r2;
        this.A0V = r33;
    }
}
