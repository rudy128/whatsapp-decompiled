package X;

/* renamed from: X.8pu  reason: invalid class name and case insensitive filesystem */
public final class C170468pu extends C170598qH implements C22443B7z {
    public final boolean A00;
    public final String[] A01;
    public final boolean A02;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C170468pu(AnonymousClass1BI r9, long j, boolean z) {
        this((C19999A2n) null, r9, (String) null, j, z, false);
        C18070vi.A0d(r9, 1);
    }

    public C163398Uv A08() {
        C23624Bmt A0N = AnonymousClass8YE.DEFAULT_INSTANCE.A0N();
        boolean z = this.A00;
        AnonymousClass8YE r1 = (AnonymousClass8YE) C17880vN.A0G(A0N);
        r1.bitField0_ |= 1;
        r1.pinned_ = z;
        C163398Uv A08 = super.A08();
        C166378cn A0O = AnonymousClass8BS.A0O(A08);
        AnonymousClass8YE r12 = (AnonymousClass8YE) A0N.A0C();
        int i = C166378cn.AGENT_ACTION_FIELD_NUMBER;
        r12.getClass();
        A0O.pinAction_ = r12;
        A0O.bitField0_ |= 16;
        return A08;
    }

    public boolean Bgp() {
        return this.A02;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        C20126A8l.A05(this, "PinChatMutation {\n          rowId=", A10);
        C20126A8l.A00(this, ",\n          chatJid=", A10);
        A10.append(",\n          isPinned=");
        A10.append(this.A00);
        C20126A8l.A02(this, ",\n          timestamp=", A10);
        C20126A8l.A03(this, ",\n          areDependenciesMissing=", A10);
        C20126A8l.A04(this, ",\n          operation=", A10);
        C20126A8l.A01(this, ",\n          collectionName=", A10);
        C20126A8l.A06(this, ",\n          keyId=", A10);
        return AnonymousClass8BW.A0k("\n      }", A10);
    }

    public C170468pu(C19999A2n a2n, AnonymousClass1BI r15, String str, long j, boolean z, boolean z2) {
        super(C62382rJ.A03, a2n, r15, str, "regular_low", 5, j, z2);
        this.A00 = z;
        this.A02 = !z;
        String[] A1Z = C17880vN.A1Z();
        A1Z[0] = "pin_v1";
        C17880vN.A1J(r15, A1Z, 1);
        this.A01 = A1Z;
    }
}
