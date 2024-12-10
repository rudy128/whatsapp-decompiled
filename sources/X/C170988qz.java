package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8qz  reason: invalid class name and case insensitive filesystem */
public final class C170988qz extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public String A02;
    public String A03;

    public C170988qz() {
        super(5140, AnonymousClass184.A01(), 2, 0);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(3, this.A00);
        r3.CHf(1, this.A01);
        r3.CHf(7, this.A02);
        r3.CHf(2, this.A03);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A06(C108975cc.A0S(AnonymousClass184.A09(AnonymousClass184.A03(C17880vN.A0j(), this.A00, A13), this.A01, A13), this.A02, A13), this.A03, A13), (Object) null, A13), (Object) null, A13), (Object) null);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamCtwa1pdConversion {");
        AnonymousClass186.A00(C17900vP.A08(this.A00), "bizPlatform", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "ctwa1pdConversionType", A10);
        AnonymousClass186.A00(this.A02, "ctwaSignals", A10);
        return AnonymousClass184.A0S(this.A03, "ctwaTrackingPayload", A10);
    }
}
