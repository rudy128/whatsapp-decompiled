package X;

/* renamed from: X.8pr  reason: invalid class name and case insensitive filesystem */
public final class C170438pr extends C170598qH {
    public final AnonymousClass9KE A00;
    public final String[] A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C170438pr(C19999A2n a2n, AnonymousClass1BI r15, AnonymousClass9KE r16, String str, long j, boolean z) {
        super(C62382rJ.A03, a2n, r15, str, "regular", 7, j, z);
        C18070vi.A0d(r15, 5);
        this.A00 = r16;
        String[] A1Z = C17880vN.A1Z();
        A1Z[0] = "notificationActivitySetting";
        C17880vN.A1J(r15, A1Z, 1);
        this.A01 = A1Z;
    }

    public C163398Uv A08() {
        C163398Uv A08 = super.A08();
        C23624Bmt A0N = AnonymousClass8YB.DEFAULT_INSTANCE.A0N();
        AnonymousClass9KE r0 = this.A00;
        AnonymousClass8YB r1 = (AnonymousClass8YB) C17880vN.A0G(A0N);
        r1.notificationActivitySetting_ = r0.value;
        r1.bitField0_ |= 1;
        C166378cn A0O = AnonymousClass8BS.A0O(A08);
        AnonymousClass8YB r12 = (AnonymousClass8YB) A0N.A0C();
        int i = C166378cn.AGENT_ACTION_FIELD_NUMBER;
        r12.getClass();
        A0O.notificationActivitySettingAction_ = r12;
        A0O.bitField1_ |= 4194304;
        return A08;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        C20126A8l.A05(this, "ChatNotificationActivityLevelMutation {\n         rowId=", A10);
        C20126A8l.A00(this, ",\n         chatJid=", A10);
        A10.append(",\n         notificationActivitySetting=");
        A10.append(this.A00);
        C20126A8l.A02(this, ",\n         timestamp=", A10);
        C20126A8l.A03(this, ",\n         areDependenciesMissing=", A10);
        C20126A8l.A04(this, ",\n         operation=", A10);
        C20126A8l.A01(this, ",\n         collectionName=", A10);
        C20126A8l.A06(this, ",\n         keyId=", A10);
        return AnonymousClass8BW.A0k(",\n         }", A10);
    }
}
