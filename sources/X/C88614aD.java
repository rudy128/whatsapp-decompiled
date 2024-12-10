package X;

import android.content.Context;

/* renamed from: X.4aD  reason: invalid class name and case insensitive filesystem */
public final class C88614aD {
    public AnonymousClass4UO A00;
    public AnonymousClass4UO A01;
    public AnonymousClass4UO A02;
    public final C18030ve A03;

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00dd, code lost:
        r6.A00 = new X.AnonymousClass4UO(r2, r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0164, code lost:
        r6.A00 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0166, code lost:
        r4 = new X.AnonymousClass4UO(2131103020, 2131103020, 2131103021);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x020b, code lost:
        r1 = 2130971862;
        r0 = 2131103004;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0211, code lost:
        r2 = X.AnonymousClass1YL.A00(r7, r1, r0);
        r1 = 2131102981;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0218, code lost:
        r0 = new X.AnonymousClass4UO(r3, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0234, code lost:
        r1 = X.AnonymousClass1YL.A00(r7, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0238, code lost:
        r0 = new X.AnonymousClass4UO(r2, r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x023d, code lost:
        r6.A00 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x023f, code lost:
        r6.A02 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0241, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0242, code lost:
        A02(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0245, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0246, code lost:
        r0 = X.AnonymousClass4DG.SECTION_HEADER;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C88614aD(android.content.Context r7, X.C18030ve r8, X.AnonymousClass4DG r9, X.C27881Xz r10) {
        /*
            r6 = this;
            r5 = 0
            r3 = 2
            r2 = 1
            X.C18070vi.A0d(r10, r3)
            r1 = 3
            X.C18070vi.A0d(r9, r1)
            r6.<init>()
            r6.A03 = r8
            int r0 = r10.ordinal()
            if (r0 == r5) goto L_0x0177
            if (r0 == r2) goto L_0x0173
            if (r0 == r3) goto L_0x0081
            if (r0 != r1) goto L_0x007c
            int r0 = r9.ordinal()
            r4 = 0
            switch(r0) {
                case 0: goto L_0x021e;
                case 1: goto L_0x0064;
                case 2: goto L_0x0048;
                case 3: goto L_0x003a;
                case 4: goto L_0x0028;
                case 5: goto L_0x0246;
                case 6: goto L_0x0242;
                case 7: goto L_0x0184;
                default: goto L_0x0023;
            }
        L_0x0023:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x0028:
            r1 = 2131103277(0x7f060e2d, float:1.7819016E38)
            X.4UO r0 = new X.4UO
            r0.<init>(r1, r1, r1)
            r6.A01 = r0
            r2 = 2131103368(0x7f060e88, float:1.78192E38)
            r1 = 2131102992(0x7f060d10, float:1.7818438E38)
            goto L_0x0238
        L_0x003a:
            r0 = 2131100591(0x7f0603af, float:1.7813568E38)
            A03(r6, r0)
            r2 = 2131102989(0x7f060d0d, float:1.7818431E38)
            r1 = 2131100593(0x7f0603b1, float:1.7813572E38)
            goto L_0x0238
        L_0x0048:
            r1 = 2130971865(0x7f040cd9, float:1.755248E38)
            r0 = 2131103009(0x7f060d21, float:1.7818472E38)
            int r2 = X.AnonymousClass1YL.A00(r7, r1, r0)
            r1 = 2131103387(0x7f060e9b, float:1.7819239E38)
            X.4UO r0 = new X.4UO
            r0.<init>(r2, r2, r1)
            r6.A01 = r0
            r2 = 2131103007(0x7f060d1f, float:1.7818468E38)
            r1 = 2131103008(0x7f060d20, float:1.781847E38)
            goto L_0x0238
        L_0x0064:
            r1 = 2130971850(0x7f040cca, float:1.755245E38)
            r0 = 2131102995(0x7f060d13, float:1.7818444E38)
            int r0 = X.AnonymousClass1YL.A00(r7, r1, r0)
            A03(r6, r0)
            r2 = 2131102989(0x7f060d0d, float:1.7818431E38)
            r1 = 2130971849(0x7f040cc9, float:1.7552448E38)
            r0 = 2131102994(0x7f060d12, float:1.7818442E38)
            goto L_0x0234
        L_0x007c:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x0081:
            int r0 = r9.ordinal()
            switch(r0) {
                case 0: goto L_0x0149;
                case 1: goto L_0x0122;
                case 2: goto L_0x00e6;
                case 3: goto L_0x00d1;
                case 4: goto L_0x00bd;
                case 5: goto L_0x0246;
                case 6: goto L_0x008d;
                case 7: goto L_0x0184;
                default: goto L_0x0088;
            }
        L_0x0088:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x008d:
            r3 = 2131103467(0x7f060eeb, float:1.78194E38)
            r2 = 2131103470(0x7f060eee, float:1.7819407E38)
            r1 = 2131103464(0x7f060ee8, float:1.7819395E38)
            X.4UO r0 = new X.4UO
            r0.<init>(r3, r2, r1)
            r6.A01 = r0
            r3 = 2131103465(0x7f060ee9, float:1.7819397E38)
            r2 = 2131103468(0x7f060eec, float:1.7819403E38)
            r1 = 2131103462(0x7f060ee6, float:1.781939E38)
            X.4UO r0 = new X.4UO
            r0.<init>(r3, r2, r1)
            r6.A00 = r0
            r2 = 2131103466(0x7f060eea, float:1.7819399E38)
            r1 = 2131103469(0x7f060eed, float:1.7819405E38)
            r0 = 2131103463(0x7f060ee7, float:1.7819393E38)
            X.4UO r4 = new X.4UO
            r4.<init>(r2, r1, r0)
            goto L_0x023f
        L_0x00bd:
            r2 = 2131103277(0x7f060e2d, float:1.7819016E38)
            r1 = 2131103224(0x7f060df8, float:1.7818908E38)
            X.4UO r0 = new X.4UO
            r0.<init>(r2, r2, r1)
            r6.A01 = r0
            r2 = 2131103368(0x7f060e88, float:1.78192E38)
            r1 = 2131102992(0x7f060d10, float:1.7818438E38)
            goto L_0x00dd
        L_0x00d1:
            r0 = 2131100591(0x7f0603af, float:1.7813568E38)
            A03(r6, r0)
            r2 = 2131103017(0x7f060d29, float:1.7818488E38)
            r1 = 2131100593(0x7f0603b1, float:1.7813572E38)
        L_0x00dd:
            X.4UO r0 = new X.4UO
            r0.<init>(r2, r1, r2)
            r6.A00 = r0
            goto L_0x0166
        L_0x00e6:
            r1 = 2130971868(0x7f040cdc, float:1.7552487E38)
            r0 = 2131103013(0x7f060d25, float:1.781848E38)
            int r2 = X.AnonymousClass1YL.A00(r7, r1, r0)
            r1 = 2131103387(0x7f060e9b, float:1.7819239E38)
            X.4UO r0 = new X.4UO
            r0.<init>(r2, r2, r1)
            r6.A01 = r0
            r2 = 2131103012(0x7f060d24, float:1.7818478E38)
            r1 = 2131103006(0x7f060d1e, float:1.7818466E38)
            X.4UO r0 = new X.4UO
            r0.<init>(r2, r1, r2)
            r6.A00 = r0
            r1 = 2130971869(0x7f040cdd, float:1.7552489E38)
            r0 = 2131103014(0x7f060d26, float:1.7818482E38)
            int r2 = X.AnonymousClass1YL.A00(r7, r1, r0)
            r1 = 2130971860(0x7f040cd4, float:1.755247E38)
            r0 = 2131103387(0x7f060e9b, float:1.7819239E38)
            int r0 = X.AnonymousClass1YL.A00(r7, r1, r0)
            X.4UO r4 = new X.4UO
            r4.<init>(r2, r2, r0)
            goto L_0x023f
        L_0x0122:
            r1 = 2130971856(0x7f040cd0, float:1.7552462E38)
            r0 = 2131102999(0x7f060d17, float:1.7818452E38)
            int r0 = X.AnonymousClass1YL.A00(r7, r1, r0)
            A03(r6, r0)
            r3 = 2131103017(0x7f060d29, float:1.7818488E38)
            r0 = 2130971854(0x7f040cce, float:1.7552458E38)
            int r2 = X.AnonymousClass1YL.A00(r7, r0, r3)
            r1 = 2130971855(0x7f040ccf, float:1.755246E38)
            r0 = 2131102998(0x7f060d16, float:1.781845E38)
            int r0 = X.AnonymousClass1YL.A00(r7, r1, r0)
            X.4UO r1 = new X.4UO
            r1.<init>(r2, r0, r3)
            goto L_0x0164
        L_0x0149:
            r1 = 2130971872(0x7f040ce0, float:1.7552495E38)
            r0 = 2131103019(0x7f060d2b, float:1.7818492E38)
            A01(r7, r6, r1, r0)
            r2 = 2131103017(0x7f060d29, float:1.7818488E38)
            r1 = 2130971871(0x7f040cdf, float:1.7552493E38)
            r0 = 2131103018(0x7f060d2a, float:1.781849E38)
            int r0 = X.AnonymousClass1YL.A00(r7, r1, r0)
            X.4UO r1 = new X.4UO
            r1.<init>(r2, r0, r2)
        L_0x0164:
            r6.A00 = r1
        L_0x0166:
            r1 = 2131103020(0x7f060d2c, float:1.7818494E38)
            r0 = 2131103021(0x7f060d2d, float:1.7818496E38)
            X.4UO r4 = new X.4UO
            r4.<init>(r1, r1, r0)
            goto L_0x023f
        L_0x0173:
            A00(r7, r9, r6)
            return
        L_0x0177:
            int r0 = r9.ordinal()
            r4 = 0
            switch(r0) {
                case 0: goto L_0x01f4;
                case 1: goto L_0x01da;
                case 2: goto L_0x01b1;
                case 3: goto L_0x01a4;
                case 4: goto L_0x0188;
                case 5: goto L_0x0246;
                case 6: goto L_0x0242;
                case 7: goto L_0x0184;
                default: goto L_0x017f;
            }
        L_0x017f:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x0184:
            X.4DG r0 = X.AnonymousClass4DG.SECTION_HEADER_M2
            goto L_0x0248
        L_0x0188:
            r1 = 2130972007(0x7f040d67, float:1.7552768E38)
            r0 = 2131103383(0x7f060e97, float:1.781923E38)
            int r3 = X.AnonymousClass1YL.A00(r7, r1, r0)
            int r2 = X.AnonymousClass1YL.A00(r7, r1, r0)
            r1 = 2131103224(0x7f060df8, float:1.7818908E38)
            X.4UO r0 = new X.4UO
            r0.<init>(r3, r2, r1)
            r6.A01 = r0
            r3 = 2131103277(0x7f060e2d, float:1.7819016E38)
            goto L_0x020b
        L_0x01a4:
            r1 = 2130971863(0x7f040cd7, float:1.7552476E38)
            r0 = 2131103005(0x7f060d1d, float:1.7818464E38)
            A01(r7, r6, r1, r0)
            r3 = 2131100591(0x7f0603af, float:1.7813568E38)
            goto L_0x020b
        L_0x01b1:
            r1 = 2130971867(0x7f040cdb, float:1.7552484E38)
            r0 = 2131103011(0x7f060d23, float:1.7818476E38)
            int r3 = X.AnonymousClass1YL.A00(r7, r1, r0)
            int r2 = X.AnonymousClass1YL.A00(r7, r1, r0)
            r1 = 2131103237(0x7f060e05, float:1.7818935E38)
            X.4UO r0 = new X.4UO
            r0.<init>(r3, r2, r1)
            r6.A01 = r0
            r1 = 2130971866(0x7f040cda, float:1.7552482E38)
            r0 = 2131103010(0x7f060d22, float:1.7818474E38)
            int r3 = X.AnonymousClass1YL.A00(r7, r1, r0)
            r2 = 2131103006(0x7f060d1e, float:1.7818466E38)
            r1 = 2131103392(0x7f060ea0, float:1.7819249E38)
            goto L_0x0218
        L_0x01da:
            r1 = 2130971853(0x7f040ccd, float:1.7552456E38)
            r0 = 2131103005(0x7f060d1d, float:1.7818464E38)
            A01(r7, r6, r1, r0)
            r1 = 2130971851(0x7f040ccb, float:1.7552452E38)
            r0 = 2131102996(0x7f060d14, float:1.7818446E38)
            int r3 = X.AnonymousClass1YL.A00(r7, r1, r0)
            r1 = 2130971852(0x7f040ccc, float:1.7552454E38)
            r0 = 2131102997(0x7f060d15, float:1.7818448E38)
            goto L_0x0211
        L_0x01f4:
            r1 = 2130971863(0x7f040cd7, float:1.7552476E38)
            r0 = 2131103005(0x7f060d1d, float:1.7818464E38)
            int r0 = X.AnonymousClass1YL.A00(r7, r1, r0)
            A03(r6, r0)
            r1 = 2130971861(0x7f040cd5, float:1.7552472E38)
            r0 = 2131103003(0x7f060d1b, float:1.781846E38)
            int r3 = X.AnonymousClass1YL.A00(r7, r1, r0)
        L_0x020b:
            r1 = 2130971862(0x7f040cd6, float:1.7552474E38)
            r0 = 2131103004(0x7f060d1c, float:1.7818462E38)
        L_0x0211:
            int r2 = X.AnonymousClass1YL.A00(r7, r1, r0)
            r1 = 2131102981(0x7f060d05, float:1.7818415E38)
        L_0x0218:
            X.4UO r0 = new X.4UO
            r0.<init>(r3, r2, r1)
            goto L_0x023d
        L_0x021e:
            r1 = 2130971848(0x7f040cc8, float:1.7552446E38)
            r0 = 2131102991(0x7f060d0f, float:1.7818436E38)
            int r0 = X.AnonymousClass1YL.A01(r7, r1, r0, r5)
            A03(r6, r0)
            r2 = 2131102989(0x7f060d0d, float:1.7818431E38)
            r1 = 2130971847(0x7f040cc7, float:1.7552444E38)
            r0 = 2131102990(0x7f060d0e, float:1.7818434E38)
        L_0x0234:
            int r1 = X.AnonymousClass1YL.A00(r7, r1, r0)
        L_0x0238:
            X.4UO r0 = new X.4UO
            r0.<init>(r2, r1, r2)
        L_0x023d:
            r6.A00 = r0
        L_0x023f:
            r6.A02 = r4
            return
        L_0x0242:
            A02(r6)
            return
        L_0x0246:
            X.4DG r0 = X.AnonymousClass4DG.SECTION_HEADER
        L_0x0248:
            A00(r7, r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88614aD.<init>(android.content.Context, X.0ve, X.4DG, X.1Xz):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0090, code lost:
        r5.A00 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00b0, code lost:
        r5.A00 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00b2, code lost:
        r5.A02 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00b4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00be, code lost:
        r4 = X.AnonymousClass1YL.A00(r3, 2130972001, 2131103206);
        r1 = 2130972004;
        r0 = 2131103213;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00ce, code lost:
        r3 = new X.AnonymousClass4UO(r4, X.AnonymousClass1YL.A00(r3, r1, r0), 2131102981);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0074, code lost:
        r4 = new X.AnonymousClass4UO(r3, r1, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.content.Context r3, X.AnonymousClass4DG r4, X.C88614aD r5) {
        /*
            int r0 = r4.ordinal()
            r2 = 0
            switch(r0) {
                case 0: goto L_0x000d;
                case 1: goto L_0x0028;
                case 2: goto L_0x0047;
                case 3: goto L_0x0065;
                case 4: goto L_0x007a;
                case 5: goto L_0x0097;
                case 6: goto L_0x0093;
                case 7: goto L_0x00b5;
                default: goto L_0x0008;
            }
        L_0x0008:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x000d:
            r1 = 2130971876(0x7f040ce4, float:1.7552503E38)
            r0 = 2131103024(0x7f060d30, float:1.7818502E38)
            A01(r3, r5, r1, r0)
            r1 = 2130971874(0x7f040ce2, float:1.7552499E38)
            r0 = 2131103022(0x7f060d2e, float:1.7818498E38)
            int r4 = X.AnonymousClass1YL.A00(r3, r1, r0)
            r1 = 2130971875(0x7f040ce3, float:1.75525E38)
            r0 = 2131103023(0x7f060d2f, float:1.78185E38)
            goto L_0x00ce
        L_0x0028:
            r1 = 2130971859(0x7f040cd3, float:1.7552468E38)
            r0 = 2131103002(0x7f060d1a, float:1.7818458E38)
            int r0 = X.AnonymousClass1YL.A00(r3, r1, r0)
            A03(r5, r0)
            r1 = 2130971857(0x7f040cd1, float:1.7552464E38)
            r0 = 2131103000(0x7f060d18, float:1.7818454E38)
            int r4 = X.AnonymousClass1YL.A00(r3, r1, r0)
            r1 = 2130971858(0x7f040cd2, float:1.7552466E38)
            r0 = 2131103001(0x7f060d19, float:1.7818456E38)
            goto L_0x00ce
        L_0x0047:
            r1 = 2130971870(0x7f040cde, float:1.755249E38)
            r0 = 2131103016(0x7f060d28, float:1.7818486E38)
            int r3 = X.AnonymousClass1YL.A00(r3, r1, r0)
            r1 = 2131103387(0x7f060e9b, float:1.7819239E38)
            X.4UO r0 = new X.4UO
            r0.<init>(r3, r3, r1)
            r5.A01 = r0
            r3 = 2131103015(0x7f060d27, float:1.7818484E38)
            r1 = 2131103006(0x7f060d1e, float:1.7818466E38)
            r0 = 2131103235(0x7f060e03, float:1.781893E38)
            goto L_0x0074
        L_0x0065:
            r0 = 2131100591(0x7f0603af, float:1.7813568E38)
            A03(r5, r0)
            r3 = 2131100592(0x7f0603b0, float:1.781357E38)
            r1 = 2131100593(0x7f0603b1, float:1.7813572E38)
            r0 = 2131102981(0x7f060d05, float:1.7818415E38)
        L_0x0074:
            X.4UO r4 = new X.4UO
            r4.<init>(r3, r1, r0)
            goto L_0x0090
        L_0x007a:
            int r3 = X.C72463Mc.A03(r3)
            r1 = 2131103229(0x7f060dfd, float:1.7818918E38)
            X.4UO r0 = new X.4UO
            r0.<init>(r3, r3, r1)
            r5.A01 = r0
            r0 = 2131102993(0x7f060d11, float:1.781844E38)
            X.4UO r4 = new X.4UO
            r4.<init>(r0, r0, r0)
        L_0x0090:
            r5.A00 = r4
            goto L_0x00b2
        L_0x0093:
            A02(r5)
            return
        L_0x0097:
            r1 = 2130971976(0x7f040d48, float:1.7552706E38)
            r0 = 2131103148(0x7f060dac, float:1.7818754E38)
            A01(r3, r5, r1, r0)
            X.0ve r0 = r5.A03
            boolean r0 = X.AnonymousClass1J8.A05(r0)
            if (r0 != 0) goto L_0x00be
            r0 = 2131103368(0x7f060e88, float:1.78192E38)
            X.4UO r3 = new X.4UO
            r3.<init>(r0, r0, r0)
        L_0x00b0:
            r5.A00 = r3
        L_0x00b2:
            r5.A02 = r2
            return
        L_0x00b5:
            r1 = 2130971976(0x7f040d48, float:1.7552706E38)
            r0 = 2131103148(0x7f060dac, float:1.7818754E38)
            A01(r3, r5, r1, r0)
        L_0x00be:
            r1 = 2130972001(0x7f040d61, float:1.7552756E38)
            r0 = 2131103206(0x7f060de6, float:1.7818872E38)
            int r4 = X.AnonymousClass1YL.A00(r3, r1, r0)
            r1 = 2130972004(0x7f040d64, float:1.7552762E38)
            r0 = 2131103213(0x7f060ded, float:1.7818886E38)
        L_0x00ce:
            int r1 = X.AnonymousClass1YL.A00(r3, r1, r0)
            r0 = 2131102981(0x7f060d05, float:1.7818415E38)
            X.4UO r3 = new X.4UO
            r3.<init>(r4, r1, r0)
            goto L_0x00b0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88614aD.A00(android.content.Context, X.4DG, X.4aD):void");
    }

    public static void A01(Context context, C88614aD r5, int i, int i2) {
        r5.A01 = new AnonymousClass4UO(AnonymousClass1YL.A00(context, i, i2), AnonymousClass1YL.A00(context, i, i2), 2131103025);
    }

    public static final void A02(C88614aD r4) {
        r4.A01 = new AnonymousClass4UO(2131103383, 2131103383, 2131103383);
        r4.A00 = new AnonymousClass4UO(2131103457, 2131103458, 2131103456);
        r4.A02 = null;
    }

    public static void A03(C88614aD r2, int i) {
        r2.A01 = new AnonymousClass4UO(i, i, 2131103025);
    }
}
