package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2G3  reason: invalid class name */
public final class AnonymousClass2G3 extends AnonymousClass184 {
    public Integer A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public String A04;

    public AnonymousClass2G3() {
        super(2576, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(8, this.A01);
        r3.CHf(6, this.A02);
        r3.CHf(4, this.A00);
        r3.CHf(1, this.A04);
        r3.CHf(7, this.A03);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        AnonymousClass184.A0X(A13, 10);
        A13.put(AnonymousClass184.A09(AnonymousClass184.A03(AnonymousClass184.A0B(AnonymousClass184.A0D(AnonymousClass184.A06(AnonymousClass184.A08(8, this.A01, A13), this.A02, A13), this.A00, A13), (Object) null, A13), (Object) null, A13), this.A04, A13), this.A03);
        AnonymousClass184.A0X(A13, 5);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamMdLinkDeviceCompanion {");
        AnonymousClass186.A00(this.A01, "mdDurationS", A10);
        AnonymousClass186.A00(this.A02, "mdLinkDeviceCompanionErrorCode", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A00), "mdLinkDeviceCompanionStage", A10);
        AnonymousClass186.A00(this.A04, "mdSessionId", A10);
        return AnonymousClass184.A0S(this.A03, "mdTimestampS", A10);
    }
}
