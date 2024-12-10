package X;

/* renamed from: X.8py  reason: invalid class name and case insensitive filesystem */
public final class C170508py extends AnonymousClass8q2 {
    public final boolean A00;
    public final String[] A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C170508py(X.C19999A2n r16, X.A7L r17, X.AnonymousClass1BI r18, java.lang.String r19, long r20, boolean r22, boolean r23) {
        /*
            r15 = this;
            X.2rJ r5 = X.C62382rJ.A03
            java.lang.String r10 = "regular_high"
            r11 = 6
            r4 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r12 = r20
            r14 = r23
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r14)
            r3 = r22
            r15.A00 = r3
            java.lang.String[] r2 = X.AnonymousClass8BR.A1b()
            r1 = 0
            java.lang.String r0 = "deleteChat"
            r2[r1] = r0
            r0 = 1
            X.C17880vN.A1J(r8, r2, r0)
            java.lang.String r1 = X.AnonymousClass8BS.A0b(r3)
            r0 = 2
            r2[r0] = r1
            r15.A01 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C170508py.<init>(X.A2n, X.A7L, X.1BI, java.lang.String, long, boolean, boolean):void");
    }

    public C163398Uv A08() {
        C23624Bmt A0N = AnonymousClass8Y3.DEFAULT_INSTANCE.A0N();
        C165018aS A04 = this.A00.A04();
        AnonymousClass8Y3 r1 = (AnonymousClass8Y3) C17880vN.A0G(A0N);
        A04.getClass();
        r1.messageRange_ = A04;
        r1.bitField0_ |= 1;
        C163398Uv A08 = super.A08();
        C166378cn A0O = AnonymousClass8BS.A0O(A08);
        AnonymousClass8Y3 r12 = (AnonymousClass8Y3) A0N.A0C();
        int i = C166378cn.AGENT_ACTION_FIELD_NUMBER;
        r12.getClass();
        A0O.deleteChatAction_ = r12;
        A0O.bitField0_ |= A7Y.A0F;
        return A08;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        C20126A8l.A05(this, "DeleteChatMutation{rowId=", A10);
        C20126A8l.A00(this, ", chatJid=", A10);
        A10.append(", deleteMediaFiles=");
        A10.append(this.A00);
        A10.append(", messageRange=");
        A10.append(this.A00);
        C20126A8l.A02(this, ", timestamp=", A10);
        C20126A8l.A03(this, ", areDependenciesMissing=", A10);
        C20126A8l.A07(this, A10);
        return AnonymousClass8BX.A0c(this.A00, A10);
    }
}
