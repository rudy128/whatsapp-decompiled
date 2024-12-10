package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.62f  reason: invalid class name and case insensitive filesystem */
public final class C1181162f extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Integer A02;

    public C1181162f() {
        super(5834, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(2, this.A00);
        r3.CHf(3, this.A01);
        r3.CHf(5, this.A02);
        r3.CHf(7, (Object) null);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        AnonymousClass184.A0X(A13, 1);
        A13.put(C108975cc.A0T(C17880vN.A0i(), this.A00, A13), this.A01);
        AnonymousClass184.A0X(A13, 4);
        A13.put(AnonymousClass184.A0E(AnonymousClass184.A0F(AnonymousClass184.A0G(AnonymousClass184.A0D(AnonymousClass184.A0H(AnonymousClass184.A0C(AnonymousClass184.A0B(AnonymousClass184.A0A(AnonymousClass184.A09(AnonymousClass184.A08(C17880vN.A0l(), this.A02, A13), (Object) null, A13), (Object) null, A13), (Object) null, A13), (Object) null, A13), (Object) null, A13), (Object) null, A13), (Object) null, A13), (Object) null, A13), (Object) null, A13), (Object) null);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamNearbyDropShareEvent {");
        AnonymousClass186.A00(C17900vP.A08(this.A00), "nearbyDropShareAction", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "nearbyDropShareEventEntryPoint", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A02), "nearbyDropShareEventUser", A10);
    }
}
