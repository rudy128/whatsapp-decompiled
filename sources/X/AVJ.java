package X;

import java.util.Set;

public final class AVJ implements C72443Lz {
    public final AnonymousClass11S A00;
    public final C26031Qo A01;
    public final A16 A02;

    public Set CGJ() {
        return C200410p.A0S(new AnonymousClass9IM[]{AnonymousClass9IM.COMMON_ENC, AnonymousClass9IM.PARTICIPANTS});
    }

    public AVJ(AnonymousClass11S r1, C26031Qo r2, A16 a16) {
        C18070vi.A0o(r1, r2, a16);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = a16;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0007, code lost:
        r4 = r5.A0v;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BLq(X.C196049uN r13, X.C195829ty r14, X.A1O r15) {
        /*
            r12 = this;
            X.C18070vi.A0h(r15, r14)
            X.206 r5 = r14.A03     // Catch:{ all -> 0x00c6 }
            if (r5 == 0) goto L_0x00d9
            X.205 r4 = r5.A0v     // Catch:{ all -> 0x00c6 }
            X.1BI r8 = r4.A00     // Catch:{ all -> 0x00c6 }
            if (r8 == 0) goto L_0x00d9
            boolean r0 = r8 instanceof X.AnonymousClass1E2     // Catch:{ all -> 0x00c6 }
            if (r0 != 0) goto L_0x001c
            boolean r0 = r14.A0C     // Catch:{ all -> 0x00c6 }
            if (r0 != 0) goto L_0x001c
            X.11S r0 = r12.A00     // Catch:{ all -> 0x00c6 }
            com.whatsapp.jid.PhoneUserJid r7 = X.AnonymousClass11S.A00(r0)     // Catch:{ all -> 0x00c6 }
            goto L_0x0022
        L_0x001c:
            X.11S r0 = r12.A00     // Catch:{ all -> 0x00c6 }
            X.1E2 r7 = r0.A09()     // Catch:{ all -> 0x00c6 }
        L_0x0022:
            if (r7 == 0) goto L_0x00d9
            X.8cr r10 = r14.A02     // Catch:{ all -> 0x00c6 }
            X.1E0 r1 = com.whatsapp.jid.DeviceJid.Companion     // Catch:{ all -> 0x00c6 }
            com.whatsapp.jid.Jid r0 = r15.A06     // Catch:{ all -> 0x00c6 }
            com.whatsapp.jid.DeviceJid r0 = r1.A02(r0)     // Catch:{ all -> 0x00c6 }
            boolean r0 = X.C22971Dz.A0S(r0)     // Catch:{ all -> 0x00c6 }
            if (r0 != 0) goto L_0x00d9
            X.A16 r6 = r12.A02     // Catch:{ all -> 0x00c6 }
            X.0ve r3 = r6.A01     // Catch:{ all -> 0x00c6 }
            r2 = 8860(0x229c, float:1.2416E-41)
            X.0vf r1 = X.C18040vf.A02     // Catch:{ all -> 0x00c6 }
            int r0 = X.C18020vd.A00(r1, r3, r2)     // Catch:{ all -> 0x00c6 }
            if (r0 == 0) goto L_0x00d9
            boolean r0 = r6.A01(r5)     // Catch:{ all -> 0x00c6 }
            if (r0 == 0) goto L_0x00d9
            java.lang.String r9 = r4.A01     // Catch:{ all -> 0x00c6 }
            X.C18070vi.A0X(r9)     // Catch:{ all -> 0x00c6 }
            int r11 = X.C18020vd.A00(r1, r3, r2)     // Catch:{ all -> 0x00c6 }
            byte[] r1 = r10.A0M()     // Catch:{ all -> 0x00c6 }
            X.C18070vi.A0b(r1)     // Catch:{ all -> 0x00c6 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x00c6 }
            byte[] r4 = r6.A02(r0, r1)     // Catch:{ all -> 0x00c6 }
            r3 = 0
            if (r4 == 0) goto L_0x00d9
            int r0 = r4.length     // Catch:{ all -> 0x00c6 }
            if (r0 == 0) goto L_0x00d9
            X.9oV r2 = r6.A02     // Catch:{ all -> 0x00c6 }
            int r1 = r10.bitField0_     // Catch:{ all -> 0x00c6 }
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r1 = r1 & r0
            boolean r0 = X.AnonymousClass000.A1O(r1)     // Catch:{ all -> 0x00c6 }
            if (r0 == 0) goto L_0x00b5
            X.8cG r0 = r10.messageContextInfo_     // Catch:{ all -> 0x00c6 }
            if (r0 != 0) goto L_0x0079
            X.8cG r0 = X.C166048cG.DEFAULT_INSTANCE     // Catch:{ all -> 0x00c6 }
        L_0x0079:
            X.DSQ r0 = r0.messageSecret_     // Catch:{ all -> 0x00c6 }
            byte[] r0 = r0.A06()     // Catch:{ all -> 0x00c6 }
            byte[] r1 = r2.A01(r8, r7, r9, r0)     // Catch:{ all -> 0x00c6 }
            if (r1 == 0) goto L_0x00b5
            int r0 = r1.length     // Catch:{ all -> 0x00c6 }
            if (r0 == 0) goto L_0x00d9
            byte[] r1 = X.AnonymousClass9QC.A00(r4, r1)     // Catch:{ all -> 0x00c6 }
            X.C18070vi.A0X(r1)     // Catch:{ all -> 0x00c6 }
            r0 = 16
            java.util.List r0 = X.C200410p.A0M(r1, r0)     // Catch:{ all -> 0x00c6 }
            byte[] r2 = X.C29431cG.A1A(r0)     // Catch:{ all -> 0x00c6 }
            int r0 = r2.length     // Catch:{ all -> 0x00c6 }
            if (r0 == 0) goto L_0x00d9
            java.lang.Long r1 = X.C17880vN.A0n(r11)     // Catch:{ all -> 0x00c6 }
            X.9Ei r0 = new X.9Ei     // Catch:{ all -> 0x00c6 }
            r0.<init>((java.lang.Long) r1, (byte[]) r2)     // Catch:{ all -> 0x00c6 }
            java.lang.Object r1 = r0.A00     // Catch:{ all -> 0x00c6 }
            X.1ca r1 = (X.C29621ca) r1     // Catch:{ all -> 0x00c6 }
            java.lang.String r0 = "reporting"
            X.1ca r0 = r1.A0K(r0)     // Catch:{ all -> 0x00c6 }
            if (r0 == 0) goto L_0x00d9
            X.A1O.A00(r15, r0)     // Catch:{ all -> 0x00c6 }
            goto L_0x00cb
        L_0x00b5:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00c6 }
            java.lang.String r0 = "ReportingToken/missing fk at send: messageType: "
            X.AnonymousClass8BX.A1G(r5, r0, r1)     // Catch:{ all -> 0x00c6 }
            X.1Qo r1 = r6.A00     // Catch:{ all -> 0x00c6 }
            X.8oI r0 = X.AnonymousClass8oI.A01     // Catch:{ all -> 0x00c6 }
            r1.A00(r0, r3)     // Catch:{ all -> 0x00c6 }
            return
        L_0x00c6:
            r0 = move-exception
            X.1IU r15 = X.C108945cZ.A1J(r0)
        L_0x00cb:
            java.lang.Throwable r3 = X.C30671eK.A00(r15)
            if (r3 == 0) goto L_0x00d9
            X.1Qo r2 = r12.A01
            X.8oI r1 = X.AnonymousClass8oI.A08
            r0 = 0
            r2.A01(r1, r0, r3)
        L_0x00d9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AVJ.BLq(X.9uN, X.9ty, X.A1O):void");
    }

    public AnonymousClass9IM Ba7() {
        return AnonymousClass9IM.REPORTING_TOKEN;
    }

    public /* synthetic */ Set CGK() {
        return C25511Om.A00;
    }
}
