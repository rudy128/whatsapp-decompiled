package X;

/* renamed from: X.306  reason: invalid class name */
public final class AnonymousClass306 implements C72113Kr {
    public final AnonymousClass11S A00;
    public final AnonymousClass11P A01;
    public final C18030ve A02;
    public final AnonymousClass00H A03;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0042, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0043, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bqf() {
        /*
            r7 = this;
            X.11S r0 = r7.A00
            boolean r0 = r0.A0N()
            if (r0 == 0) goto L_0x0047
            X.0ve r2 = r7.A02
            r1 = 7388(0x1cdc, float:1.0353E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0047
            X.00H r0 = r7.A03
            java.lang.Object r2 = r0.get()
            X.2aJ r2 = (X.C52062aJ) r2
            X.11P r0 = r7.A01
            long r5 = X.AnonymousClass11P.A01(r0)
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r5 = r5 - r0
            X.1Oq r0 = r2.A00
            X.1au r4 = r0.A06()
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0040 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x0040 }
            java.lang.String r2 = "DELETE FROM placeholder_retry_message WHERE peer_message_row_id IN (SELECT peer_message_row_id FROM placeholder_retry_message LEFT JOIN peer_messages ON placeholder_retry_message.peer_message_row_id = peer_messages._id WHERE placeholder_retry_message.timestamp < ? AND peer_messages._id IS NULL)"
            java.lang.String[] r1 = X.C17900vP.A0t(r5)     // Catch:{ all -> 0x0040 }
            java.lang.String r0 = "PlaceholderRetryMessageStore/getPlaceholderPeerRequestsBeforeTimestamp"
            r3.A0F(r2, r0, r1)     // Catch:{ all -> 0x0040 }
            r4.close()
            return
        L_0x0040:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0042 }
        L_0x0042:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        L_0x0047:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass306.Bqf():void");
    }

    public AnonymousClass306(AnonymousClass11S r1, AnonymousClass11P r2, C18030ve r3, AnonymousClass00H r4) {
        C18070vi.A0s(r2, r3, r1, r4);
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = r4;
    }
}
