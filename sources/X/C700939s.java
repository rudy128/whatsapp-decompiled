package X;

/* renamed from: X.39s  reason: invalid class name and case insensitive filesystem */
public final class C700939s implements AnonymousClass3LK, AnonymousClass3ML {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;

    public void CCZ(AnonymousClass206 r2, C49702Rn r3) {
        C18070vi.A0d(r2, 0);
        if (A00(r2, true) && r3 != null) {
            throw C17900vP.A07(C700939s.class);
        }
    }

    public void CCb(AnonymousClass206 r2, C49702Rn r3, int i) {
        C18070vi.A0d(r2, 0);
        if (A00(r2, false) && r3 != null) {
            throw C17900vP.A07(C700939s.class);
        }
    }

    public C700939s(AnonymousClass00H r1, AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5) {
        C18070vi.A0w(r1, r2, r3, r4, r5);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = r4;
        this.A03 = r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0059, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005a, code lost:
        X.CDX.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005d, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A00(X.AnonymousClass206 r12, boolean r13) {
        /*
            r11 = this;
            X.36t r7 = X.C60512o9.A00(r12)
            r10 = 1
            if (r7 == 0) goto L_0x0087
            X.00H r0 = r11.A00
            X.0vd r2 = X.C17880vN.A0P(r0)
            r1 = 8783(0x224f, float:1.2308E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r9 = 0
            if (r0 != 0) goto L_0x0019
            return r9
        L_0x0019:
            X.00H r0 = r11.A04
            java.lang.Object r5 = r0.get()
            X.2kP r5 = (X.C58262kP) r5
            long r1 = r7.A00
            r3 = -1
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0061
            X.1Cd r0 = r5.A00
            X.1au r6 = r0.A05()
            r0 = 3
            android.content.ContentValues r8 = X.C17880vN.A09(r0)     // Catch:{ all -> 0x0057 }
            java.lang.String r0 = "child_message_row_id"
            long r3 = r12.A0x     // Catch:{ all -> 0x0057 }
            X.C17880vN.A19(r8, r0, r3)     // Catch:{ all -> 0x0057 }
            java.lang.String r0 = "parent_message_row_id"
            X.C17880vN.A19(r8, r0, r1)     // Catch:{ all -> 0x0057 }
            java.lang.String r3 = "association_type"
            X.6RT r0 = r7.A01     // Catch:{ all -> 0x0057 }
            int r0 = r0.value     // Catch:{ all -> 0x0057 }
            X.C17880vN.A18(r8, r3, r0)     // Catch:{ all -> 0x0057 }
            r0 = r6
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0057 }
            X.1Ev r5 = r0.A02     // Catch:{ all -> 0x0057 }
            java.lang.String r4 = "message_association"
            java.lang.String r3 = "insertIntoMessageAssociationTable/INSERT_MESSAGE_ASSOCIATION_MESSAGES"
            r0 = 5
            r5.A09(r4, r3, r8, r0)     // Catch:{ all -> 0x0057 }
            goto L_0x005e
        L_0x0057:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0059 }
        L_0x0059:
            r0 = move-exception
            X.CDX.A00(r6, r1)
            throw r0
        L_0x005e:
            r6.close()
        L_0x0061:
            X.00H r0 = r11.A02
            X.206 r2 = X.AnonymousClass1W2.A02(r0, r1)
            if (r2 != 0) goto L_0x0078
            X.00H r0 = r11.A01
            java.lang.Object r2 = r0.get()
            X.190 r2 = (X.AnonymousClass190) r2
            java.lang.String r1 = "FMessageParentAssociationInfoDatabasePostProcessor/process parent message not found"
            r0 = 0
            r2.A0G(r1, r0, r9)
            return r10
        L_0x0078:
            if (r13 == 0) goto L_0x0087
            X.00H r0 = r11.A03
            java.lang.Object r1 = r0.get()
            X.1RU r1 = (X.AnonymousClass1RU) r1
            X.6RT r0 = r7.A01
            r1.CR9(r12, r2, r0)
        L_0x0087:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C700939s.A00(X.206, boolean):boolean");
    }
}
