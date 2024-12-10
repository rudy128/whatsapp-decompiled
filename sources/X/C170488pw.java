package X;

/* renamed from: X.8pw  reason: invalid class name and case insensitive filesystem */
public final class C170488pw extends C170498px implements C22443B7z {
    public final AnonymousClass1BI A00;
    public final boolean A01;
    public final String[] A02;
    public final boolean A03;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C170488pw(X.C19999A2n r16, X.AnonymousClass1BI r17, X.AnonymousClass205 r18, java.lang.String r19, long r20, boolean r22, boolean r23) {
        /*
            r15 = this;
            r11 = 2
            X.2rJ r7 = X.C62382rJ.A03
            r6 = r15
            r8 = r16
            r9 = r18
            r10 = r19
            r12 = r20
            r14 = r23
            r6.<init>(r7, r8, r9, r10, r11, r12, r14)
            r4 = r22
            r15.A01 = r4
            r5 = r17
            r15.A00 = r5
            r3 = 1
            java.lang.String[] r2 = new java.lang.String[r3]
            r1 = 0
            java.lang.String r0 = "star"
            r2[r1] = r0
            java.lang.String[] r0 = X.C20068A5s.A01(r5, r9, r2)
            r15.A02 = r0
            r3 = r3 ^ r22
            r15.A03 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C170488pw.<init>(X.A2n, X.1BI, X.205, java.lang.String, long, boolean, boolean):void");
    }

    public C163398Uv A08() {
        C163398Uv A08 = super.A08();
        C17960vV.A07(A08);
        C23624Bmt A0N = AnonymousClass8YM.DEFAULT_INSTANCE.A0N();
        boolean z = this.A01;
        AnonymousClass8YM r1 = (AnonymousClass8YM) C17880vN.A0G(A0N);
        r1.bitField0_ |= 1;
        r1.starred_ = z;
        C166378cn A0O = AnonymousClass8BS.A0O(A08);
        AnonymousClass8YM r12 = (AnonymousClass8YM) A0N.A0C();
        int i = C166378cn.AGENT_ACTION_FIELD_NUMBER;
        r12.getClass();
        A0O.starAction_ = r12;
        A0O.bitField0_ |= 2;
        return A08;
    }

    public boolean Bgp() {
        return this.A03;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        C20126A8l.A05(this, "StarMessageMutation {\n      rowId=", A10);
        A10.append(",\n      key=");
        A10.append(this.A01);
        A10.append(",\n      participant=");
        A10.append(this.A00);
        A10.append(",\n      starred=");
        A10.append(this.A01);
        C20126A8l.A02(this, ",\n      timestamp=", A10);
        C20126A8l.A03(this, ",\n      areDependenciesMissing=", A10);
        C20126A8l.A04(this, ",\n      operation=", A10);
        C20126A8l.A01(this, ",\n      collectionName=", A10);
        C20126A8l.A06(this, ",\n      keyId=", A10);
        return AnonymousClass8BW.A0k("   \n  }", A10);
    }
}
