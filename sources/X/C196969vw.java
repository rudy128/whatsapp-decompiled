package X;

/* renamed from: X.9vw  reason: invalid class name and case insensitive filesystem */
public final class C196969vw {
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0055, code lost:
        if (r2 == false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0072, code lost:
        if (r2 != false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0079, code lost:
        if (r2 != false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00dd, code lost:
        if (r2 == false) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00f7, code lost:
        if (r2 != false) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00fe, code lost:
        if (r2 != false) goto L_0x00df;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x005d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x00e4 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C187039fA A00(X.C198249y2 r8, X.C188729ht r9, X.C196969vw r10, X.AnonymousClass5YR r11, boolean r12) {
        /*
            java.lang.Integer r7 = r8.A00
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            if (r7 == r0) goto L_0x015d
            java.util.ArrayList r5 = r8.A02
            java.util.Iterator r6 = r5.iterator()
        L_0x000c:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00b2
            java.lang.Object r3 = r6.next()
            X.9dz r3 = (X.C186309dz) r3
            r0 = 2
            X.C18070vi.A0d(r3, r0)
            X.9e1 r2 = r9.A03
            X.9ZE r0 = r3.A00
            java.lang.String r1 = r0.A00
            java.util.Map r0 = r2.A02
            java.lang.Object r0 = r0.get(r1)
            X.0vp r0 = (X.C18140vp) r0
            if (r0 == 0) goto L_0x007f
            java.lang.Object r1 = X.AnonymousClass8BS.A0a(r0)
            X.B9s r1 = (X.C22486B9s) r1
            X.9ZH r0 = new X.9ZH
            r0.<init>(r1)
        L_0x0037:
            X.B9q r1 = r9.A09
            r4 = 0
            X.C18070vi.A0d(r11, r4)
            X.B9s r0 = r0.A00
            boolean r0 = r0.BCL(r3, r1, r11)
            if (r0 != 0) goto L_0x00aa
            X.1IX r1 = X.AnonymousClass1IX.of(r3)
            r0 = 0
            X.9fA r2 = new X.9fA
            r2.<init>(r1, r0, r4, r12)
        L_0x004f:
            boolean r2 = r2.A03
            java.lang.Integer r1 = X.AnonymousClass00R.A00
            if (r7 != r1) goto L_0x006e
            if (r2 != 0) goto L_0x007c
        L_0x0057:
            java.lang.Integer r1 = X.AnonymousClass00R.A01
        L_0x0059:
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r1 == r0) goto L_0x000c
            int r2 = r1.intValue()
            r1 = 1
            r0 = 0
            if (r2 == r0) goto L_0x011a
            if (r2 == r1) goto L_0x0151
            java.lang.String r0 = "No boolean equivalent for UNSET"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x006e:
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r7 != r0) goto L_0x0075
            if (r2 == 0) goto L_0x007c
            goto L_0x0059
        L_0x0075:
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r7 != r0) goto L_0x007c
            if (r2 == 0) goto L_0x007c
            goto L_0x0057
        L_0x007c:
            java.lang.Integer r1 = X.AnonymousClass00R.A0C
            goto L_0x0059
        L_0x007f:
            java.lang.String r0 = "seconds_since_last_impression"
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0098
            X.A6F r1 = r2.A01
            X.11P r0 = r2.A00
            X.Ai2 r2 = new X.Ai2
            r2.<init>(r0, r1)
        L_0x0090:
            X.B9s r2 = (X.C22486B9s) r2
            X.9ZH r0 = new X.9ZH
            r0.<init>(r2)
            goto L_0x0037
        L_0x0098:
            java.lang.String r0 = "other_promotion_event"
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x00aa
            X.A6F r1 = r2.A01
            X.11P r0 = r2.A00
            X.Ai1 r2 = new X.Ai1
            r2.<init>(r0, r1)
            goto L_0x0090
        L_0x00aa:
            r1 = 0
            r0 = 1
            X.9fA r2 = new X.9fA
            r2.<init>(r1, r1, r0, r12)
            goto L_0x004f
        L_0x00b2:
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            java.util.ArrayList r0 = r8.A01
            java.util.Iterator r8 = r0.iterator()
        L_0x00bc:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0107
            java.lang.Object r0 = r8.next()
            X.9y2 r0 = (X.C198249y2) r0
            X.9fA r6 = A00(r0, r9, r10, r11, r12)
            java.lang.Integer r3 = X.AnonymousClass00R.A01
            if (r7 != r3) goto L_0x00d7
            boolean r0 = r6.A03
            if (r0 != 0) goto L_0x00d7
            r4.add(r6)
        L_0x00d7:
            boolean r2 = r6.A03
            java.lang.Integer r1 = X.AnonymousClass00R.A00
            if (r7 != r1) goto L_0x00f5
            if (r2 != 0) goto L_0x0101
        L_0x00df:
            r1 = r3
        L_0x00e0:
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r1 == r0) goto L_0x00bc
            int r2 = r1.intValue()
            r1 = 1
            r0 = 0
            if (r2 == r0) goto L_0x011a
            if (r2 == r1) goto L_0x0104
            java.lang.String r0 = "No boolean equivalent for UNSET"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x00f5:
            if (r7 != r3) goto L_0x00fa
            if (r2 == 0) goto L_0x0101
            goto L_0x00e0
        L_0x00fa:
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r7 != r0) goto L_0x0101
            if (r2 == 0) goto L_0x0101
            goto L_0x00df
        L_0x0101:
            java.lang.Integer r1 = X.AnonymousClass00R.A0C
            goto L_0x00e0
        L_0x0104:
            X.1IX r3 = r6.A00
            goto L_0x0155
        L_0x0107:
            int r1 = r7.intValue()
            r0 = 1
            if (r1 == r0) goto L_0x0122
            r0 = 2
            if (r1 == r0) goto L_0x011a
            r0 = 0
            if (r1 == r0) goto L_0x011a
            X.9Ky r0 = new X.9Ky
            r0.<init>()
            throw r0
        L_0x011a:
            r1 = 0
            r0 = 1
            X.9fA r2 = new X.9fA
            r2.<init>(r1, r1, r0, r12)
            return r2
        L_0x0122:
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x014c
            X.2AI r2 = X.AnonymousClass1IX.builder()
            java.util.Iterator r1 = r4.iterator()
        L_0x0130:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0144
            java.lang.Object r0 = r1.next()
            X.9fA r0 = (X.C187039fA) r0
            X.1IX r0 = r0.A00
            if (r0 == 0) goto L_0x0130
            r2.addAll(r0)
            goto L_0x0130
        L_0x0144:
            X.1IX r3 = r2.build()
            X.C18070vi.A0X(r3)
            goto L_0x0155
        L_0x014c:
            X.1IX r3 = X.AnonymousClass1IX.copyOf((java.util.Collection) r5)
            goto L_0x0155
        L_0x0151:
            X.1IX r3 = X.AnonymousClass1IX.of(r3)
        L_0x0155:
            r1 = 0
            r0 = 0
            X.9fA r2 = new X.9fA
            r2.<init>(r3, r0, r1, r12)
            return r2
        L_0x015d:
            X.9Ky r0 = new X.9Ky
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196969vw.A00(X.9y2, X.9ht, X.9vw, X.5YR, boolean):X.9fA");
    }
}
