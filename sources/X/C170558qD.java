package X;

/* renamed from: X.8qD  reason: invalid class name and case insensitive filesystem */
public class C170558qD extends C20126A8l {
    public final Object A00;
    public final String A01;
    public final String A02;
    public final String[] A03;
    public final C169808mv A04;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C170558qD(X.C169808mv r12, X.C19999A2n r13, java.lang.Object r14, java.lang.String r15, java.lang.String r16, long r17, boolean r19) {
        /*
            r11 = this;
            r0 = 4
            X.C18070vi.A0d(r12, r0)
            X.2rJ r3 = X.C62382rJ.A03
            java.lang.String r6 = r12.A0D()
            if (r6 == 0) goto L_0x0036
            r7 = 7
            r2 = r11
            r4 = r13
            r5 = r16
            r8 = r17
            r10 = r19
            r2.<init>(r3, r4, r5, r6, r7, r8, r10)
            r11.A02 = r15
            r11.A00 = r14
            r11.A04 = r12
            java.lang.String[] r0 = X.C17880vN.A1Z()
            java.lang.String r1 = r12.A0E()
            X.AnonymousClass8BS.A1B(r1, r15, r0)
            java.util.List r0 = X.C200410p.A0P(r0)
            java.lang.String[] r0 = X.C108955ca.A1b(r0)
            r11.A03 = r0
            r11.A01 = r1
            return
        L_0x0036:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C170558qD.<init>(X.8mv, X.A2n, java.lang.Object, java.lang.String, java.lang.String, long, boolean):void");
    }

    public final C170558qD A0G(String str) {
        C18070vi.A0d(str, 0);
        long j = this.A04;
        Object obj = this.A00;
        C169808mv r1 = this.A04;
        String str2 = this.A07;
        boolean A0D = A0D();
        return new C170558qD(r1, this.A00, obj, str, str2, j, A0D);
    }

    public C163398Uv A08() {
        String str;
        C166378cn A0O;
        int i;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        Boolean bool5;
        C169808mv r1 = this.A04;
        C163398Uv A08 = super.A08();
        Object obj = this.A00;
        if (r1 instanceof AnonymousClass8n9) {
            C18070vi.A0d(A08, 0);
            if (obj instanceof Boolean) {
                bool5 = (Boolean) obj;
            } else {
                bool5 = null;
            }
            C23624Bmt A0N = C164198Xx.DEFAULT_INSTANCE.A0N();
            boolean A1Y = C72453Mb.A1Y(bool5);
            C164198Xx r12 = (C164198Xx) C17880vN.A0G(A0N);
            r12.bitField0_ |= 1;
            r12.isSent_ = A1Y;
            C164198Xx r0 = (C164198Xx) A0N.A0C();
            A0O = AnonymousClass8BW.A0O(A08, r0);
            A0O.botWelcomeRequestAction_ = r0;
            i = A0O.bitField1_ | 128;
        } else {
            if (r1 instanceof AnonymousClass8n8) {
                C18070vi.A0d(A08, 0);
                if ((obj instanceof Boolean) && (bool4 = (Boolean) obj) != null) {
                    boolean booleanValue = bool4.booleanValue();
                    C23624Bmt A082 = AnonymousClass8BS.A08(AnonymousClass8YC.DEFAULT_INSTANCE);
                    AnonymousClass8YC r13 = (AnonymousClass8YC) A082.A00;
                    r13.bitField0_ |= 1;
                    r13.acknowledged_ = booleanValue;
                    AnonymousClass8YC r02 = (AnonymousClass8YC) A082.A0C();
                    C166378cn A0O2 = AnonymousClass8BW.A0O(A08, r02);
                    A0O2.nuxAction_ = r02;
                    A0O2.bitField0_ |= 33554432;
                    return A08;
                }
            } else if (r1 instanceof AnonymousClass8n6) {
                C18070vi.A0d(A08, 0);
                if ((obj instanceof Boolean) && (bool3 = (Boolean) obj) != null) {
                    boolean booleanValue2 = bool3.booleanValue();
                    C23624Bmt A083 = AnonymousClass8BS.A08(AnonymousClass8YI.DEFAULT_INSTANCE);
                    AnonymousClass8YI r14 = (AnonymousClass8YI) A083.A00;
                    r14.bitField0_ |= 1;
                    r14.isEnabled_ = booleanValue2;
                    AnonymousClass8YI r03 = (AnonymousClass8YI) A083.A0C();
                    A0O = AnonymousClass8BW.A0O(A08, r03);
                    A0O.privacySettingRelayAllCalls_ = r03;
                    i = A0O.bitField1_ | 8;
                }
            } else if (r1 instanceof AnonymousClass8n5) {
                C18070vi.A0d(A08, 0);
                if ((obj instanceof Boolean) && (bool2 = (Boolean) obj) != null) {
                    boolean booleanValue3 = bool2.booleanValue();
                    C23624Bmt A084 = AnonymousClass8BS.A08(AnonymousClass8YH.DEFAULT_INSTANCE);
                    AnonymousClass8YH r15 = (AnonymousClass8YH) A084.A00;
                    r15.bitField0_ |= 1;
                    r15.isPreviewsDisabled_ = booleanValue3;
                    AnonymousClass8YH r04 = (AnonymousClass8YH) A084.A0C();
                    C166378cn A0O3 = AnonymousClass8BW.A0O(A08, r04);
                    A0O3.privacySettingDisableLinkPreviewsAction_ = r04;
                    A0O3.bitField1_ |= 32768;
                    return A08;
                }
            } else if (r1 instanceof AnonymousClass8n7) {
                C18070vi.A0d(A08, 0);
                if ((obj instanceof Boolean) && (bool = (Boolean) obj) != null) {
                    boolean booleanValue4 = bool.booleanValue();
                    C23624Bmt A085 = AnonymousClass8BS.A08(AnonymousClass8Y4.DEFAULT_INSTANCE);
                    AnonymousClass8Y4 r16 = (AnonymousClass8Y4) A085.A00;
                    r16.bitField0_ |= 1;
                    r16.isOptIn_ = booleanValue4;
                    AnonymousClass8Y4 r05 = (AnonymousClass8Y4) A085.A0C();
                    A0O = AnonymousClass8BW.A0O(A08, r05);
                    A0O.externalWebBetaAction_ = r05;
                    i = A0O.bitField1_ | 4;
                }
            } else {
                C18070vi.A0d(A08, 0);
                if (obj instanceof String) {
                    str = (String) obj;
                } else {
                    str = null;
                }
                C23624Bmt A0N2 = AnonymousClass8YO.DEFAULT_INSTANCE.A0N();
                if (str != null) {
                    C23581BmB A032 = C17900vP.A03(A0N2, C108975cc.A1O(str));
                    AnonymousClass8YO r17 = (AnonymousClass8YO) A0N2.A00;
                    r17.bitField0_ |= 1;
                    r17.definition_ = A032;
                }
                AnonymousClass8YO r06 = (AnonymousClass8YO) A0N2.A0C();
                A0O = AnonymousClass8BW.A0O(A08, r06);
                A0O.ugcBot_ = r06;
                i = A0O.bitField1_ | 32;
            }
            throw AnonymousClass000.A0n("setMutationValueFromPropertyValue returns null value of SyncActionValue.Builder");
        }
        A0O.bitField1_ = i;
        return A08;
    }
}
