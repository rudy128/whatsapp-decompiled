package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.62h  reason: invalid class name and case insensitive filesystem */
public final class C1181362h extends AnonymousClass184 {
    public Boolean A00;
    public String A01;
    public String A02;

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A00);
        r3.CHf(2, this.A01);
        r3.CHf(3, this.A02);
    }

    public C1181362h() {
        super(4984, AnonymousClass184.A02(), 2, 113760892);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(C108975cc.A0T(C108975cc.A0S(C17880vN.A0h(), this.A00, A13), this.A01, A13), this.A02);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamPsIdHashHandshake {");
        AnonymousClass186.A00(this.A00, "isDummyHashReturned", A10);
        AnonymousClass186.A00(this.A01, "thirdPartyAppPackageName", A10);
        return AnonymousClass184.A0S(this.A02, "thirdPartyAppSignatureHashes", A10);
    }
}
