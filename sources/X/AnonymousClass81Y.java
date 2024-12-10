package X;

/* renamed from: X.81Y  reason: invalid class name */
public final class AnonymousClass81Y extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C1424179j this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass81Y(C1424179j r2) {
        super(1);
        this.this$0 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003f, code lost:
        if (r8.A0B != false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004e, code lost:
        if (r8.A0B != true) goto L_0x0050;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r10) {
        /*
            r9 = this;
            X.79j r6 = r9.this$0
            X.70D r5 = r6.A0F
            java.util.Set r4 = r5.A01()
            int r7 = r4.size()
            X.02B r0 = r6.A0B
            X.C1424179j.A01(r0, r6, r7)
            java.lang.Object r8 = X.C29431cG.A0Y(r4)
            X.2Dk r8 = (X.C46162Dk) r8
            android.view.MenuItem r1 = r6.A04
            r3 = 0
            r2 = 1
            if (r1 == 0) goto L_0x0024
            boolean r0 = X.AnonymousClass000.A1T(r7, r2)
            r1.setVisible(r0)
        L_0x0024:
            android.view.MenuItem r1 = r6.A07
            if (r1 == 0) goto L_0x002f
            boolean r0 = X.AnonymousClass000.A1T(r7, r2)
            r1.setVisible(r0)
        L_0x002f:
            android.view.MenuItem r0 = r6.A00
            if (r0 == 0) goto L_0x0036
            r0.setVisible(r3)
        L_0x0036:
            android.view.MenuItem r7 = r6.A03
            if (r7 == 0) goto L_0x0045
            if (r8 == 0) goto L_0x0041
            boolean r1 = r8.A0B
            r0 = 1
            if (r1 == 0) goto L_0x0042
        L_0x0041:
            r0 = 0
        L_0x0042:
            r7.setVisible(r0)
        L_0x0045:
            android.view.MenuItem r7 = r6.A09
            if (r7 == 0) goto L_0x0054
            if (r8 == 0) goto L_0x0050
            boolean r1 = r8.A0B
            r0 = 1
            if (r1 == r2) goto L_0x0051
        L_0x0050:
            r0 = 0
        L_0x0051:
            r7.setVisible(r0)
        L_0x0054:
            android.view.MenuItem r8 = r6.A05
            if (r8 == 0) goto L_0x0076
            java.lang.Object r1 = r5.A08
            monitor-enter(r1)
            java.util.Set r0 = r5.A0D     // Catch:{ all -> 0x00a2 }
            java.util.Set r7 = X.C29431cG.A12(r0)     // Catch:{ all -> 0x00a2 }
            monitor-exit(r1)
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0073
            boolean r0 = r4 instanceof java.util.Collection
            if (r0 == 0) goto L_0x007e
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x007e
        L_0x0072:
            r2 = 0
        L_0x0073:
            r8.setVisible(r2)
        L_0x0076:
            android.view.MenuItem r7 = r6.A0A
            if (r7 == 0) goto L_0x00bc
            java.lang.Object r1 = r5.A08
            monitor-enter(r1)
            goto L_0x009b
        L_0x007e:
            java.util.Iterator r1 = r4.iterator()
        L_0x0082:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0072
            java.lang.Object r0 = r1.next()
            X.1ci r0 = (X.C29691ci) r0
            X.1BI r0 = r0.A08()
            boolean r0 = r7.contains(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0082
            goto L_0x0073
        L_0x009b:
            java.util.Set r0 = r5.A0D     // Catch:{ all -> 0x00a2 }
            java.util.Set r5 = X.C29431cG.A12(r0)     // Catch:{ all -> 0x00a2 }
            goto L_0x00a5
        L_0x00a2:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x00a5:
            monitor-exit(r1)
            boolean r0 = r5.isEmpty()
            r2 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x015f
            boolean r0 = r4 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0143
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0143
        L_0x00b9:
            r7.setVisible(r2)
        L_0x00bc:
            android.view.MenuItem r2 = r6.A01
            if (r2 == 0) goto L_0x00ce
            boolean r0 = r4 instanceof java.util.Collection
            if (r0 == 0) goto L_0x012d
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x012d
        L_0x00ca:
            r0 = 0
        L_0x00cb:
            r2.setVisible(r0)
        L_0x00ce:
            android.view.MenuItem r2 = r6.A02
            if (r2 == 0) goto L_0x00e0
            boolean r0 = r4 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0117
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0117
        L_0x00dc:
            r0 = 1
        L_0x00dd:
            r2.setVisible(r0)
        L_0x00e0:
            android.view.MenuItem r1 = r6.A06
            if (r1 == 0) goto L_0x00eb
            boolean r0 = r6.A0E
            r0 = r0 ^ 1
            r1.setVisible(r0)
        L_0x00eb:
            android.view.MenuItem r2 = r6.A08
            if (r2 == 0) goto L_0x00fd
            boolean r0 = r4 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0100
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0100
        L_0x00f9:
            r3 = 1
        L_0x00fa:
            r2.setVisible(r3)
        L_0x00fd:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0100:
            java.util.Iterator r1 = r4.iterator()
        L_0x0104:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00f9
            java.lang.Object r0 = r1.next()
            X.2Dk r0 = (X.C46162Dk) r0
            boolean r0 = r0.A0P()
            if (r0 == 0) goto L_0x0104
            goto L_0x00fa
        L_0x0117:
            java.util.Iterator r1 = r4.iterator()
        L_0x011b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00dc
            java.lang.Object r0 = r1.next()
            X.1ci r0 = (X.C29691ci) r0
            int r0 = r0.A0A
            if (r0 == 0) goto L_0x011b
            r0 = 0
            goto L_0x00dd
        L_0x012d:
            java.util.Iterator r1 = r4.iterator()
        L_0x0131:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00ca
            java.lang.Object r0 = r1.next()
            X.1ci r0 = (X.C29691ci) r0
            int r0 = r0.A0A
            if (r0 == 0) goto L_0x0131
            r0 = 1
            goto L_0x00cb
        L_0x0143:
            java.util.Iterator r1 = r4.iterator()
        L_0x0147:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00b9
            java.lang.Object r0 = r1.next()
            X.1ci r0 = (X.C29691ci) r0
            X.1BI r0 = r0.A08()
            boolean r0 = r5.contains(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0147
        L_0x015f:
            r2 = 0
            goto L_0x00b9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass81Y.invoke(java.lang.Object):java.lang.Object");
    }
}
