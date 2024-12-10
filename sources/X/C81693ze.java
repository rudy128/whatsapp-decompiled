package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.3ze  reason: invalid class name and case insensitive filesystem */
public final class C81693ze extends AnonymousClass184 {
    public Boolean A00;
    public Integer A01;
    public Long A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A03);
        r3.CHf(2, this.A04);
        r3.CHf(12, this.A05);
        r3.CHf(3, this.A01);
        r3.CHf(9, this.A06);
        r3.CHf(4, this.A00);
        r3.CHf(5, this.A02);
        r3.CHf(10, this.A07);
        r3.CHf(11, this.A08);
    }

    public C81693ze() {
        super(3466, AnonymousClass184.A02(), 2, 113760892);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A04(C17880vN.A0h(), this.A03, A13), this.A04);
        AnonymousClass184.A0X(A13, 6);
        A13.put(AnonymousClass184.A0A(AnonymousClass184.A09(AnonymousClass184.A0D(AnonymousClass184.A0C(AnonymousClass184.A07(AnonymousClass184.A06(AnonymousClass184.A0B(AnonymousClass184.A05(12, this.A05, A13), this.A01, A13), this.A06, A13), this.A00, A13), this.A02, A13), this.A07, A13), this.A08, A13), (Object) null, A13), (Object) null);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamCtwaUserJourney {");
        AnonymousClass186.A00(this.A03, "adId", A10);
        AnonymousClass186.A00(this.A04, "businessJid", A10);
        AnonymousClass186.A00(this.A05, "ctwaUserJourneyMetadata", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "ctwaUserJourneyOperation", A10);
        AnonymousClass186.A00(this.A06, "featureEnabled", A10);
        AnonymousClass186.A00(this.A00, "icebreakersShown", A10);
        AnonymousClass186.A00(this.A02, "sequenceNumber", A10);
        AnonymousClass186.A00(this.A07, "threadCreationDate", A10);
        return AnonymousClass184.A0S(this.A08, "threadIdHmac", A10);
    }
}
