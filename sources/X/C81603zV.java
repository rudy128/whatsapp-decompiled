package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.3zV  reason: invalid class name and case insensitive filesystem */
public final class C81603zV extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Long A04;
    public Long A05;

    public C81603zV() {
        super(5958, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A00);
        r3.CHf(2, this.A04);
        r3.CHf(3, this.A01);
        r3.CHf(4, this.A02);
        r3.CHf(5, this.A05);
        r3.CHf(6, this.A03);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A06(AnonymousClass184.A05(AnonymousClass184.A04(C17880vN.A0h(), this.A00, A13), this.A04, A13), this.A01, A13), this.A02, A13), this.A05, A13), this.A03);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamListUpdateUserJourney {");
        AnonymousClass186.A00(C17900vP.A08(this.A00), "listAction", A10);
        AnonymousClass186.A00(this.A04, "listId", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "listType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "listUpdateUserJourneyAction", A10);
        AnonymousClass186.A00(this.A05, "predefinedId", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A03), "updateEntryPoint", A10);
    }
}
