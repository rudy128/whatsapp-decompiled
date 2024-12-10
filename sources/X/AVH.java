package X;

import java.util.Set;

public final class AVH implements C72443Lz {
    public final AnonymousClass190 A00;
    public final C18030ve A01;

    public Set CGJ() {
        return C200410p.A0S(new AnonymousClass9IM[]{AnonymousClass9IM.COMMON_ENC, AnonymousClass9IM.PARTICIPANTS});
    }

    public AVH(AnonymousClass190 r1, C18030ve r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b6, code lost:
        if (X.C22971Dz.A0d(r2) == false) goto L_0x00b8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00df  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BLq(X.C196049uN r12, X.C195829ty r13, X.A1O r14) {
        /*
            r11 = this;
            boolean r5 = X.C18070vi.A15(r14, r13)
            r6 = 2
            X.C18070vi.A0d(r12, r6)
            X.9mc r0 = r12.A03
            X.9ry r1 = r0.A00()
            X.BCY r4 = r12.A02
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            X.9r6 r8 = r1.A00
            r10 = 0
            r7 = 0
            if (r8 != 0) goto L_0x0057
            X.9s0 r0 = r1.A01
            java.util.Map r0 = r0.A02
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0057
        L_0x0026:
            java.util.Map r0 = r1.A02
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0057
            X.190 r9 = r11.A00
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            X.205 r0 = r14.A08
            X.1BI r0 = r0.A00
            int r0 = X.C64002u3.A04(r0)
            r2.append(r0)
            java.lang.String r0 = ", type="
            r2.append(r0)
            X.206 r0 = r13.A03
            if (r0 == 0) goto L_0x004e
            int r0 = r0.A0u
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
        L_0x004e:
            java.lang.String r2 = X.C17890vO.A0V(r10, r2)
            java.lang.String r0 = "sendMessageEncrypted/empty_payload"
            r9.A0G(r0, r2, r5)
        L_0x0057:
            java.util.Map r5 = r1.A02
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0080
            X.1ca r0 = r4.BHK(r8)
            r3.add(r0)
            if (r8 == 0) goto L_0x00fc
            com.whatsapp.jid.Jid r2 = r14.A06
            boolean r0 = X.C22971Dz.A0d(r2)
            if (r0 == 0) goto L_0x0080
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.UserJid"
            X.C18070vi.A0z(r2, r0)
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            X.1ca r0 = r4.BHE(r2)
            if (r0 == 0) goto L_0x0080
            r3.add(r0)
        L_0x0080:
            r0 = 0
        L_0x0081:
            com.whatsapp.jid.Jid r2 = r14.A06
            java.util.List r10 = r4.BHi(r2, r1, r0)
            boolean r0 = X.AnonymousClass000.A1a(r10)
            if (r0 == 0) goto L_0x00af
            java.lang.String r1 = r14.A09
            if (r1 == 0) goto L_0x00fa
            int r0 = r1.length()
            if (r0 == 0) goto L_0x00fa
            r0 = 1
            X.1MD[] r9 = new X.AnonymousClass1MD[r0]
            X.C17960vV.A07(r1)
            java.lang.String r0 = "name"
            X.C17880vN.A1Q(r0, r1, r9, r7)
        L_0x00a2:
            X.1ca[] r0 = new X.C29621ca[r7]
            java.lang.Object[] r1 = r10.toArray(r0)
            X.1ca[] r1 = (X.C29621ca[]) r1
            java.lang.String r0 = "participants"
            X.AnonymousClass8BU.A1K(r0, r3, r9, r1)
        L_0x00af:
            if (r8 == 0) goto L_0x00b8
            boolean r0 = X.C22971Dz.A0d(r2)
            r1 = 1
            if (r0 != 0) goto L_0x00b9
        L_0x00b8:
            r1 = 0
        L_0x00b9:
            boolean r0 = X.C22971Dz.A0e(r2)
            if (r0 == 0) goto L_0x00c6
            if (r8 == 0) goto L_0x00c6
            int r0 = r8.A00
            if (r0 != r6) goto L_0x00c6
            r7 = 1
        L_0x00c6:
            if (r1 != 0) goto L_0x00d0
            if (r7 != 0) goto L_0x00d0
            boolean r0 = X.AnonymousClass8BR.A1Y(r5)
            if (r0 == 0) goto L_0x00d9
        L_0x00d0:
            X.1ca r0 = r4.BHp()
            if (r0 == 0) goto L_0x00d9
            r3.add(r0)
        L_0x00d9:
            boolean r0 = X.C22971Dz.A0a(r2)
            if (r0 == 0) goto L_0x00f4
            X.0ve r2 = r11.A01
            X.0vf r1 = X.C18040vf.A01
            r0 = 11104(0x2b60, float:1.556E-41)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x00f4
            X.1ca r0 = r4.BHp()
            if (r0 == 0) goto L_0x00f4
            r3.add(r0)
        L_0x00f4:
            java.util.List r0 = r14.A0A
            r0.addAll(r3)
            return
        L_0x00fa:
            r9 = 0
            goto L_0x00a2
        L_0x00fc:
            r0 = 1
            goto L_0x0081
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AVH.BLq(X.9uN, X.9ty, X.A1O):void");
    }

    public AnonymousClass9IM Ba7() {
        return AnonymousClass9IM.ENC_NODE_CREATION;
    }

    public /* synthetic */ Set CGK() {
        return C25511Om.A00;
    }
}
