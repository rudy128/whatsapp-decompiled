package X;

import java.util.concurrent.Callable;

/* renamed from: X.1yR  reason: invalid class name and case insensitive filesystem */
public abstract class C42601yR implements Callable {
    public final C42621yT A00 = new Object();

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01a8, code lost:
        if (r3 != null) goto L_0x01aa;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A02() {
        /*
            r33 = this;
            r0 = r33
            boolean r1 = r0 instanceof X.C42611yS
            if (r1 == 0) goto L_0x0052
            X.1yS r0 = (X.C42611yS) r0
            X.1yN r16 = X.C42611yS.A0F
            X.0ve r15 = r0.A09
            X.11S r14 = r0.A01
            X.1PW r13 = r0.A02
            X.1CJ r12 = r0.A06
            X.1Me r11 = r0.A05
            X.1M9 r10 = r0.A04
            X.1R3 r9 = r0.A07
            X.1xp r8 = r0.A08
            X.1kb r7 = r0.A03
            X.00H r6 = r0.A0D
            X.0zA r5 = r0.A00
            X.1yT r4 = r0.A00
            X.C18070vi.A0W(r4)
            X.1BI r3 = r0.A0A
            X.6yE r2 = r0.A0C
            java.util.Collection r1 = r0.A0E
            X.1yA r0 = r0.A0B
            r31 = r6
            r32 = r1
            r29 = r0
            r30 = r2
            r28 = r3
            r27 = r15
            r26 = r8
            r25 = r9
            r24 = r12
            r23 = r11
            r22 = r10
            r21 = r7
            r20 = r13
            r19 = r14
            r18 = r5
            r17 = r4
            X.1yy r1 = r16.A01(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            return r1
        L_0x0052:
            boolean r1 = r0 instanceof X.C43441zo
            if (r1 == 0) goto L_0x007c
            X.1zo r0 = (X.C43441zo) r0
            X.0ve r9 = r0.A07
            X.11S r2 = r0.A00
            X.1PW r3 = r0.A01
            X.1CJ r6 = r0.A04
            X.1M9 r5 = r0.A03
            X.1R3 r7 = r0.A05
            X.1Nb r13 = r0.A0B
            X.1WM r8 = r0.A06
            X.1kb r4 = r0.A02
            X.1yA r11 = r0.A09
            X.00H r14 = r0.A0C
            X.1yT r1 = r0.A00
            X.C18070vi.A0W(r1)
            X.1BI r10 = r0.A08
            X.206 r12 = r0.A0A
            X.25M r1 = X.C43471zr.A00(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r1
        L_0x007c:
            boolean r1 = r0 instanceof X.AnonymousClass2D8
            if (r1 == 0) goto L_0x00a4
            X.2D8 r0 = (X.AnonymousClass2D8) r0
            X.0z4 r4 = r0.A00
            X.00H r1 = r4.A00
            java.lang.Object r3 = r1.get()
            android.content.SharedPreferences r3 = (android.content.SharedPreferences) r3
            java.lang.String r2 = "show_statuses_education"
            r1 = 1
            boolean r1 = r3.getBoolean(r2, r1)
            if (r1 == 0) goto L_0x00a1
            X.1Le r0 = r0.A01
            boolean r0 = r0.A0I()
            if (r0 == 0) goto L_0x00a1
            r4.A16()
        L_0x00a1:
            X.1Wu r1 = X.C27621Wu.A00
            return r1
        L_0x00a4:
            boolean r1 = r0 instanceof X.AnonymousClass2DA
            if (r1 == 0) goto L_0x0229
            X.2DA r0 = (X.AnonymousClass2DA) r0
            X.1md r2 = r0.A03
            r2.A02()
            r1 = 0
            r2.A0G(r1)
            X.1CJ r1 = r0.A01
            java.util.Collection r1 = r1.A0H()
            if (r1 == 0) goto L_0x035e
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r1.iterator()
        L_0x00c4:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x00d6
            java.lang.Object r2 = r3.next()
            boolean r1 = r2 instanceof X.C46162Dk
            if (r1 == 0) goto L_0x00c4
            r4.add(r2)
            goto L_0x00c4
        L_0x00d6:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x00df:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x00fc
            java.lang.Object r3 = r4.next()
            r1 = r3
            X.2Dk r1 = (X.C46162Dk) r1
            X.9Ig r2 = r1.A02
            X.9Ig r1 = X.C179509Ig.GUEST
            boolean r1 = X.AnonymousClass000.A1Z(r2, r1)
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x00df
            r5.add(r3)
            goto L_0x00df
        L_0x00fc:
            r1 = 10
            int r1 = X.C29351c6.A0C(r5, r1)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r1)
            java.util.Iterator r7 = r5.iterator()
        L_0x010b:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0216
            java.lang.Object r2 = r7.next()
            X.2Dk r2 = (X.C46162Dk) r2
            X.00H r1 = r0.A04
            java.lang.Object r1 = r1.get()
            X.1Nb r1 = (X.AnonymousClass1Nb) r1
            java.util.LinkedHashSet r3 = r1.A0e()
            X.1BI r1 = r2.A08()
            boolean r19 = r3.contains(r1)
            X.1R3 r3 = r0.A02
            X.1BI r1 = r2.A08()
            X.206 r1 = r3.A05(r1)
            if (r1 == 0) goto L_0x020b
            long r13 = r1.A0I
            boolean r3 = r1 instanceof X.AnonymousClass21V
            if (r3 == 0) goto L_0x01f2
            r3 = r1
            X.21V r3 = (X.AnonymousClass21V) r3
            boolean r17 = X.AnonymousClass25A.A12(r3)
        L_0x0144:
            boolean r3 = r1 instanceof X.AnonymousClass21Y
            r18 = 0
            if (r3 == 0) goto L_0x0165
            r3 = r1
            X.21V r3 = (X.AnonymousClass21V) r3
            X.2rc r3 = r3.A02
            if (r3 == 0) goto L_0x0165
            boolean r3 = r3.A0d
            if (r3 == 0) goto L_0x0165
            X.00H r3 = r0.A06
            java.lang.Object r3 = r3.get()
            X.1c4 r3 = (X.AnonymousClass1c4) r3
            boolean r3 = X.AnonymousClass25A.A0Y(r3, r1)
            if (r3 == 0) goto L_0x0165
            r18 = 1
        L_0x0165:
            r25 = 0
            r28 = 0
            r23 = 0
            r27 = -3
            r26 = r2
            r24 = r2
            X.2Dk r9 = X.C46162Dk.A00(r24, r25, r26, r27, r28)
            r9.A0I(r1)
            X.1M9 r5 = r0.A00
            X.1BI r3 = r2.A08()
            X.1E7 r10 = r5.A0H(r3)
            X.1E7 r3 = r10.A05()
            if (r3 == 0) goto L_0x0189
            r10 = r3
        L_0x0189:
            X.00H r3 = r0.A07
            java.lang.Object r3 = r3.get()
            X.6p3 r3 = (X.C133606p3) r3
            java.lang.String r11 = r3.A00(r13)
            int r3 = r2.A0A
            long r15 = (long) r3
            if (r1 == 0) goto L_0x01f0
            int r12 = r1.A0D()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)
            boolean r1 = r2.A0P()
            if (r1 == 0) goto L_0x01f0
            if (r3 == 0) goto L_0x01f0
        L_0x01aa:
            X.00H r6 = r0.A05
            java.lang.Object r1 = r6.get()
            X.70D r1 = (X.AnonymousClass70D) r1
            boolean r20 = r1.A05(r2)
            java.lang.Object r1 = r6.get()
            X.70D r1 = (X.AnonymousClass70D) r1
            java.lang.Object r3 = r1.A06
            monitor-enter(r3)
            java.util.Set r5 = r1.A0B     // Catch:{ all -> 0x0213 }
            X.1BI r1 = r2.A08()     // Catch:{ all -> 0x0213 }
            boolean r21 = r5.contains(r1)     // Catch:{ all -> 0x0213 }
            monitor-exit(r3)
            java.lang.Object r1 = r6.get()
            X.70D r1 = (X.AnonymousClass70D) r1
            boolean r3 = r1.A00
            boolean r1 = r2.A0B
            if (r1 == 0) goto L_0x01e2
            java.lang.Object r1 = r6.get()
            X.70D r1 = (X.AnonymousClass70D) r1
            boolean r1 = r1.A00
            if (r1 == 0) goto L_0x01e2
            r23 = 1
        L_0x01e2:
            r24 = 0
            X.6Jh r8 = new X.6Jh
            r22 = r3
            r8.<init>(r9, r10, r11, r12, r13, r15, r17, r18, r19, r20, r21, r22, r23, r24)
            r4.add(r8)
            goto L_0x010b
        L_0x01f0:
            r12 = 0
            goto L_0x01aa
        L_0x01f2:
            X.36w r3 = X.C60502o8.A00(r1)
            r5 = 1
            if (r3 == 0) goto L_0x0203
            X.36w r3 = X.C60502o8.A00(r1)
            if (r3 == 0) goto L_0x0207
            boolean r3 = r3.A0A
            if (r3 != r5) goto L_0x0207
        L_0x0203:
            r17 = 1
            goto L_0x0144
        L_0x0207:
            r17 = 0
            goto L_0x0144
        L_0x020b:
            long r13 = r2.A0E
            r17 = 1
            r18 = 0
            goto L_0x0165
        L_0x0213:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0216:
            r0 = 47
            X.7Rn r2 = new X.7Rn
            r2.<init>(r0)
            r1 = 16
            X.7Rk r0 = new X.7Rk
            r0.<init>((java.lang.Object) r2, (int) r1)
            java.util.List r1 = X.C29431cG.A0y(r4, r0)
            return r1
        L_0x0229:
            boolean r1 = r0 instanceof X.AnonymousClass2D9
            if (r1 == 0) goto L_0x0281
            X.2D9 r0 = (X.AnonymousClass2D9) r0
            X.1TG r3 = r0.A00
            X.1E5 r2 = X.AnonymousClass1E5.A00
            r1 = -1
            java.util.ArrayList r1 = r3.A04(r2, r1)
            X.2AI r5 = new X.2AI
            r5.<init>()
            java.util.Iterator r4 = r1.iterator()
        L_0x0241:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0279
            java.lang.Object r3 = r4.next()
            X.206 r3 = (X.AnonymousClass206) r3
            X.C18070vi.A0b(r3)
            r1 = 0
            X.C18070vi.A0d(r3, r1)
            int r2 = r3.A0u
            r1 = 1
            if (r2 == 0) goto L_0x0262
            if (r2 == r1) goto L_0x0262
            r1 = 3
            if (r2 == r1) goto L_0x0262
            r1 = 13
            if (r2 != r1) goto L_0x0241
        L_0x0262:
            int r2 = r3.A0D()
            r1 = 4
            boolean r1 = X.C446824j.A02(r2, r1)
            if (r1 == 0) goto L_0x0241
            boolean r1 = X.AnonymousClass25A.A0p(r3)
            if (r1 != 0) goto L_0x0241
            X.00H r1 = r0.A01
            r1.get()
            goto L_0x0241
        L_0x0279:
            X.1IX r1 = r5.build()
            X.C18070vi.A0X(r1)
            return r1
        L_0x0281:
            boolean r1 = r0 instanceof X.AnonymousClass2DC
            if (r1 == 0) goto L_0x0341
            X.2DC r0 = (X.AnonymousClass2DC) r0
            java.lang.CharSequence r2 = r0.A08
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            java.lang.String r6 = ""
            if (r1 != 0) goto L_0x0340
            java.lang.String r3 = r2.toString()
            java.lang.String r2 = "\n"
            java.lang.String r1 = " "
            java.lang.String r3 = r3.replace(r2, r1)
            X.11C r2 = r0.A04
            X.0vc r1 = r0.A07
            java.lang.CharSequence r14 = X.C26302CxJ.A0C(r2, r1, r3)
            android.content.Context r11 = r0.A02
            java.util.List r15 = r0.A09
            X.0vb r12 = r0.A05
            X.1zf r13 = X.C43351zf.A01
            r4 = 1
            r16 = r4
            X.1zg r2 = X.C43351zf.A00(r11, r12, r13, r14, r15, r16)
            X.1yT r9 = r0.A00
            r9.A02()
            java.lang.Object r8 = r2.A00
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            boolean r1 = android.text.TextUtils.isEmpty(r8)
            if (r1 != 0) goto L_0x0340
            java.lang.Object r3 = r2.A01
            java.util.List r3 = (java.util.List) r3
            r1 = 460(0x1cc, float:6.45E-43)
            X.4mw r10 = new X.4mw
            r10.<init>(r4, r1)
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L_0x0338
            android.graphics.Paint r7 = r0.A03
            int r1 = r8.length()
            r5 = 0
            float r6 = r7.measureText(r8, r5, r1)
            int r2 = r0.A00
            int r1 = r0.A01
            int r2 = r2 * r1
            float r4 = (float) r2
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x0338
            java.text.BreakIterator r11 = X.C20103A7h.A02(r12)
            java.lang.String r1 = r8.toString()
            r11.setText(r1)
            r2 = 20
            int r1 = r8.length()
            java.util.List r10 = X.AnonymousClass2DC.A00(r11, r3, r2, r1)
            android.text.SpannableStringBuilder r6 = new android.text.SpannableStringBuilder
            r6.<init>()
            X.AnonymousClass2DC.A01(r6, r0, r8, r10)
            r9.A02()
            r3 = 10
        L_0x030b:
            int r1 = r6.length()
            float r1 = r7.measureText(r6, r5, r1)
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 > 0) goto L_0x0340
            int r2 = r6.length()
            int r1 = r8.length()
            if (r2 >= r1) goto L_0x0340
            r9.A02()
            r6.clear()
            int r1 = r8.length()
            java.util.List r10 = X.AnonymousClass2DC.A00(r11, r10, r3, r1)
            X.AnonymousClass2DC.A01(r6, r0, r8, r10)
            r9.A02()
            int r3 = r3 + 10
            goto L_0x030b
        L_0x0338:
            android.graphics.Paint r1 = r0.A03
            X.1KW r0 = r0.A06
            java.lang.CharSequence r6 = X.C43251zV.A02(r11, r1, r10, r0, r8)
        L_0x0340:
            return r6
        L_0x0341:
            boolean r1 = r0 instanceof X.AnonymousClass2D7
            if (r1 == 0) goto L_0x0360
            X.2D7 r0 = (X.AnonymousClass2D7) r0
            X.1yF r2 = r0.A01
            X.1TA r1 = r2.A0N
            com.whatsapp.jid.GroupJid r0 = r0.A00
            X.2Q4 r0 = r1.A03(r0)
            if (r0 == 0) goto L_0x035e
            X.1TD r2 = r2.A0L
            long r0 = r0.A01()
            X.9Bw r1 = r2.A05(r0)
            return r1
        L_0x035e:
            r1 = 0
            return r1
        L_0x0360:
            X.2DB r0 = (X.AnonymousClass2DB) r0
            X.1yN r16 = X.C42611yS.A0F
            X.0ve r1 = r0.A0A
            r27 = r1
            X.11S r15 = r0.A01
            X.1PW r14 = r0.A02
            X.1CJ r13 = r0.A06
            X.1Me r12 = r0.A05
            X.1M9 r11 = r0.A04
            X.1R3 r10 = r0.A07
            X.1xp r9 = r0.A09
            X.1kb r8 = r0.A03
            X.00H r7 = r0.A0F
            X.0zA r6 = r0.A00
            X.1yT r5 = r0.A00
            X.1BI r4 = r0.A0B
            X.6yE r3 = r0.A0E
            java.util.Collection r2 = r0.A0G
            X.1yA r1 = r0.A0C
            r31 = r7
            r32 = r2
            r28 = r4
            r29 = r1
            r30 = r3
            r26 = r9
            r24 = r13
            r25 = r10
            r22 = r11
            r23 = r12
            r20 = r14
            r21 = r8
            r18 = r6
            r19 = r15
            r17 = r5
            X.1yy r6 = r16.A01(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            X.1Nb r3 = r0.A0D
            X.1WM r2 = r0.A08
            X.206 r0 = r6.A05
            r16 = r5
            r17 = r15
            r18 = r14
            r19 = r8
            r20 = r11
            r21 = r13
            r22 = r10
            r23 = r2
            r24 = r27
            r25 = r4
            r26 = r1
            r27 = r0
            r28 = r3
            r29 = r7
            X.25M r0 = X.C43471zr.A00(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            X.2la r1 = new X.2la
            r1.<init>(r0, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42601yR.A02():java.lang.Object");
    }

    public Object call() {
        C42621yT r2 = this.A00;
        if (!r2.A03()) {
            Object A02 = A02();
            if (!r2.A03()) {
                return A02;
            }
        }
        throw new AnonymousClass1QC();
    }
}
