package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.63K  reason: invalid class name */
public final class AnonymousClass63K extends AnonymousClass184 {
    public Long A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;

    public AnonymousClass63K() {
        super(5682, new C18180vt(1, 1, 50, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(2, this.A00);
        r3.CHf(3, this.A01);
        r3.CHf(4, this.A02);
        r3.CHf(5, this.A03);
        r3.CHf(6, this.A04);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        AnonymousClass184.A0X(A13, 1);
        A13.put(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A06(C108975cc.A0T(C17880vN.A0i(), this.A00, A13), this.A01, A13), this.A02, A13), this.A03, A13), this.A04);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamMediaCollectionReceive {");
        AnonymousClass186.A00(this.A00, "duration50ReceiveMs", A10);
        AnonymousClass186.A00(this.A01, "duration75ReceiveMs", A10);
        AnonymousClass186.A00(this.A02, "durationFullReceiveMs", A10);
        AnonymousClass186.A00(this.A03, "numPhotosReceived", A10);
        return AnonymousClass184.A0S(this.A04, "numVideosReceived", A10);
    }
}
