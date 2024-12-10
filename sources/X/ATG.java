package X;

import java.util.concurrent.TimeUnit;

public final class ATG implements B83, B85, AnonymousClass3LE, C436820m {
    public final AnonymousClass00H A00;
    public final C32981i4 A01;
    public final ASL A02;
    public final C18030ve A03;
    public final A79 A04;

    public static final void A00(C445823z r7, ATG atg, C19998A2m a2m, C162788Sm r10) {
        String A0I;
        String A0I2;
        String A0I3;
        String A0I4;
        String A0I5 = AnonymousClass1YF.A0I(r7.A06);
        AnonymousClass8c4 r1 = (AnonymousClass8c4) C17880vN.A0G(r10);
        int i = AnonymousClass8c4.CONTEXT_INFO_FIELD_NUMBER;
        A0I5.getClass();
        r1.bitField0_ |= 4;
        r1.name_ = A0I5;
        String str = r7.A04;
        if (!(str == null || (A0I4 = AnonymousClass1YF.A0I(str)) == null || A0I4.length() == 0)) {
            AnonymousClass8c4 r12 = (AnonymousClass8c4) C17880vN.A0G(r10);
            r12.bitField0_ |= 8;
            r12.description_ = A0I4;
        }
        String str2 = r7.A05;
        if (!(str2 == null || (A0I3 = AnonymousClass1YF.A0I(str2)) == null || A0I3.length() == 0)) {
            AnonymousClass8c4 r13 = (AnonymousClass8c4) C17880vN.A0G(r10);
            r13.bitField0_ |= 32;
            r13.joinLink_ = A0I3;
        }
        C194409rg r3 = r7.A01;
        if (r3 != null) {
            AnonymousClass8c4 r0 = ((C166418cr) a2m.A00.A00).eventMessage_;
            if (r0 == null) {
                r0 = AnonymousClass8c4.DEFAULT_INSTANCE;
            }
            C166028cE r02 = r0.location_;
            if (r02 == null) {
                r02 = C166028cE.DEFAULT_INSTANCE;
            }
            C23624Bmt A0O = r02.A0O();
            C193789qf r5 = r3.A00;
            if (r5 != null) {
                double d = r5.A00;
                C166028cE r4 = (C166028cE) C17880vN.A0G(A0O);
                int i2 = C166028cE.ACCURACY_IN_METERS_FIELD_NUMBER;
                r4.bitField0_ |= 1;
                r4.degreesLatitude_ = d;
                double d2 = r5.A01;
                C166028cE r42 = (C166028cE) C17880vN.A0G(A0O);
                r42.bitField0_ |= 2;
                r42.degreesLongitude_ = d2;
            }
            String str3 = r3.A02;
            if (!(str3 == null || (A0I2 = AnonymousClass1YF.A0I(str3)) == null || A0I2.length() == 0)) {
                C166028cE r14 = (C166028cE) C17880vN.A0G(A0O);
                int i3 = C166028cE.ACCURACY_IN_METERS_FIELD_NUMBER;
                r14.bitField0_ |= 4;
                r14.name_ = A0I2;
            }
            String str4 = r3.A01;
            if (!(str4 == null || (A0I = AnonymousClass1YF.A0I(str4)) == null || A0I.length() == 0)) {
                C166028cE r15 = (C166028cE) C17880vN.A0G(A0O);
                int i4 = C166028cE.ACCURACY_IN_METERS_FIELD_NUMBER;
                r15.bitField0_ |= 8;
                r15.address_ = A0I;
            }
            C166028cE r03 = (C166028cE) A0O.A0C();
            AnonymousClass8c4 r16 = (AnonymousClass8c4) C17880vN.A0G(r10);
            r03.getClass();
            r16.location_ = r03;
            r16.bitField0_ |= 16;
        }
        long seconds = TimeUnit.MILLISECONDS.toSeconds(r7.A00);
        AnonymousClass8c4 r32 = (AnonymousClass8c4) C17880vN.A0G(r10);
        r32.bitField0_ |= 64;
        r32.startTime_ = seconds;
        Long l = r7.A03;
        if (l != null) {
            long longValue = l.longValue();
            if (C18020vd.A05(C18040vf.A02, atg.A03, 8508)) {
                long seconds2 = TimeUnit.MILLISECONDS.toSeconds(longValue);
                AnonymousClass8c4 r33 = (AnonymousClass8c4) C17880vN.A0G(r10);
                r33.bitField0_ |= 128;
                r33.endTime_ = seconds2;
            }
        }
        boolean z = r7.A08;
        AnonymousClass8c4 r17 = (AnonymousClass8c4) C17880vN.A0G(r10);
        r17.bitField0_ |= 2;
        r17.isCanceled_ = z;
        if (C18020vd.A05(C18040vf.A02, atg.A03, 7420)) {
            boolean z2 = r7.A07;
            AnonymousClass8c4 r18 = (AnonymousClass8c4) C17880vN.A0G(r10);
            r18.bitField0_ |= 256;
            r18.extraGuestsAllowed_ = z2;
        }
        if (C19998A2m.A00(a2m, r7)) {
            C166278cd A012 = A79.A01(r10, atg.A04, a2m, r7);
            AnonymousClass8c4 r19 = (AnonymousClass8c4) r10.A00;
            A012.getClass();
            r19.contextInfo_ = A012;
            r19.bitField0_ |= 1;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: X.23z} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: X.23z} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: X.23z} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: X.23z} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: X.23z} */
    /* JADX WARNING: type inference failed for: r9v4, types: [java.lang.Long] */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004f, code lost:
        if (r0 > r8) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0066, code lost:
        if (r6.A01.A0I(r2.joinLink_) != false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0149, code lost:
        if ((r0.bitField0_ & 8) != 0) goto L_0x014b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01ad  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass206 CBG(X.C20077A6d r18) {
        /*
            r17 = this;
            r7 = r18
            X.8cr r2 = X.C20077A6d.A01(r7)
            int r1 = r2.bitField1_
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r1 = r1 & r0
            boolean r0 = X.AnonymousClass000.A1O(r1)
            r9 = 0
            if (r0 == 0) goto L_0x01de
            r6 = r17
            X.0ve r5 = r6.A03
            r0 = 5563(0x15bb, float:7.795E-42)
            X.0vf r4 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r4, r5, r0)
            if (r0 != 0) goto L_0x0027
            r0 = 83
            X.23U r0 = r7.A04(r0)
            return r0
        L_0x0027:
            X.8c4 r2 = r2.eventMessage_
            if (r2 != 0) goto L_0x002d
            X.8c4 r2 = X.AnonymousClass8c4.DEFAULT_INSTANCE
        L_0x002d:
            r0 = 6207(0x183f, float:8.698E-42)
            int r8 = X.C18020vd.A00(r4, r5, r0)
            java.lang.String r0 = r2.name_
            if (r0 == 0) goto L_0x01db
            java.lang.String r12 = X.AnonymousClass1YF.A0I(r0)
        L_0x003b:
            int r0 = r2.bitField0_
            r0 = r0 & 4
            boolean r0 = X.AnonymousClass000.A1O(r0)
            r3 = 1
            if (r0 == 0) goto L_0x0051
            if (r12 == 0) goto L_0x0051
            int r0 = r12.length()
            if (r0 == 0) goto L_0x0051
            r1 = 1
            if (r0 <= r8) goto L_0x0052
        L_0x0051:
            r1 = 0
        L_0x0052:
            X.Ax3 r0 = X.C22063Ax3.A00
            X.C181339Qc.A00(r0, r1)
            int r0 = r2.bitField0_
            r0 = r0 & 32
            if (r0 == 0) goto L_0x0068
            X.1i4 r1 = r6.A01
            java.lang.String r0 = r2.joinLink_
            boolean r0 = r1.A0I(r0)
            r1 = 0
            if (r0 == 0) goto L_0x0069
        L_0x0068:
            r1 = 1
        L_0x0069:
            X.Ax4 r0 = X.C22064Ax4.A00
            X.C181339Qc.A00(r0, r1)
            int r0 = r2.bitField0_
            r0 = r0 & 2
            boolean r1 = X.AnonymousClass000.A1O(r0)
            X.Ax5 r0 = X.C22065Ax5.A00
            X.C181339Qc.A00(r0, r1)
            int r0 = r2.bitField0_
            r0 = r0 & 64
            boolean r1 = X.AnonymousClass000.A1O(r0)
            X.Ax6 r0 = X.C22066Ax6.A00
            X.C181339Qc.A00(r0, r1)
            r0 = 8509(0x213d, float:1.1924E-41)
            boolean r0 = X.C18020vd.A05(r4, r5, r0)
            if (r0 == 0) goto L_0x00a2
            int r0 = r2.bitField0_
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00a2
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = r2.endTime_
            long r0 = r6.toMillis(r0)
            java.lang.Long r9 = java.lang.Long.valueOf(r0)
        L_0x00a2:
            r11 = r9
            X.205 r10 = r7.A0A
            long r13 = r7.A03
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = r2.startTime_
            long r15 = r6.toMillis(r0)
            X.23z r9 = new X.23z
            r9.<init>(r10, r11, r12, r13, r15)
            r0 = 6208(0x1840, float:8.699E-42)
            int r1 = X.C18020vd.A00(r4, r5, r0)
            int r0 = r2.bitField0_
            r0 = r0 & 8
            if (r0 == 0) goto L_0x00e0
            java.lang.String r0 = r2.description_
            X.C18070vi.A0X(r0)
            java.lang.String r0 = X.AnonymousClass1YF.A0I(r0)
            int r0 = r0.length()
            if (r0 <= r1) goto L_0x00d0
            r3 = 0
        L_0x00d0:
            X.Ax7 r0 = X.C22067Ax7.A00
            X.C181339Qc.A00(r0, r3)
            java.lang.String r0 = r2.description_
            X.C18070vi.A0X(r0)
            java.lang.String r0 = X.AnonymousClass1YF.A0I(r0)
            r9.A04 = r0
        L_0x00e0:
            int r0 = r2.bitField0_
            r0 = r0 & 32
            if (r0 == 0) goto L_0x00f1
            java.lang.String r0 = r2.joinLink_
            X.C18070vi.A0X(r0)
            java.lang.String r0 = X.AnonymousClass1YF.A0I(r0)
            r9.A05 = r0
        L_0x00f1:
            int r0 = r2.bitField0_
            r0 = r0 & 16
            if (r0 == 0) goto L_0x01c0
            X.8cE r0 = r2.location_
            r1 = r0
            if (r0 != 0) goto L_0x00fe
            X.8cE r0 = X.C166028cE.DEFAULT_INSTANCE
        L_0x00fe:
            int r0 = r0.bitField0_
            boolean r3 = X.AnonymousClass8BW.A1Q(r0)
            if (r1 != 0) goto L_0x0108
            X.8cE r1 = X.C166028cE.DEFAULT_INSTANCE
        L_0x0108:
            int r0 = r1.bitField0_
            r0 = r0 & 2
            boolean r0 = X.AnonymousClass000.A1O(r0)
            r1 = 0
            if (r3 != r0) goto L_0x0114
            r1 = 1
        L_0x0114:
            X.Ax2 r0 = X.C22062Ax2.A00
            X.C181339Qc.A00(r0, r1)
            X.8cE r0 = r2.location_
            r4 = r0
            if (r0 != 0) goto L_0x0120
            X.8cE r0 = X.C166028cE.DEFAULT_INSTANCE
        L_0x0120:
            int r0 = r0.bitField0_
            boolean r0 = X.AnonymousClass8BW.A1Q(r0)
            r5 = 0
            if (r0 != 0) goto L_0x014b
            r0 = r4
            if (r4 != 0) goto L_0x012e
            X.8cE r0 = X.C166028cE.DEFAULT_INSTANCE
        L_0x012e:
            int r0 = r0.bitField0_
            r0 = r0 & 2
            if (r0 != 0) goto L_0x014b
            r0 = r4
            if (r4 != 0) goto L_0x0139
            X.8cE r0 = X.C166028cE.DEFAULT_INSTANCE
        L_0x0139:
            int r0 = r0.bitField0_
            r0 = r0 & 4
            if (r0 != 0) goto L_0x014b
            r0 = r4
            if (r4 != 0) goto L_0x0144
            X.8cE r0 = X.C166028cE.DEFAULT_INSTANCE
        L_0x0144:
            int r0 = r0.bitField0_
            r0 = r0 & 8
            r1 = r5
            if (r0 == 0) goto L_0x01be
        L_0x014b:
            r0 = r4
            if (r4 != 0) goto L_0x0150
            X.8cE r0 = X.C166028cE.DEFAULT_INSTANCE
        L_0x0150:
            int r0 = r0.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x01d9
            r0 = r4
            if (r4 != 0) goto L_0x015b
            X.8cE r0 = X.C166028cE.DEFAULT_INSTANCE
        L_0x015b:
            double r0 = r0.degreesLatitude_
            java.lang.Double r3 = java.lang.Double.valueOf(r0)
        L_0x0161:
            r0 = r4
            if (r4 != 0) goto L_0x0166
            X.8cE r0 = X.C166028cE.DEFAULT_INSTANCE
        L_0x0166:
            int r0 = r0.bitField0_
            r0 = r0 & 2
            if (r0 == 0) goto L_0x01d7
            if (r4 != 0) goto L_0x0170
            X.8cE r4 = X.C166028cE.DEFAULT_INSTANCE
        L_0x0170:
            double r0 = r4.degreesLongitude_
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
        L_0x0176:
            if (r3 == 0) goto L_0x01d5
            if (r0 == 0) goto L_0x01d5
            double r3 = r3.doubleValue()
            double r0 = r0.doubleValue()
            X.9qf r6 = new X.9qf
            r6.<init>(r3, r0)
        L_0x0187:
            X.8cE r0 = r2.location_
            r1 = r0
            if (r0 != 0) goto L_0x018e
            X.8cE r0 = X.C166028cE.DEFAULT_INSTANCE
        L_0x018e:
            int r0 = r0.bitField0_
            r0 = r0 & 4
            if (r0 == 0) goto L_0x01d3
            if (r1 != 0) goto L_0x0198
            X.8cE r1 = X.C166028cE.DEFAULT_INSTANCE
        L_0x0198:
            java.lang.String r0 = r1.name_
            if (r0 == 0) goto L_0x01d3
            java.lang.String r3 = X.AnonymousClass1YF.A0I(r0)
        L_0x01a0:
            X.8cE r0 = r2.location_
            r1 = r0
            if (r0 != 0) goto L_0x01a7
            X.8cE r0 = X.C166028cE.DEFAULT_INSTANCE
        L_0x01a7:
            int r0 = r0.bitField0_
            r0 = r0 & 8
            if (r0 == 0) goto L_0x01b9
            if (r1 != 0) goto L_0x01b1
            X.8cE r1 = X.C166028cE.DEFAULT_INSTANCE
        L_0x01b1:
            java.lang.String r0 = r1.address_
            if (r0 == 0) goto L_0x01b9
            java.lang.String r5 = X.AnonymousClass1YF.A0I(r0)
        L_0x01b9:
            X.9rg r1 = new X.9rg
            r1.<init>(r6, r3, r5)
        L_0x01be:
            r9.A01 = r1
        L_0x01c0:
            int r1 = r2.bitField0_
            r0 = r1 & 2
            if (r0 == 0) goto L_0x01ca
            boolean r0 = r2.isCanceled_
            r9.A08 = r0
        L_0x01ca:
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x01de
            boolean r0 = r2.extraGuestsAllowed_
            r9.A07 = r0
            return r9
        L_0x01d3:
            r3 = r5
            goto L_0x01a0
        L_0x01d5:
            r6 = r5
            goto L_0x0187
        L_0x01d7:
            r0 = r5
            goto L_0x0176
        L_0x01d9:
            r3 = r5
            goto L_0x0161
        L_0x01db:
            r12 = r9
            goto L_0x003b
        L_0x01de:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ATG.CBG(X.A6d):X.206");
    }

    public ATG(C32981i4 r2, ASL asl, C18030ve r4, A79 a79, AnonymousClass00H r6) {
        C18070vi.A0o(r4, asl, r2);
        C18070vi.A0d(r6, 5);
        this.A03 = r4;
        this.A02 = asl;
        this.A01 = r2;
        this.A04 = a79;
        this.A00 = r6;
    }

    public void BCD(AnonymousClass206 r3, C61402pc r4) {
        String str;
        C18070vi.A0h(r3, r4);
        if (AnonymousClass8BV.A1R(r3)) {
            str = "edit";
        } else {
            str = "creation";
        }
        C61402pc.A00(r4, "event_type", str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        if (r1 == 0) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BDb(X.C19998A2m r9, X.AnonymousClass206 r10) {
        /*
            r8 = this;
            boolean r3 = X.C18070vi.A15(r10, r9)
            boolean r1 = r10 instanceof X.C445823z
            X.Awz r0 = X.C22059Awz.A00
            X.C181359Qe.A00(r0, r1)
            r6 = r10
            X.23z r6 = (X.C445823z) r6
            java.lang.String r0 = r6.A06
            java.lang.String r0 = X.AnonymousClass1YF.A0I(r0)
            r7 = 1
            if (r0 == 0) goto L_0x001e
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x001f
        L_0x001e:
            r0 = 1
        L_0x001f:
            r1 = r0 ^ 1
            X.Ax0 r0 = X.C22060Ax0.A00
            X.C181359Qe.A00(r0, r1)
            long r1 = r6.A00
            r4 = 0
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x002f
            r7 = 0
        L_0x002f:
            X.Ax1 r0 = X.C22061Ax1.A00
            X.C181359Qe.A00(r0, r7)
            boolean r0 = X.AnonymousClass8BV.A1R(r10)
            if (r0 == 0) goto L_0x0056
            X.0ve r2 = r8.A03
            X.0vf r1 = X.C18040vf.A01
            r0 = 7357(0x1cbd, float:1.031E-41)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x0051
            X.ASL r1 = r8.A02
            X.ARw r0 = new X.ARw
            r0.<init>(r8, r3)
            r1.A00(r0, r9, r10)
            return
        L_0x0051:
            X.1T8 r0 = X.AnonymousClass8BW.A0S(r3)
            throw r0
        L_0x0056:
            X.8X8 r1 = r9.A00
            X.Bm6 r0 = r1.A00
            X.8cr r0 = (X.C166418cr) r0
            X.8c4 r0 = r0.eventMessage_
            if (r0 != 0) goto L_0x0062
            X.8c4 r0 = X.AnonymousClass8c4.DEFAULT_INSTANCE
        L_0x0062:
            X.Bmt r0 = r0.A0O()
            X.8Sm r0 = (X.C162788Sm) r0
            X.C18070vi.A0b(r0)
            A00(r6, r8, r9, r0)
            X.Bm6 r0 = r0.A0C()
            X.8c4 r0 = (X.AnonymousClass8c4) r0
            X.8cr r2 = X.AnonymousClass8BV.A0J(r1, r0)
            r2.eventMessage_ = r0
            int r1 = r2.bitField1_
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r1 = r1 | r0
            r2.bitField1_ = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ATG.BDb(X.A2m, X.206):void");
    }
}
