package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.63w  reason: invalid class name and case insensitive filesystem */
public final class C1185463w extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Long A06;
    public Long A07;
    public Long A08;

    public C1185463w() {
        super(5620, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A02);
        r3.CHf(8, this.A06);
        r3.CHf(3, this.A03);
        r3.CHf(4, this.A04);
        r3.CHf(5, this.A05);
        r3.CHf(6, this.A00);
        r3.CHf(7, this.A01);
        r3.CHf(9, this.A07);
        r3.CHf(10, this.A08);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0A(C17880vN.A0h(), this.A02, A13), this.A06);
        AnonymousClass184.A0X(A13, 2);
        A13.put(AnonymousClass184.A0C(AnonymousClass184.A0B(AnonymousClass184.A09(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A06(C17880vN.A0j(), this.A03, A13), this.A04, A13), this.A05, A13), this.A00, A13), this.A01, A13), this.A07, A13), this.A08);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamImagineActions {");
        AnonymousClass186.A00(C17900vP.A08(this.A02), "imagineAction", A10);
        AnonymousClass186.A00(this.A06, "imagineActionDuration", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A03), "imagineActionSource", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A04), "imagineActionTarget", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A05), "imagineActionThreadType", A10);
        AnonymousClass186.A00(this.A00, "isCancelled", A10);
        AnonymousClass186.A00(this.A01, "isSent", A10);
        AnonymousClass186.A00(this.A07, "maxIndex", A10);
        return AnonymousClass184.A0S(this.A08, "selectedImageIndex", A10);
    }
}
