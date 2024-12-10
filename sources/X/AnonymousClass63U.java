package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.63U  reason: invalid class name */
public final class AnonymousClass63U extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Long A03;
    public Long A04;
    public String A05;

    public AnonymousClass63U() {
        super(2070, new C18180vt(1, 20, 20, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(9, this.A00);
        r3.CHf(4, this.A01);
        r3.CHf(1, this.A03);
        r3.CHf(2, this.A04);
        r3.CHf(8, this.A02);
        r3.CHf(3, this.A05);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        AnonymousClass184.A0X(A13, 7);
        A13.put(AnonymousClass184.A07(AnonymousClass184.A08(C108975cc.A0T(AnonymousClass184.A0A(C108975cc.A0S(AnonymousClass184.A03(AnonymousClass184.A06(C108955ca.A0f(), this.A00, A13), this.A01, A13), this.A03, A13), this.A04, A13), this.A02, A13), this.A05, A13), (Object) null, A13), (Object) null);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamCameraTtRecordVideo {");
        AnonymousClass186.A00(C17900vP.A08(this.A00), "cameraApi", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "cameraFacing", A10);
        AnonymousClass186.A00(this.A03, "cameraTtStartVideo", A10);
        AnonymousClass186.A00(this.A04, "cameraTtStopVideo", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "cameraType", A10);
        return AnonymousClass184.A0S(this.A05, "requestedVideoResolution", A10);
    }
}
