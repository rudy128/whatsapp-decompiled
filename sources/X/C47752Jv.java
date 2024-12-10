package X;

/* renamed from: X.2Jv  reason: invalid class name and case insensitive filesystem */
public final class C47752Jv extends AnonymousClass4VM {
    public final AnonymousClass00H A00;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        X.CDX.A00(r4, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03() {
        /*
            r5 = this;
            X.00H r0 = r5.A00
            X.1au r4 = X.AnonymousClass1Cd.A00(r0)
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0019 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x0019 }
            java.lang.String r2 = "DELETE FROM chat\nWHERE\n    jid_row_id IN (\n        SELECT\n            chat.jid_row_id\n        FROM chat AS chat\n        LEFT JOIN jid AS jid\n            ON jid._id = chat.jid_row_id\n        WHERE\n            chat.hidden = 1\n            AND jid.type = 18\n    )"
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x0019 }
            java.lang.String r0 = "DELETE_HIDDEN_LID_THREADS"
            r3.A0F(r2, r0, r1)     // Catch:{ all -> 0x0019 }
            r4.close()
            return
        L_0x0019:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x001b }
        L_0x001b:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47752Jv.A03():void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47752Jv(AnonymousClass00H r1, AnonymousClass00H r2, AnonymousClass00H r3) {
        super(r1, r2);
        C18070vi.A0o(r1, r2, r3);
        this.A00 = r3;
    }

    public int A00() {
        return 11812;
    }

    public String A01() {
        return "delete_hidden_lid_threads";
    }
}
