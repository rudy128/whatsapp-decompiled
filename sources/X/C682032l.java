package X;

import java.util.Set;

/* renamed from: X.32l  reason: invalid class name and case insensitive filesystem */
public final class C682032l implements C25341Nv {
    public final AnonymousClass00H A00;

    public C682032l(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public boolean Bca(AnonymousClass206 r3) {
        C18070vi.A0d(r3, 0);
        return r3.A11(4194304);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0049, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0050, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0054, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bhl(X.AnonymousClass25F r7) {
        /*
            r6 = this;
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            X.206 r5 = r7.A00
            r0 = 4194304(0x400000, double:2.0722615E-317)
            boolean r0 = r5.A11(r0)
            if (r0 == 0) goto L_0x0058
            X.00H r0 = r6.A00
            java.lang.Object r0 = r0.get()
            X.1N4 r0 = (X.AnonymousClass1N4) r0
            X.00H r0 = r0.A03
            java.lang.Object r0 = r0.get()
            X.1Cd r0 = (X.AnonymousClass1Cd) r0
            X.1at r4 = r0.get()
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x004e }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x004e }
            java.lang.String r2 = "SELECT campaign_id FROM premium_message_info WHERE message_row_id = ?"
            java.lang.String[] r1 = X.AnonymousClass206.A09(r5)     // Catch:{ all -> 0x004e }
            java.lang.String r0 = "GET_PREMIUM_MESSAGE_CAMPAIGN_ID"
            android.database.Cursor r2 = r3.A0A(r2, r0, r1)     // Catch:{ all -> 0x004e }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x0043
            java.lang.String r0 = "campaign_id"
            java.lang.String r0 = X.C17890vO.A0S(r2, r0)     // Catch:{ all -> 0x0047 }
            X.C196879vn.A01(r5, r0)     // Catch:{ all -> 0x0047 }
        L_0x0043:
            r2.close()     // Catch:{ all -> 0x004e }
            goto L_0x0055
        L_0x0047:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0049 }
        L_0x0049:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x004e }
            throw r0     // Catch:{ all -> 0x004e }
        L_0x004e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0050 }
        L_0x0050:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        L_0x0055:
            r4.close()
        L_0x0058:
            r7.A00()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C682032l.Bhl(X.25F):void");
    }

    public Set BZv() {
        return C18070vi.A0P(C20954Ac8.class);
    }
}
