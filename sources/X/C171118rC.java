package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8rC  reason: invalid class name and case insensitive filesystem */
public final class C171118rC extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;

    public C171118rC() {
        super(4288, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A03);
        r3.CHf(2, this.A04);
        r3.CHf(3, this.A00);
        r3.CHf(4, this.A01);
        r3.CHf(5, this.A02);
        r3.CHf(6, this.A05);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A06(AnonymousClass184.A05(C108975cc.A0S(C17880vN.A0h(), this.A03, A13), this.A04, A13), this.A00, A13), this.A01, A13), this.A02, A13), this.A05);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamBlockEventsFs {");
        AnonymousClass186.A00(C17900vP.A08(this.A03), "blockEntryPoint", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A04), "blockEventActionType", A10);
        AnonymousClass186.A00(this.A00, "blockEventIsSuspicious", A10);
        AnonymousClass186.A00(this.A01, "blockEventIsUnsub", A10);
        AnonymousClass186.A00(this.A02, "pastCall", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A05), "pastCallResult", A10);
    }
}
