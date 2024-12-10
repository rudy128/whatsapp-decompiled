package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8qo  reason: invalid class name and case insensitive filesystem */
public final class C170878qo extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public String A02;

    public C170878qo() {
        super(4130, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A00);
        r3.CHf(4, this.A02);
        r3.CHf(3, this.A01);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A05(AnonymousClass184.A06(C17880vN.A0h(), this.A00, A13), this.A02, A13), this.A01);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamAltLinkingFatalError {");
        AnonymousClass186.A00(C17900vP.A08(this.A00), "altLinkingFatalErrorType", A10);
        AnonymousClass186.A00(this.A02, "linkCodePairingRef", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A01), "mdCompanionPlatformType", A10);
    }
}
