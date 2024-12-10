package X;

/* renamed from: X.2IU  reason: invalid class name */
public final class AnonymousClass2IU extends AnonymousClass39J {
    public final AnonymousClass00H A00;

    public void BL9(AnonymousClass206 r4) {
        C18070vi.A0d(r4, 0);
        super.BL9(r4);
        AnonymousClass22S r42 = (AnonymousClass22S) r4;
        C18070vi.A0d(r42, 0);
        C63022sN.A01((C63022sN) this.A00.get(), r42, "SELECT message_row_id, business_owner_jid, title, description FROM message_product WHERE message_row_id=?", "GET_CATALOG_MESSAGE_SQL");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0075, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0076, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0079, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BdY(X.AnonymousClass206 r10) {
        /*
            r9 = this;
            r1 = 0
            X.C18070vi.A0d(r10, r1)
            X.AnonymousClass39J.A00(r9, r10)
            X.00H r0 = r9.A00
            java.lang.Object r4 = r0.get()
            X.2sN r4 = (X.C63022sN) r4
            X.22S r10 = (X.AnonymousClass22S) r10
            X.C18070vi.A0d(r10, r1)
            long r1 = r10.A0x
            r7 = 0
            r6 = 0
            r5 = 1
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            boolean r2 = X.AnonymousClass000.A1R(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "CatalogMessageStore/insertCatalogMessage/message must have row_id set; key="
            r1.append(r0)
            X.205 r3 = r10.A0v
            java.lang.String r0 = X.C17890vO.A0V(r3, r1)
            X.C17960vV.A0G(r2, r0)
            int r0 = r10.A0E()
            boolean r2 = X.AnonymousClass000.A1T(r0, r5)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "CatalogMessageStore/insertCatalogMessage/message in main storage; key="
            java.lang.String r0 = X.AnonymousClass001.A1E(r3, r0, r1)
            X.C17960vV.A0G(r2, r0)
            X.1Cd r0 = r4.A00
            X.1au r5 = r0.A05()
            android.content.ContentValues r3 = X.C17880vN.A08()     // Catch:{ all -> 0x0073 }
            long r0 = r10.A0x     // Catch:{ all -> 0x0073 }
            X.C63022sN.A00(r3, r4, r10, r0)     // Catch:{ all -> 0x0073 }
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0073 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x0073 }
            java.lang.String r1 = "message_product"
            java.lang.String r0 = "INSERT_MESSAGE_CATALOG_SQL"
            long r3 = r2.A06(r1, r0, r3)     // Catch:{ all -> 0x0073 }
            long r1 = r10.A0x     // Catch:{ all -> 0x0073 }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x006a
            r6 = 1
        L_0x006a:
            java.lang.String r0 = "CatalogMessageStore/insertCatalogMessage/inserted row should have same row_id"
            X.C17960vV.A0H(r6, r0)     // Catch:{ all -> 0x0073 }
            r5.close()
            return
        L_0x0073:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0075 }
        L_0x0075:
            r0 = move-exception
            X.CDX.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2IU.BdY(X.206):void");
    }

    public void CQL(AnonymousClass206 r2) {
        C18070vi.A0d(r2, 0);
        AnonymousClass39J.A00(this, r2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2IU(AnonymousClass00H r1, AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4) {
        super(r1, r2, r3);
        C18070vi.A0s(r1, r2, r3, r4);
        this.A00 = r4;
    }
}
