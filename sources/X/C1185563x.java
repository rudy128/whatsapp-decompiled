package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.63x  reason: invalid class name and case insensitive filesystem */
public final class C1185563x extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Double A02;
    public Double A03;
    public Double A04;
    public Integer A05;
    public Long A06;
    public Long A07;
    public Long A08;

    public C1185563x() {
        super(5924, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A02);
        r3.CHf(2, this.A05);
        r3.CHf(3, this.A00);
        r3.CHf(4, this.A01);
        r3.CHf(5, this.A03);
        r3.CHf(6, this.A06);
        r3.CHf(7, this.A07);
        r3.CHf(8, this.A08);
        r3.CHf(9, this.A04);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0B(AnonymousClass184.A0A(AnonymousClass184.A09(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A06(C108975cc.A0T(C108975cc.A0S(C17880vN.A0h(), this.A02, A13), this.A05, A13), this.A00, A13), this.A01, A13), this.A03, A13), this.A06, A13), this.A07, A13), this.A08, A13), this.A04);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamMediaCanvasSend {");
        AnonymousClass186.A00(this.A02, "croppedMediaAspectRatio", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A05), "importMediaType", A10);
        AnonymousClass186.A00(this.A00, "isAutoscaled", A10);
        AnonymousClass186.A00(this.A01, "isFreeFormTransformed", A10);
        AnonymousClass186.A00(this.A03, "mediaCanvasAreaPercent", A10);
        AnonymousClass186.A00(this.A06, "srcHeight", A10);
        AnonymousClass186.A00(this.A07, "srcWidth", A10);
        AnonymousClass186.A00(this.A08, "targetMaxEdge", A10);
        return AnonymousClass184.A0S(this.A04, "transformScale", A10);
    }
}
