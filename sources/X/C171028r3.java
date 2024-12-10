package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8r3  reason: invalid class name and case insensitive filesystem */
public final class C171028r3 extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public String A03;

    public C171028r3() {
        super(5462, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(8, this.A00);
        r3.CHf(13, this.A01);
        r3.CHf(10, this.A02);
        r3.CHf(11, this.A03);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0F(AnonymousClass184.A0A(AnonymousClass184.A09(AnonymousClass184.A0E(AnonymousClass184.A08(AnonymousClass184.A0G(AnonymousClass184.A07(AnonymousClass184.A06(AnonymousClass184.A05(C108975cc.A0S(C17880vN.A0h(), (Object) null, A13), (Object) null, A13), (Object) null, A13), (Object) null, A13), (Object) null, A13), (Object) null, A13), (Object) null, A13), (Object) null, A13), (Object) null, A13), this.A00, A13), this.A01);
        AnonymousClass184.A0X(A13, 9);
        A13.put(AnonymousClass184.A0D(AnonymousClass8BS.A0U(), this.A02, A13), this.A03);
        Object A0R = AnonymousClass184.A0R(A13, 15);
        A13.put(AnonymousClass184.A0J(16, A0R, A13), A0R);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamSmbUserJourney {");
        AnonymousClass186.A00(C17900vP.A08(this.A00), "smbFeatureName", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "smbUserActionType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "surface", A10);
        return AnonymousClass184.A0S(this.A03, "userActionTarget", A10);
    }
}
