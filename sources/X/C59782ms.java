package X;

import android.os.Handler;

/* renamed from: X.2ms  reason: invalid class name and case insensitive filesystem */
public final class C59782ms {
    public final AnonymousClass1LW A00;
    public final AnonymousClass1CJ A01;
    public final AnonymousClass1Q2 A02;
    public final C26001Ql A03;
    public final C24681Lg A04;
    public final AnonymousClass1Cd A05;
    public final C25931Qe A06;
    public final AnonymousClass00H A07;

    /* JADX WARNING: type inference failed for: r0v15, types: [X.2Ly, java.lang.Object, X.36k] */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0071, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0074, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0075, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0078, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.AnonymousClass206 r8) {
        /*
            r7 = this;
            r0 = 0
            X.C18070vi.A0d(r8, r0)
            r0 = 16
            boolean r0 = r8.A0z(r0)
            if (r0 == 0) goto L_0x0079
            X.1Cd r0 = r7.A05
            X.1at r4 = r0.get()
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0072 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x0072 }
            java.lang.String r2 = "\n          SELECT \n            message_row_id,\n            number_of_comments,\n            last_comment_ts,\n            last_comment_message_row_id\n          FROM message_comment_parent\n          WHERE message_row_id = ?    \n        "
            java.lang.String[] r1 = X.AnonymousClass206.A09(r8)     // Catch:{ all -> 0x0072 }
            java.lang.String r0 = "SELECT_PARENT_MESSAGE_COMMENT_INFO"
            android.database.Cursor r5 = r3.A0A(r2, r0, r1)     // Catch:{ all -> 0x0072 }
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x006b }
            r6 = 0
            if (r0 == 0) goto L_0x0064
            java.lang.String r0 = "number_of_comments"
            int r2 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x006b }
            java.lang.String r0 = "last_comment_ts"
            int r1 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x006b }
            java.lang.String r0 = "last_comment_message_row_id"
            int r3 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x006b }
            int r2 = r5.getInt(r2)     // Catch:{ all -> 0x006b }
            boolean r0 = r5.isNull(r1)     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x0048
            r1 = r6
            goto L_0x004c
        L_0x0048:
            java.lang.Long r1 = X.C17890vO.A0M(r5, r1)     // Catch:{ all -> 0x006b }
        L_0x004c:
            boolean r0 = r5.isNull(r3)     // Catch:{ all -> 0x006b }
            if (r0 != 0) goto L_0x0056
            java.lang.Long r6 = X.C17890vO.A0M(r5, r3)     // Catch:{ all -> 0x006b }
        L_0x0056:
            X.2Ly r0 = new X.2Ly     // Catch:{ all -> 0x006b }
            r0.<init>()     // Catch:{ all -> 0x006b }
            r0.A00 = r2     // Catch:{ all -> 0x006b }
            r0.A01 = r6     // Catch:{ all -> 0x006b }
            r0.A02 = r1     // Catch:{ all -> 0x006b }
            X.C60472o5.A01(r0, r8)     // Catch:{ all -> 0x006b }
        L_0x0064:
            r5.close()     // Catch:{ all -> 0x0072 }
            r4.close()
            return
        L_0x006b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x006d }
        L_0x006d:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ all -> 0x0072 }
            throw r0     // Catch:{ all -> 0x0072 }
        L_0x0072:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0074 }
        L_0x0074:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        L_0x0079:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59782ms.A01(X.206):void");
    }

    public C59782ms(AnonymousClass1LW r1, AnonymousClass1CJ r2, AnonymousClass1Q2 r3, C26001Ql r4, C24681Lg r5, AnonymousClass1Cd r6, C25931Qe r7, AnonymousClass00H r8) {
        C18070vi.A0w(r1, r2, r3, r8, r5);
        C18070vi.A0q(r4, r6, r7);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A07 = r8;
        this.A04 = r5;
        this.A03 = r4;
        this.A05 = r6;
        this.A06 = r7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0076, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007e, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0081, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.AnonymousClass206 r8) {
        /*
            r7 = this;
            X.36k r3 = X.C60472o5.A00(r8)
            r0 = 16
            boolean r0 = r8.A0z(r0)
            if (r0 == 0) goto L_0x0082
            if (r3 == 0) goto L_0x0082
            X.1Cd r0 = r7.A05
            X.1au r4 = r0.A05()
            X.1xA r5 = r4.BD0()     // Catch:{ all -> 0x007b }
            android.content.ContentValues r6 = X.C17880vN.A08()     // Catch:{ all -> 0x0074 }
            X.AnonymousClass206.A04(r6, r8)     // Catch:{ all -> 0x0074 }
            java.lang.String r2 = "chat_row_id"
            X.205 r0 = r8.A0v     // Catch:{ all -> 0x0074 }
            X.1BI r1 = r0.A00     // Catch:{ all -> 0x0074 }
            r0 = 0
            if (r1 == 0) goto L_0x0032
            X.1LW r0 = r7.A00     // Catch:{ all -> 0x0074 }
            long r0 = r0.A09(r1)     // Catch:{ all -> 0x0074 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0074 }
        L_0x0032:
            r6.put(r2, r0)     // Catch:{ all -> 0x0074 }
            java.lang.String r1 = "number_of_comments"
            int r0 = r3.A00()     // Catch:{ all -> 0x0074 }
            X.C17880vN.A18(r6, r1, r0)     // Catch:{ all -> 0x0074 }
            java.lang.String r1 = "last_comment_ts"
            boolean r2 = r3 instanceof X.C48302Ly     // Catch:{ all -> 0x0074 }
            if (r2 == 0) goto L_0x004f
            r0 = r3
            X.2Ly r0 = (X.C48302Ly) r0     // Catch:{ all -> 0x0074 }
            java.lang.Long r0 = r0.A02     // Catch:{ all -> 0x0074 }
        L_0x0049:
            r6.put(r1, r0)     // Catch:{ all -> 0x0074 }
            java.lang.String r1 = "last_comment_message_row_id"
            goto L_0x0051
        L_0x004f:
            r0 = 0
            goto L_0x0049
        L_0x0051:
            if (r2 == 0) goto L_0x0054
            goto L_0x0056
        L_0x0054:
            r0 = 0
            goto L_0x005a
        L_0x0056:
            X.2Ly r3 = (X.C48302Ly) r3     // Catch:{ all -> 0x0074 }
            java.lang.Long r0 = r3.A01     // Catch:{ all -> 0x0074 }
        L_0x005a:
            r6.put(r1, r0)     // Catch:{ all -> 0x0074 }
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0074 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x0074 }
            java.lang.String r2 = "message_comment_parent"
            java.lang.String r1 = "insertIntoCommentParentTable/INSERT_COMMENT_PARENT_MESSAGE_INFO"
            r0 = 5
            r3.A09(r2, r1, r6, r0)     // Catch:{ all -> 0x0074 }
            r5.A00()     // Catch:{ all -> 0x0074 }
            r5.close()     // Catch:{ all -> 0x007b }
            r4.close()
            return
        L_0x0074:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0076 }
        L_0x0076:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ all -> 0x007b }
            throw r0     // Catch:{ all -> 0x007b }
        L_0x007b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x007d }
        L_0x007d:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        L_0x0082:
            java.lang.String r0 = "MessageCommentParentStore/insertCommentParentMessageData message does not contain comments"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59782ms.A00(X.206):void");
    }

    /* JADX WARNING: type inference failed for: r0v12, types: [X.2Ly, java.lang.Object, X.36k] */
    public final void A02(AnonymousClass206 r7, boolean z) {
        Long A022;
        AnonymousClass00H r2;
        AnonymousClass206 A023;
        int i;
        int A002;
        A51 A012;
        if (AnonymousClass206.A08(r7)) {
            AnonymousClass205 r4 = null;
            if (C60472o5.A00(r7) == null) {
                this.A06.A0A(C18070vi.A09(r7, C692336k.class));
                r2 = this.A07;
                AnonymousClass1W6 A0c = C17880vN.A0c(r2);
                C692336k A003 = C60472o5.A00(r7);
                if (!(A003 == null || (A012 = A003.A01()) == null)) {
                    r4 = A012.A01;
                }
                A023 = A0c.A01.A05(r4);
            } else {
                C692336k A004 = C60472o5.A00(r7);
                if (A004 != null && (A022 = A004.A02()) != null) {
                    long longValue = A022.longValue();
                    r2 = this.A07;
                    A023 = AnonymousClass1W2.A02(r2, longValue);
                } else {
                    return;
                }
            }
            if (A023 != null) {
                if (!A023.A0z(16)) {
                    A023.A0V(16);
                    C17880vN.A0c(r2).A05(A023, -1);
                }
                C692336k A005 = C60472o5.A00(A023);
                if (A005 == null) {
                    A01(A023);
                }
                if (z) {
                    i = -1;
                } else {
                    i = 1;
                    if (r7.A11(65536)) {
                        i = 0;
                    }
                }
                C692336k A006 = C60472o5.A00(A023);
                if (A006 != null) {
                    A002 = A006.A00() + i;
                } else {
                    A002 = this.A03.A00(A023);
                }
                Long valueOf = Long.valueOf(r7.A0x);
                Long valueOf2 = Long.valueOf(r7.A0I);
                ? obj = new Object();
                obj.A00 = A002;
                obj.A01 = valueOf;
                obj.A02 = valueOf2;
                C60472o5.A01(obj, A023);
                A00(A023);
                Handler handler = this.A02.A02;
                int i2 = 38;
                if (A005 == null) {
                    i2 = 37;
                }
                handler.post(new AnonymousClass3Bx(this, A023, i2));
            }
        }
    }
}
