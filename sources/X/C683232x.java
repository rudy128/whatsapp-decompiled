package X;

import java.util.Set;

/* renamed from: X.32x  reason: invalid class name and case insensitive filesystem */
public final class C683232x implements C25341Nv {
    public final AnonymousClass11S A00;
    public final C35191ln A01;
    public final C26001Ql A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass1CJ A05;

    public boolean Bca(AnonymousClass206 r3) {
        C18070vi.A0d(r3, 0);
        if (!this.A05.A0R(r3.A0v.A00)) {
            return false;
        }
        if (r3.A0z(16) || AnonymousClass206.A08(r3)) {
            return true;
        }
        return false;
    }

    public Set BZv() {
        return C18070vi.A0P(C692336k.class);
    }

    public C683232x(AnonymousClass11S r2, C35191ln r3, AnonymousClass1CJ r4, C26001Ql r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        C18070vi.A0w(r2, r4, r6, r5, r3);
        C18070vi.A0d(r7, 6);
        this.A00 = r2;
        this.A05 = r4;
        this.A03 = r6;
        this.A02 = r5;
        this.A01 = r3;
        this.A04 = r7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0072, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0075, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0076, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0079, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bhl(X.AnonymousClass25F r7) {
        /*
            r6 = this;
            X.206 r4 = X.C18070vi.A08(r7)
            boolean r0 = X.AnonymousClass206.A08(r4)
            if (r0 == 0) goto L_0x007a
            X.1Ql r0 = r6.A02
            X.1Cd r0 = r0.A00
            X.1at r5 = r0.get()
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0073 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x0073 }
            java.lang.String r2 = "\n          SELECT parent_message_row_id\n          FROM message_comment\n          WHERE message_row_id = ?    \n        "
            java.lang.String[] r1 = X.AnonymousClass206.A09(r4)     // Catch:{ all -> 0x0073 }
            java.lang.String r0 = "SELECT_PARENT_MESSAGE_FOR_COMMENT_QUERY_ID"
            android.database.Cursor r3 = r3.A0A(r2, r0, r1)     // Catch:{ all -> 0x0073 }
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x006c }
            r2 = 0
            if (r0 == 0) goto L_0x003a
            java.lang.String r0 = "parent_message_row_id"
            int r1 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x006c }
            boolean r0 = r3.isNull(r1)     // Catch:{ all -> 0x006c }
            if (r0 != 0) goto L_0x003a
            java.lang.Long r2 = X.C17890vO.A0M(r3, r1)     // Catch:{ all -> 0x006c }
        L_0x003a:
            r3.close()     // Catch:{ all -> 0x0073 }
            r5.close()
            if (r2 == 0) goto L_0x00b5
            long r1 = r2.longValue()
            X.00H r0 = r6.A03
            X.206 r3 = X.AnonymousClass1W2.A02(r0, r1)
            if (r3 == 0) goto L_0x00b5
            X.205 r1 = r3.A0v
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0067
            X.11S r0 = r6.A00
            com.whatsapp.jid.PhoneUserJid r0 = X.AnonymousClass11S.A00(r0)
        L_0x005a:
            X.A51 r2 = new X.A51
            r2.<init>(r0, r1)
            long r0 = r3.A0x
            X.2Lz r3 = new X.2Lz
            r3.<init>(r2, r0)
            goto L_0x00b1
        L_0x0067:
            com.whatsapp.jid.UserJid r0 = r3.A0I()
            goto L_0x005a
        L_0x006c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x006e }
        L_0x006e:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x0073 }
            throw r0     // Catch:{ all -> 0x0073 }
        L_0x0073:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0075 }
        L_0x0075:
            r0 = move-exception
            X.CDX.A00(r5, r1)
            throw r0
        L_0x007a:
            r0 = 16
            boolean r0 = r4.A0z(r0)
            if (r0 == 0) goto L_0x00b5
            X.00H r0 = r6.A04
            java.lang.Object r0 = r0.get()
            X.2ms r0 = (X.C59782ms) r0
            r0.A01(r4)
            X.36k r2 = X.C60472o5.A00(r4)
            r0 = 16
            boolean r0 = r4.A0z(r0)
            if (r0 == 0) goto L_0x00ad
            r1 = 1
            if (r2 == 0) goto L_0x00a2
            int r0 = r2.A00()
            if (r0 >= r1) goto L_0x00ad
        L_0x00a2:
            r0 = 0
            com.whatsapp.data.FMessageCommentInfoLazyLoader$getParentMessageCommentInfo$1 r1 = new com.whatsapp.data.FMessageCommentInfoLazyLoader$getParentMessageCommentInfo$1
            r1.<init>(r6, r4, r0)
            X.1OR r0 = X.AnonymousClass1OR.A00
            X.AnonymousClass4GT.A00(r0, r1)
        L_0x00ad:
            X.36k r3 = X.C60472o5.A00(r4)
        L_0x00b1:
            X.C60472o5.A01(r3, r4)
            return
        L_0x00b5:
            r3 = 0
            goto L_0x00b1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C683232x.Bhl(X.25F):void");
    }
}
