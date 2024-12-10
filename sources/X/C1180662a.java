package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.62a  reason: invalid class name and case insensitive filesystem */
public final class C1180662a extends AnonymousClass184 {
    public Integer A00;
    public Long A01;
    public String A02;

    public C1180662a() {
        super(1536, new C18180vt(1, 20, 20, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(5, this.A00);
        r3.CHf(1, this.A01);
        r3.CHf(7, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A09(AnonymousClass184.A03(AnonymousClass184.A07(AnonymousClass184.A08(C108975cc.A0T(AnonymousClass184.A06(C17880vN.A0i(), (Object) null, A13), (Object) null, A13), (Object) null, A13), (Object) null, A13), this.A00, A13), this.A01, A13), this.A02);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamCamera {");
        AnonymousClass186.A00(C17900vP.A08(this.A00), "cameraOrigin", A10);
        AnonymousClass186.A00(this.A01, "cameraPresentationT", A10);
        return AnonymousClass184.A0S(this.A02, "cameraViewType", A10);
    }
}
