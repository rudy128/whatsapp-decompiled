package X;

/* renamed from: X.8pz  reason: invalid class name and case insensitive filesystem */
public final class C170518pz extends AnonymousClass8q2 {
    public final boolean A00;
    public final boolean A01;
    public final String[] A02;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C170518pz(X.C19999A2n r17, X.A7L r18, X.AnonymousClass1BI r19, java.lang.String r20, long r21, boolean r23, boolean r24, boolean r25) {
        /*
            r16 = this;
            X.2rJ r6 = X.C62382rJ.A03
            java.lang.String r11 = "regular_high"
            r12 = 6
            r5 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            r13 = r21
            r15 = r25
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r15)
            r4 = r23
            r5.A01 = r4
            r3 = r24
            r5.A00 = r3
            r0 = 4
            java.lang.String[] r2 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r0 = "clearChat"
            r2[r1] = r0
            r0 = 1
            X.C17880vN.A1J(r9, r2, r0)
            java.lang.String r1 = X.AnonymousClass8BS.A0b(r4)
            r0 = 2
            r2[r0] = r1
            java.lang.String r1 = X.AnonymousClass8BS.A0b(r3)
            r0 = 3
            r2[r0] = r1
            r5.A02 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C170518pz.<init>(X.A2n, X.A7L, X.1BI, java.lang.String, long, boolean, boolean, boolean):void");
    }

    public C163398Uv A08() {
        C23624Bmt A0N = AnonymousClass8Y1.DEFAULT_INSTANCE.A0N();
        C165018aS A04 = this.A00.A04();
        AnonymousClass8Y1 r1 = (AnonymousClass8Y1) C17880vN.A0G(A0N);
        A04.getClass();
        r1.messageRange_ = A04;
        r1.bitField0_ |= 1;
        C163398Uv A08 = super.A08();
        C166378cn A0O = AnonymousClass8BS.A0O(A08);
        AnonymousClass8Y1 r12 = (AnonymousClass8Y1) A0N.A0C();
        int i = C166378cn.AGENT_ACTION_FIELD_NUMBER;
        r12.getClass();
        A0O.clearChatAction_ = r12;
        A0O.bitField0_ |= 65536;
        return A08;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        C20126A8l.A05(this, "ClearChatMutation{rowId=", A10);
        C20126A8l.A00(this, ", chatJid=", A10);
        A10.append(", deleteStarredMessages=");
        A10.append(this.A01);
        A10.append(", deleteMediaFiles=");
        A10.append(this.A00);
        A10.append(", messageRange=");
        A10.append(this.A00);
        C20126A8l.A02(this, ", timestamp=", A10);
        C20126A8l.A03(this, " ,areDependenciesMissing=", A10);
        C20126A8l.A04(this, " ,operation=", A10);
        C20126A8l.A01(this, "collectionName=", A10);
        A10.append(" ,keyId=");
        return AnonymousClass8BX.A0c(this.A00, A10);
    }
}
