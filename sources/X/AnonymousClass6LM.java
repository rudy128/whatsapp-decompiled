package X;

/* renamed from: X.6LM  reason: invalid class name */
public final class AnonymousClass6LM extends A34 {
    public final AnonymousClass11P A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;

    /* JADX WARNING: type inference failed for: r3v4, types: [X.6qp, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00a7, code lost:
        if (X.AnonymousClass11P.A01(r6.A00) < (r10.A01 + (((long) java.lang.Math.pow(2.0d, (double) r1)) * 60000))) goto L_0x00a9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A0G(java.lang.Object[] r21) {
        /*
            r20 = this;
            r6 = r20
            X.00H r5 = r6.A03
            java.lang.Object r9 = r5.get()
            X.6p6 r9 = (X.AnonymousClass6p6) r9
            X.0vl r0 = r9.A02
            r0.getValue()
            java.lang.Object r1 = r0.getValue()
            java.util.AbstractMap r1 = (java.util.AbstractMap) r1
            int r0 = r1.size()
            int r0 = X.C200610r.A03(r0)
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>(r0)
            java.util.Iterator r10 = X.C17890vO.A0i(r1)
        L_0x0026:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0068
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r10)
            java.lang.Object r7 = r0.getKey()
            java.lang.Object r1 = r0.getKey()
            X.C18070vi.A0X(r1)
            java.lang.Object r4 = r0.getValue()
            X.C18070vi.A0X(r4)
            java.util.List r4 = (java.util.List) r4
            java.util.concurrent.ConcurrentHashMap r0 = r9.A01
            java.lang.Object r3 = r0.get(r1)
            X.6qp r3 = (X.C134586qp) r3
            if (r3 != 0) goto L_0x005f
            java.lang.String r0 = "unsentSessionBackOffDataIsEmpty"
            r2 = 0
            X.C17960vV.A0F(r2, r0)
            r0 = 0
            X.6qp r3 = new X.6qp
            r3.<init>()
            r3.A01 = r0
            r3.A00 = r2
        L_0x005f:
            X.6qq r0 = new X.6qq
            r0.<init>(r3, r4)
            r8.put(r7, r0)
            goto L_0x0026
        L_0x0068:
            X.10w r0 = X.AnonymousClass2V0.A00(r8)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r13 = r0.iterator()
        L_0x0074:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x02d1
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r13)
            java.lang.String r4 = X.C17880vN.A0x(r0)
            java.lang.Object r7 = r0.getValue()
            X.6qq r7 = (X.C134596qq) r7
            X.6qp r10 = r7.A00
            int r1 = r10.A00
            r0 = 5
            if (r1 >= r0) goto L_0x00a9
            double r2 = (double) r1
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r2 = java.lang.Math.pow(r0, r2)
            long r0 = (long) r2
            r2 = 60000(0xea60, double:2.9644E-319)
            long r0 = r0 * r2
            X.11P r2 = r6.A00
            long r8 = X.AnonymousClass11P.A01(r2)
            long r2 = r10.A01
            long r2 = r2 + r0
            int r1 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            r0 = 1
            if (r1 >= 0) goto L_0x00aa
        L_0x00a9:
            r0 = 0
        L_0x00aa:
            java.lang.String r12 = "CrosspostSendUnsentStatusTask/doInBackground sessionId: "
            if (r0 != 0) goto L_0x00bb
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r12)
            r1.append(r4)
            java.lang.String r0 = " exceeding cooldown,skipping"
            X.C108995ce.A1O(r1, r0)
            goto L_0x0074
        L_0x00bb:
            java.util.List r0 = r7.A01
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.util.Iterator r8 = r0.iterator()
        L_0x00c5:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x010f
            long r0 = X.C17890vO.A07(r8)
            X.00H r2 = r6.A02
            java.lang.Object r2 = r2.get()
            X.6mr r2 = (X.C132466mr) r2
            X.00H r2 = r2.A01
            X.206 r7 = X.AnonymousClass1W2.A02(r2, r0)
            if (r7 == 0) goto L_0x00e9
            boolean r2 = X.AnonymousClass25A.A0p(r7)
            if (r2 != 0) goto L_0x00e9
            r3.add(r7)
            goto L_0x00c5
        L_0x00e9:
            java.lang.StringBuilder r7 = X.AnonymousClass000.A10()
            java.lang.String r2 = "CrosspostSendUnsentStatusTask/getMessageFromMessageRowIds encountered empty or revoked message: "
            r7.append(r2)
            r7.append(r0)
            java.lang.String r2 = ", skipping and retrying the rest"
            X.C108995ce.A1O(r7, r2)
            X.00H r2 = r6.A04
            java.lang.Object r2 = r2.get()
            X.72Q r2 = (X.AnonymousClass72Q) r2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.util.List r1 = X.C18070vi.A0M(r0)
            r0 = 4
            r2.A06(r1, r0)
            goto L_0x00c5
        L_0x010f:
            X.C18070vi.A0b(r4)
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L_0x020c
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x020c
        L_0x011c:
            X.00H r0 = r6.A04
            java.lang.Object r7 = r0.get()
            X.72Q r7 = (X.AnonymousClass72Q) r7
            java.util.ArrayList r2 = X.C29351c6.A0D(r3)
            java.util.Iterator r1 = r3.iterator()
        L_0x012c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0136
            X.C108995ce.A1Q(r2, r1)
            goto L_0x012c
        L_0x0136:
            java.util.HashMap r9 = r7.A03(r2)
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            java.util.Iterator r8 = r3.iterator()
        L_0x0142:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x01a4
            X.206 r7 = X.C17880vN.A0Y(r8)
            long r0 = r7.A0x
            java.lang.Object r1 = X.C108965cb.A0n(r9, r0)
            X.6t0 r1 = (X.C135936t0) r1
            if (r1 != 0) goto L_0x0189
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            java.lang.String r2 = "CrosspostSendUnsentStatusTask/db entry not found for message id: "
        L_0x015c:
            X.AnonymousClass206.A06(r7, r2, r0)
            java.lang.String r0 = r0.toString()
            r1 = 0
            java.lang.StringBuilder r0 = X.AnonymousClass3MZ.A19(r0, r1)
            X.AnonymousClass206.A06(r7, r2, r0)
            java.lang.String r0 = r0.toString()
            X.C17960vV.A0F(r1, r0)
        L_0x0172:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            java.lang.String r1 = "CrosspostSendUnsentStatusTask/uniqueId validation failed for session: "
            java.lang.String r0 = X.AnonymousClass001.A1H(r1, r4, r0)
            r2 = 0
            X.C18070vi.A0d(r0, r2)
            java.lang.String r0 = X.C17900vP.A0A(r1, r4)
            X.C17960vV.A0F(r2, r0)
            goto L_0x0240
        L_0x0189:
            boolean r0 = r7 instanceof X.AnonymousClass210
            if (r0 == 0) goto L_0x019e
            java.lang.String r0 = r1.A04
            if (r0 == 0) goto L_0x0197
            int r0 = r0.length()
            if (r0 != 0) goto L_0x019e
        L_0x0197:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            java.lang.String r2 = "CrosspostSendUnsentStatusTask/text status empty media path: "
            goto L_0x015c
        L_0x019e:
            X.77S r0 = r1.A02
            r2.add(r0)
            goto L_0x0142
        L_0x01a4:
            int r1 = r2.size()
            int r0 = r3.size()
            if (r1 != r0) goto L_0x0172
            java.lang.Object r1 = r5.get()
            X.6p6 r1 = (X.AnonymousClass6p6) r1
            r0 = 0
            X.C18070vi.A0d(r4, r0)
            java.util.concurrent.ConcurrentHashMap r0 = r1.A01
            java.lang.Object r1 = r0.get(r4)
            X.6qp r1 = (X.C134586qp) r1
            if (r1 == 0) goto L_0x01c8
            int r0 = r1.A00
            int r0 = r0 + 1
            r1.A00 = r0
        L_0x01c8:
            java.lang.Object r7 = r5.get()
            X.6p6 r7 = (X.AnonymousClass6p6) r7
            X.11P r0 = r6.A00
            long r0 = X.AnonymousClass11P.A01(r0)
            java.util.concurrent.ConcurrentHashMap r7 = r7.A01
            java.lang.Object r7 = r7.get(r4)
            X.6qp r7 = (X.C134586qp) r7
            if (r7 == 0) goto L_0x01e0
            r7.A01 = r0
        L_0x01e0:
            X.00H r0 = r6.A01
            java.lang.Object r15 = r0.get()
            X.73A r15 = (X.AnonymousClass73A) r15
            r1 = 0
            java.lang.StringBuilder r9 = X.AnonymousClass000.A10()
            java.lang.String r0 = "XFamilyCrosspostRequestSessionManager/handleCrosspostRetry started for session: "
            r9.append(r0)
            r9.append(r4)
            java.lang.String r0 = " with messages: "
            r9.append(r0)
            java.util.ArrayList r8 = X.C29351c6.A0D(r3)
            java.util.Iterator r7 = r3.iterator()
        L_0x0202:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0296
            X.C108995ce.A1Q(r8, r7)
            goto L_0x0202
        L_0x020c:
            java.util.Iterator r11 = r3.iterator()
        L_0x0210:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x011c
            X.206 r9 = X.C17880vN.A0Y(r11)
            boolean r0 = X.AnonymousClass74B.A07(r9)
            java.lang.String r10 = "CrosspostSendUnsentStatusTask/message "
            if (r0 != 0) goto L_0x0273
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            X.AnonymousClass206.A06(r9, r10, r2)
            java.lang.String r0 = " invalid for retry due to incompatible type: "
            X.AnonymousClass206.A07(r9, r0, r2)
        L_0x022e:
            java.lang.String r0 = r2.toString()
            r2 = 0
            java.lang.StringBuilder r1 = X.AnonymousClass3MZ.A19(r0, r2)
            java.lang.String r0 = "CrosspostSendUnsentStatusTask/getEnforcedUniqueIdIfEligibleForRetry contains non retryable message in session: "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r4, r1)
            X.C18070vi.A0d(r0, r2)
        L_0x0240:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r12)
            r1.append(r4)
            java.lang.String r0 = " not eligible for retry, updating db"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            X.C18070vi.A0d(r0, r2)
            java.lang.Object r0 = r5.get()
            X.6p6 r0 = (X.AnonymousClass6p6) r0
            r0.A00(r4)
            X.00H r0 = r6.A04
            java.lang.Object r4 = r0.get()
            X.72Q r4 = (X.AnonymousClass72Q) r4
            java.util.ArrayList r2 = X.C29351c6.A0D(r3)
            java.util.Iterator r1 = r3.iterator()
        L_0x0269:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x02cb
            X.C108995ce.A1Q(r2, r1)
            goto L_0x0269
        L_0x0273:
            X.11P r0 = r6.A00
            long r0 = X.AnonymousClass3MZ.A05(r0, r9)
            long r7 = java.lang.Math.abs(r0)
            r1 = 10800000(0xa4cb80, double:5.335909E-317)
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0210
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            X.AnonymousClass206.A06(r9, r10, r2)
            java.lang.String r0 = " invalid for retry due to timestamp expiration: "
            r2.append(r0)
            long r0 = r9.A0I
            r2.append(r0)
            goto L_0x022e
        L_0x0296:
            java.lang.String r0 = X.C17890vO.A0V(r8, r9)
            X.C18070vi.A0d(r0, r1)
            X.00H r0 = r15.A0A
            java.lang.Object r0 = r0.get()
            X.6p6 r0 = (X.AnonymousClass6p6) r0
            r0.A00(r4)
            r16 = 0
            X.6QG r14 = new X.6QG
            r17 = r4
            r18 = r3
            r19 = r1
            r14.<init>(r15, r16, r17, r18, r19)
            X.7PN r8 = new X.7PN
            r8.<init>(r14, r15, r4)
            X.00H r0 = r15.A03
            java.lang.Object r7 = r0.get()
            X.6oD r7 = (X.C133126oD) r7
            r9 = r4
            r10 = r3
            r11 = r2
            r12 = r1
            r7.A00(r8, r9, r10, r11, r12)
            goto L_0x0074
        L_0x02cb:
            r0 = 4
            r4.A06(r2, r0)
            goto L_0x0074
        L_0x02d1:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6LM.A0G(java.lang.Object[]):java.lang.Object");
    }

    public AnonymousClass6LM(AnonymousClass11P r1, AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5) {
        this.A00 = r1;
        this.A01 = r2;
        this.A04 = r3;
        this.A02 = r4;
        this.A03 = r5;
    }
}
