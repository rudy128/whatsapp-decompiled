package X;

/* renamed from: X.8q8  reason: invalid class name */
public final class AnonymousClass8q8 extends C20126A8l {
    public final String[] A00;
    public final AnonymousClass2R3 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8q8(C62382rJ r12, C19999A2n a2n, AnonymousClass2R3 r14, String str, long j) {
        super(r12, a2n, str, "regular_high", 7, j, false);
        C18070vi.A0d(r12, 5);
        this.A01 = r14;
        String[] A1Y = C17880vN.A1Y();
        A1Y[0] = "waffle_account_link_state";
        this.A00 = A1Y;
    }

    public C163398Uv A08() {
        C163398Uv A08 = super.A08();
        C17960vV.A07(A08);
        C23624Bmt A0N = AnonymousClass8YS.DEFAULT_INSTANCE.A0N();
        AnonymousClass2R3 r0 = this.A01;
        AnonymousClass8YS r1 = (AnonymousClass8YS) C17880vN.A0G(A0N);
        r1.linkState_ = r0.value;
        r1.bitField0_ |= 1;
        C166378cn A0O = AnonymousClass8BS.A0O(A08);
        AnonymousClass8YS r12 = (AnonymousClass8YS) A0N.A0C();
        int i = C166378cn.AGENT_ACTION_FIELD_NUMBER;
        r12.getClass();
        A0O.waffleAccountLinkStateAction_ = r12;
        A0O.bitField1_ |= 1048576;
        return A08;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        StringBuilder A0y = AnonymousClass8BT.A0y("AccountLinkStateMutation{", A10);
        C20126A8l.A05(this, "rowId=", A0y);
        C108985cd.A1L(", ", A0y, A10);
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("linkState=");
        A102.append(this.A01);
        C108985cd.A1L(", ", A102, A10);
        StringBuilder A103 = AnonymousClass000.A10();
        C20126A8l.A02(this, "timestamp=", A103);
        C108985cd.A1L(", ", A103, A10);
        StringBuilder A104 = AnonymousClass000.A10();
        C20126A8l.A04(this, "operation=", A104);
        C108985cd.A1L(", ", A104, A10);
        StringBuilder A105 = AnonymousClass000.A10();
        C20126A8l.A01(this, "collectionName=", A105);
        C108985cd.A1L(", ", A105, A10);
        StringBuilder A106 = AnonymousClass000.A10();
        C20126A8l.A06(this, "keyId=", A106);
        AnonymousClass8BS.A1D(A106, A10);
        String A0y2 = AnonymousClass000.A0y("}", A10);
        C18070vi.A0X(A0y2);
        return A0y2;
    }
}
