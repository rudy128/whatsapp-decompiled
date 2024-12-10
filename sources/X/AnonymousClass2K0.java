package X;

/* renamed from: X.2K0  reason: invalid class name */
public final class AnonymousClass2K0 extends AnonymousClass4VM {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0051, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03() {
        /*
            r13 = this;
            X.00H r1 = r13.A01
            X.11S r0 = X.C17880vN.A0H(r1)
            com.whatsapp.jid.PhoneUserJid r3 = X.AnonymousClass11S.A00(r0)
            if (r3 == 0) goto L_0x0064
            X.11S r0 = X.C17880vN.A0H(r1)
            X.1E2 r2 = r0.A09()
            if (r2 == 0) goto L_0x0064
            X.00H r1 = r13.A00
            long r5 = X.AnonymousClass1DL.A02(r3, r1)
            r3 = -1
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x005d
            long r1 = X.AnonymousClass1DL.A02(r2, r1)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0056
            android.content.ContentValues r8 = X.C17880vN.A08()
            java.lang.String r0 = "account_jid_row_id"
            X.C17880vN.A19(r8, r0, r1)
            X.00H r0 = r13.A02
            X.1au r2 = X.AnonymousClass1Cd.A00(r0)
            r0 = r2
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x004f }
            X.1Ev r7 = r0.A02     // Catch:{ all -> 0x004f }
            java.lang.String r9 = "chat"
            java.lang.String r10 = "jid_row_id = ?"
            java.lang.String[] r12 = X.C17900vP.A0t(r5)     // Catch:{ all -> 0x004f }
            java.lang.String r11 = "UPDATE_SELF_ACCOUNT_JID_FOR_SELF_PN_CHAT"
            r7.A02(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x004f }
            r2.close()
            return
        L_0x004f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0051 }
        L_0x0051:
            r0 = move-exception
            X.CDX.A00(r2, r1)
            throw r0
        L_0x0056:
            java.lang.String r0 = "No Jid row id for self lid user jid"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x005d:
            java.lang.String r0 = "No Jid row id for self phone user jid"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x0064:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2K0.A03():void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2K0(AnonymousClass00H r1, AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5) {
        super(r1, r2);
        C18070vi.A0w(r1, r2, r3, r4, r5);
        this.A00 = r3;
        this.A01 = r4;
        this.A02 = r5;
    }

    public int A00() {
        return 11812;
    }

    public String A01() {
        return "update_self_account_jid_for_self_pn_chat";
    }
}
