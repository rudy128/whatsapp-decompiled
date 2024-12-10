package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.62v  reason: invalid class name and case insensitive filesystem */
public final class C1182762v extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Long A03;

    public C1182762v() {
        super(2064, new C18180vt(1, 20, 20, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(4, this.A00);
        r3.CHf(1, this.A03);
        r3.CHf(3, this.A01);
        r3.CHf(2, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(C108975cc.A0S(C108975cc.A0T(AnonymousClass184.A03(C17880vN.A0k(), this.A00, A13), this.A03, A13), this.A01, A13), this.A02);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamCameraTti {");
        AnonymousClass186.A00(C17900vP.A08(this.A00), "cameraApi", A10);
        AnonymousClass186.A00(this.A03, "cameraTtiDuration", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "cameraType", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A02), "launchType", A10);
    }
}
