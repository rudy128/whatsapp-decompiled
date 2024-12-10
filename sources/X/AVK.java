package X;

import java.util.Set;

public final class AVK implements C72443Lz {
    public final AnonymousClass11S A00;
    public final C18030ve A01;
    public final C57362ix A02;
    public final C26491Si A03;

    public Set CGJ() {
        return C200410p.A0S(new AnonymousClass9IM[]{AnonymousClass9IM.PARTICIPANTS, AnonymousClass9IM.BONSAI, AnonymousClass9IM.COMMON_ENC});
    }

    public AVK(AnonymousClass11S r2, C18030ve r3, C57362ix r4, C26491Si r5) {
        C18070vi.A0j(r3, r2);
        C18070vi.A0d(r5, 4);
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r4;
        this.A03 = r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0025, code lost:
        if (r5.A00.A0R(X.AnonymousClass1E0.A00(r2)) == false) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002d, code lost:
        if (X.C18020vd.A05(r3, r4, 9209) == false) goto L_0x00ac;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BLq(X.C196049uN r6, X.C195829ty r7, X.A1O r8) {
        /*
            r5 = this;
            X.C18070vi.A0i(r8, r6)
            int r0 = r6.A00
            if (r0 <= 0) goto L_0x00ac
            X.0ve r4 = r5.A01
            r0 = 8311(0x2077, float:1.1646E-41)
            X.0vf r3 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r3, r4, r0)
            if (r0 != 0) goto L_0x002f
            com.whatsapp.jid.Jid r2 = r8.A06
            boolean r0 = X.C22971Dz.A0d(r2)
            if (r0 != 0) goto L_0x0027
            X.11S r1 = r5.A00
            com.whatsapp.jid.DeviceJid r0 = X.AnonymousClass1E0.A00(r2)
            boolean r0 = r1.A0R(r0)
            if (r0 == 0) goto L_0x00ac
        L_0x0027:
            r0 = 9209(0x23f9, float:1.2905E-41)
            boolean r0 = X.C18020vd.A05(r3, r4, r0)
            if (r0 == 0) goto L_0x00ac
        L_0x002f:
            int r0 = r6.A00
            int r3 = r0 * 1571
        L_0x0033:
            X.1Si r0 = r5.A03
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x006f
            X.9mc r0 = r6.A03
            X.9ry r2 = r0.A00()
            java.util.ArrayList r1 = X.AnonymousClass000.A13()
            java.util.Map r0 = r2.A02
            java.util.Collection r0 = r0.values()
            r1.addAll(r0)
            X.9s0 r0 = r2.A01
            java.util.Map r0 = r0.A02
            if (r0 == 0) goto L_0x005d
            java.util.Collection r0 = r0.values()
            if (r0 == 0) goto L_0x005d
            r1.addAll(r0)
        L_0x005d:
            X.9r6 r0 = r2.A00
            if (r0 == 0) goto L_0x0064
            r1.add(r0)
        L_0x0064:
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0089
            java.lang.String r0 = "PaddingSendStanzaContributor/missing ctx length"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x006f:
            r0 = 0
        L_0x0070:
            int r3 = r3 + r0
            if (r3 <= 0) goto L_0x0088
            r4 = 0
            byte[] r2 = new byte[r3]
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            r0.nextBytes(r2)
            java.lang.String r1 = "padding"
            X.1ca r0 = new X.1ca
            r0.<init>((java.lang.String) r1, (byte[]) r2, (X.AnonymousClass1MD[]) r4)
            X.A1O.A00(r8, r0)
        L_0x0088:
            return
        L_0x0089:
            java.util.Iterator r2 = r1.iterator()
            r1 = 0
        L_0x008e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00a3
            java.lang.Object r0 = r2.next()
            X.9r6 r0 = (X.C194059r6) r0
            byte[] r0 = r0.A01
            if (r0 == 0) goto L_0x00a1
            int r0 = r0.length
        L_0x009f:
            int r1 = r1 + r0
            goto L_0x008e
        L_0x00a1:
            r0 = 0
            goto L_0x009f
        L_0x00a3:
            int r1 = r1 + 140
            X.2ix r0 = r5.A02
            int r0 = r0.A00(r1)
            goto L_0x0070
        L_0x00ac:
            r3 = 0
            goto L_0x0033
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AVK.BLq(X.9uN, X.9ty, X.A1O):void");
    }

    public AnonymousClass9IM Ba7() {
        return AnonymousClass9IM.PADDING;
    }

    public /* synthetic */ Set CGK() {
        return C25511Om.A00;
    }
}
