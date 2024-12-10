package X;

/* renamed from: X.8q6  reason: invalid class name */
public class AnonymousClass8q6 extends C20126A8l {
    public final String A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass8q6(X.C19999A2n r10, java.lang.String r11, java.lang.String r12, long r13) {
        /*
            r9 = this;
            X.2rJ r1 = X.C62382rJ.A03
            java.lang.String r4 = "critical_block"
            r5 = 1
            r8 = 0
            X.C18070vi.A0l(r1, r4)
            r0 = r9
            r2 = r10
            r3 = r11
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r8)
            r9.A00 = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8q6.<init>(X.A2n, java.lang.String, java.lang.String, long):void");
    }

    public C163398Uv A08() {
        C23624Bmt A0N = AnonymousClass8YJ.DEFAULT_INSTANCE.A0N();
        String str = this.A00;
        AnonymousClass8YJ r1 = (AnonymousClass8YJ) C17880vN.A0G(A0N);
        str.getClass();
        r1.bitField0_ |= 1;
        r1.name_ = str;
        C163398Uv A08 = super.A08();
        C17960vV.A07(A08);
        C166378cn A0O = AnonymousClass8BS.A0O(A08);
        AnonymousClass8YJ r12 = (AnonymousClass8YJ) A0N.A0C();
        int i = C166378cn.AGENT_ACTION_FIELD_NUMBER;
        r12.getClass();
        A0O.pushNameSetting_ = r12;
        A0O.bitField0_ |= 64;
        return A08;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        C20126A8l.A05(this, "PushNameSettingMutation{rowId=", A10);
        A10.append(", pushName=");
        A10.append(this.A00);
        C20126A8l.A02(this, ", timestamp=", A10);
        C20126A8l.A03(this, ", areDependenciesMissing=", A10);
        C20126A8l.A07(this, A10);
        return AnonymousClass8BX.A0c(this.A00, A10);
    }
}
