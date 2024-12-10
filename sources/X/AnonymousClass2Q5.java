package X;

/* renamed from: X.2Q5  reason: invalid class name */
public final class AnonymousClass2Q5 extends C24861Ly {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2Q5(C24811Lt r2) {
        super(r2);
        C18070vi.A0d(r2, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0I(com.whatsapp.jid.UserJid r7, boolean r8) {
        /*
            r6 = this;
            java.lang.String r5 = "jid"
            r4 = 0
            X.C18070vi.A0d(r7, r4)
            X.1Lt r0 = r6.A00     // Catch:{ IllegalArgumentException -> 0x0036 }
            X.1au r3 = r0.A06()     // Catch:{ IllegalArgumentException -> 0x0036 }
            java.lang.String r2 = "wa_block_list_interop"
            r0 = 1
            if (r8 == 0) goto L_0x0021
            android.content.ContentValues r1 = X.C17880vN.A09(r0)     // Catch:{ all -> 0x002f }
            java.lang.String r0 = r7.getRawString()     // Catch:{ all -> 0x002f }
            r1.put(r5, r0)     // Catch:{ all -> 0x002f }
            X.C24861Ly.A05(r1, r3, r2)     // Catch:{ all -> 0x002f }
            goto L_0x002b
        L_0x0021:
            java.lang.String r1 = "jid = ?"
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x002f }
            X.C17880vN.A1J(r7, r0, r4)     // Catch:{ all -> 0x002f }
            X.C24861Ly.A02(r3, r2, r1, r0)     // Catch:{ all -> 0x002f }
        L_0x002b:
            r3.close()     // Catch:{ IllegalArgumentException -> 0x0036 }
            return
        L_0x002f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0031 }
        L_0x0031:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ IllegalArgumentException -> 0x0036 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0036 }
        L_0x0036:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "contact-mgr-db/unable to update blocked state  "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = ", "
            java.lang.String r0 = X.C17900vP.A0D(r0, r1, r8)
            X.C17960vV.A09(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2Q5.A0I(com.whatsapp.jid.UserJid, boolean):void");
    }
}
