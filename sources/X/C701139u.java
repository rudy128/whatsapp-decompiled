package X;

/* renamed from: X.39u  reason: invalid class name and case insensitive filesystem */
public final class C701139u implements AnonymousClass3LL {
    public final AnonymousClass00H A00;

    public C701139u(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001f, code lost:
        if (r0 != false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CCb(X.AnonymousClass206 r16, X.C49702Rn r17, int r18) {
        /*
            r15 = this;
            r0 = 0
            r11 = r16
            X.C18070vi.A0d(r11, r0)
            X.205 r4 = r11.A0v
            boolean r0 = r4.A02
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0021
            boolean r0 = r11.A0l
            if (r0 == 0) goto L_0x0021
            X.1BI r1 = r4.A00
            boolean r0 = X.C22971Dz.A0N(r1)
            if (r0 == 0) goto L_0x0021
            boolean r0 = X.C22971Dz.A0a(r1)
            r1 = 1
            if (r0 == 0) goto L_0x0022
        L_0x0021:
            r1 = 0
        L_0x0022:
            r0 = 4
            r5 = r18
            if (r5 == r0) goto L_0x0029
            if (r5 != r3) goto L_0x002a
        L_0x0029:
            r2 = 1
        L_0x002a:
            if (r1 == 0) goto L_0x00f1
            if (r2 == 0) goto L_0x00f1
            X.00H r0 = r15.A00
            java.lang.Object r9 = r0.get()
            X.121 r9 = (X.AnonymousClass121) r9
            X.122 r9 = (X.AnonymousClass122) r9
            java.util.List r8 = r11.A0T()
            java.util.HashMap r12 = X.C17880vN.A11()
            X.11P r0 = r9.A0A
            long r13 = X.AnonymousClass11P.A01(r0)
            X.C17960vV.A07(r8)
            java.util.Iterator r7 = r8.iterator()
            r2 = 0
        L_0x004e:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00a1
            com.whatsapp.jid.UserJid r10 = X.C17880vN.A0T(r7)
            X.206 r5 = r9.A0K(r10, r11, r12, r13)     // Catch:{ SQLiteConstraintException -> 0x0092 }
            X.1NK r0 = r9.A0a     // Catch:{ SQLiteConstraintException -> 0x0092 }
            boolean r0 = r0.A09(r10)     // Catch:{ SQLiteConstraintException -> 0x0092 }
            X.AnonymousClass122.A0B(r9, r5)     // Catch:{ SQLiteConstraintException -> 0x0092 }
            X.AnonymousClass122.A05(r9, r10, r5, r0)     // Catch:{ SQLiteConstraintException -> 0x0092 }
            X.0zA r6 = r9.A02     // Catch:{ SQLiteConstraintException -> 0x0092 }
            boolean r0 = r6.A07()     // Catch:{ SQLiteConstraintException -> 0x0092 }
            if (r0 == 0) goto L_0x0083
            r0 = 2097152(0x200000, double:1.0361308E-317)
            boolean r0 = r5.A11(r0)     // Catch:{ SQLiteConstraintException -> 0x0092 }
            if (r0 == 0) goto L_0x0083
            r6.A03()     // Catch:{ SQLiteConstraintException -> 0x0092 }
            java.lang.String r0 = "hasPlaceholder"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)     // Catch:{ SQLiteConstraintException -> 0x0092 }
            throw r0     // Catch:{ SQLiteConstraintException -> 0x0092 }
        L_0x0083:
            X.00H r0 = r9.A1E     // Catch:{ SQLiteConstraintException -> 0x0092 }
            X.1W6 r0 = X.C17880vN.A0c(r0)     // Catch:{ SQLiteConstraintException -> 0x0092 }
            r0.A04(r5)     // Catch:{ SQLiteConstraintException -> 0x0092 }
            r9.A0Q(r5)     // Catch:{ SQLiteConstraintException -> 0x0092 }
            int r2 = r2 + 1
            goto L_0x004e
        L_0x0092:
            r5 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "CoreMessageStore/updatemessageinbackground duplicate key="
            java.lang.String r0 = X.AnonymousClass001.A1E(r4, r0, r1)
            com.whatsapp.util.Log.i(r0, r5)
            goto L_0x004e
        L_0x00a1:
            boolean r0 = r11 instanceof X.AnonymousClass21V
            if (r0 == 0) goto L_0x00b7
            if (r2 <= 0) goto L_0x00b7
            r0 = r11
            X.21V r0 = (X.AnonymousClass21V) r0
            X.2rc r0 = X.AnonymousClass206.A00(r0)
            java.io.File r1 = r0.A0G
            if (r1 == 0) goto L_0x00b7
            X.1Ns r0 = r9.A07
            r0.A06(r1, r2, r3)
        L_0x00b7:
            X.206 r1 = r11.A0K()
            boolean r0 = r1 instanceof X.C441322g
            if (r0 == 0) goto L_0x00d0
            if (r2 <= 0) goto L_0x00d0
            X.21V r1 = (X.AnonymousClass21V) r1
            X.2rc r0 = X.AnonymousClass206.A00(r1)
            java.io.File r1 = r0.A0G
            if (r1 == 0) goto L_0x00d0
            X.1Ns r0 = r9.A07
            r0.A06(r1, r2, r3)
        L_0x00d0:
            int r1 = r8.size()
            int r0 = r12.size()
            if (r1 != r0) goto L_0x00e5
            r11.A0j = r12
        L_0x00dc:
            if (r17 == 0) goto L_0x00f1
            java.lang.Class<X.39u> r0 = X.C701139u.class
            java.lang.NullPointerException r0 = X.C17900vP.A07(r0)
            throw r0
        L_0x00e5:
            int r0 = r12.size()
            if (r0 == 0) goto L_0x00dc
            java.lang.String r0 = "msgstore/validateBroadcastParticipantSizes failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x00dc
        L_0x00f1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C701139u.CCb(X.206, X.2Rn, int):void");
    }
}
