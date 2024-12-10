package X;

/* renamed from: X.2Dv  reason: invalid class name and case insensitive filesystem */
public class C46252Dv extends C20126A8l {
    public final int A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C46252Dv(X.C19999A2n r10, java.lang.String r11, java.lang.String r12, int r13, long r14, boolean r16) {
        /*
            r9 = this;
            X.2rJ r1 = X.C62382rJ.A03
            r5 = 3
            r4 = r12
            X.C18070vi.A0l(r1, r12)
            r0 = r9
            r2 = r10
            r3 = r11
            r6 = r14
            r8 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r8)
            r9.A00 = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46252Dv.<init>(X.A2n, java.lang.String, java.lang.String, int, long, boolean):void");
    }

    public C163398Uv A08() {
        C163398Uv A08 = super.A08();
        C17960vV.A07(A08);
        C23624Bmt A0N = AnonymousClass8Y6.DEFAULT_INSTANCE.A0N();
        int i = this.A00;
        AnonymousClass8Y6 r1 = (AnonymousClass8Y6) C17880vN.A0G(A0N);
        r1.bitField0_ |= 1;
        r1.expiredKeyEpoch_ = i;
        C166378cn r2 = (C166378cn) C17880vN.A0G(A08);
        AnonymousClass8Y6 r12 = (AnonymousClass8Y6) A0N.A0C();
        int i2 = C166378cn.AGENT_ACTION_FIELD_NUMBER;
        r12.getClass();
        r2.keyExpiration_ = r12;
        r2.bitField0_ |= 16384;
        return A08;
    }

    public String A0B() {
        return "sentinel";
    }

    public String[] A0F() {
        String[] A1Z = C17880vN.A1Z();
        A1Z[0] = "sentinel";
        A1Z[1] = this.A06;
        return A1Z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SentinelMutation{rowId=");
        A10.append(this.A07);
        A10.append(", expiredKeyEpoch=");
        A10.append(this.A00);
        A10.append(", timestamp=");
        A10.append(this.A04);
        A10.append(", operation=");
        A10.append(this.A05);
        A10.append(", collectionName=");
        A10.append(this.A06);
        A10.append(", keyId=");
        A10.append(this.A00);
        return C17890vO.A0b(A10);
    }
}
