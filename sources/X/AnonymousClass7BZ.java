package X;

/* renamed from: X.7BZ  reason: invalid class name */
public final class AnonymousClass7BZ implements AnonymousClass86O {
    public final C1406272g A00;
    public final AnonymousClass6ZF A01;
    public final AnonymousClass6ZG A02;
    public final C133546ox A03;
    public final String A04;
    public final AnonymousClass1OS A05;

    /* JADX WARNING: type inference failed for: r2v5, types: [java.lang.Object, X.6UF] */
    /* JADX WARNING: type inference failed for: r14v3, types: [X.6jt, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        X.C18070vi.A0d(r4, 1);
        r7 = X.C1406272g.A01(r12, r1);
        r9 = X.C1406272g.A00(r12, r1);
        r8 = "";
        r2 = java.text.BreakIterator.getCharacterInstance();
        r2.setText(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00d0, code lost:
        if (r2.last() > 0) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00d2, code lost:
        r8 = "Sessionless";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00d4, code lost:
        r5 = r12.A05;
        r3 = r9.A01;
        r2 = r9.A00;
        r20 = X.C18070vi.A0M(r7);
        X.C1406272g.A02(r12, r7);
        r15 = new X.C132756nV(r2, r3, r8, r5, r20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x004c, code lost:
        r14.A03 = X.C17880vN.A0n(r2);
        r2 = 25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0054, code lost:
        r14.A00 = java.lang.Integer.valueOf(r2);
        r12 = new X.C114065q6(r13, r14, X.AnonymousClass00R.A01, (java.lang.String) r10.invoke(r9, r8), 0.0f, r7.A00);
        r4 = r13.A03;
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0072, code lost:
        monitor-enter(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BKl(X.C1404171i r22, X.C140006zn r23) {
        /*
            r21 = this;
            r6 = 0
            r7 = r23
            java.util.Map r1 = r7.A04
            r2 = r22
            java.lang.String r0 = r2.A00
            java.lang.Object r0 = r1.get(r0)
            X.6fh r0 = (X.C128256fh) r0
            java.lang.Integer r0 = r0.A00
            int r0 = r0.intValue()
            r13 = r21
            if (r0 == r6) goto L_0x0120
            r5 = 1
            if (r0 == r5) goto L_0x00f0
            X.72g r1 = r13.A00
            X.1OS r10 = r13.A05
            java.lang.Object r9 = r2.A03
            java.lang.Object r8 = r2.A04
            java.lang.Object r2 = r10.invoke(r9, r8)
            X.C18070vi.A0d(r2, r6)
            java.util.Map r0 = r1.A06
            r0.get(r2)
            X.6ZG r2 = r13.A02
            X.84i r3 = r2.A00
            X.7Ba r3 = (X.C142847Ba) r3
            int r2 = r3.A00
            X.6jt r14 = new X.6jt
            r14.<init>()
            switch(r2) {
                case 0: goto L_0x00aa;
                case 1: goto L_0x0074;
                default: goto L_0x0040;
            }
        L_0x0040:
            java.lang.Object r3 = r3.A01
            X.6nf r3 = (X.C132836nf) r3
            X.1ch r2 = r3.A01
            java.lang.String r2 = r2.user
            r14.A05 = r2
            int r2 = r3.A00
        L_0x004c:
            java.lang.Long r2 = X.C17880vN.A0n(r2)
            r14.A03 = r2
            r2 = 25
        L_0x0054:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r14.A00 = r2
            java.lang.Object r4 = r10.invoke(r9, r8)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Integer r15 = X.AnonymousClass00R.A01
            long r2 = r7.A00
            r17 = 0
            X.5q6 r12 = new X.5q6
            r18 = r2
            r16 = r4
            r12.<init>(r13, r14, r15, r16, r17, r18)
            X.6ox r4 = r13.A03
            r14 = 0
            monitor-enter(r1)
            goto L_0x00b7
        L_0x0074:
            java.lang.Object r12 = r3.A01
            X.6iK r12 = (X.C129766iK) r12
            X.6B5 r11 = r12.A02
            X.2Dk r2 = r11.A06
            X.1ch r2 = r2.A0M()
            java.lang.String r2 = r2.user
            r14.A05 = r2
            int r2 = r11.A00
            long r4 = (long) r2
            r2 = 1
            java.lang.Long r2 = X.C17880vN.A0o(r4, r2)
            r14.A02 = r2
            java.lang.String r3 = r11.A03
            r14.A04 = r3
            int r2 = r12.A00
            java.lang.Long r2 = X.C17880vN.A0n(r2)
            r14.A03 = r2
            java.lang.String r2 = r11.A04
            r14.A06 = r2
            java.lang.Integer r2 = r11.A02
            r14.A01 = r2
            r2 = 27
            if (r3 == 0) goto L_0x0054
            r2 = 99
            goto L_0x0054
        L_0x00aa:
            java.lang.Object r3 = r3.A01
            X.6nd r3 = (X.C132816nd) r3
            X.1ch r2 = r3.A01
            java.lang.String r2 = r2.user
            r14.A05 = r2
            int r2 = r3.A00
            goto L_0x004c
        L_0x00b7:
            r2 = 1
            X.C18070vi.A0d(r4, r2)     // Catch:{ all -> 0x0213 }
            X.6UF r7 = X.C1406272g.A01(r12, r1)     // Catch:{ all -> 0x0213 }
            X.6dS r9 = X.C1406272g.A00(r12, r1)     // Catch:{ all -> 0x0213 }
            java.lang.String r8 = ""
            java.text.BreakIterator r2 = java.text.BreakIterator.getCharacterInstance()     // Catch:{ all -> 0x0213 }
            r2.setText(r8)     // Catch:{ all -> 0x0213 }
            int r2 = r2.last()     // Catch:{ all -> 0x0213 }
            if (r2 > 0) goto L_0x00d4
            java.lang.String r8 = "Sessionless"
        L_0x00d4:
            java.lang.String r5 = r12.A05     // Catch:{ all -> 0x0213 }
            X.6jt r3 = r9.A01     // Catch:{ all -> 0x0213 }
            X.6ZB r2 = r9.A00     // Catch:{ all -> 0x0213 }
            java.util.List r20 = X.C18070vi.A0M(r7)     // Catch:{ all -> 0x0213 }
            X.C1406272g.A02(r12, r7)     // Catch:{ all -> 0x0213 }
            X.6nV r15 = new X.6nV     // Catch:{ all -> 0x0213 }
            r17 = r3
            r18 = r8
            r19 = r5
            r16 = r2
            r15.<init>(r16, r17, r18, r19, r20)     // Catch:{ all -> 0x0213 }
            goto L_0x01bb
        L_0x00f0:
            float r17 = r7.A01(r2)
            X.72g r1 = r13.A00
            X.1OS r8 = r13.A05
            java.lang.Object r4 = r2.A03
            java.lang.Object r3 = r2.A04
            java.lang.Object r2 = r8.invoke(r4, r3)
            X.C18070vi.A0d(r2, r6)
            java.util.Map r0 = r1.A06
            r0.get(r2)
            r14 = 0
            java.lang.Object r4 = r8.invoke(r4, r3)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Integer r15 = X.AnonymousClass00R.A0C
            long r2 = r7.A00
            X.5q6 r12 = new X.5q6
            r18 = r2
            r16 = r4
            r12.<init>(r13, r14, r15, r16, r17, r18)
            X.6ox r4 = r13.A03
            monitor-enter(r1)
            goto L_0x0185
        L_0x0120:
            X.72g r1 = r13.A00
            X.1OS r5 = r13.A05
            java.lang.Object r4 = r2.A03
            java.lang.Object r3 = r2.A04
            java.lang.Object r2 = r5.invoke(r4, r3)
            X.C18070vi.A0d(r2, r6)
            java.util.Map r0 = r1.A06
            r0.get(r2)
            r14 = 0
            java.lang.Object r4 = r5.invoke(r4, r3)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Integer r15 = X.AnonymousClass00R.A00
            long r2 = r7.A00
            r17 = 0
            X.5q6 r12 = new X.5q6
            r18 = r2
            r16 = r4
            r12.<init>(r13, r14, r15, r16, r17, r18)
            X.6ox r4 = r13.A03
            monitor-enter(r1)
            r2 = 1
            X.C18070vi.A0d(r4, r2)     // Catch:{ all -> 0x0213 }
            X.6UF r7 = X.C1406272g.A01(r12, r1)     // Catch:{ all -> 0x0213 }
            X.6dS r9 = X.C1406272g.A00(r12, r1)     // Catch:{ all -> 0x0213 }
            java.lang.String r8 = ""
            java.text.BreakIterator r2 = java.text.BreakIterator.getCharacterInstance()     // Catch:{ all -> 0x0213 }
            r2.setText(r8)     // Catch:{ all -> 0x0213 }
            int r2 = r2.last()     // Catch:{ all -> 0x0213 }
            if (r2 > 0) goto L_0x016a
            java.lang.String r8 = "Sessionless"
        L_0x016a:
            java.lang.String r5 = r12.A05     // Catch:{ all -> 0x0213 }
            X.6jt r3 = r9.A01     // Catch:{ all -> 0x0213 }
            X.6ZB r2 = r9.A00     // Catch:{ all -> 0x0213 }
            java.util.List r20 = X.C18070vi.A0M(r7)     // Catch:{ all -> 0x0213 }
            X.C1406272g.A02(r12, r7)     // Catch:{ all -> 0x0213 }
            X.6nV r15 = new X.6nV     // Catch:{ all -> 0x0213 }
            r17 = r3
            r18 = r8
            r19 = r5
            r16 = r2
            r15.<init>(r16, r17, r18, r19, r20)     // Catch:{ all -> 0x0213 }
            goto L_0x01bb
        L_0x0185:
            X.C18070vi.A0d(r4, r5)     // Catch:{ all -> 0x0213 }
            X.6UF r7 = X.C1406272g.A01(r12, r1)     // Catch:{ all -> 0x0213 }
            X.6dS r9 = X.C1406272g.A00(r12, r1)     // Catch:{ all -> 0x0213 }
            java.lang.String r8 = ""
            java.text.BreakIterator r2 = java.text.BreakIterator.getCharacterInstance()     // Catch:{ all -> 0x0213 }
            r2.setText(r8)     // Catch:{ all -> 0x0213 }
            int r2 = r2.last()     // Catch:{ all -> 0x0213 }
            if (r2 > 0) goto L_0x01a1
            java.lang.String r8 = "Sessionless"
        L_0x01a1:
            java.lang.String r5 = r12.A05     // Catch:{ all -> 0x0213 }
            X.6jt r3 = r9.A01     // Catch:{ all -> 0x0213 }
            X.6ZB r2 = r9.A00     // Catch:{ all -> 0x0213 }
            java.util.List r20 = X.C18070vi.A0M(r7)     // Catch:{ all -> 0x0213 }
            X.C1406272g.A02(r12, r7)     // Catch:{ all -> 0x0213 }
            X.6nV r15 = new X.6nV     // Catch:{ all -> 0x0213 }
            r17 = r3
            r18 = r8
            r19 = r5
            r16 = r2
            r15.<init>(r16, r17, r18, r19, r20)     // Catch:{ all -> 0x0213 }
        L_0x01bb:
            java.lang.String r9 = r12.A05     // Catch:{ all -> 0x0213 }
            X.7BZ r2 = r12.A02     // Catch:{ all -> 0x0213 }
            java.lang.String r10 = r2.A04     // Catch:{ all -> 0x0213 }
            java.util.HashMap r8 = r1.A03     // Catch:{ all -> 0x0213 }
            boolean r2 = r8.containsKey(r9)     // Catch:{ all -> 0x0213 }
            if (r2 != 0) goto L_0x01cc
            r8.put(r9, r10)     // Catch:{ all -> 0x0213 }
        L_0x01cc:
            boolean r2 = X.C1406272g.A02(r12, r7)     // Catch:{ all -> 0x0213 }
            if (r2 == 0) goto L_0x0206
            r8.get(r9)     // Catch:{ all -> 0x0213 }
            r4.A00(r15, r14)     // Catch:{ all -> 0x0213 }
            java.util.Map r10 = r1.A08     // Catch:{ all -> 0x0213 }
            X.6ps r7 = X.AnonymousClass73T.A00(r9)     // Catch:{ all -> 0x0213 }
            X.6ps r3 = X.AnonymousClass73T.A00(r9)     // Catch:{ all -> 0x0213 }
            X.6UF r2 = new X.6UF     // Catch:{ all -> 0x0213 }
            r2.<init>()     // Catch:{ all -> 0x0213 }
            r2.A01 = r7     // Catch:{ all -> 0x0213 }
            r2.A00 = r3     // Catch:{ all -> 0x0213 }
            r10.put(r9, r2)     // Catch:{ all -> 0x0213 }
            r0.remove(r9)     // Catch:{ all -> 0x0213 }
            java.util.Map r0 = r1.A07     // Catch:{ all -> 0x0213 }
            r0.remove(r9)     // Catch:{ all -> 0x0213 }
            java.util.Map r0 = r1.A04     // Catch:{ all -> 0x0213 }
            r0.remove(r9)     // Catch:{ all -> 0x0213 }
        L_0x01fb:
            r8.get(r5)     // Catch:{ all -> 0x0213 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)     // Catch:{ all -> 0x0213 }
            r4.A00(r15, r0)     // Catch:{ all -> 0x0213 }
            goto L_0x0211
        L_0x0206:
            java.util.Map r2 = r1.A08     // Catch:{ all -> 0x0213 }
            r2.put(r9, r7)     // Catch:{ all -> 0x0213 }
            if (r3 == 0) goto L_0x01fb
            r0.put(r9, r3)     // Catch:{ all -> 0x0213 }
            goto L_0x01fb
        L_0x0211:
            monitor-exit(r1)
            return
        L_0x0213:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7BZ.BKl(X.71i, X.6zn):void");
    }

    public AnonymousClass7BZ(AnonymousClass6ZF r5, AnonymousClass6ZG r6, C129146hK r7, String str, AnonymousClass1OS r9) {
        C1406272g r3 = r7.A00;
        C133546ox r0 = new C133546ox(r7.A01, r7.A02);
        this.A04 = str;
        this.A00 = r3;
        this.A02 = r6;
        this.A01 = r5;
        this.A03 = r0;
        this.A05 = r9;
    }
}
