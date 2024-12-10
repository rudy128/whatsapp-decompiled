package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Bqs  reason: case insensitive filesystem */
public final class C23835Bqs extends AnonymousClass184 {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A00);
        r3.CHf(2, this.A01);
        r3.CHf(3, this.A02);
        r3.CHf(4, this.A03);
        r3.CHf(5, this.A04);
        r3.CHf(6, this.A05);
        r3.CHf(7, this.A06);
    }

    public C23835Bqs() {
        super(4030, AnonymousClass184.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A09(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A06(AnonymousClass184.A05(AnonymousClass184.A04(C17880vN.A0h(), this.A00, A13), this.A01, A13), this.A02, A13), this.A03, A13), this.A04, A13), this.A05, A13), this.A06);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamArfxWaterfallEvent {");
        AnonymousClass186.A00(this.A00, "cameraProductName", A10);
        AnonymousClass186.A00(this.A01, "deliveryOperationId", A10);
        AnonymousClass186.A00(this.A02, "effectInstanceId", A10);
        AnonymousClass186.A00(this.A03, "effectSessionId", A10);
        AnonymousClass186.A00(this.A04, "productSessionId", A10);
        AnonymousClass186.A00(this.A05, "sessionStartIntent", A10);
        return AnonymousClass184.A0S(this.A06, "waterfallEvent", A10);
    }
}
