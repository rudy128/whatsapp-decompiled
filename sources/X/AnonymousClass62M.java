package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.62M  reason: invalid class name */
public final class AnonymousClass62M extends AnonymousClass184 {
    public Integer A00;
    public Long A01;

    public AnonymousClass62M() {
        super(1034, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(3, this.A01);
        r3.CHf(1, this.A00);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0D(AnonymousClass184.A0A(AnonymousClass184.A0B(AnonymousClass184.A03(AnonymousClass184.A0C(C108975cc.A0S(AnonymousClass184.A09(AnonymousClass184.A06(AnonymousClass184.A07(AnonymousClass184.A08(C17880vN.A0j(), this.A01, A13), (Object) null, A13), (Object) null, A13), (Object) null, A13), (Object) null, A13), (Object) null, A13), (Object) null, A13), this.A00, A13), (Object) null, A13), (Object) null, A13), (Object) null);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamForwardPicker {");
        AnonymousClass186.A00(this.A01, "forwardPickerContactsSelected", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A00), "forwardPickerResult", A10);
    }
}
