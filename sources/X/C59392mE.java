package X;

import com.whatsapp.util.Log;

/* renamed from: X.2mE  reason: invalid class name and case insensitive filesystem */
public final class C59392mE {
    public final AnonymousClass00H A00;
    public final AnonymousClass190 A01;
    public final C32601hS A02;

    public final AnonymousClass205 A01(AnonymousClass205 r3) {
        AnonymousClass206 A012;
        if (r3 == null || ((A012 = AnonymousClass1W2.A01(r3, this.A00)) == null && (A012 = A00(r3)) == null)) {
            return null;
        }
        return A012.A0v;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0052, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0053, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0056, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass206 A00(X.AnonymousClass205 r9) {
        /*
            r8 = this;
            X.1hS r7 = r8.A02
            X.1BI r6 = r9.A00
            if (r6 != 0) goto L_0x000b
            r2 = 0
        L_0x0007:
            r1 = 0
            if (r2 == 0) goto L_0x005a
            goto L_0x0040
        L_0x000b:
            X.1Cd r0 = r7.A01
            X.1at r5 = r0.get()
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x005b }
            X.1Ev r4 = r0.A02     // Catch:{ all -> 0x005b }
            java.lang.String r3 = X.C50732Vo.A00     // Catch:{ all -> 0x005b }
            r0 = 3
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x005b }
            java.lang.String r1 = r9.A01     // Catch:{ all -> 0x005b }
            r0 = 0
            r2[r0] = r1     // Catch:{ all -> 0x005b }
            X.1LW r0 = r7.A00     // Catch:{ all -> 0x005b }
            long r0 = r0.A09(r6)     // Catch:{ all -> 0x005b }
            X.C17890vO.A1K(r2, r0)     // Catch:{ all -> 0x005b }
            boolean r0 = r9.A02     // Catch:{ all -> 0x005b }
            if (r0 == 0) goto L_0x0039
            java.lang.String r1 = "1"
        L_0x002f:
            r0 = 2
            r2[r0] = r1     // Catch:{ all -> 0x005b }
            java.lang.String r0 = "SELECT_LAST_EDIT_MESSAGE_BY_MESSAGE_KEY"
            android.database.Cursor r2 = r4.A0A(r3, r0, r2)     // Catch:{ all -> 0x005b }
            goto L_0x003c
        L_0x0039:
            java.lang.String r1 = "0"
            goto L_0x002f
        L_0x003c:
            r5.close()
            goto L_0x0007
        L_0x0040:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0050 }
            if (r0 == 0) goto L_0x0057
            X.00H r0 = r8.A00     // Catch:{ all -> 0x0050 }
            X.206 r0 = X.AnonymousClass1W6.A00(r2, r0)     // Catch:{ all -> 0x0050 }
            r2.close()
            return r0
        L_0x0050:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0052 }
        L_0x0052:
            r0 = move-exception
            X.CDX.A00(r2, r1)
            throw r0
        L_0x0057:
            r2.close()
        L_0x005a:
            return r1
        L_0x005b:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x0060 }
            throw r1
        L_0x0060:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59392mE.A00(X.205):X.206");
    }

    public final AnonymousClass205 A02(AnonymousClass205 r5) {
        AnonymousClass206 A012 = AnonymousClass1W2.A01(r5, this.A00);
        if (A012 == null) {
            return null;
        }
        if (!A012.A11(131072)) {
            return r5;
        }
        C691536c A002 = C60492o7.A00(A012);
        if (A002 == null) {
            this.A02.A00(A012);
            if (C60492o7.A00(A012) == null) {
                Log.e("ReferentialKeyUtil/getOriginalKey/editInfo is null for an edited message");
                this.A01.A0G("ReferentialKeyUtil/getOriginalKey/editInfo is null for an edited message", (String) null, true);
                return null;
            }
            A002 = C60492o7.A00(A012);
            if (A002 == null) {
                return null;
            }
        }
        return A002.A02;
    }

    public C59392mE(AnonymousClass190 r1, C32601hS r2, AnonymousClass00H r3) {
        C18070vi.A0o(r1, r3, r2);
        this.A01 = r1;
        this.A00 = r3;
        this.A02 = r2;
    }
}
