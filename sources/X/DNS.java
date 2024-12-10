package X;

public abstract class DNS implements E87 {
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c4, code lost:
        if (r12.A0C().equals(r5) == false) goto L_0x00c6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.DFL BCM(X.E9O r17, X.DFL r18) {
        /*
            r16 = this;
            r12 = r18
            r6 = r16
            boolean r0 = r6 instanceof X.C23713BoK
            if (r0 == 0) goto L_0x0083
            X.BoK r6 = (X.C23713BoK) r6
            r9 = 0
            r8 = 0
            r7 = r12
        L_0x000d:
            java.util.List r1 = r6.A00
            int r0 = r1.size()
            if (r8 >= r0) goto L_0x007d
            java.lang.Object r5 = r1.get(r8)
            android.util.Pair r5 = (android.util.Pair) r5
            java.lang.Object r0 = r5.first
            X.E6I r0 = (X.E6I) r0
            boolean r0 = r0.CP3(r7)
            if (r0 == 0) goto L_0x0073
            if (r9 != 0) goto L_0x002b
            java.util.ArrayList r9 = X.AnonymousClass000.A13()
        L_0x002b:
            r9.add(r5)
            java.lang.Object r1 = r5.second
            X.C5s r1 = (X.C24477C5s) r1
            boolean r0 = r1 instanceof X.C23734Bof
            if (r0 == 0) goto L_0x0066
            X.Bof r1 = (X.C23734Bof) r1
            int r0 = r1.A00
            java.lang.Object r10 = r1.A01
            java.lang.Object r11 = X.DFL.A00(r7, r0)
            if (r11 == r10) goto L_0x0073
            boolean r0 = r10 instanceof java.lang.Number
            if (r0 == 0) goto L_0x0076
            boolean r0 = r11 instanceof java.lang.Number
            if (r0 == 0) goto L_0x0066
            java.lang.Number r11 = (java.lang.Number) r11
            long r3 = r11.longValue()
            java.lang.Number r10 = (java.lang.Number) r10
            long r1 = r10.longValue()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0066
            double r3 = r11.doubleValue()
            double r1 = r10.doubleValue()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
        L_0x0064:
            if (r0 == 0) goto L_0x0073
        L_0x0066:
            if (r7 != r12) goto L_0x006c
            X.DFL r7 = r12.A08()
        L_0x006c:
            java.lang.Object r0 = r5.second
            X.C5s r0 = (X.C24477C5s) r0
            r0.A00(r7)
        L_0x0073:
            int r8 = r8 + 1
            goto L_0x000d
        L_0x0076:
            boolean r0 = X.C25337Cdw.A00(r11, r10)
            r0 = r0 ^ 1
            goto L_0x0064
        L_0x007d:
            if (r9 == 0) goto L_0x0082
            r1.removeAll(r9)
        L_0x0082:
            return r7
        L_0x0083:
            boolean r0 = r6 instanceof X.C23715BoM
            if (r0 == 0) goto L_0x00b1
            X.BoM r6 = (X.C23715BoM) r6
            int r0 = r6.A00
            if (r0 == 0) goto L_0x00a2
            java.lang.Object r14 = r6.A02
            java.util.List r14 = (java.util.List) r14
            java.util.concurrent.atomic.AtomicInteger r0 = X.CFq.A00
            int r15 = r0.incrementAndGet()
            r13 = 0
            X.E9O r10 = r12.A01
            X.CBw r11 = r12.A02
            X.DFL r9 = new X.DFL
            r9.<init>(r10, r11, r12, r13, r14, r15)
            return r9
        L_0x00a2:
            X.CBw r1 = r12.A02
            java.lang.Object r0 = r6.A02
            X.CBw r0 = (X.CBw) r0
            if (r1 == r0) goto L_0x00b0
            X.DFL r12 = r12.A08()
            r12.A02 = r0
        L_0x00b0:
            return r12
        L_0x00b1:
            X.BoL r6 = (X.C23714BoL) r6
            java.lang.String r5 = r6.A02
            java.lang.String r0 = r12.A0C()
            if (r0 == 0) goto L_0x00c6
            java.lang.String r0 = r12.A0C()
            boolean r1 = r0.equals(r5)
            r0 = 1
            if (r1 != 0) goto L_0x00c7
        L_0x00c6:
            r0 = 0
        L_0x00c7:
            java.lang.String r4 = "Multiple components with the same id found during reflow"
            if (r0 == 0) goto L_0x00d1
            X.DFL r0 = r6.A00
            if (r0 != 0) goto L_0x010b
            r6.A00 = r12
        L_0x00d1:
            java.util.LinkedList r0 = r12.A09
            if (r0 == 0) goto L_0x010a
            java.util.Iterator r3 = r0.iterator()
        L_0x00d9:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x010a
            java.lang.Object r1 = r3.next()
            X.CiE r1 = (X.C25574CiE) r1
            java.lang.String r0 = r1.A03
            if (r0 == 0) goto L_0x00f5
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x00f5
            X.DFL r0 = r6.A00
            if (r0 != 0) goto L_0x0105
            r6.A00 = r12
        L_0x00f5:
            X.DFL r0 = r6.A00
            if (r0 == 0) goto L_0x00d9
            X.E8A r2 = r1.A01
            if (r2 == 0) goto L_0x00d9
            X.Cph r1 = r6.A01
            X.9zJ r0 = X.C199029zJ.A01
            r1.A02(r0, r2)
            goto L_0x00d9
        L_0x0105:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r4)
            throw r0
        L_0x010a:
            return r12
        L_0x010b:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DNS.BCM(X.E9O, X.DFL):X.DFL");
    }
}
