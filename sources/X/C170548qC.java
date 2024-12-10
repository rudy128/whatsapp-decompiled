package X;

/* renamed from: X.8qC  reason: invalid class name and case insensitive filesystem */
public final class C170548qC extends C20126A8l {
    public final String[] A00;
    public final String A01;
    public final String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C170548qC(C19999A2n a2n, String str, String str2, String str3, long j) {
        super(C62382rJ.A03, a2n, str3, "regular_low", 7, j, false);
        C18070vi.A0d(str, 2);
        this.A02 = str;
        this.A01 = str2;
        String[] strArr = new String[2];
        AnonymousClass8BS.A1B("primary_version", str, strArr);
        this.A00 = strArr;
    }

    public C163398Uv A08() {
        C23624Bmt A0N = AnonymousClass8YG.DEFAULT_INSTANCE.A0N();
        String str = this.A01;
        AnonymousClass8YG r1 = (AnonymousClass8YG) C17880vN.A0G(A0N);
        r1.bitField0_ |= 1;
        r1.version_ = str;
        C163398Uv A08 = super.A08();
        C166378cn A0O = AnonymousClass8BS.A0O(A08);
        AnonymousClass8YG r12 = (AnonymousClass8YG) A0N.A0C();
        int i = C166378cn.AGENT_ACTION_FIELD_NUMBER;
        r12.getClass();
        A0O.primaryVersionAction_ = r12;
        A0O.bitField0_ |= 67108864;
        return A08;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        C20126A8l.A05(this, "PrimaryVersionMutation {\n          rowId=", A10);
        A10.append(",\n          versionType=");
        A10.append(this.A02);
        A10.append(",\n          appVersion=");
        A10.append(this.A01);
        C20126A8l.A02(this, ",\n          timestamp=", A10);
        C20126A8l.A04(this, ",\n          operation=", A10);
        C20126A8l.A01(this, ",\n          collectionName=", A10);
        C20126A8l.A06(this, ",\n          keyId=", A10);
        return AnonymousClass8BW.A0k("\n        }", A10);
    }
}
