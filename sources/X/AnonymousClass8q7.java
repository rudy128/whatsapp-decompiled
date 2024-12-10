package X;

/* renamed from: X.8q7  reason: invalid class name */
public class AnonymousClass8q7 extends C20126A8l {
    public final boolean A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass8q7(X.C19999A2n r10, java.lang.String r11, long r12, boolean r14) {
        /*
            r9 = this;
            X.2rJ r1 = X.C62382rJ.A03
            java.lang.String r4 = "regular_low"
            r5 = 4
            r8 = 0
            X.C18070vi.A0l(r1, r4)
            r0 = r9
            r2 = r10
            r3 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r8)
            r9.A00 = r14
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8q7.<init>(X.A2n, java.lang.String, long, boolean):void");
    }

    public C163398Uv A08() {
        C23624Bmt A0N = AnonymousClass8YP.DEFAULT_INSTANCE.A0N();
        boolean z = this.A00;
        AnonymousClass8YP r1 = (AnonymousClass8YP) C17880vN.A0G(A0N);
        r1.bitField0_ |= 1;
        r1.unarchiveChats_ = z;
        C163398Uv A08 = super.A08();
        C17960vV.A07(A08);
        C166378cn A0O = AnonymousClass8BS.A0O(A08);
        AnonymousClass8YP r12 = (AnonymousClass8YP) A0N.A0C();
        int i = C166378cn.AGENT_ACTION_FIELD_NUMBER;
        r12.getClass();
        A0O.unarchiveChatsSetting_ = r12;
        A0O.bitField0_ |= 262144;
        return A08;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        C20126A8l.A05(this, "UnarchiveChatsSettingMutation{rowId=", A10);
        A10.append(", isUnarchiveChatsSettingEnabled=");
        A10.append(this.A00);
        C20126A8l.A02(this, ", timestamp=", A10);
        C20126A8l.A03(this, ", areDependenciesMissing=", A10);
        C20126A8l.A07(this, A10);
        return AnonymousClass8BX.A0c(this.A00, A10);
    }
}
