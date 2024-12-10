package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.62Y  reason: invalid class name */
public final class AnonymousClass62Y extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public String A02;

    public AnonymousClass62Y() {
        super(3580, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A02);
        r3.CHf(3, this.A00);
        r3.CHf(4, this.A01);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(C17880vN.A0h(), this.A02);
        AnonymousClass184.A0X(A13, 2);
        A13.put(AnonymousClass184.A06(C17880vN.A0j(), this.A00, A13), this.A01);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamAndroidRootedDeviceCheck {");
        AnonymousClass186.A00(this.A02, "checkLocation", A10);
        AnonymousClass186.A00(this.A00, "rwPaths", A10);
        return AnonymousClass184.A0S(this.A01, "suExists", A10);
    }
}
