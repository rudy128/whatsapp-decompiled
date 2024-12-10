package X;

/* renamed from: X.2Ju  reason: invalid class name and case insensitive filesystem */
public final class C47742Ju extends AnonymousClass4VM {
    public final AnonymousClass00H A00;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        X.CDX.A00(r3, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03() {
        /*
            r4 = this;
            X.00H r0 = r4.A00
            X.1au r3 = X.AnonymousClass1Cd.A00(r0)
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0018 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x0018 }
            java.lang.String[] r0 = X.C28821ax.A01     // Catch:{ all -> 0x0018 }
            java.lang.String r1 = "CREATE INDEX IF NOT EXISTS \nchat_account_jid_row_id_index \n ON chat \n (account_jid_row_id)"
            java.lang.String r0 = "CREATE_CHAT_ACCOUNT_JID_ROW_ID_INDEX"
            r2.A0E(r1, r0)     // Catch:{ all -> 0x0018 }
            r3.close()
            return
        L_0x0018:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x001a }
        L_0x001a:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47742Ju.A03():void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47742Ju(AnonymousClass00H r1, AnonymousClass00H r2, AnonymousClass00H r3) {
        super(r1, r2);
        C18070vi.A0o(r1, r2, r3);
        this.A00 = r3;
    }

    public int A00() {
        return 11854;
    }

    public String A01() {
        return "chat_account_jid_row_id_index";
    }
}
