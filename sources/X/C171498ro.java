package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8ro  reason: invalid class name and case insensitive filesystem */
public final class C171498ro extends AnonymousClass184 {
    public Double A00;
    public Double A01;
    public Double A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public String A09;

    public C171498ro() {
        super(2872, AnonymousClass184.A01(), 1, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(9, this.A06);
        r3.CHf(7, this.A00);
        r3.CHf(8, this.A01);
        r3.CHf(10, this.A03);
        r3.CHf(5, this.A04);
        r3.CHf(1, this.A05);
        r3.CHf(11, this.A07);
        r3.CHf(12, this.A08);
        r3.CHf(6, this.A02);
        r3.CHf(2, this.A09);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0A(AnonymousClass184.A09(C108955ca.A0f(), this.A06, A13), this.A00, A13), this.A01);
        Object A0R = AnonymousClass184.A0R(A13, 13);
        A13.put(C108975cc.A0S(AnonymousClass184.A08(AnonymousClass184.A0E(AnonymousClass184.A0D(AnonymousClass184.A03(AnonymousClass184.A07(AnonymousClass184.A05(AnonymousClass184.A0J(AnonymousClass184.A0C(AnonymousClass184.A0I(AnonymousClass184.A0H(14, A0R, A13), A0R, A13), A0R, A13), this.A03, A13), (Object) null, A13), (Object) null, A13), this.A04, A13), this.A05, A13), this.A07, A13), this.A08, A13), this.A02, A13), this.A09);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamXplatformMigrationExport {");
        AnonymousClass186.A00(this.A06, "storageAvailSize", A10);
        AnonymousClass186.A00(this.A00, "waDbSize", A10);
        AnonymousClass186.A00(this.A01, "waMediaSize", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A03), "xpmDonorPlatform", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A04), "xpmError", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A05), "xpmEvent", A10);
        AnonymousClass186.A00(this.A07, "xpmExportDuration", A10);
        AnonymousClass186.A00(this.A08, "xpmExportProgress", A10);
        AnonymousClass186.A00(this.A02, "xpmExportedDbSize", A10);
        return AnonymousClass184.A0S(this.A09, "xpmFunnelId", A10);
    }
}
