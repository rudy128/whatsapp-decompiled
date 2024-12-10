package X;

/* renamed from: X.8qB  reason: invalid class name and case insensitive filesystem */
public final class C170538qB extends C20126A8l {
    public final String[] A00 = {"generated_wui"};
    public final String A01;

    public C170538qB(C19999A2n a2n, String str, String str2, long j) {
        super(C62382rJ.A03, a2n, str2, "critical_block", 7, j, false);
        this.A01 = str;
    }

    public C163398Uv A08() {
        C23624Bmt A0N = AnonymousClass8YT.DEFAULT_INSTANCE.A0N();
        String str = this.A01;
        AnonymousClass8YT r1 = (AnonymousClass8YT) C17880vN.A0G(A0N);
        r1.bitField0_ |= 1;
        r1.identifier_ = str;
        C163398Uv A08 = super.A08();
        C166378cn A0O = AnonymousClass8BS.A0O(A08);
        AnonymousClass8YT r12 = (AnonymousClass8YT) A0N.A0C();
        int i = C166378cn.AGENT_ACTION_FIELD_NUMBER;
        r12.getClass();
        A0O.wamoUserIdentifierAction_ = r12;
        A0O.bitField1_ |= 16384;
        return A08;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        C20126A8l.A05(this, "WamoUserIdentifierMutation {\n          rowId=", A10);
        A10.append(",\n          userIdentifier=");
        A10.append(this.A01);
        C20126A8l.A02(this, ",\n          timestamp=", A10);
        C20126A8l.A04(this, ",\n          operation=", A10);
        C20126A8l.A01(this, ",\n          collectionName=", A10);
        C20126A8l.A06(this, ",\n          keyId=", A10);
        return AnonymousClass8BW.A0k("\n      }", A10);
    }
}
