package X;

import com.whatsapp.voipcalling.CallState;

/* renamed from: X.4ZU  reason: invalid class name */
public final class AnonymousClass4ZU {
    public C108225bL A00;
    public final AnonymousClass1M9 A01;
    public final C24921Me A02;
    public final C18000vb A03;
    public final C18100vl A04 = AnonymousClass1DF.A01(C104775Pl.A00);

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0044, code lost:
        if (r5 == null) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0063, code lost:
        if (r6 == null) goto L_0x0065;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass4ZN A00(X.AnonymousClass4ZU r10, X.C86534Sa r11) {
        /*
            boolean r0 = r11.A0L
            if (r0 != 0) goto L_0x005b
            com.whatsapp.jid.UserJid r0 = r11.A0A
            X.4ZN r6 = r10.A01(r0)
            if (r6 == 0) goto L_0x0065
            com.whatsapp.voipcalling.CallState r0 = r11.A0B
            X.C18070vi.A0W(r0)
            int r1 = r0.ordinal()
            r0 = 1
            r7 = 0
            if (r1 == r0) goto L_0x004f
            r0 = 3
            if (r1 == r0) goto L_0x004b
            r0 = 2
            if (r1 == r0) goto L_0x0047
            r0 = 5
            if (r1 == r0) goto L_0x0053
            r0 = 4
            if (r1 == r0) goto L_0x0053
            r9 = 0
        L_0x0026:
            long r3 = r11.A05
            java.lang.Long r8 = java.lang.Long.valueOf(r3)
            r1 = 0
            r5 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0041
            if (r8 == 0) goto L_0x0041
            X.0vb r2 = r10.A03
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = r0.toSeconds(r3)
            java.lang.String r5 = X.C64052u8.A0D(r2, r5, r0)
        L_0x0041:
            if (r9 != 0) goto L_0x00b6
            r9 = r5
            if (r5 != 0) goto L_0x00b6
        L_0x0046:
            return r6
        L_0x0047:
            r0 = 2131898119(0x7f122f07, float:1.9431147E38)
            goto L_0x0056
        L_0x004b:
            r0 = 2131891321(0x7f121479, float:1.9417359E38)
            goto L_0x0056
        L_0x004f:
            r0 = 2131898118(0x7f122f06, float:1.9431145E38)
            goto L_0x0056
        L_0x0053:
            r0 = 2131898124(0x7f122f0c, float:1.9431157E38)
        L_0x0056:
            X.6IR r9 = X.AnonymousClass3MX.A0t(r0)
            goto L_0x0026
        L_0x005b:
            X.1EC r0 = r11.A08
            if (r0 == 0) goto L_0x006e
            X.4ZN r6 = r10.A01(r0)
        L_0x0063:
            if (r6 != 0) goto L_0x0046
        L_0x0065:
            X.0vl r0 = r10.A04
            java.lang.Object r6 = r0.getValue()
            X.4ZN r6 = (X.AnonymousClass4ZN) r6
            return r6
        L_0x006e:
            X.10w r0 = r11.A06
            java.util.Collection r0 = r0.values()
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.util.Iterator r2 = r0.iterator()
        L_0x007c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0094
            java.lang.Object r1 = r2.next()
            X.6qE r1 = (X.C134216qE) r1
            boolean r0 = r1.A0M
            if (r0 != 0) goto L_0x007c
            com.whatsapp.jid.UserJid r0 = r1.A0A
            if (r0 == 0) goto L_0x007c
            r3.add(r0)
            goto L_0x007c
        L_0x0094:
            X.5bL r1 = r10.A00
            if (r1 == 0) goto L_0x00a3
            boolean r0 = r1.BgJ(r3)
            if (r0 == 0) goto L_0x00a3
            X.4ZN r6 = r1.BVD()
            goto L_0x0063
        L_0x00a3:
            X.1M9 r1 = r10.A01
            X.1Me r2 = r10.A02
            r5 = 0
            r4 = 1
            r6 = r5
            X.4ZN r6 = X.AnonymousClass74H.A04(r1, r2, r3, r4, r5, r6)
            X.4il r0 = new X.4il
            r0.<init>(r6, r3)
            r10.A00 = r0
            goto L_0x0063
        L_0x00b6:
            r2 = 2131894261(0x7f121ff5, float:1.9423322E38)
            java.lang.Object[] r1 = X.AnonymousClass3MX.A1b(r6, r7)
            r0 = 1
            r1[r0] = r9
            X.6IR r6 = X.C1402670q.A02(r1, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4ZU.A00(X.4ZU, X.4Sa):X.4ZN");
    }

    private final AnonymousClass4ZN A01(AnonymousClass1BI r3) {
        C108225bL r1 = this.A00;
        if (r1 != null && r1.BgI(r3)) {
            return r1.BVD();
        }
        AnonymousClass482 r12 = null;
        if (r3 == null) {
            return null;
        }
        String A0X = this.A02.A0X(r3);
        if (A0X != null) {
            r12 = new AnonymousClass482(A0X);
        }
        this.A00 = new C93314im(r3, r12);
        return r12;
    }

    public final C93264ih A02(C86534Sa r5) {
        CallState callState;
        CallState callState2;
        int i = 2131231623;
        if (r5.A0Q) {
            i = 2131231646;
        }
        boolean z = r5.A0L;
        boolean z2 = true;
        if (z) {
            callState = r5.A0B;
            C18070vi.A0W(callState);
            callState2 = CallState.RECEIVED_CALL;
        } else if (!z) {
            callState = r5.A0B;
            C18070vi.A0W(callState);
            if (callState != CallState.RECEIVED_CALL && !AnonymousClass72U.A03(callState)) {
                callState2 = CallState.REJOINING;
            }
            return new C93264ih(A00(this, r5), i, z2);
        } else {
            throw AnonymousClass3MW.A14();
        }
        if (callState != callState2) {
            z2 = false;
        }
        return new C93264ih(A00(this, r5), i, z2);
    }

    public AnonymousClass4ZU(AnonymousClass1M9 r2, C24921Me r3, C18000vb r4) {
        C18070vi.A0o(r2, r3, r4);
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
    }
}
