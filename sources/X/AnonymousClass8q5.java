package X;

/* renamed from: X.8q5  reason: invalid class name */
public final class AnonymousClass8q5 extends C20126A8l {
    public final String[] A00 = C108975cc.A1b("android_unsupported_actions");

    public AnonymousClass8q5(C19999A2n a2n, String str, long j, boolean z) {
        super(C62382rJ.A03, a2n, str, "regular_low", 4, j, z);
    }

    public C163398Uv A08() {
        C163398Uv A08 = super.A08();
        C17960vV.A07(A08);
        C23624Bmt A082 = AnonymousClass8BS.A08(C164188Xw.DEFAULT_INSTANCE);
        C164188Xw r2 = (C164188Xw) A082.A00;
        r2.bitField0_ |= 1;
        r2.allowed_ = true;
        C166378cn A0O = AnonymousClass8BS.A0O(A08);
        C164188Xw r1 = (C164188Xw) A082.A0C();
        int i = C166378cn.AGENT_ACTION_FIELD_NUMBER;
        r1.getClass();
        A0O.androidUnsupportedActions_ = r1;
        A0O.bitField0_ |= 1048576;
        return A08;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        C20126A8l.A05(this, "AndroidUnsupportedMutation{rowId=", A10);
        C20126A8l.A02(this, ", timestamp=", A10);
        C20126A8l.A07(this, A10);
        return C17890vO.A0V(this.A00, A10);
    }
}
