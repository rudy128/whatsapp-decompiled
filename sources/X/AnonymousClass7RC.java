package X;

/* renamed from: X.7RC  reason: invalid class name */
public class AnonymousClass7RC implements Runnable {
    public final int A00;
    public final Object A01;

    public AnonymousClass7RC(C121386Jl r2) {
        this.A00 = 34;
        this.A01 = AnonymousClass3MW.A0z(r2);
    }

    public static AnonymousClass7RC A00(Object obj, int i) {
        return new AnonymousClass7RC(obj, i);
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.6Ui, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0035, code lost:
        r3.postDelayed(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0333, code lost:
        if (r9 != null) goto L_0x0335;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03db, code lost:
        r1 = r1.getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03df, code lost:
        r2.A0G(r1, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03e3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0281, code lost:
        r4.A0J(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0284, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x034e  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0585  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x0594  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r19 = this;
            r4 = r19
            int r0 = r4.A00
            switch(r0) {
                case 0: goto L_0x0057;
                case 1: goto L_0x02c0;
                case 2: goto L_0x0086;
                case 3: goto L_0x00a9;
                case 4: goto L_0x0007;
                case 5: goto L_0x00d3;
                case 6: goto L_0x00a9;
                case 7: goto L_0x0086;
                case 8: goto L_0x0007;
                case 9: goto L_0x02e6;
                case 10: goto L_0x0311;
                case 11: goto L_0x00e3;
                case 12: goto L_0x03b7;
                case 13: goto L_0x03c8;
                case 14: goto L_0x03d2;
                case 15: goto L_0x03e4;
                case 16: goto L_0x03f0;
                case 17: goto L_0x0180;
                case 18: goto L_0x01c3;
                case 19: goto L_0x03f8;
                case 20: goto L_0x0402;
                case 21: goto L_0x054b;
                case 22: goto L_0x01ed;
                case 23: goto L_0x055b;
                case 24: goto L_0x003c;
                case 25: goto L_0x0564;
                case 26: goto L_0x0609;
                case 27: goto L_0x0621;
                case 28: goto L_0x0208;
                case 29: goto L_0x0223;
                case 30: goto L_0x023d;
                case 31: goto L_0x062a;
                case 32: goto L_0x0632;
                case 33: goto L_0x024e;
                case 34: goto L_0x0285;
                case 35: goto L_0x063a;
                case 36: goto L_0x0650;
                case 37: goto L_0x065e;
                case 38: goto L_0x0666;
                case 39: goto L_0x06a4;
                case 40: goto L_0x06ba;
                case 41: goto L_0x06da;
                case 42: goto L_0x0705;
                case 43: goto L_0x072a;
                case 44: goto L_0x02a8;
                case 45: goto L_0x02b9;
                case 46: goto L_0x073b;
                case 47: goto L_0x074b;
                case 48: goto L_0x075d;
                case 49: goto L_0x0775;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r4 = r4.A01
            X.5dl r4 = (X.C109635dl) r4
            int r0 = r4.A01
            if (r0 <= 0) goto L_0x0039
            float r3 = r4.A00
            float r0 = (float) r0
            float r3 = r3 / r0
        L_0x0013:
            r0 = 0
            r4.A00 = r0
            r0 = 0
            r4.A01 = r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x002a
            android.os.Handler r2 = r4.A06
            r1 = 2
            X.7Pg r0 = new X.7Pg
            r0.<init>(r4, r3, r1)
            r2.post(r0)
        L_0x002a:
            android.os.Handler r3 = r4.A03
            if (r3 == 0) goto L_0x0038
            r0 = 4
            X.7RC r2 = A00(r4, r0)
            long r0 = r4.A05
        L_0x0035:
            r3.postDelayed(r2, r0)
        L_0x0038:
            return
        L_0x0039:
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x0013
        L_0x003c:
            java.lang.Object r2 = r4.A01
            com.whatsapp.twofactor.SettingsTwoFactorAuthActivity r2 = (com.whatsapp.twofactor.SettingsTwoFactorAuthActivity) r2
            X.1eh r0 = r2.A0B
            java.lang.String r0 = r0.A02()
            boolean r0 = r0.isEmpty()
            r1 = r0 ^ 1
            X.1KB r4 = r2.A05
            r0 = 42
            X.3Cp r3 = new X.3Cp
            r3.<init>((int) r0, (java.lang.Object) r2, (boolean) r1)
            goto L_0x0281
        L_0x0057:
            java.lang.Object r0 = r4.A01
            X.5dl r0 = (X.C109635dl) r0
            java.lang.ref.WeakReference r0 = r0.A09
            java.lang.Object r2 = r0.get()
            X.7Mt r2 = (X.C145827Mt) r2
            if (r2 == 0) goto L_0x0038
            X.1FR r1 = r2.A0F
            r0 = 2131890014(0x7f120f5e, float:1.9414708E38)
            r1.BhQ(r0)
            com.whatsapp.statuscomposer.composer.TextStatusComposerFragment r1 = r2.A03
            if (r1 == 0) goto L_0x0081
            X.7J1 r0 = r1.A0n
            if (r0 == 0) goto L_0x0078
            X.AnonymousClass7J1.A01(r0)
        L_0x0078:
            X.886 r0 = com.whatsapp.statuscomposer.composer.TextStatusComposerFragment.A00(r1)
            if (r0 == 0) goto L_0x0081
            r0.CAO()
        L_0x0081:
            r0 = 1
            X.C145827Mt.A03(r2, r0)
            return
        L_0x0086:
            java.lang.Object r5 = r4.A01
            X.5dl r5 = (X.C109635dl) r5
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r0 = r5.A02
            long r3 = r3 - r0
            android.os.Handler r2 = r5.A06
            r1 = 26
            X.7Ph r0 = new X.7Ph
            r0.<init>(r5, r3, r1)
            r2.post(r0)
            android.os.Handler r3 = r5.A03
            if (r3 == 0) goto L_0x0038
            r0 = 2
            X.7RC r2 = A00(r5, r0)
            r0 = 150(0x96, double:7.4E-322)
            goto L_0x0035
        L_0x00a9:
            java.lang.Object r2 = r4.A01
            X.5dl r2 = (X.C109635dl) r2
            X.72K r0 = r2.A04
            if (r0 == 0) goto L_0x00c6
            float r1 = r0.A02()
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x00c6
            float r0 = r2.A00
            float r0 = r0 + r1
            r2.A00 = r0
            int r0 = r2.A01
            int r0 = r0 + 1
            r2.A01 = r0
        L_0x00c6:
            android.os.Handler r3 = r2.A03
            if (r3 == 0) goto L_0x0038
            r0 = 3
            X.7RC r2 = A00(r2, r0)
            r0 = 16
            goto L_0x0035
        L_0x00d3:
            java.lang.Object r5 = r4.A01
            X.5dl r5 = (X.C109635dl) r5
            X.72K r0 = r5.A04
            if (r0 != 0) goto L_0x0038
            X.7OG r6 = new X.7OG
            r6.<init>(r5)
            r4 = 1
            goto L_0x07a0
        L_0x00e3:
            java.lang.Object r0 = r4.A01
            X.1iK r0 = (X.C33131iK) r0
            r8 = 0
            X.C18070vi.A0d(r0, r8)
            X.1iH r5 = r0.A02
            X.3IR r4 = new X.3IR
            r4.<init>(r0)
            X.1i9 r3 = r5.A00
            X.1Nd r0 = r3.A03
            java.util.ArrayList r0 = r0.A06()
            X.4so r6 = X.C29431cG.A0V(r0)
            X.0ve r2 = r3.A04
            r1 = 10583(0x2957, float:1.483E-41)
            X.0vf r0 = X.C18040vf.A02
            int r2 = X.C18020vd.A00(r0, r2, r1)
            if (r2 < 0) goto L_0x082c
            if (r2 != 0) goto L_0x017a
            X.3Dx r1 = X.C71133Dx.A00
        L_0x010e:
            X.81S r0 = new X.81S
            r0.<init>(r3)
            X.7Sa r1 = X.AnonymousClass1b2.A0A(r0, r1)
            X.83u r0 = X.C1592483u.A00
            X.7Sa r1 = X.AnonymousClass1b2.A09(r0, r1)
            X.83v r0 = X.C1592583v.A00
            X.7Sa r1 = X.AnonymousClass1b2.A0A(r0, r1)
            X.81T r0 = new X.81T
            r0.<init>(r3)
            X.7Sa r2 = X.AnonymousClass1b2.A09(r0, r1)
            X.11S r0 = r3.A00
            com.whatsapp.jid.PhoneUserJid r1 = X.AnonymousClass11S.A00(r0)
            r0 = 2
            X.1JQ[] r6 = new X.AnonymousClass1JQ[r0]
            r6[r8] = r2
            r3 = 1
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r2[r8] = r1
            r1 = 3
            X.4so r0 = new X.4so
            r0.<init>(r2, r1)
            r6[r3] = r0
            X.4so r3 = new X.4so
            r3.<init>(r6, r1)
            X.3J2 r1 = X.AnonymousClass3J2.A00
            X.3J3 r0 = X.AnonymousClass3J3.A00
            X.7Sb r2 = new X.7Sb
            r2.<init>(r0, r1, r3)
            X.83z r1 = X.C1592983z.A00
            X.7SY r0 = new X.7SY
            r0.<init>(r1, r2)
            java.util.List r0 = X.AnonymousClass1b2.A06(r0)
            java.util.List r1 = X.C29431cG.A0q(r0)
            boolean r0 = X.AnonymousClass000.A1a(r1)
            if (r0 == 0) goto L_0x0038
            X.1iF r6 = r5.A01
            X.2dG r5 = new X.2dG
            r5.<init>(r1, r4)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x07da
            java.lang.String r0 = "QualityBizIntentFetchAPI: Skip API call as no active SMB contacts found"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x017a:
            X.4sp r1 = new X.4sp
            r1.<init>(r6, r2)
            goto L_0x010e
        L_0x0180:
            java.lang.Object r10 = r4.A01
            X.1Wk r10 = (X.C27521Wk) r10
            X.11P r0 = r10.A03
            long r5 = X.AnonymousClass11P.A00(r0)
            long r1 = r10.A08
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0038
            long r1 = r10.A08
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            boolean r9 = X.C108975cc.A19(r0)
            long r0 = r10.A08
            long r3 = java.lang.Math.max(r0, r5)
            long r0 = r10.A08
            long r7 = r5 - r0
            r1 = 30
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x01aa
            if (r9 == 0) goto L_0x01c0
        L_0x01aa:
            X.C27521Wk.A00(r10)
            boolean r0 = X.C27521Wk.A04(r10, r5)
            if (r0 != 0) goto L_0x01b5
            if (r9 == 0) goto L_0x01be
        L_0x01b5:
            X.C27521Wk.A02(r10, r3)
            X.C27521Wk.A03(r10, r9)
            X.C27521Wk.A01(r10, r5)
        L_0x01be:
            r10.A01 = r5
        L_0x01c0:
            r10.A08 = r5
            return
        L_0x01c3:
            java.lang.Object r5 = r4.A01
            X.1Wk r5 = (X.C27521Wk) r5
            X.11P r0 = r5.A03
            long r3 = X.AnonymousClass11P.A00(r0)
            long r1 = r5.A08
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            boolean r2 = X.C108975cc.A19(r0)
            long r0 = r5.A08
            long r0 = java.lang.Math.max(r0, r3)
            X.C27521Wk.A00(r5)
            X.C27521Wk.A02(r5, r0)
            boolean r0 = X.C27521Wk.A04(r5, r3)
            if (r0 != 0) goto L_0x01e9
            if (r2 == 0) goto L_0x0038
        L_0x01e9:
            X.C27521Wk.A03(r5, r2)
            return
        L_0x01ed:
            java.lang.Object r3 = r4.A01
            com.whatsapp.twofactor.SetEmailFragment r3 = (com.whatsapp.twofactor.SetEmailFragment) r3
            com.whatsapp.twofactor.TwoFactorAuthActivity r2 = r3.A05
            if (r2 == 0) goto L_0x0038
            com.whatsapp.twofactor.SetEmailFragment$ConfirmSkipEmailDialog r1 = new com.whatsapp.twofactor.SetEmailFragment$ConfirmSkipEmailDialog
            r1.<init>()
            r0 = -1
            r1.A1V(r3, r0)
            java.lang.Class<com.whatsapp.twofactor.SetEmailFragment$ConfirmSkipEmailDialog> r0 = com.whatsapp.twofactor.SetEmailFragment.ConfirmSkipEmailDialog.class
            java.lang.String r0 = r0.getName()
            r2.CMk(r1, r0)
            return
        L_0x0208:
            java.lang.Object r0 = r4.A01
            X.1eh r0 = (X.C30901eh) r0
            r2 = -1
            java.util.List r0 = r0.A0A
            java.util.Iterator r1 = r0.iterator()
        L_0x0213:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0038
            java.lang.Object r0 = r1.next()
            X.89R r0 = (X.AnonymousClass89R) r0
            r0.C9N(r2)
            goto L_0x0213
        L_0x0223:
            java.lang.Object r0 = r4.A01
            X.1eh r0 = (X.C30901eh) r0
            java.util.List r0 = r0.A0A
            java.util.Iterator r1 = r0.iterator()
        L_0x022d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0038
            java.lang.Object r0 = r1.next()
            X.89R r0 = (X.AnonymousClass89R) r0
            r0.C9O()
            goto L_0x022d
        L_0x023d:
            java.lang.Object r0 = r4.A01
            X.4P4 r0 = (X.AnonymousClass4P4) r0
            X.4UI r1 = r0.A04
            boolean r0 = r1.A01()
            if (r0 == 0) goto L_0x0038
            r0 = 1
            r1.A00(r0)
            return
        L_0x024e:
            java.lang.Object r2 = r4.A01
            X.5lM r2 = (X.C112365lM) r2
            X.00H r0 = r2.A0j
            X.1Lc r1 = X.C108945cZ.A0v(r0)
            X.00H r0 = r2.A0b
            java.lang.Object r0 = r0.get()
            X.1CJ r0 = (X.AnonymousClass1CJ) r0
            boolean r0 = r0.A0O()
            boolean r0 = r1.A0A(r0)
            if (r0 == 0) goto L_0x0038
            X.00H r0 = r2.A0f
            java.lang.Object r1 = r0.get()
            X.00H r0 = r2.A0d
            if (r0 == 0) goto L_0x0038
            X.1KB r4 = X.C108945cZ.A0a(r0)
            if (r4 == 0) goto L_0x0038
            r0 = 21
            X.7RD r3 = new X.7RD
            r3.<init>(r1, r2, r0)
        L_0x0281:
            r4.A0J(r3)
            return
        L_0x0285:
            java.lang.Object r0 = r4.A01
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            java.lang.Object r2 = r0.get()
            X.6Jl r2 = (X.C121386Jl) r2
            if (r2 == 0) goto L_0x0038
            r1 = 0
            java.util.List r0 = X.C42011xT.A0I
            r2.A04 = r1
            boolean r0 = r2.A05
            if (r0 != 0) goto L_0x0038
            X.6J8 r1 = r2.A02
            boolean r0 = r1 instanceof X.AnonymousClass6JC
            if (r0 == 0) goto L_0x0038
            X.6JC r1 = (X.AnonymousClass6JC) r1
            if (r1 == 0) goto L_0x0038
            X.C121386Jl.A01(r1, r2)
            return
        L_0x02a8:
            java.lang.Object r1 = r4.A01
            X.1FU r1 = (X.AnonymousClass1FU) r1
            r0 = 2131895258(0x7f1223da, float:1.9425344E38)
            r1.CNA(r0)
            java.lang.String r0 = "exportBusinessActivityReport"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x02b9:
            java.lang.String r0 = "deleteBusinessActivityReport"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x02c0:
            java.lang.Object r5 = r4.A01
            X.5dl r5 = (X.C109635dl) r5
            X.72K r0 = r5.A04
            r4 = 0
            if (r0 == 0) goto L_0x02e4
            X.0vl r0 = r0.A0E
            java.lang.Object r3 = r0.getValue()
        L_0x02cf:
            X.72K r0 = r5.A04
            if (r0 == 0) goto L_0x02d7
            java.io.File r4 = r0.A03()
        L_0x02d7:
            android.os.Handler r2 = r5.A06
            r1 = 16
            X.7RO r0 = new X.7RO
            r0.<init>(r5, r4, r3, r1)
            r2.post(r0)
            return
        L_0x02e4:
            r3 = r4
            goto L_0x02cf
        L_0x02e6:
            java.lang.Object r3 = r4.A01
            X.7Mv r3 = (X.C145847Mv) r3
            X.70T r0 = r3.A02
            r2 = 0
            if (r0 == 0) goto L_0x030f
            int r1 = r0.A03()
        L_0x02f3:
            X.70T r0 = r3.A02
            if (r0 == 0) goto L_0x02fb
            int r2 = r0.A02()
        L_0x02fb:
            if (r1 <= 0) goto L_0x0307
            X.1DT r0 = r3.A07
            X.AnonymousClass3MX.A1J(r0, r2)
            X.1DT r0 = r3.A06
            X.AnonymousClass3MX.A1J(r0, r1)
        L_0x0307:
            android.os.Handler r2 = r3.A04
            r0 = 16
            r2.postDelayed(r4, r0)
            return
        L_0x030f:
            r1 = 0
            goto L_0x02f3
        L_0x0311:
            java.lang.Object r8 = r4.A01
            X.3UN r8 = (X.AnonymousClass3UN) r8
            r0 = 0
            X.C18070vi.A0d(r8, r0)
            com.whatsapp.jid.UserJid r4 = r8.A00
            if (r4 != 0) goto L_0x031f
            com.whatsapp.jid.UserJid r4 = r8.A01
        L_0x031f:
            X.6tA r7 = r8.A04
            boolean r0 = r7.A02
            if (r0 != 0) goto L_0x0329
            boolean r0 = r7.A03
            if (r0 == 0) goto L_0x0370
        L_0x0329:
            boolean r0 = r7.A04
            if (r0 != 0) goto L_0x0370
            X.6yK r6 = r8.A03
            java.util.List r9 = r6.A01(r4)
            if (r9 == 0) goto L_0x03b5
        L_0x0335:
            java.util.ArrayList r0 = X.C17880vN.A10(r9)
            java.util.List r0 = X.C29431cG.A0s(r0)
        L_0x033d:
            r8.A02 = r0
            X.1vp r5 = r8.A05
            java.lang.Object r1 = r5.A06()
            X.4YU r1 = (X.AnonymousClass4YU) r1
            int r11 = r7.A01
            float r10 = r7.A00
            r3 = 0
            if (r4 == 0) goto L_0x0364
            X.118 r0 = r6.A03
            android.content.Context r7 = X.C108945cZ.A0E(r0)
            X.1M9 r0 = r6.A01
            X.1E7 r8 = r0.A0E(r4)
            if (r8 == 0) goto L_0x0364
            X.1Vb r6 = r6.A02
            java.lang.String r9 = "BotCommandRepository.getProfilePhoto"
            android.graphics.Bitmap r3 = r6.BX4(r7, r8, r9, r10, r11)
        L_0x0364:
            r2 = 0
            boolean r1 = r1.A03
            X.4YU r0 = new X.4YU
            r0.<init>(r3, r4, r2, r1)
            r5.A0E(r0)
            return
        L_0x0370:
            X.6yK r6 = r8.A03
            if (r4 == 0) goto L_0x03b5
            X.00H r0 = r6.A05
            java.lang.Object r0 = r0.get()
            X.1Pl r0 = (X.C25741Pl) r0
            X.24e r0 = r0.A00(r4)
            if (r0 == 0) goto L_0x03b5
            java.util.List r0 = r0.A0G
            java.util.ArrayList r9 = X.C29351c6.A0D(r0)
            java.util.Iterator r5 = r0.iterator()
        L_0x038c:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0335
            java.lang.Object r0 = r5.next()
            X.24c r0 = (X.C446124c) r0
            java.lang.String r3 = r0.A02
            java.lang.String r2 = r0.A01
            X.00H r0 = r6.A04
            java.lang.Object r1 = r0.get()
            X.6kp r1 = (X.C131276kp) r1
            java.lang.String r0 = r4.getRawString()
            X.AEe r1 = r1.A00(r0, r3)
            X.24c r0 = new X.24c
            r0.<init>(r1, r3, r2)
            r9.add(r0)
            goto L_0x038c
        L_0x03b5:
            r0 = 0
            goto L_0x033d
        L_0x03b7:
            java.lang.Object r0 = r4.A01
            com.whatsapp.thunderstorm.ThunderstormConnectionsInfoActivity r0 = (com.whatsapp.thunderstorm.ThunderstormConnectionsInfoActivity) r0
            X.1KB r2 = r0.A05
            X.73G r0 = X.C108965cb.A0d(r0)
            X.6ta r0 = r0.A02
            java.lang.String r1 = r0.toString()
            goto L_0x03df
        L_0x03c8:
            java.lang.Object r1 = r4.A01
            X.1FU r1 = (X.AnonymousClass1FU) r1
            X.1KB r2 = r1.A05
            r0 = 2131896891(0x7f122a3b, float:1.9428656E38)
            goto L_0x03db
        L_0x03d2:
            java.lang.Object r1 = r4.A01
            X.1FU r1 = (X.AnonymousClass1FU) r1
            X.1KB r2 = r1.A05
            r0 = 2131896893(0x7f122a3d, float:1.942866E38)
        L_0x03db:
            java.lang.String r1 = r1.getString(r0)
        L_0x03df:
            r0 = 1
            r2.A0G(r1, r0)
            return
        L_0x03e4:
            java.lang.Object r1 = r4.A01
            X.6J0 r1 = (X.AnonymousClass6J0) r1
            java.util.List r0 = X.C42011xT.A0I
            X.6lY r0 = r1.A03
            r0.A00()
            return
        L_0x03f0:
            java.lang.Object r0 = r4.A01
            android.app.Activity r0 = (android.app.Activity) r0
            X.AnonymousClass4aU.A05(r0)
            return
        L_0x03f8:
            java.lang.Object r2 = r4.A01
            X.1Wi r2 = (X.C27501Wi) r2
            r0 = 64
            r2.A02(r0)
            return
        L_0x0402:
            java.lang.Object r8 = r4.A01
            X.7Mz r8 = (X.C145887Mz) r8
            r4 = 0
            X.C18070vi.A0d(r8, r4)
            X.0ve r2 = r8.A04
            r1 = 908(0x38c, float:1.272E-42)
            X.0vf r0 = X.C18040vf.A02
            int r7 = X.C18020vd.A00(r0, r2, r1)
            X.00H r3 = r8.A08
            java.lang.Object r0 = r3.get()
            X.6p2 r0 = (X.C133596p2) r0
            X.0vl r0 = r0.A01
            android.content.SharedPreferences r1 = X.C18070vi.A03(r0)
            java.lang.String r0 = "tos_fetch_iteration"
            int r0 = r1.getInt(r0, r4)
            if (r7 <= r0) goto L_0x0439
            r6 = 1
            java.util.List r5 = r8.A0B
        L_0x042d:
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x04bf
            X.1NV r0 = r8.A05
            r0.A02()
            return
        L_0x0439:
            r6 = 0
            long r17 = java.lang.System.currentTimeMillis()
            java.lang.Object r0 = r3.get()
            X.6p2 r0 = (X.C133596p2) r0
            X.0vl r0 = r0.A01
            android.content.SharedPreferences r5 = X.C18070vi.A03(r0)
            java.lang.String r2 = "request_refresh_rate_seconds"
            r0 = 864000000(0x337f9800, double:4.26872718E-315)
            long r15 = r5.getLong(r2, r0)
            java.util.List r0 = r8.A0B
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            java.util.Iterator r14 = r0.iterator()
        L_0x045d:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x042d
            java.lang.Object r10 = r14.next()
            r11 = r10
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r0 = r3.get()
            X.6p2 r0 = (X.C133596p2) r0
            X.C18070vi.A0d(r11, r4)
            X.0vl r0 = r0.A01
            android.content.SharedPreferences r9 = X.C18070vi.A03(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "tos_last_refresh_timestamp_"
            java.lang.String r2 = X.AnonymousClass001.A1H(r0, r11, r1)
            r0 = -1
            long r12 = r9.getLong(r2, r0)
            r9 = 1
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x04b8
            long r1 = r17 - r12
            int r0 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r0 < 0) goto L_0x045d
            X.11S r0 = r8.A03
            boolean r12 = r0.A0N()
            java.lang.Object r0 = r3.get()
            X.6p2 r0 = (X.C133596p2) r0
            X.0vl r0 = r0.A01
            android.content.SharedPreferences r2 = X.C18070vi.A03(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "tos_acceptance_state_"
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r11, r1)
            int r0 = r2.getInt(r0, r4)
            if (r12 == 0) goto L_0x04bc
            if (r0 == r9) goto L_0x045d
        L_0x04b8:
            r5.add(r10)
            goto L_0x045d
        L_0x04bc:
            if (r0 != 0) goto L_0x045d
            goto L_0x04b8
        L_0x04bf:
            X.6ad r0 = r8.A01
            X.6nO r3 = new X.6nO
            r3.<init>(r8, r5, r7, r6)
            X.10F r0 = r0.A00
            X.10E r2 = r0.A00
            X.00S r0 = r2.A6N
            java.lang.Object r1 = r0.get()
            X.1OZ r1 = (X.AnonymousClass1OZ) r1
            X.11E r0 = X.AnonymousClass3MZ.A0d(r2)
            X.7LN r9 = new X.7LN
            r9.<init>(r0, r1, r3, r5)
            X.11E r0 = r9.A00
            boolean r0 = r0.A09()
            if (r0 != 0) goto L_0x04ea
            X.6nO r1 = r9.A02
            r0 = -1
            r1.A00(r0)
            return
        L_0x04ea:
            X.1OZ r8 = r9.A01
            java.lang.String r11 = r8.A0B()
            java.util.List r0 = r9.A03
            java.util.ArrayList r7 = X.C29351c6.A0D(r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x04fa:
            boolean r0 = r3.hasNext()
            java.lang.String r5 = "id"
            r6 = 1
            if (r0 == 0) goto L_0x0517
            java.lang.String r0 = X.C17880vN.A0v(r3)
            X.1MD[] r2 = new X.AnonymousClass1MD[r6]
            X.C17880vN.A1Q(r5, r0, r2, r4)
            java.lang.String r1 = "notice"
            X.1ca r0 = new X.1ca
            r0.<init>(r1, r2)
            r7.add(r0)
            goto L_0x04fa
        L_0x0517:
            X.1ca[] r0 = new X.C29621ca[r4]
            java.lang.Object[] r2 = r7.toArray(r0)
            X.1ca[] r2 = (X.C29621ca[]) r2
            java.lang.String r1 = "request"
            r0 = 0
            X.1ca r3 = new X.1ca
            r3.<init>((java.lang.String) r1, (X.AnonymousClass1MD[]) r0, (X.C29621ca[]) r2)
            r0 = 4
            X.1MD[] r2 = new X.AnonymousClass1MD[r0]
            X.8v4 r1 = X.C173438v4.A00
            java.lang.String r0 = "to"
            X.C17880vN.A1I(r1, r0, r2, r4)
            X.C17880vN.A1Q(r5, r11, r2, r6)
            java.lang.String r1 = "xmlns"
            java.lang.String r0 = "tos"
            X.C17890vO.A12(r1, r0, r2)
            java.lang.String r1 = "type"
            java.lang.String r0 = "get"
            X.1ca r10 = X.C29621ca.A01(r3, r1, r0, r2)
            r13 = 32000(0x7d00, double:1.581E-319)
            r12 = 282(0x11a, float:3.95E-43)
            r8.A0J(r9, r10, r11, r12, r13)
            return
        L_0x054b:
            java.lang.Object r0 = r4.A01
            X.7Mz r0 = (X.C145887Mz) r0
            X.00H r0 = r0.A09
            X.10T r1 = X.C17880vN.A0V(r0)
            r0 = 30
            X.C17890vO.A0q(r1, r0)
            return
        L_0x055b:
            java.lang.Object r1 = r4.A01
            com.whatsapp.twofactor.SettingsTwoFactorAuthActivity r1 = (com.whatsapp.twofactor.SettingsTwoFactorAuthActivity) r1
            r0 = -1
            r1.C9N(r0)
            return
        L_0x0564:
            java.lang.Object r3 = r4.A01
            com.whatsapp.twofactor.TwoFactorAuthActivity r3 = (com.whatsapp.twofactor.TwoFactorAuthActivity) r3
            r3.CEx()
            int[] r1 = r3.A08
            int r0 = r1.length
            r4 = 0
            r2 = 1
            if (r0 != r2) goto L_0x05cc
            r1 = r1[r4]
            if (r1 == r2) goto L_0x058e
            r0 = 2
            if (r1 != r0) goto L_0x0581
            X.1KB r1 = r3.A05
            r0 = 2131897174(0x7f122b56, float:1.942923E38)
        L_0x057e:
            r1.A08(r0, r2)
        L_0x0581:
            boolean r0 = r3.A07
            if (r0 == 0) goto L_0x0594
            com.whatsapp.twofactor.SecurityCheck2faSetupSuccessFragment r0 = new com.whatsapp.twofactor.SecurityCheck2faSetupSuccessFragment
            r0.<init>()
            r3.A4c(r0, r2)
            return
        L_0x058e:
            X.1KB r1 = r3.A05
            r0 = 2131897165(0x7f122b4d, float:1.9429212E38)
            goto L_0x057e
        L_0x0594:
            X.1eh r0 = r3.A01
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x05c8
            int[] r0 = r3.A08
            r0 = r0[r4]
            if (r0 != r2) goto L_0x05c8
            java.lang.String r0 = "TwoFactorAuthActivity/workflowComplete/start twoFactorAddEmailActivity"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1eh r0 = r3.A01
            r0.A00 = r4
            java.lang.String r5 = X.C17890vO.A0Q()
            r4 = 3
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.twofactor.AddEmailActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "entrypoint"
            r2.putExtra(r0, r4)
            java.lang.String r0 = "session_id"
            r2.putExtra(r0, r5)
            r3.startActivity(r2)
        L_0x05c8:
            r3.finish()
            return
        L_0x05cc:
            X.1GP r1 = r3.getSupportFragmentManager()
        L_0x05d0:
            int r0 = r1.A0K()
            if (r0 <= 0) goto L_0x05db
            r0 = 0
            X.AnonymousClass1GP.A0J(r1, r0)
            goto L_0x05d0
        L_0x05db:
            android.view.View r1 = r3.getCurrentFocus()
            if (r1 == 0) goto L_0x05e6
            X.1L4 r0 = r3.A09
            r0.A01(r1)
        L_0x05e6:
            X.01n r0 = r3.A00
            if (r0 == 0) goto L_0x05f2
            r0.A0W(r4)
            X.01n r0 = r3.A00
            r0.A0X(r4)
        L_0x05f2:
            java.lang.String r2 = r3.A06
            android.os.Bundle r1 = X.C17880vN.A0D()
            java.lang.String r0 = "primaryCTA"
            r1.putString(r0, r2)
            com.whatsapp.twofactor.DoneFragment r0 = new com.whatsapp.twofactor.DoneFragment
            r0.<init>()
            r0.A1R(r1)
            r3.A4c(r0, r4)
            return
        L_0x0609:
            java.lang.Object r3 = r4.A01
            com.whatsapp.twofactor.TwoFactorAuthActivity r3 = (com.whatsapp.twofactor.TwoFactorAuthActivity) r3
            java.lang.String r2 = r3.A02
            if (r2 != 0) goto L_0x0619
            X.1eh r0 = r3.A01
            java.lang.String r2 = r0.A02()
            r3.A02 = r2
        L_0x0619:
            X.1eh r1 = r3.A01
            java.lang.String r0 = r3.A04
            r1.A05(r2, r0)
            return
        L_0x0621:
            java.lang.Object r1 = r4.A01
            com.whatsapp.twofactor.TwoFactorAuthActivity r1 = (com.whatsapp.twofactor.TwoFactorAuthActivity) r1
            r0 = -1
            r1.C9N(r0)
            return
        L_0x062a:
            java.lang.Object r1 = r4.A01
            com.whatsapp.updates.ui.UpdatesFragment r1 = (com.whatsapp.updates.ui.UpdatesFragment) r1
            r0 = 0
            r1.A0G = r0
            return
        L_0x0632:
            java.lang.Object r0 = r4.A01
            com.whatsapp.updates.ui.UpdatesFragment r0 = (com.whatsapp.updates.ui.UpdatesFragment) r0
            com.whatsapp.updates.ui.UpdatesFragment.A06(r0)
            return
        L_0x063a:
            java.lang.Object r2 = r4.A01
            X.6KB r2 = (X.AnonymousClass6KB) r2
            java.util.List r0 = X.C42011xT.A0I
            r0 = 8
            com.whatsapp.conversation.conversationrow.E2EEDescriptionBottomSheet r1 = com.whatsapp.conversation.conversationrow.E2EEDescriptionBottomSheet.A00(r0)
            com.whatsapp.updates.ui.UpdatesFragment r0 = r2.A02
            X.1GP r0 = r0.A1E()
            X.C20098A7b.A01(r1, r0)
            return
        L_0x0650:
            java.lang.Object r1 = r4.A01
            X.1FU r1 = (X.AnonymousClass1FU) r1
            r1.CEx()
            r0 = 2131896261(0x7f1227c5, float:1.9427378E38)
            r1.BhQ(r0)
            return
        L_0x065e:
            java.lang.Object r0 = r4.A01
            X.1FU r0 = (X.AnonymousClass1FU) r0
            r0.CEx()
            return
        L_0x0666:
            java.lang.Object r4 = r4.A01
            X.70D r4 = (X.AnonymousClass70D) r4
            X.1Nb r0 = r4.A02
            java.util.LinkedHashSet r2 = r0.A0e()
            java.lang.Object r3 = r4.A08
            monitor-enter(r3)
            java.util.Set r1 = r4.A0D     // Catch:{ all -> 0x06a1 }
            java.util.Set r0 = X.C29431cG.A12(r1)     // Catch:{ all -> 0x06a1 }
            r1.clear()     // Catch:{ all -> 0x06a1 }
            X.C18070vi.A0b(r2)     // Catch:{ all -> 0x06a1 }
            r1.addAll(r2)     // Catch:{ all -> 0x06a1 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x06a1 }
            if (r0 != 0) goto L_0x069f
            java.lang.Object r2 = r4.A09     // Catch:{ all -> 0x06a1 }
            monitor-enter(r2)     // Catch:{ all -> 0x06a1 }
            java.util.Map r0 = r4.A0A     // Catch:{ all -> 0x069c }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x069c }
            java.util.Set r1 = X.C29431cG.A12(r0)     // Catch:{ all -> 0x069c }
            X.1DT r0 = r4.A01     // Catch:{ all -> 0x069c }
            r0.A0E(r1)     // Catch:{ all -> 0x069c }
            monitor-exit(r2)     // Catch:{ all -> 0x06a1 }
            goto L_0x069f
        L_0x069c:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x06a1 }
            throw r0     // Catch:{ all -> 0x06a1 }
        L_0x069f:
            monitor-exit(r3)
            return
        L_0x06a1:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x06a4:
            java.lang.Object r0 = r4.A01
            com.whatsapp.updates.viewmodels.UpdatesViewModel r0 = (com.whatsapp.updates.viewmodels.UpdatesViewModel) r0
            X.1DT r2 = r0.A0O
            X.6mv r1 = r0.A0Z
            com.whatsapp.status.crossposting.CrossPostingUpdatesViewModel r0 = r0.A0W
            X.6Up r0 = r0.A0T()
            X.6nQ r0 = r1.A00(r0)
            r2.A0E(r0)
            return
        L_0x06ba:
            java.lang.Object r4 = r4.A01
            com.whatsapp.updates.viewmodels.UpdatesViewModel r4 = (com.whatsapp.updates.viewmodels.UpdatesViewModel) r4
            X.0vp r0 = r4.A0l
            java.lang.Object r3 = r0.get()
            X.2DA r3 = (X.AnonymousClass2DA) r3
            X.0vl r0 = r4.A0o
            java.lang.Object r2 = r0.getValue()
            X.1pb r2 = (X.C37471pb) r2
            r1 = 6
            X.7Ec r0 = new X.7Ec
            r0.<init>(r4, r1)
            r2.A00(r0, r3)
            r4.A01 = r3
            return
        L_0x06da:
            java.lang.Object r4 = r4.A01
            com.whatsapp.updates.viewmodels.UpdatesViewModel r4 = (com.whatsapp.updates.viewmodels.UpdatesViewModel) r4
            X.2DA r0 = r4.A01
            X.C108955ca.A1O(r0)
            X.0vl r0 = r4.A10
            boolean r0 = X.C72453Mb.A1a(r0)
            if (r0 == 0) goto L_0x06f5
            r0 = 40
            X.7RC r0 = A00(r4, r0)
            com.whatsapp.updates.viewmodels.UpdatesViewModel.A0L(r4, r0)
            return
        L_0x06f5:
            X.1OX r3 = X.C41561wd.A00(r4)
            X.0wl r2 = r4.A11
            r1 = 0
            com.whatsapp.updates.viewmodels.UpdatesViewModel$refreshNewsletterList$1$2 r0 = new com.whatsapp.updates.viewmodels.UpdatesViewModel$refreshNewsletterList$1$2
            r0.<init>(r4, r1)
            X.AnonymousClass3MW.A1X(r2, r0, r3)
            return
        L_0x0705:
            java.lang.Object r4 = r4.A01
            com.whatsapp.updates.viewmodels.UpdatesViewModel r4 = (com.whatsapp.updates.viewmodels.UpdatesViewModel) r4
            X.6fG r3 = r4.A0Y
            X.0z4 r2 = r3.A00
            android.content.SharedPreferences r1 = X.C17890vO.A0B(r2)
            java.lang.String r0 = "show_statuses_education"
            boolean r0 = X.AnonymousClass3MX.A1T(r1, r0)
            if (r0 == 0) goto L_0x0724
            X.1Le r0 = r3.A01
            boolean r0 = r0.A0I()
            if (r0 == 0) goto L_0x0724
            r2.A16()
        L_0x0724:
            X.1DT r0 = r4.A0Q
            X.C72463Mc.A1B(r0)
            return
        L_0x072a:
            java.lang.Object r0 = r4.A01
            com.whatsapp.updates.viewmodels.UpdatesViewModel r0 = (com.whatsapp.updates.viewmodels.UpdatesViewModel) r0
            X.0vl r0 = r0.A0s
            java.lang.Object r1 = r0.getValue()
            X.AWX r1 = (X.AWX) r1
            r0 = 0
            r1.A00(r0)
            return
        L_0x073b:
            java.lang.Object r0 = r4.A01
            X.2eK r0 = (X.C54552eK) r0
            X.00H r0 = r0.A02
            java.lang.Object r0 = r0.get()
            X.1mm r0 = (X.C35771mm) r0
            r0.A04()
            return
        L_0x074b:
            java.lang.Object r0 = r4.A01
            X.6gg r0 = (X.C128786gg) r0
            X.00H r0 = r0.A00
            X.1KB r2 = X.C108945cZ.A0a(r0)
            r1 = 2131896261(0x7f1227c5, float:1.9427378E38)
            r0 = 0
            r2.A08(r1, r0)
            return
        L_0x075d:
            java.lang.Object r5 = r4.A01
            com.whatsapp.usercontrol.view.UserControlBaseFragment r5 = (com.whatsapp.usercontrol.view.UserControlBaseFragment) r5
            com.whatsapp.usercontrol.viewmodel.UserControlMessageLevelViewModel r4 = X.C108965cb.A0e(r5)
            r3 = 0
            X.1OX r2 = r4.A0F
            r1 = 0
            com.whatsapp.usercontrol.viewmodel.UserControlMessageLevelViewModel$sendUnsetPreference$1 r0 = new com.whatsapp.usercontrol.viewmodel.UserControlMessageLevelViewModel$sendUnsetPreference$1
            r0.<init>(r4, r1, r3)
            X.AnonymousClass3MX.A1Q(r0, r2)
            r5.A28()
            return
        L_0x0775:
            java.lang.Object r1 = r4.A01
            com.whatsapp.usercontrol.viewmodel.UserControlMessageLevelViewModel r1 = (com.whatsapp.usercontrol.viewmodel.UserControlMessageLevelViewModel) r1
            X.1vp r3 = r1.A08
            X.00H r0 = r1.A0E
            r0.get()
            X.6rX r0 = r1.A01
            if (r0 == 0) goto L_0x079e
            X.206 r2 = r0.A01
        L_0x0786:
            java.lang.Object r1 = r3.A06()
            r0 = 1
            X.C18070vi.A0d(r1, r0)
            if (r2 == 0) goto L_0x079a
            X.6Ui r0 = new X.6Ui
            r0.<init>()
            X.6zP r1 = new X.6zP
            r1.<init>(r0)
        L_0x079a:
            r3.A0E(r1)
            return
        L_0x079e:
            r2 = 0
            goto L_0x0786
        L_0x07a0:
            X.6o2 r3 = r5.A08     // Catch:{ Exception -> 0x07c8 }
            X.0ve r2 = r5.A07     // Catch:{ Exception -> 0x07c8 }
            r1 = 9982(0x26fe, float:1.3988E-41)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ Exception -> 0x07c8 }
            boolean r0 = X.C18020vd.A05(r0, r2, r1)     // Catch:{ Exception -> 0x07c8 }
            r1 = r0 ^ 1
            r0 = 0
            X.72K r1 = r3.A00(r0, r6, r1)     // Catch:{ Exception -> 0x07c8 }
            r1.A02 = r4     // Catch:{ Exception -> 0x07c8 }
            com.whatsapp.util.OpusRecorder r0 = X.AnonymousClass72K.A00(r1)     // Catch:{ Exception -> 0x07c8 }
            r0.prepare()     // Catch:{ Exception -> 0x07c8 }
            r1.A04()     // Catch:{ Exception -> 0x07c8 }
            r5.A04 = r1     // Catch:{ Exception -> 0x07c8 }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x07c8 }
            r5.A02 = r0     // Catch:{ Exception -> 0x07c8 }
            return
        L_0x07c8:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.C109635dl.A00(r5, r4)
            android.os.Handler r1 = r5.A06
            r0 = 0
            X.7RC r0 = A00(r5, r0)
            r1.post(r0)
            return
        L_0x07da:
            com.whatsapp.infra.graphql.generated.bizquality.calls.XWA2WAUsersInput r7 = new com.whatsapp.infra.graphql.generated.bizquality.calls.XWA2WAUsersInput
            r7.<init>()
            java.util.ArrayList r4 = X.C29351c6.A0D(r1)
            java.util.Iterator r3 = r1.iterator()
        L_0x07e7:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0806
            com.whatsapp.jid.Jid r0 = X.C17880vN.A0S(r3)
            com.whatsapp.infra.graphql.generated.bizquality.calls.XWA2WAUserQueryInput r2 = new com.whatsapp.infra.graphql.generated.bizquality.calls.XWA2WAUserQueryInput
            r2.<init>()
            java.lang.String r1 = "jid"
            X.C18070vi.A0d(r0, r8)
            java.lang.String r0 = r0.getRawString()
            r2.A05(r1, r0)
            r4.add(r2)
            goto L_0x07e7
        L_0x0806:
            java.lang.String r0 = "query_input"
            r7.A06(r0, r4)
            X.A7K r3 = new X.A7K
            r3.<init>()
            java.lang.String r0 = "input"
            r3.A04(r7, r0)
            java.lang.Class<com.whatsapp.infra.graphql.generated.bizquality.HasBusinessIntentResponseImpl> r1 = com.whatsapp.infra.graphql.generated.bizquality.HasBusinessIntentResponseImpl.class
            java.lang.String r0 = "HasBusinessIntent"
            X.AIj r2 = new X.AIj
            r2.<init>(r3, r1, r0)
            X.1iE r1 = r6.A01
            r1.A00 = r5
            X.1PY r0 = r6.A00
            X.A2g r0 = r0.A01(r2)
            r0.A03(r1)
            return
        L_0x082c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Requested element count "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " is less than zero."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A12(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7RC.run():void");
    }

    public AnonymousClass7RC(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
