package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2FU  reason: invalid class name */
public final class AnonymousClass2FU extends AnonymousClass184 {
    public Boolean A00;
    public Integer A01;
    public Integer A02;

    public AnonymousClass2FU() {
        super(2304, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(2, this.A01);
        r3.CHf(16, this.A00);
        r3.CHf(1, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0D(AnonymousClass184.A0G(C17880vN.A0i(), this.A01, A13), (Object) null, A13), (Object) null);
        A13.put(AnonymousClass184.A0P(AnonymousClass184.A0I(AnonymousClass184.A05(AnonymousClass184.A0E(38, (Object) null, A13), (Object) null, A13), (Object) null, A13), this.A00, A13), (Object) null);
        C17880vN.A1O((Object) null, A13, 24);
        C17880vN.A1O((Object) null, A13, 25);
        C17880vN.A1O((Object) null, A13, 39);
        C17880vN.A1O((Object) null, A13, 40);
        C17880vN.A1O((Object) null, A13, 17);
        C17880vN.A1O((Object) null, A13, 18);
        C17880vN.A1O((Object) null, A13, 19);
        C17880vN.A1O((Object) null, A13, 26);
        C17880vN.A1O((Object) null, A13, 36);
        C17880vN.A1O((Object) null, A13, 20);
        C17880vN.A1O((Object) null, A13, 37);
        C17880vN.A1O((Object) null, A13, 21);
        C17880vN.A1O((Object) null, A13, 27);
        C17880vN.A1O((Object) null, A13, 28);
        C17880vN.A1O((Object) null, A13, 29);
        C17880vN.A1O((Object) null, A13, 30);
        C17880vN.A1O((Object) null, A13, 31);
        C17880vN.A1O((Object) null, A13, 32);
        C17880vN.A1O((Object) null, A13, 33);
        C17880vN.A1O((Object) null, A13, 22);
        C17880vN.A1O((Object) null, A13, 34);
        A13.put(AnonymousClass184.A0A(AnonymousClass184.A09(AnonymousClass184.A08(AnonymousClass184.A0C(AnonymousClass184.A0H(AnonymousClass184.A07(AnonymousClass184.A0B(AnonymousClass184.A03(AnonymousClass184.A0F(35, (Object) null, A13), (Object) null, A13), this.A02, A13), (Object) null, A13), (Object) null, A13), (Object) null, A13), (Object) null, A13), (Object) null, A13), (Object) null, A13), (Object) null);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamMdFatalError {");
        AnonymousClass186.A00(C17900vP.A08(this.A01), "collection", A10);
        AnonymousClass186.A00(this.A00, "isFatal", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A02), "mdFatalErrorCode", A10);
    }
}
