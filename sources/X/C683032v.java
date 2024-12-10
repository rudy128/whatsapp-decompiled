package X;

import java.util.Set;

/* renamed from: X.32v  reason: invalid class name and case insensitive filesystem */
public final class C683032v implements C25341Nv {
    public final AnonymousClass1Cd A00;
    public final C18030ve A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;

    public Set BZv() {
        return C18070vi.A0P(AnonymousClass7LF.class);
    }

    public boolean Bca(AnonymousClass206 r4) {
        return C18020vd.A05(C18040vf.A02, this.A01, 8783);
    }

    public C683032v(AnonymousClass1Cd r1, C18030ve r2, AnonymousClass00H r3, AnonymousClass00H r4) {
        C18070vi.A0s(r2, r3, r1, r4);
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0067, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006f, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0072, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bhl(X.AnonymousClass25F r8) {
        /*
            r7 = this;
            X.206 r5 = X.C18070vi.A08(r8)
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            X.1Cd r0 = r7.A00
            X.1at r3 = r0.get()
            X.00H r0 = r7.A03     // Catch:{ all -> 0x006c }
            java.lang.Object r6 = r0.get()     // Catch:{ all -> 0x006c }
            X.1RU r6 = (X.AnonymousClass1RU) r6     // Catch:{ all -> 0x006c }
            X.C18070vi.A0b(r3)     // Catch:{ all -> 0x006c }
            long r0 = r5.A0x     // Catch:{ all -> 0x006c }
            X.6RT r2 = X.AnonymousClass6RT.FUTURE     // Catch:{ all -> 0x006c }
            android.database.Cursor r2 = r6.BMu(r3, r2, r0)     // Catch:{ all -> 0x006c }
            r0 = -1
            r2.moveToPosition(r0)     // Catch:{ all -> 0x0065 }
            boolean r0 = r2.isBeforeFirst()     // Catch:{ all -> 0x0065 }
            if (r0 == 0) goto L_0x0032
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x0065 }
            if (r0 != 0) goto L_0x0032
            goto L_0x0050
        L_0x0032:
            boolean r0 = r2.isAfterLast()     // Catch:{ all -> 0x0065 }
            if (r0 == 0) goto L_0x0039
            goto L_0x0050
        L_0x0039:
            X.00H r0 = r7.A02     // Catch:{ all -> 0x0065 }
            X.206 r1 = X.AnonymousClass1W6.A00(r2, r0)     // Catch:{ all -> 0x0065 }
            boolean r0 = r1 instanceof X.AnonymousClass23U     // Catch:{ all -> 0x0065 }
            if (r0 == 0) goto L_0x004a
            X.23U r1 = (X.AnonymousClass23U) r1     // Catch:{ all -> 0x0065 }
            if (r1 == 0) goto L_0x004a
            r4.add(r1)     // Catch:{ all -> 0x0065 }
        L_0x004a:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0065 }
            if (r0 != 0) goto L_0x0039
        L_0x0050:
            r2.close()     // Catch:{ all -> 0x006c }
            r3.close()
            java.lang.Class<X.7LF> r0 = X.AnonymousClass7LF.class
            X.25F r1 = X.C18070vi.A09(r5, r0)
            X.7LF r0 = new X.7LF
            r0.<init>(r4)
            r1.A02(r0)
            return
        L_0x0065:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0067 }
        L_0x0067:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x006c }
            throw r0     // Catch:{ all -> 0x006c }
        L_0x006c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x006e }
        L_0x006e:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C683032v.Bhl(X.25F):void");
    }
}
