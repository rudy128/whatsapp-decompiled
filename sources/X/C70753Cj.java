package X;

/* renamed from: X.3Cj  reason: invalid class name and case insensitive filesystem */
public class C70753Cj implements Runnable {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final boolean A03;
    public final boolean A04;

    public C70753Cj(C199410f r2, AnonymousClass1RK r3, boolean z) {
        this.A00 = 5;
        this.A01 = r3;
        this.A02 = r2;
        this.A03 = z;
        this.A04 = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01b9, code lost:
        if (r0.A03 == 1) goto L_0x01bb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r14 = this;
            int r0 = r14.A00
            switch(r0) {
                case 0: goto L_0x006d;
                case 1: goto L_0x0091;
                case 2: goto L_0x00f7;
                case 3: goto L_0x0126;
                case 4: goto L_0x015b;
                case 5: goto L_0x016e;
                case 6: goto L_0x01a2;
                case 7: goto L_0x01e6;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r4 = r14.A01
            X.2fC r4 = (X.C55092fC) r4
            java.lang.Object r5 = r14.A02
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5
            boolean r9 = r14.A03
            boolean r3 = r14.A04
            X.1Nb r0 = r4.A02
            if (r9 == 0) goto L_0x005e
            boolean r2 = r0.A12(r5)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "StatusViewingSettings/mute-user-status returned "
        L_0x001f:
            X.C17900vP.A0n(r0, r1, r2)
            if (r3 == 0) goto L_0x0042
            X.1To r1 = r4.A00
            X.00H r0 = r1.A0a
            java.lang.Object r3 = r0.get()
            X.2lN r3 = (X.C58862lN) r3
            java.lang.String r0 = "userStatusMute"
            X.2nY r0 = r3.A00(r0)
            X.2Cj r0 = (X.C45972Cj) r0
            if (r0 != 0) goto L_0x0043
            java.util.Set r0 = java.util.Collections.emptySet()
        L_0x003d:
            if (r2 == 0) goto L_0x0069
            r1.A0R(r0)
        L_0x0042:
            return
        L_0x0043:
            X.11P r0 = r0.A00
            long r7 = X.AnonymousClass11P.A01(r0)
            r0 = 1
            X.C18070vi.A0d(r5, r0)
            r4 = 0
            r10 = 0
            X.2Dy r3 = new X.2Dy
            r6 = r4
            r3.<init>(r4, r5, r6, r7, r9, r10)
            java.util.List r0 = java.util.Collections.singletonList(r3)
            java.util.Set r0 = r1.A0D(r0)
            goto L_0x003d
        L_0x005e:
            boolean r2 = r0.A11(r5)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "StatusViewingSettings/cancel-mute-user-status returned "
            goto L_0x001f
        L_0x0069:
            r1.A0Q(r0)
            return
        L_0x006d:
            boolean r0 = r14.A04
            if (r0 == 0) goto L_0x007d
            java.lang.Object r1 = r14.A02
            X.3Lx r1 = (X.C72423Lx) r1
            java.lang.Object r0 = r14.A01
            X.CrF r0 = (X.C26048CrF) r0
            r1.Btk(r0)
            return
        L_0x007d:
            boolean r2 = r14.A03
            java.lang.Object r1 = r14.A02
            X.3Lx r1 = (X.C72423Lx) r1
            java.lang.Object r0 = r14.A01
            X.CrF r0 = (X.C26048CrF) r0
            if (r2 == 0) goto L_0x008d
            r1.Bnn()
            return
        L_0x008d:
            r1.Bz5(r0)
            return
        L_0x0091:
            java.lang.Object r4 = r14.A01
            X.1kd r4 = (X.C34531kd) r4
            java.lang.Object r7 = r14.A02
            X.2tS r7 = (X.C63642tS) r7
            boolean r3 = r14.A03
            boolean r12 = r14.A04
            java.util.concurrent.CopyOnWriteArrayList r0 = r7.A03
            java.util.Iterator r2 = X.C29431cG.A0o(r0)
            r8 = 0
        L_0x00a4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00c4
            X.206 r1 = X.C17880vN.A0Y(r2)
            X.1Qe r0 = r4.A08
            r0.A05(r1)
            if (r8 != 0) goto L_0x00a4
            X.36u r0 = r1.A0O()
            if (r0 == 0) goto L_0x00a4
            X.36u r0 = r1.A0O()
            byte[] r8 = r0.A01()
            goto L_0x00a4
        L_0x00c4:
            X.1hs r4 = r4.A0C
            boolean r1 = r7.A05()
            boolean r0 = r7.A04()
            X.2qf r6 = new X.2qf
            r6.<init>(r3, r1, r0)
            r5 = 0
            java.util.concurrent.Executor r2 = r4.A0T
            r1 = 16
            X.7Qr r0 = new X.7Qr
            r0.<init>(r4, r7, r1)
            r2.execute(r0)
            r9 = 0
            r13 = 1
            X.3CY r3 = new X.3CY
            r11 = r9
            r10 = r9
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            X.3DM r0 = r4.A0N
            if (r0 == 0) goto L_0x00f1
            r0.execute(r3)
            return
        L_0x00f1:
            X.10I r0 = r4.A0M
            r0.CGF(r3)
            return
        L_0x00f7:
            java.lang.Object r6 = r14.A01
            X.1iW r6 = (X.C33251iW) r6
            boolean r5 = r14.A03
            boolean r4 = r14.A04
            java.lang.Object r3 = r14.A02
            java.util.Collection r3 = (java.util.Collection) r3
            if (r4 == 0) goto L_0x0117
            X.0ve r2 = r6.A0c
            r1 = 9868(0x268c, float:1.3828E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0117
            X.122 r0 = r6.A0U
            r0.A0W(r3, r5, r4)
            return
        L_0x0117:
            X.1To r2 = r6.A0C
            java.util.Set r1 = r2.A0F(r3, r5)
            X.122 r0 = r6.A0U
            r0.A0W(r3, r5, r4)
            r2.A0R(r1)
            return
        L_0x0126:
            java.lang.Object r0 = r14.A01
            X.2jP r0 = (X.C57642jP) r0
            boolean r5 = r14.A03
            boolean r4 = r14.A04
            java.lang.Object r3 = r14.A02
            java.lang.Integer r3 = (java.lang.Integer) r3
            X.18K r2 = r0.A00
            X.2Hl r1 = new X.2Hl
            r1.<init>()
            r0 = 67
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A02 = r0
            r0 = r5 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A01 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r1.A00 = r0
            r1.A05 = r3
            java.lang.String r0 = X.C50542Uv.A00()
            r1.A0E = r0
            r2.CC7(r1)
            return
        L_0x015b:
            java.lang.Object r4 = r14.A01
            X.3RI r4 = (X.AnonymousClass3RI) r4
            boolean r3 = r14.A03
            boolean r2 = r14.A04
            java.lang.Object r1 = r14.A02
            X.0vk r1 = (X.C18090vk) r1
            r0 = 0
            r4.A04 = r0
            r4.A06(r1, r3, r2)
            return
        L_0x016e:
            java.lang.Object r3 = r14.A01
            X.1RK r3 = (X.AnonymousClass1RK) r3
            java.lang.Object r2 = r14.A02
            X.10f r2 = (X.C199410f) r2
            boolean r1 = r14.A03
            X.1MQ r0 = r3.A0H
            r0.A0A(r2, r1)
            java.util.Set r0 = r3.A0N
            r0.removeAll(r2)
            X.11S r0 = r3.A09
            boolean r0 = r0.A0N()
            if (r0 != 0) goto L_0x019c
            X.0zA r1 = r3.A05
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x019c
            r1.A03()
            java.lang.String r0 = "logoutAgentDeviceJids"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x019c:
            r0 = 38
            X.AnonymousClass35V.A00(r3, r2, r0)
            return
        L_0x01a2:
            java.lang.Object r6 = r14.A01
            X.1PT r6 = (X.AnonymousClass1PT) r6
            java.lang.Object r1 = r14.A02
            X.1BI r1 = (X.AnonymousClass1BI) r1
            boolean r5 = r14.A03
            boolean r4 = r14.A04
            X.1M9 r0 = r6.A05
            X.1E7 r0 = r0.A0E(r1)
            if (r0 == 0) goto L_0x01e4
            int r0 = r0.A03
            r3 = 1
            if (r0 != r3) goto L_0x01e4
        L_0x01bb:
            X.2Hd r2 = new X.2Hd
            r2.<init>()
            r1 = 2
            r0 = 1
            if (r5 == 0) goto L_0x01c5
            r0 = 2
        L_0x01c5:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A02 = r0
            r0 = 1
            if (r4 == 0) goto L_0x01cf
            r0 = 2
        L_0x01cf:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A01 = r0
            if (r3 != 0) goto L_0x01d8
            r1 = 1
        L_0x01d8:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r2.A00 = r0
            X.18K r0 = r6.A0C
            r0.CC7(r2)
            return
        L_0x01e4:
            r3 = 0
            goto L_0x01bb
        L_0x01e6:
            java.lang.Object r0 = r14.A01
            X.1gy r0 = (X.C32301gy) r0
            java.lang.Object r3 = r14.A02
            X.205 r3 = (X.AnonymousClass205) r3
            boolean r2 = r14.A03
            boolean r1 = r14.A04
            X.1gx r0 = r0.A00
            r0.A0D(r3, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70753Cj.run():void");
    }

    public C70753Cj(Object obj, Object obj2, int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A01 = obj;
        this.A04 = z;
        this.A02 = obj2;
        this.A03 = z2;
    }
}
