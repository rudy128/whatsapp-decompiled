package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.3zZ  reason: invalid class name and case insensitive filesystem */
public final class C81643zZ extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Long A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;

    public C81643zZ() {
        super(3456, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, (Object) null);
        r3.CHf(2, this.A03);
        r3.CHf(13, this.A04);
        r3.CHf(14, this.A00);
        r3.CHf(15, this.A02);
        r3.CHf(7, this.A05);
        r3.CHf(8, this.A01);
        r3.CHf(16, this.A06);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        AnonymousClass184.A0X(A13, 1);
        A13.put(AnonymousClass184.A0E(AnonymousClass184.A0C(AnonymousClass184.A0B(AnonymousClass184.A0D(AnonymousClass184.A0A(AnonymousClass184.A09(AnonymousClass184.A0H(AnonymousClass184.A0G(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A06(AnonymousClass184.A05(AnonymousClass184.A0F(C17880vN.A0i(), this.A03, A13), this.A04, A13), (Object) null, A13), (Object) null, A13), (Object) null, A13), (Object) null, A13), this.A00, A13), this.A02, A13), this.A05, A13), this.A01, A13), (Object) null, A13), (Object) null, A13), (Object) null, A13), (Object) null);
        A13.put(16, this.A06);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamOrderDetailsActionsSmb {");
        AnonymousClass186.A00(this.A03, "actionCategory", A10);
        AnonymousClass186.A00(this.A04, "entryPointConversionSource", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A00), "lastMessageDirection", A10);
        AnonymousClass186.A00(this.A02, "messageDepth", A10);
        AnonymousClass186.A00(this.A05, "orderDetailEntryPoint", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "orderDetailsCreationAction", A10);
        return AnonymousClass184.A0S(this.A06, "threadIdHmac", A10);
    }
}
