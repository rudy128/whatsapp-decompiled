package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8s4  reason: invalid class name and case insensitive filesystem */
public final class C171658s4 extends AnonymousClass184 {
    public Long A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;
    public Long A0D;
    public Long A0E;

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A00);
        r3.CHf(2, this.A01);
        r3.CHf(3, this.A02);
        r3.CHf(4, this.A03);
        r3.CHf(5, this.A04);
        r3.CHf(6, this.A05);
        r3.CHf(7, this.A06);
        r3.CHf(8, this.A07);
        r3.CHf(9, this.A08);
        r3.CHf(10, this.A09);
        r3.CHf(11, this.A0A);
        r3.CHf(12, this.A0B);
        r3.CHf(13, this.A0C);
        r3.CHf(14, this.A0D);
        r3.CHf(15, this.A0E);
    }

    public C171658s4() {
        super(4504, AnonymousClass184.A02(), 2, 113760892);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0H(AnonymousClass184.A0G(AnonymousClass184.A0F(AnonymousClass184.A0E(AnonymousClass184.A0D(AnonymousClass184.A0C(AnonymousClass184.A0B(AnonymousClass184.A0A(AnonymousClass184.A09(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A06(AnonymousClass184.A05(C108975cc.A0S(C17880vN.A0h(), this.A00, A13), this.A01, A13), this.A02, A13), this.A03, A13), this.A04, A13), this.A05, A13), this.A06, A13), this.A07, A13), this.A08, A13), this.A09, A13), this.A0A, A13), this.A0B, A13), this.A0C, A13), this.A0D, A13), this.A0E);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamIncomingCallPrivacyImpact {");
        AnonymousClass186.A00(this.A00, "acceptedWouldSilence180d", A10);
        AnonymousClass186.A00(this.A01, "acceptedWouldSilence30d", A10);
        AnonymousClass186.A00(this.A02, "acceptedWouldSilence360d", A10);
        AnonymousClass186.A00(this.A03, "acceptedWouldSilence60d", A10);
        AnonymousClass186.A00(this.A04, "acceptedWouldSilence90d", A10);
        AnonymousClass186.A00(this.A05, "allWouldSilence180d", A10);
        AnonymousClass186.A00(this.A06, "allWouldSilence30d", A10);
        AnonymousClass186.A00(this.A07, "allWouldSilence360d", A10);
        AnonymousClass186.A00(this.A08, "allWouldSilence60d", A10);
        AnonymousClass186.A00(this.A09, "allWouldSilence90d", A10);
        AnonymousClass186.A00(this.A0A, "total180d", A10);
        AnonymousClass186.A00(this.A0B, "total30d", A10);
        AnonymousClass186.A00(this.A0C, "total360d", A10);
        AnonymousClass186.A00(this.A0D, "total60d", A10);
        return AnonymousClass184.A0S(this.A0E, "total90d", A10);
    }
}
