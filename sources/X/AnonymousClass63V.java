package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.63V  reason: invalid class name */
public final class AnonymousClass63V extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Long A04;
    public String A05;

    public AnonymousClass63V() {
        super(2066, new C18180vt(1, 20, 20, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(8, this.A00);
        r3.CHf(2, this.A01);
        r3.CHf(1, this.A04);
        r3.CHf(7, this.A02);
        r3.CHf(3, this.A03);
        r3.CHf(5, this.A05);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(C108975cc.A0T(AnonymousClass184.A09(AnonymousClass184.A03(C108975cc.A0S(AnonymousClass3MY.A0g(), this.A00, A13), this.A01, A13), this.A04, A13), this.A02, A13), this.A03);
        AnonymousClass184.A0X(A13, 6);
        A13.put(C17880vN.A0l(), this.A05);
        AnonymousClass184.A0X(A13, 4);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamCameraTtc {");
        AnonymousClass186.A00(C17900vP.A08(this.A00), "cameraApi", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "cameraFacing", A10);
        AnonymousClass186.A00(this.A04, "cameraTtcDuration", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "cameraType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A03), "flashMode", A10);
        return AnonymousClass184.A0S(this.A05, "requestedPhotoResolution", A10);
    }
}
