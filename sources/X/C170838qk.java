package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8qk  reason: invalid class name and case insensitive filesystem */
public final class C170838qk extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A00);
        r3.CHf(2, this.A01);
    }

    public C170838qk() {
        super(4432, AnonymousClass184.A02(), 2, 113760892);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(C108975cc.A0S(C17880vN.A0h(), this.A00, A13), this.A01);
        AnonymousClass184.A0X(A13, 3);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamClickToWhatsappCallingPrivate {");
        AnonymousClass186.A00(C17900vP.A08(this.A00), "clickToWhatsappCallingActionPrivate", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A01), "clickToWhatsappCallingButtonPrivate", A10);
    }
}
