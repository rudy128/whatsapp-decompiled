package X;

/* renamed from: X.AWd  reason: case insensitive filesystem */
public class C20723AWd implements C23691Hg {
    public final int A00;
    public final Object A01;

    public C20723AWd(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r2v38, types: [X.9yu, java.lang.Object, X.96D] */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x036c, code lost:
        ((com.whatsapp.payments.ui.PaymentTransactionHistoryActivity) r2.A01).A4b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0373, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0374, code lost:
        ((X.AXQ) r2.A01).A01(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x037c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0392, code lost:
        X.C18070vi.A0d(r3, 0);
        X.AnonymousClass8Gd.A00(r3, (X.AnonymousClass8Gd) r2.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x039d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x010b, code lost:
        ((X.C161588Gc) r2.A01).A0c(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0112, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0123, code lost:
        if (r4 != 421) goto L_0x010b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CGE(java.lang.Object r16) {
        /*
            r15 = this;
            r2 = r16
            int r0 = r15.A00
            switch(r0) {
                case 0: goto L_0x0353;
                case 1: goto L_0x0349;
                case 2: goto L_0x033f;
                case 3: goto L_0x0333;
                case 4: goto L_0x0327;
                case 5: goto L_0x0317;
                case 6: goto L_0x0306;
                case 7: goto L_0x02fc;
                case 8: goto L_0x02f2;
                case 9: goto L_0x02e8;
                case 10: goto L_0x02de;
                case 11: goto L_0x02cd;
                case 12: goto L_0x02c3;
                case 13: goto L_0x02b9;
                case 14: goto L_0x020f;
                case 15: goto L_0x02af;
                case 16: goto L_0x02a5;
                case 17: goto L_0x0292;
                case 18: goto L_0x0288;
                case 19: goto L_0x027e;
                case 20: goto L_0x0274;
                case 21: goto L_0x026a;
                case 22: goto L_0x01c8;
                case 23: goto L_0x01a8;
                case 24: goto L_0x00fe;
                case 25: goto L_0x00f0;
                case 26: goto L_0x0256;
                case 27: goto L_0x0229;
                case 28: goto L_0x0029;
                case 29: goto L_0x0011;
                case 30: goto L_0x021f;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r15.A01
            X.9Bw r0 = (X.C178119Bw) r0
            X.1IV r2 = (X.AnonymousClass1IV) r2
            r2.Bn7(r0)
        L_0x0010:
            return
        L_0x0011:
            java.lang.Object r1 = r15.A01
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            X.ANs r2 = (X.C20507ANs) r2
            r0 = 1
            X.C18070vi.A0d(r2, r0)
            com.whatsapp.biz.catalog.view.CatalogMediaCard r0 = r2.A04
            com.whatsapp.jid.UserJid r0 = r0.A06
            boolean r0 = X.C42171xk.A00(r0, r1)
            if (r0 == 0) goto L_0x0010
            r2.BuR(r1)
            return
        L_0x0029:
            java.lang.Object r13 = r15.A01
            X.2n5 r13 = (X.C59912n5) r13
            X.B5x r2 = (X.C22394B5x) r2
            X.Ade r2 = (X.C21048Ade) r2
            int r0 = r2.A00
            java.lang.Object r6 = r2.A01
            if (r0 == 0) goto L_0x008b
            X.8ff r6 = (X.C167228ff) r6
            X.9kM r0 = r6.A01
            if (r0 == 0) goto L_0x0010
            X.2rU r0 = r6.A0W
            X.2h8 r3 = r0.A02
            X.1So r0 = r3.A06
            java.lang.String r7 = r0.A02
            r5 = 0
            r4 = 1
            java.util.List r2 = r13.A0C
            java.lang.String r0 = "fallback"
            X.2kD r1 = X.C696437z.A00(r0, r7, r5, r2, r4)
            java.lang.String r0 = "primary"
            X.2kD r2 = X.C696437z.A00(r0, r7, r5, r2, r4)
            if (r2 != 0) goto L_0x0058
            r2 = r1
        L_0x0058:
            X.9kM r0 = r6.A01
            X.BCG r0 = r0.A00
            X.9nA r1 = r0.BQ1()
            java.util.concurrent.atomic.AtomicReference r0 = r6.A05
            java.lang.Object r5 = r0.get()
            X.A7N r5 = (X.A7N) r5
            if (r1 == 0) goto L_0x0010
            if (r2 == 0) goto L_0x0010
            java.lang.String r1 = r1.A07
            java.lang.String r0 = r2.A04
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0010
            if (r5 == 0) goto L_0x0010
            long r3 = r3.A03
            long r0 = r6.A0m
            long r3 = r3 - r0
            r1 = 52428800(0x3200000, double:2.5903269E-316)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0010
            java.util.concurrent.atomic.AtomicBoolean r1 = r5.A0I
        L_0x0086:
            r0 = 1
            r1.set(r0)
            return
        L_0x008b:
            X.5ti r6 = (X.C115295ti) r6
            X.9kM r0 = r6.A00
            if (r0 == 0) goto L_0x0010
            X.0ve r12 = r6.A0Q
            X.11P r14 = r6.A0L
            X.190 r11 = r6.A0A
            X.6zF r1 = r6.A0e
            X.1So r0 = r1.A0A
            java.lang.String r10 = r0.A02
            java.lang.String r9 = r1.A0G
            java.lang.String r8 = r1.A0F
            int r1 = r1.A03
            r0 = 2
            boolean r2 = X.AnonymousClass000.A1T(r0, r1)
            r7 = 0
            java.util.List r5 = r13.A0C
            java.lang.String r0 = "fallback"
            r4 = 0
            X.2kD r3 = X.C696437z.A00(r0, r10, r4, r5, r7)
            java.lang.String r1 = "primary"
            java.lang.String r0 = X.C696437z.A03(r14, r12, r8, r10, r2)
            if (r0 != 0) goto L_0x00c2
            if (r9 == 0) goto L_0x00c8
            java.lang.String r0 = X.C696437z.A02(r11, r12, r13, r9)
            if (r0 == 0) goto L_0x00c8
        L_0x00c2:
            X.2kD r2 = X.C696437z.A00(r1, r10, r0, r5, r7)
            if (r2 != 0) goto L_0x00d7
        L_0x00c8:
            java.lang.String r0 = "0"
            X.2kD r2 = X.C696437z.A00(r1, r10, r0, r5, r7)
            if (r2 != 0) goto L_0x00d7
            X.2kD r2 = X.C696437z.A00(r1, r10, r4, r5, r7)
            if (r2 != 0) goto L_0x00d7
            r2 = r3
        L_0x00d7:
            X.9kM r0 = r6.A00
            X.BCG r0 = r0.A00
            X.9nA r0 = r0.BQ1()
            if (r0 == 0) goto L_0x0010
            if (r2 == 0) goto L_0x0010
            java.lang.String r1 = r0.A07
            java.lang.String r0 = r2.A04
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0010
            java.util.concurrent.atomic.AtomicBoolean r1 = r6.A0z
            goto L_0x0086
        L_0x00f0:
            java.lang.Object r3 = r15.A01
            X.AW0 r3 = (X.AW0) r3
            X.B5S r2 = (X.B5S) r2
            X.AXo r2 = (X.C20759AXo) r2
            int r0 = r2.A00
            switch(r0) {
                case 3: goto L_0x036c;
                case 4: goto L_0x0392;
                case 5: goto L_0x0374;
                case 6: goto L_0x010b;
                case 7: goto L_0x035d;
                case 8: goto L_0x010b;
                default: goto L_0x00fd;
            }
        L_0x00fd:
            return
        L_0x00fe:
            java.lang.Object r3 = r15.A01
            X.AW0 r3 = (X.AW0) r3
            X.B5S r2 = (X.B5S) r2
            X.AXo r2 = (X.C20759AXo) r2
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L_0x013c;
                case 1: goto L_0x016e;
                case 2: goto L_0x037d;
                case 3: goto L_0x036c;
                case 4: goto L_0x0392;
                case 5: goto L_0x0374;
                case 6: goto L_0x0113;
                case 7: goto L_0x039e;
                default: goto L_0x010b;
            }
        L_0x010b:
            java.lang.Object r0 = r2.A01
            X.8Gc r0 = (X.C161588Gc) r0
            r0.A0c(r3)
            return
        L_0x0113:
            int r4 = r3.A02
            r1 = 402(0x192, float:5.63E-43)
            if (r4 == r1) goto L_0x0126
            r0 = 409(0x199, float:5.73E-43)
            if (r4 == r0) goto L_0x0133
            r0 = 411(0x19b, float:5.76E-43)
            if (r4 == r0) goto L_0x0133
            r0 = 421(0x1a5, float:5.9E-43)
            if (r4 == r0) goto L_0x0133
            goto L_0x010b
        L_0x0126:
            java.lang.Object r0 = r2.A01
            X.8Gc r0 = (X.C161588Gc) r0
            X.9NU r0 = r0.A06
            X.AW0 r0 = r0.A01
            int r0 = r0.A02
            if (r0 != r1) goto L_0x0133
            return
        L_0x0133:
            java.lang.Object r1 = r2.A01
            X.8Gc r1 = (X.C161588Gc) r1
            r0 = 0
            r1.A0q(r0)
            goto L_0x010b
        L_0x013c:
            java.lang.Object r4 = r2.A01
            X.9ex r4 = (X.C186909ex) r4
            X.1DT r0 = r4.A01
            r0.A0F(r3)
            int r1 = r3.A02
            r0 = 401(0x191, float:5.62E-43)
            if (r1 == r0) goto L_0x0010
            java.lang.Integer r0 = X.AnonymousClass1R2.A05(r3)
            int r3 = r0.intValue()
            r2 = 3
            r1 = 0
            r0 = 1
            if (r3 == r0) goto L_0x0167
            r2 = 2
            if (r3 == r2) goto L_0x0167
            if (r3 != r1) goto L_0x0010
            X.1DT r1 = r4.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0163:
            r1.A0F(r0)
            return
        L_0x0167:
            X.1DT r1 = r4.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            goto L_0x0163
        L_0x016e:
            int r1 = r3.A02
            r0 = 401(0x191, float:5.62E-43)
            if (r1 == r0) goto L_0x0010
            boolean r0 = r3.A0L()
            if (r0 == 0) goto L_0x0195
            java.lang.Object r4 = r2.A01
            com.whatsapp.payments.ui.BrazilPaymentActivity r4 = (com.whatsapp.payments.ui.BrazilPaymentActivity) r4
            X.90Y r3 = r4.A0O
            int r2 = r4.A00
            r0 = 2
        L_0x0183:
            r3.A02(r2, r0)
            r0 = 0
            r4.A0n = r0
            X.00H r0 = r4.A0i
            X.10T r1 = X.C17880vN.A0V(r0)
            X.B5S r0 = r4.A0p
            r1.unregisterObserver(r0)
            return
        L_0x0195:
            int r1 = r3.A02
            r0 = 402(0x192, float:5.63E-43)
            java.lang.Object r4 = r2.A01
            com.whatsapp.payments.ui.BrazilPaymentActivity r4 = (com.whatsapp.payments.ui.BrazilPaymentActivity) r4
            X.90Y r3 = r4.A0O
            int r2 = r4.A00
            if (r1 != r0) goto L_0x01a6
            r0 = 49
            goto L_0x0183
        L_0x01a6:
            r0 = 3
            goto L_0x0183
        L_0x01a8:
            java.lang.Object r3 = r15.A01
            X.9go r3 = (X.C188059go) r3
            X.9bV r2 = (X.C184779bV) r2
            X.9nS r1 = r2.A01
            X.8yw r2 = r2.A00
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x0010
            r0 = 1
            r1.A02 = r0
            r1.A00 = r3
            X.1QE r1 = r2.A0D
            java.lang.String r0 = "sendAddCard"
            r1.A06(r0)
            X.10I r0 = r2.A0K
            X.C17890vO.A0u(r2, r0)
            return
        L_0x01c8:
            java.lang.Object r7 = r15.A01
            X.9sc r7 = (X.C194989sc) r7
            X.BDJ r2 = (X.BDJ) r2
            r6 = 0
            r5 = 1
            X.C18070vi.A0d(r2, r5)
            X.AW8 r2 = (X.AW8) r2
            com.whatsapp.migration.transfer.ui.ChatTransferViewModel r4 = r2.A00
            boolean r0 = r4.A04
            r3 = 0
            if (r0 == 0) goto L_0x0201
            boolean r0 = r4.A06
            if (r0 != 0) goto L_0x01e1
            r3 = 5
        L_0x01e1:
            r2 = 2131888243(0x7f120873, float:1.9411116E38)
            int r1 = r7.A01
            r0 = 100
            int r0 = r0 - r3
            int r1 = r1 * r0
            int r0 = r1 / 100
            int r3 = r3 + r0
            r4.A0n(r2, r3)
        L_0x01f0:
            java.lang.Integer r0 = r4.A03
            if (r0 == 0) goto L_0x01fa
            int r0 = r0.intValue()
            if (r0 == r5) goto L_0x0010
        L_0x01fa:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r4.A03 = r0
            return
        L_0x0201:
            r1 = 2131888236(0x7f12086c, float:1.9411102E38)
            int r0 = r7.A01
            int r0 = r0 * 95
            int r0 = r0 / 100
            int r6 = r6 + r0
            r4.A0n(r1, r6)
            goto L_0x01f0
        L_0x020f:
            X.9Xg r2 = (X.C183179Xg) r2
            X.AmK r1 = r2.A00
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.9nG r0 = r1.A00
            if (r0 == 0) goto L_0x0010
            r0.A00()
            return
        L_0x021f:
            java.lang.Object r0 = r15.A01
            X.9Bw r0 = (X.C178119Bw) r0
            X.1IV r2 = (X.AnonymousClass1IV) r2
            r2.BnJ(r0)
            return
        L_0x0229:
            java.lang.Object r0 = r15.A01
            X.1Vx r0 = (X.C27391Vx) r0
            X.9Yt r2 = (X.C183569Yt) r2
            r6 = 0
            r5 = 1
            X.C18070vi.A0d(r2, r5)
            int r4 = r0.A00
            int r3 = r0.A01
            X.8GT r2 = r2.A00
            X.1DT r1 = r2.A02
            r0 = 2
            int[] r0 = new int[r0]
            r0[r6] = r4
            r0[r5] = r3
            r1.A0E(r0)
            java.lang.String r0 = "DirectTransferBackgroundTaskViewModel/removeAllListener"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.os.Handler r1 = r2.A00
            java.lang.Runnable r0 = r2.A07
            r1.removeCallbacks(r0)
            X.AnonymousClass8GT.A03(r2)
            return
        L_0x0256:
            java.lang.Object r1 = r15.A01
            java.util.List r1 = (java.util.List) r1
            X.2LR r2 = (X.AnonymousClass2LR) r2
            r0 = 1
            X.C18070vi.A0d(r2, r0)
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            r0 = 26
            X.C17890vO.A0s(r2, r1, r0)
            return
        L_0x026a:
            java.lang.Object r0 = r15.A01
            X.2tQ r0 = (X.C63622tQ) r0
            X.1d9 r2 = (X.C29951d9) r2
            r2.C67(r0)
            return
        L_0x0274:
            java.lang.Object r0 = r15.A01
            X.2tQ r0 = (X.C63622tQ) r0
            X.1d9 r2 = (X.C29951d9) r2
            r2.C69(r0)
            return
        L_0x027e:
            java.lang.Object r0 = r15.A01
            X.2tQ r0 = (X.C63622tQ) r0
            X.1d9 r2 = (X.C29951d9) r2
            r2.BsQ(r0)
            return
        L_0x0288:
            java.lang.Object r0 = r15.A01
            X.2tQ r0 = (X.C63622tQ) r0
            X.1d9 r2 = (X.C29951d9) r2
            r2.C68(r0)
            return
        L_0x0292:
            java.lang.Object r1 = r15.A01
            X.9XI r2 = (X.AnonymousClass9XI) r2
            X.C18070vi.A0h(r1, r2)
            X.8Fn r0 = r2.A00
            X.0vl r0 = r0.A00
            X.1DS r0 = X.C108945cZ.A0Q(r0)
            r0.A0E(r1)
            return
        L_0x02a5:
            java.lang.Object r0 = r15.A01
            X.1ch r0 = (X.C29681ch) r0
            X.1WR r2 = (X.AnonymousClass1WR) r2
            r2.BzC(r0)
            return
        L_0x02af:
            java.lang.Object r0 = r15.A01
            java.util.List r0 = (java.util.List) r0
            X.B7w r2 = (X.C22440B7w) r2
            r2.Bm5(r0)
            return
        L_0x02b9:
            java.lang.Object r0 = r15.A01
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            X.1Gv r2 = (X.C23581Gv) r2
            r2.Bpw(r0)
            return
        L_0x02c3:
            java.lang.Object r0 = r15.A01
            X.231 r0 = (X.AnonymousClass231) r0
            X.1Rv r2 = (X.C26361Rv) r2
            r2.Btg(r0)
            return
        L_0x02cd:
            java.lang.Object r4 = r15.A01
            X.4WT r2 = (X.AnonymousClass4WT) r2
            com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity r3 = r2.A00
            r1 = 48
            X.4rk r0 = new X.4rk
            r0.<init>(r2, r4, r1)
            r3.runOnUiThread(r0)
            return
        L_0x02de:
            java.lang.Object r0 = r15.A01
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            X.BDF r2 = (X.BDF) r2
            r2.C08(r0)
            return
        L_0x02e8:
            java.lang.Object r0 = r15.A01
            X.4Sa r0 = (X.C86534Sa) r0
            X.BDF r2 = (X.BDF) r2
            r2.BnL(r0)
            return
        L_0x02f2:
            java.lang.Object r0 = r15.A01
            X.4cJ r0 = (X.C89344cJ) r0
            X.BDF r2 = (X.BDF) r2
            r2.BmO(r0)
            return
        L_0x02fc:
            java.lang.Object r0 = r15.A01
            X.4Sa r0 = (X.C86534Sa) r0
            X.BDF r2 = (X.BDF) r2
            r2.BnM(r0)
            return
        L_0x0306:
            java.lang.Object r1 = r15.A01
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            X.1M6 r2 = (X.AnonymousClass1M6) r2
            r0 = 1
            X.C18070vi.A0d(r2, r0)
            r2.Bmw(r1)
            r2.Bmt(r1)
            return
        L_0x0317:
            java.lang.Object r1 = r15.A01
            X.AEW r1 = (X.AEW) r1
            X.1M6 r2 = (X.AnonymousClass1M6) r2
            r0 = 1
            X.C18070vi.A0d(r2, r0)
            com.whatsapp.jid.UserJid r0 = r1.A09
            r2.Bmw(r0)
            return
        L_0x0327:
            java.lang.Object r0 = r15.A01
            X.8yN r0 = (X.C175238yN) r0
            X.1oZ r2 = (X.C36851oZ) r2
            int r0 = r0.A00
            r2.BmK(r0)
            return
        L_0x0333:
            java.lang.Object r0 = r15.A01
            X.8yN r0 = (X.C175238yN) r0
            X.1oZ r2 = (X.C36851oZ) r2
            int r0 = r0.A01
            r2.By5(r0)
            return
        L_0x033f:
            java.lang.Object r0 = r15.A01
            com.whatsapp.jid.DeviceJid r0 = (com.whatsapp.jid.DeviceJid) r0
            X.BCN r2 = (X.BCN) r2
            r2.Bvj(r0)
            return
        L_0x0349:
            java.lang.Object r0 = r15.A01
            com.whatsapp.jid.DeviceJid r0 = (com.whatsapp.jid.DeviceJid) r0
            X.BCN r2 = (X.BCN) r2
            r2.Bvi(r0)
            return
        L_0x0353:
            java.lang.Object r0 = r15.A01
            com.whatsapp.jid.DeviceJid r0 = (com.whatsapp.jid.DeviceJid) r0
            X.BCN r2 = (X.BCN) r2
            r2.Bvk(r0)
            return
        L_0x035d:
            java.lang.Object r2 = r2.A01
            X.8Gc r2 = (X.C161588Gc) r2
            X.1QE r1 = r2.A0g
            java.lang.String r0 = "IN- HANDLE_SEND_AGAIN IndiaUpiPaymentTransactionDetailsViewModel#getPaymentTransactionObserver() trying to load the added txn"
            r1.A06(r0)
            r2.A0c(r3)
            return
        L_0x036c:
            java.lang.Object r0 = r2.A01
            com.whatsapp.payments.ui.PaymentTransactionHistoryActivity r0 = (com.whatsapp.payments.ui.PaymentTransactionHistoryActivity) r0
            r0.A4b()
            return
        L_0x0374:
            java.lang.Object r1 = r2.A01
            X.AXQ r1 = (X.AXQ) r1
            r0 = 0
            r1.A01(r0)
            return
        L_0x037d:
            java.lang.Object r2 = r2.A01
            com.whatsapp.payments.ui.IndiaUpiMandateHistoryActivity r2 = (com.whatsapp.payments.ui.IndiaUpiMandateHistoryActivity) r2
            X.1QE r1 = r2.A05
            java.lang.String r0 = "payment transaction updated"
            r1.A04(r0)
            com.whatsapp.payments.ui.viewmodel.IndiaUpiMandateHistoryViewModel r2 = r2.A01
            X.10I r1 = r2.A06
            r0 = 43
            X.C21427Aju.A00(r1, r2, r0)
            return
        L_0x0392:
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            java.lang.Object r0 = r2.A01
            X.8Gd r0 = (X.AnonymousClass8Gd) r0
            X.AnonymousClass8Gd.A00(r3, r0)
            return
        L_0x039e:
            java.lang.Object r4 = r2.A01
            X.96K r4 = (X.AnonymousClass96K) r4
            X.1QE r1 = r4.A0g
            java.lang.String r0 = "IN- HANDLE_SEND_AGAIN IndiaUpiPaymentTransactionDetailsViewModel#getPaymentTransactionObserver() txn update event is called"
            r1.A06(r0)
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x03e7
            if (r3 == 0) goto L_0x03e7
            boolean r0 = r3.A0F()
            if (r0 == 0) goto L_0x03e7
            r0 = 101(0x65, float:1.42E-43)
            X.96D r2 = new X.96D
            r2.<init>(r0)
            java.lang.String r0 = r3.A0L
            r2.A03 = r0
            java.lang.String r0 = r4.A0C
            r2.A06 = r0
            boolean r0 = r3.A0L()
            if (r0 == 0) goto L_0x03e4
            java.lang.String r0 = "SUCCESS"
        L_0x03cc:
            r2.A05 = r0
            java.lang.String r1 = r3.A0J
            r0 = 0
            int r0 = X.C20099A7c.A01(r1, r0)
            if (r0 == 0) goto L_0x03e1
            java.lang.String r0 = "U13"
        L_0x03d9:
            r2.A04 = r0
            X.1wy r0 = r4.A08
            r0.A0F(r2)
            return
        L_0x03e1:
            java.lang.String r0 = "00"
            goto L_0x03d9
        L_0x03e4:
            java.lang.String r0 = "FAILURE"
            goto L_0x03cc
        L_0x03e7:
            java.lang.String r0 = "IN- HANDLE_SEND_AGAIN IndiaUpiPaymentTransactionDetailsViewModel#getPaymentTransactionObserver() trying to reload the updated txn"
            r1.A06(r0)
            r4.A0c(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20723AWd.CGE(java.lang.Object):void");
    }
}
