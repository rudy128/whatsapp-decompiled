package X;

/* renamed from: X.0N0  reason: invalid class name */
public final class AnonymousClass0N0 {
    public boolean A00;
    public final C06970a9 A01 = C06970a9.A02(new AnonymousClass09G[16]);
    public final C06970a9 A02 = C06970a9.A02(new AnonymousClass0OJ[16]);
    public final C06970a9 A03 = C06970a9.A02(new AnonymousClass0XV[16]);
    public final C06970a9 A04 = C06970a9.A02(new AnonymousClass0OJ[16]);
    public final C17140to A05;

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0097 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x008d A[EDGE_INSN: B:51:0x008d->B:40:0x008d ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0015  */
    public static final void A00(X.AnonymousClass0XW r8, X.AnonymousClass0OJ r9, java.util.Set r10) {
        /*
            X.0XW r7 = r8.A03
            boolean r0 = r7.A07
            if (r0 == 0) goto L_0x0098
            X.0a9 r6 = X.C06970a9.A01()
            X.0XW r0 = r7.A02
            if (r0 == 0) goto L_0x0092
            r6.A0F(r0)
        L_0x0011:
            int r0 = r6.A00
            if (r0 == 0) goto L_0x0097
            r5 = 1
            X.0XW r7 = X.C06970a9.A03(r6, r0)
            int r0 = r7.A00
            r0 = r0 & 32
            if (r0 == 0) goto L_0x0092
            r4 = r7
        L_0x0021:
            int r0 = r4.A01
            r0 = r0 & 32
            if (r0 == 0) goto L_0x008d
            r3 = 0
            r8 = r4
        L_0x0029:
            boolean r0 = r8 instanceof X.C17540up
            if (r0 == 0) goto L_0x0057
            X.0up r8 = (X.C17540up) r8
            boolean r0 = r8 instanceof X.AnonymousClass09G
            if (r0 == 0) goto L_0x004a
            r0 = r8
            X.09G r0 = (X.AnonymousClass09G) r0
            X.0ug r0 = r0.A00
            boolean r0 = r0 instanceof X.C17410uc
            if (r0 == 0) goto L_0x004a
            r0 = r8
            X.09G r0 = (X.AnonymousClass09G) r0
            java.util.HashSet r0 = r0.A02
            boolean r0 = r0.contains(r9)
            if (r0 == 0) goto L_0x004a
            r10.add(r8)
        L_0x004a:
            X.0Cq r0 = r8.BXh()
            boolean r0 = r0.A01(r9)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0086
            goto L_0x0011
        L_0x0057:
            int r0 = r8.A01
            r0 = r0 & 32
            if (r0 == 0) goto L_0x0086
            boolean r0 = r8 instanceof X.C014308l
            if (r0 == 0) goto L_0x0086
            r0 = r8
            X.08l r0 = (X.C014308l) r0
            X.0XW r2 = r0.A00
            r1 = 0
        L_0x0067:
            if (r2 == 0) goto L_0x0083
            int r0 = r2.A01
            r0 = r0 & 32
            if (r0 == 0) goto L_0x0074
            int r1 = r1 + 1
            if (r1 != r5) goto L_0x0077
            r8 = r2
        L_0x0074:
            X.0XW r2 = r2.A02
            goto L_0x0067
        L_0x0077:
            X.0a9 r3 = X.AnonymousClass001.A10(r3)
            X.0XW r8 = X.AnonymousClass000.A0d(r3, r8)
            r3.A0F(r2)
            goto L_0x0074
        L_0x0083:
            if (r1 != r5) goto L_0x0086
            goto L_0x008a
        L_0x0086:
            X.0XW r8 = X.AnonymousClass0QV.A00(r3)
        L_0x008a:
            if (r8 == 0) goto L_0x008d
            goto L_0x0029
        L_0x008d:
            X.0XW r4 = r4.A02
            if (r4 == 0) goto L_0x0092
            goto L_0x0021
        L_0x0092:
            X.AnonymousClass0QV.A06(r6, r7)
            goto L_0x0011
        L_0x0097:
            return
        L_0x0098:
            java.lang.String r0 = "visitSubtreeIf called on an unattached node"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0N0.A00(X.0XW, X.0OJ, java.util.Set):void");
    }

    public final void A01() {
        if (!this.A00) {
            this.A00 = true;
            this.A05.CE2(new C08220ek(this));
        }
    }

    public AnonymousClass0N0(C17140to r3) {
        this.A05 = r3;
    }
}
