package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8rE  reason: invalid class name and case insensitive filesystem */
public final class C171138rE extends AnonymousClass184 {
    public Integer A00;
    public Long A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A02);
        r3.CHf(6, this.A03);
        r3.CHf(2, this.A04);
        r3.CHf(3, this.A05);
        r3.CHf(4, this.A01);
        r3.CHf(5, this.A00);
    }

    public C171138rE() {
        super(5606, AnonymousClass184.A02(), 2, 113760892);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A07(AnonymousClass184.A06(AnonymousClass184.A05(C108975cc.A0S(AnonymousClass184.A08(C17880vN.A0h(), this.A02, A13), this.A03, A13), this.A04, A13), this.A05, A13), this.A01, A13), this.A00);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamDeeplinkUserJourney {");
        AnonymousClass186.A00(this.A02, "businessJid", A10);
        AnonymousClass186.A00(this.A03, "deeplinkSessionId", A10);
        AnonymousClass186.A00(this.A04, "entryPointConversionExternalMedium", A10);
        AnonymousClass186.A00(this.A05, "entryPointConversionExternalSource", A10);
        AnonymousClass186.A00(this.A01, "sequenceNumber", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A00), "userJourneyOperation", A10);
    }
}
